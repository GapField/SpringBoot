package com.realestate.thymeleaf.RealEstate.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SuccessController {

    @GetMapping("/success")
    public String showSuccessPage() {
        return "success"; // Assuming you have a "success.html" template
    }
}
