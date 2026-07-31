package com.pubmatic.sdk.nativead.response;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.openwrap.core.nativead.POBNativeEventTrackingMethod;
import com.pubmatic.sdk.openwrap.core.nativead.POBNativeEventType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class POBNativeAdResponse {
    private final String a;
    private final Map b;
    private final POBNativeAdLinkResponse c;
    private final List d;
    private final String e;
    private final List f;
    private final String g;

    public POBNativeAdResponse(@Nullable String str, @NonNull List<POBNativeAdResponseAsset> list, @Nullable POBNativeAdLinkResponse pOBNativeAdLinkResponse, @Nullable List<String> list2, @Nullable String str2, @Nullable List<POBNativeAdResponseEventTracker> list3, @Nullable String str3) {
        this.a = str;
        this.b = a(list);
        this.c = pOBNativeAdLinkResponse;
        this.d = list2;
        this.e = str2;
        this.f = list3;
        this.g = str3;
    }

    private Map a(List list) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            POBNativeAdResponseAsset pOBNativeAdResponseAsset = (POBNativeAdResponseAsset) it.next();
            hashMap.put(Integer.valueOf(pOBNativeAdResponseAsset.getAssetId()), pOBNativeAdResponseAsset);
        }
        return hashMap;
    }

    @Nullable
    public POBNativeAdResponseAsset getAsset(int i) {
        return (POBNativeAdResponseAsset) this.b.get(Integer.valueOf(i));
    }

    @NonNull
    public Map<Integer, POBNativeAdResponseAsset> getAssets() {
        return this.b;
    }

    @Nullable
    public List<POBNativeAdResponseEventTracker> getEventTrackers() {
        return this.f;
    }

    @Nullable
    public List<String> getImpressionTrackers() {
        return this.d;
    }

    @Nullable
    public String getJsTracker() {
        return this.e;
    }

    @Nullable
    public POBNativeAdLinkResponse getLink() {
        return this.c;
    }

    @Nullable
    public String getPrivacyUrl() {
        return this.g;
    }

    @Nullable
    public String getVersion() {
        return this.a;
    }

    @NonNull
    public String toString() {
        return "Version: " + this.a + "\nAssets: " + this.b + "\nLink: " + this.c + "\nImpression Trackers: " + this.d + "\nJS Tracker: " + this.e + "\nEvent Trackers: " + this.f + "\nPrivacy: " + this.g;
    }

    @Nullable
    public List<POBNativeAdResponseEventTracker> getEventTrackers(@NonNull POBNativeEventType pOBNativeEventType, @NonNull POBNativeEventTrackingMethod pOBNativeEventTrackingMethod) {
        if (this.f == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (POBNativeAdResponseEventTracker pOBNativeAdResponseEventTracker : this.f) {
            if (pOBNativeAdResponseEventTracker != null && pOBNativeAdResponseEventTracker.getType() == pOBNativeEventType && pOBNativeAdResponseEventTracker.getTrackingMethod() == pOBNativeEventTrackingMethod) {
                arrayList.add(pOBNativeAdResponseEventTracker);
            }
        }
        return arrayList;
    }
}
