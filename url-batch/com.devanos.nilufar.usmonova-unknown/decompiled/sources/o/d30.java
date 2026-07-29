package o;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class d30 extends X {
    public static final Parcelable.Creator<d30> CREATOR = new J1(20);
    public Bundle h;
    public C0300Ll[] i;
    public int j;
    public C0292Ld k;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = ZM.r(parcel, 20293);
        ZM.n(parcel, 1, this.h);
        ZM.q(parcel, 2, this.i, i);
        int i2 = this.j;
        ZM.t(parcel, 3, 4);
        parcel.writeInt(i2);
        ZM.o(parcel, 4, this.k, i);
        ZM.s(parcel, r);
    }
}
