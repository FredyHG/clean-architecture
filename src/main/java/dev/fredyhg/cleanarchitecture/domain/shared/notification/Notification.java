package dev.fredyhg.cleanarchitecture.domain.shared.notification;

import lombok.Data;

import java.util.List;

@Data
public class Notification {
    private List<NotificationError> notificationErrors;

    public void addError(NotificationError error) {
        this.notificationErrors.add(error);
    }

    public boolean hasErrors() {
        return !this.notificationErrors.isEmpty();
    }

    public List<NotificationError> getErrors() {
        return this.notificationErrors;
    }

    public String messages(String context) {
        StringBuilder message = new StringBuilder();
        for (NotificationError error : this.notificationErrors) {
            if (context == null || error.getContext().equals(context)) {
                message.append(error.getContext()).append(": ").append(error.getMessage()).append(",");
            }
        }
        return message.toString();
    }
}
