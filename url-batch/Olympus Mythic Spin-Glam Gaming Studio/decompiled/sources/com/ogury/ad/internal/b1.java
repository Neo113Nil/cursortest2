package com.ogury.ad.internal;

import com.ironsource.Zf;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes10.dex */
public final /* synthetic */ class b1 extends FunctionReferenceImpl implements Function0 {
    public b1(Object obj) {
        super(0, obj, d1.class, Zf.j, "onAdLoaded()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        OguryListenerAdapter oguryListenerAdapter;
        d1 d1Var = (d1) this.receiver;
        o0 o0Var = d1Var.i;
        if (o0Var != null) {
            o0Var.a();
        }
        x0 x0Var = d1Var.j;
        if (x0Var != null) {
            x0Var.b();
        }
        if (d1Var.h == null && (oguryListenerAdapter = d1Var.e.a) != null) {
            oguryListenerAdapter.onAdNotLoaded();
        }
        o0 o0Var2 = d1Var.h;
        if (o0Var2 != null) {
            o0Var2.a(new c1(d1Var));
        }
        return Unit.INSTANCE;
    }
}
