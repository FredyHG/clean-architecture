package dev.fredyhg.cleanarchitecture.domain.shared.notification;

import lombok.Data;

@Data
public class NotificationError {
    private String message;
    private String context;
}
