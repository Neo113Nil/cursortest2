package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;

/* loaded from: classes12.dex */
public final class Q0 extends ContinuationImpl {
    public Function1 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ S0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q0(S0 s0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = s0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((Function1) null, this);
    }
}
