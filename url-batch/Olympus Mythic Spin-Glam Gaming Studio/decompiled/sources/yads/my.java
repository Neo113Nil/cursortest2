package yads;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class my extends ao {
    public final HashMap h = new HashMap();
    public Handler i;
    public h93 j;

    public pm1 a(Object obj, pm1 pm1Var) {
        return pm1Var;
    }

    @Override // yads.ao
    public final void a() {
        for (ly lyVar : this.h.values()) {
            lyVar.a.a(lyVar.b);
        }
    }

    @Override // yads.ao
    public final void b() {
        for (ly lyVar : this.h.values()) {
            lyVar.a.b(lyVar.b);
        }
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract void a(Object obj, ao aoVar, g73 g73Var);

    @Override // yads.ao
    public void d() {
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((ly) it.next()).a.d();
        }
    }

    @Override // yads.ao
    public void e() {
        for (ly lyVar : this.h.values()) {
            lyVar.a.c(lyVar.b);
            lyVar.a.a((tm1) lyVar.c);
            lyVar.a.a((zk0) lyVar.c);
        }
        this.h.clear();
    }

    public final void a(final Object obj, ao aoVar) {
        if (!this.h.containsKey(obj)) {
            qm1 qm1Var = new qm1() { // from class: yads.my$$ExternalSyntheticLambda0
                @Override // yads.qm1
                public final void a(ao aoVar2, g73 g73Var) {
                    my.this.a(obj, aoVar2, g73Var);
                }
            };
            ky kyVar = new ky(this, obj);
            this.h.put(obj, new ly(aoVar, qm1Var, kyVar));
            Handler handler = this.i;
            handler.getClass();
            aoVar.getClass();
            sm1 sm1Var = aoVar.c;
            sm1Var.getClass();
            sm1Var.c.add(new rm1(handler, kyVar));
            Handler handler2 = this.i;
            handler2.getClass();
            yk0 yk0Var = aoVar.d;
            yk0Var.getClass();
            yk0Var.c.add(new xk0(handler2, kyVar));
            h93 h93Var = this.j;
            ff2 ff2Var = this.g;
            if (ff2Var != null) {
                Looper myLooper = Looper.myLooper();
                Looper looper = aoVar.e;
                if (looper != null && looper != myLooper) {
                    throw new IllegalArgumentException();
                }
                aoVar.g = ff2Var;
                g73 g73Var = aoVar.f;
                aoVar.a.add(qm1Var);
                if (aoVar.e == null) {
                    aoVar.e = myLooper;
                    aoVar.b.add(qm1Var);
                    aoVar.a(h93Var);
                } else if (g73Var != null) {
                    aoVar.b(qm1Var);
                    qm1Var.a(aoVar, g73Var);
                }
                if (this.b.isEmpty()) {
                    aoVar.a(qm1Var);
                    return;
                }
                return;
            }
            throw new IllegalStateException();
        }
        throw new IllegalArgumentException();
    }
}
