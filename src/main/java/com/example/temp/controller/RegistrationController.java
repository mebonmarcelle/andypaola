package com.example.temp.controller;

import com.example.temp.enregistrement.RegistrationCompleteEvent;
import com.example.temp.enregistrement.RegistrationRequest;
import com.example.temp.service.IUserService;
import com.example.temp.service.UserService;
import com.example.temp.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor

public class RegistrationController {
    private final UserService userService;
    private final ApplicationEventPublisher publisher;

//    @GetMapping("enregistrement")
//        public String regForm(){
//            return "enregistrement";
//        }
    @GetMapping("/registration-form")
    public String showRegistrationForm(Model model){
        model.addAttribute(("user"), new RegistrationRequest());
        model.addAttribute("enregistrer",true);
        return "enregistrement";
    }
   @PostMapping(value = "/registrer")
    public String registrerUser(@ModelAttribute("user") RegistrationRequest registration,Model model){
       System.out.println("==== " + registration);
        User user = userService.createUser(registration);
       System.out.println(user);
        if (user==null){
            model.addAttribute("error","l'utilisateur avec cet email existe deja.");
            return "enregistrement";
        }else {
//            model.addAttribute("error","");
            return "redirect:/Login";
        }
        //publish the verification email
//       publisher.publishEvent(new RegistrationCompleteEvent(user, ""));
//        return "redirect:/Login";
    }
}
