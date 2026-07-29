package o;

import java.util.Arrays;

/* renamed from: o.Nd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0343Nd extends C0369Od {
    public final C2285yO e;
    public final C2285yO f;
    public final float[] g;

    public C0343Nd(C2285yO c2285yO, C2285yO c2285yO2) {
        super(c2285yO2, c2285yO, c2285yO2, null);
        float[] L;
        this.e = c2285yO;
        this.f = c2285yO2;
        float[] fArr = AbstractC0022At.h;
        float[] fArr2 = (float[]) Y1.j.i;
        H00 h00 = c2285yO.d;
        float[] fArr3 = c2285yO.i;
        H00 h002 = c2285yO2.d;
        float[] fArr4 = c2285yO2.j;
        if (AbstractC0048Bt.u(h00, h002)) {
            L = AbstractC0048Bt.L(fArr4, fArr3);
        } else {
            float[] a = h00.a();
            float[] a2 = h002.a();
            H00 h003 = AbstractC0022At.e;
            if (!AbstractC0048Bt.u(h00, h003)) {
                float[] copyOf = Arrays.copyOf(fArr, 3);
                AbstractC0048Bt.m(copyOf, "copyOf(this, size)");
                fArr3 = AbstractC0048Bt.L(AbstractC0048Bt.q(fArr2, a, copyOf), fArr3);
            }
            if (!AbstractC0048Bt.u(h002, h003)) {
                float[] copyOf2 = Arrays.copyOf(fArr, 3);
                AbstractC0048Bt.m(copyOf2, "copyOf(this, size)");
                fArr4 = AbstractC0048Bt.J(AbstractC0048Bt.L(AbstractC0048Bt.q(fArr2, a2, copyOf2), c2285yO2.i));
            }
            L = AbstractC0048Bt.L(fArr4, fArr3);
        }
        this.g = L;
    }

    @Override // o.C0369Od
    public final long a(long j) {
        float f = C1114gc.f(j);
        float e = C1114gc.e(j);
        float d = C1114gc.d(j);
        float c = C1114gc.c(j);
        C2021uO c2021uO = this.e.n;
        float b = (float) c2021uO.b(f);
        float b2 = (float) c2021uO.b(e);
        float b3 = (float) c2021uO.b(d);
        float[] fArr = this.g;
        float f2 = (fArr[6] * b3) + (fArr[3] * b2) + (fArr[0] * b);
        float f3 = (fArr[7] * b3) + (fArr[4] * b2) + (fArr[1] * b);
        float f4 = (fArr[8] * b3) + (fArr[5] * b2) + (fArr[2] * b);
        C2285yO c2285yO = this.f;
        float b4 = (float) c2285yO.l.b(f2);
        C2021uO c2021uO2 = c2285yO.l;
        return AbstractC0022At.a(b4, (float) c2021uO2.b(f3), (float) c2021uO2.b(f4), c, c2285yO);
    }
}
