package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes11.dex */
public final class Cf extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ Df b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cf(Df df, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = df;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, null, this);
    }
}
