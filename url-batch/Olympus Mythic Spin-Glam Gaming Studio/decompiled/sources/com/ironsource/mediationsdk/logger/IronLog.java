package com.ironsource.mediationsdk.logger;

import com.ironsource.C4664gb;
import com.ironsource.mediationsdk.logger.IronSourceLogger;

/* loaded from: classes10.dex */
public enum IronLog {
    API(IronSourceLogger.IronSourceTag.API),
    CALLBACK(IronSourceLogger.IronSourceTag.CALLBACK),
    ADAPTER_API(IronSourceLogger.IronSourceTag.ADAPTER_API),
    ADAPTER_CALLBACK(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK),
    NETWORK(IronSourceLogger.IronSourceTag.NETWORK),
    INTERNAL(IronSourceLogger.IronSourceTag.INTERNAL),
    NATIVE(IronSourceLogger.IronSourceTag.NATIVE),
    EVENT(IronSourceLogger.IronSourceTag.EVENT);

    IronSourceLogger.IronSourceTag a;

    IronLog(IronSourceLogger.IronSourceTag ironSourceTag) {
        this.a = ironSourceTag;
    }

    public void error(String str, Throwable th) {
        IronSourceLoggerManager.getLogger().a(this.a, new C4664gb(str, 3), th);
    }

    public void general(String str) {
        IronSourceLoggerManager.getLogger().a(this.a, new C4664gb(str, 4));
    }

    public void info(String str) {
        IronSourceLoggerManager.getLogger().a(this.a, new C4664gb(str, 1));
    }

    public void verbose(String str) {
        IronSourceLoggerManager.getLogger().a(this.a, new C4664gb(str, 0));
    }

    public void warning(String str) {
        IronSourceLoggerManager.getLogger().a(this.a, new C4664gb(str, 2));
    }

    public void error(String str) {
        IronSourceLoggerManager.getLogger().a(this.a, new C4664gb(str, 3));
    }

    public void general() {
        IronSourceLoggerManager.getLogger().a(this.a, new C4664gb("", 4));
    }

    public void info() {
        IronSourceLoggerManager.getLogger().a(this.a, new C4664gb("", 1));
    }

    public void verbose() {
        IronSourceLoggerManager.getLogger().a(this.a, new C4664gb("", 0));
    }

    public void warning() {
        IronSourceLoggerManager.getLogger().a(this.a, new C4664gb("", 2));
    }

    public void error() {
        IronSourceLoggerManager.getLogger().a(this.a, new C4664gb("", 3));
    }
}
