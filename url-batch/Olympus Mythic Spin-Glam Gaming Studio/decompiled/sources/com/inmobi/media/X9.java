package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class X9 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ Y9 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X9(Y9 y9, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = y9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(0, this);
    }
}
