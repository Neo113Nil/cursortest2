package com.inmobi.media;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.n0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4194n0 {
    public final String a;
    public final Map b;
    public final long c;
    public final String d;
    public final String e;
    public final Map f;
    public final String g;
    public final boolean h;

    public C4194n0(String clientRequestId, Map map, long j, String monetizationContext, String str, Map map2, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(clientRequestId, "clientRequestId");
        Intrinsics.checkNotNullParameter("im", "integrationTypeString");
        Intrinsics.checkNotNullParameter(monetizationContext, "monetizationContext");
        Intrinsics.checkNotNullParameter("unifiedSdkJson", "adFormat");
        this.a = clientRequestId;
        this.b = map;
        this.c = j;
        this.d = monetizationContext;
        this.e = str;
        this.f = map2;
        this.g = str2;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4194n0)) {
            return false;
        }
        C4194n0 c4194n0 = (C4194n0) obj;
        return Intrinsics.areEqual(this.a, c4194n0.a) && Intrinsics.areEqual("im", "im") && Intrinsics.areEqual(this.b, c4194n0.b) && this.c == c4194n0.c && Intrinsics.areEqual(this.d, c4194n0.d) && Intrinsics.areEqual(this.e, c4194n0.e) && Intrinsics.areEqual("unifiedSdkJson", "unifiedSdkJson") && Intrinsics.areEqual(this.f, c4194n0.f) && Intrinsics.areEqual(this.g, c4194n0.g) && this.h == c4194n0.h && Intrinsics.areEqual((Object) null, (Object) null);
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + 3364) * 31;
        Map map = this.b;
        int hashCode2 = (this.d.hashCode() + ((Long.hashCode(this.c) + ((hashCode + (map == null ? 0 : map.hashCode())) * 31)) * 31)) * 31;
        String str = this.e;
        int hashCode3 = (((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + 1309392464) * 31;
        Map map2 = this.f;
        int hashCode4 = (hashCode3 + (map2 == null ? 0 : map2.hashCode())) * 31;
        String str2 = this.g;
        return (Boolean.hashCode(this.h) + ((hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31;
    }

    public final String toString() {
        return "AdMetaData(clientRequestId=" + this.a + ", integrationTypeString=im, extras=" + this.b + ", imPlacementId=" + this.c + ", monetizationContext=" + this.d + ", adType=" + this.e + ", adFormat=unifiedSdkJson, adSpecificRequestParams=" + this.f + ", keywords=" + this.g + ", isApplicationMutedByPub=" + this.h + ", extraInfo=" + ((Object) null) + ")";
    }
}
