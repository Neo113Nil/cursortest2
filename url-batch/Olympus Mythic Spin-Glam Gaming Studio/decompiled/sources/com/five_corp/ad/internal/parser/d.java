package com.five_corp.ad.internal.parser;

import com.five_corp.ad.internal.ad.beacon.j;
import com.five_corp.ad.internal.ad.beacon.k;
import com.five_corp.ad.internal.m;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public abstract class d {
    public static com.five_corp.ad.internal.ad.beacon.a a(JSONObject jSONObject) {
        int i = jSONObject.getInt("clkt");
        for (int i2 : com.five_corp.ad.e.b(2)) {
            if (com.five_corp.ad.internal.ad.beacon.c.a(i2) == i) {
                int i3 = jSONObject.getInt("str");
                for (int i4 : com.five_corp.ad.e.b(3)) {
                    if (com.five_corp.ad.internal.ad.beacon.h.a(i4) == i3) {
                        long j = jSONObject.getLong("tms");
                        j jVar = j.e;
                        k kVar = jVar.a;
                        if (jSONObject.has("vty")) {
                            int i5 = jSONObject.getInt("vty");
                            for (k kVar2 : k.values()) {
                                if (kVar2.a == i5) {
                                    kVar = kVar2;
                                }
                            }
                            throw new com.five_corp.ad.internal.exception.a(m.G1, i5);
                        }
                        com.five_corp.ad.internal.ad.beacon.i iVar = jVar.b;
                        if (jSONObject.has("vct")) {
                            int i6 = jSONObject.getInt("vct");
                            for (com.five_corp.ad.internal.ad.beacon.i iVar2 : com.five_corp.ad.internal.ad.beacon.i.values()) {
                                if (iVar2.a == i6) {
                                    iVar = iVar2;
                                }
                            }
                            throw new com.five_corp.ad.internal.exception.a(m.B1, i6);
                        }
                        double d = jVar.c;
                        if (jSONObject.has("ar")) {
                            d = jSONObject.getDouble("ar");
                        }
                        return new com.five_corp.ad.internal.ad.beacon.a(i2, i4, j, new j(kVar, iVar, d));
                    }
                }
                throw new com.five_corp.ad.internal.exception.a(m.Z0, i3);
            }
        }
        throw new com.five_corp.ad.internal.exception.a(m.o1, i);
    }

    public static com.five_corp.ad.internal.ad.beacon.f b(JSONObject jSONObject) {
        int i = jSONObject.getInt("t");
        for (int i2 : com.five_corp.ad.e.b(21)) {
            if (com.five_corp.ad.internal.ad.beacon.b.a(i2) == i) {
                com.five_corp.ad.internal.ad.beacon.a a = jSONObject.has("c") ? a(jSONObject.getJSONObject("c")) : null;
                ArrayList arrayList = new ArrayList();
                if (jSONObject.has("p")) {
                    JSONArray jSONArray = jSONObject.getJSONArray("p");
                    arrayList = new ArrayList();
                    for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                        arrayList.add(new com.five_corp.ad.internal.ad.beacon.g(jSONObject2.getString(CampaignEx.JSON_KEY_AD_K), jSONObject2.getString("v")));
                    }
                }
                return new com.five_corp.ad.internal.ad.beacon.f(i2, a, arrayList);
            }
        }
        throw new com.five_corp.ad.internal.exception.a(m.k1, i);
    }
}
