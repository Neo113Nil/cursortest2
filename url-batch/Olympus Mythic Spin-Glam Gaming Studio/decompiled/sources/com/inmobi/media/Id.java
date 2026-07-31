package com.inmobi.media;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class Id extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ Jd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Id(Jd jd, Continuation continuation) {
        super(continuation);
        this.c = jd;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
