package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes11.dex */
public final class Lg extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ Ng b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Lg(Ng ng, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = ng;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return Ng.a(this.b, this);
    }
}
