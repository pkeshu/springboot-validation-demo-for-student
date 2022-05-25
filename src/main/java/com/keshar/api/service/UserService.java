package com.keshar.api.service;

import com.keshar.api.dto.UserRequest;
import com.keshar.api.entity.User;
import com.keshar.api.exception.UserNotFoundException;
import com.keshar.api.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author kesharpaudel on 25/05/2022
 * @project validation-example
 * @created_at 25(Wed) May,2022 at 11:16 AM
 */

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository repository;

    public User save(UserRequest userRequest) {
        User user = User
                .build(0,
                        userRequest.getName(),
                        userRequest.getEmail(),
                        userRequest.getMobile(),
                        userRequest.getGender(),
                        userRequest.getAge(),
                        userRequest.getNationality());
        return repository.save(user);
    }

    public List<User> getAllUser() {
        return repository.findAll();
    }

    public User getUser(int id) throws UserNotFoundException {
        User user = repository.findByUserId(id);
        if(user!=null)
            return user;
        else {
            throw new UserNotFoundException("User Not found with id>>"+id);
        }

    }

}
