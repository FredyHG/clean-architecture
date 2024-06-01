package dev.fredyhg.cleanarchitecture.domain.shared.event;

import java.util.Date;

public interface Event {
    Date dataTimeOccurred = new Date();
    Object eventData = new Object();
}
