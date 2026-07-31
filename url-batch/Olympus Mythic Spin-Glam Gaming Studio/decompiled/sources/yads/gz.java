package yads;

/* loaded from: classes5.dex */
public final class gz implements a2 {
    public final /* synthetic */ hz a;

    public gz(hz hzVar) {
        this.a = hzVar;
    }

    @Override // yads.a2
    public final void a() {
        ww0 ww0Var = this.a.i;
        if (ww0Var != null) {
            ww0Var.resume();
        }
    }

    @Override // yads.a2
    public final void b() {
        ww0 ww0Var = this.a.i;
        if (ww0Var != null) {
            ww0Var.pause();
        }
    }
}
