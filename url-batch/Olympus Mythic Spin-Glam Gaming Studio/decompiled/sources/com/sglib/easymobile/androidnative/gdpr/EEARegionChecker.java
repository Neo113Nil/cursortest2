package com.sglib.easymobile.androidnative.gdpr;

import android.telephony.TelephonyManager;
import com.sglib.easymobile.androidnative.Helper;
import com.unity3d.player.UnityPlayer;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes15.dex */
public final class EEARegionChecker {
    public static final String inEEAStatus = "InEEA";
    public static final String notInEEAStatus = "NotInEEA";
    public static final String unknownStatus = "Unknown";

    public static String GetCountryCodeViaTelephony() {
        String networkCountryIso;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) UnityPlayer.currentActivity.getSystemService("phone");
            if (telephonyManager == null) {
                return "Unknown";
            }
            String simCountryIso = telephonyManager.getSimCountryIso();
            if (simCountryIso != null && simCountryIso.length() == 2) {
                return simCountryIso.toUpperCase();
            }
            if (telephonyManager.getPhoneType() == 2 || telephonyManager.getPhoneType() == 0 || (networkCountryIso = telephonyManager.getNetworkCountryIso()) == null || networkCountryIso.length() != 2) {
                return "Unknown";
            }
            return networkCountryIso.toUpperCase();
        } catch (Exception e) {
            Helper.Log("GetCountryCodeViaTelephony error: " + e.getMessage());
            return "Unknown";
        }
    }

    public static String GetCountryCodeViaLocale() {
        try {
            Locale locale = Locale.getDefault();
            if (locale == null) {
                return "Unknown";
            }
            return locale.getCountry();
        } catch (Exception e) {
            Helper.Log("GetCountryCodeViaLocale error: " + e.getMessage());
            return "Unknown";
        }
    }

    public static String ValidateEEARegionViaTimezone() {
        try {
            String lowerCase = TimeZone.getDefault().getID().toLowerCase();
            if (Helper.IsNullOrEmptyString(lowerCase)) {
                return "Unknown";
            }
            if (lowerCase.contains("euro")) {
                return inEEAStatus;
            }
            return notInEEAStatus;
        } catch (Exception e) {
            Helper.Log("ValidateEEARegionViaTimezone error: " + e.getMessage());
            return "Unknown";
        }
    }
}
