package com.inmobi.media;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.inmobi.media.lb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4152lb implements Parcelable {

    @NotNull
    public static final C4126kb CREATOR = new C4126kb();
    public final C4178mb a;
    public final String b;
    public final int c;
    public final long d;
    public int e;
    public String f;

    public C4152lb(C4178mb landingPageTelemetryMetaData, String urlType, int i, long j) {
        Intrinsics.checkNotNullParameter(landingPageTelemetryMetaData, "landingPageTelemetryMetaData");
        Intrinsics.checkNotNullParameter(urlType, "urlType");
        this.a = landingPageTelemetryMetaData;
        this.b = urlType;
        this.c = i;
        this.d = j;
        this.e = -1;
    }

    public static C4152lb a(C4152lb c4152lb) {
        C4178mb landingPageTelemetryMetaData = c4152lb.a;
        String urlType = c4152lb.b;
        int i = c4152lb.c;
        long j = c4152lb.d;
        Intrinsics.checkNotNullParameter(landingPageTelemetryMetaData, "landingPageTelemetryMetaData");
        Intrinsics.checkNotNullParameter(urlType, "urlType");
        return new C4152lb(landingPageTelemetryMetaData, urlType, i, j);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4152lb)) {
            return false;
        }
        C4152lb c4152lb = (C4152lb) obj;
        return Intrinsics.areEqual(this.a, c4152lb.a) && Intrinsics.areEqual(this.b, c4152lb.b) && this.c == c4152lb.c && this.d == c4152lb.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + Ai.a(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "LandingPageTelemetryControlInfo(landingPageTelemetryMetaData=" + this.a + ", urlType=" + this.b + ", counter=" + this.c + ", startTime=" + this.d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeLong(this.a.a);
        parcel.writeString(this.a.b);
        parcel.writeString(this.a.c);
        parcel.writeString(this.a.d);
        parcel.writeString(this.a.e);
        parcel.writeString(this.a.f);
        parcel.writeString(this.a.g);
        parcel.writeByte(this.a.h ? (byte) 1 : (byte) 0);
        parcel.writeString(this.a.i);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeLong(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
    }
}
