package com.vungle.ads.internal;

import com.vungle.ads.internal.model.i3;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class z0 extends Lambda implements Function0 {
    public final /* synthetic */ b1 a;
    public final /* synthetic */ a1 b;
    public final /* synthetic */ com.vungle.ads.internal.model.h0 c;
    public final /* synthetic */ i3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(b1 b1Var, a1 a1Var, com.vungle.ads.internal.model.h0 h0Var, i3 i3Var) {
        super(0);
        this.a = b1Var;
        this.b = a1Var;
        this.c = h0Var;
        this.d = i3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        b1.a(this.a, this.b, this.c, this.d);
        return Unit.INSTANCE;
    }
}
