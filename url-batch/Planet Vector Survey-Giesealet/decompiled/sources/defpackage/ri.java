package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public class ri {
    public final me a;
    public final me b;
    public final me c;
    public final float[] d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ri(me meVar, me meVar2, int i) {
        this(meVar2, r0, r1, r4);
        float[] fArr;
        me d = x40.A(meVar.b, 12884901888L) ? nk.d(meVar) : meVar;
        me d2 = x40.A(meVar2.b, 12884901888L) ? nk.d(meVar2) : meVar2;
        float[] fArr2 = x40.h;
        if (i == 3) {
            boolean A = x40.A(meVar.b, 12884901888L);
            boolean A2 = x40.A(meVar2.b, 12884901888L);
            if ((!A || !A2) && (A || A2)) {
                y01 y01Var = ((dl0) (A ? meVar : meVar2)).d;
                float[] a = A ? y01Var.a() : fArr2;
                fArr2 = A2 ? y01Var.a() : fArr2;
                fArr = new float[]{a[0] / fArr2[0], a[1] / fArr2[1], a[2] / fArr2[2]};
            }
        }
        fArr = null;
    }

    public long a(long j) {
        float h = ge.h(j);
        float g = ge.g(j);
        float e = ge.e(j);
        float d = ge.d(j);
        me meVar = this.b;
        long d2 = meVar.d(h, g, e);
        float intBitsToFloat = Float.intBitsToFloat((int) (d2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (d2 & 4294967295L));
        float e2 = meVar.e(h, g, e);
        float[] fArr = this.d;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            e2 *= fArr[2];
        }
        float f = intBitsToFloat;
        float f2 = intBitsToFloat2;
        return this.c.f(f, f2, e2, d, this.a);
    }

    public ri(me meVar, me meVar2, me meVar3, float[] fArr) {
        this.a = meVar;
        this.b = meVar2;
        this.c = meVar3;
        this.d = fArr;
    }
}
