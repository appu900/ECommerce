package com.luxlane.backend.Service;

import com.luxlane.backend.Exception.ProductException;
import com.luxlane.backend.Model.Cart;
import com.luxlane.backend.Model.CartItem;
import com.luxlane.backend.Model.Product;
import com.luxlane.backend.Model.User;
import com.luxlane.backend.Repository.CartRepository;
import com.luxlane.backend.RequstDTO.AddItemRequest;
import org.springframework.beans.factory.annotation.Autowired;

public class CartServiceImp implements CartService {

   @Autowired
   private CartRepository cartRepository;
   @Autowired
   private CartItemService cartItemService;
   @Autowired
   private ProductService productService;


    @Override
    public Cart createCart(User user) {
        Cart cart = new Cart();
        cart.setUser(user);
        return cartRepository.save(cart);
    }

    @Override
    public String addToCartItem(Long UserId, AddItemRequest addItemRequest) throws ProductException {
        Cart cart = cartRepository.findByUserId(UserId);
        Product product = productService.findProductById(addItemRequest.getProductId());
        CartItem isPresent = cartItemService.isCartItemExists(cart,product,addItemRequest.getSize(),UserId);
        if(isPresent == null){
            CartItem cartItem = new CartItem();
            cartItem.setCart(cart);
            cartItem.setProduct(product);
            cartItem.setQuantity(addItemRequest.getQuantity());
            cartItem.setUserId(UserId);
            int price = addItemRequest.getQuantity() * product.getDiscountPrice();
            cartItem.setPrice(price);
            cartItem.setSize(addItemRequest.getSize());
            CartItem createdCartItem = cartItemService.createCartItem(cartItem);
            cart.getCartItems().add(createdCartItem);
        }
        return "item added to cart";
    }

    @Override
    public Cart findUserCart(Long userId) throws ProductException {
        Cart cart = cartRepository.findByUserId(userId);
        int totalPrice = 0;
        int totalDiscountedPrice = 0;
        int totalItem = 0;


        for(CartItem cartItem : cart.getCartItems()){
            totalPrice = totalPrice + cartItem.getPrice();
            totalDiscountedPrice = totalDiscountedPrice + cartItem.getDiscountedPrice();
            totalItem = totalItem + cartItem.getQuantity();
        }

        cart.setTotalDiscountedPrice(totalDiscountedPrice);
        cart.setTotalItem(totalItem);
        cart.setTotalPrice(totalPrice);
        cart.setDiscount(totalPrice - totalDiscountedPrice);
        return cartRepository.save(cart);
    }
}
