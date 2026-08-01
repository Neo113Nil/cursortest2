package q;

import K.C0012l;
import X.V;
import java.util.Arrays;

/* renamed from: q.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0287a {

    /* renamed from: b, reason: collision with root package name */
    public final C0288b f3493b;

    /* renamed from: c, reason: collision with root package name */
    public final C0012l f3494c;

    /* renamed from: a, reason: collision with root package name */
    public int f3492a = 0;
    public int d = 8;

    /* renamed from: e, reason: collision with root package name */
    public int[] f3495e = new int[8];

    /* renamed from: f, reason: collision with root package name */
    public int[] f3496f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    public float[] f3497g = new float[8];
    public int h = -1;
    public int i = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3498j = false;

    public C0287a(C0288b c0288b, C0012l c0012l) {
        this.f3493b = c0288b;
        this.f3494c = c0012l;
    }

    public final void a(C0292f c0292f, float f2, boolean z2) {
        if (f2 <= -0.001f || f2 >= 0.001f) {
            int i = this.h;
            C0288b c0288b = this.f3493b;
            if (i == -1) {
                this.h = 0;
                this.f3497g[0] = f2;
                this.f3495e[0] = c0292f.f3521b;
                this.f3496f[0] = -1;
                c0292f.f3527k++;
                c0292f.a(c0288b);
                this.f3492a++;
                if (this.f3498j) {
                    return;
                }
                int i2 = this.i + 1;
                this.i = i2;
                int[] iArr = this.f3495e;
                if (i2 >= iArr.length) {
                    this.f3498j = true;
                    this.i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f3492a; i4++) {
                int i5 = this.f3495e[i];
                int i6 = c0292f.f3521b;
                if (i5 == i6) {
                    float[] fArr = this.f3497g;
                    float f3 = fArr[i] + f2;
                    if (f3 > -0.001f && f3 < 0.001f) {
                        f3 = 0.0f;
                    }
                    fArr[i] = f3;
                    if (f3 == 0.0f) {
                        if (i == this.h) {
                            this.h = this.f3496f[i];
                        } else {
                            int[] iArr2 = this.f3496f;
                            iArr2[i3] = iArr2[i];
                        }
                        if (z2) {
                            c0292f.b(c0288b);
                        }
                        if (this.f3498j) {
                            this.i = i;
                        }
                        c0292f.f3527k--;
                        this.f3492a--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.f3496f[i];
            }
            int i7 = this.i;
            int i8 = i7 + 1;
            if (this.f3498j) {
                int[] iArr3 = this.f3495e;
                if (iArr3[i7] != -1) {
                    i7 = iArr3.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr4 = this.f3495e;
            if (i7 >= iArr4.length && this.f3492a < iArr4.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr5 = this.f3495e;
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
            int[] iArr6 = this.f3495e;
            if (i7 >= iArr6.length) {
                i7 = iArr6.length;
                int i10 = this.d * 2;
                this.d = i10;
                this.f3498j = false;
                this.i = i7 - 1;
                this.f3497g = Arrays.copyOf(this.f3497g, i10);
                this.f3495e = Arrays.copyOf(this.f3495e, this.d);
                this.f3496f = Arrays.copyOf(this.f3496f, this.d);
            }
            this.f3495e[i7] = c0292f.f3521b;
            this.f3497g[i7] = f2;
            if (i3 != -1) {
                int[] iArr7 = this.f3496f;
                iArr7[i7] = iArr7[i3];
                iArr7[i3] = i7;
            } else {
                this.f3496f[i7] = this.h;
                this.h = i7;
            }
            c0292f.f3527k++;
            c0292f.a(c0288b);
            this.f3492a++;
            if (!this.f3498j) {
                this.i++;
            }
            int i11 = this.i;
            int[] iArr8 = this.f3495e;
            if (i11 >= iArr8.length) {
                this.f3498j = true;
                this.i = iArr8.length - 1;
            }
        }
    }

    public final void b() {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.f3492a; i2++) {
            C0292f c0292f = ((C0292f[]) this.f3494c.d)[this.f3495e[i]];
            if (c0292f != null) {
                c0292f.b(this.f3493b);
            }
            i = this.f3496f[i];
        }
        this.h = -1;
        this.i = -1;
        this.f3498j = false;
        this.f3492a = 0;
    }

    public final float c(C0292f c0292f) {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.f3492a; i2++) {
            if (this.f3495e[i] == c0292f.f3521b) {
                return this.f3497g[i];
            }
            i = this.f3496f[i];
        }
        return 0.0f;
    }

    public final int d() {
        return this.f3492a;
    }

    public final C0292f e(int i) {
        int i2 = this.h;
        for (int i3 = 0; i2 != -1 && i3 < this.f3492a; i3++) {
            if (i3 == i) {
                return ((C0292f[]) this.f3494c.d)[this.f3495e[i2]];
            }
            i2 = this.f3496f[i2];
        }
        return null;
    }

    public final float f(int i) {
        int i2 = this.h;
        for (int i3 = 0; i2 != -1 && i3 < this.f3492a; i3++) {
            if (i3 == i) {
                return this.f3497g[i2];
            }
            i2 = this.f3496f[i2];
        }
        return 0.0f;
    }

    public final void g(C0292f c0292f, float f2) {
        if (f2 == 0.0f) {
            h(c0292f, true);
            return;
        }
        int i = this.h;
        C0288b c0288b = this.f3493b;
        if (i == -1) {
            this.h = 0;
            this.f3497g[0] = f2;
            this.f3495e[0] = c0292f.f3521b;
            this.f3496f[0] = -1;
            c0292f.f3527k++;
            c0292f.a(c0288b);
            this.f3492a++;
            if (this.f3498j) {
                return;
            }
            int i2 = this.i + 1;
            this.i = i2;
            int[] iArr = this.f3495e;
            if (i2 >= iArr.length) {
                this.f3498j = true;
                this.i = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f3492a; i4++) {
            int i5 = this.f3495e[i];
            int i6 = c0292f.f3521b;
            if (i5 == i6) {
                this.f3497g[i] = f2;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f3496f[i];
        }
        int i7 = this.i;
        int i8 = i7 + 1;
        if (this.f3498j) {
            int[] iArr2 = this.f3495e;
            if (iArr2[i7] != -1) {
                i7 = iArr2.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr3 = this.f3495e;
        if (i7 >= iArr3.length && this.f3492a < iArr3.length) {
            int i9 = 0;
            while (true) {
                int[] iArr4 = this.f3495e;
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
        int[] iArr5 = this.f3495e;
        if (i7 >= iArr5.length) {
            i7 = iArr5.length;
            int i10 = this.d * 2;
            this.d = i10;
            this.f3498j = false;
            this.i = i7 - 1;
            this.f3497g = Arrays.copyOf(this.f3497g, i10);
            this.f3495e = Arrays.copyOf(this.f3495e, this.d);
            this.f3496f = Arrays.copyOf(this.f3496f, this.d);
        }
        this.f3495e[i7] = c0292f.f3521b;
        this.f3497g[i7] = f2;
        if (i3 != -1) {
            int[] iArr6 = this.f3496f;
            iArr6[i7] = iArr6[i3];
            iArr6[i3] = i7;
        } else {
            this.f3496f[i7] = this.h;
            this.h = i7;
        }
        c0292f.f3527k++;
        c0292f.a(c0288b);
        int i11 = this.f3492a + 1;
        this.f3492a = i11;
        if (!this.f3498j) {
            this.i++;
        }
        int[] iArr7 = this.f3495e;
        if (i11 >= iArr7.length) {
            this.f3498j = true;
        }
        if (this.i >= iArr7.length) {
            this.f3498j = true;
            this.i = iArr7.length - 1;
        }
    }

    public final float h(C0292f c0292f, boolean z2) {
        int i = this.h;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f3492a) {
            if (this.f3495e[i] == c0292f.f3521b) {
                if (i == this.h) {
                    this.h = this.f3496f[i];
                } else {
                    int[] iArr = this.f3496f;
                    iArr[i3] = iArr[i];
                }
                if (z2) {
                    c0292f.b(this.f3493b);
                }
                c0292f.f3527k--;
                this.f3492a--;
                this.f3495e[i] = -1;
                if (this.f3498j) {
                    this.i = i;
                }
                return this.f3497g[i];
            }
            i2++;
            i3 = i;
            i = this.f3496f[i];
        }
        return 0.0f;
    }

    public final String toString() {
        int i = this.h;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.f3492a; i2++) {
            str = (V.e(str, " -> ") + this.f3497g[i] + " : ") + ((C0292f[]) this.f3494c.d)[this.f3495e[i]];
            i = this.f3496f[i];
        }
        return str;
    }
}
