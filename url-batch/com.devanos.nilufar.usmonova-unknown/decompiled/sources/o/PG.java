package o;

/* loaded from: classes.dex */
public final class PG extends RG {
    public final C1032fM a;

    public PG(C1032fM c1032fM) {
        this.a = c1032fM;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PG) {
            return AbstractC0048Bt.h(this.a, ((PG) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
