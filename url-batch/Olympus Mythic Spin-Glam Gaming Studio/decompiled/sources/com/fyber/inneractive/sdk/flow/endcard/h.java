package com.fyber.inneractive.sdk.flow.endcard;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.flow.x0;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class h {
    public static final String d = IAlog.a(h.class);
    public final com.fyber.inneractive.sdk.config.o a;
    public final int b;
    public final x0 c;

    public h(x0 x0Var) {
        this.c = x0Var;
        com.fyber.inneractive.sdk.config.o oVar = IAConfigManager.N.t.b;
        this.a = oVar;
        this.b = oVar.a("vast_endcard_x_delay", 5, 0);
    }

    public final void a(m mVar) {
        b bVar;
        com.fyber.inneractive.sdk.model.vast.o oVar;
        if (mVar.a.size() < 1) {
            return;
        }
        b a = mVar.a();
        com.fyber.inneractive.sdk.model.vast.i iVar = com.fyber.inneractive.sdk.model.vast.i.FMP_End_Card;
        Iterator it = mVar.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                bVar = null;
                break;
            } else {
                bVar = (b) it.next();
                if (bVar.i() == iVar) {
                    break;
                }
            }
        }
        if (this.c.a >= 0) {
            if (a == null) {
                IAlog.a("%sapplyEndcardTimeUnderPolicy was called with a null endcard", d);
                return;
            } else {
                IAlog.a("%s: applying endcard time under skip/close policy", d);
                a.f = this.c.b;
                return;
            }
        }
        if (a != null && a.i() != com.fyber.inneractive.sdk.model.vast.i.FMP_End_Card && a.i() != com.fyber.inneractive.sdk.model.vast.i.Default_End_Card && a.l() && (oVar = a.c.e.f) != null && oVar.d && bVar != null && bVar.l()) {
            a(a, bVar.l());
            a(bVar, true, a.k());
        } else if (a == bVar || a == null || a.g() == com.fyber.inneractive.sdk.util.g.DEFAULT_ENDCARD) {
            a(a, false, false);
        } else {
            a(a, false);
        }
    }

    public final void a(b bVar, boolean z) {
        int b;
        if (bVar == null) {
            IAlog.a("%sapplyVastCompanionEndCardTime was called with a null endcard", d);
            return;
        }
        if (bVar.k()) {
            if (z) {
                b = this.a.b("d_e_pl_dl_pl", this.b, 0);
            } else {
                b = this.a.b("d_e_pl", this.b, 0);
            }
        } else if (z) {
            b = this.a.b("d_e_npl_dl_npl", this.b, 0);
        } else {
            b = this.a.b("d_e_npl", this.b, 0);
        }
        bVar.f = b;
    }

    public final void a(b bVar, boolean z, boolean z2) {
        int b;
        if (bVar == null) {
            IAlog.a("%sapplyNonVastCompanionEndCardTime was called with a null endcard", IAlog.a(this));
            return;
        }
        if (!z) {
            b = this.a.b("d_e_def", this.b, 0);
        } else if (z2) {
            b = this.a.b("d_e_pl_dl_dl", this.b, 0);
        } else {
            b = this.a.b("d_e_npl_dl_dl", this.b, 0);
        }
        bVar.f = b;
    }
}
