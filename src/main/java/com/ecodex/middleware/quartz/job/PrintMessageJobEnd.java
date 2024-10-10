package com.ecodex.middleware.quartz.job;

import com.ecodex.middleware.wsdlautogen.SendMessageToMiddlewareCallbackImpl;
import com.ecodex.middleware.wsdlautogen.SendMessageToMiddlewareCallbackImplService;

public class PrintMessageJobEnd {
    
    public void notifyJobComplete(String jobId) {
        // Crear instancia del servicio generado a partir del WSDL del callback
    	SendMessageToMiddlewareCallbackImplService callbackService = new SendMessageToMiddlewareCallbackImplService();
    	SendMessageToMiddlewareCallbackImpl callbackPort = callbackService.getSendMessageToMiddlewareCallbackImplPort();
        
        // Llamar al método del callback en el cliente
        String response = callbackPort.onJobComplete(jobId);
        
        System.out.println("Respuesta del cliente al callback: " + response);
    }
}