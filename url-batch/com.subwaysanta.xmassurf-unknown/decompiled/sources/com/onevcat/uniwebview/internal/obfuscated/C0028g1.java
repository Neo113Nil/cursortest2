package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.g1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0028g1 extends Lambda implements Function1 {
    public static final C0028g1 a = new C0028g1();

    public C0028g1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C0031h0 it = (C0031h0) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        it.v.reload();
        return Unit.INSTANCE;
    }
}
