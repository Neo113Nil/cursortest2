package yads;

/* loaded from: classes6.dex */
public final class qm3 implements bo {
    public final vo2 a;

    public qm3(vo2 vo2Var) {
        this.a = vo2Var;
    }

    @Override // yads.wp2
    public final void a(Object obj) {
        this.a.onSuccess(obj);
    }

    @Override // yads.vp2
    public final void a(hm3 hm3Var) {
        this.a.a(pm3.a(hm3Var));
    }
}
