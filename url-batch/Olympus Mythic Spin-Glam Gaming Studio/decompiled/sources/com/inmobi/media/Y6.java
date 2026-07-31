package com.inmobi.media;

import android.os.SystemClock;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ads.network.common.model.AdResponse;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;

/* loaded from: classes13.dex */
public final class Y6 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ Z6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y6(Z6 z6, Continuation continuation) {
        super(2, continuation);
        this.b = z6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Y6(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Y6(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C3903c0 c3903c0 = this.b.f;
                c3903c0.getClass();
                c3903c0.c = SystemClock.elapsedRealtime();
                Integer num = this.b.m.d;
                long intValue = num != null ? num.intValue() : 15000;
                X6 x6 = new X6(this.b, null);
                this.a = 1;
                obj = TimeoutKt.withTimeout(intValue, x6, this);
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
            this.b.a.getClass();
            Z6 z6 = this.b;
            AbstractC3929d0.a("native", z6.d.h, adResponse, z6.e);
            C4493y9 c4493y9 = this.b.e;
            if (c4493y9 != null) {
                c4493y9.a("AUM-FetchingState", "AdResponse Parse Success");
            }
            this.b.a(adResponse);
        } catch (Y e) {
            C4493y9 c4493y92 = this.b.e;
            if (c4493y92 != null) {
                c4493y92.b("AUM-FetchingState", "AdResponse Parse Failure " + e);
            }
            this.b.a(e);
        } catch (TimeoutCancellationException unused) {
            C4493y9 c4493y93 = this.b.e;
            if (c4493y93 != null) {
                c4493y93.b("AUM-FetchingState", "Ad fetch timed out");
            }
            this.b.a(new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT), new R6((short) 2138)));
        }
        return Unit.INSTANCE;
    }
}
