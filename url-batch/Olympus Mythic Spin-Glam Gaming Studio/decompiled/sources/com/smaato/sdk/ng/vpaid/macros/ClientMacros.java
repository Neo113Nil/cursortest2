package com.smaato.sdk.ng.vpaid.macros;

import android.location.Location;
import android.text.TextUtils;
import com.smaato.sdk.ng.DeviceInfo;
import com.smaato.sdk.ng.NextGen;
import com.smaato.sdk.ng.location.NextGenLocationManager;
import com.smaato.sdk.ng.utils.EncodingUtils;
import java.util.Locale;

/* loaded from: classes3.dex */
public class ClientMacros {
    private final DeviceInfo a;
    private final NextGenLocationManager b;
    private final String c;
    private final String d;

    public ClientMacros() {
        this(NextGen.getDeviceInfo(), NextGen.getLocationManager());
    }

    private String a() {
        return this.c;
    }

    private String b() {
        return this.d;
    }

    private String c() {
        DeviceInfo deviceInfo = this.a;
        return deviceInfo != null ? deviceInfo.limitTracking() ? String.valueOf(-2) : TextUtils.isEmpty(this.a.getAdvertisingId()) ? String.valueOf(-1) : this.a.getAdvertisingId() : String.valueOf(-1);
    }

    private String d() {
        DeviceInfo deviceInfo = this.a;
        return deviceInfo != null ? deviceInfo.limitTracking() ? String.valueOf(-2) : "aaid" : String.valueOf(-1);
    }

    private String e() {
        NextGenLocationManager nextGenLocationManager = this.b;
        if (nextGenLocationManager == null) {
            return String.valueOf(-1);
        }
        Location userLocation = nextGenLocationManager.getUserLocation();
        return userLocation != null ? String.format(Locale.ENGLISH, "%.2f,%.2f", Double.valueOf(userLocation.getLatitude()), Double.valueOf(userLocation.getLongitude())) : String.valueOf(-1);
    }

    private String f() {
        return "0";
    }

    public String processUrl(String str) {
        return str.replace("[IFA]", c()).replace("[IFATYPE]", d()).replace("[CLIENTUA]", a()).replace("[DEVICEUA]", b()).replace("[SERVERSIDE]", f()).replace("[LATLONG]", e());
    }

    ClientMacros(DeviceInfo deviceInfo, NextGenLocationManager nextGenLocationManager) {
        this.a = deviceInfo;
        this.b = nextGenLocationManager;
        this.c = EncodingUtils.urlEncode(String.format(Locale.ENGLISH, "%s/%s %s/%s", "NextGen", "23.1.0", "NextGen VAST Player", "23.1.0"));
        if (deviceInfo == null || deviceInfo.getUserAgent() == null || TextUtils.isEmpty(deviceInfo.getUserAgent())) {
            this.d = String.valueOf(-1);
        } else {
            this.d = EncodingUtils.urlEncode(deviceInfo.getUserAgent());
        }
    }
}
