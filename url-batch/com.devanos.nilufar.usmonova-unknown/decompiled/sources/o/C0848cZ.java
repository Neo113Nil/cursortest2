package o;

/* renamed from: o.cZ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0848cZ implements ZY {
    public final C2274yD h;
    public final C2340zD i;
    public final int j;
    public final InterfaceC2372zj k;
    public int[] l;
    public float[] m;
    public V3 n;

    /* renamed from: o, reason: collision with root package name */
    public V3 f150o;
    public V3 p;
    public V3 q;
    public float[] r;
    public float[] s;
    public Y1 t;

    public C0848cZ(C2274yD c2274yD, C2340zD c2340zD, int i, InterfaceC2372zj interfaceC2372zj) {
        this.h = c2274yD;
        this.i = c2340zD;
        this.j = i;
        this.k = interfaceC2372zj;
    }

    public final int b(int i) {
        int i2;
        C2274yD c2274yD = this.h;
        int i3 = c2274yD.b;
        if (i3 < 0) {
            throw new IllegalArgumentException("fromIndex(0) > toIndex(" + i3 + ')');
        }
        int i4 = i3 - 1;
        int i5 = 0;
        while (true) {
            if (i5 <= i4) {
                i2 = (i5 + i4) >>> 1;
                int c = c2274yD.c(i2);
                if (c >= i) {
                    if (c <= i) {
                        break;
                    }
                    i4 = i2 - 1;
                } else {
                    i5 = i2 + 1;
                }
            } else {
                i2 = -(i5 + 1);
                break;
            }
        }
        return i2 < -1 ? -(i2 + 2) : i2;
    }

    public final float c(int i, int i2, boolean z) {
        InterfaceC2372zj interfaceC2372zj;
        float f;
        C2274yD c2274yD = this.h;
        if (i >= c2274yD.b - 1) {
            f = i2;
        } else {
            int c = c2274yD.c(i);
            int c2 = c2274yD.c(i + 1);
            if (i2 == c) {
                f = c;
            } else {
                int i3 = c2 - c;
                C0783bZ c0783bZ = (C0783bZ) this.i.e(c);
                if (c0783bZ == null || (interfaceC2372zj = c0783bZ.b) == null) {
                    interfaceC2372zj = this.k;
                }
                float f2 = i3;
                float a = interfaceC2372zj.a((i2 - c) / f2);
                if (z) {
                    return a;
                }
                f = (f2 * a) + c;
            }
        }
        return f / 1000;
    }

    @Override // o.ZY
    public final int d() {
        return 0;
    }

    public final void e(V3 v3, V3 v32, V3 v33) {
        float[] fArr;
        float[] fArr2;
        boolean z = this.t != null;
        V3 v34 = this.n;
        C2340zD c2340zD = this.i;
        C2274yD c2274yD = this.h;
        if (v34 == null) {
            this.n = v3.c();
            this.f150o = v33.c();
            int i = c2274yD.b;
            float[] fArr3 = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr3[i2] = c2274yD.c(i2) / 1000;
            }
            this.m = fArr3;
            int i3 = c2274yD.b;
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                iArr[i4] = 0;
            }
            this.l = iArr;
        }
        if (z) {
            if (this.t != null) {
                V3 v35 = this.p;
                if (v35 == null) {
                    AbstractC0048Bt.i0("lastInitialValue");
                    throw null;
                }
                if (v35.equals(v3)) {
                    V3 v36 = this.q;
                    if (v36 == null) {
                        AbstractC0048Bt.i0("lastTargetValue");
                        throw null;
                    }
                    if (v36.equals(v32)) {
                        return;
                    }
                }
            }
            this.p = v3;
            this.q = v32;
            int b = v3.b() + (v3.b() % 2);
            this.r = new float[b];
            this.s = new float[b];
            int i5 = c2274yD.b;
            float[][] fArr4 = new float[i5][];
            for (int i6 = 0; i6 < i5; i6++) {
                int c = c2274yD.c(i6);
                if (c != 0) {
                    if (c != this.j) {
                        fArr = new float[b];
                        Object e = c2340zD.e(c);
                        AbstractC0048Bt.k(e);
                        V3 v37 = ((C0783bZ) e).a;
                        for (int i7 = 0; i7 < b; i7++) {
                            fArr[i7] = v37.a(i7);
                        }
                    } else if (c2340zD.b(c)) {
                        fArr = new float[b];
                        Object e2 = c2340zD.e(c);
                        AbstractC0048Bt.k(e2);
                        V3 v38 = ((C0783bZ) e2).a;
                        for (int i8 = 0; i8 < b; i8++) {
                            fArr[i8] = v38.a(i8);
                        }
                    } else {
                        fArr2 = new float[b];
                        for (int i9 = 0; i9 < b; i9++) {
                            fArr2[i9] = v32.a(i9);
                        }
                    }
                    fArr2 = fArr;
                } else if (c2340zD.b(c)) {
                    fArr = new float[b];
                    Object e3 = c2340zD.e(c);
                    AbstractC0048Bt.k(e3);
                    V3 v39 = ((C0783bZ) e3).a;
                    for (int i10 = 0; i10 < b; i10++) {
                        fArr[i10] = v39.a(i10);
                    }
                    fArr2 = fArr;
                } else {
                    fArr2 = new float[b];
                    for (int i11 = 0; i11 < b; i11++) {
                        fArr2[i11] = v3.a(i11);
                    }
                }
                fArr4[i6] = fArr2;
            }
            int[] iArr2 = this.l;
            if (iArr2 == null) {
                AbstractC0048Bt.i0("modes");
                throw null;
            }
            float[] fArr5 = this.m;
            if (fArr5 == null) {
                AbstractC0048Bt.i0("times");
                throw null;
            }
            this.t = new Y1(iArr2, fArr5, fArr4);
        }
    }

    @Override // o.YY
    public final V3 f(long j, V3 v3, V3 v32, V3 v33) {
        int i;
        Throwable th;
        int i2;
        int i3;
        boolean z;
        V3 v34 = v3;
        V3 v35 = v32;
        int i4 = 0;
        int i5 = this.j;
        int r = (int) AbstractC1807r8.r((j / 1000000) - 0, 0L, i5);
        C2340zD c2340zD = this.i;
        if (c2340zD.b(r)) {
            Object e = c2340zD.e(r);
            AbstractC0048Bt.k(e);
            return ((C0783bZ) e).a;
        }
        if (r >= i5) {
            return v35;
        }
        if (r <= 0) {
            return v34;
        }
        e(v34, v35, v33);
        boolean z2 = true;
        if (this.t == null) {
            int b = b(r);
            float c = c(b, r, true);
            C2274yD c2274yD = this.h;
            int c2 = c2274yD.c(b);
            if (c2340zD.b(c2)) {
                Object e2 = c2340zD.e(c2);
                AbstractC0048Bt.k(e2);
                v34 = ((C0783bZ) e2).a;
            }
            int c3 = c2274yD.c(b + 1);
            if (c2340zD.b(c3)) {
                Object e3 = c2340zD.e(c3);
                AbstractC0048Bt.k(e3);
                v35 = ((C0783bZ) e3).a;
            }
            V3 v36 = this.n;
            if (v36 == null) {
                AbstractC0048Bt.i0("valueVector");
                throw null;
            }
            int b2 = v36.b();
            for (int i6 = 0; i6 < b2; i6++) {
                V3 v37 = this.n;
                if (v37 == null) {
                    AbstractC0048Bt.i0("valueVector");
                    throw null;
                }
                float a = v34.a(i6);
                float a2 = v35.a(i6);
                C0208Hx c0208Hx = VY.a;
                v37.d((a2 * c) + ((1 - c) * a), i6);
            }
            V3 v38 = this.n;
            if (v38 != null) {
                return v38;
            }
            AbstractC0048Bt.i0("valueVector");
            throw null;
        }
        float c4 = c(b(r), r, false);
        Y1 y1 = this.t;
        if (y1 == null) {
            AbstractC0048Bt.i0("arcSpline");
            throw null;
        }
        float[] fArr = this.r;
        if (fArr == null) {
            AbstractC0048Bt.i0("posArray");
            throw null;
        }
        C2333z6[][] c2333z6Arr = (C2333z6[][]) y1.i;
        float f = c2333z6Arr[0][0].a;
        if (c4 >= f && c4 <= c2333z6Arr[c2333z6Arr.length - 1][0].b) {
            int length = c2333z6Arr.length;
            int i7 = 0;
            boolean z3 = false;
            while (true) {
                if (i7 >= length) {
                    i = i4;
                    th = null;
                    break;
                }
                int i8 = i4;
                int i9 = i8;
                while (i8 < fArr.length) {
                    C2333z6 c2333z6 = c2333z6Arr[i7][i9];
                    if (c4 <= c2333z6.b) {
                        if (c2333z6.r) {
                            float f2 = c2333z6.a;
                            i3 = i4;
                            float f3 = c2333z6.k;
                            float f4 = c2333z6.c;
                            z = z2;
                            fArr[i8] = ((c2333z6.e - f4) * (c4 - f2) * f3) + f4;
                            float f5 = (c4 - f2) * f3;
                            float f6 = c2333z6.d;
                            fArr[i8 + 1] = ((c2333z6.f - f6) * f5) + f6;
                        } else {
                            i3 = i4;
                            z = z2;
                            c2333z6.c(c4);
                            C2333z6 c2333z62 = c2333z6Arr[i7][i9];
                            fArr[i8] = (c2333z62.l * c2333z62.h) + c2333z62.n;
                            fArr[i8 + 1] = (c2333z62.m * c2333z62.i) + c2333z62.f253o;
                        }
                        z3 = z;
                    } else {
                        i3 = i4;
                        z = z2;
                    }
                    i8 += 2;
                    i9++;
                    i4 = i3;
                    z2 = z;
                }
                i = i4;
                boolean z4 = z2;
                th = null;
                if (z3) {
                    break;
                }
                i7++;
                i4 = i;
                z2 = z4;
            }
        } else {
            i = 0;
            th = null;
            if (c4 > c2333z6Arr[c2333z6Arr.length - 1][0].b) {
                i2 = c2333z6Arr.length - 1;
                f = c2333z6Arr[c2333z6Arr.length - 1][0].b;
            } else {
                i2 = 0;
            }
            float f7 = c4 - f;
            int i10 = 0;
            int i11 = 0;
            while (i10 < fArr.length) {
                C2333z6 c2333z63 = c2333z6Arr[i2][i11];
                if (c2333z63.r) {
                    float f8 = c2333z63.a;
                    float f9 = c2333z63.k;
                    float f10 = c2333z63.c;
                    fArr[i10] = (c2333z63.n * f7) + ((c2333z63.e - f10) * (f - f8) * f9) + f10;
                    float f11 = (f - f8) * f9;
                    float f12 = c2333z63.d;
                    fArr[i10 + 1] = (c2333z63.f253o * f7) + ((c2333z63.f - f12) * f11) + f12;
                } else {
                    c2333z63.c(f);
                    C2333z6 c2333z64 = c2333z6Arr[i2][i11];
                    fArr[i10] = (c2333z64.a() * f7) + (c2333z64.l * c2333z64.h) + c2333z64.n;
                    C2333z6 c2333z65 = c2333z6Arr[i2][i11];
                    fArr[i10 + 1] = (c2333z65.b() * f7) + (c2333z65.m * c2333z65.i) + c2333z65.f253o;
                }
                i10 += 2;
                i11++;
            }
        }
        float[] fArr2 = this.r;
        if (fArr2 == null) {
            AbstractC0048Bt.i0("posArray");
            throw th;
        }
        int length2 = fArr2.length;
        for (int i12 = i; i12 < length2; i12++) {
            V3 v39 = this.n;
            if (v39 == null) {
                AbstractC0048Bt.i0("valueVector");
                throw th;
            }
            float[] fArr3 = this.r;
            if (fArr3 == null) {
                AbstractC0048Bt.i0("posArray");
                throw th;
            }
            v39.d(fArr3[i12], i12);
        }
        V3 v310 = this.n;
        if (v310 != null) {
            return v310;
        }
        AbstractC0048Bt.i0("valueVector");
        throw th;
    }

    @Override // o.ZY
    public final int i() {
        return this.j;
    }

    @Override // o.YY
    public final V3 j(long j, V3 v3, V3 v32, V3 v33) {
        int i = 0;
        long r = AbstractC1807r8.r((j / 1000000) - 0, 0L, this.j);
        if (r < 0) {
            return v33;
        }
        e(v3, v32, v33);
        if (this.t == null) {
            V3 f = f((r - 1) * 1000000, v3, v32, v33);
            V3 f2 = f(r * 1000000, v3, v32, v33);
            int b = f.b();
            while (i < b) {
                V3 v34 = this.f150o;
                if (v34 == null) {
                    AbstractC0048Bt.i0("velocityVector");
                    throw null;
                }
                v34.d((f.a(i) - f2.a(i)) * 1000.0f, i);
                i++;
            }
            V3 v35 = this.f150o;
            if (v35 != null) {
                return v35;
            }
            AbstractC0048Bt.i0("velocityVector");
            throw null;
        }
        int i2 = (int) r;
        float c = c(b(i2), i2, false);
        Y1 y1 = this.t;
        if (y1 == null) {
            AbstractC0048Bt.i0("arcSpline");
            throw null;
        }
        float[] fArr = this.s;
        if (fArr == null) {
            AbstractC0048Bt.i0("slopeArray");
            throw null;
        }
        C2333z6[][] c2333z6Arr = (C2333z6[][]) y1.i;
        float f3 = c2333z6Arr[0][0].a;
        if (c < f3) {
            c = f3;
        } else if (c > c2333z6Arr[c2333z6Arr.length - 1][0].b) {
            c = c2333z6Arr[c2333z6Arr.length - 1][0].b;
        }
        int length = c2333z6Arr.length;
        boolean z = false;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = 0;
            int i5 = 0;
            while (i4 < fArr.length) {
                C2333z6 c2333z6 = c2333z6Arr[i3][i5];
                if (c <= c2333z6.b) {
                    if (c2333z6.r) {
                        fArr[i4] = c2333z6.n;
                        fArr[i4 + 1] = c2333z6.f253o;
                    } else {
                        c2333z6.c(c);
                        fArr[i4] = c2333z6Arr[i3][i5].a();
                        fArr[i4 + 1] = c2333z6Arr[i3][i5].b();
                    }
                    z = true;
                }
                i4 += 2;
                i5++;
            }
            if (z) {
                break;
            }
        }
        float[] fArr2 = this.s;
        if (fArr2 == null) {
            AbstractC0048Bt.i0("slopeArray");
            throw null;
        }
        int length2 = fArr2.length;
        while (i < length2) {
            V3 v36 = this.f150o;
            if (v36 == null) {
                AbstractC0048Bt.i0("velocityVector");
                throw null;
            }
            float[] fArr3 = this.s;
            if (fArr3 == null) {
                AbstractC0048Bt.i0("slopeArray");
                throw null;
            }
            v36.d(fArr3[i], i);
            i++;
        }
        V3 v37 = this.f150o;
        if (v37 != null) {
            return v37;
        }
        AbstractC0048Bt.i0("velocityVector");
        throw null;
    }
}
