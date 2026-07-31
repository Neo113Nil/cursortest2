package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.t0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4352t0 {
    public final C4326s1 a;
    public final String b;
    public final Boolean c;
    public final String d;
    public final byte e;
    public final String f;

    public C4352t0(C4326s1 adUnitTelemetry, String str, Boolean bool, String str2, byte b, String str3) {
        Intrinsics.checkNotNullParameter(adUnitTelemetry, "adUnitTelemetry");
        this.a = adUnitTelemetry;
        this.b = str;
        this.c = bool;
        this.d = str2;
        this.e = b;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4352t0)) {
            return false;
        }
        C4352t0 c4352t0 = (C4352t0) obj;
        return Intrinsics.areEqual(this.a, c4352t0.a) && Intrinsics.areEqual(this.b, c4352t0.b) && Intrinsics.areEqual(this.c, c4352t0.c) && Intrinsics.areEqual(this.d, c4352t0.d) && this.e == c4352t0.e && Intrinsics.areEqual(this.f, c4352t0.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.c;
        int hashCode3 = (Byte.hashCode(this.e) + ((this.d.hashCode() + ((hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31)) * 31)) * 31;
        String str2 = this.f;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        C4326s1 c4326s1 = this.a;
        String str = this.b;
        Boolean bool = this.c;
        String str2 = this.d;
        byte b = this.e;
        return "AdNotReadyMetadata(adUnitTelemetry=" + c4326s1 + ", creativeType=" + str + ", isRewarded=" + bool + ", markupType=" + str2 + ", adState=" + ((int) b) + ", impressionId=" + this.f + ")";
    }
}
