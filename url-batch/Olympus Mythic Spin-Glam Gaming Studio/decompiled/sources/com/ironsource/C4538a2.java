package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.a2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4538a2 {

    @NotNull
    public static final C4538a2 a = new C4538a2();

    @NotNull
    public static final String b = "trials_fail";

    @NotNull
    public static final String c = "parsing";

    @NotNull
    public static final String d = "other";

    @NotNull
    public static final String e = "disabled";

    @NotNull
    public static final String f = "-1";

    private C4538a2() {
    }

    @NotNull
    public final String a(boolean z) {
        if (!z) {
            return f;
        }
        return "fallback_" + System.currentTimeMillis();
    }

    public static /* synthetic */ String a(C4538a2 c4538a2, boolean z, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        return c4538a2.a(z, num);
    }

    @NotNull
    public final String a(boolean z, @Nullable Integer num) {
        if (z) {
            return ((num != null && num.intValue() == 1003) || (num != null && num.intValue() == 1008) || (num != null && num.intValue() == 1002)) ? c : ((num != null && num.intValue() == 1006) || (num != null && num.intValue() == 1001)) ? b : "other";
        }
        return e;
    }
}
