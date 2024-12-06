package com.example.demo.services;

import com.example.demo.data.UserRequest;
import com.example.demo.models.UserEntity;

public interface UserService {
  UserEntity getUser(int id);

  UserEntity addUser(UserRequest user);
}