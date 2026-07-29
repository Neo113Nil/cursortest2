package o;

import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: o.yr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2314yr {
    public final JL c;
    public int f;
    public int g;
    public int a = 4096;
    public final ArrayList b = new ArrayList();
    public C1721pr[] d = new C1721pr[8];
    public int e = 7;

    public C2314yr(C0513Tr c0513Tr) {
        this.c = AbstractC0946e20.h(c0513Tr);
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
                C1721pr c1721pr = this.d[length];
                AbstractC0048Bt.k(c1721pr);
                int i4 = c1721pr.c;
                i -= i4;
                this.g -= i4;
                this.f--;
                i3++;
            }
            C1721pr[] c1721prArr = this.d;
            System.arraycopy(c1721prArr, i2 + 1, c1721prArr, i2 + 1 + i3, this.f);
            this.e += i3;
        }
        return i3;
    }

    public final C1347k9 b(int i) {
        if (i >= 0) {
            C1721pr[] c1721prArr = AbstractC0020Ar.a;
            if (i <= c1721prArr.length - 1) {
                return c1721prArr[i].a;
            }
        }
        int length = this.e + 1 + (i - AbstractC0020Ar.a.length);
        if (length >= 0) {
            C1721pr[] c1721prArr2 = this.d;
            if (length < c1721prArr2.length) {
                C1721pr c1721pr = c1721prArr2[length];
                AbstractC0048Bt.k(c1721pr);
                return c1721pr.a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void c(C1721pr c1721pr) {
        this.b.add(c1721pr);
        int i = c1721pr.c;
        int i2 = this.a;
        if (i > i2) {
            C1721pr[] c1721prArr = this.d;
            P6.g0(c1721prArr, 0, c1721prArr.length);
            this.e = this.d.length - 1;
            this.f = 0;
            this.g = 0;
            return;
        }
        a((this.g + i) - i2);
        int i3 = this.f + 1;
        C1721pr[] c1721prArr2 = this.d;
        if (i3 > c1721prArr2.length) {
            C1721pr[] c1721prArr3 = new C1721pr[c1721prArr2.length * 2];
            System.arraycopy(c1721prArr2, 0, c1721prArr3, c1721prArr2.length, c1721prArr2.length);
            this.e = this.d.length - 1;
            this.d = c1721prArr3;
        }
        int i4 = this.e;
        this.e = i4 - 1;
        this.d[i4] = c1721pr;
        this.f++;
        this.g += i;
    }

    public final C1347k9 d() {
        JL jl = this.c;
        byte readByte = jl.readByte();
        byte[] bArr = HY.a;
        int i = readByte & 255;
        int i2 = 0;
        boolean z = (readByte & 128) == 128;
        long e = e(i, 127);
        if (!z) {
            return jl.i(e);
        }
        G8 g8 = new G8();
        int[] iArr = AbstractC1064fs.a;
        AbstractC0048Bt.n(jl, Constants.ScionAnalytics.PARAM_SOURCE);
        C0998es c0998es = AbstractC1064fs.c;
        C0998es c0998es2 = c0998es;
        int i3 = 0;
        for (long j = 0; j < e; j++) {
            byte readByte2 = jl.readByte();
            byte[] bArr2 = HY.a;
            i2 = (i2 << 8) | (readByte2 & 255);
            i3 += 8;
            while (i3 >= 8) {
                C0998es[] c0998esArr = (C0998es[]) c0998es2.c;
                AbstractC0048Bt.k(c0998esArr);
                c0998es2 = c0998esArr[(i2 >>> (i3 - 8)) & 255];
                AbstractC0048Bt.k(c0998es2);
                if (((C0998es[]) c0998es2.c) == null) {
                    g8.N(c0998es2.a);
                    i3 -= c0998es2.b;
                    c0998es2 = c0998es;
                } else {
                    i3 -= 8;
                }
            }
        }
        while (i3 > 0) {
            C0998es[] c0998esArr2 = (C0998es[]) c0998es2.c;
            AbstractC0048Bt.k(c0998esArr2);
            C0998es c0998es3 = c0998esArr2[(i2 << (8 - i3)) & 255];
            AbstractC0048Bt.k(c0998es3);
            int i4 = c0998es3.b;
            if (((C0998es[]) c0998es3.c) != null || i4 > i3) {
                break;
            }
            g8.N(c0998es3.a);
            i3 -= i4;
            c0998es2 = c0998es;
        }
        return g8.i(g8.i);
    }

    public final int e(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte readByte = this.c.readByte();
            byte[] bArr = HY.a;
            int i5 = readByte & 255;
            if ((readByte & 128) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (readByte & Byte.MAX_VALUE) << i4;
            i4 += 7;
        }
    }
}
