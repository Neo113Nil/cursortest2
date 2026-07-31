package com.ogury.ad.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public class r7 {
    public final String a;
    public final String b;

    public r7(String adId, String name) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(name, "name");
        this.a = adId;
        this.b = name;
    }
}
