package com.example.app.mapper;

import com.example.app.domain.MemberVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.Optional;

@Mapper
public interface MemberMapper {
    public void insertMember(MemberVO memberVO);
    public MemberVO selectMemberForLogin(String memberEmail, String memberPassword);

}
