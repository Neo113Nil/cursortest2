package yads;

/* loaded from: classes15.dex */
public final class fg3 implements Runnable {
    public final /* synthetic */ gg3 b;

    public fg3(gg3 gg3Var) {
        this.b = gg3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long adPosition = this.b.a.getAdPosition();
        this.b.b.a(this.b.a.c(), adPosition);
        gg3 gg3Var = this.b;
        if (gg3Var.d) {
            gg3Var.c.postDelayed(this, 200L);
        }
    }
}
