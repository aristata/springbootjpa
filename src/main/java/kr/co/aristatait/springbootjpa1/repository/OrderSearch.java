package kr.co.aristatait.springbootjpa1.repository;

import kr.co.aristatait.springbootjpa1.domain.OrderStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderSearch {

    private String memberName;
    private OrderStatus orderStatus;

}
