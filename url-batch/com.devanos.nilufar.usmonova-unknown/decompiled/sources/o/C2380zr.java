package o;

import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: o.zr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2380zr {
    public final G8 a;
    public boolean c;
    public int g;
    public int h;
    public int b = Integer.MAX_VALUE;
    public int d = 4096;
    public C1721pr[] e = new C1721pr[8];
    public int f = 7;

    public C2380zr(G8 g8) {
        this.a = g8;
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
                C1721pr c1721pr = this.e[length];
                AbstractC0048Bt.k(c1721pr);
                i -= c1721pr.c;
                int i4 = this.h;
                C1721pr c1721pr2 = this.e[length];
                AbstractC0048Bt.k(c1721pr2);
                this.h = i4 - c1721pr2.c;
                this.g--;
                i3++;
                length--;
            }
            C1721pr[] c1721prArr = this.e;
            int i5 = i2 + 1;
            System.arraycopy(c1721prArr, i5, c1721prArr, i5 + i3, this.g);
            C1721pr[] c1721prArr2 = this.e;
            int i6 = this.f + 1;
            Arrays.fill(c1721prArr2, i6, i6 + i3, (Object) null);
            this.f += i3;
        }
    }

    public final void b(C1721pr c1721pr) {
        int i = c1721pr.c;
        int i2 = this.d;
        if (i > i2) {
            C1721pr[] c1721prArr = this.e;
            P6.g0(c1721prArr, 0, c1721prArr.length);
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
            return;
        }
        a((this.h + i) - i2);
        int i3 = this.g + 1;
        C1721pr[] c1721prArr2 = this.e;
        if (i3 > c1721prArr2.length) {
            C1721pr[] c1721prArr3 = new C1721pr[c1721prArr2.length * 2];
            System.arraycopy(c1721prArr2, 0, c1721prArr3, c1721prArr2.length, c1721prArr2.length);
            this.f = this.e.length - 1;
            this.e = c1721prArr3;
        }
        int i4 = this.f;
        this.f = i4 - 1;
        this.e[i4] = c1721pr;
        this.g++;
        this.h += i;
    }

    public final void c(C1347k9 c1347k9) {
        AbstractC0048Bt.n(c1347k9, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        int[] iArr = AbstractC1064fs.a;
        int b = c1347k9.b();
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < b; i++) {
            byte g = c1347k9.g(i);
            byte[] bArr = HY.a;
            j2 += AbstractC1064fs.b[g & 255];
        }
        int i2 = (int) ((j2 + 7) >> 3);
        int b2 = c1347k9.b();
        G8 g8 = this.a;
        if (i2 >= b2) {
            e(c1347k9.b(), 127, 0);
            g8.M(c1347k9);
            return;
        }
        G8 g82 = new G8();
        int[] iArr2 = AbstractC1064fs.a;
        int b3 = c1347k9.b();
        int i3 = 0;
        for (int i4 = 0; i4 < b3; i4++) {
            byte g2 = c1347k9.g(i4);
            byte[] bArr2 = HY.a;
            int i5 = g2 & 255;
            int i6 = AbstractC1064fs.a[i5];
            byte b4 = AbstractC1064fs.b[i5];
            j = (j << b4) | i6;
            i3 += b4;
            while (i3 >= 8) {
                i3 -= 8;
                g82.N((int) (j >> i3));
            }
        }
        if (i3 > 0) {
            g82.N((int) ((j << (8 - i3)) | (255 >>> i3)));
        }
        C1347k9 i7 = g82.i(g82.i);
        e(i7.b(), 127, 128);
        g8.M(i7);
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
            C1721pr c1721pr = (C1721pr) arrayList.get(i4);
            C1347k9 n = c1721pr.a.n();
            C1347k9 c1347k9 = c1721pr.b;
            Integer num = (Integer) AbstractC0020Ar.b.get(n);
            if (num != null) {
                int intValue = num.intValue();
                i2 = intValue + 1;
                if (2 <= i2 && i2 < 8) {
                    C1721pr[] c1721prArr = AbstractC0020Ar.a;
                    if (AbstractC0048Bt.h(c1721prArr[intValue].b, c1347k9)) {
                        i = i2;
                    } else if (AbstractC0048Bt.h(c1721prArr[i2].b, c1347k9)) {
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
                    C1721pr c1721pr2 = this.e[i5];
                    AbstractC0048Bt.k(c1721pr2);
                    if (AbstractC0048Bt.h(c1721pr2.a, n)) {
                        C1721pr c1721pr3 = this.e[i5];
                        AbstractC0048Bt.k(c1721pr3);
                        if (AbstractC0048Bt.h(c1721pr3.b, c1347k9)) {
                            i2 = AbstractC0020Ar.a.length + (i5 - this.f);
                            break;
                        } else if (i == -1) {
                            i = (i5 - this.f) + AbstractC0020Ar.a.length;
                        }
                    }
                    i5++;
                }
            }
            if (i2 != -1) {
                e(i2, 127, 128);
            } else if (i == -1) {
                this.a.N(64);
                c(n);
                c(c1347k9);
                b(c1721pr);
            } else {
                C1347k9 c1347k92 = C1721pr.d;
                n.getClass();
                AbstractC0048Bt.n(c1347k92, "prefix");
                if (!n.k(0, c1347k92, c1347k92.b()) || AbstractC0048Bt.h(C1721pr.i, n)) {
                    e(i, 63, 64);
                    c(c1347k9);
                    b(c1721pr);
                } else {
                    e(i, 15, 0);
                    c(c1347k9);
                }
            }
        }
    }

    public final void e(int i, int i2, int i3) {
        G8 g8 = this.a;
        if (i < i2) {
            g8.N(i | i3);
            return;
        }
        g8.N(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            g8.N(128 | (i4 & 127));
            i4 >>>= 7;
        }
        g8.N(i4);
    }
}
