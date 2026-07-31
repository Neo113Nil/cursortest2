package com.ogury.ad.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
public final class vf extends Lambda implements Function0 {
    public final /* synthetic */ og a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vf(og ogVar) {
        super(0);
        this.a = ogVar;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        this.a.c.getClass();
        return System.getProperty("os.arch");
    }
}
