package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class Od extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ Qd b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Od(Qd qd, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = qd;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
