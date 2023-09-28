package com.example.temp.controller.Donateur;

import com.example.temp.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/")
@RequiredArgsConstructor

public class AlimentsController {

    private final IUserService userService;
    private final ApplicationEventPublisher publisher;

    @GetMapping("/aliments")
    public String besoinpage(){
        return "Donateur/aliments";
    }
}
