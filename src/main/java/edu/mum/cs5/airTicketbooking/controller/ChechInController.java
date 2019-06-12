package edu.mum.cs5.airTicketbooking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChechInController {
    @GetMapping(value = "/checkin")
    public  String checkIn(){
        return "services";
    }
}
