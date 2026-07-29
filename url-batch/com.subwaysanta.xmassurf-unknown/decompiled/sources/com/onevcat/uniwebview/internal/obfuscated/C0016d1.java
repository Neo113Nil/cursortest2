package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.d1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0016d1 extends Lambda implements Function1 {
    public static final C0016d1 a = new C0016d1();

    public C0016d1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C0031h0 it = (C0031h0) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        it.v.c();
        return Unit.INSTANCE;
    }
}
