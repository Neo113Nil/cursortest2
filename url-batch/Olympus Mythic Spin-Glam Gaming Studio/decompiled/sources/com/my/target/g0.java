package com.my.target;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class g0 {
    private final Map a = new HashMap();

    private g0() {
    }

    public static g0 a() {
        return new g0();
    }

    public void a(String str, Map map) {
        if (TextUtils.isEmpty(str)) {
            mi.d("AdsLightPixel support: adsLightType is null or \"\", ignore it");
        } else if (map == null || map.isEmpty()) {
            this.a.remove(str);
        } else {
            this.a.put(str, a(map));
        }
    }

    public Map a(String str) {
        return (Map) this.a.get(str);
    }

    public void a(g0 g0Var) {
        this.a.clear();
        for (String str : g0Var.a.keySet()) {
            a(str, (Map) g0Var.a.get(str));
        }
    }

    private Map a(Map map) {
        HashMap hashMap = new HashMap();
        for (String str : map.keySet()) {
            if (TextUtils.isEmpty(str)) {
                mi.d("AdsLightPixel support: param key is null or \"\", skip it");
            } else {
                hashMap.put(str, (String) map.get(str));
            }
        }
        return hashMap;
    }
}
