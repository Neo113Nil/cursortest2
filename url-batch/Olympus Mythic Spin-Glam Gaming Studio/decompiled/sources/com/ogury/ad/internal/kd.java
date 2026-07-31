package com.ogury.ad.internal;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class kd extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ ld c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kd(ld ldVar, Continuation continuation) {
        super(continuation);
        this.c = ldVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
