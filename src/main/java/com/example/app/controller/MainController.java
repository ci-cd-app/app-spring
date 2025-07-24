package com.example.app.controller;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequiredArgsConstructor
@Slf4j
public class MainController {

    private final HttpSession session;

    @GetMapping("/")
    public String index(){
        if(session.getAttribute("member") == null) {
            return "redirect:/member/login";
        }
        return "index.html";
    }
}
