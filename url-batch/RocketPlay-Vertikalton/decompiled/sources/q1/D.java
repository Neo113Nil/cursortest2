package q1;

/* loaded from: classes.dex */
public abstract class D extends AbstractC0349o {

    /* renamed from: c, reason: collision with root package name */
    public long f3863c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public W0.h f3864e;

    public final void F() {
        long j2 = this.f3863c - 4294967296L;
        this.f3863c = j2;
        if (j2 <= 0 && this.d) {
            J();
        }
    }

    public abstract Thread G();

    public final void H(boolean z2) {
        this.f3863c = (z2 ? 4294967296L : 1L) + this.f3863c;
        if (z2) {
            return;
        }
        this.d = true;
    }

    public final boolean I() {
        W0.h hVar = this.f3864e;
        if (hVar == null) {
            return false;
        }
        AbstractC0357x abstractC0357x = (AbstractC0357x) (hVar.isEmpty() ? null : hVar.removeFirst());
        if (abstractC0357x == null) {
            return false;
        }
        abstractC0357x.run();
        return true;
    }

    public abstract void J();
}
