package com.aya.financegateway.controller;

import com.aya.financegateway.common.ChannelEnum;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("messageService")
public class MessageController {

    @RequestMapping(value = "/getMessage/{msgId}")
    public String getMessage(@PathVariable String msgId) {
        return ChannelEnum.SWIFT + " message";
    }
}
