package com.example.demo.implementations;

import org.springframework.stereotype.Service;

import com.example.demo.data.UserRequest;
import com.example.demo.models.UserEntity;
import com.example.demo.repository.UserRepository;
import com.example.demo.services.UserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public UserEntity getUser(int id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));
    }

    @Override
    public UserEntity addUser(UserRequest request) {
        UserEntity userEntity = new UserEntity();
        userEntity.setEmail(request.getEmail());
        userEntity.setFirstName(request.getFirstName());
        userEntity.setLastName(request.getLastName());
        userEntity.setJob(request.getJob());
        return userRepository.save(userEntity);
    }
}
