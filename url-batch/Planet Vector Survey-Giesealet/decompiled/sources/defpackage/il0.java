package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class il0 {
    public ra0 a;
    public final float b;
    public final boolean c;
    public Float d;
    public ra0 e;
    public final b6 f = mz.f();
    public final b6 g = mz.f();
    public final b6 h = mz.f();
    public final ff i;
    public final ce0 j;
    public final ce0 k;

    public il0(ra0 ra0Var, float f, boolean z) {
        this.a = ra0Var;
        this.b = f;
        this.c = z;
        ff ffVar = new ff(true);
        ffVar.M(null);
        this.i = ffVar;
        Boolean bool = Boolean.FALSE;
        this.j = ud0.o(bool);
        this.k = ud0.o(bool);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00aa, code lost:
    
        if (r9 != r2) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0058, code lost:
    
        if (r9 == r2) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(lj ljVar) {
        fl0 fl0Var;
        int i;
        ff ffVar;
        Object obj;
        Object R;
        if (ljVar instanceof fl0) {
            fl0Var = (fl0) ljVar;
            int i2 = fl0Var.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fl0Var.g = i2 - Integer.MIN_VALUE;
                Object obj2 = fl0Var.e;
                i = fl0Var.g;
                ck ckVar = ck.d;
                ky0 ky0Var = ky0.a;
                int i3 = 1;
                kj kjVar = null;
                if (i != 0) {
                    rg0.u(obj2);
                    fl0Var.d = this;
                    fl0Var.g = 1;
                    Object v = x40.v(new hl0(this, kjVar, 0), fl0Var);
                    if (v != ckVar) {
                        v = ky0Var;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                rg0.u(obj2);
                                return ky0Var;
                            }
                            g8.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        this = fl0Var.d;
                        rg0.u(obj2);
                        fl0Var.d = null;
                        fl0Var.g = 3;
                        this.getClass();
                        Object v2 = x40.v(new hl0(this, kjVar, i3), fl0Var);
                        if (v2 != ckVar) {
                            v2 = ky0Var;
                        }
                        return v2 == ckVar ? ckVar : ky0Var;
                    }
                    this = fl0Var.d;
                    rg0.u(obj2);
                }
                this.j.setValue(Boolean.TRUE);
                ffVar = this.i;
                fl0Var.d = this;
                fl0Var.g = 2;
                ffVar.getClass();
                while (true) {
                    obj = g00.d.get(ffVar);
                    if (obj instanceof nx) {
                        if (obj instanceof jf) {
                            throw ((jf) obj).a;
                        }
                        R = nk.R(obj);
                    } else if (ffVar.X(obj) >= 0) {
                        d00 d00Var = new d00(d31.B(fl0Var), ffVar);
                        d00Var.q();
                        d00Var.t(new dc(i3, nk.A(ffVar, true, new xz(i3, d00Var))));
                        R = d00Var.p();
                        break;
                    }
                }
            }
        }
        fl0Var = new fl0(this, ljVar);
        Object obj22 = fl0Var.e;
        i = fl0Var.g;
        ck ckVar2 = ck.d;
        ky0 ky0Var2 = ky0.a;
        int i32 = 1;
        kj kjVar2 = null;
        if (i != 0) {
        }
        this.j.setValue(Boolean.TRUE);
        ffVar = this.i;
        fl0Var.d = this;
        fl0Var.g = 2;
        ffVar.getClass();
        while (true) {
            obj = g00.d.get(ffVar);
            if (obj instanceof nx) {
            }
        }
    }
}
