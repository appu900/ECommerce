package com.luxlane.backend.Service;

import com.luxlane.backend.Exception.ProductException;
import com.luxlane.backend.Model.Product;
import com.luxlane.backend.Model.Rating;
import com.luxlane.backend.Model.User;
import com.luxlane.backend.Repository.RatingRepository;
import com.luxlane.backend.RequstDTO.RatingRequest;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RatingServiceImp implements RatingService {

    @Autowired private RatingRepository ratingRepository;
    @Autowired ProductService productService;
    @Override
    public Rating createRating(RatingRequest ratingRequest, User user) throws ProductException {
        Product product = productService.findProductById(ratingRequest.getProductId());
        Rating rating = new Rating();
        rating.setProduct(product);
        rating.setUser(user);
        rating.setRating(ratingRequest.getRating());
        return ratingRepository.save(rating);
    }

    @Override
    public List<Rating> getProductRating(Long productId) throws ProductException {
        return ratingRepository.getAllProductsRating(productId);
    }
}
