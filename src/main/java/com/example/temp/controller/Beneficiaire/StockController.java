package com.example.temp.controller.Beneficiaire;

import com.example.temp.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class StockController {

    private final IUserService userService;
    private final ApplicationEventPublisher publisher;

    @GetMapping("/Stock")
    public String stockpage(){
        return "Beneficiaire/stock";
    }
}



