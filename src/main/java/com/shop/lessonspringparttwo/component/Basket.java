package com.shop.lessonspringparttwo.component;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@SessionScope
public class Basket {
    private final List<Integer> userBasket = new ArrayList<>();

    public void addId(List<Integer> id) {
        userBasket.addAll(id);
    }

    public  List<Integer> getId () {
        return Collections.unmodifiableList(userBasket);
    }

}
