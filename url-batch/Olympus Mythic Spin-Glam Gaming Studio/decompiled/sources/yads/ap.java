package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class ap implements Parcelable {

    @NotNull
    public static final zo CREATOR = new zo();
    public final ArrayList b;
    public final vs1 c;

    public ap(ArrayList arrayList, vs1 vs1Var) {
        this.b = arrayList;
        this.c = vs1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ap)) {
            return false;
        }
        ap apVar = (ap) obj;
        return Intrinsics.areEqual(this.b, apVar.b) && Intrinsics.areEqual(this.c, apVar.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        vs1 vs1Var = this.c;
        return hashCode + (vs1Var == null ? 0 : vs1Var.hashCode());
    }

    public final String toString() {
        return "BiddingSettings(adUnitIdBiddingSettingsList=" + this.b + ", mediationPrefetchSettings=" + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.b);
        parcel.writeParcelable(this.c, i);
    }

    public ap(Parcel parcel) {
        ArrayList createTypedArrayList = parcel.createTypedArrayList(ba.CREATOR);
        Intrinsics.checkNotNull(createTypedArrayList);
        vs1 vs1Var = (vs1) parcel.readParcelable(vs1.class.getClassLoader());
        this.b = createTypedArrayList;
        this.c = vs1Var;
    }
}
