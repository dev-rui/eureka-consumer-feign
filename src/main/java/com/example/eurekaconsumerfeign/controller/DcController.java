package com.example.eurekaconsumerfeign.controller;

import com.example.eurekaconsumerfeign.DcClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DcController {

    private static Logger logger= LoggerFactory.getLogger(DcController.class);
    @Autowired
    DcClient dcClient;


    @GetMapping("/consumer")
    public String dc() {
        logger.info("请求fegin");
        return dcClient.consumer();
    }







}