package yads;

/* loaded from: classes6.dex */
public final class w62 implements rf3 {
    public final /* synthetic */ y62 a;

    public w62(y62 y62Var) {
        this.a = y62Var;
    }

    public static final void a(y62 y62Var) {
        y62Var.a(y62Var.i);
    }

    @Override // yads.rf3
    public final void b() {
        final y62 y62Var = this.a;
        y62Var.m = null;
        bz2 bz2Var = y62Var.d;
        if (bz2Var == null || !bz2Var.d) {
            y62Var.k.a();
        } else {
            mh1 mh1Var = y62Var.e;
            mh1Var.a.post(new Runnable() { // from class: yads.w62$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    w62.a(y62.this);
                }
            });
        }
        this.a.c.b();
    }

    @Override // yads.rf3
    public final void c() {
        q72 q72Var = (q72) this.a.b.b();
        if (q72Var != null) {
            q72Var.setClickable(true);
        }
    }

    @Override // yads.rf3
    public final void a() {
        this.a.c.a();
    }
}
