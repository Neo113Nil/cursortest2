package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class yd0 extends it0 implements Parcelable, yr0, bt0, f70 {
    public static final Parcelable.Creator<yd0> CREATOR = new q1(3);
    public vr0 e;

    public yd0(float f) {
        or0 k = ur0.k();
        vr0 vr0Var = new vr0(k.g(), f);
        if (!(k instanceof jv)) {
            vr0Var.b = new vr0(1L, f);
        }
        this.e = vr0Var;
    }

    @Override // defpackage.ht0
    public final jt0 a() {
        return this.e;
    }

    @Override // defpackage.it0, defpackage.ht0
    public final jt0 b(jt0 jt0Var, jt0 jt0Var2, jt0 jt0Var3) {
        if (((vr0) jt0Var2).c == ((vr0) jt0Var3).c) {
            return jt0Var2;
        }
        return null;
    }

    @Override // defpackage.ht0
    public final void c(jt0 jt0Var) {
        jt0Var.getClass();
        this.e = (vr0) jt0Var;
    }

    @Override // defpackage.yr0
    public final b2 d() {
        return b2.M;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final float g() {
        return ((vr0) ur0.u(this.e, this)).c;
    }

    @Override // defpackage.bt0
    public final Object getValue() {
        return Float.valueOf(g());
    }

    public final void h(float f) {
        or0 k;
        vr0 vr0Var = (vr0) ur0.i(this.e);
        if (vr0Var.c == f) {
            return;
        }
        vr0 vr0Var2 = this.e;
        synchronized (ur0.c) {
            k = ur0.k();
            ((vr0) ur0.p(vr0Var2, this, k, vr0Var)).c = f;
        }
        ur0.o(k, this);
    }

    @Override // defpackage.f70
    public final void setValue(Object obj) {
        h(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((vr0) ur0.i(this.e)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(g());
    }
}
