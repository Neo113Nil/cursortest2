package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class Jj extends ContinuationImpl {
    public String a;
    public C3897bk b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Mj d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Jj(Mj mj, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = mj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return Mj.a(this.d, null, null, this);
    }
}
