package E1;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public int f288a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f289b = new int[10];

    public final int a() {
        if ((this.f288a & 128) != 0) {
            return this.f289b[7];
        }
        return 65535;
    }

    public final void b(D d) {
        i1.f.e(d, "other");
        for (int i = 0; i < 10; i++) {
            if (((1 << i) & d.f288a) != 0) {
                c(i, d.f289b[i]);
            }
        }
    }

    public final void c(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f289b;
            if (i >= iArr.length) {
                return;
            }
            this.f288a = (1 << i) | this.f288a;
            iArr[i] = i2;
        }
    }
}
