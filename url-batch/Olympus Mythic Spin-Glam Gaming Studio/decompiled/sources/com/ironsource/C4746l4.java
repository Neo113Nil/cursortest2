package com.ironsource;

import java.lang.Thread;

/* renamed from: com.ironsource.l4, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C4746l4 implements Thread.UncaughtExceptionHandler {
    private Thread.UncaughtExceptionHandler a;

    C4746l4(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        C4764m4 c4764m4 = new C4764m4(th);
        if (c4764m4.d()) {
            new K5(c4764m4.b(), "" + System.currentTimeMillis(), "Crash").a();
        }
        this.a.uncaughtException(thread, th);
    }
}
