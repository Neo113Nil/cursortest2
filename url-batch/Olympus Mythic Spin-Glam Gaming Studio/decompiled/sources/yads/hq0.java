package yads;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class hq0 implements Parcelable {

    @NotNull
    public static final gq0 CREATOR = new gq0();
    public final String b;
    public final long c;

    public hq0(String str, long j) {
        this.b = str;
        this.c = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hq0)) {
            return false;
        }
        hq0 hq0Var = (hq0) obj;
        return Intrinsics.areEqual(this.b, hq0Var.b) && this.c == hq0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "FalseClick(url=" + this.b + ", interval=" + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
    }

    public hq0(Parcel parcel) {
        String readString = parcel.readString();
        Intrinsics.checkNotNull(readString);
        long readLong = parcel.readLong();
        this.b = readString;
        this.c = readLong;
    }
}
