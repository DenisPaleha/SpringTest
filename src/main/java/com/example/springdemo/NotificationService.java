package com.example.springdemo;

public class NotificationService {
    private final String textPost;
    private final String textSms;

    public NotificationService() {
        Inboxes mail = new PostMessage();
        Inboxes sms = new SmsMessage();
        this.textPost = mail.getMessage();
        this.textSms = sms.getMessage();
    }

    public String textResult() {
        return this.textPost + "\n" + this.textSms;
    }
}
