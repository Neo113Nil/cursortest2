package com.five_corp.ad.internal.http.auxcache;

import com.five_corp.ad.internal.l;
import com.ironsource.X3;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class f implements Runnable {
    public final /* synthetic */ i a;
    public final /* synthetic */ l b;
    public final /* synthetic */ h c;

    public f(h hVar, i iVar, l lVar) {
        this.c = hVar;
        this.a = iVar;
        this.b = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k kVar;
        Iterator it = this.a.c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            com.five_corp.ad.internal.ad.h hVar = this.a.a;
            l lVar = this.b;
            jVar.g.remove(hVar);
            jVar.f.add(hVar);
            if (!jVar.j) {
                if (jVar.h == null) {
                    jVar.h = new HashMap();
                }
                if (!jVar.h.containsKey(hVar)) {
                    jVar.h.put(hVar, new ArrayList());
                }
                List list = (List) jVar.h.get(hVar);
                list.add("[Download " + hVar.a + " failed with DetailedError: " + lVar.toString() + X3.j.e);
                if (list.size() >= 10) {
                    Locale locale = Locale.US;
                    int i = jVar.i;
                    String str = jVar.b;
                    StringBuilder sb = new StringBuilder(X3.j.d);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        sb.append((String) it2.next());
                        sb.append(StringUtils.COMMA);
                    }
                    sb.append(X3.j.e);
                    jVar.c.a.a(new com.five_corp.ad.internal.logger.b(4, null, null, "auxiliary resource cache download error is occurred " + i + " times for ad ots: " + str + ". errors: " + sb.toString()));
                    jVar.j = true;
                    jVar.h = null;
                }
            }
            h hVar2 = this.c;
            int i2 = jVar.a.b;
            hVar2.getClass();
            int a = com.five_corp.ad.e.a(i2);
            if (a == 0) {
                kVar = hVar2.i;
            } else {
                if (a != 1) {
                    throw new RuntimeException("Unknown DownloadRequesterPriority: ".concat(com.five_corp.ad.internal.http.b.a(i2)));
                }
                kVar = hVar2.j;
            }
            kVar.c.add(jVar);
        }
        this.c.a(this.a);
    }
}
