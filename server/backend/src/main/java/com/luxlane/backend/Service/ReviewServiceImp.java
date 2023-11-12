package com.luxlane.backend.Service;

import com.luxlane.backend.Exception.ProductException;
import com.luxlane.backend.Model.Product;
import com.luxlane.backend.Model.Review;
import com.luxlane.backend.Model.User;
import com.luxlane.backend.Repository.ProductRepository;
import com.luxlane.backend.Repository.ReviewRepository;
import com.luxlane.backend.RequstDTO.ReviewRequest;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.List;

public class ReviewServiceImp implements ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;
    @Autowired
    private ProductService productService;
    @Autowired
    ProductRepository productRepository;

    @Override
    public Review createReview(ReviewRequest reviewRequest, User user) throws ProductException {
        Product product = productService.findProductById(reviewRequest.getProductId());
        Review review = new Review();
        review.setUser(user);
        review.setProduct(product);
        review.setReview(reviewRequest.getReview());
        review.setCreateAt(LocalDateTime.now());
        return reviewRepository.save(review);

    }

    @Override
    public List<Review> getProductReview(Long productId) throws ProductException {
        return reviewRepository.getAllReviewsByProductId(productId);
    }
}
