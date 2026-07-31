package org.slf4j.helpers;

import org.slf4j.Marker;
import org.slf4j.event.Level;
import org.slf4j.spi.LoggingEventBuilder;

/* loaded from: classes5.dex */
public abstract class LegacyAbstractLogger extends AbstractLogger {
    private static final long serialVersionUID = -7041884104854048950L;

    @Override // org.slf4j.helpers.AbstractLogger, org.slf4j.Logger
    public /* bridge */ /* synthetic */ LoggingEventBuilder atDebug() {
        return super.atDebug();
    }

    @Override // org.slf4j.helpers.AbstractLogger, org.slf4j.Logger
    public /* bridge */ /* synthetic */ LoggingEventBuilder atError() {
        return super.atError();
    }

    @Override // org.slf4j.helpers.AbstractLogger, org.slf4j.Logger
    public /* bridge */ /* synthetic */ LoggingEventBuilder atInfo() {
        return super.atInfo();
    }

    @Override // org.slf4j.helpers.AbstractLogger, org.slf4j.Logger
    public /* bridge */ /* synthetic */ LoggingEventBuilder atLevel(Level level) {
        return super.atLevel(level);
    }

    @Override // org.slf4j.helpers.AbstractLogger, org.slf4j.Logger
    public /* bridge */ /* synthetic */ LoggingEventBuilder atTrace() {
        return super.atTrace();
    }

    @Override // org.slf4j.helpers.AbstractLogger, org.slf4j.Logger
    public /* bridge */ /* synthetic */ LoggingEventBuilder atWarn() {
        return super.atWarn();
    }

    @Override // org.slf4j.helpers.AbstractLogger, org.slf4j.Logger
    public abstract /* synthetic */ boolean isDebugEnabled();

    @Override // org.slf4j.helpers.AbstractLogger, org.slf4j.Logger
    public /* bridge */ /* synthetic */ boolean isEnabledForLevel(Level level) {
        return super.isEnabledForLevel(level);
    }

    @Override // org.slf4j.helpers.AbstractLogger, org.slf4j.Logger
    public abstract /* synthetic */ boolean isErrorEnabled();

    @Override // org.slf4j.helpers.AbstractLogger, org.slf4j.Logger
    public abstract /* synthetic */ boolean isInfoEnabled();

    @Override // org.slf4j.helpers.AbstractLogger, org.slf4j.Logger
    public abstract /* synthetic */ boolean isTraceEnabled();

    @Override // org.slf4j.helpers.AbstractLogger, org.slf4j.Logger
    public abstract /* synthetic */ boolean isWarnEnabled();

    @Override // org.slf4j.helpers.AbstractLogger, org.slf4j.Logger
    public /* bridge */ /* synthetic */ LoggingEventBuilder makeLoggingEventBuilder(Level level) {
        return super.makeLoggingEventBuilder(level);
    }

    @Override // org.slf4j.helpers.AbstractLogger
    public boolean isTraceEnabled(Marker marker) {
        return isTraceEnabled();
    }

    @Override // org.slf4j.helpers.AbstractLogger
    public boolean isDebugEnabled(Marker marker) {
        return isDebugEnabled();
    }

    @Override // org.slf4j.helpers.AbstractLogger
    public boolean isInfoEnabled(Marker marker) {
        return isInfoEnabled();
    }

    @Override // org.slf4j.helpers.AbstractLogger
    public boolean isWarnEnabled(Marker marker) {
        return isWarnEnabled();
    }

    @Override // org.slf4j.helpers.AbstractLogger
    public boolean isErrorEnabled(Marker marker) {
        return isErrorEnabled();
    }
}
