package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class Ql extends ContinuationImpl {
    public int a;
    public Xe b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Rl d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ql(Rl rl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = rl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
