package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class fk0 extends m implements vj {
    public final /* synthetic */ yh e;
    public final /* synthetic */ gk0 f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fk0(yh yhVar, gk0 gk0Var) {
        super(r0);
        b2 b2Var = b2.u;
        this.e = yhVar;
        this.f = gk0Var;
    }

    @Override // defpackage.vj
    public final void m(rj rjVar, Throwable th) {
        yh yhVar = this.e;
        gk0 gk0Var = this.f;
        x40.W(th, new f8(1, yhVar, gk0Var));
        vj vjVar = (vj) gk0Var.d.k(b2.u);
        if (vjVar == null) {
            throw th;
        }
        vjVar.m(rjVar, th);
    }
}
