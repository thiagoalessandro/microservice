package br.com.intelector.microservice.service;

import br.com.intelector.microservice.client.TraceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TraceService {

    @Autowired
    private TraceClient traceClient;

    public String trace(){
        String result;
        try {
            result = traceClient.trace();
        }catch (Exception e){
            result = e.getMessage();
        }
        return result;
    }

}
