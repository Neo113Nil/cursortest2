package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class a7 implements Parcelable {
    public static final Parcelable.Creator<a7> CREATOR = new i1(5);
    public Integer A;
    public Integer B;
    public Integer C;
    public Integer D;
    public Integer E;
    public Integer F;
    public Integer G;
    public Integer H;
    public Boolean I;
    public Integer J;
    public int f;
    public Integer g;
    public Integer h;
    public Integer i;
    public Integer j;
    public Integer k;
    public Integer l;
    public Integer m;
    public int n;
    public String o;
    public int p;
    public int q;
    public int r;
    public Locale s;
    public CharSequence t;
    public CharSequence u;
    public int v;
    public int w;
    public Integer x;
    public Boolean y;
    public Integer z;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f);
        parcel.writeSerializable(this.g);
        parcel.writeSerializable(this.h);
        parcel.writeSerializable(this.i);
        parcel.writeSerializable(this.j);
        parcel.writeSerializable(this.k);
        parcel.writeSerializable(this.l);
        parcel.writeSerializable(this.m);
        parcel.writeInt(this.n);
        parcel.writeString(this.o);
        parcel.writeInt(this.p);
        parcel.writeInt(this.q);
        parcel.writeInt(this.r);
        CharSequence charSequence = this.t;
        parcel.writeString(charSequence != null ? charSequence.toString() : null);
        CharSequence charSequence2 = this.u;
        parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
        parcel.writeInt(this.v);
        parcel.writeSerializable(this.x);
        parcel.writeSerializable(this.z);
        parcel.writeSerializable(this.A);
        parcel.writeSerializable(this.B);
        parcel.writeSerializable(this.C);
        parcel.writeSerializable(this.D);
        parcel.writeSerializable(this.E);
        parcel.writeSerializable(this.H);
        parcel.writeSerializable(this.F);
        parcel.writeSerializable(this.G);
        parcel.writeSerializable(this.y);
        parcel.writeSerializable(this.s);
        parcel.writeSerializable(this.I);
        parcel.writeSerializable(this.J);
    }
}
