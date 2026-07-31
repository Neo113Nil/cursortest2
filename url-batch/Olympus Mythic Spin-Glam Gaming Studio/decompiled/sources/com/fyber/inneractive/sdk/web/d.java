package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes6.dex */
public final class d implements Runnable {
    public final /* synthetic */ i a;

    public d(i1 i1Var) {
        this.a = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i iVar = this.a;
        if (iVar.k) {
            IAlog.a("No user web action detected for : %s blocking.", iVar.l);
            i iVar2 = this.a;
            String c = iVar2.l.c();
            String a = this.a.l.a();
            j1 j1Var = iVar2.g;
            if (j1Var != null) {
                j1Var.a(c, a);
            }
            IAlog.d("AD_AUTO_CLICK_DETECTED", new Object[0]);
            this.a.l.b();
            this.a.i();
        } else {
            IAlog.a("User web action detected for: %s", iVar.l);
            this.a.l.d();
        }
        this.a.l = null;
    }
}
