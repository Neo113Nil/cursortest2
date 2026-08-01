package q;

import B.j;
import D0.o;
import java.util.Arrays;

/* renamed from: q.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0285d extends C0283b {

    /* renamed from: f, reason: collision with root package name */
    public C0287f[] f3538f;

    /* renamed from: g, reason: collision with root package name */
    public C0287f[] f3539g;
    public int h;
    public j i;

    @Override // q.C0283b
    public final C0287f d(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.h; i2++) {
            C0287f[] c0287fArr = this.f3538f;
            C0287f c0287f = c0287fArr[i2];
            if (!zArr[c0287f.f3542b]) {
                j jVar = this.i;
                jVar.f28b = c0287f;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f2 = ((C0287f) jVar.f28b).h[i3];
                        if (f2 <= 0.0f) {
                            if (f2 < 0.0f) {
                                i = i2;
                                break;
                            }
                            i3--;
                        }
                    }
                } else {
                    C0287f c0287f2 = c0287fArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f3 = c0287f2.h[i3];
                            float f4 = ((C0287f) jVar.f28b).h[i3];
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
        return this.f3538f[i];
    }

    @Override // q.C0283b
    public final boolean e() {
        return this.h == 0;
    }

    @Override // q.C0283b
    public final void i(C0284c c0284c, C0283b c0283b, boolean z2) {
        C0287f c0287f = c0283b.f3520a;
        if (c0287f == null) {
            return;
        }
        C0282a c0282a = c0283b.d;
        int d = c0282a.d();
        for (int i = 0; i < d; i++) {
            C0287f e2 = c0282a.e(i);
            float f2 = c0282a.f(i);
            j jVar = this.i;
            jVar.f28b = e2;
            boolean z3 = e2.f3541a;
            float[] fArr = c0287f.h;
            if (z3) {
                boolean z4 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((C0287f) jVar.f28b).h;
                    float f3 = (fArr[i2] * f2) + fArr2[i2];
                    fArr2[i2] = f3;
                    if (Math.abs(f3) < 1.0E-4f) {
                        ((C0287f) jVar.f28b).h[i2] = 0.0f;
                    } else {
                        z4 = false;
                    }
                }
                if (z4) {
                    ((C0285d) jVar.f29c).k((C0287f) jVar.f28b);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f4 = fArr[i3];
                    if (f4 != 0.0f) {
                        float f5 = f4 * f2;
                        if (Math.abs(f5) < 1.0E-4f) {
                            f5 = 0.0f;
                        }
                        ((C0287f) jVar.f28b).h[i3] = f5;
                    } else {
                        ((C0287f) jVar.f28b).h[i3] = 0.0f;
                    }
                }
                j(e2);
            }
            this.f3521b = (c0283b.f3521b * f2) + this.f3521b;
        }
        k(c0287f);
    }

    public final void j(C0287f c0287f) {
        int i;
        int i2 = this.h + 1;
        C0287f[] c0287fArr = this.f3538f;
        if (i2 > c0287fArr.length) {
            C0287f[] c0287fArr2 = (C0287f[]) Arrays.copyOf(c0287fArr, c0287fArr.length * 2);
            this.f3538f = c0287fArr2;
            this.f3539g = (C0287f[]) Arrays.copyOf(c0287fArr2, c0287fArr2.length * 2);
        }
        C0287f[] c0287fArr3 = this.f3538f;
        int i3 = this.h;
        c0287fArr3[i3] = c0287f;
        int i4 = i3 + 1;
        this.h = i4;
        if (i4 > 1 && c0287fArr3[i3].f3542b > c0287f.f3542b) {
            int i5 = 0;
            while (true) {
                i = this.h;
                if (i5 >= i) {
                    break;
                }
                this.f3539g[i5] = this.f3538f[i5];
                i5++;
            }
            Arrays.sort(this.f3539g, 0, i, new o(2));
            for (int i6 = 0; i6 < this.h; i6++) {
                this.f3538f[i6] = this.f3539g[i6];
            }
        }
        c0287f.f3541a = true;
        c0287f.a(this);
    }

    public final void k(C0287f c0287f) {
        int i = 0;
        while (i < this.h) {
            if (this.f3538f[i] == c0287f) {
                while (true) {
                    int i2 = this.h;
                    if (i >= i2 - 1) {
                        this.h = i2 - 1;
                        c0287f.f3541a = false;
                        return;
                    } else {
                        C0287f[] c0287fArr = this.f3538f;
                        int i3 = i + 1;
                        c0287fArr[i] = c0287fArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // q.C0283b
    public final String toString() {
        String str = " goal -> (" + this.f3521b + ") : ";
        for (int i = 0; i < this.h; i++) {
            C0287f c0287f = this.f3538f[i];
            j jVar = this.i;
            jVar.f28b = c0287f;
            str = str + jVar + " ";
        }
        return str;
    }
}
