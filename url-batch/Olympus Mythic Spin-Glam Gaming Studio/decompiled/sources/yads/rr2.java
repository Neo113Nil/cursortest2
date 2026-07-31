package yads;

/* loaded from: classes10.dex */
public final class rr2 implements a2 {
    public final /* synthetic */ tr2 a;

    public rr2(tr2 tr2Var) {
        this.a = tr2Var;
    }

    @Override // yads.a2
    public final void a() {
        ww0 ww0Var = this.a.g;
        if (ww0Var != null) {
            ww0Var.resume();
        }
    }

    @Override // yads.a2
    public final void b() {
        ww0 ww0Var = this.a.g;
        if (ww0Var != null) {
            ww0Var.pause();
        }
    }
}
