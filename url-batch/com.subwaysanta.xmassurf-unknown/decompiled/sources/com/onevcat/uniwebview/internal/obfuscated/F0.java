package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class F0 extends Lambda implements Function1 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F0(String str, boolean z) {
        super(1);
        this.a = z;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C0031h0 it = (C0031h0) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        it.v.a(this.b, this.a);
        return Unit.INSTANCE;
    }
}
