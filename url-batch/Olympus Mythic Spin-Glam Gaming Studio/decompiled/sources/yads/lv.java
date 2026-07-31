package yads;

/* loaded from: classes3.dex */
public final class lv implements vr2 {
    public final al2 a;
    public final tw2 b;

    public lv(nv nvVar, al2 al2Var) {
        tw2 tw2Var = new tw2(nvVar.b, nvVar.c);
        this.a = al2Var;
        this.b = tw2Var;
    }

    @Override // yads.vr2
    public final void a() {
        al2 al2Var = this.a;
        tw2 tw2Var = this.b;
        zk2 zk2Var = al2Var.a;
        if (zk2Var != null) {
            zk2Var.a(tw2Var);
        }
    }
}
