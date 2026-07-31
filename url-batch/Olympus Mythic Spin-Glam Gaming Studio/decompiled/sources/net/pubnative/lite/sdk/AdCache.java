package net.pubnative.lite.sdk;

import java.util.HashMap;
import java.util.Map;
import net.pubnative.lite.sdk.models.Ad;
import net.pubnative.lite.sdk.utils.Logger;

/* loaded from: classes11.dex */
public class AdCache {
    private static final String TAG = "AdCache";
    private final Map<String, Ad> mAdMap = new HashMap();

    public synchronized Ad inspect(String str) {
        return this.mAdMap.get(str);
    }

    public synchronized void put(String str, Ad ad) {
        Logger.d(TAG, "AdCache putting ad for zone id: " + str);
        this.mAdMap.put(str, ad);
    }

    public synchronized Ad remove(String str) {
        return this.mAdMap.remove(str);
    }
}
