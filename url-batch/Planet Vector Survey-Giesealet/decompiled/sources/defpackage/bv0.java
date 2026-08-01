package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class bv0 extends av0 {
    public final Runnable f;

    public bv0(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.f = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(nk.u(runnable));
        sb.append(", ");
        sb.append(this.d);
        sb.append(", ");
        sb.append(this.e ? "Blocking" : "Non-blocking");
        sb.append(']');
        return sb.toString();
    }
}
