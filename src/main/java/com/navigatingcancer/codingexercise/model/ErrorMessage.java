package com.navigatingcancer.codingexercise.model;

import java.util.Date;

public class ErrorMessage {
    private final int status;
    private final String message;
    private final Date timestamp;

    public ErrorMessage(int status, String message, Date timestamp) {
        this.status = status;
        this.message = message;
        this.timestamp = timestamp;
    }

    public Integer getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public Date getTimestamp() {
        return timestamp;
    }
}
