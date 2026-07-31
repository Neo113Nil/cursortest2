package yads;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class oy2 implements Parcelable {

    @NotNull
    public static final ny2 CREATOR = new ny2();
    public final String b;

    public oy2(String str) {
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oy2) && Intrinsics.areEqual(this.b, ((oy2) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ServerSideReward(rewardUrl=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
    }

    public oy2(Parcel parcel) {
        String readString = parcel.readString();
        Intrinsics.checkNotNull(readString);
        this.b = readString;
    }
}
