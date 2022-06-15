package com.example.demo;

import java.util.Arrays;

public class DataDTO {
    private String webhookId;
    private String webhookName;
    private String webhookNotificationId;
    private String webhookScope;
    private String event;
    private String eventDate;
    private String eventResourceType;
    private String participantRole;
    private String actionType;
    private String participantUserId;
    private String participantUserEmail;
    private Agreement agreement;

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

    public String getWebhookId() {
        return webhookId;
    }

    public String getWebhookName() {
        return webhookName;
    }

    public String getWebhookNotificationId() {
        return webhookNotificationId;
    }

    public String getWebhookScope() {
        return webhookScope;
    }

    public Agreement getAgreement() {
        return agreement;
    }

    public void setAgreement(Agreement agreement) {
        this.agreement = agreement;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventResourceType() {
        return eventResourceType;
    }

    public void setEventResourceType(String eventResourceType) {
        this.eventResourceType = eventResourceType;
    }

    public String getParticipantRole() {
        return participantRole;
    }

    public void setParticipantRole(String participantRole) {
        this.participantRole = participantRole;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getParticipantUserId() {
        return participantUserId;
    }

    public void setParticipantUserId(String participantUserId) {
        this.participantUserId = participantUserId;
    }

    public String getParticipantUserEmail() {
        return participantUserEmail;
    }

    public void setParticipantUserEmail(String participantUserEmail) {
        this.participantUserEmail = participantUserEmail;
    }

    @Override
    public String toString() {
        return "DataDTO{" +
                "webhookId='" + webhookId + '\'' +
                ", webhookName='" + webhookName + '\'' +
                ", webhookNotificationId='" + webhookNotificationId + '\'' +
                ", webhookScope='" + webhookScope + '\'' +
                ", event='" + event + '\'' +
                ", eventDate='" + eventDate + '\'' +
                ", eventResourceType='" + eventResourceType + '\'' +
                ", participantRole='" + participantRole + '\'' +
                ", actionType='" + actionType + '\'' +
                ", participantUserId='" + participantUserId + '\'' +
                ", participantUserEmail='" + participantUserEmail + '\'' +
                ", agreement=" + agreement +
                '}';
    }
}
