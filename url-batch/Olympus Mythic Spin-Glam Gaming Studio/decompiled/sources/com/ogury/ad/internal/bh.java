package com.ogury.ad.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes10.dex */
public final class bh extends Lambda implements Function0 {
    public final /* synthetic */ ch a;
    public final /* synthetic */ w6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh(ch chVar, w6 w6Var) {
        super(0);
        this.a = chVar;
        this.b = w6Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        ch.a(this.a, this.b);
        return Unit.INSTANCE;
    }
}
