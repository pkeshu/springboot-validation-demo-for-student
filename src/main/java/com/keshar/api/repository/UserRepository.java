package com.keshar.api.repository;

import com.keshar.api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author kesharpaudel on 25/05/2022
 * @project validation-example
 * @created_at 25(Wed) May,2022 at 11:14 AM
 */
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUserId(int id);
}
