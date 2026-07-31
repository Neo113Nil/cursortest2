package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public final class Zc {
    public final C3903c0 a;
    public final String b;
    public final String c;
    public String d;
    public int e;

    public Zc(C3903c0 adLifecycleData, String str, String str2, int i) {
        str = (i & 2) != 0 ? null : str;
        str2 = (i & 4) != 0 ? null : str2;
        Intrinsics.checkNotNullParameter(adLifecycleData, "adLifecycleData");
        this.a = adLifecycleData;
        this.b = str;
        this.c = str2;
        this.d = null;
        this.e = 0;
    }
}
