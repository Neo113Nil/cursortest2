package com.ogury.ad.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class z1 {
    public final void a(w6 mraidCommandExecutor) {
        Intrinsics.checkNotNullParameter(mraidCommandExecutor, "mraidCommandExecutor");
        b8.a(mraidCommandExecutor.a, x6.a(false));
        Intrinsics.checkNotNullParameter("hidden", "state");
        b8.a(mraidCommandExecutor.a, x6.c("hidden"));
        mraidCommandExecutor.a.setAdState("hidden");
    }
}
