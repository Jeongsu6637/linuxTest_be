package com.example.gcptest.service;

import com.example.gcptest.domain.entity.User;
import com.example.gcptest.domain.request.SaveRequest;
import com.example.gcptest.domain.response.UserResponse;
import com.example.gcptest.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    public void save(SaveRequest request){
        userRepository.save(request.toEntity());
    }

    public List<UserResponse> findAll(){
        List<User> all = userRepository.findAll();
        return all.stream().map((e) ->new UserResponse(e.getName(), e.getDescription())).toList();
    }
}
