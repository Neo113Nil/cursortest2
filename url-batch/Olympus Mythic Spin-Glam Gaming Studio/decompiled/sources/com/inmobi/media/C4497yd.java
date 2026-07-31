package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.yd, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4497yd extends FunctionReferenceImpl implements Function2 {
    public C4497yd(Ad ad) {
        super(2, ad, Ad.class, "transitionToFetchedState", "transitionToFetchedState(Lcom/inmobi/media/ads/context/AdComponent;Lcom/inmobi/media/ads/network/inmobiJson/model/InMobiJsonResponse;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C4456x p0 = (C4456x) obj;
        InMobiJsonResponse p1 = (InMobiJsonResponse) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        Ad ad = (Ad) this.receiver;
        C4493y9 c4493y9 = ad.e;
        if (c4493y9 != null) {
            c4493y9.a("AUM-NativeLoadResponseState", "transitionToFetchedState - validation successful, transitioning to fetched state");
        }
        ad.r.a(new C4154ld(p0, p1, ad.p, ad.q, ad.r), ad);
        return Unit.INSTANCE;
    }
}
