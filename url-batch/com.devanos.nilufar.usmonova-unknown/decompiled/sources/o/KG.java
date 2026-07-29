package o;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class KG extends AbstractC0868ct {
    public int t;
    public int v;
    public int x;
    public int y;
    public int z;
    public JG[] s = new JG[16];
    public int[] u = new int[16];
    public Object[] w = new Object[16];

    public static final int d0(KG kg, int i) {
        kg.getClass();
        if (i == 0) {
            return 0;
        }
        return (-1) >>> (32 - i);
    }

    public final void e0() {
        this.t = 0;
        this.v = 0;
        P6.g0(this.w, 0, this.x);
        this.x = 0;
    }

    public final void f0(C0950e6 c0950e6, C0972eS c0972eS, C1970td c1970td) {
        int i;
        if (h0()) {
            C0575Wb c0575Wb = new C0575Wb(this);
            KG kg = (KG) c0575Wb.d;
            do {
                JG jg = kg.s[c0575Wb.a];
                AbstractC0048Bt.k(jg);
                jg.a(c0575Wb, c0950e6, c0972eS, c1970td);
                int i2 = c0575Wb.a;
                if (i2 >= kg.t) {
                    break;
                }
                JG jg2 = kg.s[i2];
                AbstractC0048Bt.k(jg2);
                c0575Wb.b += jg2.a;
                c0575Wb.c += jg2.b;
                i = c0575Wb.a + 1;
                c0575Wb.a = i;
            } while (i < kg.t);
        }
        e0();
    }

    public final boolean g0() {
        return this.t == 0;
    }

    public final boolean h0() {
        return this.t != 0;
    }

    public final JG i0() {
        JG jg = this.s[this.t - 1];
        AbstractC0048Bt.k(jg);
        return jg;
    }

    public final void j0(JG jg) {
        int i = jg.a;
        int i2 = jg.b;
        if (i == 0 && i2 == 0) {
            k0(jg);
            return;
        }
        AbstractC1052fg.S("Cannot push " + jg + " without arguments because it expects " + i + " ints and " + i2 + " objects.");
        throw null;
    }

    public final void k0(JG jg) {
        this.y = 0;
        this.z = 0;
        int i = this.t;
        JG[] jgArr = this.s;
        if (i == jgArr.length) {
            Object[] copyOf = Arrays.copyOf(jgArr, i + (i > 1024 ? 1024 : i));
            AbstractC0048Bt.m(copyOf, "copyOf(this, newSize)");
            this.s = (JG[]) copyOf;
        }
        int i2 = this.v;
        int i3 = jg.a;
        int i4 = jg.b;
        int i5 = i2 + i3;
        int[] iArr = this.u;
        int length = iArr.length;
        if (i5 > length) {
            int i6 = length + (length > 1024 ? 1024 : length);
            if (i6 >= i5) {
                i5 = i6;
            }
            int[] copyOf2 = Arrays.copyOf(iArr, i5);
            AbstractC0048Bt.m(copyOf2, "copyOf(this, newSize)");
            this.u = copyOf2;
        }
        int i7 = this.x + i4;
        Object[] objArr = this.w;
        int length2 = objArr.length;
        if (i7 > length2) {
            int i8 = length2 + (length2 <= 1024 ? length2 : 1024);
            if (i8 >= i7) {
                i7 = i8;
            }
            Object[] copyOf3 = Arrays.copyOf(objArr, i7);
            AbstractC0048Bt.m(copyOf3, "copyOf(this, newSize)");
            this.w = copyOf3;
        }
        JG[] jgArr2 = this.s;
        int i9 = this.t;
        this.t = i9 + 1;
        jgArr2[i9] = jg;
        this.v += jg.a;
        this.x += i4;
    }
}
