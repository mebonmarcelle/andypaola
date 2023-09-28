package com.example.temp.controller.Donateur;

import com.example.temp.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor

public class ProfilController {
    private final IUserService userService;
    private final ApplicationEventPublisher publisher;

    @GetMapping("/Profil")
    public String profilpage(){
        return "Donateur/profil";
    }
}

