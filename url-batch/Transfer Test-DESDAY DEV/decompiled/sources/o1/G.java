package o1;

/* loaded from: classes.dex */
public abstract class G extends AbstractC0299p {

    /* renamed from: c, reason: collision with root package name */
    public long f3283c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public V0.c f3284e;

    public final void B() {
        long j2 = this.f3283c - 4294967296L;
        this.f3283c = j2;
        if (j2 <= 0 && this.d) {
            G();
        }
    }

    public abstract Thread C();

    public final void D(boolean z2) {
        this.f3283c = (z2 ? 4294967296L : 1L) + this.f3283c;
        if (z2) {
            return;
        }
        this.d = true;
    }

    public final boolean E() {
        V0.c cVar = this.f3284e;
        if (cVar == null) {
            return false;
        }
        AbstractC0307y abstractC0307y = (AbstractC0307y) (cVar.isEmpty() ? null : cVar.removeFirst());
        if (abstractC0307y == null) {
            return false;
        }
        abstractC0307y.run();
        return true;
    }

    public void F(long j2, D d) {
        RunnableC0303u.i.L(j2, d);
    }

    public abstract void G();
}
