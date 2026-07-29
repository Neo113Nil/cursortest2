package o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.Ld, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0292Ld extends X {
    public static final Parcelable.Creator<C0292Ld> CREATOR = new J1(21);
    public final IO h;
    public final boolean i;
    public final boolean j;
    public final int[] k;
    public final int l;
    public final int[] m;

    public C0292Ld(IO io2, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.h = io2;
        this.i = z;
        this.j = z2;
        this.k = iArr;
        this.l = i;
        this.m = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = ZM.r(parcel, 20293);
        ZM.o(parcel, 1, this.h, i);
        ZM.t(parcel, 2, 4);
        parcel.writeInt(this.i ? 1 : 0);
        ZM.t(parcel, 3, 4);
        parcel.writeInt(this.j ? 1 : 0);
        int[] iArr = this.k;
        if (iArr != null) {
            int r2 = ZM.r(parcel, 4);
            parcel.writeIntArray(iArr);
            ZM.s(parcel, r2);
        }
        ZM.t(parcel, 5, 4);
        parcel.writeInt(this.l);
        int[] iArr2 = this.m;
        if (iArr2 != null) {
            int r3 = ZM.r(parcel, 6);
            parcel.writeIntArray(iArr2);
            ZM.s(parcel, r3);
        }
        ZM.s(parcel, r);
    }
}
