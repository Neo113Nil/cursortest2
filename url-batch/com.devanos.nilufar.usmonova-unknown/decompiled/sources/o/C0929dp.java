package o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.dp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0929dp implements Parcelable {
    public static final Parcelable.Creator<C0929dp> CREATOR = new J1(6);
    public final String h;
    public final String i;
    public final boolean j;
    public final int k;
    public final int l;
    public final String m;
    public final boolean n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f158o;
    public final boolean p;
    public final boolean q;
    public final int r;
    public final String s;
    public final int t;
    public final boolean u;

    public C0929dp(AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co) {
        this.h = abstractComponentCallbacksC0069Co.getClass().getName();
        this.i = abstractComponentCallbacksC0069Co.l;
        this.j = abstractComponentCallbacksC0069Co.u;
        this.k = abstractComponentCallbacksC0069Co.D;
        this.l = abstractComponentCallbacksC0069Co.E;
        this.m = abstractComponentCallbacksC0069Co.F;
        this.n = abstractComponentCallbacksC0069Co.I;
        this.f158o = abstractComponentCallbacksC0069Co.s;
        this.p = abstractComponentCallbacksC0069Co.H;
        this.q = abstractComponentCallbacksC0069Co.G;
        this.r = abstractComponentCallbacksC0069Co.S.ordinal();
        this.s = abstractComponentCallbacksC0069Co.f25o;
        this.t = abstractComponentCallbacksC0069Co.p;
        this.u = abstractComponentCallbacksC0069Co.N;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.h);
        sb.append(" (");
        sb.append(this.i);
        sb.append(")}:");
        if (this.j) {
            sb.append(" fromLayout");
        }
        int i = this.l;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.m;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.n) {
            sb.append(" retainInstance");
        }
        if (this.f158o) {
            sb.append(" removing");
        }
        if (this.p) {
            sb.append(" detached");
        }
        if (this.q) {
            sb.append(" hidden");
        }
        String str2 = this.s;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.t);
        }
        if (this.u) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.k);
        parcel.writeInt(this.l);
        parcel.writeString(this.m);
        parcel.writeInt(this.n ? 1 : 0);
        parcel.writeInt(this.f158o ? 1 : 0);
        parcel.writeInt(this.p ? 1 : 0);
        parcel.writeInt(this.q ? 1 : 0);
        parcel.writeInt(this.r);
        parcel.writeString(this.s);
        parcel.writeInt(this.t);
        parcel.writeInt(this.u ? 1 : 0);
    }

    public C0929dp(Parcel parcel) {
        this.h = parcel.readString();
        this.i = parcel.readString();
        this.j = parcel.readInt() != 0;
        this.k = parcel.readInt();
        this.l = parcel.readInt();
        this.m = parcel.readString();
        this.n = parcel.readInt() != 0;
        this.f158o = parcel.readInt() != 0;
        this.p = parcel.readInt() != 0;
        this.q = parcel.readInt() != 0;
        this.r = parcel.readInt();
        this.s = parcel.readString();
        this.t = parcel.readInt();
        this.u = parcel.readInt() != 0;
    }
}
