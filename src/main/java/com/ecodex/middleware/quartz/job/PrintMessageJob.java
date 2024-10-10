package com.ecodex.middleware.quartz.job;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


//Jobs no concurrentes: Si no quieres que múltiples instancias de un job se ejecuten al mismo tiempo, 
//puedes usar @DisallowConcurrentExecution. Esto le indica a Quartz que no permita la ejecución de más de una instancia del mismo Job al mismo tiempo. 
//Si el Job ya está en ejecución, Quartz encolará las nuevas ejecuciones.
@DisallowConcurrentExecution
public class PrintMessageJob implements Job {

    private static final Logger logger = LoggerFactory.getLogger(PrintMessageJob.class);

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        logger.info(">>> El trabajo de Quartz está en ejecución >>> "+context.toString());
        
        // Lógica del trabajo de Quartz
        String jobId = context.getJobDetail().getKey().toString();

        // Al finalizar el job, notificar al cliente mediante el callback
        PrintMessageJobEnd notifier = new PrintMessageJobEnd();
        notifier.notifyJobComplete(jobId);
        
    }
}
