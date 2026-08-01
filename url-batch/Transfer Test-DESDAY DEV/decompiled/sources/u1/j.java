package u1;

import o1.AbstractC0302t;

/* loaded from: classes.dex */
public final class j extends h {

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f3827c;

    public j(Runnable runnable, long j2, i iVar) {
        super(j2, iVar);
        this.f3827c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f3827c.run();
        } finally {
            this.f3825b.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f3827c;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC0302t.e(runnable));
        sb.append(", ");
        sb.append(this.f3824a);
        sb.append(", ");
        sb.append(this.f3825b);
        sb.append(']');
        return sb.toString();
    }
}
