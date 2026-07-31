package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes10.dex */
public final class H0 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ I0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H0(I0 i0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = i0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
