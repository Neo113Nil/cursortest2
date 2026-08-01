package defpackage;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final /* synthetic */ class g8 implements hn, ro {
    public final /* synthetic */ int a;

    public static /* synthetic */ void c() {
        throw new kf();
    }

    public static /* synthetic */ void d(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void e(String str) {
        throw new NoSuchElementException(str);
    }

    public static /* synthetic */ void f(String str, int i) {
        throw new IllegalArgumentException(str + i);
    }

    public static /* synthetic */ void g(String str, int i, Object obj) {
        throw new IllegalArgumentException((str + i + obj).toString());
    }

    public static /* synthetic */ void h(String str, Object obj, Object obj2) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void i(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void j(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    public static /* synthetic */ void k() {
        throw new NoSuchElementException();
    }

    public static /* synthetic */ void l(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void m(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static /* synthetic */ void n(String str, int i) {
        throw new IllegalArgumentException(str + i);
    }

    public static /* synthetic */ void o(String str, Object obj, Object obj2) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void p(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void q() {
        throw new ClassCastException();
    }

    public static /* synthetic */ void r(String str) {
        throw new IllegalArgumentException(str);
    }

    public static /* synthetic */ void s(String str) {
        throw new IllegalStateException(str);
    }

    @Override // defpackage.hn
    public double b(double d) {
        switch (this.a) {
            case 3:
                double d2 = d < 0.0d ? -d : d;
                return Math.copySign(d2 >= 0.0031308049535603718d ? (Math.pow(d2, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d2 / 0.07739938080495357d, d);
            case 4:
                double d3 = d < 0.0d ? -d : d;
                return Math.copySign(d3 >= 0.04045d ? Math.pow((0.9478672985781991d * d3) + 0.05213270142180095d, 2.4d) : d3 * 0.07739938080495357d, d);
            case 5:
                float[] fArr = qe.a;
                return qe.b(qe.c, d);
            case 6:
                float[] fArr2 = qe.a;
                return qe.a(qe.c, d);
            case 7:
                float[] fArr3 = qe.a;
                return qe.d(qe.d, d);
            case 8:
                float[] fArr4 = qe.a;
                return qe.c(qe.d, d);
            default:
                return d;
        }
    }

    @Override // defpackage.ro
    public float a(float f) {
        return f;
    }
}
