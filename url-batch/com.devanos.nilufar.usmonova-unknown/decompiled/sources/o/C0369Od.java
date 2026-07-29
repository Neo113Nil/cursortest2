package o;

/* renamed from: o.Od, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0369Od {
    public final AbstractC1508mc a;
    public final AbstractC1508mc b;
    public final AbstractC1508mc c;
    public final float[] d;

    public C0369Od(AbstractC1508mc abstractC1508mc, AbstractC1508mc abstractC1508mc2, AbstractC1508mc abstractC1508mc3, float[] fArr) {
        this.a = abstractC1508mc;
        this.b = abstractC1508mc2;
        this.c = abstractC1508mc3;
        this.d = fArr;
    }

    public long a(long j) {
        float f = C1114gc.f(j);
        float e = C1114gc.e(j);
        float d = C1114gc.d(j);
        float c = C1114gc.c(j);
        AbstractC1508mc abstractC1508mc = this.b;
        long d2 = abstractC1508mc.d(f, e, d);
        float intBitsToFloat = Float.intBitsToFloat((int) (d2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (d2 & 4294967295L));
        float e2 = abstractC1508mc.e(f, e, d);
        float[] fArr = this.d;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            e2 *= fArr[2];
        }
        float f2 = intBitsToFloat;
        float f3 = intBitsToFloat2;
        return this.c.f(f2, f3, e2, c, this.a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0369Od(AbstractC1508mc abstractC1508mc, AbstractC1508mc abstractC1508mc2, int i) {
        this(abstractC1508mc2, r0, r1, r4);
        float[] fArr;
        long j = abstractC1508mc.b;
        long j2 = AbstractC1310jc.a;
        AbstractC1508mc e = AbstractC1310jc.a(j, j2) ? AbstractC0048Bt.e(abstractC1508mc) : abstractC1508mc;
        AbstractC1508mc e2 = AbstractC1310jc.a(abstractC1508mc2.b, j2) ? AbstractC0048Bt.e(abstractC1508mc2) : abstractC1508mc2;
        float[] fArr2 = AbstractC0022At.h;
        if (i == 3) {
            boolean a = AbstractC1310jc.a(abstractC1508mc.b, j2);
            boolean a2 = AbstractC1310jc.a(abstractC1508mc2.b, j2);
            if ((!a || !a2) && (a || a2)) {
                H00 h00 = ((C2285yO) (a ? abstractC1508mc : abstractC1508mc2)).d;
                float[] a3 = a ? h00.a() : fArr2;
                fArr2 = a2 ? h00.a() : fArr2;
                fArr = new float[]{a3[0] / fArr2[0], a3[1] / fArr2[1], a3[2] / fArr2[2]};
            }
        }
        fArr = null;
    }
}
