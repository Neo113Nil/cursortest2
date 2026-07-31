package com.ogury.ad.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes10.dex */
public final class c6 extends ContinuationImpl {
    public g6 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ g6 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6(g6 g6Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = g6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
