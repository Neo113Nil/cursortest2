package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class K8 extends ContinuationImpl {
    public C4053hg a;
    public /* synthetic */ Object b;
    public final /* synthetic */ N8 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K8(N8 n8, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = n8;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((C4053hg) null, this);
    }
}
