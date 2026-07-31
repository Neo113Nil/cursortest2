package org.slf4j.event;

import java.util.Queue;
import org.slf4j.Marker;
import org.slf4j.helpers.LegacyAbstractLogger;
import org.slf4j.helpers.SubstituteLogger;
import org.slf4j.spi.LoggingEventBuilder;

/* loaded from: classes6.dex */
public class EventRecordingLogger extends LegacyAbstractLogger {
    static final boolean RECORD_ALL_EVENTS = true;
    private static final long serialVersionUID = -176083308134819629L;
    Queue<SubstituteLoggingEvent> eventQueue;
    SubstituteLogger logger;
    String name;

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, org.slf4j.Logger
    public /* bridge */ /* synthetic */ LoggingEventBuilder atDebug() {
        return super.atDebug();
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, org.slf4j.Logger
    public /* bridge */ /* synthetic */ LoggingEventBuilder atError() {
        return super.atError();
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, org.slf4j.Logger
    public /* bridge */ /* synthetic */ LoggingEventBuilder atInfo() {
        return super.atInfo();
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, org.slf4j.Logger
    public /* bridge */ /* synthetic */ LoggingEventBuilder atLevel(Level level) {
        return super.atLevel(level);
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, org.slf4j.Logger
    public /* bridge */ /* synthetic */ LoggingEventBuilder atTrace() {
        return super.atTrace();
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, org.slf4j.Logger
    public /* bridge */ /* synthetic */ LoggingEventBuilder atWarn() {
        return super.atWarn();
    }

    @Override // org.slf4j.helpers.AbstractLogger
    protected String getFullyQualifiedCallerName() {
        return null;
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, org.slf4j.Logger
    public boolean isDebugEnabled() {
        return true;
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, org.slf4j.Logger
    public /* bridge */ /* synthetic */ boolean isEnabledForLevel(Level level) {
        return super.isEnabledForLevel(level);
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, org.slf4j.Logger
    public boolean isErrorEnabled() {
        return true;
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, org.slf4j.Logger
    public boolean isInfoEnabled() {
        return true;
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, org.slf4j.Logger
    public boolean isTraceEnabled() {
        return true;
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, org.slf4j.Logger
    public boolean isWarnEnabled() {
        return true;
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, org.slf4j.Logger
    public /* bridge */ /* synthetic */ LoggingEventBuilder makeLoggingEventBuilder(Level level) {
        return super.makeLoggingEventBuilder(level);
    }

    public EventRecordingLogger(SubstituteLogger substituteLogger, Queue<SubstituteLoggingEvent> queue) {
        this.logger = substituteLogger;
        this.name = substituteLogger.getName();
        this.eventQueue = queue;
    }

    @Override // org.slf4j.helpers.AbstractLogger
    public String getName() {
        return this.name;
    }

    @Override // org.slf4j.helpers.AbstractLogger
    protected void handleNormalizedLoggingCall(Level level, Marker marker, String str, Object[] objArr, Throwable th) {
        SubstituteLoggingEvent substituteLoggingEvent = new SubstituteLoggingEvent();
        substituteLoggingEvent.setTimeStamp(System.currentTimeMillis());
        substituteLoggingEvent.setLevel(level);
        substituteLoggingEvent.setLogger(this.logger);
        substituteLoggingEvent.setLoggerName(this.name);
        if (marker != null) {
            substituteLoggingEvent.addMarker(marker);
        }
        substituteLoggingEvent.setMessage(str);
        substituteLoggingEvent.setThreadName(Thread.currentThread().getName());
        substituteLoggingEvent.setArgumentArray(objArr);
        substituteLoggingEvent.setThrowable(th);
        this.eventQueue.add(substituteLoggingEvent);
    }
}
