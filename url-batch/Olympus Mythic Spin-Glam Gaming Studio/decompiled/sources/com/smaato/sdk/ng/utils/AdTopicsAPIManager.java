package com.smaato.sdk.ng.utils;

import android.content.Context;
import com.smaato.sdk.ng.NextGen;
import com.smaato.sdk.ng.models.Ad;
import com.smaato.sdk.ng.prefs.NextGenPreferences;

/* loaded from: classes12.dex */
public class AdTopicsAPIManager {
    public static Boolean isTopicsAPIEnabled(Context context) {
        if (context == null) {
            return null;
        }
        return new NextGenPreferences(context).isTopicsAPIEnabled();
    }

    public static void setTopicsAPIEnabled(Context context, Ad ad) {
        if (context == null || ad == null) {
            return;
        }
        Boolean isTopicsAPIEnabled = ad.isTopicsAPIEnabled();
        boolean booleanValue = NextGen.isTopicsApiEnabled().booleanValue();
        if (isTopicsAPIEnabled == null || isTopicsAPIEnabled.booleanValue() == booleanValue) {
            return;
        }
        new NextGenPreferences(context).setTopicsAPIEnabled(isTopicsAPIEnabled);
        NextGen.setTopicsApiEnabled(isTopicsAPIEnabled);
    }
}
