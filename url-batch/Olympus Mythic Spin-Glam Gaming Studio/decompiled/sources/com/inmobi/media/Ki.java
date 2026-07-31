package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes12.dex */
public final class Ki extends SuspendLambda implements Function2 {
    public final /* synthetic */ Mi a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ki(Mi mi, Continuation continuation) {
        super(2, continuation);
        this.a = mi;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Ki(this.a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Ki(this.a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Mi mi = this.a;
        if (mi.a(mi.c.b)) {
            InterfaceC4466x9 l = this.a.l();
            if (l != null) {
                ((C4493y9) l).b("AUM-RenderedState", "onAdImpression callback blocked.");
            }
        } else {
            this.a.d.onAdImpression(null);
        }
        return Unit.INSTANCE;
    }
}
