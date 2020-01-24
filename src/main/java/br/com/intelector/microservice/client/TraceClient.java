package br.com.intelector.microservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("microservice-second")
public interface TraceClient {

    @RequestMapping(value = "/microserviceSecond/trace", method = RequestMethod.GET)
    String trace();
}
