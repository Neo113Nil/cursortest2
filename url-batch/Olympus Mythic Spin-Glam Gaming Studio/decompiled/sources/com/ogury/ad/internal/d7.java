package com.ogury.ad.internal;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes10.dex */
public final class d7 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ e7 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7(e7 e7Var, Continuation continuation) {
        super(continuation);
        this.c = e7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
