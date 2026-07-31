package com.my.target;

import com.my.target.common.models.IAdLoadingError;
import com.my.target.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
final class he {
    final hb a;
    final float b;
    private final a c;
    IAdLoadingError d = null;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    interface a {
        void a(IAdLoadingError iAdLoadingError, hb hbVar, float f);

        boolean a(List list, p.b bVar);
    }

    he(hb hbVar, float f, a aVar) {
        this.a = hbVar;
        this.b = f;
        this.c = aVar;
    }

    public static he a(hb hbVar, float f, a aVar) {
        he heVar = new he(hbVar, f, aVar);
        if (hbVar.k()) {
            heVar.e();
            return heVar;
        }
        heVar.d();
        return heVar;
    }

    private void b() {
        y l = this.a.l();
        if (l == null) {
            a();
            return;
        }
        if (this.a.k()) {
            mi.a("InstreamAdEngine: Using doAfter service for point - " + this.b);
        } else {
            mi.a("InstreamAdEngine: Loading doAfter service - " + l.b);
        }
        if (this.a.k()) {
            l.c(true);
            l.b(this.b);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(l);
        a(arrayList);
    }

    private void c() {
        List b = this.a.k() ? this.a.b(this.b) : Collections.EMPTY_LIST;
        if (b.isEmpty()) {
            b();
            return;
        }
        mi.a("InstreamAdEngine: Loading midpoint services for point - " + this.b);
        a(b);
    }

    void d() {
        b();
    }

    void e() {
        c();
    }

    private void a() {
        IAdLoadingError iAdLoadingError = this.d;
        if (iAdLoadingError == null) {
            hb hbVar = this.a;
            int i = hbVar.b;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3 && i != 4) {
                        iAdLoadingError = q.w;
                    }
                } else if (hbVar.a(this.b).isEmpty()) {
                    iAdLoadingError = q.j;
                }
            }
            if (hbVar.d().isEmpty()) {
                iAdLoadingError = q.j;
            }
        }
        this.c.a(iAdLoadingError, this.a, this.b);
    }

    private void a(List list) {
        this.d = null;
        if (this.c.a(list, new p.b() { // from class: com.my.target.he$$ExternalSyntheticLambda0
            @Override // com.my.target.p.b
            public final void a(x xVar, s sVar) {
                he.this.a((l6) xVar, sVar);
            }
        })) {
            return;
        }
        this.d = q.c;
        a();
    }

    void a(l6 l6Var, s sVar) {
        if (l6Var == null) {
            q a2 = sVar.a();
            if (a2 != null) {
                mi.a("InstreamAdEngine: load - loading services failed - " + a2);
                this.d = a2;
            } else {
                this.d = q.j;
            }
            b();
            return;
        }
        hb a3 = l6Var.a(this.a.h());
        if (a3 != null) {
            this.a.a(a3);
        }
        c();
    }
}
