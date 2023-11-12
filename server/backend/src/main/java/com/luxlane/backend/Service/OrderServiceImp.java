package com.luxlane.backend.Service;

import com.luxlane.backend.Exception.OrderException;
import com.luxlane.backend.Model.Address;
import com.luxlane.backend.Model.Order;
import com.luxlane.backend.Model.User;
import com.luxlane.backend.Repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OrderServiceImp implements OrderService {


    @Autowired
    private CartRepository cartRepository;
    @Autowired
    private CartItemService cartItemService;

    @Autowired private ProductService productService;

    @Override
    public Order createOrder(User user, Address shippingAdress) {

        return null;
    }

    @Override
    public Order findOrderById(Long orderId) throws OrderException {
        return null;
    }

    @Override
    public List<Order> usersOrderHistory(Long userId) {
        return null;
    }

    @Override
    public Order confirmedOrder(Long orderId) throws OrderException {
        return null;
    }

    @Override
    public Order ShippedOrder(Long orderId) throws OrderException {
        return null;
    }

    @Override
    public Order deliveredOrder(Long orderId) throws OrderException {
        return null;
    }

    @Override
    public Order cancelOrder(Long orderId) throws OrderException {
        return null;
    }

    @Override
    public List<Order> getAllOrders() {
        return null;
    }

    @Override
    public void deleteOrder(Long orderId) throws OrderException {

    }
}
