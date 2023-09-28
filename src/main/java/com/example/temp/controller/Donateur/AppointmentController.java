package com.example.temp.controller.Donateur;

import com.example.temp.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

    @Controller
    @RequestMapping("/")
    @RequiredArgsConstructor

    public class AppointmentController {
        private final IUserService userService;
        private final ApplicationEventPublisher publisher;

        @GetMapping("/appointment")
        public String appointmentpage(){
            return "Donateur/appointment";
        }
//
//        public String showAppointmentForm(Model model) {
//            model.addAttribute("appointment", new Appointment());
//            return "appointment-form";
//        }
//
//        @PostMapping("/appointment")
//        public String submitAppointmentForm(@ModelAttribute("appointment") Appointment appointment) {
//            // Traitez les données du rendez-vous ici
//            return "appointment-confirmation";
//        }
    }

