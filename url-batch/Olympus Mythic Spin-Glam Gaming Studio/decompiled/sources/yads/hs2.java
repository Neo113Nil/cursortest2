package yads;

/* loaded from: classes5.dex */
public final class hs2 implements a2 {
    public final h52 a;

    public hs2(h52 h52Var) {
        this.a = h52Var;
    }

    @Override // yads.a2
    public final void a() {
        ww0 ww0Var = this.a.b;
        if (ww0Var != null) {
            ww0Var.resume();
        }
    }

    @Override // yads.a2
    public final void b() {
        ww0 ww0Var = this.a.b;
        if (ww0Var != null) {
            ww0Var.pause();
        }
    }
}
