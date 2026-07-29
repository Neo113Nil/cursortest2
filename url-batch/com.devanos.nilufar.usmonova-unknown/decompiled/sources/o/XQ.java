package o;

/* loaded from: classes.dex */
public final class XQ {
    public int a;
    public final int[] b = new int[10];

    public final int a() {
        if ((this.a & 128) != 0) {
            return this.b[7];
        }
        return 65535;
    }

    public final void b(XQ xq) {
        AbstractC0048Bt.n(xq, "other");
        for (int i = 0; i < 10; i++) {
            if (((1 << i) & xq.a) != 0) {
                c(i, xq.b[i]);
            }
        }
    }

    public final void c(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.b;
            if (i >= iArr.length) {
                return;
            }
            this.a = (1 << i) | this.a;
            iArr[i] = i2;
        }
    }
}
