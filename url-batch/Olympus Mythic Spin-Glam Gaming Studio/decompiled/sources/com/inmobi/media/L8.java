package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class L8 extends ContinuationImpl {
    public C4053hg a;
    public InterfaceC4421vg b;
    public /* synthetic */ Object c;
    public final /* synthetic */ N8 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L8(N8 n8, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = n8;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(null, this);
    }
}
