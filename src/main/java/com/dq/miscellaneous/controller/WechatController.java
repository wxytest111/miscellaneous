package com.dq.miscellaneous.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/wechat")
public class WechatController extends BaseController {

    @RequestMapping(value = "/message", method = RequestMethod.GET)
    public String echoMessage(@RequestParam(name = "echostr") String echostr) {
        return echostr;
    }
}
