package com.example.temp.controller;

import com.example.temp.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor

public class HomepageController {
    private final IUserService userService;
    private final ApplicationEventPublisher publisher;

    @GetMapping("/home-page")
    public String homepage(){
        return "homepage";
    }
}