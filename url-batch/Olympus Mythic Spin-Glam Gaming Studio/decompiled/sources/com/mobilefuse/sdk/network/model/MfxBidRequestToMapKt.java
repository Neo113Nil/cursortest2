package com.mobilefuse.sdk.network.model;

import com.ironsource.O6;
import com.mobilefuse.sdk.device.DeviceType;
import com.mobilefuse.sdk.user.Gender;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: MfxBidRequestToMap.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a \u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u001a\u0016\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0004¨\u0006\b"}, d2 = {"toMap", "", "", "", "Lcom/mobilefuse/sdk/network/model/MfxBidRequest;", "includeEids", "", "toStringMap", "mobilefuse-sdk-core_release"}, k = 2, mv = {1, 4, 3})
/* loaded from: classes15.dex */
public final class MfxBidRequestToMapKt {
    @NotNull
    public static final Map<String, String> toStringMap(@NotNull MfxBidRequest toStringMap) {
        Intrinsics.checkNotNullParameter(toStringMap, "$this$toStringMap");
        Map map$default = toMap$default(toStringMap, false, 1, null);
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map$default.size()));
        for (Map.Entry entry : map$default.entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue().toString());
        }
        return linkedHashMap;
    }

    public static /* synthetic */ Map toMap$default(MfxBidRequest mfxBidRequest, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return toMap(mfxBidRequest, z);
    }

    @NotNull
    public static final Map<String, Object> toMap(@NotNull MfxBidRequest toMap, boolean z) {
        int intValue;
        Intrinsics.checkNotNullParameter(toMap, "$this$toMap");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(POBConstants.KEY_TAG_ID, toMap.getTagid());
        linkedHashMap.put("sdk_version", toMap.getSdkVersion());
        linkedHashMap.put("app_version", toMap.getAppVersion());
        if (toMap.getTest()) {
            linkedHashMap.put(POBConstants.TEST_MODE, 1);
        }
        String ifa = toMap.getIfa();
        if (ifa != null && !StringsKt.isBlank(ifa)) {
            linkedHashMap.put("ifa", toMap.getIfa());
        }
        if (toMap.getLmt()) {
            linkedHashMap.put("lmt", 1);
        }
        if (toMap.getDnt()) {
            linkedHashMap.put("dnt", 1);
        }
        String userAgent = toMap.getUserAgent();
        if (userAgent != null && userAgent.length() != 0) {
            linkedHashMap.put("ua", toMap.getUserAgent());
        }
        String lang = toMap.getLang();
        if (lang != null && lang.length() != 0) {
            linkedHashMap.put(O6.q, toMap.getLang());
        }
        DeviceType deviceType = toMap.getDeviceType();
        if (deviceType != null) {
            linkedHashMap.put(CommonUrlParts.DEVICE_TYPE, Integer.valueOf(deviceType.getValue()));
        }
        if (toMap.getDeviceWidth() > 0) {
            linkedHashMap.put("device_w", Integer.valueOf(toMap.getDeviceWidth()));
        }
        if (toMap.getDeviceHeight() > 0) {
            linkedHashMap.put("device_h", Integer.valueOf(toMap.getDeviceHeight()));
        }
        Double lat = toMap.getLat();
        if (lat != null) {
            linkedHashMap.put("lat", Double.valueOf(lat.doubleValue()));
        }
        Double lon = toMap.getLon();
        if (lon != null) {
            linkedHashMap.put(POBConstants.KEY_LONGITUDE, Double.valueOf(lon.doubleValue()));
        }
        Integer lastfix = toMap.getLastfix();
        if (lastfix != null) {
            linkedHashMap.put(POBConstants.KEY_LAST_FIX, Integer.valueOf(lastfix.intValue()));
        }
        Integer accuracy = toMap.getAccuracy();
        if (accuracy != null) {
            linkedHashMap.put(POBConstants.KEY_ACCURACY, Integer.valueOf(accuracy.intValue()));
        }
        Double altitude = toMap.getAltitude();
        if (altitude != null) {
            linkedHashMap.put("altitude", Double.valueOf(altitude.doubleValue()));
        }
        Float pressure = toMap.getPressure();
        if (pressure != null) {
            linkedHashMap.put("pressure", Float.valueOf(pressure.floatValue()));
        }
        if (z) {
            for (Map.Entry<String, String> entry : toMap.getEidValues().entrySet()) {
                linkedHashMap.put("eid[" + entry.getKey() + ']', entry.getValue());
            }
        }
        String eidSource = toMap.getEidSource();
        if (eidSource != null && eidSource.length() != 0) {
            linkedHashMap.put("eid_source", toMap.getEidSource());
        }
        Integer yearOfBirth = toMap.getYearOfBirth();
        if (yearOfBirth != null && (intValue = yearOfBirth.intValue()) > 0) {
            linkedHashMap.put(POBConstants.KEY_YEAR_OF_BIRTH, Integer.valueOf(intValue));
        }
        if (toMap.getGender() != Gender.UNKNOWN) {
            linkedHashMap.put("gender", toMap.getGender().getValue());
        }
        if (toMap.getCoppa()) {
            linkedHashMap.put("coppa", 1);
        }
        String gpp = toMap.getGpp();
        if (gpp != null && gpp.length() != 0) {
            linkedHashMap.put("gpp", toMap.getGpp());
        }
        String usPrivacy = toMap.getUsPrivacy();
        if (usPrivacy != null && usPrivacy.length() != 0) {
            linkedHashMap.put("us_privacy", toMap.getUsPrivacy());
        }
        if (toMap.getBannerWidth() > 0) {
            linkedHashMap.put("banner_width", Integer.valueOf(toMap.getBannerWidth()));
        }
        if (toMap.getBannerHeight() > 0) {
            linkedHashMap.put("banner_height", Integer.valueOf(toMap.getBannerHeight()));
        }
        if (!StringsKt.isBlank(toMap.getTelemetrySessionId())) {
            linkedHashMap.put("log_uuid", toMap.getTelemetrySessionId());
        }
        if (!StringsKt.isBlank(toMap.getLogsSessionId())) {
            linkedHashMap.put("console_log_uuid", toMap.getLogsSessionId());
        }
        if (toMap.getIfv() != null) {
            linkedHashMap.put("ifv", toMap.getIfv());
        }
        if (toMap.getFloor() != null && toMap.getFloor().floatValue() >= 0) {
            linkedHashMap.put("floor", toMap.getFloor());
        }
        String ipAddress = toMap.getIpAddress();
        if (ipAddress != null && ipAddress.length() != 0 && !StringsKt.isBlank(toMap.getIpAddress())) {
            linkedHashMap.put(POBConstants.KEY_IP, toMap.getIpAddress());
        }
        linkedHashMap.put(CommonUrlParts.OS_VERSION, toMap.getOsVersion());
        return linkedHashMap;
    }
}
