package com.fat.learn.web;

import com.fat.learn.interfaces.ITalkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: fatsnake
 * @Description":
 * @Date:2020/5/15 17:10
 * Copyright (c) 2020, zaodao All Rights Reserved.
 */
@RestController
@RequestMapping("talk")
public class TalkController {

    @Autowired
    private ITalkService talkService;

    @GetMapping
    public String sayHello() {
        return talkService.sayHello("张三");
    }
}
