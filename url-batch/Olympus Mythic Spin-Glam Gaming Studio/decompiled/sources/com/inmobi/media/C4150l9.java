package com.inmobi.media;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;

/* renamed from: com.inmobi.media.l9, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4150l9 extends ContinuationImpl {
    public Function1 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C4308r9 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4150l9(C4308r9 c4308r9, Continuation continuation) {
        super(continuation);
        this.c = c4308r9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((Function1) null, this);
    }
}
