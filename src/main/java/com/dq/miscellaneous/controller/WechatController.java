package com.dq.miscellaneous.controller;

import com.dq.miscellaneous.entity.JshopOrder;
import com.dq.miscellaneous.repository.JshopOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;

@RestController
@RequestMapping("/wechat")
public class WechatController extends BaseController {

    @Autowired
    private JshopOrderRepository jshopOrderRepository;

    @RequestMapping(value = "/message", method = RequestMethod.GET)
    public String echoMessage(@RequestParam(name = "echostr") String echostr) {
        return echostr;
    }

    @RequestMapping(value = "/orderInfo", method = RequestMethod.GET)
    public JshopOrder orderInfo(@RequestParam(name = "id") String id) {
        JshopOrder order = jshopOrderRepository.findById("12021030422181900001").orElseThrow(() -> new EntityNotFoundException(id));
        return order;
    }

}
