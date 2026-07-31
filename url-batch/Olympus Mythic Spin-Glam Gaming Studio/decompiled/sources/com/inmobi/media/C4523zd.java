package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* renamed from: com.inmobi.media.zd, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4523zd extends FunctionReferenceImpl implements Function1 {
    public C4523zd(Ad ad) {
        super(1, ad, Ad.class, "transitionToFetchFailedState", "transitionToFetchFailedState(S)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        short shortValue = ((Number) obj).shortValue();
        Ad ad = (Ad) this.receiver;
        ad.getClass();
        ad.a(MapsKt.mutableMapOf(TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(shortValue))), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        return Unit.INSTANCE;
    }
}
