package com.example.demo;

import java.util.Arrays;

public class DataDTO {
    private String webhookId;
    private String webhookName;
    private String webhookNotificationId;
    private String webhookScope;

    public void setWebhookId(String webhookId) {
        this.webhookId = webhookId;
    }

    public void setWebhookName(String webhookName) {
        this.webhookName = webhookName;
    }

    public void setWebhookNotificationId(String webhookNotificationId) {
        this.webhookNotificationId = webhookNotificationId;
    }

    public void setWebhookScope(String webhookScope) {
        this.webhookScope = webhookScope;
    }

    @Override
    public String toString() {
        return "DataDTO{" +
                "webhookId='" + webhookId + '\'' +
                ", webhookName='" + webhookName + '\'' +
                ", webhookNotificationId='" + webhookNotificationId + '\'' +
                ", webhookScope='" + webhookScope + '\'' +
                '}';
    }
}
