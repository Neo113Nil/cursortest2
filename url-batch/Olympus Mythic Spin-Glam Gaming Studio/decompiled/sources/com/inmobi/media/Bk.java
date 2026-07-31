package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes11.dex */
public final class Bk extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ Ck b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bk(Ck ck, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = ck;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(0, this);
    }
}
