package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class Tb extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ Wb b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tb(Wb wb, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = wb;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, null, this);
    }
}
