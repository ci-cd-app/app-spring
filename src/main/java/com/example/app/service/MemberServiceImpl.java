package com.example.app.service;

import com.example.app.domain.MemberVO;
import com.example.app.repository.MemberDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
    private final MemberDAO memberDAO;

    @Override
    public void join(MemberVO memberVO) {
        memberDAO.saveMember(memberVO);
    }

    @Override
    public MemberVO login(String memberEmail, String memberPassword) {
        return memberDAO.findMemberForLogin(memberEmail, memberPassword);
    }
}
