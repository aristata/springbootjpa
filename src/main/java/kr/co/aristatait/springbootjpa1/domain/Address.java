package kr.co.aristatait.springbootjpa1.domain;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {

    private String city;
    private String street;
    private String zipcode;
}
