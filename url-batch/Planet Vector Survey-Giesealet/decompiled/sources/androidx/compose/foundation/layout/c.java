package androidx.compose.foundation.layout;

import defpackage.b2;
import defpackage.j;
import defpackage.nz;
import defpackage.o9;
import defpackage.u50;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class c {
    public static final FillElement a = new FillElement(2);
    public static final FillElement b = new FillElement(3);
    public static final WrapContentElement c;
    public static final WrapContentElement d;

    static {
        o9 o9Var = b2.i;
        int i = 10;
        c = new WrapContentElement(3, new j(i, o9Var), o9Var);
        o9 o9Var2 = b2.e;
        d = new WrapContentElement(3, new j(i, o9Var2), o9Var2);
    }

    public static final u50 a(float f, float f2) {
        return new UnspecifiedConstraintsElement(f, f2);
    }

    public static final u50 b(u50 u50Var, float f) {
        return u50Var.c(new SizeElement(0.0f, f, 0.0f, f, 5));
    }

    public static final u50 c(u50 u50Var, float f) {
        return u50Var.c(new SizeElement(f, f, f, f));
    }

    public static final u50 d() {
        return new SizeElement(220.0f, 0.0f, 220.0f, 0.0f, 10);
    }

    public static u50 e(u50 u50Var) {
        return u50Var.c(new SizeElement(Float.NaN, 0.0f, 760.0f, 0.0f, 10));
    }

    public static u50 f() {
        o9 o9Var = b2.i;
        return nz.l(o9Var, o9Var) ? c : nz.l(o9Var, b2.e) ? d : new WrapContentElement(3, new j(10, o9Var), o9Var);
    }
}
