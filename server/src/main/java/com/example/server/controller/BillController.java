package com.example.server.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1/bill")
@CrossOrigin
public class BillController {
    @GetMapping("/getbill")
    public String getBill(){
        return  "bill";
    }

}
