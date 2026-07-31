package com.ogury.ad.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes10.dex */
public final /* synthetic */ class e0 extends FunctionReferenceImpl implements Function0 {
    public e0(Object obj) {
        super(0, obj, o0.class, "getProfigAndSyncIfNeeded", "getProfigAndSyncIfNeeded()Lcom/ogury/ad/common/profig/data/ProfigResponse;", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        o0 o0Var = (o0) this.receiver;
        pf b = o0Var.c.b();
        if (b.a && !o0Var.c.a()) {
            return b;
        }
        o0Var.b("Configuration need to be synced");
        return o0Var.c.a(true);
    }
}
