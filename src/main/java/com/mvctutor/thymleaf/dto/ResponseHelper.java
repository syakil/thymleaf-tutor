package com.mvctutor.thymleaf.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseHelper <T>{
    private T data;
    private String message;
    private boolean success;

}
