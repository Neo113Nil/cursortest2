package o;

/* loaded from: classes.dex */
public final class PV extends C1102gQ implements Runnable {
    public final long l;

    public PV(long j, QV qv) {
        super(qv, qv.getContext());
        this.l = j;
    }

    @Override // o.C0283Ku
    public final String P() {
        return super.P() + "(timeMillis=" + this.l + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        PX.L(this.j);
        n(new OV("Timed out waiting for " + this.l + " ms", this));
    }
}
