package com.lzl.learn.service.impl;

import com.lzl.learn.service.ScheduleServiceHi;
import org.springframework.stereotype.Component;

@Component
public class ScheduleServiceHiHystrix implements ScheduleServiceHi {

    @Override
    public String sayHiFromClient(String name) {
        return "request error " + name;
    }
}
