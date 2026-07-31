package com.five_corp.ad.internal.layouter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class i {
    public final ArrayList a = new ArrayList();
    public g b;

    public i(g gVar) {
        this.b = gVar;
    }

    public final void a(g gVar) {
        if (this.b.equals(gVar)) {
            return;
        }
        this.b = gVar;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            d dVar = (d) ((h) it.next());
            dVar.l = gVar;
            for (Map.Entry entry : dVar.d.entrySet()) {
                if (entry.getValue() instanceof j) {
                    ((j) entry.getValue()).a(dVar.l);
                }
            }
            dVar.a(dVar.a.getWidth(), dVar.a.getHeight());
        }
    }
}
