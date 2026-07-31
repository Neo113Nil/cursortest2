package com.smaato.sdk.ng.vpaid.vast;

import android.text.TextUtils;
import com.smaato.sdk.ng.NextGen;
import com.smaato.sdk.ng.models.VASTtag;
import com.smaato.sdk.ng.vpaid.vast.VastUrlParameters;
import java.util.Locale;

/* loaded from: classes4.dex */
public class VastUrlUtils {
    public static String formatURL(String str, VastUrlParameters vastUrlParameters) {
        if (vastUrlParameters == null) {
            vastUrlParameters = new VastUrlParameters.Builder().build();
        }
        return new VASTtag.VASTtagBuilder(str).adId(vastUrlParameters.a).bundle(vastUrlParameters.b).dnt(vastUrlParameters.c).lat(vastUrlParameters.d).lon(vastUrlParameters.e).userAgent(vastUrlParameters.f).width(vastUrlParameters.g).height(vastUrlParameters.h).gdpr(vastUrlParameters.i).gdprConsent(vastUrlParameters.j).usPrivacy(vastUrlParameters.k).build().getFormattedURL();
    }

    public static VastUrlParameters buildParameters() {
        boolean z;
        String str;
        boolean z2;
        String str2;
        String str3 = "1";
        if (NextGen.getUserDataManager() != null) {
            str = NextGen.getUserDataManager().gdprApplies() ? "1" : "0";
            z = NextGen.getUserDataManager().isCCPAOptOut();
            z2 = NextGen.getUserDataManager().isConsentDenied();
        } else {
            z = false;
            str = "0";
            z2 = false;
        }
        if (!NextGen.isCoppaEnabled() && !z && !z2 && !NextGen.getDeviceInfo().limitTracking() && !TextUtils.isEmpty(NextGen.getDeviceInfo().getAdvertisingId())) {
            str3 = "0";
        }
        if (NextGen.getLocationManager() == null || NextGen.getLocationManager().getUserLocation() == null) {
            str2 = null;
        } else {
            r3 = NextGen.getLocationManager().getUserLocation().getLatitude() != 0.0d ? String.format(Locale.ENGLISH, "%.2f", Double.valueOf(NextGen.getLocationManager().getUserLocation().getLatitude())) : null;
            str2 = NextGen.getLocationManager().getUserLocation().getLongitude() != 0.0d ? String.format(Locale.ENGLISH, "%.2f", Double.valueOf(NextGen.getLocationManager().getUserLocation().getLongitude())) : null;
        }
        return new VastUrlParameters.Builder().advertisingId(NextGen.getDeviceInfo().getAdvertisingId()).bundleId(NextGen.getBundleId()).dnt(str3).latitude(r3).longitude(str2).userAgent(NextGen.getDeviceInfo().getUserAgent()).deviceWidth(NextGen.getDeviceInfo().getDeviceWidth()).deviceHeight(NextGen.getDeviceInfo().getDeviceHeight()).gdpr(str).gdprConsent(NextGen.getUserDataManager().getIABGDPRConsentString()).usPrivacy(NextGen.getUserDataManager().getIABUSPrivacyString()).build();
    }
}
