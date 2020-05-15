package com.fat.learn.service.impl;

import com.fat.learn.interfaces.ITalkService;
import org.springframework.stereotype.Service;

/**
 * @Auther: fatsnake
 * @Description":
 * @Date:2020/5/15 16:38
 * Copyright (c) 2020, zaodao All Rights Reserved.
 */
@Service
public class TalkService implements ITalkService {
    @Override
    public String sayHello(String userName) {
        return userName + "said hello!!!";
    }
}
