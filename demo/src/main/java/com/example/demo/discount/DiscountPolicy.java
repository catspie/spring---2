package com.example.demo.discount;

import com.example.demo.member.Member;


/**
 * @return 할인 대상 금액
 */
public interface DiscountPolicy {
    int discount(Member member, int price);

}
