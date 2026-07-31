package yads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.PriorityBlockingQueue;

/* loaded from: classes11.dex */
public final class en3 {
    public final HashMap a = new HashMap();
    public final in0 b;
    public final hr c;
    public final PriorityBlockingQueue d;

    public en3(hr hrVar, PriorityBlockingQueue priorityBlockingQueue, in0 in0Var) {
        this.b = in0Var;
        this.c = hrVar;
        this.d = priorityBlockingQueue;
    }

    public final void a(ro2 ro2Var, xp2 xp2Var) {
        List list;
        zq zqVar = xp2Var.b;
        if (zqVar != null) {
            if (zqVar.e >= System.currentTimeMillis()) {
                String c = ro2Var.c();
                synchronized (this) {
                    list = (List) this.a.remove(c);
                }
                if (list != null) {
                    if (lm3.a) {
                        list.size();
                        boolean z = ob1.a;
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        this.b.a((ro2) it.next(), xp2Var, null);
                    }
                    return;
                }
                return;
            }
        }
        b(ro2Var);
    }

    public final synchronized void b(ro2 ro2Var) {
        PriorityBlockingQueue priorityBlockingQueue;
        try {
            String c = ro2Var.c();
            List list = (List) this.a.remove(c);
            if (list != null && !list.isEmpty()) {
                if (lm3.a) {
                    list.size();
                    boolean z = ob1.a;
                }
                ro2 ro2Var2 = (ro2) list.remove(0);
                this.a.put(c, list);
                ro2Var2.a(this);
                if (this.c != null && (priorityBlockingQueue = this.d) != null) {
                    try {
                        priorityBlockingQueue.put(ro2Var2);
                    } catch (InterruptedException unused) {
                        boolean z2 = ob1.a;
                        Thread.currentThread().interrupt();
                        hr hrVar = this.c;
                        hrVar.f = true;
                        hrVar.interrupt();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean a(ro2 ro2Var) {
        try {
            String c = ro2Var.c();
            if (this.a.containsKey(c)) {
                List list = (List) this.a.get(c);
                if (list == null) {
                    list = new ArrayList();
                }
                ro2Var.a("waiting-for-response");
                list.add(ro2Var);
                this.a.put(c, list);
                if (lm3.a) {
                    boolean z = ob1.a;
                }
                return true;
            }
            this.a.put(c, null);
            ro2Var.a(this);
            if (lm3.a) {
                boolean z2 = ob1.a;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }
}
