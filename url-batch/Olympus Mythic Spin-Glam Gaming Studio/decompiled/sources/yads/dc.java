package yads;

/* loaded from: classes5.dex */
public final class dc implements Runnable {
    public final /* synthetic */ ec b;

    public dc(ec ecVar) {
        this.b = ecVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gc gcVar = this.b.e;
        if (gcVar != null) {
            ((lb) gcVar).a.e.removeCallbacksAndMessages(null);
        }
    }
}
