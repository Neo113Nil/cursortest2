package com.ogury.ad.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class jb extends f5 {
    public final String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb(String name, String str) {
        super(name);
        Intrinsics.checkNotNullParameter(name, "name");
        this.b = str;
    }
}
