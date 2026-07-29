package o;

/* renamed from: o.Nk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0350Nk extends AbstractRunnableC0376Ok {
    public final PV j;

    public C0350Nk(long j, PV pv) {
        super(j);
        this.j = pv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.j.run();
    }

    @Override // o.AbstractRunnableC0376Ok
    public final String toString() {
        return super.toString() + this.j;
    }
}
