package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdResponse;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* renamed from: com.inmobi.media.ub, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4389ub extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ C3850a b;
    public final /* synthetic */ AbstractC4416vb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4389ub(C3850a c3850a, AbstractC4416vb abstractC4416vb, Continuation continuation) {
        super(2, continuation);
        this.b = c3850a;
        this.c = abstractC4416vb;
    }

    public static final Unit a(AbstractC4416vb abstractC4416vb, W w) {
        abstractC4416vb.m.a(w);
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4389ub(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4389ub(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C3850a c3850a = this.b;
                final AbstractC4416vb abstractC4416vb = this.c;
                Function1 function1 = new Function1() { // from class: com.inmobi.media.ub$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return C4389ub.a(AbstractC4416vb.this, (W) obj2);
                    }
                };
                this.a = 1;
                obj = c3850a.a(function1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            AdResponse adResponse = (AdResponse) obj;
            this.c.a.getClass();
            AbstractC4416vb abstractC4416vb2 = this.c;
            AbstractC3929d0.a("native", abstractC4416vb2.d.h, adResponse, abstractC4416vb2.e);
            C4493y9 c4493y9 = this.c.e;
            if (c4493y9 != null) {
                c4493y9.a("AUM-LoadResponseState", "AdResponse Parse Success");
            }
            this.c.a(adResponse);
        } catch (Y e) {
            C4493y9 c4493y92 = this.c.e;
            if (c4493y92 != null) {
                c4493y92.b("AUM-LoadResponseState", "AdResponse Parse Failure " + e);
            }
            AbstractC4416vb abstractC4416vb3 = this.c;
            abstractC4416vb3.getClass();
            V v = e.b;
            if (v instanceof C4160lj) {
                C4167m0 c4167m0 = abstractC4416vb3.g;
                BuildersKt__Builders_commonKt.launch$default(c4167m0.a, null, null, new C4141l0(c4167m0, null), 3, null);
                abstractC4416vb3.a(MapsKt.mutableMapOf(TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, (short) 0)), e.a);
            } else if (v instanceof R6) {
                abstractC4416vb3.a(MapsKt.mutableMapOf(TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(((R6) v).a))), e.a);
            } else if (v instanceof S6) {
                abstractC4416vb3.a(MapsKt.mutableMapOf(TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf((short) ((S6) v).a))), e.a);
            } else {
                if (!(v instanceof C4108jj)) {
                    throw new NoWhenBranchMatchedException();
                }
                abstractC4416vb3.a(((C4108jj) v).a, e.a);
            }
        }
        return Unit.INSTANCE;
    }
}
