package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class b6 {
    public final j3 a;
    public final Object b;
    public final d7 c;
    public final ce0 d;
    public final ce0 e;
    public final s70 f;
    public final i7 g;
    public final i7 h;
    public final i7 i;
    public final i7 j;

    public b6(Comparable comparable, j3 j3Var, Float f, int i) {
        f = (i & 4) != 0 ? null : f;
        this.a = j3Var;
        this.b = f;
        d7 d7Var = new d7(j3Var, comparable, null, 60);
        this.c = d7Var;
        this.d = ud0.o(Boolean.FALSE);
        this.e = ud0.o(comparable);
        this.f = new s70();
        new ts0(1500.0f, f);
        i7 i7Var = d7Var.f;
        boolean z = i7Var instanceof e7;
        i7 i7Var2 = z ? mz.e : i7Var instanceof f7 ? mz.f : i7Var instanceof g7 ? mz.g : mz.h;
        this.g = i7Var2;
        i7 i7Var3 = z ? mz.a : i7Var instanceof f7 ? mz.b : i7Var instanceof g7 ? mz.c : mz.d;
        this.h = i7Var3;
        this.i = i7Var2;
        this.j = i7Var3;
    }

    public static final Object a(b6 b6Var, Object obj) {
        j3 j3Var = b6Var.a;
        i7 i7Var = b6Var.j;
        i7 i7Var2 = b6Var.i;
        if (!nz.l(i7Var2, b6Var.g) || !nz.l(i7Var, b6Var.h)) {
            i7 i7Var3 = (i7) ((mu) j3Var.e).c(obj);
            int b = i7Var3.b();
            boolean z = false;
            for (int i = 0; i < b; i++) {
                if (i7Var3.a(i) < i7Var2.a(i) || i7Var3.a(i) > i7Var.a(i)) {
                    i7Var3.e(rg0.f(i7Var3.a(i), i7Var2.a(i), i7Var.a(i)), i);
                    z = true;
                }
            }
            if (z) {
                return ((mu) j3Var.f).c(i7Var3);
            }
        }
        return obj;
    }

    public static Object b(b6 b6Var, Comparable comparable, c7 c7Var, fu0 fu0Var) {
        Object c = ((mu) b6Var.a.f).c(b6Var.c.f);
        Object c2 = b6Var.c();
        j3 j3Var = b6Var.a;
        return s70.a(b6Var.f, new z5(b6Var, c, new zu0(c7Var, j3Var, c2, comparable, (i7) ((mu) j3Var.e).c(c)), b6Var.c.g, null), fu0Var);
    }

    public final Object c() {
        return this.c.e.getValue();
    }

    public final Object d(jn jnVar, fu0 fu0Var) {
        Object a = s70.a(this.f, new a6(this, jnVar, null), fu0Var);
        return a == ck.d ? a : ky0.a;
    }
}
