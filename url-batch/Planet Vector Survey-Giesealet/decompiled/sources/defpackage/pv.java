package defpackage;

import android.os.Build;
import android.view.ViewParent;
import java.util.ArrayList;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class pv implements cd0 {
    public nv d;
    public final mv e;
    public final f3 f;
    public qu g;
    public bu h;
    public boolean j;
    public float[] l;
    public boolean m;
    public int q;
    public xc0 s;
    public boolean t;
    public boolean u;
    public boolean w;
    public long i = 9223372034707292159L;
    public final float[] k = mz.x();
    public sl n = new tl(1.0f, 1.0f);
    public c10 o = c10.d;
    public final nc p = new nc();
    public long r = uw0.b;
    public boolean v = true;
    public final f2 x = new f2(14, this);

    public pv(nv nvVar, mv mvVar, f3 f3Var, qu quVar, bu buVar) {
        this.d = nvVar;
        this.e = mvVar;
        this.f = f3Var;
        this.g = quVar;
        this.h = buVar;
    }

    public final float[] a() {
        float[] fArr = this.l;
        if (fArr == null) {
            fArr = mz.x();
            this.l = fArr;
        }
        if (this.u) {
            this.u = false;
            float[] b = b();
            if (this.v) {
                return b;
            }
            if (!x40.F(b, fArr)) {
                fArr[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArr[0])) {
            return null;
        }
        return fArr;
    }

    public final float[] b() {
        boolean z = this.t;
        float[] fArr = this.k;
        if (z) {
            nv nvVar = this.d;
            long j = nvVar.v;
            ov ovVar = nvVar.a;
            if ((9223372034707292159L & j) == 9205357640488583168L) {
                j = rg0.l(px0.W(this.i));
            }
            float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
            float q = ovVar.q();
            float f = ovVar.f();
            float v = ovVar.v();
            float E = ovVar.E();
            float J = ovVar.J();
            float d = ovVar.d();
            float I = ovVar.I();
            double d2 = v * 0.017453292519943295d;
            float sin = (float) Math.sin(d2);
            float cos = (float) Math.cos(d2);
            float f2 = -sin;
            float f3 = (f * cos) - (1.0f * sin);
            float f4 = (1.0f * cos) + (f * sin);
            double d3 = E * 0.017453292519943295d;
            float sin2 = (float) Math.sin(d3);
            float cos2 = (float) Math.cos(d3);
            float f5 = -sin2;
            float f6 = sin * sin2;
            float f7 = sin * cos2;
            float f8 = cos * sin2;
            float f9 = cos * cos2;
            float f10 = (f4 * sin2) + (q * cos2);
            float f11 = (f4 * cos2) + ((-q) * sin2);
            double d4 = J * 0.017453292519943295d;
            float sin3 = (float) Math.sin(d4);
            float cos3 = (float) Math.cos(d4);
            float f12 = -sin3;
            float f13 = (cos3 * f6) + (f12 * cos2);
            float f14 = ((f6 * sin3) + (cos2 * cos3)) * d;
            float f15 = sin3 * cos * d;
            float f16 = ((sin3 * f7) + (cos3 * f5)) * d;
            float f17 = f13 * I;
            float f18 = cos * cos3 * I;
            float f19 = ((cos3 * f7) + (f12 * f5)) * I;
            float f20 = f8 * 1.0f;
            float f21 = f2 * 1.0f;
            float f22 = f9 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f14;
                fArr[1] = f15;
                fArr[2] = f16;
                fArr[3] = 0.0f;
                fArr[4] = f17;
                fArr[5] = f18;
                fArr[6] = f19;
                fArr[7] = 0.0f;
                fArr[8] = f20;
                fArr[9] = f21;
                fArr[10] = f22;
                fArr[11] = 0.0f;
                float f23 = -intBitsToFloat;
                fArr[12] = ((f14 * f23) - (intBitsToFloat2 * f17)) + f10 + intBitsToFloat;
                fArr[13] = ((f15 * f23) - (intBitsToFloat2 * f18)) + f3 + intBitsToFloat2;
                fArr[14] = ((f23 * f16) - (intBitsToFloat2 * f19)) + f11;
                fArr[15] = 1.0f;
            }
            this.t = false;
            this.v = nz.J(fArr);
        }
        return fArr;
    }

    public final void c() {
        if (this.m || this.j) {
            return;
        }
        this.f.invalidate();
        f(true);
    }

    public final void d(long j) {
        f3 f3Var = this.f;
        if (f3Var.i) {
            f3Var.J(-4.0f);
        }
        nv nvVar = this.d;
        if (!bz.a(nvVar.t, j)) {
            nvVar.t = j;
            nvVar.a.D((int) (j >> 32), (int) (j & 4294967295L), nvVar.u);
        }
        if (Build.VERSION.SDK_INT < 26) {
            f3Var.invalidate();
            return;
        }
        ViewParent parent = f3Var.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(f3Var, f3Var);
        }
    }

    public final void e(long j) {
        if (iz.a(j, this.i)) {
            return;
        }
        f3 f3Var = this.f;
        if (f3Var.i) {
            f3Var.J(-4.0f);
        }
        this.i = j;
        c();
    }

    public final void f(boolean z) {
        if (z != this.m) {
            this.m = z;
            f3 f3Var = this.f;
            ArrayList arrayList = f3Var.A;
            boolean z2 = f3Var.C;
            if (!z) {
                if (z2) {
                    return;
                }
                arrayList.remove(this);
                ArrayList arrayList2 = f3Var.B;
                if (arrayList2 != null) {
                    arrayList2.remove(this);
                    return;
                }
                return;
            }
            if (!z2) {
                arrayList.add(this);
                return;
            }
            ArrayList arrayList3 = f3Var.B;
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                f3Var.B = arrayList3;
            }
            arrayList3.add(this);
        }
    }

    public final void g() {
        if (this.m) {
            if (!uw0.a(this.r, uw0.b) && !iz.a(this.d.u, this.i)) {
                nv nvVar = this.d;
                float intBitsToFloat = Float.intBitsToFloat((int) (this.r >> 32)) * ((int) (this.i >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (this.r & 4294967295L)) * ((int) (this.i & 4294967295L));
                long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
                if (!ra0.b(nvVar.v, floatToRawIntBits)) {
                    nvVar.v = floatToRawIntBits;
                    nvVar.a.L(floatToRawIntBits);
                }
            }
            nv nvVar2 = this.d;
            sl slVar = this.n;
            c10 c10Var = this.o;
            long j = this.i;
            long j2 = nvVar2.u;
            ov ovVar = nvVar2.a;
            if (!iz.a(j2, j)) {
                nvVar2.u = j;
                long j3 = nvVar2.t;
                ovVar.D((int) (j3 >> 32), (int) (4294967295L & j3), j);
                if (nvVar2.i == 9205357640488583168L) {
                    nvVar2.g = true;
                    nvVar2.a();
                }
            }
            nvVar2.b = slVar;
            nvVar2.c = c10Var;
            nvVar2.d = this.x;
            ovVar.w(slVar, c10Var, nvVar2, nvVar2.e);
            f(false);
        }
    }
}
