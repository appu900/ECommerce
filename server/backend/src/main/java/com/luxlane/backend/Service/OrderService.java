package com.luxlane.backend.Service;



import com.luxlane.backend.Exception.OrderException;
import com.luxlane.backend.Model.Address;
import com.luxlane.backend.Model.Order;
import com.luxlane.backend.Model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {

    public Order createOrder(User user, Address shippingAdress);
    public Order findOrderById(Long orderId) throws OrderException;
    public List<Order> usersOrderHistory(Long userId);
    public Order confirmedOrder(Long orderId) throws OrderException;
    public Order ShippedOrder(Long orderId) throws OrderException;
    public Order deliveredOrder(Long orderId) throws OrderException;
    public Order cancelOrder(Long orderId) throws OrderException;
    public List<Order> getAllOrders();
    public void deleteOrder(Long orderId) throws OrderException;



}
