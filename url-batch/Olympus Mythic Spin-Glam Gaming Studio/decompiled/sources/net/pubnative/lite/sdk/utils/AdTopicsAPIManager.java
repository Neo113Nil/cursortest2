package net.pubnative.lite.sdk.utils;

import android.content.Context;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.models.Ad;
import net.pubnative.lite.sdk.prefs.HyBidPreferences;

/* loaded from: classes4.dex */
public class AdTopicsAPIManager {
    public static Boolean isTopicsAPIEnabled(Context context) {
        if (context == null) {
            return null;
        }
        return new HyBidPreferences(context).isTopicsAPIEnabled();
    }

    public static void setTopicsAPIEnabled(Context context, Ad ad) {
        if (context == null || ad == null) {
            return;
        }
        Boolean isTopicsAPIEnabled = ad.isTopicsAPIEnabled();
        boolean booleanValue = HyBid.isTopicsApiEnabled().booleanValue();
        if (isTopicsAPIEnabled == null || isTopicsAPIEnabled.booleanValue() == booleanValue) {
            return;
        }
        new HyBidPreferences(context).setTopicsAPIEnabled(isTopicsAPIEnabled);
        HyBid.setTopicsApiEnabled(isTopicsAPIEnabled);
    }
}
