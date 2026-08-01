package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class wv extends wy0 {
    public float[] b;
    public final ArrayList c = new ArrayList();
    public boolean d = true;
    public long e = ge.g;
    public List f;
    public boolean g;
    public e5 h;
    public mu i;
    public final f2 j;
    public String k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public boolean s;

    public wv() {
        int i = fz0.a;
        this.f = wp.d;
        this.g = true;
        this.j = new f2(15, this);
        this.k = "";
        this.o = 1.0f;
        this.p = 1.0f;
        this.s = true;
    }

    @Override // defpackage.wy0
    public final void a(oo ooVar) {
        if (this.s) {
            float[] fArr = this.b;
            if (fArr == null) {
                fArr = mz.x();
                this.b = fArr;
            } else {
                mz.R(fArr);
            }
            mz.X(fArr, this.q + this.m, this.r + this.n);
            float f = this.l;
            if (fArr.length >= 16) {
                double d = f * 0.017453292519943295d;
                float sin = (float) Math.sin(d);
                float cos = (float) Math.cos(d);
                float f2 = fArr[0];
                float f3 = fArr[4];
                float f4 = (sin * f3) + (cos * f2);
                float f5 = -sin;
                float f6 = (f3 * cos) + (f2 * f5);
                float f7 = fArr[1];
                float f8 = fArr[5];
                float f9 = (sin * f8) + (cos * f7);
                float f10 = (f8 * cos) + (f7 * f5);
                float f11 = fArr[2];
                float f12 = fArr[6];
                float f13 = (sin * f12) + (cos * f11);
                float f14 = (f12 * cos) + (f11 * f5);
                float f15 = fArr[3];
                float f16 = fArr[7];
                fArr[0] = f4;
                fArr[1] = f9;
                fArr[2] = f13;
                fArr[3] = (sin * f16) + (cos * f15);
                fArr[4] = f6;
                fArr[5] = f10;
                fArr[6] = f14;
                fArr[7] = (cos * f16) + (f5 * f15);
            }
            float f17 = this.o;
            float f18 = this.p;
            if (fArr.length >= 16) {
                fArr[0] = fArr[0] * f17;
                fArr[1] = fArr[1] * f17;
                fArr[2] = fArr[2] * f17;
                fArr[3] = fArr[3] * f17;
                fArr[4] = fArr[4] * f18;
                fArr[5] = fArr[5] * f18;
                fArr[6] = fArr[6] * f18;
                fArr[7] = fArr[7] * f18;
                fArr[8] = fArr[8] * 1.0f;
                fArr[9] = fArr[9] * 1.0f;
                fArr[10] = fArr[10] * 1.0f;
                fArr[11] = fArr[11] * 1.0f;
            }
            mz.X(fArr, -this.m, -this.n);
            this.s = false;
        }
        if (this.g) {
            if (!this.f.isEmpty()) {
                e5 e5Var = this.h;
                if (e5Var == null) {
                    e5Var = g5.a();
                    this.h = e5Var;
                }
                ze0.t(this.f, e5Var);
            }
            this.g = false;
        }
        t7 r = ooVar.r();
        long r2 = r.r();
        r.p().i();
        try {
            t7 t7Var = (t7) ((p01) r.e).e;
            float[] fArr2 = this.b;
            if (fArr2 != null) {
                t7Var.p().o(fArr2);
            }
            e5 e5Var2 = this.h;
            if (!this.f.isEmpty() && e5Var2 != null) {
                t7Var.p().q(e5Var2);
            }
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((wy0) arrayList.get(i)).a(ooVar);
            }
        } finally {
            r.p().g();
            r.B(r2);
        }
    }

    @Override // defpackage.wy0
    public final mu b() {
        return this.i;
    }

    @Override // defpackage.wy0
    public final void d(f2 f2Var) {
        this.i = f2Var;
    }

    public final void e(int i, wy0 wy0Var) {
        ArrayList arrayList = this.c;
        if (i < arrayList.size()) {
            arrayList.set(i, wy0Var);
        } else {
            arrayList.add(wy0Var);
        }
        g(wy0Var);
        wy0Var.d(this.j);
        c();
    }

    public final void f(long j) {
        if (this.d && j != 16) {
            long j2 = this.e;
            if (j2 == 16) {
                this.e = j;
                return;
            }
            int i = fz0.a;
            if (ge.h(j2) == ge.h(j) && ge.g(j2) == ge.g(j) && ge.e(j2) == ge.e(j)) {
                return;
            }
            this.d = false;
            this.e = ge.g;
        }
    }

    public final void g(wy0 wy0Var) {
        if (!(wy0Var instanceof ee0)) {
            if (wy0Var instanceof wv) {
                wv wvVar = (wv) wy0Var;
                if (wvVar.d && this.d) {
                    f(wvVar.e);
                    return;
                } else {
                    this.d = false;
                    this.e = ge.g;
                    return;
                }
            }
            return;
        }
        ee0 ee0Var = (ee0) wy0Var;
        px0 px0Var = ee0Var.b;
        if (this.d && px0Var != null) {
            if (px0Var instanceof ks0) {
                f(((ks0) px0Var).k);
            } else {
                this.d = false;
                this.e = ge.g;
            }
        }
        px0 px0Var2 = ee0Var.g;
        if (this.d && px0Var2 != null) {
            if (px0Var2 instanceof ks0) {
                f(((ks0) px0Var2).k);
            } else {
                this.d = false;
                this.e = ge.g;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.k);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            wy0 wy0Var = (wy0) arrayList.get(i);
            sb.append("\t");
            sb.append(wy0Var.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
