package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import o.C1307jZ;
import o.InterfaceC1373kZ;
import o.J1;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new J1(9);
    public final InterfaceC1373kZ h;

    public ParcelImpl(Parcel parcel) {
        this.h = new C1307jZ(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new C1307jZ(parcel).i(this.h);
    }
}
