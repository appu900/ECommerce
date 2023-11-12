package com.luxlane.backend.RequstDTO;


import lombok.Data;

@Data
public class RatingRequest {

    private Long productId;
    private double rating;

}
