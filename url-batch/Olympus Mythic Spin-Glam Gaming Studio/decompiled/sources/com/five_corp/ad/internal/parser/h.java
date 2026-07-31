package com.five_corp.ad.internal.parser;

import com.five_corp.ad.internal.m;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public abstract class h {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
    
        r2.add(new com.five_corp.ad.internal.media_config.c(r7, r8, r9, r12, r4.optDouble("adcv", 0.01d), r4.optBoolean("afov", false)));
        r3 = r3 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.five_corp.ad.internal.media_config.a a(JSONObject jSONObject) {
        JSONArray jSONArray = jSONObject.getJSONArray("ds");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < jSONArray.length()) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            String string = jSONObject2.getString("i");
            boolean optBoolean = jSONObject2.optBoolean("chk", true);
            boolean optBoolean2 = jSONObject2.optBoolean("alna", false);
            int optInt = jSONObject2.optInt("dss", 0);
            int[] b = com.five_corp.ad.e.b(4);
            int length = b.length;
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = b[i2];
                if (com.five_corp.ad.e.a(i3) == optInt) {
                    break;
                }
            }
            throw new com.five_corp.ad.internal.exception.a(m.B0, optInt);
        }
        boolean z = jSONObject.getBoolean("sn");
        long j = jSONObject.has("dssms") ? jSONObject.getLong("dssms") : 300000L;
        boolean z2 = jSONObject.has("dovd") ? jSONObject.getBoolean("dovd") : false;
        boolean z3 = jSONObject.has("rdy") ? jSONObject.getBoolean("rdy") : false;
        com.five_corp.ad.internal.media_config.b bVar = new com.five_corp.ad.internal.media_config.b();
        if (jSONObject.has("sdms")) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("sdms");
            bVar = new com.five_corp.ad.internal.media_config.b(jSONObject3.has("adchk") ? jSONObject3.getString("adchk") : null, jSONObject3.has("bc") ? jSONObject3.getString("bc") : null, jSONObject3.has("errbc") ? jSONObject3.getString("errbc") : null);
        }
        com.five_corp.ad.internal.media_config.b bVar2 = bVar;
        int i4 = 6;
        if (jSONObject.has("rloglv")) {
            int i5 = jSONObject.getInt("rloglv");
            int[] b2 = com.five_corp.ad.e.b(6);
            int length2 = b2.length;
            for (int i6 = 0; i6 < length2; i6++) {
                i4 = b2[i6];
                if (com.five_corp.ad.e.a(i4) != i5) {
                }
            }
            throw new com.five_corp.ad.internal.exception.a(m.F1, i5);
        }
        return new com.five_corp.ad.internal.media_config.a(arrayList, z, j, z2, z3, bVar2, i4);
    }
}
