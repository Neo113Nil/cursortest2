package yads;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class bs2 implements Parcelable {

    @NotNull
    public static final as2 CREATOR = new as2();
    public final Long b;

    public bs2(Long l) {
        this.b = l;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bs2) && Intrinsics.areEqual(this.b, ((bs2) obj).b);
    }

    public final int hashCode() {
        Long l = this.b;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public final String toString() {
        return "RewardedMediationConfiguration(rewardedDelay=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.b == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeLong(this.b.longValue());
        }
    }

    public bs2(Parcel parcel) {
        this.b = parcel.readByte() == 0 ? null : Long.valueOf(parcel.readLong());
    }
}
