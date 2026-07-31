package com.five_corp.ad.internal;

import android.os.Build;
import com.five_corp.ad.BuildConfig;
import com.five_corp.ad.ThirdPartyIdProvider;
import com.ironsource.O6;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class k extends com.five_corp.ad.internal.bgtask.n {
    public final com.five_corp.ad.internal.context.d c;
    public final int d;
    public final t e;
    public final com.five_corp.ad.internal.http.d f;
    public final com.five_corp.ad.internal.hub.global.b g;
    public final ArrayList h;
    public g i;

    public k(com.five_corp.ad.internal.context.d dVar, t tVar, com.five_corp.ad.internal.http.d dVar2, com.five_corp.ad.internal.hub.global.b bVar, int i, ArrayList arrayList, j jVar) {
        super(jVar);
        this.c = dVar;
        this.e = tVar;
        this.f = dVar2;
        this.g = bVar;
        this.d = i;
        this.h = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x01b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01b6 A[RETURN] */
    @Override // com.five_corp.ad.internal.bgtask.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c() {
        com.five_corp.ad.internal.util.c cVar;
        com.five_corp.ad.internal.util.c cVar2;
        int i;
        m mVar;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ThirdPartyIdProvider thirdPartyIdProvider = (ThirdPartyIdProvider) it.next();
            String providerName = thirdPartyIdProvider.getProviderName();
            JSONObject userInfo = thirdPartyIdProvider.getUserInfo();
            if (userInfo != null) {
                com.five_corp.ad.internal.util.c a = com.five_corp.ad.internal.util.a.a(userInfo);
                if (!a.a) {
                    this.g.a(new com.five_corp.ad.internal.logger.b(5, null, null, a.b.a()));
                }
            }
            arrayList.add(new com.five_corp.ad.internal.id_provider.a(providerName, userInfo));
        }
        com.five_corp.ad.internal.context.d dVar = this.c;
        int i2 = this.d;
        dVar.d.a();
        long currentTimeMillis = System.currentTimeMillis();
        t tVar = this.e;
        tVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(O6.w0, "Android");
        hashMap.put("sv", String.valueOf(BuildConfig.VERSION_CODE));
        hashMap.put("s", tVar.b.c);
        hashMap.put("i", tVar.c.appId);
        hashMap.put("pv", tVar.b.d);
        String str = tVar.f.a().a;
        if (str != null) {
            hashMap.put("ty", str);
        }
        hashMap.put("dv", Build.VERSION.RELEASE);
        String a2 = t.a(com.five_corp.ad.internal.base_url.a.a(tVar.a.d, "ad2.fivecdm.com"), "v1/ad", hashMap);
        try {
            t tVar2 = this.e;
            tVar2.getClass();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ssv", BuildConfig.SEMVER);
            jSONObject.put("tsv", tVar2.b.e);
            jSONObject.put("rt", currentTimeMillis);
            jSONObject.put("sui", tVar2.d.b);
            switch (i2) {
                case 1:
                    i = 1;
                    break;
                case 2:
                    i = 4;
                    break;
                case 3:
                    i = 5;
                    break;
                case 4:
                    i = 6;
                    break;
                case 5:
                    i = 7;
                    break;
                case 6:
                    i = 8;
                    break;
                default:
                    throw null;
            }
            jSONObject.put("arrs", i);
            JSONArray jSONArray = new JSONArray();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                com.five_corp.ad.internal.id_provider.a aVar = (com.five_corp.ad.internal.id_provider.a) it2.next();
                aVar.getClass();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("n", aVar.a);
                JSONObject jSONObject3 = aVar.b;
                if (jSONObject3 != null) {
                    jSONObject2.put(POBConstants.KEY_USER, jSONObject3);
                }
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("idpus", jSONArray);
            com.five_corp.ad.internal.util.b a3 = this.f.a(a2, "POST", jSONObject.toString(), "application/json;charset=utf-8", null);
            if (a3.a) {
                com.five_corp.ad.internal.http.c cVar3 = (com.five_corp.ad.internal.http.c) a3.c;
                int i3 = cVar3.a;
                if (i3 == 403) {
                    mVar = m.d;
                } else {
                    int i4 = i3 / 100;
                    if (i4 == 5) {
                        mVar = m.r;
                    } else if (i4 == 4) {
                        mVar = m.o;
                    } else {
                        String a4 = cVar3.a();
                        if (a4 == null) {
                            mVar = m.q;
                        } else if (a4.isEmpty()) {
                            mVar = m.t;
                        } else {
                            try {
                                this.i = com.five_corp.ad.internal.parser.c.a(a4);
                                cVar2 = new com.five_corp.ad.internal.util.c(true, null);
                            } catch (com.five_corp.ad.internal.exception.b e) {
                                e.toString();
                                cVar = new com.five_corp.ad.internal.util.c(false, new l(e.a, null, e));
                                cVar2 = cVar;
                                if (cVar2.a) {
                                }
                            } catch (JSONException e2) {
                                e2.toString();
                                cVar = new com.five_corp.ad.internal.util.c(false, new l(m.q, null, e2));
                                cVar2 = cVar;
                                if (cVar2.a) {
                                }
                            }
                        }
                    }
                }
                cVar2 = com.five_corp.ad.internal.util.c.a(mVar);
            } else {
                cVar2 = new com.five_corp.ad.internal.util.c(false, a3.b);
            }
        } catch (JSONException e3) {
            cVar = new com.five_corp.ad.internal.util.c(false, new l(m.d6, null, e3));
        }
        return cVar2.a;
    }
}
