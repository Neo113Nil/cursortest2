package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.i1;
import defpackage.o70;
import defpackage.p70;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new i1(16);
    public final p70 f;

    public ParcelImpl(Parcel parcel) {
        this.f = new o70(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new o70(parcel).i(this.f);
    }
}
