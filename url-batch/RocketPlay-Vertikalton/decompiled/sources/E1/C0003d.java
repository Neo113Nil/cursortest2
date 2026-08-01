package E1;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: E1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0003d {

    /* renamed from: c, reason: collision with root package name */
    public final K1.p f299c;

    /* renamed from: f, reason: collision with root package name */
    public int f301f;

    /* renamed from: g, reason: collision with root package name */
    public int f302g;

    /* renamed from: a, reason: collision with root package name */
    public int f297a = 4096;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f298b = new ArrayList();
    public C0002c[] d = new C0002c[8];

    /* renamed from: e, reason: collision with root package name */
    public int f300e = 7;

    public C0003d(t tVar) {
        this.f299c = new K1.p(tVar);
    }

    public final int a(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.d.length;
            while (true) {
                length--;
                i2 = this.f300e;
                if (length < i2 || i <= 0) {
                    break;
                }
                C0002c c0002c = this.d[length];
                i1.f.b(c0002c);
                int i4 = c0002c.f296c;
                i -= i4;
                this.f302g -= i4;
                this.f301f--;
                i3++;
            }
            C0002c[] c0002cArr = this.d;
            System.arraycopy(c0002cArr, i2 + 1, c0002cArr, i2 + 1 + i3, this.f301f);
            this.f300e += i3;
        }
        return i3;
    }

    public final K1.i b(int i) {
        if (i >= 0) {
            C0002c[] c0002cArr = f.f309a;
            if (i <= c0002cArr.length - 1) {
                return c0002cArr[i].f294a;
            }
        }
        int length = this.f300e + 1 + (i - f.f309a.length);
        if (length >= 0) {
            C0002c[] c0002cArr2 = this.d;
            if (length < c0002cArr2.length) {
                C0002c c0002c = c0002cArr2[length];
                i1.f.b(c0002c);
                return c0002c.f294a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void c(C0002c c0002c) {
        this.f298b.add(c0002c);
        int i = this.f297a;
        int i2 = c0002c.f296c;
        if (i2 > i) {
            C0002c[] c0002cArr = this.d;
            W0.i.u0(c0002cArr, 0, c0002cArr.length);
            this.f300e = this.d.length - 1;
            this.f301f = 0;
            this.f302g = 0;
            return;
        }
        a((this.f302g + i2) - i);
        int i3 = this.f301f + 1;
        C0002c[] c0002cArr2 = this.d;
        if (i3 > c0002cArr2.length) {
            C0002c[] c0002cArr3 = new C0002c[c0002cArr2.length * 2];
            System.arraycopy(c0002cArr2, 0, c0002cArr3, c0002cArr2.length, c0002cArr2.length);
            this.f300e = this.d.length - 1;
            this.d = c0002cArr3;
        }
        int i4 = this.f300e;
        this.f300e = i4 - 1;
        this.d[i4] = c0002c;
        this.f301f++;
        this.f302g += i2;
    }

    public final K1.i d() {
        int i;
        K1.p pVar = this.f299c;
        byte h = pVar.h();
        byte[] bArr = y1.b.f4648a;
        int i2 = h & 255;
        int i3 = 0;
        boolean z2 = (h & 128) == 128;
        long e2 = e(i2, 127);
        if (!z2) {
            return pVar.i(e2);
        }
        K1.f fVar = new K1.f();
        int[] iArr = B.f284a;
        i1.f.e(pVar, "source");
        A a2 = B.f286c;
        A a3 = a2;
        int i4 = 0;
        for (long j2 = 0; j2 < e2; j2++) {
            byte h2 = pVar.h();
            byte[] bArr2 = y1.b.f4648a;
            i3 = (i3 << 8) | (h2 & 255);
            i4 += 8;
            while (i4 >= 8) {
                A[] aArr = (A[]) a3.f283c;
                i1.f.b(aArr);
                a3 = aArr[(i3 >>> (i4 - 8)) & 255];
                i1.f.b(a3);
                if (((A[]) a3.f283c) == null) {
                    fVar.M(a3.f281a);
                    i4 -= a3.f282b;
                    a3 = a2;
                } else {
                    i4 -= 8;
                }
            }
        }
        while (i4 > 0) {
            A[] aArr2 = (A[]) a3.f283c;
            i1.f.b(aArr2);
            A a4 = aArr2[(i3 << (8 - i4)) & 255];
            i1.f.b(a4);
            if (((A[]) a4.f283c) != null || (i = a4.f282b) > i4) {
                break;
            }
            fVar.M(a4.f281a);
            i4 -= i;
            a3 = a2;
        }
        return fVar.q(fVar.f746b);
    }

    public final int e(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte h = this.f299c.h();
            byte[] bArr = y1.b.f4648a;
            int i5 = h & 255;
            if ((h & 128) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (h & Byte.MAX_VALUE) << i4;
            i4 += 7;
        }
    }
}
