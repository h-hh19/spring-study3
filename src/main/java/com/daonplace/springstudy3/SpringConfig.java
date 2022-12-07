package com.daonplace.springstudy3;

import com.daonplace.springstudy3.repository.MemberRepository;
import com.daonplace.springstudy3.repository.MemoryMemberRepository;
import com.daonplace.springstudy3.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
}
