package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class pq extends uj {
    public static final /* synthetic */ int i = 0;
    public long f;
    public boolean g;
    public h8 h;

    public final void l(boolean z) {
        long j = this.f - (z ? 4294967296L : 1L);
        this.f = j;
        if (j <= 0 && this.g) {
            shutdown();
        }
    }

    public final void p(tm tmVar) {
        h8 h8Var = this.h;
        if (h8Var == null) {
            h8Var = new h8();
            this.h = h8Var;
        }
        h8Var.addLast(tmVar);
    }

    public final void r(boolean z) {
        this.f = (z ? 4294967296L : 1L) + this.f;
        if (z) {
            return;
        }
        this.g = true;
    }

    public abstract void shutdown();

    public abstract long v();

    public final boolean w() {
        h8 h8Var = this.h;
        if (h8Var == null) {
            return false;
        }
        tm tmVar = (tm) (h8Var.isEmpty() ? null : h8Var.removeFirst());
        if (tmVar == null) {
            return false;
        }
        tmVar.run();
        return true;
    }
}
