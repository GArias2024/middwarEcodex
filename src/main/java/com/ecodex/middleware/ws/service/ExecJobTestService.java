package com.ecodex.middleware.ws.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface ExecJobTestService {

    @WebMethod
    String runJob01 (String message);
}
