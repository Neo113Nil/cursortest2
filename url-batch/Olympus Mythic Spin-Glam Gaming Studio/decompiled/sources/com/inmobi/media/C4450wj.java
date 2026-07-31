package com.inmobi.media;

import android.location.LocationManager;
import com.google.android.gms.common.api.GoogleApiClient;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.wj, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4450wj extends SuspendLambda implements Function1 {
    public C4450wj(Continuation continuation) {
        super(1, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C4450wj(continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C4450wj((Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Intrinsics.checkNotNullExpressionValue(AbstractC4477xj.b, "access$getTAG$p(...)");
        C4521zb c4521zb = C4521zb.a;
        if (C4521zb.d()) {
            LocationManager locationManager = C4521zb.b;
            if (locationManager != null) {
                locationManager.removeUpdates(c4521zb);
            }
            GoogleApiClient googleApiClient = C4521zb.d;
            if (googleApiClient != null) {
                googleApiClient.disconnect();
            }
        }
        C4521zb.d = null;
        return Unit.INSTANCE;
    }
}
