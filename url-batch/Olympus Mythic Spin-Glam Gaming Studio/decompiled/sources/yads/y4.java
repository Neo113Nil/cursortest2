package yads;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;

@Serializable
/* loaded from: classes4.dex */
public final class y4 implements Parcelable {

    @NotNull
    public static final x4 CREATOR = new x4();
    public final String b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y4) && Intrinsics.areEqual(this.b, ((y4) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "AdImpressionData(rawData=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
    }

    public y4(String str) {
        this.b = str;
    }

    public y4(Parcel parcel) {
        String readString = parcel.readString();
        Intrinsics.checkNotNull(readString);
        this.b = readString;
    }
}
