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

/* renamed from: com.inmobi.media.k1, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4116k1 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ byte[] b;
    public final /* synthetic */ AbstractC4168m1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4116k1(byte[] bArr, AbstractC4168m1 abstractC4168m1, Continuation continuation) {
        super(2, continuation);
        this.b = bArr;
        this.c = abstractC4168m1;
    }

    public static final Unit a(AbstractC4168m1 abstractC4168m1, W w) {
        AbstractC4168m1.a(abstractC4168m1, w);
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4116k1(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4116k1(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                byte[] bArr = this.b;
                AbstractC4168m1 abstractC4168m1 = this.c;
                C3850a c3850a = new C3850a(bArr, abstractC4168m1.l.a, abstractC4168m1.i);
                final AbstractC4168m1 abstractC4168m12 = this.c;
                Function1 function1 = new Function1() { // from class: com.inmobi.media.k1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return C4116k1.a(AbstractC4168m1.this, (W) obj2);
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
            AbstractC4168m1 abstractC4168m13 = this.c;
            C4493y9 c4493y9 = abstractC4168m13.i;
            if (c4493y9 != null) {
                C4431w0 c4431w0 = abstractC4168m13.l;
                AbstractC3929d0.a(c4431w0.e, c4431w0.f, adResponse, c4493y9);
            }
            this.c.a(adResponse);
        } catch (Y e) {
            AbstractC4168m1 abstractC4168m14 = this.c;
            V v = e.b;
            if (v instanceof C4108jj) {
                abstractC4168m14.b(((C4108jj) v).a);
            }
            abstractC4168m14.b(e.a, true, (short) 0);
        } catch (Throwable th) {
            C4493y9 c4493y92 = this.c.i;
            if (c4493y92 != null) {
                Intrinsics.checkNotNullExpressionValue("m1", "<get-TAG>(...)");
                c4493y92.a("m1", "doAdLoadWork: " + th);
            }
            Lazy lazy = AbstractC3861aa.a;
            AbstractC3861aa.a(new Q2(th));
            AbstractC4168m1 abstractC4168m15 = this.c;
            abstractC4168m15.getClass();
            abstractC4168m15.b(MapsKt.mutableMapOf(TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2363)));
            abstractC4168m15.b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), (short) 0);
        }
        return Unit.INSTANCE;
    }
}
