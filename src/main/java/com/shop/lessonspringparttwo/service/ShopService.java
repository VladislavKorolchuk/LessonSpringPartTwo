package com.shop.lessonspringparttwo.service;

import com.shop.lessonspringparttwo.component.Basket;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
public class ShopService {
private final Basket basket;

    public ShopService(Basket basket) {
        this.basket = basket;
    }

    public  void addId(List<Integer> id) {
        basket.addId(id);
    }

    public List<Integer> getId() {
        return basket.getId();
    }

}
