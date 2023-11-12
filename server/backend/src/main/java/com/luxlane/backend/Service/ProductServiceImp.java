package com.luxlane.backend.Service;
import com.luxlane.backend.Exception.ProductException;
import com.luxlane.backend.Model.Category;
import com.luxlane.backend.Model.Product;
import com.luxlane.backend.Repository.CategoryRepository;
import com.luxlane.backend.Repository.ProductRepository;
import com.luxlane.backend.RequstDTO.CreateProductRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;



public class ProductServiceImp implements ProductService{


    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private UserService userService;


    @Override
    public Product createProduct(CreateProductRequest createProductRequest) {
        Category topLevel = categoryRepository.findByName(createProductRequest.getTopLevelCategory());
        if(topLevel == null){
            Category topLevelCategory = new Category();
            topLevelCategory.setName(createProductRequest.getTopLevelCategory());
            topLevelCategory.setLevel(1);

            topLevel = categoryRepository.save(topLevelCategory);

        }

        Category secondLevel = categoryRepository.findByNameAndParent(createProductRequest.getSecondLevelCategory(),topLevel.getName());
        if(secondLevel == null){
            Category secondLevelCategory = new Category();
            secondLevelCategory.setName(createProductRequest.getSecondLevelCategory());
            secondLevelCategory.setLevel(2);
            secondLevelCategory.setParentCategory(topLevel);
            secondLevel = categoryRepository.save(secondLevelCategory);
        }

        Category thirdLevel = categoryRepository.findByNameAndParent(createProductRequest.getThirdLevelCategory(),secondLevel.getName());
        if(thirdLevel == null){
            Category thirdLevelCategory = new Category();
            thirdLevelCategory.setName(createProductRequest.getThirdLevelCategory());
            thirdLevelCategory.setLevel(3);
            thirdLevelCategory.setParentCategory(secondLevel);
            thirdLevel = categoryRepository.save(thirdLevelCategory);
        }

        Product product = new Product();
        product.setTitle(createProductRequest.getTitle());
        product.setColor(createProductRequest.getColor());
        product.setDescription(createProductRequest.getDescription());
        product.setBrand(createProductRequest.getBrand());
        product.setDiscountPrice(createProductRequest.getDiscountedPrice());
        product.setDiscountPersent(createProductRequest.getDiscountPersent());
        product.setPrice(createProductRequest.getPrice());
        product.setQuantity(createProductRequest.getQuantity());
        product.setImageUrl(createProductRequest.getImageUrl());
        product.setCategory(thirdLevel);
        product.setSizes(createProductRequest.getSize());
        product.setCreatedAt(LocalDateTime.now());

        Product savedProduct = productRepository.save(product);
        return savedProduct;
    }

    @Override
    public String deleteProduct(Long productId) throws ProductException {
        Product product = findProductById(productId);
        product.getSizes().clear();
        productRepository.delete(product);
        return "Product deleted sucessfully";
    }

    @Override
    public Product updateProduct(CreateProductRequest createProductRequest, Long productId) throws ProductException {
        Product product = findProductById(productId);
        if(product.getQuantity() != 0){
            product.setQuantity(createProductRequest.getQuantity());
        }
        return productRepository.save(product);
    }

    @Override
    public Product getProduct(Long productId) throws ProductException {
        return null;
    }

    @Override
    public Product findProductById(Long productId) throws ProductException {
        Optional<Product> product = productRepository.findById(productId);
        if(product.isPresent()){
            return product.get();
        }
        throw new ProductException("Product not found");
    }

    @Override
    public List<Product> findProductByCategory(String Category) {
        return null;
    }

    @Override
    public Page<Product> getAllProducts(String category, List<String> colors, List<String> sizes, Integer minPrice, Integer maxPrice, Integer minDiscount, String sort, String stock, Integer pageNumber, Integer pageSize) {
        Pageable pageable = PageRequest.of(pageNumber,pageSize);
        List<Product> products = productRepository.filterProducts(category,minPrice,maxPrice,minDiscount,sort);
        if(!colors.isEmpty()){
            products = products.stream().filter(product -> colors.stream().anyMatch(color ->color.equalsIgnoreCase(product.getColor()))).collect(Collectors.toList());

        }

        if(stock != null){
            if(stock.equalsIgnoreCase("in_stock")){
                products = products.stream().filter(product -> product.getQuantity() > 0).collect(Collectors.toList());
            }
            else if(stock.equalsIgnoreCase("out_of_stock")){
                products = products.stream().filter(product -> product.getQuantity() == 0).collect(Collectors.toList());
            }
        }

        int startIndex = (int)pageable.getOffset();
        int endIndex = Math.min(startIndex + pageable.getPageSize(),products.size());
        List<Product> pageContent = products.subList(startIndex,endIndex);
        Page<Product> filteredPproducts = new PageImpl<>(pageContent,pageable,products.size());
        return filteredPproducts;
    }
}
