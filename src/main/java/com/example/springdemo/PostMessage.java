package com.example.springdemo;

public class PostMessage implements Inboxes {

    public String getMessage() {
        String message = "Вы получили письмо!";
        return message;
    }
}

