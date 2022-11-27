package com.shop.lessonspringparttwo.controller;

import com.shop.lessonspringparttwo.service.ShopService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/store/order")

public class ShopController {
    ShopService shopService;

    public ShopController(ShopService shopService) {
        this.shopService = shopService;
    }

    @GetMapping("/add")
    public void addIt(@RequestParam("id") List<Integer> addid) {
        this.shopService.addId(addid);
    }

    @GetMapping("/get")
    public List<Integer> getIt() {
        return this.shopService.getId();
    }

}
