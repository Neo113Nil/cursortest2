package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ae0 extends it0 implements Parcelable, yr0, bt0, f70 {
    public static final Parcelable.Creator<ae0> CREATOR = new q1(5);
    public xr0 e;

    public ae0(long j) {
        or0 k = ur0.k();
        xr0 xr0Var = new xr0(k.g(), j);
        if (!(k instanceof jv)) {
            xr0Var.b = new xr0(1L, j);
        }
        this.e = xr0Var;
    }

    @Override // defpackage.ht0
    public final jt0 a() {
        return this.e;
    }

    @Override // defpackage.it0, defpackage.ht0
    public final jt0 b(jt0 jt0Var, jt0 jt0Var2, jt0 jt0Var3) {
        if (((xr0) jt0Var2).c == ((xr0) jt0Var3).c) {
            return jt0Var2;
        }
        return null;
    }

    @Override // defpackage.ht0
    public final void c(jt0 jt0Var) {
        jt0Var.getClass();
        this.e = (xr0) jt0Var;
    }

    @Override // defpackage.yr0
    public final b2 d() {
        return b2.M;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long g() {
        return ((xr0) ur0.u(this.e, this)).c;
    }

    @Override // defpackage.bt0
    public final Object getValue() {
        return Long.valueOf(g());
    }

    public final void h(long j) {
        or0 k;
        xr0 xr0Var = (xr0) ur0.i(this.e);
        if (xr0Var.c != j) {
            xr0 xr0Var2 = this.e;
            synchronized (ur0.c) {
                k = ur0.k();
                ((xr0) ur0.p(xr0Var2, this, k, xr0Var)).c = j;
            }
            ur0.o(k, this);
        }
    }

    @Override // defpackage.f70
    public final void setValue(Object obj) {
        h(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((xr0) ur0.i(this.e)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(g());
    }
}
