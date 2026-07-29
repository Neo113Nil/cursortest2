package o;

import java.util.Arrays;

/* renamed from: o.cY, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0847cY {
    public static final C0847cY f = new C0847cY(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public C0847cY(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public final void a(int i) {
        int[] iArr = this.b;
        if (i > iArr.length) {
            int i2 = this.a;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.b = Arrays.copyOf(iArr, i);
            this.c = Arrays.copyOf(this.c, i);
        }
    }

    public final int b() {
        int Z;
        int b0;
        int V;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = this.b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.c[i3]).getClass();
                    V = C0627Yb.V(i5);
                } else if (i6 == 2) {
                    V = C0627Yb.S(i5, (C1151h9) this.c[i3]);
                } else if (i6 == 3) {
                    Z = C0627Yb.Z(i5) * 2;
                    b0 = ((C0847cY) this.c[i3]).b();
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException(C0230It.b());
                    }
                    ((Integer) this.c[i3]).getClass();
                    V = C0627Yb.U(i5);
                }
                i2 = V + i2;
            } else {
                long longValue = ((Long) this.c[i3]).longValue();
                Z = C0627Yb.Z(i5);
                b0 = C0627Yb.b0(longValue);
            }
            i2 = b0 + Z + i2;
        }
        this.d = i2;
        return i2;
    }

    public final void c(int i, Object obj) {
        if (!this.e) {
            throw new UnsupportedOperationException();
        }
        a(this.a + 1);
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    public final void d(Y1 y1) {
        if (this.a == 0) {
            return;
        }
        y1.getClass();
        C0627Yb c0627Yb = (C0627Yb) y1.i;
        for (int i = 0; i < this.a; i++) {
            int i2 = this.b[i];
            Object obj = this.c[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                c0627Yb.v0(((Long) obj).longValue(), i3);
            } else if (i4 == 1) {
                c0627Yb.l0(((Long) obj).longValue(), i3);
            } else if (i4 == 2) {
                y1.h0(i3, (C1151h9) obj);
            } else if (i4 == 3) {
                c0627Yb.s0(i3, 3);
                ((C0847cY) obj).d(y1);
                c0627Yb.s0(i3, 4);
            } else {
                if (i4 != 5) {
                    throw new RuntimeException(C0230It.b());
                }
                c0627Yb.j0(i3, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0847cY)) {
            return false;
        }
        C0847cY c0847cY = (C0847cY) obj;
        int i = this.a;
        if (i == c0847cY.a) {
            int[] iArr = this.b;
            int[] iArr2 = c0847cY.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = c0847cY.c;
                    int i3 = this.a;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = (527 + i) * 31;
        int[] iArr = this.b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.c;
        int i7 = this.a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }
}
