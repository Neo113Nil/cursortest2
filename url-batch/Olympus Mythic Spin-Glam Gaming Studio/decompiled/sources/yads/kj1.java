package yads;

/* loaded from: classes5.dex */
public final class kj1 {
    public final w00 a;

    public kj1(w00 w00Var) {
        this.a = w00Var;
    }

    public final Float a() {
        int i;
        int i2;
        w00 w00Var = this.a;
        i10 i10Var = w00Var.a;
        y00 y00Var = w00Var.d;
        if (i10Var != null) {
            return Float.valueOf(i10Var.a);
        }
        if (y00Var == null || (i = y00Var.c) <= 0 || (i2 = y00Var.d) <= 0) {
            return null;
        }
        return Float.valueOf(i / i2);
    }
}
