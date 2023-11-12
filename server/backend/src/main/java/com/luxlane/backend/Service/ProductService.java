package com.luxlane.backend.Service;


import com.luxlane.backend.Exception.ProductException;
import com.luxlane.backend.Model.Product;
import com.luxlane.backend.RequstDTO.CreateProductRequest;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface ProductService {
    public Product createProduct(CreateProductRequest createProductRequest);
    public String deleteProduct(Long productId) throws ProductException;
    public Product updateProduct(CreateProductRequest createProductRequest, Long productId) throws ProductException;
    public Product getProduct(Long productId) throws ProductException;
    public Product findProductById(Long productId) throws ProductException;
    public List<Product> findProductByCategory(String Category);
    public Page<Product> getAllProducts(String category,List<String>colors,List<String>sizes,Integer minPrice,Integer maxPrice,
                                        Integer minDiscount,String sort,String stock,Integer pageNumber,Integer pageSize

    );
}
