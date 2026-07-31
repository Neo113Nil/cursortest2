package yads;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class v93 implements ix2 {
    public final wb2 a = new wb2(new byte[5]);
    public final SparseArray b = new SparseArray();
    public final SparseIntArray c = new SparseIntArray();
    public final int d;
    public final /* synthetic */ w93 e;

    public v93(w93 w93Var, int i) {
        this.e = w93Var;
        this.d = i;
    }

    @Override // yads.ix2
    public final void a(m73 m73Var, wp0 wp0Var, z93 z93Var) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x015b, code lost:
    
        if (r25.k() == r15) goto L55;
     */
    @Override // yads.ix2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(xb2 xb2Var) {
        m73 m73Var;
        int i;
        int i2;
        aa3 a;
        int i3;
        if (xb2Var.k() != 2) {
            return;
        }
        w93 w93Var = this.e;
        int i4 = w93Var.a;
        int i5 = 0;
        if (i4 == 1 || i4 == 2 || w93Var.m == 1) {
            m73Var = (m73) w93Var.c.get(0);
        } else {
            m73Var = new m73(((m73) w93Var.c.get(0)).a());
            this.e.c.add(m73Var);
        }
        if ((xb2Var.k() & 128) == 0) {
            return;
        }
        xb2Var.e(xb2Var.b + 1);
        int p = xb2Var.p();
        int i6 = 3;
        xb2Var.e(xb2Var.b + 3);
        wb2 wb2Var = this.a;
        xb2Var.a(wb2Var.a, 0, 2);
        wb2Var.b(0);
        this.a.c(3);
        int i7 = 13;
        this.e.s = this.a.a(13);
        wb2 wb2Var2 = this.a;
        xb2Var.a(wb2Var2.a, 0, 2);
        wb2Var2.b(0);
        int i8 = 4;
        this.a.c(4);
        int i9 = 12;
        xb2Var.e(xb2Var.b + this.a.a(12));
        w93 w93Var2 = this.e;
        int i10 = 21;
        if (w93Var2.a == 2 && w93Var2.q == null) {
            y93 y93Var = new y93(21, null, null, sb3.f);
            w93 w93Var3 = this.e;
            w93Var3.q = w93Var3.f.a(21, y93Var);
            w93 w93Var4 = this.e;
            aa3 aa3Var = w93Var4.q;
            if (aa3Var != null) {
                aa3Var.a(m73Var, w93Var4.l, new z93(p, 21, 8192));
            }
        }
        this.b.clear();
        this.c.clear();
        int i11 = xb2Var.c - xb2Var.b;
        while (i11 > 0) {
            wb2 wb2Var3 = this.a;
            int i12 = 5;
            xb2Var.a(wb2Var3.a, i5, 5);
            wb2Var3.b(i5);
            int a2 = this.a.a(8);
            this.a.c(i6);
            int a3 = this.a.a(i7);
            this.a.c(i8);
            int a4 = this.a.a(i9);
            int i13 = xb2Var.b;
            int i14 = i13 + a4;
            int i15 = -1;
            String str = null;
            ArrayList arrayList = null;
            while (true) {
                if (xb2Var.b >= i14) {
                    i = i8;
                    break;
                }
                int k = xb2Var.k();
                int k2 = xb2Var.b + xb2Var.k();
                if (k2 > i14) {
                    i = 4;
                    break;
                }
                if (k == i12) {
                    long l = xb2Var.l();
                    if (l != 1094921523) {
                        if (l != 1161904947) {
                            if (l != 1094921524) {
                                if (l == 1212503619) {
                                    i15 = 36;
                                }
                                i3 = 4;
                                int i16 = xb2Var.b;
                                xb2Var.e((k2 - i16) + i16);
                                i8 = i3;
                                i12 = 5;
                                i6 = 3;
                                i10 = 21;
                            }
                            i15 = 172;
                            i3 = 4;
                            int i162 = xb2Var.b;
                            xb2Var.e((k2 - i162) + i162);
                            i8 = i3;
                            i12 = 5;
                            i6 = 3;
                            i10 = 21;
                        }
                        i15 = 135;
                        i3 = 4;
                        int i1622 = xb2Var.b;
                        xb2Var.e((k2 - i1622) + i1622);
                        i8 = i3;
                        i12 = 5;
                        i6 = 3;
                        i10 = 21;
                    }
                    i15 = 129;
                    i3 = 4;
                    int i16222 = xb2Var.b;
                    xb2Var.e((k2 - i16222) + i16222);
                    i8 = i3;
                    i12 = 5;
                    i6 = 3;
                    i10 = 21;
                } else {
                    if (k != 106) {
                        if (k != 122) {
                            if (k != 127) {
                                if (k == 123) {
                                    i15 = 138;
                                } else if (k == 10) {
                                    str = xb2Var.a(i6, zt.c).trim();
                                } else {
                                    if (k == 89) {
                                        ArrayList arrayList2 = new ArrayList();
                                        while (xb2Var.b < k2) {
                                            String trim = xb2Var.a(i6, zt.c).trim();
                                            xb2Var.k();
                                            byte[] bArr = new byte[4];
                                            xb2Var.a(bArr, 0, 4);
                                            arrayList2.add(new x93(trim, bArr));
                                            i6 = 3;
                                        }
                                        i3 = 4;
                                        arrayList = arrayList2;
                                        i15 = 89;
                                    } else {
                                        i3 = 4;
                                        if (k == 111) {
                                            i15 = 257;
                                        }
                                    }
                                    int i162222 = xb2Var.b;
                                    xb2Var.e((k2 - i162222) + i162222);
                                    i8 = i3;
                                    i12 = 5;
                                    i6 = 3;
                                    i10 = 21;
                                }
                            }
                            i3 = 4;
                            int i1622222 = xb2Var.b;
                            xb2Var.e((k2 - i1622222) + i1622222);
                            i8 = i3;
                            i12 = 5;
                            i6 = 3;
                            i10 = 21;
                        }
                        i15 = 135;
                        i3 = 4;
                        int i16222222 = xb2Var.b;
                        xb2Var.e((k2 - i16222222) + i16222222);
                        i8 = i3;
                        i12 = 5;
                        i6 = 3;
                        i10 = 21;
                    }
                    i15 = 129;
                    i3 = 4;
                    int i162222222 = xb2Var.b;
                    xb2Var.e((k2 - i162222222) + i162222222);
                    i8 = i3;
                    i12 = 5;
                    i6 = 3;
                    i10 = 21;
                }
            }
            xb2Var.e(i14);
            y93 y93Var2 = new y93(i15, str, arrayList, Arrays.copyOfRange(xb2Var.a, i13, i14));
            if (a2 == 6 || a2 == 5) {
                a2 = i15;
            }
            i11 -= a4 + 5;
            w93 w93Var5 = this.e;
            int i17 = w93Var5.a == 2 ? a2 : a3;
            if (w93Var5.h.get(i17)) {
                i2 = 21;
            } else {
                w93 w93Var6 = this.e;
                if (w93Var6.a == 2) {
                    i2 = 21;
                    if (a2 == 21) {
                        a = w93Var6.q;
                        if (this.e.a == 2 || a3 < this.c.get(i17, 8192)) {
                            this.c.put(i17, a3);
                            this.b.put(i17, a);
                        }
                    }
                } else {
                    i2 = 21;
                }
                a = w93Var6.f.a(a2, y93Var2);
                if (this.e.a == 2) {
                }
                this.c.put(i17, a3);
                this.b.put(i17, a);
            }
            i8 = i;
            i10 = i2;
            i5 = 0;
            i6 = 3;
            i7 = 13;
            i9 = 12;
        }
        int size = this.c.size();
        for (int i18 = 0; i18 < size; i18++) {
            int keyAt = this.c.keyAt(i18);
            int valueAt = this.c.valueAt(i18);
            this.e.h.put(keyAt, true);
            this.e.i.put(valueAt, true);
            aa3 aa3Var2 = (aa3) this.b.valueAt(i18);
            if (aa3Var2 != null) {
                w93 w93Var7 = this.e;
                if (aa3Var2 != w93Var7.q) {
                    aa3Var2.a(m73Var, w93Var7.l, new z93(p, keyAt, 8192));
                }
                this.e.g.put(valueAt, aa3Var2);
            }
        }
        w93 w93Var8 = this.e;
        if (w93Var8.a == 2) {
            if (w93Var8.n) {
                return;
            }
            w93Var8.l.a();
            w93 w93Var9 = this.e;
            w93Var9.m = 0;
            w93Var9.n = true;
            return;
        }
        w93Var8.g.remove(this.d);
        w93 w93Var10 = this.e;
        int i19 = w93Var10.a == 1 ? 0 : w93Var10.m - 1;
        w93Var10.m = i19;
        if (i19 == 0) {
            w93Var10.l.a();
            this.e.n = true;
        }
    }
}
