package com.Simple_Microservice_1.Limits_Controller;


import com.Simple_Microservice_1.Configuration.Configuration;
import com.Simple_Microservice_1.Limits_Model.Limits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private Configuration config;

    @GetMapping("/limits")
    public Limits RetriveLimits(){
        return new Limits(config.getMinimum(),config.getMaximum());
        //return new Limits(1,1000);
    }

}
