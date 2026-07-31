package com.five_corp.ad.internal.bgtask;

import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class a {
    public final Object a = new Object();
    public final ArrayList b = new ArrayList();
    public final com.five_corp.ad.internal.logger.a c;

    public a(com.five_corp.ad.internal.logger.a aVar) {
        this.c = aVar;
    }

    public final void a(g gVar) {
        synchronized (this.a) {
            this.b.add(gVar);
        }
    }
}
