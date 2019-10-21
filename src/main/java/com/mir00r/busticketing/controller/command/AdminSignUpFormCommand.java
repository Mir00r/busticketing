package com.mir00r.busticketing.controller.command;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * @author mir00r on 2019-10-22
 * @project IntelliJ IDEA
 */
@Data
@Accessors(chain = true)
public class AdminSignUpFormCommand {
    @NotBlank
    @Email
    private String email;

    @NotBlank
    @Size(min = 5)
    private String password;

    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    @NotBlank
    @Size(min = 5, max = 100)
    private String agencyName;

    @NotBlank
    @Size(max = 100)
    private String agencyDetails;

    @NotBlank
    @Size(min = 5, max = 13)
    private String mobileNumber;
}
