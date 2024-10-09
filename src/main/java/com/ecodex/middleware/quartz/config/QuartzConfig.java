package com.ecodex.middleware.quartz.config;

import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ecodex.middleware.quartz.job.PrintMessageJob;

@Configuration
public class QuartzConfig {

    @Bean
    public JobDetail jobDetail() {
        return JobBuilder.newJob(PrintMessageJob.class)
                .withIdentity("printMessageJob")
                .storeDurably() // Mantiene el Job en el JobStore
                .build();
    }

//    @Bean
//    public Trigger trigger(JobDetail jobDetail) {
//        return TriggerBuilder.newTrigger()
//                .forJob(jobDetail)
//                .withIdentity("printMessageTrigger")
//                .withSchedule(SimpleScheduleBuilder.simpleSchedule()
//                        .withIntervalInSeconds(10) // Ejecutar cada 10 segundos
//                        .repeatForever()) // Repetir para siempre
//                .build();
//    }
}
