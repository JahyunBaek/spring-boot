package com.zkdlu.order.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class OrderLineItem {
    private String id;
    private String name;
    private int price;
}
