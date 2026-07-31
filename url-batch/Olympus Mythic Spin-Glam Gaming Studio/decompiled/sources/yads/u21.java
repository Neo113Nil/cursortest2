package yads;

import android.os.Handler;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes14.dex */
public final class u21 {
    public final o03 a;
    public final Set b;
    public final z31 c;
    public final Handler d;
    public final AtomicInteger e;
    public final ys1 f;

    public u21(o03 o03Var, Set set, z31 z31Var, Handler handler) {
        AtomicInteger atomicInteger = new AtomicInteger(set.size());
        ys1 ys1Var = new ys1();
        this.a = o03Var;
        this.b = set;
        this.c = z31Var;
        this.d = handler;
        this.e = atomicInteger;
        this.f = ys1Var;
    }

    public final void a() {
        final HashMap hashMap = new HashMap();
        for (final q31 q31Var : this.b) {
            final String str = q31Var.c;
            final int i = q31Var.b;
            final int i2 = q31Var.a;
            boolean z = ob1.a;
            if (a(q31Var)) {
                this.d.post(new Runnable() { // from class: yads.u21$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        u21.a(u21.this, str, i2, i, hashMap, q31Var);
                    }
                });
            } else if (this.e.decrementAndGet() == 0) {
                this.c.a(hashMap);
            }
        }
    }

    public static final void a(u21 u21Var, String str, int i, int i2, Map map, q31 q31Var) {
        u21Var.a.a(str, new t21(u21Var, map, q31Var), i, i2);
    }

    public final boolean a(q31 q31Var) {
        int a = q31Var.a();
        int b = q31Var.b();
        this.f.getClass();
        if (ys1.a() >= (a * b * 4) + 1048576.0f) {
            return true;
        }
        boolean z = ob1.a;
        return false;
    }
}
