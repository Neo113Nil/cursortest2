package q;

import K.C0014m;
import Y.V;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* renamed from: q.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0317a {

    /* renamed from: b, reason: collision with root package name */
    public final C0318b f3432b;

    /* renamed from: c, reason: collision with root package name */
    public final C0014m f3433c;

    /* renamed from: a, reason: collision with root package name */
    public int f3431a = 0;
    public int d = 8;

    /* renamed from: e, reason: collision with root package name */
    public int[] f3434e = new int[8];

    /* renamed from: f, reason: collision with root package name */
    public int[] f3435f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    public float[] f3436g = new float[8];
    public int h = -1;
    public int i = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3437j = false;

    public C0317a(C0318b c0318b, C0014m c0014m) {
        this.f3432b = c0318b;
        this.f3433c = c0014m;
    }

    public final void a(C0322f c0322f, float f2, boolean z2) {
        if (f2 <= -0.001f || f2 >= 0.001f) {
            int i = this.h;
            C0318b c0318b = this.f3432b;
            if (i == -1) {
                this.h = 0;
                this.f3436g[0] = f2;
                this.f3434e[0] = c0322f.f3459b;
                this.f3435f[0] = -1;
                c0322f.f3465k++;
                c0322f.a(c0318b);
                this.f3431a++;
                if (this.f3437j) {
                    return;
                }
                int i2 = this.i + 1;
                this.i = i2;
                int[] iArr = this.f3434e;
                if (i2 >= iArr.length) {
                    this.f3437j = true;
                    this.i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f3431a; i4++) {
                int i5 = this.f3434e[i];
                int i6 = c0322f.f3459b;
                if (i5 == i6) {
                    float[] fArr = this.f3436g;
                    float f3 = fArr[i] + f2;
                    if (f3 > -0.001f && f3 < 0.001f) {
                        f3 = 0.0f;
                    }
                    fArr[i] = f3;
                    if (f3 == RecyclerView.f1570A0) {
                        if (i == this.h) {
                            this.h = this.f3435f[i];
                        } else {
                            int[] iArr2 = this.f3435f;
                            iArr2[i3] = iArr2[i];
                        }
                        if (z2) {
                            c0322f.b(c0318b);
                        }
                        if (this.f3437j) {
                            this.i = i;
                        }
                        c0322f.f3465k--;
                        this.f3431a--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.f3435f[i];
            }
            int i7 = this.i;
            int i8 = i7 + 1;
            if (this.f3437j) {
                int[] iArr3 = this.f3434e;
                if (iArr3[i7] != -1) {
                    i7 = iArr3.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr4 = this.f3434e;
            if (i7 >= iArr4.length && this.f3431a < iArr4.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr5 = this.f3434e;
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
            int[] iArr6 = this.f3434e;
            if (i7 >= iArr6.length) {
                i7 = iArr6.length;
                int i10 = this.d * 2;
                this.d = i10;
                this.f3437j = false;
                this.i = i7 - 1;
                this.f3436g = Arrays.copyOf(this.f3436g, i10);
                this.f3434e = Arrays.copyOf(this.f3434e, this.d);
                this.f3435f = Arrays.copyOf(this.f3435f, this.d);
            }
            this.f3434e[i7] = c0322f.f3459b;
            this.f3436g[i7] = f2;
            if (i3 != -1) {
                int[] iArr7 = this.f3435f;
                iArr7[i7] = iArr7[i3];
                iArr7[i3] = i7;
            } else {
                this.f3435f[i7] = this.h;
                this.h = i7;
            }
            c0322f.f3465k++;
            c0322f.a(c0318b);
            this.f3431a++;
            if (!this.f3437j) {
                this.i++;
            }
            int i11 = this.i;
            int[] iArr8 = this.f3434e;
            if (i11 >= iArr8.length) {
                this.f3437j = true;
                this.i = iArr8.length - 1;
            }
        }
    }

    public final void b() {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.f3431a; i2++) {
            C0322f c0322f = ((C0322f[]) this.f3433c.f426c)[this.f3434e[i]];
            if (c0322f != null) {
                c0322f.b(this.f3432b);
            }
            i = this.f3435f[i];
        }
        this.h = -1;
        this.i = -1;
        this.f3437j = false;
        this.f3431a = 0;
    }

    public final float c(C0322f c0322f) {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.f3431a; i2++) {
            if (this.f3434e[i] == c0322f.f3459b) {
                return this.f3436g[i];
            }
            i = this.f3435f[i];
        }
        return RecyclerView.f1570A0;
    }

    public final int d() {
        return this.f3431a;
    }

    public final C0322f e(int i) {
        int i2 = this.h;
        for (int i3 = 0; i2 != -1 && i3 < this.f3431a; i3++) {
            if (i3 == i) {
                return ((C0322f[]) this.f3433c.f426c)[this.f3434e[i2]];
            }
            i2 = this.f3435f[i2];
        }
        return null;
    }

    public final float f(int i) {
        int i2 = this.h;
        for (int i3 = 0; i2 != -1 && i3 < this.f3431a; i3++) {
            if (i3 == i) {
                return this.f3436g[i2];
            }
            i2 = this.f3435f[i2];
        }
        return RecyclerView.f1570A0;
    }

    public final void g(C0322f c0322f, float f2) {
        if (f2 == RecyclerView.f1570A0) {
            h(c0322f, true);
            return;
        }
        int i = this.h;
        C0318b c0318b = this.f3432b;
        if (i == -1) {
            this.h = 0;
            this.f3436g[0] = f2;
            this.f3434e[0] = c0322f.f3459b;
            this.f3435f[0] = -1;
            c0322f.f3465k++;
            c0322f.a(c0318b);
            this.f3431a++;
            if (this.f3437j) {
                return;
            }
            int i2 = this.i + 1;
            this.i = i2;
            int[] iArr = this.f3434e;
            if (i2 >= iArr.length) {
                this.f3437j = true;
                this.i = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f3431a; i4++) {
            int i5 = this.f3434e[i];
            int i6 = c0322f.f3459b;
            if (i5 == i6) {
                this.f3436g[i] = f2;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f3435f[i];
        }
        int i7 = this.i;
        int i8 = i7 + 1;
        if (this.f3437j) {
            int[] iArr2 = this.f3434e;
            if (iArr2[i7] != -1) {
                i7 = iArr2.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr3 = this.f3434e;
        if (i7 >= iArr3.length && this.f3431a < iArr3.length) {
            int i9 = 0;
            while (true) {
                int[] iArr4 = this.f3434e;
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
        int[] iArr5 = this.f3434e;
        if (i7 >= iArr5.length) {
            i7 = iArr5.length;
            int i10 = this.d * 2;
            this.d = i10;
            this.f3437j = false;
            this.i = i7 - 1;
            this.f3436g = Arrays.copyOf(this.f3436g, i10);
            this.f3434e = Arrays.copyOf(this.f3434e, this.d);
            this.f3435f = Arrays.copyOf(this.f3435f, this.d);
        }
        this.f3434e[i7] = c0322f.f3459b;
        this.f3436g[i7] = f2;
        if (i3 != -1) {
            int[] iArr6 = this.f3435f;
            iArr6[i7] = iArr6[i3];
            iArr6[i3] = i7;
        } else {
            this.f3435f[i7] = this.h;
            this.h = i7;
        }
        c0322f.f3465k++;
        c0322f.a(c0318b);
        int i11 = this.f3431a + 1;
        this.f3431a = i11;
        if (!this.f3437j) {
            this.i++;
        }
        int[] iArr7 = this.f3434e;
        if (i11 >= iArr7.length) {
            this.f3437j = true;
        }
        if (this.i >= iArr7.length) {
            this.f3437j = true;
            this.i = iArr7.length - 1;
        }
    }

    public final float h(C0322f c0322f, boolean z2) {
        int i = this.h;
        if (i == -1) {
            return RecyclerView.f1570A0;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f3431a) {
            if (this.f3434e[i] == c0322f.f3459b) {
                if (i == this.h) {
                    this.h = this.f3435f[i];
                } else {
                    int[] iArr = this.f3435f;
                    iArr[i3] = iArr[i];
                }
                if (z2) {
                    c0322f.b(this.f3432b);
                }
                c0322f.f3465k--;
                this.f3431a--;
                this.f3434e[i] = -1;
                if (this.f3437j) {
                    this.i = i;
                }
                return this.f3436g[i];
            }
            i2++;
            i3 = i;
            i = this.f3435f[i];
        }
        return RecyclerView.f1570A0;
    }

    public final String toString() {
        int i = this.h;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.f3431a; i2++) {
            str = (V.f(str, " -> ") + this.f3436g[i] + " : ") + ((C0322f[]) this.f3433c.f426c)[this.f3434e[i]];
            i = this.f3435f[i];
        }
        return str;
    }
}
