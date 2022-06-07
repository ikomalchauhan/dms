package com.example.demo;

public class DataDTO {
    private String webhookSubscriptionEvents;
    private String scope;
    private String name;
    private String[] state;

    public String getWebhookSubscriptionEvents() {
        return webhookSubscriptionEvents;
    }

    public void setWebhookSubscriptionEvents(String webhookSubscriptionEvents) {
        this.webhookSubscriptionEvents = webhookSubscriptionEvents;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getState() {
        return state;
    }

    public void setState(String[] state) {
        this.state = state;
    }
}
