package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdEvents;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.m2, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4169m2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Pc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4169m2(Pc pc, Continuation continuation) {
        super(2, continuation);
        this.a = pc;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4169m2(this.a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4169m2(this.a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        AdEvents adEvents = this.a.e;
        if (adEvents != null) {
            adEvents.loaded();
        }
        return Unit.INSTANCE;
    }
}
