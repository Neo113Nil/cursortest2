package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class az0 extends v00 implements mu {
    public final /* synthetic */ int e;
    public final /* synthetic */ bz0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ az0(bz0 bz0Var, int i) {
        super(1);
        this.e = i;
        this.f = bz0Var;
    }

    @Override // defpackage.mu
    public final Object c(Object obj) {
        int i = this.e;
        ky0 ky0Var = ky0.a;
        bz0 bz0Var = this.f;
        switch (i) {
            case 0:
                bz0Var.d = true;
                bz0Var.f.a();
                return ky0Var;
            default:
                oo ooVar = (oo) obj;
                wv wvVar = bz0Var.b;
                float f = bz0Var.k;
                float f2 = bz0Var.l;
                t7 r = ooVar.r();
                long r2 = r.r();
                r.p().i();
                try {
                    ((p01) r.e).u(f, f2, 0L);
                    wvVar.a(ooVar);
                    return ky0Var;
                } finally {
                    r.p().g();
                    r.B(r2);
                }
        }
    }
}
