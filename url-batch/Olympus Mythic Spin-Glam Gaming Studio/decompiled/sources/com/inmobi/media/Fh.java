package com.inmobi.media;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes10.dex */
public final class Fh extends ContinuationImpl {
    public CoroutineContext a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Hh c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fh(Hh hh, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = hh;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
