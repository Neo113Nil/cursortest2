package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class Sa extends ContinuationImpl {
    public C3887ba a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Xa c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Sa(Xa xa, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = xa;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return Xa.a(this.c, null, this);
    }
}
