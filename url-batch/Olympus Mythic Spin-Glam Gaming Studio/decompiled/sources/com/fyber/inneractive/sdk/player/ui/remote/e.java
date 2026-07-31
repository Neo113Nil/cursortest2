package com.fyber.inneractive.sdk.player.ui.remote;

import com.fyber.inneractive.sdk.player.controller.z;
import com.fyber.inneractive.sdk.player.ui.n;
import com.fyber.inneractive.sdk.util.g1;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public final class e {
    public d a;
    public boolean c = false;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public e(d dVar) {
        this.a = dVar;
    }

    public final void a(String str, String str2, boolean z) {
        if (!z) {
            this.b.put(str, str2);
            return;
        }
        d dVar = this.a;
        if (dVar != null) {
            dVar.b.a(str2);
        }
    }

    public final void a(int i, g1 g1Var) {
        n nVar;
        d dVar = this.a;
        if (dVar == null || (nVar = dVar.e) == null) {
            return;
        }
        ((z) nVar).a(i, g1Var);
    }
}
