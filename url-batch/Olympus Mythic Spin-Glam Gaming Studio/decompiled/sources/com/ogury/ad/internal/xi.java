package com.ogury.ad.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class xi {
    public final boolean a;
    public final boolean b;
    public final String c;
    public boolean d;
    public boolean e;
    public boolean f;

    public xi(boolean z, boolean z2, String url, int i) {
        boolean z3 = (i & 8) == 0;
        Intrinsics.checkNotNullParameter(url, "url");
        this.a = z;
        this.b = z2;
        this.c = url;
        this.d = z3;
        this.e = false;
        this.f = false;
    }
}
