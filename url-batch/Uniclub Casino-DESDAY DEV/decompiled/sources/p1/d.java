package p1;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public final v1.f f3417b;
    public boolean d;
    public int h;
    public int i;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3416a = true;

    /* renamed from: c, reason: collision with root package name */
    public int f3418c = Integer.MAX_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public int f3419e = 4096;

    /* renamed from: f, reason: collision with root package name */
    public C0281b[] f3420f = new C0281b[8];

    /* renamed from: g, reason: collision with root package name */
    public int f3421g = 7;

    public d(v1.f fVar) {
        this.f3417b = fVar;
    }

    public final void a(int i) {
        int i2;
        if (i > 0) {
            int length = this.f3420f.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f3421g;
                if (length < i2 || i <= 0) {
                    break;
                }
                C0281b c0281b = this.f3420f[length];
                X0.d.b(c0281b);
                i -= c0281b.f3409c;
                int i4 = this.i;
                C0281b c0281b2 = this.f3420f[length];
                X0.d.b(c0281b2);
                this.i = i4 - c0281b2.f3409c;
                this.h--;
                i3++;
                length--;
            }
            C0281b[] c0281bArr = this.f3420f;
            int i5 = i2 + 1;
            System.arraycopy(c0281bArr, i5, c0281bArr, i5 + i3, this.h);
            C0281b[] c0281bArr2 = this.f3420f;
            int i6 = this.f3421g + 1;
            Arrays.fill(c0281bArr2, i6, i6 + i3, (Object) null);
            this.f3421g += i3;
        }
    }

    public final void b(C0281b c0281b) {
        int i = this.f3419e;
        int i2 = c0281b.f3409c;
        if (i2 > i) {
            C0281b[] c0281bArr = this.f3420f;
            Q0.g.e0(c0281bArr, 0, c0281bArr.length);
            this.f3421g = this.f3420f.length - 1;
            this.h = 0;
            this.i = 0;
            return;
        }
        a((this.i + i2) - i);
        int i3 = this.h + 1;
        C0281b[] c0281bArr2 = this.f3420f;
        if (i3 > c0281bArr2.length) {
            C0281b[] c0281bArr3 = new C0281b[c0281bArr2.length * 2];
            System.arraycopy(c0281bArr2, 0, c0281bArr3, c0281bArr2.length, c0281bArr2.length);
            this.f3421g = this.f3420f.length - 1;
            this.f3420f = c0281bArr3;
        }
        int i4 = this.f3421g;
        this.f3421g = i4 - 1;
        this.f3420f[i4] = c0281b;
        this.h++;
        this.i += i2;
    }

    public final void c(v1.i iVar) {
        X0.d.e(iVar, "data");
        v1.f fVar = this.f3417b;
        if (this.f3416a) {
            int[] iArr = z.f3510a;
            int a2 = iVar.a();
            long j2 = 0;
            for (int i = 0; i < a2; i++) {
                byte d = iVar.d(i);
                byte[] bArr = j1.b.f2609a;
                j2 += z.f3511b[d & 255];
            }
            if (((int) ((j2 + 7) >> 3)) < iVar.a()) {
                v1.f fVar2 = new v1.f();
                int[] iArr2 = z.f3510a;
                int a3 = iVar.a();
                long j3 = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < a3; i3++) {
                    byte d2 = iVar.d(i3);
                    byte[] bArr2 = j1.b.f2609a;
                    int i4 = d2 & 255;
                    int i5 = z.f3510a[i4];
                    byte b2 = z.f3511b[i4];
                    j3 = (j3 << b2) | i5;
                    i2 += b2;
                    while (i2 >= 8) {
                        i2 -= 8;
                        fVar2.s((int) (j3 >> i2));
                    }
                }
                if (i2 > 0) {
                    fVar2.s((int) ((255 >>> i2) | (j3 << (8 - i2))));
                }
                v1.i i6 = fVar2.i(fVar2.f4052b);
                e(i6.a(), 127, 128);
                fVar.q(i6);
                return;
            }
        }
        e(iVar.a(), 127, 0);
        fVar.q(iVar);
    }

    public final void d(ArrayList arrayList) {
        int i;
        int i2;
        if (this.d) {
            int i3 = this.f3418c;
            if (i3 < this.f3419e) {
                e(i3, 31, 32);
            }
            this.d = false;
            this.f3418c = Integer.MAX_VALUE;
            e(this.f3419e, 31, 32);
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C0281b c0281b = (C0281b) arrayList.get(i4);
            v1.i g2 = c0281b.f3407a.g();
            Integer num = (Integer) e.f3423b.get(g2);
            v1.i iVar = c0281b.f3408b;
            if (num != null) {
                int intValue = num.intValue();
                i2 = intValue + 1;
                if (2 <= i2 && i2 < 8) {
                    C0281b[] c0281bArr = e.f3422a;
                    if (X0.d.a(c0281bArr[intValue].f3408b, iVar)) {
                        i = i2;
                    } else if (X0.d.a(c0281bArr[i2].f3408b, iVar)) {
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
                int i5 = this.f3421g + 1;
                int length = this.f3420f.length;
                while (true) {
                    if (i5 >= length) {
                        break;
                    }
                    C0281b c0281b2 = this.f3420f[i5];
                    X0.d.b(c0281b2);
                    if (X0.d.a(c0281b2.f3407a, g2)) {
                        C0281b c0281b3 = this.f3420f[i5];
                        X0.d.b(c0281b3);
                        if (X0.d.a(c0281b3.f3408b, iVar)) {
                            i2 = e.f3422a.length + (i5 - this.f3421g);
                            break;
                        } else if (i == -1) {
                            i = (i5 - this.f3421g) + e.f3422a.length;
                        }
                    }
                    i5++;
                }
            }
            if (i2 != -1) {
                e(i2, 127, 128);
            } else if (i == -1) {
                this.f3417b.s(64);
                c(g2);
                c(iVar);
                b(c0281b);
            } else {
                v1.i iVar2 = C0281b.d;
                g2.getClass();
                X0.d.e(iVar2, "prefix");
                if (!g2.f(iVar2, iVar2.a()) || X0.d.a(C0281b.i, g2)) {
                    e(i, 63, 64);
                    c(iVar);
                    b(c0281b);
                } else {
                    e(i, 15, 0);
                    c(iVar);
                }
            }
        }
    }

    public final void e(int i, int i2, int i3) {
        v1.f fVar = this.f3417b;
        if (i < i2) {
            fVar.s(i | i3);
            return;
        }
        fVar.s(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            fVar.s(128 | (i4 & 127));
            i4 >>>= 7;
        }
        fVar.s(i4);
    }
}
