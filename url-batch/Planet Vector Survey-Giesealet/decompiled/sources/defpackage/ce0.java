package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ce0 extends it0 implements Parcelable, yr0 {
    public static final Parcelable.Creator<ce0> CREATOR = new be0();
    public final b2 e;
    public zr0 f;

    public ce0(Object obj, b2 b2Var) {
        this.e = b2Var;
        or0 k = ur0.k();
        zr0 zr0Var = new zr0(k.g(), obj);
        if (!(k instanceof jv)) {
            zr0Var.b = new zr0(1L, obj);
        }
        this.f = zr0Var;
    }

    @Override // defpackage.ht0
    public final jt0 a() {
        return this.f;
    }

    @Override // defpackage.it0, defpackage.ht0
    public final jt0 b(jt0 jt0Var, jt0 jt0Var2, jt0 jt0Var3) {
        if (this.e.l(((zr0) jt0Var2).c, ((zr0) jt0Var3).c)) {
            return jt0Var2;
        }
        return null;
    }

    @Override // defpackage.ht0
    public final void c(jt0 jt0Var) {
        jt0Var.getClass();
        this.f = (zr0) jt0Var;
    }

    @Override // defpackage.yr0
    public final b2 d() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.bt0
    public final Object getValue() {
        return ((zr0) ur0.u(this.f, this)).c;
    }

    @Override // defpackage.f70
    public final void setValue(Object obj) {
        or0 k;
        zr0 zr0Var = (zr0) ur0.i(this.f);
        if (this.e.l(zr0Var.c, obj)) {
            return;
        }
        zr0 zr0Var2 = this.f;
        synchronized (ur0.c) {
            k = ur0.k();
            ((zr0) ur0.p(zr0Var2, this, k, zr0Var)).c = obj;
        }
        ur0.o(k, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((zr0) ur0.i(this.f)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        b2 b2Var = b2.G;
        b2 b2Var2 = this.e;
        if (nz.l(b2Var2, b2Var)) {
            i2 = 0;
        } else if (nz.l(b2Var2, b2.M)) {
            i2 = 1;
        } else {
            if (!nz.l(b2Var2, b2.K)) {
                g8.s("Only known types of MutableState's SnapshotMutationPolicy are supported");
                return;
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }
}
