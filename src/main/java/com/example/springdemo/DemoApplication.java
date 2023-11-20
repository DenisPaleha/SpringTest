package com.example.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        NotificationService service = context.getBean(NotificationService.class);

        String output = service.textResult();
        System.out.println("Сервис уведомлений сообщает:");
        System.out.println(output);
        context.close();

    }
}
