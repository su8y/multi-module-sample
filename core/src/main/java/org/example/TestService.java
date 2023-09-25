package org.example;

import org.springframework.stereotype.Service;

@Service
public class TestService {
    public Member testService(String name){
        Member member = new Member();
        member.setName(name);
        return member;
    }
}
