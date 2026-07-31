package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdSession;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.c1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C3904c1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ AbstractC3984f1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3904c1(AbstractC3984f1 abstractC3984f1, Continuation continuation) {
        super(2, continuation);
        this.a = abstractC3984f1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3904c1(this.a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3904c1(this.a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        try {
            AdSession adSession = this.a.c;
            if (adSession != null) {
                adSession.start();
            }
        } catch (Exception e) {
            AbstractC3984f1 abstractC3984f1 = this.a;
            abstractC3984f1.c = null;
            InterfaceC4466x9 interfaceC4466x9 = abstractC3984f1.b;
            if (interfaceC4466x9 != null) {
                ((C4493y9) interfaceC4466x9).a(AbstractC3984f1.f, "AdSession start error " + e);
            }
        }
        return Unit.INSTANCE;
    }
}
