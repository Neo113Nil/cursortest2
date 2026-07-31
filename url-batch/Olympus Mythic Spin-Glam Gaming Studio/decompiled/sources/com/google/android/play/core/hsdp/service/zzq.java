package com.google.android.play.core.hsdp.service;

import android.content.Intent;
import android.net.Uri;
import com.adjust.sdk.Constants;
import com.pubmatic.sdk.common.POBCommonConstants;
import java.util.Map;

/* compiled from: com.google.android.play:hsdp@@2.0.1 */
/* loaded from: classes14.dex */
abstract class zzq {
    public static Intent zza(String str, String str2, Map map) {
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").authority(POBCommonConstants.PLAY_STORE_DOMAIN).path("store/apps/details").appendQueryParameter("id", str).appendQueryParameter(Constants.REFERRER, str2);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str3 = (String) entry.getKey();
                if (!str3.equals("id") && !str3.equals(Constants.REFERRER)) {
                    appendQueryParameter.appendQueryParameter(str3, (String) entry.getValue());
                }
            }
        }
        Intent intent = new Intent("android.intent.action.VIEW", appendQueryParameter.build());
        intent.setPackage("com.android.vending");
        return intent;
    }

    public static Intent zzb(String str, String str2, String str3, Map map) {
        Intent intent = new Intent("android.intent.action.VIEW", zzc(str, str2, map));
        intent.setPackage("com.android.vending");
        intent.putExtra("overlay", true);
        intent.putExtra("callerId", str3);
        intent.putExtra("hsdp_caller_source", "hpoa");
        return intent;
    }

    public static Uri zzc(String str, String str2, Map map) {
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").authority(POBCommonConstants.PLAY_STORE_DOMAIN).path("d").appendQueryParameter("id", str).appendQueryParameter(Constants.REFERRER, str2);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str3 = (String) entry.getKey();
                if (!str3.equals("id") && !str3.equals(Constants.REFERRER)) {
                    appendQueryParameter.appendQueryParameter(str3, (String) entry.getValue());
                }
            }
        }
        return appendQueryParameter.build();
    }
}
