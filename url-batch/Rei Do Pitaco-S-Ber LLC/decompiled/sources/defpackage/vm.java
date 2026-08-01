package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class vm {
    public final m8 a;
    public boolean c;
    public int g;
    public int h;
    public int b = Integer.MAX_VALUE;
    public int d = 4096;
    public mm[] e = new mm[8];
    public int f = 7;

    public vm(m8 m8Var) {
        this.a = m8Var;
    }

    public final void a(int i) {
        int i2;
        if (i > 0) {
            int length = this.e.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f;
                if (length < i2 || i <= 0) {
                    break;
                }
                mm mmVar = this.e[length];
                mmVar.getClass();
                i -= mmVar.c;
                int i4 = this.h;
                mm mmVar2 = this.e[length];
                mmVar2.getClass();
                this.h = i4 - mmVar2.c;
                this.g--;
                i3++;
                length--;
            }
            mm[] mmVarArr = this.e;
            int i5 = i2 + 1;
            System.arraycopy(mmVarArr, i5, mmVarArr, i5 + i3, this.g);
            mm[] mmVarArr2 = this.e;
            int i6 = this.f + 1;
            Arrays.fill(mmVarArr2, i6, i6 + i3, (Object) null);
            this.f += i3;
        }
    }

    public final void b(mm mmVar) {
        int i = mmVar.c;
        int i2 = this.d;
        if (i > i2) {
            mm[] mmVarArr = this.e;
            o6.q0(mmVarArr, 0, mmVarArr.length);
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
            return;
        }
        a((this.h + i) - i2);
        int i3 = this.g + 1;
        mm[] mmVarArr2 = this.e;
        if (i3 > mmVarArr2.length) {
            mm[] mmVarArr3 = new mm[mmVarArr2.length * 2];
            System.arraycopy(mmVarArr2, 0, mmVarArr3, mmVarArr2.length, mmVarArr2.length);
            this.f = this.e.length - 1;
            this.e = mmVarArr3;
        }
        int i4 = this.f;
        this.f = i4 - 1;
        this.e[i4] = mmVar;
        this.g++;
        this.h += i;
    }

    public final void c(r8 r8Var) {
        r8Var.getClass();
        int[] iArr = yn.a;
        int a = r8Var.a();
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < a; i++) {
            byte d = r8Var.d(i);
            byte[] bArr = z60.a;
            j2 += yn.b[d & 255];
        }
        int i2 = (int) ((j2 + 7) >> 3);
        int a2 = r8Var.a();
        m8 m8Var = this.a;
        if (i2 >= a2) {
            e(r8Var.a(), 127, 0);
            r8Var.i(m8Var, r8Var.a());
            return;
        }
        m8 m8Var2 = new m8();
        int[] iArr2 = yn.a;
        int a3 = r8Var.a();
        int i3 = 0;
        for (int i4 = 0; i4 < a3; i4++) {
            byte d2 = r8Var.d(i4);
            byte[] bArr2 = z60.a;
            int i5 = d2 & 255;
            int i6 = yn.a[i5];
            byte b = yn.b[i5];
            j = (j << b) | i6;
            i3 += b;
            while (i3 >= 8) {
                i3 -= 8;
                m8Var2.w((int) (j >> i3));
            }
        }
        if (i3 > 0) {
            m8Var2.w((int) ((j << (8 - i3)) | (255 >>> i3)));
        }
        r8 c = m8Var2.c(m8Var2.g);
        e(c.a(), 127, 128);
        c.i(m8Var, c.a());
    }

    public final void d(ArrayList arrayList) {
        int i;
        int i2;
        if (this.c) {
            int i3 = this.b;
            if (i3 < this.d) {
                e(i3, 31, 32);
            }
            this.c = false;
            this.b = Integer.MAX_VALUE;
            e(this.d, 31, 32);
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            mm mmVar = (mm) arrayList.get(i4);
            r8 g = mmVar.a.g();
            r8 r8Var = mmVar.b;
            Integer num = (Integer) wm.b.get(g);
            if (num != null) {
                int intValue = num.intValue();
                i2 = intValue + 1;
                if (2 <= i2 && i2 < 8) {
                    mm[] mmVarArr = wm.a;
                    if (oo.b(mmVarArr[intValue].b, r8Var)) {
                        i = i2;
                    } else if (oo.b(mmVarArr[i2].b, r8Var)) {
                        i2 = intValue + 2;
                        i = i2;
                    }
                }
                i = i2;
                i2 = -1;
            } else {
                i = -1;
                i2 = -1;
            }
            if (i2 == -1) {
                int i5 = this.f + 1;
                int length = this.e.length;
                while (true) {
                    if (i5 >= length) {
                        break;
                    }
                    mm mmVar2 = this.e[i5];
                    mmVar2.getClass();
                    if (oo.b(mmVar2.a, g)) {
                        mm mmVar3 = this.e[i5];
                        mmVar3.getClass();
                        if (oo.b(mmVar3.b, r8Var)) {
                            i2 = wm.a.length + (i5 - this.f);
                            break;
                        } else if (i == -1) {
                            i = (i5 - this.f) + wm.a.length;
                        }
                    }
                    i5++;
                }
            }
            if (i2 != -1) {
                e(i2, 127, 128);
            } else if (i == -1) {
                this.a.w(64);
                c(g);
                c(r8Var);
                b(mmVar);
            } else {
                r8 r8Var2 = mm.d;
                g.getClass();
                r8Var2.getClass();
                if (!g.f(r8Var2, r8Var2.a()) || oo.b(mm.i, g)) {
                    e(i, 63, 64);
                    c(r8Var);
                    b(mmVar);
                } else {
                    e(i, 15, 0);
                    c(r8Var);
                }
            }
        }
    }

    public final void e(int i, int i2, int i3) {
        m8 m8Var = this.a;
        if (i < i2) {
            m8Var.w(i | i3);
            return;
        }
        m8Var.w(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            m8Var.w(128 | (i4 & 127));
            i4 >>>= 7;
        }
        m8Var.w(i4);
    }
}
