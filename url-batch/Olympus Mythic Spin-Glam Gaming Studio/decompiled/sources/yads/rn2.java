package yads;

/* loaded from: classes10.dex */
public final class rn2 implements Runnable {
    public final q72 b;
    public final wn2 c;

    public rn2(q72 q72Var, wn2 wn2Var) {
        this.b = q72Var;
        this.c = wn2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.setVisibility(4);
        this.c.a.setVisibility(0);
    }
}
