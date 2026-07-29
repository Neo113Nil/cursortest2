package o;

/* renamed from: o.Mk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0324Mk extends AbstractRunnableC0376Ok {
    public final C0849ca j;
    public final /* synthetic */ AbstractC0428Qk k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0324Mk(AbstractC0428Qk abstractC0428Qk, long j, C0849ca c0849ca) {
        super(j);
        this.k = abstractC0428Qk;
        this.j = c0849ca;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.j.B(this.k);
    }

    @Override // o.AbstractRunnableC0376Ok
    public final String toString() {
        return super.toString() + this.j;
    }
}
