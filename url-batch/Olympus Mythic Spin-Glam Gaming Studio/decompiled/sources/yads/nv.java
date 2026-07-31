package yads;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class nv implements Parcelable {

    @NotNull
    public static final mv CREATOR = new mv();
    public final int b;
    public final String c;

    public nv(int i, String str) {
        this.b = i;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nv)) {
            return false;
        }
        nv nvVar = (nv) obj;
        return this.b == nvVar.b && Intrinsics.areEqual(this.c, nvVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "ClientSideReward(rewardAmount=" + this.b + ", rewardType=" + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
    }

    public nv(Parcel parcel) {
        int readInt = parcel.readInt();
        String readString = parcel.readString();
        Intrinsics.checkNotNull(readString);
        this.b = readInt;
        this.c = readString;
    }
}
