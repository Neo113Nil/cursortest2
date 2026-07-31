package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class Dg extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ Fg b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dg(Fg fg, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = fg;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, null, this);
    }
}
