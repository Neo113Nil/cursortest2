package com.inmobi.media;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.inmobi.media.w0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4431w0 implements Parcelable {
    public final long a;
    public final String b;
    public Map c;
    public String d;
    public final String e;
    public final String f;
    public String g;
    public String h;
    public String i;
    public boolean j;
    public String k;
    public boolean l;
    public String m;
    public static final Set n = SetsKt.setOf((Object[]) new String[]{"c_applovin", "c_applovincustom"});

    @NotNull
    public static final Parcelable.Creator<C4431w0> CREATOR = new C4405v0();

    public C4431w0(long j, String str, String str2, String str3) {
        this.h = "";
        this.i = "";
        this.k = "activity";
        this.a = j;
        this.e = str2;
        this.b = str;
        this.f = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4431w0)) {
            return false;
        }
        C4431w0 c4431w0 = (C4431w0) obj;
        return this.a == c4431w0.a && Intrinsics.areEqual(this.k, c4431w0.k) && Intrinsics.areEqual(this.b, c4431w0.b) && Intrinsics.areEqual(this.e, c4431w0.e);
    }

    public final int hashCode() {
        long j = this.a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.e;
        return this.k.hashCode() + ((i + (str != null ? str.hashCode() : 0)) * 30);
    }

    public final String toString() {
        return String.valueOf(this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.a);
        dest.writeString(this.k);
        dest.writeString(this.e);
    }

    public C4431w0(Parcel parcel) {
        this.h = "";
        this.i = "";
        String str = "activity";
        this.k = "activity";
        this.a = parcel.readLong();
        String readString = parcel.readString();
        if (readString != null && !Intrinsics.areEqual(readString, "activity") && Intrinsics.areEqual(readString, "others")) {
            str = "others";
        }
        this.k = str;
        this.e = parcel.readString();
    }
}
