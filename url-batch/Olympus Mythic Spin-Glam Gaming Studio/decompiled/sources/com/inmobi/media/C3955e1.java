package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.media.InteractionType;
import com.iab.omid.library.inmobi.adsession.media.MediaEvents;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.e1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C3955e1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ AbstractC3984f1 a;
    public final /* synthetic */ InteractionType b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3955e1(AbstractC3984f1 abstractC3984f1, InteractionType interactionType, Continuation continuation) {
        super(2, continuation);
        this.a = abstractC3984f1;
        this.b = interactionType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3955e1(this.a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3955e1(this.a, this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        MediaEvents mediaEvents = this.a.d;
        if (mediaEvents != null) {
            mediaEvents.adUserInteraction(this.b);
        }
        return Unit.INSTANCE;
    }
}
