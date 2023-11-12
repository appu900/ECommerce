package com.luxlane.backend.Service;


import com.luxlane.backend.Exception.CartItemException;
import com.luxlane.backend.Exception.UserException;
import com.luxlane.backend.Model.Cart;
import com.luxlane.backend.Model.CartItem;
import com.luxlane.backend.Model.Product;
import org.springframework.stereotype.Service;

@Service
public interface CartItemService {
    public CartItem createCartItem(CartItem cartItem);
    public CartItem updateCartItem(Long userId,Long id,CartItem cartItem)
     throws CartItemException, UserException;
    public void deleteCartItem(Long cartItemId);

    public CartItem isCartItemExists(Cart cart, Product product, String size,Long userId);
    public void removeCartItem(Long userId,Long cartItemId) throws CartItemException, UserException;
    public CartItem findCartItemById(Long cartItemId) throws CartItemException;
}
