package com.inmobi.media;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class Jh extends ContinuationImpl {
    public AbstractC4461x4 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Kh c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Jh(Kh kh, Continuation continuation) {
        super(continuation);
        this.c = kh;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
