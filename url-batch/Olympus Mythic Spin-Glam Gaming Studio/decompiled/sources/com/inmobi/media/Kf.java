package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class Kf extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ Mf b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Kf(Mf mf, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = mf;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return Mf.a(this.b, this);
    }
}
