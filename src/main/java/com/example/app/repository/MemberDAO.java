package com.example.app.repository;

import com.example.app.domain.MemberVO;
import com.example.app.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class MemberDAO {
    private final MemberMapper memberMapper;

    public void saveMember(MemberVO memberVO){
        memberMapper.insertMember(memberVO);
    }

    public MemberVO findMemberForLogin(String memberEmail, String memberPassword){
        return memberMapper.selectMemberForLogin(memberEmail, memberPassword);
    }
}
