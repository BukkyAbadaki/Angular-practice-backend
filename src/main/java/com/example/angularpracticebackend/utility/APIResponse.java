package com.example.angularpracticebackend.utility;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class APIResponse<T> {
    private String message;
    private  Boolean success;
    private T payload;
}
