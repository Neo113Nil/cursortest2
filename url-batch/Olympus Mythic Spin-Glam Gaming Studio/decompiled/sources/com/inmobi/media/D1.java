package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class D1 extends C3887ba {
    public final int g;
    public final String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D1(String str, int i, String trace) {
        super("AppExitReasonReporting", "AppExitReasonEvent", Hl.a("reason - " + i + " description - " + (str == null ? "ApplicationExit" : str), trace));
        Intrinsics.checkNotNullParameter(trace, "trace");
        this.g = i;
        this.h = trace;
    }
}
