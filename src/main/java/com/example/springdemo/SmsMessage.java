package com.example.springdemo;

public class SmsMessage implements Inboxes {
    public String getMessage() {
        String message = "Вы получили смс!";
        return message;
    }
}
