package com.inmobi.media;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;

/* loaded from: classes12.dex */
public final class L3 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;

    public L3(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return N3.a((Hh) null, (Function1) null, this);
    }
}
