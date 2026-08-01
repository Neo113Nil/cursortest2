package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class um {
    public final px c;
    public int f;
    public int g;
    public int a = 4096;
    public final ArrayList b = new ArrayList();
    public mm[] d = new mm[8];
    public int e = 7;

    public um(on onVar) {
        this.c = new px(onVar);
    }

    public final int a(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.d.length;
            while (true) {
                length--;
                i2 = this.e;
                if (length < i2 || i <= 0) {
                    break;
                }
                mm mmVar = this.d[length];
                mmVar.getClass();
                int i4 = mmVar.c;
                i -= i4;
                this.g -= i4;
                this.f--;
                i3++;
            }
            mm[] mmVarArr = this.d;
            System.arraycopy(mmVarArr, i2 + 1, mmVarArr, i2 + 1 + i3, this.f);
            this.e += i3;
        }
        return i3;
    }

    public final r8 b(int i) {
        if (i >= 0) {
            mm[] mmVarArr = wm.a;
            if (i <= mmVarArr.length - 1) {
                return mmVarArr[i].a;
            }
        }
        int length = this.e + 1 + (i - wm.a.length);
        if (length >= 0) {
            mm[] mmVarArr2 = this.d;
            if (length < mmVarArr2.length) {
                mm mmVar = mmVarArr2[length];
                mmVar.getClass();
                return mmVar.a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void c(mm mmVar) {
        this.b.add(mmVar);
        int i = mmVar.c;
        int i2 = this.a;
        if (i > i2) {
            mm[] mmVarArr = this.d;
            o6.q0(mmVarArr, 0, mmVarArr.length);
            this.e = this.d.length - 1;
            this.f = 0;
            this.g = 0;
            return;
        }
        a((this.g + i) - i2);
        int i3 = this.f + 1;
        mm[] mmVarArr2 = this.d;
        if (i3 > mmVarArr2.length) {
            mm[] mmVarArr3 = new mm[mmVarArr2.length * 2];
            System.arraycopy(mmVarArr2, 0, mmVarArr3, mmVarArr2.length, mmVarArr2.length);
            this.e = this.d.length - 1;
            this.d = mmVarArr3;
        }
        int i4 = this.e;
        this.e = i4 - 1;
        this.d[i4] = mmVar;
        this.f++;
        this.g += i;
    }

    public final r8 d() {
        px pxVar = this.c;
        byte readByte = pxVar.readByte();
        byte[] bArr = z60.a;
        int i = readByte & 255;
        int i2 = 0;
        boolean z = (readByte & 128) == 128;
        long e = e(i, 127);
        if (!z) {
            return pxVar.c(e);
        }
        m8 m8Var = new m8();
        int[] iArr = yn.a;
        pxVar.getClass();
        kc kcVar = yn.c;
        kc kcVar2 = kcVar;
        int i3 = 0;
        for (long j = 0; j < e; j++) {
            byte readByte2 = pxVar.readByte();
            byte[] bArr2 = z60.a;
            i2 = (i2 << 8) | (readByte2 & 255);
            i3 += 8;
            while (i3 >= 8) {
                kc[] kcVarArr = (kc[]) kcVar2.c;
                kcVarArr.getClass();
                kcVar2 = kcVarArr[(i2 >>> (i3 - 8)) & 255];
                kcVar2.getClass();
                if (((kc[]) kcVar2.c) == null) {
                    m8Var.w(kcVar2.a);
                    i3 -= kcVar2.b;
                    kcVar2 = kcVar;
                } else {
                    i3 -= 8;
                }
            }
        }
        while (i3 > 0) {
            kc[] kcVarArr2 = (kc[]) kcVar2.c;
            kcVarArr2.getClass();
            kc kcVar3 = kcVarArr2[(i2 << (8 - i3)) & 255];
            kcVar3.getClass();
            int i4 = kcVar3.b;
            if (((kc[]) kcVar3.c) != null || i4 > i3) {
                break;
            }
            m8Var.w(kcVar3.a);
            i3 -= i4;
            kcVar2 = kcVar;
        }
        return m8Var.c(m8Var.g);
    }

    public final int e(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte readByte = this.c.readByte();
            byte[] bArr = z60.a;
            int i5 = readByte & 255;
            if ((readByte & 128) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (readByte & Byte.MAX_VALUE) << i4;
            i4 += 7;
        }
    }
}
