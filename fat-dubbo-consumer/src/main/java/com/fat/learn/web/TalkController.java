package com.fat.learn.web;

import com.fat.learn.config.ConfigService;
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

    @Autowired
    private ConfigService configService;

    @GetMapping
    public String sayHello() {

        String str = "张三用" + configService.getLang() + "打招呼了";

        return talkService.sayHello(str);
    }
}
