package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class Va extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ Xa b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Va(Xa xa, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = xa;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return Xa.a(this.b, this);
    }
}
