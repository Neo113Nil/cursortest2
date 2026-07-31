package com.ironsource.mediationsdk.logger;

import com.applovin.mediation.unity.BuildConfig;
import com.ironsource.C4664gb;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes15.dex */
public class IronSourceLoggerManager extends IronSourceLogger {
    private static volatile IronSourceLoggerManager d;
    private final List<IronSourceLogger> c;

    private IronSourceLoggerManager(String str) {
        super(str);
        this.c = new CopyOnWriteArrayList();
        c();
    }

    private void c() {
        this.c.add(new a(0));
    }

    public static IronSourceLoggerManager getLogger() {
        if (d == null) {
            synchronized (IronSourceLoggerManager.class) {
                try {
                    if (d == null) {
                        d = new IronSourceLoggerManager(IronSourceLoggerManager.class.getSimpleName());
                    }
                } finally {
                }
            }
        }
        return d;
    }

    void a(IronSourceLogger.IronSourceTag ironSourceTag, C4664gb c4664gb) {
        if (a(c4664gb.a())) {
            return;
        }
        a(ironSourceTag, c4664gb.c(), c4664gb.a());
    }

    public void addLogger(IronSourceLogger ironSourceLogger) {
        this.c.add(ironSourceLogger);
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    @Deprecated(forRemoval = true, since = BuildConfig.VERSION_NAME)
    public void log(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i) {
        if (a(i)) {
            return;
        }
        a(ironSourceTag, str, i);
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public void logException(IronSourceLogger.IronSourceTag ironSourceTag, String str, Throwable th) {
        if (th == null) {
            Iterator<IronSourceLogger> it = this.c.iterator();
            while (it.hasNext()) {
                it.next().log(ironSourceTag, str, 3);
            }
        } else {
            Iterator<IronSourceLogger> it2 = this.c.iterator();
            while (it2.hasNext()) {
                it2.next().logException(ironSourceTag, str, th);
            }
        }
    }

    public void onLog(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i) {
        log(ironSourceTag, str, i);
    }

    public void setLoggerDebugLevel(String str, int i) {
        if (str == null) {
            return;
        }
        IronSourceLogger a = a(str);
        if (a == null) {
            log(IronSourceLogger.IronSourceTag.NATIVE, "Failed to find logger:setLoggerDebugLevel(loggerName:" + str + " ,debugLevel:" + i + ")", 0);
            return;
        }
        if (i < 0 || i > 3) {
            this.c.remove(a);
            return;
        }
        log(IronSourceLogger.IronSourceTag.NATIVE, "setLoggerDebugLevel(loggerName:" + str + " ,debugLevel:" + i + ")", 0);
        a.setDebugLevel(i);
    }

    private IronSourceLoggerManager(String str, int i) {
        super(str, i);
        this.c = new CopyOnWriteArrayList();
        c();
    }

    void a(IronSourceLogger.IronSourceTag ironSourceTag, C4664gb c4664gb, Throwable th) {
        if (a(c4664gb.a())) {
            return;
        }
        logException(ironSourceTag, c4664gb.c(), th);
    }

    public static IronSourceLoggerManager getLogger(int i) {
        IronSourceLoggerManager logger = getLogger();
        logger.a = i;
        return logger;
    }

    private boolean a(int i) {
        return i < this.a;
    }

    protected void a(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i) {
        for (IronSourceLogger ironSourceLogger : this.c) {
            if (ironSourceLogger.a() <= i) {
                ironSourceLogger.log(ironSourceTag, str, i);
            }
        }
    }

    private IronSourceLogger a(String str) {
        for (IronSourceLogger ironSourceLogger : this.c) {
            if (ironSourceLogger.b().equals(str)) {
                return ironSourceLogger;
            }
        }
        return null;
    }
}
