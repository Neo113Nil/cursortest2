package q;

import K.C0011l;
import X.V;
import java.util.Arrays;

/* renamed from: q.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0282a {

    /* renamed from: b, reason: collision with root package name */
    public final C0283b f3514b;

    /* renamed from: c, reason: collision with root package name */
    public final C0011l f3515c;

    /* renamed from: a, reason: collision with root package name */
    public int f3513a = 0;
    public int d = 8;

    /* renamed from: e, reason: collision with root package name */
    public int[] f3516e = new int[8];

    /* renamed from: f, reason: collision with root package name */
    public int[] f3517f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    public float[] f3518g = new float[8];
    public int h = -1;
    public int i = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3519j = false;

    public C0282a(C0283b c0283b, C0011l c0011l) {
        this.f3514b = c0283b;
        this.f3515c = c0011l;
    }

    public final void a(C0287f c0287f, float f2, boolean z2) {
        if (f2 <= -0.001f || f2 >= 0.001f) {
            int i = this.h;
            C0283b c0283b = this.f3514b;
            if (i == -1) {
                this.h = 0;
                this.f3518g[0] = f2;
                this.f3516e[0] = c0287f.f3542b;
                this.f3517f[0] = -1;
                c0287f.f3548k++;
                c0287f.a(c0283b);
                this.f3513a++;
                if (this.f3519j) {
                    return;
                }
                int i2 = this.i + 1;
                this.i = i2;
                int[] iArr = this.f3516e;
                if (i2 >= iArr.length) {
                    this.f3519j = true;
                    this.i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f3513a; i4++) {
                int i5 = this.f3516e[i];
                int i6 = c0287f.f3542b;
                if (i5 == i6) {
                    float[] fArr = this.f3518g;
                    float f3 = fArr[i] + f2;
                    if (f3 > -0.001f && f3 < 0.001f) {
                        f3 = 0.0f;
                    }
                    fArr[i] = f3;
                    if (f3 == 0.0f) {
                        if (i == this.h) {
                            this.h = this.f3517f[i];
                        } else {
                            int[] iArr2 = this.f3517f;
                            iArr2[i3] = iArr2[i];
                        }
                        if (z2) {
                            c0287f.b(c0283b);
                        }
                        if (this.f3519j) {
                            this.i = i;
                        }
                        c0287f.f3548k--;
                        this.f3513a--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.f3517f[i];
            }
            int i7 = this.i;
            int i8 = i7 + 1;
            if (this.f3519j) {
                int[] iArr3 = this.f3516e;
                if (iArr3[i7] != -1) {
                    i7 = iArr3.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr4 = this.f3516e;
            if (i7 >= iArr4.length && this.f3513a < iArr4.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr5 = this.f3516e;
                    if (i9 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i9] == -1) {
                        i7 = i9;
                        break;
                    }
                    i9++;
                }
            }
            int[] iArr6 = this.f3516e;
            if (i7 >= iArr6.length) {
                i7 = iArr6.length;
                int i10 = this.d * 2;
                this.d = i10;
                this.f3519j = false;
                this.i = i7 - 1;
                this.f3518g = Arrays.copyOf(this.f3518g, i10);
                this.f3516e = Arrays.copyOf(this.f3516e, this.d);
                this.f3517f = Arrays.copyOf(this.f3517f, this.d);
            }
            this.f3516e[i7] = c0287f.f3542b;
            this.f3518g[i7] = f2;
            if (i3 != -1) {
                int[] iArr7 = this.f3517f;
                iArr7[i7] = iArr7[i3];
                iArr7[i3] = i7;
            } else {
                this.f3517f[i7] = this.h;
                this.h = i7;
            }
            c0287f.f3548k++;
            c0287f.a(c0283b);
            this.f3513a++;
            if (!this.f3519j) {
                this.i++;
            }
            int i11 = this.i;
            int[] iArr8 = this.f3516e;
            if (i11 >= iArr8.length) {
                this.f3519j = true;
                this.i = iArr8.length - 1;
            }
        }
    }

    public final void b() {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.f3513a; i2++) {
            C0287f c0287f = ((C0287f[]) this.f3515c.d)[this.f3516e[i]];
            if (c0287f != null) {
                c0287f.b(this.f3514b);
            }
            i = this.f3517f[i];
        }
        this.h = -1;
        this.i = -1;
        this.f3519j = false;
        this.f3513a = 0;
    }

    public final float c(C0287f c0287f) {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.f3513a; i2++) {
            if (this.f3516e[i] == c0287f.f3542b) {
                return this.f3518g[i];
            }
            i = this.f3517f[i];
        }
        return 0.0f;
    }

    public final int d() {
        return this.f3513a;
    }

    public final C0287f e(int i) {
        int i2 = this.h;
        for (int i3 = 0; i2 != -1 && i3 < this.f3513a; i3++) {
            if (i3 == i) {
                return ((C0287f[]) this.f3515c.d)[this.f3516e[i2]];
            }
            i2 = this.f3517f[i2];
        }
        return null;
    }

    public final float f(int i) {
        int i2 = this.h;
        for (int i3 = 0; i2 != -1 && i3 < this.f3513a; i3++) {
            if (i3 == i) {
                return this.f3518g[i2];
            }
            i2 = this.f3517f[i2];
        }
        return 0.0f;
    }

    public final void g(C0287f c0287f, float f2) {
        if (f2 == 0.0f) {
            h(c0287f, true);
            return;
        }
        int i = this.h;
        C0283b c0283b = this.f3514b;
        if (i == -1) {
            this.h = 0;
            this.f3518g[0] = f2;
            this.f3516e[0] = c0287f.f3542b;
            this.f3517f[0] = -1;
            c0287f.f3548k++;
            c0287f.a(c0283b);
            this.f3513a++;
            if (this.f3519j) {
                return;
            }
            int i2 = this.i + 1;
            this.i = i2;
            int[] iArr = this.f3516e;
            if (i2 >= iArr.length) {
                this.f3519j = true;
                this.i = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f3513a; i4++) {
            int i5 = this.f3516e[i];
            int i6 = c0287f.f3542b;
            if (i5 == i6) {
                this.f3518g[i] = f2;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f3517f[i];
        }
        int i7 = this.i;
        int i8 = i7 + 1;
        if (this.f3519j) {
            int[] iArr2 = this.f3516e;
            if (iArr2[i7] != -1) {
                i7 = iArr2.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr3 = this.f3516e;
        if (i7 >= iArr3.length && this.f3513a < iArr3.length) {
            int i9 = 0;
            while (true) {
                int[] iArr4 = this.f3516e;
                if (i9 >= iArr4.length) {
                    break;
                }
                if (iArr4[i9] == -1) {
                    i7 = i9;
                    break;
                }
                i9++;
            }
        }
        int[] iArr5 = this.f3516e;
        if (i7 >= iArr5.length) {
            i7 = iArr5.length;
            int i10 = this.d * 2;
            this.d = i10;
            this.f3519j = false;
            this.i = i7 - 1;
            this.f3518g = Arrays.copyOf(this.f3518g, i10);
            this.f3516e = Arrays.copyOf(this.f3516e, this.d);
            this.f3517f = Arrays.copyOf(this.f3517f, this.d);
        }
        this.f3516e[i7] = c0287f.f3542b;
        this.f3518g[i7] = f2;
        if (i3 != -1) {
            int[] iArr6 = this.f3517f;
            iArr6[i7] = iArr6[i3];
            iArr6[i3] = i7;
        } else {
            this.f3517f[i7] = this.h;
            this.h = i7;
        }
        c0287f.f3548k++;
        c0287f.a(c0283b);
        int i11 = this.f3513a + 1;
        this.f3513a = i11;
        if (!this.f3519j) {
            this.i++;
        }
        int[] iArr7 = this.f3516e;
        if (i11 >= iArr7.length) {
            this.f3519j = true;
        }
        if (this.i >= iArr7.length) {
            this.f3519j = true;
            this.i = iArr7.length - 1;
        }
    }

    public final float h(C0287f c0287f, boolean z2) {
        int i = this.h;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f3513a) {
            if (this.f3516e[i] == c0287f.f3542b) {
                if (i == this.h) {
                    this.h = this.f3517f[i];
                } else {
                    int[] iArr = this.f3517f;
                    iArr[i3] = iArr[i];
                }
                if (z2) {
                    c0287f.b(this.f3514b);
                }
                c0287f.f3548k--;
                this.f3513a--;
                this.f3516e[i] = -1;
                if (this.f3519j) {
                    this.i = i;
                }
                return this.f3518g[i];
            }
            i2++;
            i3 = i;
            i = this.f3517f[i];
        }
        return 0.0f;
    }

    public final String toString() {
        int i = this.h;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.f3513a; i2++) {
            str = (V.e(str, " -> ") + this.f3518g[i] + " : ") + ((C0287f[]) this.f3515c.d)[this.f3516e[i]];
            i = this.f3517f[i];
        }
        return str;
    }
}
