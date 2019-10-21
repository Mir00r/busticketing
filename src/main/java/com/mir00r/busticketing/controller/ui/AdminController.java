package com.mir00r.busticketing.controller.ui;

import com.mir00r.busticketing.controller.command.AdminSignUpFormCommand;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author mir00r on 2019-10-21
 * @project IntelliJ IDEA
 */
@Controller
public class AdminController {
    @GetMapping(value = {"/", "/login"})
    public ModelAndView login() {
        return new ModelAndView("login");
    }

    @GetMapping(value = "/signup")
    public ModelAndView signup() {
        ModelAndView modelAndView = new ModelAndView("signup");
        modelAndView.addObject("adminSignupFormData", new AdminSignUpFormCommand());
        return modelAndView;
    }
}
