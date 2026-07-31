package yads;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class ds2 implements Parcelable {

    @NotNull
    public static final cs2 CREATOR = new cs2();
    public final rq1 b;
    public final bs2 c;

    public ds2(rq1 rq1Var, bs2 bs2Var) {
        this.b = rq1Var;
        this.c = bs2Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ds2)) {
            return false;
        }
        ds2 ds2Var = (ds2) obj;
        return this.b == ds2Var.b && Intrinsics.areEqual(this.c, ds2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "RewardedMediationParameters(bridgeAdType=" + this.b + ", configuration=" + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b.name());
        parcel.writeParcelable(this.c, i);
    }

    public ds2(Parcel parcel) {
        String readString = parcel.readString();
        Intrinsics.checkNotNull(readString);
        rq1 valueOf = rq1.valueOf(readString);
        Parcelable readParcelable = parcel.readParcelable(bs2.class.getClassLoader());
        Intrinsics.checkNotNull(readParcelable);
        this.b = valueOf;
        this.c = (bs2) readParcelable;
    }
}
