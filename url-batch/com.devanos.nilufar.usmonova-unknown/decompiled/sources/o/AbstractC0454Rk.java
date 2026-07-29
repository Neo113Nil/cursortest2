package o;

/* renamed from: o.Rk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0454Rk extends AbstractC0267Ke {
    public static final /* synthetic */ int m = 0;
    public long j;
    public boolean k;
    public D6 l;

    public final void O(boolean z) {
        long j = this.j - (z ? 4294967296L : 1L);
        this.j = j;
        if (j <= 0 && this.k) {
            shutdown();
        }
    }

    public final void P(AbstractC0063Ci abstractC0063Ci) {
        D6 d6 = this.l;
        if (d6 == null) {
            d6 = new D6();
            this.l = d6;
        }
        d6.addLast(abstractC0063Ci);
    }

    public abstract Thread Q();

    public final void R(boolean z) {
        this.j = (z ? 4294967296L : 1L) + this.j;
        if (z) {
            return;
        }
        this.k = true;
    }

    public abstract long S();

    public final boolean T() {
        D6 d6 = this.l;
        if (d6 == null) {
            return false;
        }
        AbstractC0063Ci abstractC0063Ci = (AbstractC0063Ci) (d6.isEmpty() ? null : d6.removeFirst());
        if (abstractC0063Ci == null) {
            return false;
        }
        abstractC0063Ci.run();
        return true;
    }

    public void U(long j, AbstractRunnableC0376Ok abstractRunnableC0376Ok) {
        RunnableC2105vg.q.Z(j, abstractRunnableC0376Ok);
    }

    public abstract void shutdown();
}
