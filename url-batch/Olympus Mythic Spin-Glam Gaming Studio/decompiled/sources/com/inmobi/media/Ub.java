package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class Ub extends ContinuationImpl {
    public String a;
    public Db b;
    public Db c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Wb e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ub(Wb wb, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = wb;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.b(null, null, this);
    }
}
