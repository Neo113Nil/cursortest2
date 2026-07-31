package yads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.PriorityBlockingQueue;

/* loaded from: classes3.dex */
public final class r82 extends Thread {
    public final PriorityBlockingQueue b;
    public final po c;
    public final ar d;
    public final in0 e;
    public volatile boolean f = false;

    public r82(PriorityBlockingQueue priorityBlockingQueue, po poVar, ar arVar, in0 in0Var) {
        this.b = priorityBlockingQueue;
        this.c = poVar;
        this.d = arVar;
        this.e = in0Var;
    }

    private void a() throws InterruptedException {
        ro2 ro2Var = (ro2) this.b.take();
        SystemClock.elapsedRealtime();
        ro2Var.a(3);
        try {
            try {
                ro2Var.a("network-queue-take");
                if (ro2Var.i()) {
                    ro2Var.b("network-discard-cancelled");
                    ro2Var.j();
                } else {
                    TrafficStats.setThreadStatsTag(ro2Var.e);
                    u82 a = this.c.a(ro2Var);
                    ro2Var.a("network-http-complete");
                    if (a.e && ro2Var.h()) {
                        ro2Var.b("not-modified");
                        ro2Var.j();
                    } else {
                        xp2 a2 = ro2Var.a(a);
                        ro2Var.a("network-parse-complete");
                        if (ro2Var.j && a2.b != null) {
                            this.d.a(ro2Var.c(), a2.b);
                            ro2Var.a("network-cache-written");
                        }
                        synchronized (ro2Var.f) {
                            ro2Var.l = true;
                        }
                        this.e.a(ro2Var, a2, null);
                        ro2Var.a(a2);
                    }
                }
            } catch (hm3 e) {
                SystemClock.elapsedRealtime();
                hm3 a3 = ro2Var.a(e);
                in0 in0Var = this.e;
                in0Var.getClass();
                ro2Var.a("post-error");
                xp2 xp2Var = new xp2(a3);
                gn0 gn0Var = in0Var.a;
                gn0Var.a.post(new hn0(ro2Var, xp2Var, null));
                ro2Var.j();
            } catch (Exception e2) {
                boolean z = lm3.a;
                boolean z2 = ob1.a;
                hm3 hm3Var = new hm3((Throwable) e2);
                SystemClock.elapsedRealtime();
                in0 in0Var2 = this.e;
                in0Var2.getClass();
                ro2Var.a("post-error");
                xp2 xp2Var2 = new xp2(hm3Var);
                gn0 gn0Var2 = in0Var2.a;
                gn0Var2.a.post(new hn0(ro2Var, xp2Var2, null));
                ro2Var.j();
            }
            ro2Var.a(4);
        } catch (Throwable th) {
            ro2Var.a(4);
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f) {
                    Thread.currentThread().interrupt();
                    return;
                } else {
                    boolean z = lm3.a;
                    boolean z2 = ob1.a;
                }
            } catch (Throwable unused2) {
                boolean z3 = lm3.a;
                boolean z4 = ob1.a;
                return;
            }
        }
    }
}
