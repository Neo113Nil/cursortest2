package com.five_corp.ad.internal.cache;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public final class f {
    public final p a;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final List c = Collections.synchronizedList(new ArrayList());

    public f(p pVar) {
        this.a = pVar;
    }

    public final b a(Context context, com.five_corp.ad.internal.ad.h hVar) {
        b bVar = new b(context, this, hVar);
        bVar.a.a(bVar.b, new a(bVar));
        return bVar;
    }

    public final void a(com.five_corp.ad.internal.ad.h hVar, e eVar) {
        com.five_corp.ad.internal.util.b bVar;
        n nVar = (n) this.a.a.get(hVar);
        if (nVar == null) {
            this.b.post(new c(eVar));
            return;
        }
        String str = hVar.a;
        Handler handler = this.b;
        synchronized (nVar.a) {
            try {
                if (nVar.e) {
                    bVar = new com.five_corp.ad.internal.util.b(false, new com.five_corp.ad.internal.l(com.five_corp.ad.internal.m.a6, null, null), null);
                } else {
                    if (nVar.g == null) {
                        nVar.g = new i(nVar, str, handler);
                    }
                    bVar = new com.five_corp.ad.internal.util.b(true, null, nVar.g);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!bVar.a) {
            this.b.post(new d(eVar, bVar));
        } else {
            this.c.add(eVar);
            ((i) bVar.c).a(eVar);
        }
    }
}
