package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q1;
import defpackage.sz0;
import defpackage.tz0;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new q1(2);
    public final tz0 d;

    public ParcelImpl(Parcel parcel) {
        this.d = new sz0(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new sz0(parcel).i(this.d);
    }
}
