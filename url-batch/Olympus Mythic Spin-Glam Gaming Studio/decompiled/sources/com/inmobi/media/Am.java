package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes11.dex */
public final class Am extends ContinuationImpl {
    public Nm a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Nm c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Am(Nm nm, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = nm;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
