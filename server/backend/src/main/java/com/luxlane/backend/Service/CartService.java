package com.luxlane.backend.Service;


import com.luxlane.backend.Exception.ProductException;
import com.luxlane.backend.Model.Cart;
import com.luxlane.backend.Model.User;
import com.luxlane.backend.RequstDTO.AddItemRequest;
import org.springframework.stereotype.Service;

@Service
public interface CartService {

    public Cart createCart(User user);
    public String addToCartItem(Long UserId, AddItemRequest addItemRequest) throws ProductException;
    public Cart findUserCart(Long userId) throws ProductException;
 }
