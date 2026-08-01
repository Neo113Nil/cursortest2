package q;

import B.j;
import G0.n;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* renamed from: q.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0331d extends C0329b {

    /* renamed from: f, reason: collision with root package name */
    public C0333f[] f3840f;

    /* renamed from: g, reason: collision with root package name */
    public C0333f[] f3841g;
    public int h;
    public j i;

    @Override // q.C0329b
    public final C0333f d(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.h; i2++) {
            C0333f[] c0333fArr = this.f3840f;
            C0333f c0333f = c0333fArr[i2];
            if (!zArr[c0333f.f3844b]) {
                j jVar = this.i;
                jVar.f72b = c0333f;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f2 = ((C0333f) jVar.f72b).h[i3];
                        if (f2 <= RecyclerView.f1949A0) {
                            if (f2 < RecyclerView.f1949A0) {
                                i = i2;
                                break;
                            }
                            i3--;
                        }
                    }
                } else {
                    C0333f c0333f2 = c0333fArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f3 = c0333f2.h[i3];
                            float f4 = ((C0333f) jVar.f72b).h[i3];
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
        return this.f3840f[i];
    }

    @Override // q.C0329b
    public final boolean e() {
        return this.h == 0;
    }

    @Override // q.C0329b
    public final void i(C0330c c0330c, C0329b c0329b, boolean z2) {
        C0333f c0333f = c0329b.f3822a;
        if (c0333f == null) {
            return;
        }
        C0328a c0328a = c0329b.d;
        int d = c0328a.d();
        for (int i = 0; i < d; i++) {
            C0333f e2 = c0328a.e(i);
            float f2 = c0328a.f(i);
            j jVar = this.i;
            jVar.f72b = e2;
            boolean z3 = e2.f3843a;
            float[] fArr = c0333f.h;
            if (z3) {
                boolean z4 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((C0333f) jVar.f72b).h;
                    float f3 = (fArr[i2] * f2) + fArr2[i2];
                    fArr2[i2] = f3;
                    if (Math.abs(f3) < 1.0E-4f) {
                        ((C0333f) jVar.f72b).h[i2] = 0.0f;
                    } else {
                        z4 = false;
                    }
                }
                if (z4) {
                    ((C0331d) jVar.f73c).k((C0333f) jVar.f72b);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f4 = fArr[i3];
                    if (f4 != RecyclerView.f1949A0) {
                        float f5 = f4 * f2;
                        if (Math.abs(f5) < 1.0E-4f) {
                            f5 = 0.0f;
                        }
                        ((C0333f) jVar.f72b).h[i3] = f5;
                    } else {
                        ((C0333f) jVar.f72b).h[i3] = 0.0f;
                    }
                }
                j(e2);
            }
            this.f3823b = (c0329b.f3823b * f2) + this.f3823b;
        }
        k(c0333f);
    }

    public final void j(C0333f c0333f) {
        int i;
        int i2 = this.h + 1;
        C0333f[] c0333fArr = this.f3840f;
        if (i2 > c0333fArr.length) {
            C0333f[] c0333fArr2 = (C0333f[]) Arrays.copyOf(c0333fArr, c0333fArr.length * 2);
            this.f3840f = c0333fArr2;
            this.f3841g = (C0333f[]) Arrays.copyOf(c0333fArr2, c0333fArr2.length * 2);
        }
        C0333f[] c0333fArr3 = this.f3840f;
        int i3 = this.h;
        c0333fArr3[i3] = c0333f;
        int i4 = i3 + 1;
        this.h = i4;
        if (i4 > 1 && c0333fArr3[i3].f3844b > c0333f.f3844b) {
            int i5 = 0;
            while (true) {
                i = this.h;
                if (i5 >= i) {
                    break;
                }
                this.f3841g[i5] = this.f3840f[i5];
                i5++;
            }
            Arrays.sort(this.f3841g, 0, i, new n(2));
            for (int i6 = 0; i6 < this.h; i6++) {
                this.f3840f[i6] = this.f3841g[i6];
            }
        }
        c0333f.f3843a = true;
        c0333f.a(this);
    }

    public final void k(C0333f c0333f) {
        int i = 0;
        while (i < this.h) {
            if (this.f3840f[i] == c0333f) {
                while (true) {
                    int i2 = this.h;
                    if (i >= i2 - 1) {
                        this.h = i2 - 1;
                        c0333f.f3843a = false;
                        return;
                    } else {
                        C0333f[] c0333fArr = this.f3840f;
                        int i3 = i + 1;
                        c0333fArr[i] = c0333fArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // q.C0329b
    public final String toString() {
        String str = " goal -> (" + this.f3823b + ") : ";
        for (int i = 0; i < this.h; i++) {
            C0333f c0333f = this.f3840f[i];
            j jVar = this.i;
            jVar.f72b = c0333f;
            str = str + jVar + " ";
        }
        return str;
    }
}
