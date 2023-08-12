package com.example.demo;

import com.example.demo.member.Grade;
import com.example.demo.member.Member;
import com.example.demo.member.MemberService;
import com.example.demo.member.MemberServiceImpl;

/**
 * @author YSY
 * 프로젝트 실행
 */
public class MemberApp {
    public static void main(String[] args){
        MemberService memberService = new MemberServiceImpl();
        // ctrl + alt + v new 뒷 부분 작성하면 앞부분은 자동완성 단축키
        Member memberA = new Member(1L, "memberA", Grade.VIP);
        memberService.join(memberA);
        Member findMember = memberService.findMember(1L);
        System.out.println("new Member"+ memberA.getName());
        System.out.println("find Member"+ findMember.getName());
    }
}
