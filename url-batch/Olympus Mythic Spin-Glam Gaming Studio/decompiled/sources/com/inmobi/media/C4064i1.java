package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.i1, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4064i1 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ AbstractC4168m1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4064i1(AbstractC4168m1 abstractC4168m1, Continuation continuation) {
        super(2, continuation);
        this.b = abstractC4168m1;
    }

    public static final Unit a(AbstractC4168m1 abstractC4168m1, W w) {
        AbstractC4168m1.a(abstractC4168m1, w);
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4064i1(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4064i1(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        try {
            if (i != 0) {
                try {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                } catch (Throwable th) {
                    this.b.b((byte) 0);
                    throw th;
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C4508yo c4508yo = new C4508yo(this.b.H(), this.b.i);
                final AbstractC4168m1 abstractC4168m1 = this.b;
                Function1 function1 = new Function1() { // from class: com.inmobi.media.i1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return C4064i1.a(AbstractC4168m1.this, (W) obj2);
                    }
                };
                this.a = 1;
                obj = c4508yo.a(function1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            AdResponse adResponse = (AdResponse) obj;
            AbstractC4168m1 abstractC4168m12 = this.b;
            C4493y9 c4493y9 = abstractC4168m12.i;
            if (c4493y9 != null) {
                C4431w0 c4431w0 = abstractC4168m12.l;
                AbstractC3929d0.a(c4431w0.e, c4431w0.f, adResponse, c4493y9);
            }
            this.b.a(adResponse);
        } catch (Y e) {
            AbstractC4168m1.a(this.b, e);
        } catch (Throwable th2) {
            C4493y9 c4493y92 = this.b.i;
            if (c4493y92 != null) {
                Intrinsics.checkNotNullExpressionValue("m1", "<get-TAG>(...)");
                c4493y92.a("m1", "doAdLoadWork: " + th2);
            }
            Lazy lazy = AbstractC3861aa.a;
            AbstractC3861aa.a(new Q2(th2));
            AbstractC4168m1 abstractC4168m13 = this.b;
            abstractC4168m13.getClass();
            abstractC4168m13.b(MapsKt.mutableMapOf(TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2363)));
            abstractC4168m13.b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), (short) 0);
        }
        this.b.b((byte) 0);
        return Unit.INSTANCE;
    }
}
