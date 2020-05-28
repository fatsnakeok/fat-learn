package com.fat.learn.config;

/**
 * @Auther: fatsnake
 * @Description":
 * @Date:2020/5/27 16:46
 * Copyright (c) 2020, zaodao All Rights Reserved.
 */

import com.alibaba.nacos.api.config.annotation.NacosValue;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class ConfigService {

    @NacosValue(value = "${lang:cn}", autoRefreshed = true)
    private String lang;
}
