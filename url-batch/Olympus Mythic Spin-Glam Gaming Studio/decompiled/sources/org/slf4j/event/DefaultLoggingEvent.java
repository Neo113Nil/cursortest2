package org.slf4j.event;

import org.slf4j.Logger;

/* loaded from: classes11.dex */
public class DefaultLoggingEvent implements LoggingEvent {
    Level level;
    Logger logger;

    public DefaultLoggingEvent(Level level, Logger logger) {
        this.logger = logger;
        this.level = level;
    }
}
