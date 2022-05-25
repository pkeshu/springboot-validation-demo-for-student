package com.keshar.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author kesharpaudel on 25/05/2022
 * @project validation-example
 * @created_at 25(Wed) May,2022 at 11:10 AM
 */


@Entity
@Table(name = "USERS_TBL")
@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String name;
    private String email;
    private String mobile;
    private String gender;
    private int age;
    private String nationality;


}
