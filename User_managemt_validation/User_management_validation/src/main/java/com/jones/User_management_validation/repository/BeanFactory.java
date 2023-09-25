package com.jones.User_management_validation.repository;

import com.jones.User_management_validation.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanFactory {

    @Bean
    public List<User> getAllUsers() {
        return new ArrayList<>();
    }

}
