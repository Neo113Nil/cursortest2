package yads;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes15.dex */
public final class sm1 {
    public final int a;
    public final pm1 b;
    public final CopyOnWriteArrayList c;
    public final long d;

    public sm1() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, yads.tm1] */
    public final void a(final wf1 wf1Var, final yl1 yl1Var) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            rm1 rm1Var = (rm1) it.next();
            final ?? r2 = rm1Var.b;
            sb3.a(rm1Var.a, new Runnable() { // from class: yads.sm1$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    sm1.this.a(r2, wf1Var, yl1Var);
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, yads.tm1] */
    public final void b(final wf1 wf1Var, final yl1 yl1Var) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            rm1 rm1Var = (rm1) it.next();
            final ?? r2 = rm1Var.b;
            sb3.a(rm1Var.a, new Runnable() { // from class: yads.sm1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    sm1.this.b(r2, wf1Var, yl1Var);
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, yads.tm1] */
    public final void c(final wf1 wf1Var, final yl1 yl1Var) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            rm1 rm1Var = (rm1) it.next();
            final ?? r2 = rm1Var.b;
            sb3.a(rm1Var.a, new Runnable() { // from class: yads.sm1$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    sm1.this.c(r2, wf1Var, yl1Var);
                }
            });
        }
    }

    public sm1(CopyOnWriteArrayList copyOnWriteArrayList, int i, pm1 pm1Var, long j) {
        this.c = copyOnWriteArrayList;
        this.a = i;
        this.b = pm1Var;
        this.d = j;
    }

    public final /* synthetic */ void a(tm1 tm1Var, wf1 wf1Var, yl1 yl1Var) {
        tm1Var.c(this.a, this.b, wf1Var, yl1Var);
    }

    public final /* synthetic */ void b(tm1 tm1Var, wf1 wf1Var, yl1 yl1Var) {
        tm1Var.a(this.a, this.b, wf1Var, yl1Var);
    }

    public final /* synthetic */ void c(tm1 tm1Var, wf1 wf1Var, yl1 yl1Var) {
        tm1Var.b(this.a, this.b, wf1Var, yl1Var);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, yads.tm1] */
    public final void a(final wf1 wf1Var, final yl1 yl1Var, final IOException iOException, final boolean z) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            rm1 rm1Var = (rm1) it.next();
            final ?? r4 = rm1Var.b;
            sb3.a(rm1Var.a, new Runnable() { // from class: yads.sm1$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    sm1.this.a(r4, wf1Var, yl1Var, iOException, z);
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, yads.tm1] */
    public final void b(final yl1 yl1Var) {
        final pm1 pm1Var = this.b;
        pm1Var.getClass();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            rm1 rm1Var = (rm1) it.next();
            final ?? r3 = rm1Var.b;
            sb3.a(rm1Var.a, new Runnable() { // from class: yads.sm1$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    sm1.this.a(r3, pm1Var, yl1Var);
                }
            });
        }
    }

    public final /* synthetic */ void a(tm1 tm1Var, wf1 wf1Var, yl1 yl1Var, IOException iOException, boolean z) {
        tm1Var.a(this.a, this.b, wf1Var, yl1Var, iOException, z);
    }

    public final /* synthetic */ void a(tm1 tm1Var, pm1 pm1Var, yl1 yl1Var) {
        tm1Var.a(this.a, pm1Var, yl1Var);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, yads.tm1] */
    public final void a(final yl1 yl1Var) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            rm1 rm1Var = (rm1) it.next();
            final ?? r2 = rm1Var.b;
            sb3.a(rm1Var.a, new Runnable() { // from class: yads.sm1$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    sm1.this.a(r2, yl1Var);
                }
            });
        }
    }

    public final /* synthetic */ void a(tm1 tm1Var, yl1 yl1Var) {
        tm1Var.b(this.a, this.b, yl1Var);
    }

    public final long a(long j) {
        long b = sb3.b(j);
        if (b == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.d + b;
    }
}
