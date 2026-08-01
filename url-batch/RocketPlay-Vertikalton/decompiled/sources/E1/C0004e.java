package E1;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: E1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0004e {

    /* renamed from: b, reason: collision with root package name */
    public final K1.f f304b;
    public boolean d;
    public int h;
    public int i;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f303a = true;

    /* renamed from: c, reason: collision with root package name */
    public int f305c = Integer.MAX_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public int f306e = 4096;

    /* renamed from: f, reason: collision with root package name */
    public C0002c[] f307f = new C0002c[8];

    /* renamed from: g, reason: collision with root package name */
    public int f308g = 7;

    public C0004e(K1.f fVar) {
        this.f304b = fVar;
    }

    public final void a(int i) {
        int i2;
        if (i > 0) {
            int length = this.f307f.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f308g;
                if (length < i2 || i <= 0) {
                    break;
                }
                C0002c c0002c = this.f307f[length];
                i1.f.b(c0002c);
                i -= c0002c.f296c;
                int i4 = this.i;
                C0002c c0002c2 = this.f307f[length];
                i1.f.b(c0002c2);
                this.i = i4 - c0002c2.f296c;
                this.h--;
                i3++;
                length--;
            }
            C0002c[] c0002cArr = this.f307f;
            int i5 = i2 + 1;
            System.arraycopy(c0002cArr, i5, c0002cArr, i5 + i3, this.h);
            C0002c[] c0002cArr2 = this.f307f;
            int i6 = this.f308g + 1;
            Arrays.fill(c0002cArr2, i6, i6 + i3, (Object) null);
            this.f308g += i3;
        }
    }

    public final void b(C0002c c0002c) {
        int i = this.f306e;
        int i2 = c0002c.f296c;
        if (i2 > i) {
            C0002c[] c0002cArr = this.f307f;
            W0.i.u0(c0002cArr, 0, c0002cArr.length);
            this.f308g = this.f307f.length - 1;
            this.h = 0;
            this.i = 0;
            return;
        }
        a((this.i + i2) - i);
        int i3 = this.h + 1;
        C0002c[] c0002cArr2 = this.f307f;
        if (i3 > c0002cArr2.length) {
            C0002c[] c0002cArr3 = new C0002c[c0002cArr2.length * 2];
            System.arraycopy(c0002cArr2, 0, c0002cArr3, c0002cArr2.length, c0002cArr2.length);
            this.f308g = this.f307f.length - 1;
            this.f307f = c0002cArr3;
        }
        int i4 = this.f308g;
        this.f308g = i4 - 1;
        this.f307f[i4] = c0002c;
        this.h++;
        this.i += i2;
    }

    public final void c(K1.i iVar) {
        i1.f.e(iVar, "data");
        K1.f fVar = this.f304b;
        if (this.f303a) {
            int[] iArr = B.f284a;
            int a2 = iVar.a();
            long j2 = 0;
            for (int i = 0; i < a2; i++) {
                byte d = iVar.d(i);
                byte[] bArr = y1.b.f4648a;
                j2 += B.f285b[d & 255];
            }
            if (((int) ((j2 + 7) >> 3)) < iVar.a()) {
                K1.f fVar2 = new K1.f();
                int[] iArr2 = B.f284a;
                int a3 = iVar.a();
                long j3 = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < a3; i3++) {
                    byte d2 = iVar.d(i3);
                    byte[] bArr2 = y1.b.f4648a;
                    int i4 = d2 & 255;
                    int i5 = B.f284a[i4];
                    byte b2 = B.f285b[i4];
                    j3 = (j3 << b2) | i5;
                    i2 += b2;
                    while (i2 >= 8) {
                        i2 -= 8;
                        fVar2.M((int) (j3 >> i2));
                    }
                }
                if (i2 > 0) {
                    fVar2.M((int) ((255 >>> i2) | (j3 << (8 - i2))));
                }
                K1.i q2 = fVar2.q(fVar2.f746b);
                e(q2.a(), 127, 128);
                fVar.K(q2);
                return;
            }
        }
        e(iVar.a(), 127, 0);
        fVar.K(iVar);
    }

    public final void d(ArrayList arrayList) {
        int i;
        int i2;
        if (this.d) {
            int i3 = this.f305c;
            if (i3 < this.f306e) {
                e(i3, 31, 32);
            }
            this.d = false;
            this.f305c = Integer.MAX_VALUE;
            e(this.f306e, 31, 32);
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C0002c c0002c = (C0002c) arrayList.get(i4);
            K1.i g2 = c0002c.f294a.g();
            Integer num = (Integer) f.f310b.get(g2);
            K1.i iVar = c0002c.f295b;
            if (num != null) {
                int intValue = num.intValue();
                i2 = intValue + 1;
                if (2 <= i2 && i2 < 8) {
                    C0002c[] c0002cArr = f.f309a;
                    if (i1.f.a(c0002cArr[intValue].f295b, iVar)) {
                        i = i2;
                    } else if (i1.f.a(c0002cArr[i2].f295b, iVar)) {
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
                int i5 = this.f308g + 1;
                int length = this.f307f.length;
                while (true) {
                    if (i5 >= length) {
                        break;
                    }
                    C0002c c0002c2 = this.f307f[i5];
                    i1.f.b(c0002c2);
                    if (i1.f.a(c0002c2.f294a, g2)) {
                        C0002c c0002c3 = this.f307f[i5];
                        i1.f.b(c0002c3);
                        if (i1.f.a(c0002c3.f295b, iVar)) {
                            i2 = f.f309a.length + (i5 - this.f308g);
                            break;
                        } else if (i == -1) {
                            i = (i5 - this.f308g) + f.f309a.length;
                        }
                    }
                    i5++;
                }
            }
            if (i2 != -1) {
                e(i2, 127, 128);
            } else if (i == -1) {
                this.f304b.M(64);
                c(g2);
                c(iVar);
                b(c0002c);
            } else {
                K1.i iVar2 = C0002c.d;
                g2.getClass();
                i1.f.e(iVar2, "prefix");
                if (!g2.f(iVar2, iVar2.a()) || i1.f.a(C0002c.i, g2)) {
                    e(i, 63, 64);
                    c(iVar);
                    b(c0002c);
                } else {
                    e(i, 15, 0);
                    c(iVar);
                }
            }
        }
    }

    public final void e(int i, int i2, int i3) {
        K1.f fVar = this.f304b;
        if (i < i2) {
            fVar.M(i | i3);
            return;
        }
        fVar.M(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            fVar.M(128 | (i4 & 127));
            i4 >>>= 7;
        }
        fVar.M(i4);
    }
}
