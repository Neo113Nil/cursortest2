package yads;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes14.dex */
public final class sq2 implements Parcelable {

    @NotNull
    public static final qq2 CREATOR = new qq2();
    public final boolean b;
    public final nv c;
    public final oy2 d;

    public sq2(boolean z, nv nvVar, oy2 oy2Var) {
        this.b = z;
        this.c = nvVar;
        this.d = oy2Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sq2)) {
            return false;
        }
        sq2 sq2Var = (sq2) obj;
        return this.b == sq2Var.b && Intrinsics.areEqual(this.c, sq2Var.c) && Intrinsics.areEqual(this.d, sq2Var.d);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.b) * 31;
        nv nvVar = this.c;
        int hashCode2 = (hashCode + (nvVar == null ? 0 : nvVar.hashCode())) * 31;
        oy2 oy2Var = this.d;
        return hashCode2 + (oy2Var != null ? oy2Var.b.hashCode() : 0);
    }

    public final String toString() {
        return "RewardData(serverSideRewardType=" + this.b + ", clientSideReward=" + this.c + ", serverSideReward=" + this.d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
    }

    public sq2(Parcel parcel) {
        boolean z = parcel.readByte() != 0;
        nv nvVar = (nv) parcel.readParcelable(nv.class.getClassLoader());
        oy2 oy2Var = (oy2) parcel.readParcelable(oy2.class.getClassLoader());
        this.b = z;
        this.c = nvVar;
        this.d = oy2Var;
    }
}
