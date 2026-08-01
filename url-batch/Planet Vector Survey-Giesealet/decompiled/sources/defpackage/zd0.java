package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class zd0 extends it0 implements Parcelable, yr0, bt0, f70 {
    public static final Parcelable.Creator<zd0> CREATOR = new q1(4);
    public wr0 e;

    public zd0(int i) {
        or0 k = ur0.k();
        wr0 wr0Var = new wr0(k.g(), i);
        if (!(k instanceof jv)) {
            wr0Var.b = new wr0(1L, i);
        }
        this.e = wr0Var;
    }

    @Override // defpackage.ht0
    public final jt0 a() {
        return this.e;
    }

    @Override // defpackage.it0, defpackage.ht0
    public final jt0 b(jt0 jt0Var, jt0 jt0Var2, jt0 jt0Var3) {
        if (((wr0) jt0Var2).c == ((wr0) jt0Var3).c) {
            return jt0Var2;
        }
        return null;
    }

    @Override // defpackage.ht0
    public final void c(jt0 jt0Var) {
        jt0Var.getClass();
        this.e = (wr0) jt0Var;
    }

    @Override // defpackage.yr0
    public final b2 d() {
        return b2.M;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int g() {
        return ((wr0) ur0.u(this.e, this)).c;
    }

    @Override // defpackage.bt0
    public final Object getValue() {
        return Integer.valueOf(g());
    }

    public final void h(int i) {
        or0 k;
        wr0 wr0Var = (wr0) ur0.i(this.e);
        if (wr0Var.c != i) {
            wr0 wr0Var2 = this.e;
            synchronized (ur0.c) {
                k = ur0.k();
                ((wr0) ur0.p(wr0Var2, this, k, wr0Var)).c = i;
            }
            ur0.o(k, this);
        }
    }

    @Override // defpackage.f70
    public final void setValue(Object obj) {
        h(((Number) obj).intValue());
    }

    public final String toString() {
        return "MutableIntState(value=" + ((wr0) ur0.i(this.e)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(g());
    }
}
