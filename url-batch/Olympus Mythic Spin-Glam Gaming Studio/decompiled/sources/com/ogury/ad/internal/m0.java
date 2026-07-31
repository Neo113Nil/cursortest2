package com.ogury.ad.internal;

import com.ironsource.Zf;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class m0 extends FunctionReferenceImpl implements Function0 {
    public m0(o0 o0Var) {
        super(0, o0Var, o0.class, Zf.g, "onAdClosed()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        o0 o0Var = (o0) this.receiver;
        for (b bVar : o0Var.s) {
            s7 s7Var = o0Var.f;
            String adId = bVar.b;
            s7Var.getClass();
            Intrinsics.checkNotNullParameter(adId, "adId");
            s7.b.remove(adId);
        }
        o0Var.t = null;
        o0Var.v = null;
        return Unit.INSTANCE;
    }
}
