package q;

import E1.AbstractC0001b;
import K.C0019l;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* renamed from: q.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0328a {

    /* renamed from: b, reason: collision with root package name */
    public final C0329b f3816b;

    /* renamed from: c, reason: collision with root package name */
    public final C0019l f3817c;

    /* renamed from: a, reason: collision with root package name */
    public int f3815a = 0;
    public int d = 8;

    /* renamed from: e, reason: collision with root package name */
    public int[] f3818e = new int[8];

    /* renamed from: f, reason: collision with root package name */
    public int[] f3819f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    public float[] f3820g = new float[8];
    public int h = -1;
    public int i = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3821j = false;

    public C0328a(C0329b c0329b, C0019l c0019l) {
        this.f3816b = c0329b;
        this.f3817c = c0019l;
    }

    public final void a(C0333f c0333f, float f2, boolean z2) {
        if (f2 <= -0.001f || f2 >= 0.001f) {
            int i = this.h;
            C0329b c0329b = this.f3816b;
            if (i == -1) {
                this.h = 0;
                this.f3820g[0] = f2;
                this.f3818e[0] = c0333f.f3844b;
                this.f3819f[0] = -1;
                c0333f.f3850k++;
                c0333f.a(c0329b);
                this.f3815a++;
                if (this.f3821j) {
                    return;
                }
                int i2 = this.i + 1;
                this.i = i2;
                int[] iArr = this.f3818e;
                if (i2 >= iArr.length) {
                    this.f3821j = true;
                    this.i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f3815a; i4++) {
                int i5 = this.f3818e[i];
                int i6 = c0333f.f3844b;
                if (i5 == i6) {
                    float[] fArr = this.f3820g;
                    float f3 = fArr[i] + f2;
                    if (f3 > -0.001f && f3 < 0.001f) {
                        f3 = 0.0f;
                    }
                    fArr[i] = f3;
                    if (f3 == RecyclerView.f1949A0) {
                        if (i == this.h) {
                            this.h = this.f3819f[i];
                        } else {
                            int[] iArr2 = this.f3819f;
                            iArr2[i3] = iArr2[i];
                        }
                        if (z2) {
                            c0333f.b(c0329b);
                        }
                        if (this.f3821j) {
                            this.i = i;
                        }
                        c0333f.f3850k--;
                        this.f3815a--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.f3819f[i];
            }
            int i7 = this.i;
            int i8 = i7 + 1;
            if (this.f3821j) {
                int[] iArr3 = this.f3818e;
                if (iArr3[i7] != -1) {
                    i7 = iArr3.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr4 = this.f3818e;
            if (i7 >= iArr4.length && this.f3815a < iArr4.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr5 = this.f3818e;
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
            int[] iArr6 = this.f3818e;
            if (i7 >= iArr6.length) {
                i7 = iArr6.length;
                int i10 = this.d * 2;
                this.d = i10;
                this.f3821j = false;
                this.i = i7 - 1;
                this.f3820g = Arrays.copyOf(this.f3820g, i10);
                this.f3818e = Arrays.copyOf(this.f3818e, this.d);
                this.f3819f = Arrays.copyOf(this.f3819f, this.d);
            }
            this.f3818e[i7] = c0333f.f3844b;
            this.f3820g[i7] = f2;
            if (i3 != -1) {
                int[] iArr7 = this.f3819f;
                iArr7[i7] = iArr7[i3];
                iArr7[i3] = i7;
            } else {
                this.f3819f[i7] = this.h;
                this.h = i7;
            }
            c0333f.f3850k++;
            c0333f.a(c0329b);
            this.f3815a++;
            if (!this.f3821j) {
                this.i++;
            }
            int i11 = this.i;
            int[] iArr8 = this.f3818e;
            if (i11 >= iArr8.length) {
                this.f3821j = true;
                this.i = iArr8.length - 1;
            }
        }
    }

    public final void b() {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.f3815a; i2++) {
            C0333f c0333f = ((C0333f[]) this.f3817c.f685c)[this.f3818e[i]];
            if (c0333f != null) {
                c0333f.b(this.f3816b);
            }
            i = this.f3819f[i];
        }
        this.h = -1;
        this.i = -1;
        this.f3821j = false;
        this.f3815a = 0;
    }

    public final float c(C0333f c0333f) {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.f3815a; i2++) {
            if (this.f3818e[i] == c0333f.f3844b) {
                return this.f3820g[i];
            }
            i = this.f3819f[i];
        }
        return RecyclerView.f1949A0;
    }

    public final int d() {
        return this.f3815a;
    }

    public final C0333f e(int i) {
        int i2 = this.h;
        for (int i3 = 0; i2 != -1 && i3 < this.f3815a; i3++) {
            if (i3 == i) {
                return ((C0333f[]) this.f3817c.f685c)[this.f3818e[i2]];
            }
            i2 = this.f3819f[i2];
        }
        return null;
    }

    public final float f(int i) {
        int i2 = this.h;
        for (int i3 = 0; i2 != -1 && i3 < this.f3815a; i3++) {
            if (i3 == i) {
                return this.f3820g[i2];
            }
            i2 = this.f3819f[i2];
        }
        return RecyclerView.f1949A0;
    }

    public final void g(C0333f c0333f, float f2) {
        if (f2 == RecyclerView.f1949A0) {
            h(c0333f, true);
            return;
        }
        int i = this.h;
        C0329b c0329b = this.f3816b;
        if (i == -1) {
            this.h = 0;
            this.f3820g[0] = f2;
            this.f3818e[0] = c0333f.f3844b;
            this.f3819f[0] = -1;
            c0333f.f3850k++;
            c0333f.a(c0329b);
            this.f3815a++;
            if (this.f3821j) {
                return;
            }
            int i2 = this.i + 1;
            this.i = i2;
            int[] iArr = this.f3818e;
            if (i2 >= iArr.length) {
                this.f3821j = true;
                this.i = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f3815a; i4++) {
            int i5 = this.f3818e[i];
            int i6 = c0333f.f3844b;
            if (i5 == i6) {
                this.f3820g[i] = f2;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f3819f[i];
        }
        int i7 = this.i;
        int i8 = i7 + 1;
        if (this.f3821j) {
            int[] iArr2 = this.f3818e;
            if (iArr2[i7] != -1) {
                i7 = iArr2.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr3 = this.f3818e;
        if (i7 >= iArr3.length && this.f3815a < iArr3.length) {
            int i9 = 0;
            while (true) {
                int[] iArr4 = this.f3818e;
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
        int[] iArr5 = this.f3818e;
        if (i7 >= iArr5.length) {
            i7 = iArr5.length;
            int i10 = this.d * 2;
            this.d = i10;
            this.f3821j = false;
            this.i = i7 - 1;
            this.f3820g = Arrays.copyOf(this.f3820g, i10);
            this.f3818e = Arrays.copyOf(this.f3818e, this.d);
            this.f3819f = Arrays.copyOf(this.f3819f, this.d);
        }
        this.f3818e[i7] = c0333f.f3844b;
        this.f3820g[i7] = f2;
        if (i3 != -1) {
            int[] iArr6 = this.f3819f;
            iArr6[i7] = iArr6[i3];
            iArr6[i3] = i7;
        } else {
            this.f3819f[i7] = this.h;
            this.h = i7;
        }
        c0333f.f3850k++;
        c0333f.a(c0329b);
        int i11 = this.f3815a + 1;
        this.f3815a = i11;
        if (!this.f3821j) {
            this.i++;
        }
        int[] iArr7 = this.f3818e;
        if (i11 >= iArr7.length) {
            this.f3821j = true;
        }
        if (this.i >= iArr7.length) {
            this.f3821j = true;
            this.i = iArr7.length - 1;
        }
    }

    public final float h(C0333f c0333f, boolean z2) {
        int i = this.h;
        if (i == -1) {
            return RecyclerView.f1949A0;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f3815a) {
            if (this.f3818e[i] == c0333f.f3844b) {
                if (i == this.h) {
                    this.h = this.f3819f[i];
                } else {
                    int[] iArr = this.f3819f;
                    iArr[i3] = iArr[i];
                }
                if (z2) {
                    c0333f.b(this.f3816b);
                }
                c0333f.f3850k--;
                this.f3815a--;
                this.f3818e[i] = -1;
                if (this.f3821j) {
                    this.i = i;
                }
                return this.f3820g[i];
            }
            i2++;
            i3 = i;
            i = this.f3819f[i];
        }
        return RecyclerView.f1949A0;
    }

    public final String toString() {
        int i = this.h;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.f3815a; i2++) {
            str = (AbstractC0001b.g(str, " -> ") + this.f3820g[i] + " : ") + ((C0333f[]) this.f3817c.f685c)[this.f3818e[i]];
            i = this.f3819f[i];
        }
        return str;
    }
}
