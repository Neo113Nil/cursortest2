package org.slf4j;

import org.slf4j.event.Level;
import org.slf4j.spi.DefaultLoggingEventBuilder;
import org.slf4j.spi.LoggingEventBuilder;
import org.slf4j.spi.NOPLoggingEventBuilder;

/* loaded from: classes6.dex */
public interface Logger {
    void debug(String str, Throwable th);

    boolean isDebugEnabled();

    boolean isErrorEnabled();

    boolean isInfoEnabled();

    boolean isTraceEnabled();

    boolean isWarnEnabled();

    void trace(String str);

    void warn(String str);

    default LoggingEventBuilder makeLoggingEventBuilder(Level level) {
        return new DefaultLoggingEventBuilder(this, level);
    }

    default LoggingEventBuilder atLevel(Level level) {
        if (isEnabledForLevel(level)) {
            return makeLoggingEventBuilder(level);
        }
        return NOPLoggingEventBuilder.singleton();
    }

    default boolean isEnabledForLevel(Level level) {
        int i = level.toInt();
        if (i == 0) {
            return isTraceEnabled();
        }
        if (i == 10) {
            return isDebugEnabled();
        }
        if (i == 20) {
            return isInfoEnabled();
        }
        if (i == 30) {
            return isWarnEnabled();
        }
        if (i == 40) {
            return isErrorEnabled();
        }
        throw new IllegalArgumentException("Level [" + level + "] not recognized.");
    }

    default LoggingEventBuilder atTrace() {
        if (isTraceEnabled()) {
            return makeLoggingEventBuilder(Level.TRACE);
        }
        return NOPLoggingEventBuilder.singleton();
    }

    default LoggingEventBuilder atDebug() {
        if (isDebugEnabled()) {
            return makeLoggingEventBuilder(Level.DEBUG);
        }
        return NOPLoggingEventBuilder.singleton();
    }

    default LoggingEventBuilder atInfo() {
        if (isInfoEnabled()) {
            return makeLoggingEventBuilder(Level.INFO);
        }
        return NOPLoggingEventBuilder.singleton();
    }

    default LoggingEventBuilder atWarn() {
        if (isWarnEnabled()) {
            return makeLoggingEventBuilder(Level.WARN);
        }
        return NOPLoggingEventBuilder.singleton();
    }

    default LoggingEventBuilder atError() {
        if (isErrorEnabled()) {
            return makeLoggingEventBuilder(Level.ERROR);
        }
        return NOPLoggingEventBuilder.singleton();
    }
}
