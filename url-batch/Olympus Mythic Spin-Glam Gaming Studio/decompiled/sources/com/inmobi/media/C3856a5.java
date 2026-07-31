package com.inmobi.media;

import java.lang.Thread;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.a5, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C3856a5 extends B5 implements Thread.UncaughtExceptionHandler {
    public final Thread.UncaughtExceptionHandler b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3856a5(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C5 listener) {
        super(listener);
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.b = uncaughtExceptionHandler;
    }

    @Override // com.inmobi.media.B5
    public final void a() {
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override // com.inmobi.media.B5
    public final void b() {
        Thread.setDefaultUncaughtExceptionHandler(this.b);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread t, Throwable e) {
        Intrinsics.checkNotNullParameter(t, "t");
        Intrinsics.checkNotNullParameter(e, "e");
        this.a.a(new C3882b5(t, e));
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(t, e);
        }
    }
}
