package com.inmobi.media;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.b5, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C3882b5 extends C3887ba {
    public final StackTraceElement[] g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3882b5(Thread thread, Throwable error) {
        super("crashReporting", "CrashEvent", Hl.a(thread, error));
        Intrinsics.checkNotNullParameter(thread, "thread");
        Intrinsics.checkNotNullParameter(error, "error");
        this.g = error.getStackTrace();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3882b5(String str) {
        super(eventId, "crashReporting", "CatchEvent", str);
        String eventId = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(eventId, "toString(...)");
        Intrinsics.checkNotNullParameter("crashReporting", "component");
        Intrinsics.checkNotNullParameter("CatchEvent", "eventType");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
    }
}
