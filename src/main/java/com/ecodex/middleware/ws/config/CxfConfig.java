package com.ecodex.middleware.ws.config;


import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.Bus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ecodex.middleware.ws.service.ExecJobTestService;

import javax.xml.ws.Endpoint;

@Configuration
public class CxfConfig {

	
    private final Bus bus;
    private final ExecJobTestService execJobTestService;

    public CxfConfig(Bus bus, ExecJobTestService execJobTestService) {
        this.bus = bus;
        this.execJobTestService = execJobTestService;
    }
    
    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, execJobTestService);
        endpoint.publish("/job01");  // Publica el servicio SOAP
        System.out.println("<<<OBTENER WSDL>>>     http://localhost:8080/services/job01?wsdl");
        return endpoint;
    }

}
