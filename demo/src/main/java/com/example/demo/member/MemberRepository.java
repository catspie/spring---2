package com.example.demo.member;

/**
 * @author YSY
 * 멤버 REPOSITORY 인터페이스
 */
public interface MemberRepository {
    void save(Member member);
    Member findById(Long memberId);
}
