package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class zu0 implements x6 {
    public final jz0 a;
    public final j3 b;
    public Object c;
    public Object d;
    public i7 e;
    public i7 f;
    public final i7 g;
    public long h;
    public i7 i;

    public zu0(c7 c7Var, j3 j3Var, Object obj, Object obj2, i7 i7Var) {
        this.a = c7Var.a(j3Var);
        this.b = j3Var;
        this.c = obj2;
        this.d = obj;
        this.e = (i7) ((mu) j3Var.e).c(obj);
        mu muVar = (mu) j3Var.e;
        this.f = (i7) muVar.c(obj2);
        this.g = i7Var != null ? mz.y(i7Var) : ((i7) muVar.c(obj)).c();
        this.h = -1L;
    }

    @Override // defpackage.x6
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.x6
    public final Object b(long j) {
        if (y6.a(this, j)) {
            return this.c;
        }
        i7 j2 = this.a.j(j, this.e, this.f, this.g);
        int b = j2.b();
        for (int i = 0; i < b; i++) {
            if (Float.isNaN(j2.a(i))) {
                hh0.b("AnimationVector cannot contain a NaN. " + j2 + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return ((mu) this.b.f).c(j2);
    }

    @Override // defpackage.x6
    public final long c() {
        if (this.h < 0) {
            this.h = this.a.m(this.e, this.f, this.g);
        }
        return this.h;
    }

    @Override // defpackage.x6
    public final j3 d() {
        return this.b;
    }

    @Override // defpackage.x6
    public final Object e() {
        return this.c;
    }

    @Override // defpackage.x6
    public final i7 f(long j) {
        if (!y6.a(this, j)) {
            return this.a.g(j, this.e, this.f, this.g);
        }
        i7 i7Var = this.i;
        if (i7Var != null) {
            return i7Var;
        }
        i7 k = this.a.k(this.e, this.f, this.g);
        this.i = k;
        return k;
    }

    @Override // defpackage.x6
    public final /* synthetic */ boolean g(long j) {
        return y6.a(this, j);
    }

    public final void h(Object obj) {
        if (nz.l(obj, this.d)) {
            return;
        }
        this.d = obj;
        this.e = (i7) ((mu) this.b.e).c(obj);
        this.i = null;
        this.h = -1L;
    }

    public final void i(Object obj) {
        if (nz.l(this.c, obj)) {
            return;
        }
        this.c = obj;
        this.f = (i7) ((mu) this.b.e).c(obj);
        this.i = null;
        this.h = -1L;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.d + " -> " + this.c + ",initial velocity: " + this.g + ", duration: " + (c() / 1000000) + " ms,animationSpec: " + this.a;
    }
}
