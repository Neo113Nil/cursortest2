package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes11.dex */
public final class D4 extends ContinuationImpl {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ F4 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D4(F4 f4, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = f4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, null, null, this);
    }
}
