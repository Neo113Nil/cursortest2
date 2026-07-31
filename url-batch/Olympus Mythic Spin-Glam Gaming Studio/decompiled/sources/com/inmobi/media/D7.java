package com.inmobi.media;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes11.dex */
public final class D7 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ E7 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D7(E7 e7, Continuation continuation) {
        super(continuation);
        this.c = e7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
