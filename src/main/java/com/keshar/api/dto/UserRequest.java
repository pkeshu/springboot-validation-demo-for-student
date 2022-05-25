package com.keshar.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

/**
 * @author kesharpaudel on 25/05/2022
 * @project validation-example
 * @created_at 25(Wed) May,2022 at 11:13 AM
 */

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserRequest {
    @NotBlank(message = "username should not be null or empty")
    private String name;
    @Email(message = "Invalid Email Address")
    private String email;
    @NotNull
    @Pattern(regexp = "^\\d{10}$",message = "Invalid mobile number entered")
    private String mobile;
    private String gender;
    @Min(18)
    @Max(80)
    private int age;
    @NotBlank(message = "Nationality must not be null or empty!")
    private String nationality;

}
