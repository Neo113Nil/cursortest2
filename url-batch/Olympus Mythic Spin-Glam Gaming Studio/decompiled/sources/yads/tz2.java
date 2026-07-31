package yads;

/* loaded from: classes4.dex */
public final class tz2 extends h53 {
    public final /* synthetic */ uz2 f;

    public tz2(uz2 uz2Var) {
        this.f = uz2Var;
    }

    @Override // yads.h53
    public final void b() {
        uz2 uz2Var = this.f;
        synchronized (uz2Var.b) {
            this.b = 0;
            this.d = null;
            h53[] h53VarArr = uz2Var.f;
            int i = uz2Var.h;
            uz2Var.h = i + 1;
            h53VarArr[i] = this;
            uz2Var.d();
        }
    }
}
