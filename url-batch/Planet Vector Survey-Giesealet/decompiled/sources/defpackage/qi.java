package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class qi extends ri {
    public final dl0 e;
    public final dl0 f;
    public final float[] g;

    public qi(dl0 dl0Var, dl0 dl0Var2) {
        super(dl0Var2, dl0Var, dl0Var2, null);
        float[] E;
        this.e = dl0Var;
        this.f = dl0Var2;
        float[] fArr = z1.c.b;
        y01 y01Var = dl0Var.d;
        float[] fArr2 = dl0Var.i;
        y01 y01Var2 = dl0Var2.d;
        float[] fArr3 = dl0Var2.j;
        if (nk.i(y01Var, y01Var2)) {
            E = nk.E(fArr3, fArr2);
        } else {
            float[] a = y01Var.a();
            float[] a2 = y01Var2.a();
            y01 y01Var3 = x40.e;
            E = nk.E(nk.i(y01Var2, y01Var3) ? fArr3 : nk.z(nk.E(nk.h(fArr, a2, new float[]{0.964212f, 1.0f, 0.825188f}), dl0Var2.i)), nk.i(y01Var, y01Var3) ? fArr2 : nk.E(nk.h(fArr, a, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.g = E;
    }

    @Override // defpackage.ri
    public final long a(long j) {
        float h = ge.h(j);
        float g = ge.g(j);
        float e = ge.e(j);
        float d = ge.d(j);
        zk0 zk0Var = this.e.p;
        float b = (float) zk0Var.b(h);
        float b2 = (float) zk0Var.b(g);
        float b3 = (float) zk0Var.b(e);
        float[] fArr = this.g;
        float f = (fArr[6] * b3) + (fArr[3] * b2) + (fArr[0] * b);
        float f2 = (fArr[7] * b3) + (fArr[4] * b2) + (fArr[1] * b);
        float f3 = (fArr[8] * b3) + (fArr[5] * b2) + (fArr[2] * b);
        dl0 dl0Var = this.f;
        float b4 = (float) dl0Var.m.b(f);
        zk0 zk0Var2 = dl0Var.m;
        return d31.b(b4, (float) zk0Var2.b(f2), (float) zk0Var2.b(f3), d, dl0Var);
    }
}
