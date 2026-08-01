package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class qt {
    public static final float[] a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    public static volatile ps0 b = new ps0();
    public static final Object[] c;

    static {
        Object[] objArr = new Object[0];
        c = objArr;
        synchronized (objArr) {
            b.d(115, new rt(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            b.d(130, new rt(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            b.d(150, new rt(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            b.d(180, new rt(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            b.d(200, new rt(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((b.c(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        ey.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static pt a(float f) {
        float c2;
        pt ptVar;
        float[] fArr = a;
        if (f < 1.03f) {
            return null;
        }
        int i = (int) (f * 100.0f);
        pt ptVar2 = (pt) b.b(i);
        if (ptVar2 != null) {
            return ptVar2;
        }
        ps0 ps0Var = b;
        if (ps0Var.d) {
            x40.m(ps0Var);
        }
        int o = nz.o(ps0Var.e, ps0Var.g, i);
        if (o >= 0) {
            return (pt) b.f(o);
        }
        int i2 = -(o + 1);
        int i3 = i2 - 1;
        if (i2 >= b.e()) {
            rt rtVar = new rt(new float[]{1.0f}, new float[]{f});
            b(f, rtVar);
            return rtVar;
        }
        if (i3 < 0) {
            ptVar = new rt(fArr, fArr);
            c2 = 1.0f;
        } else {
            c2 = b.c(i3) / 100.0f;
            ptVar = (pt) b.f(i3);
        }
        float c3 = b.c(i2) / 100.0f;
        float max = (Math.max(0.0f, Math.min(1.0f, c2 == c3 ? 0.0f : (f - c2) / (c3 - c2))) * 1.0f) + 0.0f;
        pt ptVar3 = (pt) b.f(i2);
        float[] fArr2 = new float[9];
        for (int i4 = 0; i4 < 9; i4++) {
            float f2 = fArr[i4];
            float b2 = ptVar.b(f2);
            fArr2[i4] = ((ptVar3.b(f2) - b2) * max) + b2;
        }
        rt rtVar2 = new rt(fArr, fArr2);
        b(f, rtVar2);
        return rtVar2;
    }

    public static void b(float f, rt rtVar) {
        synchronized (c) {
            ps0 clone = b.clone();
            clone.d((int) (f * 100.0f), rtVar);
            b = clone;
        }
    }
}
