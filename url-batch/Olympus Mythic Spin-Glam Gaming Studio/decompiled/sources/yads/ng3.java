package yads;

/* loaded from: classes11.dex */
public final class ng3 implements Runnable {
    public final /* synthetic */ og3 b;

    public ng3(og3 og3Var) {
        this.b = og3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        og3 og3Var = this.b;
        if (og3Var.d || !og3Var.a.a()) {
            this.b.c.postDelayed(this, 200L);
            return;
        }
        this.b.b.a();
        og3 og3Var2 = this.b;
        og3Var2.d = true;
        og3Var2.c.removeCallbacksAndMessages(null);
        og3Var2.e = false;
    }
}
