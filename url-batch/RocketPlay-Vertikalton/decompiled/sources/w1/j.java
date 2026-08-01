package w1;

import q1.AbstractC0352s;

/* loaded from: classes.dex */
public final class j extends h {

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f4434c;

    public j(Runnable runnable, long j2, i iVar) {
        super(j2, iVar);
        this.f4434c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f4434c.run();
        } finally {
            this.f4432b.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f4434c;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC0352s.c(runnable));
        sb.append(", ");
        sb.append(this.f4431a);
        sb.append(", ");
        sb.append(this.f4432b);
        sb.append(']');
        return sb.toString();
    }
}
