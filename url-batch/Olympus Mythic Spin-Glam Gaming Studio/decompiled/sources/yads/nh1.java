package yads;

/* loaded from: classes8.dex */
public final class nh1 implements Runnable {
    public final long b;
    public final mx1 c;
    public final /* synthetic */ oh1 d;

    public nh1(oh1 oh1Var, long j, mx1 mx1Var) {
        this.d = oh1Var;
        this.b = j;
        this.c = mx1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mx1 mx1Var = this.c;
        if (mx1Var.b == bt.b) {
            mx1Var.run();
            this.d.a.postDelayed(this, this.b);
        }
    }
}
