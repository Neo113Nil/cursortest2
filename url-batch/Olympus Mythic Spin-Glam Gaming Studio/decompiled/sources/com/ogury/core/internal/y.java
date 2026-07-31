package com.ogury.core.internal;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
/* loaded from: classes4.dex */
public final class y extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ z c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, Continuation continuation) {
        super(continuation);
        this.c = zVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
