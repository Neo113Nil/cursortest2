package com.inmobi.media;

import android.util.Log;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.AdSession;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes13.dex */
public final class Z0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ AbstractC3984f1 a;
    public final /* synthetic */ ViewGroup b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z0(AbstractC3984f1 abstractC3984f1, ViewGroup viewGroup, Continuation continuation) {
        super(2, continuation);
        this.a = abstractC3984f1;
        this.b = viewGroup;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Z0(this.a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Z0(this.a, this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        try {
            AdSession adSession = this.a.c;
            if (adSession != null) {
                adSession.registerAdView(this.b);
            }
        } catch (IllegalArgumentException e) {
            InterfaceC4466x9 interfaceC4466x9 = this.a.b;
            if (interfaceC4466x9 != null) {
                ((C4493y9) interfaceC4466x9).a(AbstractC3984f1.f, "Failed to registerAdView. " + Log.getStackTraceString(e));
            }
        }
        return Unit.INSTANCE;
    }
}
