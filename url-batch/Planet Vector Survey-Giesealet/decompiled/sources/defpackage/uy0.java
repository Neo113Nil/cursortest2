package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class uy0 {
    public static final e7 f = new e7(0.0f);
    public final jz0 a;
    public long b = Long.MIN_VALUE;
    public e7 c = f;
    public boolean d;
    public float e;

    public uy0(c7 c7Var) {
        this.a = c7Var.a(dz0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b3, code lost:
    
        if (r3 != 0.0f) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Type inference failed for: r13v5, types: [mu] */
    /* JADX WARN: Type inference failed for: r3v9, types: [bu] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00ab -> B:28:0x00ae). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(y5 y5Var, c9 c9Var, lj ljVar) {
        sy0 sy0Var;
        int i;
        float f2;
        sy0 sy0Var2;
        c9 c9Var2;
        uy0 uy0Var;
        y5 y5Var2;
        uy0 uy0Var2;
        bu buVar;
        if (ljVar instanceof sy0) {
            sy0Var = (sy0) ljVar;
            int i2 = sy0Var.j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sy0Var.j = i2 - Integer.MIN_VALUE;
                Object obj = sy0Var.h;
                i = sy0Var.j;
                e7 e7Var = f;
                ck ckVar = ck.d;
                if (i != 0) {
                    rg0.u(obj);
                    if (this.d) {
                        g8.s("animateToZero called while previous animation is running");
                        return null;
                    }
                    b60 b60Var = (b60) sy0Var.getContext().k(b2.E);
                    float t = b60Var != null ? b60Var.t() : 1.0f;
                    this.d = true;
                    f2 = t;
                    sy0Var2 = sy0Var;
                    c9Var2 = c9Var;
                    uy0Var = this;
                    y5Var2 = y5Var;
                    if (Math.abs(uy0Var.e) < 0.01f) {
                        if (Math.abs(uy0Var.e) == 0.0f) {
                            uy0Var.b = Long.MIN_VALUE;
                            uy0Var.c = e7Var;
                            uy0Var.d = false;
                            return ky0.a;
                        }
                        y3 y3Var = new y3(23, uy0Var, y5Var2);
                        sy0Var2.d = uy0Var;
                        sy0Var2.e = c9Var2;
                        sy0Var2.f = null;
                        sy0Var2.j = 2;
                        if (x40.D(sy0Var2.getContext()).e(y3Var, sy0Var2) != ckVar) {
                            buVar = c9Var2;
                            uy0Var2 = uy0Var;
                            buVar.a();
                            uy0Var = uy0Var2;
                            uy0Var.b = Long.MIN_VALUE;
                            uy0Var.c = e7Var;
                            uy0Var.d = false;
                            return ky0.a;
                        }
                        return ckVar;
                    }
                    ty0 ty0Var = new ty0(uy0Var, f2, y5Var2);
                    sy0Var2.d = uy0Var;
                    sy0Var2.e = y5Var2;
                    sy0Var2.f = c9Var2;
                    sy0Var2.g = f2;
                    sy0Var2.j = 1;
                    if (x40.D(sy0Var2.getContext()).e(ty0Var, sy0Var2) == ckVar) {
                        return ckVar;
                    }
                    c9Var2.a();
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            g8.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        buVar = (bu) sy0Var.e;
                        uy0Var2 = sy0Var.d;
                        try {
                            rg0.u(obj);
                            buVar.a();
                            uy0Var = uy0Var2;
                            uy0Var.b = Long.MIN_VALUE;
                            uy0Var.c = e7Var;
                            uy0Var.d = false;
                            return ky0.a;
                        } catch (Throwable th) {
                            th = th;
                            uy0Var2.b = Long.MIN_VALUE;
                            uy0Var2.c = e7Var;
                            uy0Var2.d = false;
                            throw th;
                        }
                    }
                    float f3 = sy0Var.g;
                    ?? r3 = sy0Var.f;
                    ?? r13 = (mu) sy0Var.e;
                    uy0 uy0Var3 = sy0Var.d;
                    try {
                        rg0.u(obj);
                        f2 = f3;
                        y5Var2 = r13;
                        sy0Var2 = sy0Var;
                        c9Var2 = r3;
                        uy0Var = uy0Var3;
                    } catch (Throwable th2) {
                        th = th2;
                        uy0Var2 = uy0Var3;
                        uy0Var2.b = Long.MIN_VALUE;
                        uy0Var2.c = e7Var;
                        uy0Var2.d = false;
                        throw th;
                    }
                    try {
                        c9Var2.a();
                    } catch (Throwable th3) {
                        th = th3;
                        uy0Var2 = uy0Var;
                        uy0Var2.b = Long.MIN_VALUE;
                        uy0Var2.c = e7Var;
                        uy0Var2.d = false;
                        throw th;
                    }
                }
            }
        }
        sy0Var = new sy0(this, ljVar);
        Object obj2 = sy0Var.h;
        i = sy0Var.j;
        e7 e7Var2 = f;
        ck ckVar2 = ck.d;
        if (i != 0) {
        }
    }
}
