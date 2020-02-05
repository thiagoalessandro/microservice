package br.com.intelector.microservice.controller;

import br.com.intelector.microservice.service.TraceService;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/microservice")
public class TraceBridgeController {

    @Autowired
    private EurekaClient eurekaClient;

    @Autowired
    private TraceService traceService;

    @GetMapping("/trace")
    public String trace(){
        return traceService.trace();
    }

    @GetMapping("/name")
    public String name(){
        return eurekaClient.getApplicationInfoManager().getInfo().getAppName();
    }


}
