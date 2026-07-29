package o;

/* renamed from: o.lo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1454lo {
    public static final float[] a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    public static volatile PS b = new PS(0);
    public static final Object[] c;

    static {
        Object[] objArr = new Object[0];
        c = objArr;
        synchronized (objArr) {
            b.d((int) 115.0f, new C1520mo(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            b.d((int) 130.0f, new C1520mo(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            b.d((int) 150.0f, new C1520mo(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            b.d((int) 180.0f, new C1520mo(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            b.d((int) 200.0f, new C1520mo(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((b.h[0] / 100.0f) - 0.01f <= 1.03f) {
            throw new IllegalStateException("You should only apply non-linear scaling to font scales > 1");
        }
    }

    public static InterfaceC1388ko a(float f) {
        float f2;
        InterfaceC1388ko interfaceC1388ko;
        float[] fArr = a;
        if (f < 1.03f) {
            return null;
        }
        int i = (int) (f * 100.0f);
        InterfaceC1388ko interfaceC1388ko2 = (InterfaceC1388ko) b.c(i);
        if (interfaceC1388ko2 != null) {
            return interfaceC1388ko2;
        }
        PS ps = b;
        int h = AbstractC1473m3.h(ps.j, i, ps.h);
        if (h >= 0) {
            return (InterfaceC1388ko) b.i[h];
        }
        int i2 = -(h + 1);
        int i3 = i2 - 1;
        if (i2 >= b.j) {
            C1520mo c1520mo = new C1520mo(new float[]{1.0f}, new float[]{f});
            b(f, c1520mo);
            return c1520mo;
        }
        if (i3 < 0) {
            interfaceC1388ko = new C1520mo(fArr, fArr);
            f2 = 1.0f;
        } else {
            f2 = b.h[i3] / 100.0f;
            interfaceC1388ko = (InterfaceC1388ko) b.i[i3];
        }
        float f3 = b.h[i2] / 100.0f;
        float max = (Math.max(0.0f, Math.min(1.0f, f2 == f3 ? 0.0f : (f - f2) / (f3 - f2))) * 1.0f) + 0.0f;
        InterfaceC1388ko interfaceC1388ko3 = (InterfaceC1388ko) b.i[i2];
        float[] fArr2 = new float[9];
        for (int i4 = 0; i4 < 9; i4++) {
            float f4 = fArr[i4];
            float a2 = interfaceC1388ko.a(f4);
            fArr2[i4] = ((interfaceC1388ko3.a(f4) - a2) * max) + a2;
        }
        C1520mo c1520mo2 = new C1520mo(fArr, fArr2);
        b(f, c1520mo2);
        return c1520mo2;
    }

    public static void b(float f, C1520mo c1520mo) {
        synchronized (c) {
            PS clone = b.clone();
            clone.d((int) (f * 100.0f), c1520mo);
            b = clone;
        }
    }
}
