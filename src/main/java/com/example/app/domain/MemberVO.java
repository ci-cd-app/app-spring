package com.example.app.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@Getter @Setter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class MemberVO {
    @EqualsAndHashCode.Include
    private Long id;
    private String memberName;
    private String memberEmail;
    private String memberPassword;
}
