package com.example.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.data.UserID;
import com.example.demo.data.UserRequest;
import com.example.demo.models.UserEntity;
import com.example.demo.services.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

  private final UserService userService;

  @GetMapping
  public ResponseEntity<UserEntity> getUserById(@RequestParam("id") int id) {
    UserEntity user = userService.getUser(id);
    return ResponseEntity.ok(user);
  }

  @PostMapping
  public ResponseEntity<UserEntity> getUserByIdFromBody(@RequestBody UserID request) {
    UserEntity user = userService.getUser(request.getId());
    return ResponseEntity.ok(user);
  }

  @PostMapping("/add")
  public ResponseEntity<UserEntity> addUserToDataBase(@RequestBody UserRequest request) {
    try {
      UserEntity user = userService.addUser(request);
      return ResponseEntity.ok(user);
    } catch (Exception e) {
      e.printStackTrace();
      return ResponseEntity.status(510).build();
    }
  }
}
