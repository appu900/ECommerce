package com.luxlane.backend.RequstDTO;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class AddItemRequest {

    private Long productId;
    private String size;
    private int quantity;
    private Integer price;

}
