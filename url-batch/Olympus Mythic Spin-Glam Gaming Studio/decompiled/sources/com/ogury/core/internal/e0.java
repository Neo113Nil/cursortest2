package com.ogury.core.internal;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
/* loaded from: classes5.dex */
public final class e0 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ f0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(f0 f0Var, Continuation continuation) {
        super(continuation);
        this.c = f0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
