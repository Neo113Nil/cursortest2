package yads;

import android.util.SparseArray;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class kz0 {
    public final c83 a;
    public final boolean b;
    public final boolean c;
    public final yb2 f;
    public byte[] g;
    public int h;
    public int i;
    public long j;
    public long l;
    public long p;
    public long q;
    public boolean r;
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();
    public jz0 m = new jz0();
    public jz0 n = new jz0();
    public boolean k = false;
    public boolean o = false;

    public kz0(c83 c83Var, boolean z, boolean z2) {
        this.a = c83Var;
        this.b = z;
        this.c = z2;
        byte[] bArr = new byte[128];
        this.g = bArr;
        this.f = new yb2(bArr, 0, 0);
        jz0 jz0Var = this.n;
        jz0Var.b = false;
        jz0Var.a = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(byte[] bArr, int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (this.k) {
            int i8 = i2 - i;
            byte[] bArr2 = this.g;
            int length = bArr2.length;
            int i9 = this.h + i8;
            if (length < i9) {
                this.g = Arrays.copyOf(bArr2, i9 * 2);
            }
            System.arraycopy(bArr, i, this.g, this.h, i8);
            int i10 = this.h + i8;
            this.h = i10;
            yb2 yb2Var = this.f;
            yb2Var.a = this.g;
            int i11 = 0;
            yb2Var.c = 0;
            yb2Var.b = i10;
            yb2Var.d = 0;
            yb2Var.a();
            if (this.f.a(8)) {
                this.f.f();
                int b = this.f.b(2);
                this.f.d(5);
                if (this.f.b()) {
                    this.f.d();
                    if (this.f.b()) {
                        int d = this.f.d();
                        if (!this.c) {
                            this.k = false;
                            jz0 jz0Var = this.n;
                            jz0Var.e = d;
                            jz0Var.b = true;
                            return;
                        }
                        if (this.f.b()) {
                            int d2 = this.f.d();
                            if (this.e.indexOfKey(d2) < 0) {
                                this.k = false;
                                return;
                            }
                            ny1 ny1Var = (ny1) this.e.get(d2);
                            oy1 oy1Var = (oy1) this.d.get(ny1Var.a);
                            if (oy1Var.h) {
                                if (!this.f.a(2)) {
                                    return;
                                } else {
                                    this.f.d(2);
                                }
                            }
                            if (this.f.a(oy1Var.j)) {
                                int b2 = this.f.b(oy1Var.j);
                                if (oy1Var.i) {
                                    z = false;
                                    z2 = false;
                                } else {
                                    if (!this.f.a(1)) {
                                        return;
                                    }
                                    z = this.f.c();
                                    if (z) {
                                        if (this.f.a(1)) {
                                            z2 = this.f.c();
                                            z3 = true;
                                            z4 = this.i != 5;
                                            if (z4) {
                                                i3 = 0;
                                            } else if (!this.f.b()) {
                                                return;
                                            } else {
                                                i3 = this.f.d();
                                            }
                                            i4 = oy1Var.k;
                                            if (i4 != 0) {
                                                if (!this.f.a(oy1Var.l)) {
                                                    return;
                                                }
                                                int b3 = this.f.b(oy1Var.l);
                                                if (!ny1Var.b || z) {
                                                    i5 = 0;
                                                    i7 = b3;
                                                    i6 = 0;
                                                } else {
                                                    if (!this.f.b()) {
                                                        return;
                                                    }
                                                    i5 = this.f.e();
                                                    i7 = b3;
                                                    i6 = 0;
                                                }
                                            } else if (i4 != 1 || oy1Var.m) {
                                                i5 = 0;
                                                i6 = 0;
                                                i7 = 0;
                                            } else {
                                                if (!this.f.b()) {
                                                    return;
                                                }
                                                int e = this.f.e();
                                                if (!ny1Var.b || z) {
                                                    i5 = 0;
                                                    i7 = 0;
                                                    i11 = e;
                                                    i6 = 0;
                                                } else {
                                                    if (!this.f.b()) {
                                                        return;
                                                    }
                                                    i7 = 0;
                                                    i11 = e;
                                                    i6 = this.f.e();
                                                    i5 = 0;
                                                }
                                            }
                                            jz0 jz0Var2 = this.n;
                                            jz0Var2.c = oy1Var;
                                            jz0Var2.d = b;
                                            jz0Var2.e = d;
                                            jz0Var2.f = b2;
                                            jz0Var2.g = d2;
                                            jz0Var2.h = z;
                                            jz0Var2.i = z3;
                                            jz0Var2.j = z2;
                                            jz0Var2.k = z4;
                                            jz0Var2.l = i3;
                                            jz0Var2.m = i7;
                                            jz0Var2.n = i5;
                                            jz0Var2.o = i11;
                                            jz0Var2.p = i6;
                                            jz0Var2.a = true;
                                            jz0Var2.b = true;
                                            this.k = false;
                                        }
                                        return;
                                    }
                                    z2 = false;
                                }
                                z3 = z2;
                                if (this.i != 5) {
                                }
                                if (z4) {
                                }
                                i4 = oy1Var.k;
                                if (i4 != 0) {
                                }
                                jz0 jz0Var22 = this.n;
                                jz0Var22.c = oy1Var;
                                jz0Var22.d = b;
                                jz0Var22.e = d;
                                jz0Var22.f = b2;
                                jz0Var22.g = d2;
                                jz0Var22.h = z;
                                jz0Var22.i = z3;
                                jz0Var22.j = z2;
                                jz0Var22.k = z4;
                                jz0Var22.l = i3;
                                jz0Var22.m = i7;
                                jz0Var22.n = i5;
                                jz0Var22.o = i11;
                                jz0Var22.p = i6;
                                jz0Var22.a = true;
                                jz0Var22.b = true;
                                this.k = false;
                            }
                        }
                    }
                }
            }
        }
    }
}
