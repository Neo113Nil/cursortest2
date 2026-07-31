package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* renamed from: com.inmobi.media.nd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* synthetic */ class C4207nd extends FunctionReferenceImpl implements Function1 {
    public C4207nd(C4234od c4234od) {
        super(1, c4234od, C4234od.class, "transitionToFetchFailedState", "transitionToFetchFailedState(S)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        short shortValue = ((Number) obj).shortValue();
        C4234od c4234od = (C4234od) this.receiver;
        c4234od.getClass();
        c4234od.a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), shortValue);
        return Unit.INSTANCE;
    }
}
