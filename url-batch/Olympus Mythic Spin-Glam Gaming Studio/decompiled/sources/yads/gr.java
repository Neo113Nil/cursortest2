package yads;

/* loaded from: classes5.dex */
public final class gr implements Runnable {
    public final /* synthetic */ ro2 b;
    public final /* synthetic */ hr c;

    public gr(hr hrVar, ro2 ro2Var) {
        this.c = hrVar;
        this.b = ro2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.c.c.put(this.b);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
