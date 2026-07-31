package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class ba implements Parcelable {

    @NotNull
    public static final aa CREATOR = new aa();
    public final String b;
    public final ArrayList c;
    public final String d;

    public ba(String str, String str2, ArrayList arrayList) {
        this.b = str;
        this.c = arrayList;
        this.d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba)) {
            return false;
        }
        ba baVar = (ba) obj;
        return Intrinsics.areEqual(this.b, baVar.b) && Intrinsics.areEqual(this.c, baVar.c) && Intrinsics.areEqual(this.d, baVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "AdUnitIdBiddingSettings(adUnitId=" + this.b + ", mediationNetworks=" + this.c + ", rawData=" + this.d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeTypedList(this.c);
        parcel.writeString(this.d);
    }

    public ba(Parcel parcel) {
        String readString = parcel.readString();
        Intrinsics.checkNotNull(readString);
        ArrayList createTypedArrayList = parcel.createTypedArrayList(er1.CREATOR);
        Intrinsics.checkNotNull(createTypedArrayList);
        String readString2 = parcel.readString();
        Intrinsics.checkNotNull(readString2);
        this.b = readString;
        this.c = createTypedArrayList;
        this.d = readString2;
    }
}
