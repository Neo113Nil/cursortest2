package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᵐ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC1006 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static final String f2436 = StringFog.decrypt("5/Cf7/HEfMve\n", "raPQoaSwFac=\n");

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static JSONObject m4291(JSONObject jSONObject, boolean z) {
        if (jSONObject != null) {
            try {
                JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(jSONObject.toString());
                if (z) {
                    jsonObjectInit.remove(AbstractC1183.f3064);
                }
                return jsonObjectInit;
            } catch (JSONException unused) {
            }
        }
        return IronSourceNetworkBridge.jsonObjectInit();
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m4293(JSONObject jSONObject, JSONObject jSONObject2, boolean z) {
        if (jSONObject == null || jSONObject2 == null) {
            return;
        }
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                jSONObject.put(next, jSONObject2.opt(next));
            } catch (JSONException unused) {
            }
        }
        if (z) {
            jSONObject.remove(AbstractC1183.f3064);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static List m4289(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object opt = jSONArray.opt(i);
            if (opt != null) {
                arrayList.add(opt);
            }
        }
        return arrayList;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m4292(JSONObject jSONObject, int i, List list) {
        int i2;
        try {
            JSONArray names = jSONObject.names();
            if (names != null) {
                while (i2 < names.length()) {
                    String optString = names.optString(i2);
                    i2 = (list != null && list.contains(optString)) ? i2 + 1 : 0;
                    String m4287 = m4287(jSONObject.opt(optString), i);
                    if (m4287 != null) {
                        if (m4287.equals("")) {
                            m4287 = null;
                        }
                        jSONObject.put(optString, m4287);
                    }
                }
            }
        } catch (JSONException e) {
            String str = f2436;
            AbstractC0580.m4080(str, str, StringFog.decrypt("QmeyoHQEKTVrfKSuck0xMyd/s6Bo\n", "BxXAzwYkX1Q=\n"), e, null, false);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m4287(Object obj, int i) {
        if (obj instanceof JSONObject) {
            m4292((JSONObject) obj, i, (List) null);
        } else {
            if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    String m4287 = m4287(jSONArray.opt(i2), i);
                    if (m4287 != null) {
                        jSONArray.put(i2, m4287);
                    }
                }
            } else if (obj instanceof String) {
                String str = (String) obj;
                if (str.length() <= i) {
                    return str;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(str.substring(0, i));
                return AbstractC1293.m4543("MGXVTemwtEd9Ko8A+es=\n", "Hkv7ZZ3CwSk=\n", sb);
            }
        }
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static HashMap m4288(JSONObject jSONObject, C1138 c1138) {
        AbstractC0544 abstractC0544;
        if (jSONObject == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            c1138.getClass();
            try {
                String optString = jSONObject.optString(next);
                if (jSONObject.opt(next) instanceof String) {
                    optString = StringFog.decrypt("7Q==\n", "z9fdxCECE8c=\n") + optString + StringFog.decrypt("6w==\n", "ydKXchRyDmo=\n");
                }
                abstractC0544 = new C1065().m4345(AbstractC0817.m4216(c1138.f2890.f2831, optString, optString));
            } catch (Throwable th) {
                String str = c1138.f2890.f2831;
                StringBuilder m4006 = AbstractC0446.m4006("qRbifp+wCFWeF/l/irA=\n", "7GSQEe2QeDQ=\n", new StringBuilder(), next);
                m4006.append(StringFog.decrypt("/oyGjfd93F4=\n", "3u/p44QJ5n4=\n"));
                m4006.append(jSONObject.optString(next));
                AbstractC0844.m4219(str, m4006.toString(), th, null);
                abstractC0544 = null;
            }
            hashMap.put(next, abstractC0544);
        }
        return hashMap;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static JSONObject m4290(int i, int i2, long j, long j2) {
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            if (j > -1) {
                jsonObjectInit.put(StringFog.decrypt("Tw==\n", "N28X6gz0uF4=\n"), i);
                jsonObjectInit.put(StringFog.decrypt("Eg==\n", "axKNjVj7UVg=\n"), i2);
                jsonObjectInit.put(StringFog.decrypt("5A==\n", "kEfiDhibc/E=\n"), j);
                jsonObjectInit.put(StringFog.decrypt("eQ==\n", "DCBjXHq+8H8=\n"), j2);
            } else {
                jsonObjectInit.put(StringFog.decrypt("+Q==\n", "gccjfFTURzw=\n"), -1);
                jsonObjectInit.put(StringFog.decrypt("Kg==\n", "U3Os3VnEoww=\n"), -1);
                jsonObjectInit.put(StringFog.decrypt("Og==\n", "TklrzZilAjM=\n"), -1);
                jsonObjectInit.put(StringFog.decrypt("Ww==\n", "LvjO2IphkZs=\n"), -1);
            }
        } catch (JSONException e) {
            String str = f2436;
            AbstractC0580.m4080(str, str, StringFog.decrypt("2PMGfSpJJ9n44AB7Ng5kx/zyAEY3HCfDvesHfTY=\n", "nYF0ElhpRKs=\n"), e, null, false);
        }
        return jsonObjectInit;
    }
}
