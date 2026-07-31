package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ๆ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0754 {

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final HashMap f1682;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final HashMap f1683;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final ArrayList f1684;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final ArrayList f1685;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final boolean f1686;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String f1687;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String f1688;

    static {
        StringFog.decrypt("fvSI9lMYcgFx8pXkXxE=\n", "Mp37gjZ2F3M=\n");
        StringFog.decrypt("e8kRLUI=\n", "CLxhSDBeZQg=\n");
        StringFog.decrypt("gVtcMzz0sj8=\n", "4DkvR06V0Us=\n");
        StringFog.decrypt("hq9in7DNfg==\n", "68oP/dW/DVw=\n");
        StringFog.decrypt("GzzuWpM=\n", "aFmaL+OrEuA=\n");
        StringFog.decrypt("1ydpKUHS\n", "slEMRzWhX64=\n");
        StringFog.decrypt("772XyMmacg==\n", "gtjjoKb+Ab8=\n");
    }

    public C0754(String str, String str2, JSONObject jSONObject) {
        ArrayList arrayList;
        ArrayList arrayList2;
        HashMap hashMap;
        this.f1688 = AbstractC0471.m4008(str2);
        this.f1687 = AbstractC0471.m4008(jSONObject.optString(StringFog.decrypt("ZBi2lLQ=\n", "F23G8cazM3A=\n")));
        this.f1686 = jSONObject.optBoolean(StringFog.decrypt("J1S/IPL/qgc=\n", "RjbMVICeyXM=\n"));
        JSONArray optJSONArray = jSONObject.optJSONArray(StringFog.decrypt("qagqK2EQ7A==\n", "xM1HSQRinwg=\n"));
        HashMap hashMap2 = null;
        if (optJSONArray != null) {
            arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                String m4008 = AbstractC0471.m4008(optJSONArray.optString(i));
                if (m4008 != null) {
                    arrayList.add(m4008);
                }
            }
        } else {
            arrayList = null;
        }
        this.f1685 = arrayList == null ? new ArrayList() : arrayList;
        JSONArray optJSONArray2 = jSONObject.optJSONArray(StringFog.decrypt("kpbMu78=\n", "4fO4zs+l2bU=\n"));
        if (optJSONArray2 != null) {
            arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                arrayList2.add(new C0749(optJSONArray2.optJSONObject(i2)));
            }
        } else {
            arrayList2 = null;
        }
        this.f1684 = arrayList2 == null ? new ArrayList() : arrayList2;
        JSONObject optJSONObject = jSONObject.optJSONObject(StringFog.decrypt("iCHl786w\n", "7VeAgbrDRdo=\n"));
        if (optJSONObject != null) {
            hashMap = new HashMap();
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, new C0575(optJSONObject.optJSONObject(next)));
            }
        } else {
            hashMap = null;
        }
        this.f1683 = hashMap == null ? new HashMap() : hashMap;
        C1064[] c1064Arr = {null};
        JSONObject optJSONObject2 = jSONObject.optJSONObject(StringFog.decrypt("YlQlKM/v0w==\n", "DzFRQKCLoEo=\n"));
        if (optJSONObject2 != null) {
            hashMap2 = new HashMap();
            Iterator<String> keys2 = optJSONObject2.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                C1064 c1064 = new C1064(str, this.f1688, next2, optJSONObject2.optJSONObject(next2), c1064Arr[0]);
                c1064Arr[0] = c1064;
                hashMap2.put(next2, c1064);
            }
        }
        this.f1682 = hashMap2 == null ? new HashMap() : hashMap2;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList(this.f1682.values());
        Collections.sort(arrayList, new C0768());
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append(((C1064) it.next()).toString());
            sb.append("\n\n");
        }
        return sb.toString();
    }
}
