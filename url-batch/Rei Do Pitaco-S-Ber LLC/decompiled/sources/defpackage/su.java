package defpackage;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class su extends oo {
    public final nu o;

    public su(nu nuVar) {
        nuVar.getClass();
        this.o = nuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && su.class == obj.getClass() && oo.b(this.o, ((su) obj).o);
    }

    public final int hashCode() {
        return this.o.hashCode() - 31;
    }

    public final String toString() {
        return "InProgress(latestEvent=" + this.o + ", direction=-1)";
    }
}
