package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.q1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0068q1 extends Lambda implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0068q1(int i, int i2, boolean z) {
        super(1);
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C0031h0 it = (C0031h0) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        it.v.a(this.a, this.b, this.c);
        return Unit.INSTANCE;
    }
}
