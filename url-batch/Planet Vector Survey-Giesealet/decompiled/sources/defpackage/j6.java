package defpackage;

import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class j6 implements g50 {
    public final p6 a;

    public j6(p6 p6Var) {
        this.a = p6Var;
    }

    @Override // defpackage.g50
    public final e40 f(f40 f40Var, List list, long j) {
        yf0 yf0Var;
        yf0 yf0Var2;
        int i;
        int i2;
        int i3;
        int size = list.size();
        yf0[] yf0VarArr = new yf0[size];
        int size2 = list.size();
        long j2 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            yf0Var = null;
            if (i5 >= size2) {
                break;
            }
            b50 b50Var = (b50) list.get(i5);
            Object f = b50Var.f();
            m6 m6Var = f instanceof m6 ? (m6) f : null;
            if (m6Var != null && ((Boolean) m6Var.a.getValue()).booleanValue()) {
                yf0 d = b50Var.d(j);
                long c = px0.c(d.d, d.e);
                yf0VarArr[i5] = d;
                j2 = c;
            }
            i5++;
        }
        int size3 = list.size();
        for (int i6 = 0; i6 < size3; i6++) {
            b50 b50Var2 = (b50) list.get(i6);
            if (yf0VarArr[i6] == null) {
                yf0VarArr[i6] = b50Var2.d(j);
            }
        }
        if (f40Var.f0()) {
            i2 = (int) (j2 >> 32);
        } else {
            if (size == 0) {
                yf0Var2 = null;
            } else {
                yf0Var2 = yf0VarArr[0];
                int i7 = size - 1;
                if (i7 != 0) {
                    int i8 = yf0Var2 != null ? yf0Var2.d : 0;
                    int i9 = new ez(1, i7, 1).e;
                    boolean z = 1 <= i9;
                    int i10 = z ? 1 : i9;
                    while (z) {
                        if (i10 != i9) {
                            i = i10 + 1;
                            z = z;
                        } else {
                            if (!z) {
                                g8.k();
                                return null;
                            }
                            z = false;
                            i = i10;
                        }
                        yf0 yf0Var3 = yf0VarArr[i10];
                        int i11 = yf0Var3 != null ? yf0Var3.d : 0;
                        if (i8 < i11) {
                            yf0Var2 = yf0Var3;
                            i10 = i;
                            i8 = i11;
                        } else {
                            i10 = i;
                        }
                    }
                }
            }
            i2 = yf0Var2 != null ? yf0Var2.d : 0;
        }
        if (f40Var.f0()) {
            i4 = (int) (4294967295L & j2);
        } else {
            if (size != 0) {
                yf0 yf0Var4 = yf0VarArr[0];
                int i12 = size - 1;
                if (i12 != 0) {
                    int i13 = yf0Var4 != null ? yf0Var4.e : 0;
                    int i14 = new ez(1, i12, 1).e;
                    boolean z2 = 1 <= i14;
                    int i15 = z2 ? 1 : i14;
                    while (z2) {
                        if (i15 != i14) {
                            i3 = i15 + 1;
                            z2 = z2;
                        } else {
                            if (!z2) {
                                g8.k();
                                return null;
                            }
                            z2 = false;
                            i3 = i15;
                        }
                        yf0 yf0Var5 = yf0VarArr[i15];
                        int i16 = yf0Var5 != null ? yf0Var5.e : 0;
                        i15 = i3;
                        if (i13 < i16) {
                            yf0Var4 = yf0Var5;
                            i13 = i16;
                        }
                    }
                }
                yf0Var = yf0Var4;
            }
            if (yf0Var != null) {
                i4 = yf0Var.e;
            }
        }
        if (!f40Var.f0()) {
            this.a.c.setValue(new iz(px0.c(i2, i4)));
        }
        return f40Var.h0(i2, i4, xp.d, new i6(yf0VarArr, this, i2, i4));
    }
}
