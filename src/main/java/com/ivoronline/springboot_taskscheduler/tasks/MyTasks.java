package com.ivoronline.springboot_taskscheduler.tasks;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class MyTasks {

  @Scheduled(fixedDelay=5000)
  public void task1() {
    System.out.println("Hello from task1()");
  }

}



