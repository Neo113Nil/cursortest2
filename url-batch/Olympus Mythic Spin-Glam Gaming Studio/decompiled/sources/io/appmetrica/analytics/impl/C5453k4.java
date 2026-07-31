package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.k4, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5453k4 {
    public final Rm a;
    public final W b;

    public C5453k4(Rm rm, W w) {
        this.a = rm;
        this.b = w;
    }

    public final C5427j4 a(HashMap hashMap) {
        C5783wm e = this.a.e();
        AdvertisingIdsHolder identifiers = this.b.getIdentifiers();
        return new C5427j4(C5427j4.a(e.d), C5427j4.a(e.a), C5427j4.a(e.b), C5427j4.a(e.j), C5427j4.a(e.i), C5427j4.a(Cb.a(Wm.a(e.k))), C5427j4.a(Cb.a(hashMap)), new IdentifiersResult(identifiers.getGoogle().mAdTrackingInfo == null ? null : identifiers.getGoogle().mAdTrackingInfo.advId, identifiers.getGoogle().mStatus, identifiers.getGoogle().mErrorExplanation), new IdentifiersResult(identifiers.getHuawei().mAdTrackingInfo == null ? null : identifiers.getHuawei().mAdTrackingInfo.advId, identifiers.getHuawei().mStatus, identifiers.getHuawei().mErrorExplanation), new IdentifiersResult(identifiers.getYandex().mAdTrackingInfo != null ? identifiers.getYandex().mAdTrackingInfo.advId : null, identifiers.getYandex().mStatus, identifiers.getYandex().mErrorExplanation), C5427j4.a(Cb.a(e.h)), AbstractC5215ao.a(), e.o + e.z.a, C5427j4.a(e.n.f), new Bundle());
    }
}
