package com.inmobi.media;

import android.content.Context;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Fd extends SuspendLambda implements Function2 {
    public final /* synthetic */ Qd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fd(Qd qd, Continuation continuation) {
        super(2, continuation);
        this.a = qd;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Fd(this.a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Fd(this.a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        int i = AbstractC4499yf.a;
        Context applicationContext = this.a.a.a.b.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        return Boxing.boxBoolean(AbstractC4499yf.a(applicationContext));
    }
}
