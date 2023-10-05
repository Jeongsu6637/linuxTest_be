package com.example.gcptest.controller;

import com.example.gcptest.domain.request.SaveRequest;
import com.example.gcptest.domain.response.UserResponse;
import com.example.gcptest.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin("*")
@RequestMapping("/api")
public class UserController {
    private final UserService userService;

    @PostMapping
    public void save(@RequestBody SaveRequest request) {
        userService.save(request);
    }

    @GetMapping
    public List<UserResponse> findAll() {
        return userService.findAll();
    }

}
