package com.daonplace.springstudy3.repository;
import com.daonplace.springstudy3.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findById(String name);
    List<Member> findAll();

    Optional<Member> findByName(String name);
}