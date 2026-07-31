package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdEvents;
import com.iab.omid.library.inmobi.adsession.media.VastProperties;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.z2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4512z2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ C2 a;
    public final /* synthetic */ VastProperties b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4512z2(C2 c2, VastProperties vastProperties, Continuation continuation) {
        super(2, continuation);
        this.a = c2;
        this.b = vastProperties;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4512z2(this.a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4512z2(this.a, this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        AdEvents adEvents = this.a.e;
        if (adEvents != null) {
            adEvents.loaded(this.b);
        }
        return Unit.INSTANCE;
    }
}
