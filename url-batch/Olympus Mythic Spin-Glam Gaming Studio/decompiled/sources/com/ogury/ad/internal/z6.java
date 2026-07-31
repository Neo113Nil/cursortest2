package com.ogury.ad.internal;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class z6 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ a7 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6(a7 a7Var, Continuation continuation) {
        super(continuation);
        this.c = a7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
