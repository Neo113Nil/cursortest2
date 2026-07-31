package yads;

/* loaded from: classes3.dex */
public final class lh1 {
    public final mh1 a;

    public lh1(mh1 mh1Var, q63 q63Var) {
        this.a = mh1Var;
    }

    public final void a(Runnable runnable) {
        if (q63.a()) {
            runnable.run();
        } else {
            this.a.a.post(runnable);
        }
    }

    public final void a() {
        this.a.a.removeCallbacksAndMessages(null);
    }
}
