package com.five_corp.ad.internal;

import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class j {
    public final com.five_corp.ad.internal.context.d a;
    public final t b;
    public final com.five_corp.ad.internal.http.d c;
    public final com.five_corp.ad.internal.hub.global.b d;
    public final Object e = new Object();
    public boolean f = false;
    public boolean g = false;
    public final HashMap h = new HashMap();

    public j(com.five_corp.ad.internal.context.d dVar, t tVar, com.five_corp.ad.internal.http.d dVar2, com.five_corp.ad.internal.hub.global.b bVar) {
        this.a = dVar;
        this.b = tVar;
        this.c = dVar2;
        this.d = bVar;
    }

    public final k a(int i) {
        ArrayList arrayList;
        synchronized (this.e) {
            arrayList = new ArrayList(this.h.values());
        }
        return new k(this.a, this.b, this.c, this.d, i, arrayList, this);
    }
}
