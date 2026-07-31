package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdSet;
import java.util.LinkedList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.s1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4326s1 {
    public final AbstractC4168m1 a;
    public final Gk b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public final C4299r1 j;

    public C4326s1(AbstractC4168m1 adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.a = adUnit;
        this.b = new Gk();
        this.j = new C4299r1(this);
    }

    public final String a() {
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        com.inmobi.media.ads.network.common.model.Ad ad;
        String telemetryMetadataBlob;
        AdSet s = this.a.s();
        return (s == null || (ads = s.getAds()) == null || (ad = (com.inmobi.media.ads.network.common.model.Ad) CollectionsKt.firstOrNull((List) ads)) == null || (telemetryMetadataBlob = ad.getTelemetryMetadataBlob()) == null) ? "" : telemetryMetadataBlob;
    }
}
