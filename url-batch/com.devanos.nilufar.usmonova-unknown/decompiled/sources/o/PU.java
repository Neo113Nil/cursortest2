package o;

/* loaded from: classes.dex */
public final class PU extends KU {
    public final Runnable j;

    public PU(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.j = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.j.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.j;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC1052fg.B(runnable));
        sb.append(", ");
        sb.append(this.h);
        sb.append(", ");
        return AbstractC2188wx.h(sb, this.i ? "Blocking" : "Non-blocking", ']');
    }
}
