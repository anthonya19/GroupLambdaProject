package com.sg.FoodDelivery.service;

import com.sg.FoodDelivery.model.Driver;
import org.springframework.stereotype.Component;

@Component
public class Service {
    public boolean checkPassword(String pw1, String pw2) {
        return pw1.equals(pw2);
    }
}
