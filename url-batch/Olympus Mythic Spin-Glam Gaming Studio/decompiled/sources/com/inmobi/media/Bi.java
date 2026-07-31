package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.InlineParams;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class Bi {
    public final C4431w0 a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;
    public final String g;
    public final boolean h;
    public final int i;
    public final C4299r1 j;
    public final Gi k;
    public final String l;
    public final InlineParams m;

    public Bi(C4431w0 placement, String markupType, String impressionId, String telemetryMetadataBlob, int i, String creativeType, String creativeId, boolean z, int i2, C4299r1 c4299r1, Gi gi, String str, InlineParams inlineParams) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(markupType, "markupType");
        Intrinsics.checkNotNullParameter(impressionId, "impressionId");
        Intrinsics.checkNotNullParameter(telemetryMetadataBlob, "telemetryMetadataBlob");
        Intrinsics.checkNotNullParameter(creativeType, "creativeType");
        Intrinsics.checkNotNullParameter(creativeId, "creativeId");
        this.a = placement;
        this.b = markupType;
        this.c = impressionId;
        this.d = telemetryMetadataBlob;
        this.e = i;
        this.f = creativeType;
        this.g = creativeId;
        this.h = z;
        this.i = i2;
        this.j = c4299r1;
        this.k = gi;
        this.l = str;
        this.m = inlineParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Bi)) {
            return false;
        }
        Bi bi = (Bi) obj;
        return Intrinsics.areEqual(this.a, bi.a) && Intrinsics.areEqual(this.b, bi.b) && Intrinsics.areEqual(this.c, bi.c) && Intrinsics.areEqual(this.d, bi.d) && this.e == bi.e && Intrinsics.areEqual(this.f, bi.f) && Intrinsics.areEqual(this.g, bi.g) && this.h == bi.h && this.i == bi.i && Intrinsics.areEqual(this.j, bi.j) && Intrinsics.areEqual(this.k, bi.k) && Intrinsics.areEqual(this.l, bi.l) && Intrinsics.areEqual(this.m, bi.m);
    }

    public final int hashCode() {
        int a = Ai.a(this.i, (Boolean.hashCode(this.h) + ((this.g.hashCode() + ((this.f.hashCode() + Ai.a(this.e, (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, 31)) * 31)) * 31)) * 31, 31);
        C4299r1 c4299r1 = this.j;
        int hashCode = (a + (c4299r1 == null ? 0 : c4299r1.hashCode())) * 31;
        Gi gi = this.k;
        int hashCode2 = (hashCode + (gi == null ? 0 : Integer.hashCode(gi.a))) * 31;
        String str = this.l;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        InlineParams inlineParams = this.m;
        return hashCode3 + (inlineParams != null ? inlineParams.hashCode() : 0);
    }

    public final String toString() {
        return "RenderViewMetaData(placement=" + this.a + ", markupType=" + this.b + ", impressionId=" + this.c + ", telemetryMetadataBlob=" + this.d + ", internetAvailabilityAdRetryCount=" + this.e + ", creativeType=" + this.f + ", creativeId=" + this.g + ", isRewarded=" + this.h + ", adIndex=" + this.i + ", adUnitTelemetryData=" + this.j + ", renderViewTelemetryData=" + this.k + ", renderViewId=" + this.l + ", inlineParams=" + this.m + ")";
    }
}
