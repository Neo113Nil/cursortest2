package K;

/* loaded from: classes.dex */
public abstract class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f442a;

    /* renamed from: b, reason: collision with root package name */
    public C.d[] f443b;

    public r0() {
        this(new z0());
    }

    public final void a() {
        C.d[] dVarArr = this.f443b;
        if (dVarArr != null) {
            C.d dVar = dVarArr[0];
            C.d dVar2 = dVarArr[1];
            z0 z0Var = this.f442a;
            if (dVar2 == null) {
                dVar2 = z0Var.f465a.f(2);
            }
            if (dVar == null) {
                dVar = z0Var.f465a.f(1);
            }
            g(C.d.a(dVar, dVar2));
            C.d dVar3 = this.f443b[A.c.V(16)];
            if (dVar3 != null) {
                f(dVar3);
            }
            C.d dVar4 = this.f443b[A.c.V(32)];
            if (dVar4 != null) {
                d(dVar4);
            }
            C.d dVar5 = this.f443b[A.c.V(64)];
            if (dVar5 != null) {
                h(dVar5);
            }
        }
    }

    public abstract z0 b();

    public void c(int i, C.d dVar) {
        if (this.f443b == null) {
            this.f443b = new C.d[9];
        }
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.f443b[A.c.V(i2)] = dVar;
            }
        }
    }

    public void d(C.d dVar) {
    }

    public abstract void e(C.d dVar);

    public void f(C.d dVar) {
    }

    public abstract void g(C.d dVar);

    public void h(C.d dVar) {
    }

    public r0(z0 z0Var) {
        this.f442a = z0Var;
    }
}
