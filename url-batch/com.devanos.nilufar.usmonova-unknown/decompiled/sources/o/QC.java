package o;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class QC extends X {
    public static final Parcelable.Creator<QC> CREATOR = new J1(12);
    public final int h;
    public final int i;
    public final int j;
    public final long k;
    public final long l;
    public final String m;
    public final String n;

    /* renamed from: o, reason: collision with root package name */
    public final int f89o;
    public final int p;

    public QC(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.h = i;
        this.i = i2;
        this.j = i3;
        this.k = j;
        this.l = j2;
        this.m = str;
        this.n = str2;
        this.f89o = i4;
        this.p = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = ZM.r(parcel, 20293);
        ZM.t(parcel, 1, 4);
        parcel.writeInt(this.h);
        ZM.t(parcel, 2, 4);
        parcel.writeInt(this.i);
        ZM.t(parcel, 3, 4);
        parcel.writeInt(this.j);
        ZM.t(parcel, 4, 8);
        parcel.writeLong(this.k);
        ZM.t(parcel, 5, 8);
        parcel.writeLong(this.l);
        ZM.p(parcel, 6, this.m);
        ZM.p(parcel, 7, this.n);
        ZM.t(parcel, 8, 4);
        parcel.writeInt(this.f89o);
        ZM.t(parcel, 9, 4);
        parcel.writeInt(this.p);
        ZM.s(parcel, r);
    }
}
