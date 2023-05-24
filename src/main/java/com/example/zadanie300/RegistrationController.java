package com.example.zadanie300;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {

    @GetMapping("/")
    String home(Model model) {
        model.addAttribute("user", new UserDto());
        return "index";
    }

    @PostMapping("/register")
    String register(Model model, @Valid @ModelAttribute("user") UserDto userDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("user", userDto);
            return "index";
        }
        return "success";
    }
}
