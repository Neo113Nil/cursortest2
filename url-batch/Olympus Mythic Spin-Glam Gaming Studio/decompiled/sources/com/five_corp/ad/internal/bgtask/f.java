package com.five_corp.ad.internal.bgtask;

import androidx.core.app.NotificationCompat;
import com.five_corp.ad.internal.t;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes5.dex */
public final class f extends n {
    public final com.five_corp.ad.internal.beacon.c c;
    public final t d;
    public final com.five_corp.ad.internal.http.d e;

    public f(com.five_corp.ad.internal.beacon.c cVar, t tVar, com.five_corp.ad.internal.http.d dVar) {
        super(4);
        this.c = cVar;
        this.d = tVar;
        this.e = dVar;
    }

    @Override // com.five_corp.ad.internal.bgtask.n
    public final boolean c() {
        t tVar = this.d;
        com.five_corp.ad.internal.beacon.c cVar = this.c;
        com.five_corp.ad.internal.ad.a aVar = cVar.a;
        Long l = cVar.f;
        HashMap hashMap = new HashMap();
        tVar.a(hashMap, tVar.f.a());
        com.five_corp.ad.internal.context.g gVar = cVar.b;
        if (gVar != null) {
            hashMap.put("ld", gVar.a);
            hashMap.put("sl", gVar.b);
        }
        hashMap.put("ss", cVar.d.a() ? "1" : "0");
        com.five_corp.ad.internal.m mVar = cVar.c.a;
        hashMap.put("c", String.valueOf(mVar.b.value));
        hashMap.put("dc", String.valueOf(mVar.a));
        cVar.c.getClass();
        ArrayList arrayList = new ArrayList();
        if (!arrayList.isEmpty()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(arrayList.get(0));
            for (int i = 1; i < arrayList.size(); i++) {
                stringBuffer.append(StringUtils.COMMA);
                stringBuffer.append(arrayList.get(i));
            }
            hashMap.put("cause", stringBuffer.toString());
        }
        if (aVar != null) {
            hashMap.put("t", aVar.b);
            hashMap.put(POBConstants.KEY_AT, String.valueOf(aVar.c));
        }
        hashMap.put("pt", String.valueOf(cVar.e));
        if (l != null) {
            hashMap.put("it", String.valueOf(l));
        }
        com.five_corp.ad.internal.beacon.f fVar = cVar.g;
        if (fVar != null) {
            hashMap.put("spt", String.valueOf(fVar.a));
        }
        com.five_corp.ad.internal.base_url.a aVar2 = tVar.a;
        com.five_corp.ad.internal.util.b a = this.e.a(t.a(com.five_corp.ad.internal.base_url.a.a(aVar2.d, aVar2.c), NotificationCompat.CATEGORY_ERROR, hashMap), "POST", this.c.c.a(), null, null);
        return a.a && ((com.five_corp.ad.internal.http.c) a.c).a == 200;
    }
}
