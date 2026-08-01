package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class xl extends jt0 {
    public static final Object h = new Object();
    public long c;
    public int d;
    public w60 e;
    public Object f;
    public int g;

    public xl(long j) {
        super(j);
        w60 w60Var = ma0.a;
        w60Var.getClass();
        this.e = w60Var;
        this.f = h;
    }

    @Override // defpackage.jt0
    public final void a(jt0 jt0Var) {
        jt0Var.getClass();
        xl xlVar = (xl) jt0Var;
        this.e = xlVar.e;
        this.f = xlVar.f;
        this.g = xlVar.g;
    }

    @Override // defpackage.jt0
    public final jt0 b(long j) {
        return new xl(j);
    }

    public final boolean c(yl ylVar, or0 or0Var) {
        boolean z;
        boolean z2;
        Object obj = ur0.c;
        synchronized (obj) {
            z = true;
            if (this.c == or0Var.g()) {
                if (this.d == or0Var.h()) {
                    z2 = false;
                }
            }
            z2 = true;
        }
        if (this.f == h || (z2 && this.g != d(ylVar, or0Var))) {
            z = false;
        }
        if (!z || !z2) {
            return z;
        }
        synchronized (obj) {
            this.c = or0Var.g();
            this.d = or0Var.h();
        }
        return z;
    }

    public final int d(yl ylVar, or0 or0Var) {
        w60 w60Var;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        jt0 j;
        synchronized (ur0.c) {
            w60Var = this.e;
        }
        int i7 = 7;
        if (w60Var.e == 0) {
            return 7;
        }
        l70 h2 = ud0.h();
        Object[] objArr = h2.d;
        int i8 = h2.f;
        boolean z = false;
        for (int i9 = 0; i9 < i8; i9++) {
            ((oh) objArr[i9]).b();
        }
        try {
            Object[] objArr2 = w60Var.b;
            int[] iArr = w60Var.c;
            long[] jArr = w60Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                i = 7;
                int i10 = 0;
                while (true) {
                    long j2 = jArr[i10];
                    if ((((~j2) << i7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i11 = 8;
                        int i12 = 8 - ((~(i10 - length)) >>> 31);
                        int i13 = z ? 1 : 0;
                        while (i13 < i12) {
                            if ((255 & j2) < 128) {
                                int i14 = (i10 << 3) + i13;
                                i4 = i7;
                                ht0 ht0Var = (ht0) objArr2[i14];
                                i6 = i11;
                                if (iArr[i14] != 1) {
                                    i5 = length;
                                } else {
                                    if (ht0Var instanceof yl) {
                                        yl ylVar2 = (yl) ht0Var;
                                        j = ylVar2.g((xl) ur0.j(ylVar2.f, or0Var), or0Var, z, ylVar2.e);
                                    } else {
                                        j = ur0.j(ht0Var.a(), or0Var);
                                    }
                                    int identityHashCode = ((i * 31) + System.identityHashCode(j)) * 31;
                                    i5 = length;
                                    long j3 = j.a;
                                    i = identityHashCode + ((int) (j3 ^ (j3 >>> 32)));
                                }
                            } else {
                                i4 = i7;
                                i5 = length;
                                i6 = i11;
                            }
                            j2 >>= i6;
                            i13++;
                            i7 = i4;
                            i11 = i6;
                            length = i5;
                            z = false;
                        }
                        i2 = i7;
                        i3 = length;
                        if (i12 != i11) {
                            break;
                        }
                    } else {
                        i2 = i7;
                        i3 = length;
                    }
                    if (i10 == i3) {
                        i7 = i;
                        break;
                    }
                    i10++;
                    i7 = i2;
                    length = i3;
                    z = false;
                }
            }
            i = i7;
            Object[] objArr3 = h2.d;
            int i15 = h2.f;
            for (int i16 = 0; i16 < i15; i16++) {
                ((oh) objArr3[i16]).a();
            }
            return i;
        } catch (Throwable th) {
            Object[] objArr4 = h2.d;
            int i17 = h2.f;
            for (int i18 = 0; i18 < i17; i18++) {
                ((oh) objArr4[i18]).a();
            }
            throw th;
        }
    }
}
