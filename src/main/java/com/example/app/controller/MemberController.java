package com.example.app.controller;

import com.example.app.domain.MemberVO;
import com.example.app.service.MemberService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Optional;

@Controller
@RequiredArgsConstructor
@RequestMapping("/member/*")
@Slf4j
public class MemberController {
    private final MemberService memberService;
    private final HttpSession session;

    @GetMapping("join")
    public void joinForm(MemberVO memberVO){;}

    @PostMapping("join")
    public RedirectView join(MemberVO memberVO){
        memberService.join(memberVO);
        return new RedirectView("/member/login");
    }

    @GetMapping("login")
    public void loginForm(MemberVO memberVO){;}

    @PostMapping("login")
    public RedirectView login(String memberEmail, String memberPassword){
        MemberVO memberVO = memberService.login(memberEmail, memberPassword);
        if(memberVO != null) {
            session.setAttribute("member", memberVO);
            return new RedirectView("/");
        }
        return new RedirectView("/member/login");
    }

    @GetMapping("logout")
    public RedirectView logout(){
        session.invalidate();
        return new RedirectView("/member/login");
    }
}
