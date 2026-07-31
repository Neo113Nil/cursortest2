package yads;

import android.os.Process;
import java.util.concurrent.PriorityBlockingQueue;

/* loaded from: classes5.dex */
public final class hr extends Thread {
    public static final boolean h = lm3.a;
    public final PriorityBlockingQueue b;
    public final PriorityBlockingQueue c;
    public final ar d;
    public final in0 e;
    public volatile boolean f = false;
    public final en3 g;

    public hr(PriorityBlockingQueue priorityBlockingQueue, PriorityBlockingQueue priorityBlockingQueue2, ar arVar, in0 in0Var) {
        this.b = priorityBlockingQueue;
        this.c = priorityBlockingQueue2;
        this.d = arVar;
        this.e = in0Var;
        this.g = new en3(this, priorityBlockingQueue2, in0Var);
    }

    private void a() throws InterruptedException {
        ro2 ro2Var = (ro2) this.b.take();
        ro2Var.a("cache-queue-take");
        ro2Var.a(1);
        try {
            if (ro2Var.i()) {
                ro2Var.b("cache-discard-canceled");
            } else {
                zq zqVar = this.d.get(ro2Var.c());
                if (zqVar == null) {
                    ro2Var.a("cache-miss");
                    if (!this.g.a(ro2Var)) {
                        this.c.put(ro2Var);
                    }
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (zqVar.e < currentTimeMillis) {
                        ro2Var.a("cache-hit-expired");
                        ro2Var.p = zqVar;
                        if (!this.g.a(ro2Var)) {
                            this.c.put(ro2Var);
                        }
                    } else {
                        ro2Var.a("cache-hit");
                        xp2 a = ro2Var.a(new u82(200, zqVar.a, zqVar.g, false));
                        ro2Var.a("cache-hit-parsed");
                        if (a.c != null) {
                            ro2Var.a("cache-parsing-failed");
                            this.d.a(ro2Var.c());
                            ro2Var.p = null;
                            if (!this.g.a(ro2Var)) {
                                this.c.put(ro2Var);
                            }
                        } else if (zqVar.f < currentTimeMillis) {
                            ro2Var.a("cache-hit-refresh-needed");
                            ro2Var.p = zqVar;
                            a.d = true;
                            if (this.g.a(ro2Var)) {
                                this.e.a(ro2Var, a, null);
                            } else {
                                this.e.a(ro2Var, a, new gr(this, ro2Var));
                            }
                        } else {
                            this.e.a(ro2Var, a, null);
                        }
                    }
                }
            }
            ro2Var.a(2);
        } catch (Throwable th) {
            ro2Var.a(2);
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (h) {
            boolean z = ob1.a;
        }
        Process.setThreadPriority(10);
        this.d.a();
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f) {
                    Thread.currentThread().interrupt();
                    return;
                }
                boolean z2 = ob1.a;
            } catch (Throwable unused2) {
                boolean z3 = ob1.a;
                return;
            }
        }
    }
}
