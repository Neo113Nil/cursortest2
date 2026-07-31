package com.ogury.ad.internal;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class ic extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ jc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic(jc jcVar, Continuation continuation) {
        super(continuation);
        this.c = jcVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
