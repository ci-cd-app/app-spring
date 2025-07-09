package com.example.app.service;

import com.example.app.domain.MemberVO;

import java.util.Optional;

public interface MemberService {
    public void join(MemberVO memberVO);
    public MemberVO login(String memberEmail, String memberPassword);
}
