package com.my.target;

import com.my.target.he;
import com.my.target.ie;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes3.dex */
final class bb {
    private final List a = new ArrayList();
    private final AtomicReference b = new AtomicReference();
    private a c = null;
    private ie d = null;
    private g3 e = null;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private static final class a {
        public final String a;
        public final float b;
        public boolean c = false;

        public a(hb hbVar, float f) {
            this.a = hbVar.h();
            this.b = f;
        }
    }

    bb() {
    }

    public synchronized void a(ie ieVar, hb hbVar, float f, he.a aVar) {
        if (ieVar != null) {
            try {
                if (ieVar.b.h().equals(hbVar.h())) {
                    if (hbVar.k()) {
                        if (f == ieVar.c) {
                        }
                    }
                    mi.a("LoadPlayCoordinator: ignore prepare because section+point is playing right now, section " + hbVar.h() + ", point " + f);
                    aVar.a(q.w, hbVar, f);
                    return;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (a(hbVar, f) == null) {
            this.a.add(new a(hbVar, f));
            he.a(hbVar, f, aVar);
            return;
        }
        mi.a("LoadPlayCoordinator: ignore second prepare for section " + hbVar.h() + ", point " + f);
        aVar.a(q.w, hbVar, f);
    }

    public synchronized void b(hb hbVar, float f) {
        g3 g3Var;
        a a2 = a(hbVar, f);
        if (a2 != null) {
            a2.c = true;
            if (this.c == a2 && (g3Var = this.e) != null) {
                this.c = null;
                g3Var.accept(this.d);
                this.d = null;
                this.e = null;
            }
        }
    }

    public synchronized void a(hb hbVar, float f, ie.a aVar, g3 g3Var) {
        ie a2 = ie.a(hbVar, f, aVar, this.b);
        a a3 = a(hbVar, f);
        if (a3 != null && !a3.c) {
            mi.a("LoadPlayCoordinator: play will be started after loading section " + hbVar.h() + ", point " + f);
            this.c = a3;
            this.d = a2;
            this.e = g3Var;
            return;
        }
        g3Var.accept(a2);
    }

    public synchronized void a(ie ieVar) {
        ieVar.e();
        if (ieVar == this.d) {
            this.d = null;
            this.e = null;
        }
    }

    private a a(hb hbVar, float f) {
        for (a aVar : this.a) {
            if (aVar.a.equals(hbVar.h()) && v4.a(aVar.b, f) == 0) {
                return aVar;
            }
        }
        return null;
    }
}
