package q;

import B.j;
import B0.p;
import java.util.Arrays;

/* renamed from: q.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0290d extends C0288b {

    /* renamed from: f, reason: collision with root package name */
    public C0292f[] f3539f;

    /* renamed from: g, reason: collision with root package name */
    public C0292f[] f3540g;
    public int h;
    public j i;

    @Override // q.C0288b
    public final C0292f d(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.h; i2++) {
            C0292f[] c0292fArr = this.f3539f;
            C0292f c0292f = c0292fArr[i2];
            if (!zArr[c0292f.f3543b]) {
                j jVar = this.i;
                jVar.f30b = c0292f;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f2 = ((C0292f) jVar.f30b).h[i3];
                        if (f2 <= 0.0f) {
                            if (f2 < 0.0f) {
                                i = i2;
                                break;
                            }
                            i3--;
                        }
                    }
                } else {
                    C0292f c0292f2 = c0292fArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f3 = c0292f2.h[i3];
                            float f4 = ((C0292f) jVar.f30b).h[i3];
                            if (f4 == f3) {
                                i3--;
                            } else if (f4 >= f3) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f3539f[i];
    }

    @Override // q.C0288b
    public final boolean e() {
        return this.h == 0;
    }

    @Override // q.C0288b
    public final void i(C0289c c0289c, C0288b c0288b, boolean z2) {
        C0292f c0292f = c0288b.f3521a;
        if (c0292f == null) {
            return;
        }
        C0287a c0287a = c0288b.d;
        int d = c0287a.d();
        for (int i = 0; i < d; i++) {
            C0292f e2 = c0287a.e(i);
            float f2 = c0287a.f(i);
            j jVar = this.i;
            jVar.f30b = e2;
            boolean z3 = e2.f3542a;
            float[] fArr = c0292f.h;
            if (z3) {
                boolean z4 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((C0292f) jVar.f30b).h;
                    float f3 = (fArr[i2] * f2) + fArr2[i2];
                    fArr2[i2] = f3;
                    if (Math.abs(f3) < 1.0E-4f) {
                        ((C0292f) jVar.f30b).h[i2] = 0.0f;
                    } else {
                        z4 = false;
                    }
                }
                if (z4) {
                    ((C0290d) jVar.f31c).k((C0292f) jVar.f30b);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f4 = fArr[i3];
                    if (f4 != 0.0f) {
                        float f5 = f4 * f2;
                        if (Math.abs(f5) < 1.0E-4f) {
                            f5 = 0.0f;
                        }
                        ((C0292f) jVar.f30b).h[i3] = f5;
                    } else {
                        ((C0292f) jVar.f30b).h[i3] = 0.0f;
                    }
                }
                j(e2);
            }
            this.f3522b = (c0288b.f3522b * f2) + this.f3522b;
        }
        k(c0292f);
    }

    public final void j(C0292f c0292f) {
        int i;
        int i2 = this.h + 1;
        C0292f[] c0292fArr = this.f3539f;
        if (i2 > c0292fArr.length) {
            C0292f[] c0292fArr2 = (C0292f[]) Arrays.copyOf(c0292fArr, c0292fArr.length * 2);
            this.f3539f = c0292fArr2;
            this.f3540g = (C0292f[]) Arrays.copyOf(c0292fArr2, c0292fArr2.length * 2);
        }
        C0292f[] c0292fArr3 = this.f3539f;
        int i3 = this.h;
        c0292fArr3[i3] = c0292f;
        int i4 = i3 + 1;
        this.h = i4;
        if (i4 > 1 && c0292fArr3[i3].f3543b > c0292f.f3543b) {
            int i5 = 0;
            while (true) {
                i = this.h;
                if (i5 >= i) {
                    break;
                }
                this.f3540g[i5] = this.f3539f[i5];
                i5++;
            }
            Arrays.sort(this.f3540g, 0, i, new p(2));
            for (int i6 = 0; i6 < this.h; i6++) {
                this.f3539f[i6] = this.f3540g[i6];
            }
        }
        c0292f.f3542a = true;
        c0292f.a(this);
    }

    public final void k(C0292f c0292f) {
        int i = 0;
        while (i < this.h) {
            if (this.f3539f[i] == c0292f) {
                while (true) {
                    int i2 = this.h;
                    if (i >= i2 - 1) {
                        this.h = i2 - 1;
                        c0292f.f3542a = false;
                        return;
                    } else {
                        C0292f[] c0292fArr = this.f3539f;
                        int i3 = i + 1;
                        c0292fArr[i] = c0292fArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // q.C0288b
    public final String toString() {
        String str = " goal -> (" + this.f3522b + ") : ";
        for (int i = 0; i < this.h; i++) {
            C0292f c0292f = this.f3539f[i];
            j jVar = this.i;
            jVar.f30b = c0292f;
            str = str + jVar + " ";
        }
        return str;
    }
}
