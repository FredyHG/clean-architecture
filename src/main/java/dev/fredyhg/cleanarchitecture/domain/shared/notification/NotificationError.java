package dev.fredyhg.cleanarchitecture.domain.shared.notification;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class NotificationError {
    private String message;
    private String context;
}
