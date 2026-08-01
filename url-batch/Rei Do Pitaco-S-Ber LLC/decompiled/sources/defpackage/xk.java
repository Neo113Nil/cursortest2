package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class xk implements Parcelable {
    public static final Parcelable.Creator<xk> CREATOR = new i1(10);
    public final String f;
    public final String g;
    public final boolean h;
    public final int i;
    public final int j;
    public final String k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final Bundle o;
    public final boolean p;
    public final int q;
    public Bundle r;

    public xk(Parcel parcel) {
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readInt() != 0;
        this.i = parcel.readInt();
        this.j = parcel.readInt();
        this.k = parcel.readString();
        this.l = parcel.readInt() != 0;
        this.m = parcel.readInt() != 0;
        this.n = parcel.readInt() != 0;
        this.o = parcel.readBundle();
        this.p = parcel.readInt() != 0;
        this.r = parcel.readBundle();
        this.q = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f);
        sb.append(" (");
        sb.append(this.g);
        sb.append(")}:");
        if (this.h) {
            sb.append(" fromLayout");
        }
        int i = this.j;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.k;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.l) {
            sb.append(" retainInstance");
        }
        if (this.m) {
            sb.append(" removing");
        }
        if (this.n) {
            sb.append(" detached");
        }
        if (this.p) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j);
        parcel.writeString(this.k);
        parcel.writeInt(this.l ? 1 : 0);
        parcel.writeInt(this.m ? 1 : 0);
        parcel.writeInt(this.n ? 1 : 0);
        parcel.writeBundle(this.o);
        parcel.writeInt(this.p ? 1 : 0);
        parcel.writeBundle(this.r);
        parcel.writeInt(this.q);
    }

    public xk(dk dkVar) {
        this.f = dkVar.getClass().getName();
        this.g = dkVar.j;
        this.h = dkVar.r;
        this.i = dkVar.A;
        this.j = dkVar.B;
        this.k = dkVar.C;
        this.l = dkVar.F;
        this.m = dkVar.q;
        this.n = dkVar.E;
        this.o = dkVar.k;
        this.p = dkVar.D;
        this.q = dkVar.Q.ordinal();
    }
}
