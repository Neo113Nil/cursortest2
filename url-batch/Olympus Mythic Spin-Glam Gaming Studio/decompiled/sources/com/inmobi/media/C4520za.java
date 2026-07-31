package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableDeferred;

/* renamed from: com.inmobi.media.za, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4520za extends SuspendLambda implements Function2 {
    public final /* synthetic */ Aa a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4520za(Aa aa, Continuation continuation) {
        super(2, continuation);
        this.a = aa;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4520za(this.a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4520za(this.a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        CompletableDeferred completableDeferred = this.a.e;
        Unit unit = Unit.INSTANCE;
        completableDeferred.complete(unit);
        return unit;
    }
}
