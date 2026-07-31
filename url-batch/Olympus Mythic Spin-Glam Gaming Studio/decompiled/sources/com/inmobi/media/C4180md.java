package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.md, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* synthetic */ class C4180md extends FunctionReferenceImpl implements Function2 {
    public C4180md(C4234od c4234od) {
        super(2, c4234od, C4234od.class, "transitionToFetchedState", "transitionToFetchedState(Lcom/inmobi/media/ads/context/AdComponent;Lcom/inmobi/media/ads/network/inmobiJson/model/InMobiJsonResponse;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C4456x p0 = (C4456x) obj;
        InMobiJsonResponse p1 = (InMobiJsonResponse) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        C4234od c4234od = (C4234od) this.receiver;
        C4493y9 c4493y9 = c4234od.e;
        if (c4493y9 != null) {
            c4493y9.a("AUM-NativeFetchingState", "transitionToFetchedState");
        }
        c4234od.r.a(new C4154ld(p0, p1, c4234od.p, c4234od.q, c4234od.r), c4234od);
        return Unit.INSTANCE;
    }
}
