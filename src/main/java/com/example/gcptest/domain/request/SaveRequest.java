package com.example.gcptest.domain.request;

import com.example.gcptest.domain.entity.User;

public record SaveRequest(String name, String description) {

    public User toEntity(){
        return User.builder()
                .name(name)
                .description(description)
                .build();
    }
}
