package com.luxlane.backend.Service;

import com.luxlane.backend.Exception.ProductException;
import com.luxlane.backend.Model.Review;
import com.luxlane.backend.Model.User;
import com.luxlane.backend.RequstDTO.ReviewRequest;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface ReviewService {
    public Review createReview(ReviewRequest reviewRequest, User  user) throws ProductException;
    public List<Review> getProductReview(Long productId) throws ProductException;
}
