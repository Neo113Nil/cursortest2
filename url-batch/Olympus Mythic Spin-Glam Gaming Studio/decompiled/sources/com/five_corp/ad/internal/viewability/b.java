package com.five_corp.ad.internal.viewability;

import com.five_corp.ad.internal.ad.j;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class b {
    public final a a;
    public final String b;
    public final ArrayList c;
    public final com.five_corp.ad.internal.hub.global.b d;
    public final com.five_corp.ad.internal.time.a e;
    public long f = 0;

    public b(a aVar, j jVar, String str, com.five_corp.ad.internal.hub.global.b bVar, com.five_corp.ad.internal.time.a aVar2) {
        this.a = aVar;
        ArrayList arrayList = jVar != null ? new ArrayList(jVar.a) : new ArrayList();
        this.c = arrayList;
        this.b = str;
        this.d = bVar;
        this.e = aVar2;
        Collections.sort(arrayList);
    }
}
