package com.ecodex.middleware.ws.service.impl;


import java.util.UUID;

import javax.jws.WebService;

import org.quartz.DateBuilder;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecodex.middleware.ws.service.ExecJobTestService;

//import javax.jws.WebService;


@WebService(endpointInterface = "com.ecodex.middleware.ws.service.ExecJobTestService")
@Service
public class ExecJobTestServiceImpl implements ExecJobTestService {
	
    @Autowired
    private Scheduler scheduler; 

    @Override
    public String runJob01 (String message) {
    	
//    	SIN RETARDO (Esto seria lo normal,supongo)
//    	 try {
//             scheduler.triggerJob(JobKey.jobKey("printMessageJob"));
//             return "Job ejecutado!"; 
//         } catch (SchedulerException e) {
//             return "Error al ejecutar el Job: " + e.getMessage();
//         }
    	
    	
//    	Se llama a un trigger para forzar el retardo de unos segundos para TEST
    	System.out.println("Mensaje recibido: " + message);

        try {
            // Programar el Job para que se ejecute 10 segundos más tarde
            JobKey jobKey = JobKey.jobKey("printMessageJob");

            // Generar un nombre único para el Trigger
            String uniqueTriggerName = "delayedTrigger-" + UUID.randomUUID().toString();

            // Creamos el trigger con un retraso de 10 segundos y un nombre único
            Trigger trigger = TriggerBuilder.newTrigger()
                    .forJob(jobKey)
                    .startAt(DateBuilder.futureDate(5, DateBuilder.IntervalUnit.SECOND)) // Inicia en 10 segundos
                    .withIdentity(uniqueTriggerName, "group1") // Identidad única del Trigger
                    .build();

            // Disparar el Job usando el Trigger diferido
            scheduler.scheduleJob(trigger);
             return "Job ejecutado!";
         } catch (SchedulerException e) {
             e.printStackTrace();
             return "Error al ejecutar el Job: " + e.getMessage();
         }
    	 
    }
}
