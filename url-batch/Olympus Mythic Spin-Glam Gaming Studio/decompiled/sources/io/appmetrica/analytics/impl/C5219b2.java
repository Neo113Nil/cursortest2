package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.appmetrica.analytics.impl.b2, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C5219b2 implements Thread.UncaughtExceptionHandler {
    public static final AtomicBoolean e = new AtomicBoolean();
    public final InterfaceC5305eb a;
    public final J6 b = C5661s4.l().n();
    public final F6 c = new F6();
    public final Vn d = new Vn();

    public C5219b2(A6 a6) {
        this.a = a6;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        StackTraceElement[] stackTraceElementArr;
        try {
            e.set(true);
            InterfaceC5305eb interfaceC5305eb = this.a;
            On apply = this.c.apply(thread);
            Vn vn = this.d;
            Thread a = vn.a.a();
            ArrayList a2 = vn.a(a, thread);
            if (thread != a) {
                try {
                    stackTraceElementArr = vn.a.b();
                    if (stackTraceElementArr == null) {
                        try {
                            stackTraceElementArr = a.getStackTrace();
                        } catch (SecurityException unused) {
                        }
                    }
                } catch (SecurityException unused2) {
                    stackTraceElementArr = null;
                }
                a2.add(0, (On) vn.b.apply(a, stackTraceElementArr));
            }
            interfaceC5305eb.a(th, new X(apply, a2, this.b.a.a()));
        } catch (Throwable th2) {
            LoggerStorage.getMainPublicOrAnonymousLogger().error(th2, th2.getMessage(), new Object[0]);
        }
    }
}
