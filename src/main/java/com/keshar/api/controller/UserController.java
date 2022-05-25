package com.keshar.api.controller;

import com.keshar.api.dto.UserRequest;
import com.keshar.api.entity.User;
import com.keshar.api.exception.UserNotFoundException;
import com.keshar.api.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author kesharpaudel on 25/05/2022
 * @project validation-example
 * @created_at 25(Wed) May,2022 at 11:21 AM
 */

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {

    private final UserService service;

    @PostMapping("/signup")
    public ResponseEntity<User> saveUser(@RequestBody @Valid UserRequest request) {
        return new ResponseEntity<>(service.save(request), HttpStatus.CREATED);
    }

    @GetMapping("/fetchAll")
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(service.getAllUser());
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getAllUsers(@PathVariable("id") int id) throws UserNotFoundException {
        return ResponseEntity.ok(service.getUser(id));
    }

}
