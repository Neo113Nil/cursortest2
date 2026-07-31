package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.mb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4178mb {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;
    public final String i;

    public C4178mb(long j, String impressionId, String placementType, String adType, String markupType, String creativeType, String metaDataBlob, boolean z, String landingScheme) {
        Intrinsics.checkNotNullParameter(impressionId, "impressionId");
        Intrinsics.checkNotNullParameter(placementType, "placementType");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(markupType, "markupType");
        Intrinsics.checkNotNullParameter(creativeType, "creativeType");
        Intrinsics.checkNotNullParameter(metaDataBlob, "metaDataBlob");
        Intrinsics.checkNotNullParameter(landingScheme, "landingScheme");
        this.a = j;
        this.b = impressionId;
        this.c = placementType;
        this.d = adType;
        this.e = markupType;
        this.f = creativeType;
        this.g = metaDataBlob;
        this.h = z;
        this.i = landingScheme;
    }
}
