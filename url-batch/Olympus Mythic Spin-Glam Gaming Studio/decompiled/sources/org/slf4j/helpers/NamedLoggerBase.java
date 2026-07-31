package org.slf4j.helpers;

import java.io.ObjectStreamException;
import java.io.Serializable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.event.Level;
import org.slf4j.spi.LoggingEventBuilder;

/* loaded from: classes4.dex */
abstract class NamedLoggerBase implements Logger, Serializable {
    private static final long serialVersionUID = 7535258609338176893L;
    protected String name;

    @Override // org.slf4j.Logger
    public /* bridge */ /* synthetic */ LoggingEventBuilder atDebug() {
        return super.atDebug();
    }

    @Override // org.slf4j.Logger
    public /* bridge */ /* synthetic */ LoggingEventBuilder atError() {
        return super.atError();
    }

    @Override // org.slf4j.Logger
    public /* bridge */ /* synthetic */ LoggingEventBuilder atInfo() {
        return super.atInfo();
    }

    @Override // org.slf4j.Logger
    public /* bridge */ /* synthetic */ LoggingEventBuilder atLevel(Level level) {
        return super.atLevel(level);
    }

    @Override // org.slf4j.Logger
    public /* bridge */ /* synthetic */ LoggingEventBuilder atTrace() {
        return super.atTrace();
    }

    @Override // org.slf4j.Logger
    public /* bridge */ /* synthetic */ LoggingEventBuilder atWarn() {
        return super.atWarn();
    }

    public abstract /* synthetic */ void debug(String str);

    public abstract /* synthetic */ void debug(String str, Object obj);

    public abstract /* synthetic */ void debug(String str, Object obj, Object obj2);

    @Override // org.slf4j.Logger
    public abstract /* synthetic */ void debug(String str, Throwable th);

    public abstract /* synthetic */ void debug(String str, Object... objArr);

    public abstract /* synthetic */ void debug(Marker marker, String str);

    public abstract /* synthetic */ void debug(Marker marker, String str, Object obj);

    public abstract /* synthetic */ void debug(Marker marker, String str, Object obj, Object obj2);

    public abstract /* synthetic */ void debug(Marker marker, String str, Throwable th);

    public abstract /* synthetic */ void debug(Marker marker, String str, Object... objArr);

    public abstract /* synthetic */ void error(String str);

    public abstract /* synthetic */ void error(String str, Object obj);

    public abstract /* synthetic */ void error(String str, Object obj, Object obj2);

    public abstract /* synthetic */ void error(String str, Throwable th);

    public abstract /* synthetic */ void error(String str, Object... objArr);

    public abstract /* synthetic */ void error(Marker marker, String str);

    public abstract /* synthetic */ void error(Marker marker, String str, Object obj);

    public abstract /* synthetic */ void error(Marker marker, String str, Object obj, Object obj2);

    public abstract /* synthetic */ void error(Marker marker, String str, Throwable th);

    public abstract /* synthetic */ void error(Marker marker, String str, Object... objArr);

    public abstract /* synthetic */ void info(String str);

    public abstract /* synthetic */ void info(String str, Object obj);

    public abstract /* synthetic */ void info(String str, Object obj, Object obj2);

    public abstract /* synthetic */ void info(String str, Throwable th);

    public abstract /* synthetic */ void info(String str, Object... objArr);

    public abstract /* synthetic */ void info(Marker marker, String str);

    public abstract /* synthetic */ void info(Marker marker, String str, Object obj);

    public abstract /* synthetic */ void info(Marker marker, String str, Object obj, Object obj2);

    public abstract /* synthetic */ void info(Marker marker, String str, Throwable th);

    public abstract /* synthetic */ void info(Marker marker, String str, Object... objArr);

    @Override // org.slf4j.Logger
    public abstract /* synthetic */ boolean isDebugEnabled();

    public abstract /* synthetic */ boolean isDebugEnabled(Marker marker);

    @Override // org.slf4j.Logger
    public /* bridge */ /* synthetic */ boolean isEnabledForLevel(Level level) {
        return super.isEnabledForLevel(level);
    }

    @Override // org.slf4j.Logger
    public abstract /* synthetic */ boolean isErrorEnabled();

    public abstract /* synthetic */ boolean isErrorEnabled(Marker marker);

    @Override // org.slf4j.Logger
    public abstract /* synthetic */ boolean isInfoEnabled();

    public abstract /* synthetic */ boolean isInfoEnabled(Marker marker);

    @Override // org.slf4j.Logger
    public abstract /* synthetic */ boolean isTraceEnabled();

    public abstract /* synthetic */ boolean isTraceEnabled(Marker marker);

    @Override // org.slf4j.Logger
    public abstract /* synthetic */ boolean isWarnEnabled();

    public abstract /* synthetic */ boolean isWarnEnabled(Marker marker);

    @Override // org.slf4j.Logger
    public /* bridge */ /* synthetic */ LoggingEventBuilder makeLoggingEventBuilder(Level level) {
        return super.makeLoggingEventBuilder(level);
    }

    @Override // org.slf4j.Logger
    public abstract /* synthetic */ void trace(String str);

    public abstract /* synthetic */ void trace(String str, Object obj);

    public abstract /* synthetic */ void trace(String str, Object obj, Object obj2);

    public abstract /* synthetic */ void trace(String str, Throwable th);

    public abstract /* synthetic */ void trace(String str, Object... objArr);

    public abstract /* synthetic */ void trace(Marker marker, String str);

    public abstract /* synthetic */ void trace(Marker marker, String str, Object obj);

    public abstract /* synthetic */ void trace(Marker marker, String str, Object obj, Object obj2);

    public abstract /* synthetic */ void trace(Marker marker, String str, Throwable th);

    public abstract /* synthetic */ void trace(Marker marker, String str, Object... objArr);

    @Override // org.slf4j.Logger
    public abstract /* synthetic */ void warn(String str);

    public abstract /* synthetic */ void warn(String str, Object obj);

    public abstract /* synthetic */ void warn(String str, Object obj, Object obj2);

    public abstract /* synthetic */ void warn(String str, Throwable th);

    public abstract /* synthetic */ void warn(String str, Object... objArr);

    public abstract /* synthetic */ void warn(Marker marker, String str);

    public abstract /* synthetic */ void warn(Marker marker, String str, Object obj);

    public abstract /* synthetic */ void warn(Marker marker, String str, Object obj, Object obj2);

    public abstract /* synthetic */ void warn(Marker marker, String str, Throwable th);

    public abstract /* synthetic */ void warn(Marker marker, String str, Object... objArr);

    NamedLoggerBase() {
    }

    public String getName() {
        return this.name;
    }

    protected Object readResolve() throws ObjectStreamException {
        return LoggerFactory.getLogger(getName());
    }
}
