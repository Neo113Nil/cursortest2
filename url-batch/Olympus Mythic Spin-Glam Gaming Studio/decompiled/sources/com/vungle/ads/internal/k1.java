package com.vungle.ads.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class k1 extends Lambda implements Function0 {
    public final /* synthetic */ r1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(r1 r1Var) {
        super(0);
        this.a = r1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        com.vungle.ads.internal.util.p pVar = com.vungle.ads.internal.util.p.b;
        pVar.a(((com.vungle.ads.internal.executor.d) r1.a(this.a)).a);
        return pVar;
    }
}
