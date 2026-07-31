package com.ogury.ad.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class th extends f5 {
    public final b b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public th(String name, b ad) {
        super(name);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.b = ad;
    }
}
