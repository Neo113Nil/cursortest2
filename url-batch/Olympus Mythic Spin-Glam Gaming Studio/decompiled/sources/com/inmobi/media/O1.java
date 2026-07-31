package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes11.dex */
public final class O1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ Q1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O1(Q1 q1, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = q1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return Q1.a(this.b, null, null, this);
    }
}
