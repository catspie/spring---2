package com.example.demo.member;

/**
 * @author YSY
 * 멤버서비스 인터페이스
 */

public interface MemberService {
    void join(Member member);
    Member findMember(Long memberId);

}
