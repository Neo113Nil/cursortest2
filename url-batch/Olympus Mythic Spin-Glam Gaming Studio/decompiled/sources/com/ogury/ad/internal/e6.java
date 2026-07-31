package com.ogury.ad.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes10.dex */
public final class e6 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ g6 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6(g6 g6Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = g6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
