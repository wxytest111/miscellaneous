package com.dq.miscellaneous.controller;

import com.dq.miscellaneous.entity.JshopDistributionUser;
import com.dq.miscellaneous.model.ResponseMsg;
import com.dq.miscellaneous.service.JshopDistributionUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/distribution")
public class DistributionController  extends BaseController {

    @Autowired
    private JshopDistributionUserService jshopDistributionUserService;
    @RequestMapping(value = "/switchMoneyReceiver", method = RequestMethod.GET)
    public ResponseMsg echoMessage(@RequestParam(name = "token") String token) {
        ResponseMsg  msg = new ResponseMsg();
        msg.setCode("200");
        return msg;
    }

    @RequestMapping(value = "/setTrainingManagerRakeBack", method = RequestMethod.GET)
    public ResponseMsg setTrainingManagerRakeBack(@RequestParam(name = "utoken") String utoken, @RequestParam(name = "startDate") String startDate, @RequestParam(name = "endDate") String endDate){
        JshopDistributionUser manager = jshopDistributionUserService.findByUtoken(utoken);
        List<JshopDistributionUser> children = jshopDistributionUserService.children(utoken, 1, 0);

        ResponseMsg  msg = new ResponseMsg();
        msg.setCode("200");
        msg.setResult(children);
        return msg;
    }
}
