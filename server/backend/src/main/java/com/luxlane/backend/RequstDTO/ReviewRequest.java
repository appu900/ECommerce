package com.luxlane.backend.RequstDTO;


import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReviewRequest {

    private Long productId;
    private String review;


}
