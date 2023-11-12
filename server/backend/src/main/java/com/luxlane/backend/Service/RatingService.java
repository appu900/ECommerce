package com.luxlane.backend.Service;


import com.luxlane.backend.Exception.ProductException;
import com.luxlane.backend.Model.Rating;
import com.luxlane.backend.Model.User;
import com.luxlane.backend.RequstDTO.RatingRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RatingService {

    public Rating createRating(RatingRequest ratingRequest, User user) throws ProductException;
    public List<Rating> getProductRating(Long productId) throws ProductException;

}
