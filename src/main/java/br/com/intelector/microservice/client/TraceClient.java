package br.com.intelector.microservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("api-gateway-web")
public interface TraceClient {

    @RequestMapping(value = "/api/microserviceSecond/trace", method = RequestMethod.GET)
    String trace();
}
