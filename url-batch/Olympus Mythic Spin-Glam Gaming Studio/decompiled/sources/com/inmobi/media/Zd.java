package com.inmobi.media;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class Zd extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ C3865ae c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Zd(C3865ae c3865ae, Continuation continuation) {
        super(continuation);
        this.c = c3865ae;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
