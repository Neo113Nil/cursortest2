package yads;

import java.util.ArrayDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class pv3 {
    public final ArrayDeque b = new ArrayDeque();
    public jv3 c = null;
    public final ThreadPoolExecutor a = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public final void a() {
        jv3 jv3Var = (jv3) this.b.poll();
        this.c = jv3Var;
        if (jv3Var != null) {
            jv3Var.a(this.a);
        }
    }

    public final void a(jv3 jv3Var) {
        jv3Var.a = this;
        this.b.add(jv3Var);
        if (this.c == null) {
            a();
        }
    }
}
