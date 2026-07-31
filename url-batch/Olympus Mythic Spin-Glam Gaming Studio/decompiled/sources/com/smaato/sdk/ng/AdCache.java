package com.smaato.sdk.ng;

import com.smaato.sdk.ng.models.Ad;
import com.smaato.sdk.ng.utils.Logger;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class AdCache {
    private static final String b = "AdCache";
    private final Map<String, Ad> a = new HashMap();

    public synchronized Ad inspect(String str) {
        return this.a.get(str);
    }

    public synchronized void put(String str, Ad ad) {
        Logger.d(b, "AdCache putting ad for zone id: " + str);
        this.a.put(str, ad);
    }

    public synchronized Ad remove(String str) {
        return this.a.remove(str);
    }
}
