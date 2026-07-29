package o;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class IO extends X {
    public static final Parcelable.Creator<IO> CREATOR = new J1(15);
    public final int h;
    public final boolean i;
    public final boolean j;
    public final int k;
    public final int l;

    public IO(int i, int i2, int i3, boolean z, boolean z2) {
        this.h = i;
        this.i = z;
        this.j = z2;
        this.k = i2;
        this.l = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = ZM.r(parcel, 20293);
        ZM.t(parcel, 1, 4);
        parcel.writeInt(this.h);
        ZM.t(parcel, 2, 4);
        parcel.writeInt(this.i ? 1 : 0);
        ZM.t(parcel, 3, 4);
        parcel.writeInt(this.j ? 1 : 0);
        ZM.t(parcel, 4, 4);
        parcel.writeInt(this.k);
        ZM.t(parcel, 5, 4);
        parcel.writeInt(this.l);
        ZM.s(parcel, r);
    }
}
