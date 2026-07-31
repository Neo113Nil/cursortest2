package com.mobilefuse.sdk.network.model;

import com.ironsource.O6;
import com.ironsource.X3;
import com.mobilefuse.sdk.device.DeviceType;
import com.mobilefuse.sdk.device.UserAgentInfo;
import com.mobilefuse.sdk.user.Gender;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MfxBidRequest.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bb\b\u0086\b\u0018\u00002\u00020\u0001Bã\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u001f\u001a\u00020\u0006\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\"\u001a\u00020\u000f\u0012\u0006\u0010#\u001a\u00020\u000f\u0012\u0006\u0010$\u001a\u00020\u0003\u0012\u0006\u0010%\u001a\u00020\u0003\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010)\u001a\u00020\u0003\u0012\u0006\u0010*\u001a\u00020\u0003¢\u0006\u0002\u0010+J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\t\u0010Z\u001a\u00020\u000fHÆ\u0003J\t\u0010[\u001a\u00020\u000fHÆ\u0003J\u0010\u0010\\\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u00100J\u0010\u0010]\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u00100J\u0010\u0010^\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010-J\u0010\u0010_\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010-J\u0010\u0010`\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u00100J\u0010\u0010a\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u0010BJ\u0015\u0010b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001aHÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010d\u001a\u00020\u0003HÆ\u0003J\u0010\u0010e\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010-J\t\u0010f\u001a\u00020\u001eHÆ\u0003J\t\u0010g\u001a\u00020\u0006HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010j\u001a\u00020\u000fHÆ\u0003J\t\u0010k\u001a\u00020\u000fHÆ\u0003J\t\u0010l\u001a\u00020\u0003HÆ\u0003J\t\u0010m\u001a\u00020\u0003HÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010o\u001a\u00020\u0006HÆ\u0003J\u0010\u0010p\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u0010BJ\u000b\u0010q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010r\u001a\u00020\u0003HÆ\u0003J\t\u0010s\u001a\u00020\u0003HÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010u\u001a\u00020\u0006HÆ\u0003J\t\u0010v\u001a\u00020\u0006HÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0086\u0003\u0010z\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\"\u001a\u00020\u000f2\b\b\u0002\u0010#\u001a\u00020\u000f2\b\b\u0002\u0010$\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010)\u001a\u00020\u00032\b\b\u0002\u0010*\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010{J\u0013\u0010|\u001a\u00020\u00062\b\u0010}\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010~\u001a\u00020\u000fHÖ\u0001J\t\u0010\u007f\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010.\u001a\u0004\b,\u0010-R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u00101\u001a\u0004\b/\u00100R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u0010#\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u0010\"\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b6\u00105R\u0011\u0010\u001f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0011\u0010\u0010\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b9\u00105R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b<\u00105R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b=\u00108R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u00103R\u001d\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001a¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0015\u0010'\u001a\u0004\u0018\u00010\u0018¢\u0006\n\n\u0002\u0010C\u001a\u0004\bA\u0010BR\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0013\u0010 \u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bF\u00103R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bG\u00103R\u0013\u0010&\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bH\u00103R\u0013\u0010(\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bI\u00103R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bJ\u00103R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010.\u001a\u0004\bK\u0010-R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u00101\u001a\u0004\bL\u00100R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bM\u00108R\u0011\u0010*\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bN\u00103R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u00101\u001a\u0004\bO\u00100R\u0011\u0010)\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bP\u00103R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\n\n\u0002\u0010C\u001a\u0004\bQ\u0010BR\u0011\u0010$\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bR\u00103R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bS\u00103R\u0011\u0010%\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bT\u00103R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bU\u00108R\u0013\u0010!\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bV\u00103R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bW\u00103R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010.\u001a\u0004\bX\u0010-¨\u0006\u0080\u0001"}, d2 = {"Lcom/mobilefuse/sdk/network/model/MfxBidRequest;", "", POBConstants.KEY_TAG_ID, "", X3.j.W, POBConstants.TEST_MODE, "", "ifa", "lmt", "dnt", UserAgentInfo.CACHE_USER_AGENT_VALUE_KEY, O6.q, "deviceType", "Lcom/mobilefuse/sdk/device/DeviceType;", "deviceWidth", "", "deviceHeight", "lat", "", POBConstants.KEY_LONGITUDE, POBConstants.KEY_LAST_FIX, POBConstants.KEY_ACCURACY, "altitude", "pressure", "", "eidValues", "", "eidSource", "yearOfBirth", "gender", "Lcom/mobilefuse/sdk/user/Gender;", "coppa", "gpp", "usPrivacy", "bannerWidth", "bannerHeight", "sdkVersion", "telemetrySessionId", "ifv", "floor", "ipAddress", "osVersion", "logsSessionId", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Lcom/mobilefuse/sdk/device/DeviceType;IILjava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Float;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Integer;Lcom/mobilefuse/sdk/user/Gender;ZLjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccuracy", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAltitude", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getAppVersion", "()Ljava/lang/String;", "getBannerHeight", "()I", "getBannerWidth", "getCoppa", "()Z", "getDeviceHeight", "getDeviceType", "()Lcom/mobilefuse/sdk/device/DeviceType;", "getDeviceWidth", "getDnt", "getEidSource", "getEidValues", "()Ljava/util/Map;", "getFloor", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getGender", "()Lcom/mobilefuse/sdk/user/Gender;", "getGpp", "getIfa", "getIfv", "getIpAddress", "getLang", "getLastfix", "getLat", "getLmt", "getLogsSessionId", "getLon", "getOsVersion", "getPressure", "getSdkVersion", "getTagid", "getTelemetrySessionId", "getTest", "getUsPrivacy", "getUserAgent", "getYearOfBirth", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Lcom/mobilefuse/sdk/device/DeviceType;IILjava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Float;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Integer;Lcom/mobilefuse/sdk/user/Gender;ZLjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/mobilefuse/sdk/network/model/MfxBidRequest;", "equals", "other", "hashCode", "toString", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes11.dex */
public final /* data */ class MfxBidRequest {

    @Nullable
    private final Integer accuracy;

    @Nullable
    private final Double altitude;

    @NotNull
    private final String appVersion;
    private final int bannerHeight;
    private final int bannerWidth;
    private final boolean coppa;
    private final int deviceHeight;

    @Nullable
    private final DeviceType deviceType;
    private final int deviceWidth;
    private final boolean dnt;

    @Nullable
    private final String eidSource;

    @NotNull
    private final Map<String, String> eidValues;

    @Nullable
    private final Float floor;

    @NotNull
    private final Gender gender;

    @Nullable
    private final String gpp;

    @Nullable
    private final String ifa;

    @Nullable
    private final String ifv;

    @Nullable
    private final String ipAddress;

    @Nullable
    private final String lang;

    @Nullable
    private final Integer lastfix;

    @Nullable
    private final Double lat;
    private final boolean lmt;

    @NotNull
    private final String logsSessionId;

    @Nullable
    private final Double lon;

    @NotNull
    private final String osVersion;

    @Nullable
    private final Float pressure;

    @NotNull
    private final String sdkVersion;

    @NotNull
    private final String tagid;

    @NotNull
    private final String telemetrySessionId;
    private final boolean test;

    @Nullable
    private final String usPrivacy;

    @Nullable
    private final String userAgent;

    @Nullable
    private final Integer yearOfBirth;

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTagid() {
        return this.tagid;
    }

    /* renamed from: component10, reason: from getter */
    public final int getDeviceWidth() {
        return this.deviceWidth;
    }

    /* renamed from: component11, reason: from getter */
    public final int getDeviceHeight() {
        return this.deviceHeight;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Double getLat() {
        return this.lat;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Double getLon() {
        return this.lon;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Integer getLastfix() {
        return this.lastfix;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final Integer getAccuracy() {
        return this.accuracy;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final Double getAltitude() {
        return this.altitude;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final Float getPressure() {
        return this.pressure;
    }

    @NotNull
    public final Map<String, String> component18() {
        return this.eidValues;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final String getEidSource() {
        return this.eidSource;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getAppVersion() {
        return this.appVersion;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final Integer getYearOfBirth() {
        return this.yearOfBirth;
    }

    @NotNull
    /* renamed from: component21, reason: from getter */
    public final Gender getGender() {
        return this.gender;
    }

    /* renamed from: component22, reason: from getter */
    public final boolean getCoppa() {
        return this.coppa;
    }

    @Nullable
    /* renamed from: component23, reason: from getter */
    public final String getGpp() {
        return this.gpp;
    }

    @Nullable
    /* renamed from: component24, reason: from getter */
    public final String getUsPrivacy() {
        return this.usPrivacy;
    }

    /* renamed from: component25, reason: from getter */
    public final int getBannerWidth() {
        return this.bannerWidth;
    }

    /* renamed from: component26, reason: from getter */
    public final int getBannerHeight() {
        return this.bannerHeight;
    }

    @NotNull
    /* renamed from: component27, reason: from getter */
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    @NotNull
    /* renamed from: component28, reason: from getter */
    public final String getTelemetrySessionId() {
        return this.telemetrySessionId;
    }

    @Nullable
    /* renamed from: component29, reason: from getter */
    public final String getIfv() {
        return this.ifv;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getTest() {
        return this.test;
    }

    @Nullable
    /* renamed from: component30, reason: from getter */
    public final Float getFloor() {
        return this.floor;
    }

    @Nullable
    /* renamed from: component31, reason: from getter */
    public final String getIpAddress() {
        return this.ipAddress;
    }

    @NotNull
    /* renamed from: component32, reason: from getter */
    public final String getOsVersion() {
        return this.osVersion;
    }

    @NotNull
    /* renamed from: component33, reason: from getter */
    public final String getLogsSessionId() {
        return this.logsSessionId;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getIfa() {
        return this.ifa;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getLmt() {
        return this.lmt;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getDnt() {
        return this.dnt;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getUserAgent() {
        return this.userAgent;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getLang() {
        return this.lang;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final DeviceType getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    public final MfxBidRequest copy(@NotNull String tagid, @NotNull String appVersion, boolean test, @Nullable String ifa, boolean lmt, boolean dnt, @Nullable String userAgent, @Nullable String lang, @Nullable DeviceType deviceType, int deviceWidth, int deviceHeight, @Nullable Double lat, @Nullable Double lon, @Nullable Integer lastfix, @Nullable Integer accuracy, @Nullable Double altitude, @Nullable Float pressure, @NotNull Map<String, String> eidValues, @Nullable String eidSource, @Nullable Integer yearOfBirth, @NotNull Gender gender, boolean coppa, @Nullable String gpp, @Nullable String usPrivacy, int bannerWidth, int bannerHeight, @NotNull String sdkVersion, @NotNull String telemetrySessionId, @Nullable String ifv, @Nullable Float floor, @Nullable String ipAddress, @NotNull String osVersion, @NotNull String logsSessionId) {
        Intrinsics.checkNotNullParameter(tagid, "tagid");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(eidValues, "eidValues");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        Intrinsics.checkNotNullParameter(telemetrySessionId, "telemetrySessionId");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(logsSessionId, "logsSessionId");
        return new MfxBidRequest(tagid, appVersion, test, ifa, lmt, dnt, userAgent, lang, deviceType, deviceWidth, deviceHeight, lat, lon, lastfix, accuracy, altitude, pressure, eidValues, eidSource, yearOfBirth, gender, coppa, gpp, usPrivacy, bannerWidth, bannerHeight, sdkVersion, telemetrySessionId, ifv, floor, ipAddress, osVersion, logsSessionId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MfxBidRequest)) {
            return false;
        }
        MfxBidRequest mfxBidRequest = (MfxBidRequest) other;
        return Intrinsics.areEqual(this.tagid, mfxBidRequest.tagid) && Intrinsics.areEqual(this.appVersion, mfxBidRequest.appVersion) && this.test == mfxBidRequest.test && Intrinsics.areEqual(this.ifa, mfxBidRequest.ifa) && this.lmt == mfxBidRequest.lmt && this.dnt == mfxBidRequest.dnt && Intrinsics.areEqual(this.userAgent, mfxBidRequest.userAgent) && Intrinsics.areEqual(this.lang, mfxBidRequest.lang) && Intrinsics.areEqual(this.deviceType, mfxBidRequest.deviceType) && this.deviceWidth == mfxBidRequest.deviceWidth && this.deviceHeight == mfxBidRequest.deviceHeight && Intrinsics.areEqual((Object) this.lat, (Object) mfxBidRequest.lat) && Intrinsics.areEqual((Object) this.lon, (Object) mfxBidRequest.lon) && Intrinsics.areEqual(this.lastfix, mfxBidRequest.lastfix) && Intrinsics.areEqual(this.accuracy, mfxBidRequest.accuracy) && Intrinsics.areEqual((Object) this.altitude, (Object) mfxBidRequest.altitude) && Intrinsics.areEqual((Object) this.pressure, (Object) mfxBidRequest.pressure) && Intrinsics.areEqual(this.eidValues, mfxBidRequest.eidValues) && Intrinsics.areEqual(this.eidSource, mfxBidRequest.eidSource) && Intrinsics.areEqual(this.yearOfBirth, mfxBidRequest.yearOfBirth) && Intrinsics.areEqual(this.gender, mfxBidRequest.gender) && this.coppa == mfxBidRequest.coppa && Intrinsics.areEqual(this.gpp, mfxBidRequest.gpp) && Intrinsics.areEqual(this.usPrivacy, mfxBidRequest.usPrivacy) && this.bannerWidth == mfxBidRequest.bannerWidth && this.bannerHeight == mfxBidRequest.bannerHeight && Intrinsics.areEqual(this.sdkVersion, mfxBidRequest.sdkVersion) && Intrinsics.areEqual(this.telemetrySessionId, mfxBidRequest.telemetrySessionId) && Intrinsics.areEqual(this.ifv, mfxBidRequest.ifv) && Intrinsics.areEqual((Object) this.floor, (Object) mfxBidRequest.floor) && Intrinsics.areEqual(this.ipAddress, mfxBidRequest.ipAddress) && Intrinsics.areEqual(this.osVersion, mfxBidRequest.osVersion) && Intrinsics.areEqual(this.logsSessionId, mfxBidRequest.logsSessionId);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.tagid;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.appVersion;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.test;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        String str3 = this.ifa;
        int hashCode3 = (i2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z2 = this.lmt;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (hashCode3 + i3) * 31;
        boolean z3 = this.dnt;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        String str4 = this.userAgent;
        int hashCode4 = (i6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.lang;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        DeviceType deviceType = this.deviceType;
        int hashCode6 = (((((hashCode5 + (deviceType != null ? deviceType.hashCode() : 0)) * 31) + Integer.hashCode(this.deviceWidth)) * 31) + Integer.hashCode(this.deviceHeight)) * 31;
        Double d = this.lat;
        int hashCode7 = (hashCode6 + (d != null ? d.hashCode() : 0)) * 31;
        Double d2 = this.lon;
        int hashCode8 = (hashCode7 + (d2 != null ? d2.hashCode() : 0)) * 31;
        Integer num = this.lastfix;
        int hashCode9 = (hashCode8 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.accuracy;
        int hashCode10 = (hashCode9 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Double d3 = this.altitude;
        int hashCode11 = (hashCode10 + (d3 != null ? d3.hashCode() : 0)) * 31;
        Float f = this.pressure;
        int hashCode12 = (hashCode11 + (f != null ? f.hashCode() : 0)) * 31;
        Map<String, String> map = this.eidValues;
        int hashCode13 = (hashCode12 + (map != null ? map.hashCode() : 0)) * 31;
        String str6 = this.eidSource;
        int hashCode14 = (hashCode13 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Integer num3 = this.yearOfBirth;
        int hashCode15 = (hashCode14 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Gender gender = this.gender;
        int hashCode16 = (hashCode15 + (gender != null ? gender.hashCode() : 0)) * 31;
        boolean z4 = this.coppa;
        int i7 = (hashCode16 + (z4 ? 1 : z4 ? 1 : 0)) * 31;
        String str7 = this.gpp;
        int hashCode17 = (i7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.usPrivacy;
        int hashCode18 = (((((hashCode17 + (str8 != null ? str8.hashCode() : 0)) * 31) + Integer.hashCode(this.bannerWidth)) * 31) + Integer.hashCode(this.bannerHeight)) * 31;
        String str9 = this.sdkVersion;
        int hashCode19 = (hashCode18 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.telemetrySessionId;
        int hashCode20 = (hashCode19 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.ifv;
        int hashCode21 = (hashCode20 + (str11 != null ? str11.hashCode() : 0)) * 31;
        Float f2 = this.floor;
        int hashCode22 = (hashCode21 + (f2 != null ? f2.hashCode() : 0)) * 31;
        String str12 = this.ipAddress;
        int hashCode23 = (hashCode22 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.osVersion;
        int hashCode24 = (hashCode23 + (str13 != null ? str13.hashCode() : 0)) * 31;
        String str14 = this.logsSessionId;
        return hashCode24 + (str14 != null ? str14.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MfxBidRequest(tagid=" + this.tagid + ", appVersion=" + this.appVersion + ", test=" + this.test + ", ifa=" + this.ifa + ", lmt=" + this.lmt + ", dnt=" + this.dnt + ", userAgent=" + this.userAgent + ", lang=" + this.lang + ", deviceType=" + this.deviceType + ", deviceWidth=" + this.deviceWidth + ", deviceHeight=" + this.deviceHeight + ", lat=" + this.lat + ", lon=" + this.lon + ", lastfix=" + this.lastfix + ", accuracy=" + this.accuracy + ", altitude=" + this.altitude + ", pressure=" + this.pressure + ", eidValues=" + this.eidValues + ", eidSource=" + this.eidSource + ", yearOfBirth=" + this.yearOfBirth + ", gender=" + this.gender + ", coppa=" + this.coppa + ", gpp=" + this.gpp + ", usPrivacy=" + this.usPrivacy + ", bannerWidth=" + this.bannerWidth + ", bannerHeight=" + this.bannerHeight + ", sdkVersion=" + this.sdkVersion + ", telemetrySessionId=" + this.telemetrySessionId + ", ifv=" + this.ifv + ", floor=" + this.floor + ", ipAddress=" + this.ipAddress + ", osVersion=" + this.osVersion + ", logsSessionId=" + this.logsSessionId + ")";
    }

    public MfxBidRequest(@NotNull String tagid, @NotNull String appVersion, boolean z, @Nullable String str, boolean z2, boolean z3, @Nullable String str2, @Nullable String str3, @Nullable DeviceType deviceType, int i, int i2, @Nullable Double d, @Nullable Double d2, @Nullable Integer num, @Nullable Integer num2, @Nullable Double d3, @Nullable Float f, @NotNull Map<String, String> eidValues, @Nullable String str4, @Nullable Integer num3, @NotNull Gender gender, boolean z4, @Nullable String str5, @Nullable String str6, int i3, int i4, @NotNull String sdkVersion, @NotNull String telemetrySessionId, @Nullable String str7, @Nullable Float f2, @Nullable String str8, @NotNull String osVersion, @NotNull String logsSessionId) {
        Intrinsics.checkNotNullParameter(tagid, "tagid");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(eidValues, "eidValues");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        Intrinsics.checkNotNullParameter(telemetrySessionId, "telemetrySessionId");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(logsSessionId, "logsSessionId");
        this.tagid = tagid;
        this.appVersion = appVersion;
        this.test = z;
        this.ifa = str;
        this.lmt = z2;
        this.dnt = z3;
        this.userAgent = str2;
        this.lang = str3;
        this.deviceType = deviceType;
        this.deviceWidth = i;
        this.deviceHeight = i2;
        this.lat = d;
        this.lon = d2;
        this.lastfix = num;
        this.accuracy = num2;
        this.altitude = d3;
        this.pressure = f;
        this.eidValues = eidValues;
        this.eidSource = str4;
        this.yearOfBirth = num3;
        this.gender = gender;
        this.coppa = z4;
        this.gpp = str5;
        this.usPrivacy = str6;
        this.bannerWidth = i3;
        this.bannerHeight = i4;
        this.sdkVersion = sdkVersion;
        this.telemetrySessionId = telemetrySessionId;
        this.ifv = str7;
        this.floor = f2;
        this.ipAddress = str8;
        this.osVersion = osVersion;
        this.logsSessionId = logsSessionId;
    }

    @NotNull
    public final String getTagid() {
        return this.tagid;
    }

    @NotNull
    public final String getAppVersion() {
        return this.appVersion;
    }

    public final boolean getTest() {
        return this.test;
    }

    @Nullable
    public final String getIfa() {
        return this.ifa;
    }

    public final boolean getLmt() {
        return this.lmt;
    }

    public final boolean getDnt() {
        return this.dnt;
    }

    @Nullable
    public final String getUserAgent() {
        return this.userAgent;
    }

    @Nullable
    public final String getLang() {
        return this.lang;
    }

    @Nullable
    public final DeviceType getDeviceType() {
        return this.deviceType;
    }

    public final int getDeviceWidth() {
        return this.deviceWidth;
    }

    public final int getDeviceHeight() {
        return this.deviceHeight;
    }

    @Nullable
    public final Double getLat() {
        return this.lat;
    }

    @Nullable
    public final Double getLon() {
        return this.lon;
    }

    @Nullable
    public final Integer getLastfix() {
        return this.lastfix;
    }

    @Nullable
    public final Integer getAccuracy() {
        return this.accuracy;
    }

    @Nullable
    public final Double getAltitude() {
        return this.altitude;
    }

    @Nullable
    public final Float getPressure() {
        return this.pressure;
    }

    public /* synthetic */ MfxBidRequest(String str, String str2, boolean z, String str3, boolean z2, boolean z3, String str4, String str5, DeviceType deviceType, int i, int i2, Double d, Double d2, Integer num, Integer num2, Double d3, Float f, Map map, String str6, Integer num3, Gender gender, boolean z4, String str7, String str8, int i3, int i4, String str9, String str10, String str11, Float f2, String str12, String str13, String str14, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i5 & 4) != 0 ? false : z, (i5 & 8) != 0 ? null : str3, z2, z3, (i5 & 64) != 0 ? null : str4, (i5 & 128) != 0 ? null : str5, (i5 & 256) != 0 ? null : deviceType, i, i2, (i5 & 2048) != 0 ? null : d, (i5 & 4096) != 0 ? null : d2, (i5 & 8192) != 0 ? null : num, (i5 & 16384) != 0 ? null : num2, (32768 & i5) != 0 ? null : d3, (65536 & i5) != 0 ? null : f, (131072 & i5) != 0 ? MapsKt.emptyMap() : map, (262144 & i5) != 0 ? null : str6, (524288 & i5) != 0 ? null : num3, (1048576 & i5) != 0 ? Gender.UNKNOWN : gender, z4, (4194304 & i5) != 0 ? null : str7, (8388608 & i5) != 0 ? null : str8, i3, i4, str9, str10, (268435456 & i5) != 0 ? null : str11, (536870912 & i5) != 0 ? null : f2, (i5 & 1073741824) != 0 ? null : str12, str13, str14);
    }

    @NotNull
    public final Map<String, String> getEidValues() {
        return this.eidValues;
    }

    @Nullable
    public final String getEidSource() {
        return this.eidSource;
    }

    @Nullable
    public final Integer getYearOfBirth() {
        return this.yearOfBirth;
    }

    @NotNull
    public final Gender getGender() {
        return this.gender;
    }

    public final boolean getCoppa() {
        return this.coppa;
    }

    @Nullable
    public final String getGpp() {
        return this.gpp;
    }

    @Nullable
    public final String getUsPrivacy() {
        return this.usPrivacy;
    }

    public final int getBannerWidth() {
        return this.bannerWidth;
    }

    public final int getBannerHeight() {
        return this.bannerHeight;
    }

    @NotNull
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    @NotNull
    public final String getTelemetrySessionId() {
        return this.telemetrySessionId;
    }

    @Nullable
    public final String getIfv() {
        return this.ifv;
    }

    @Nullable
    public final Float getFloor() {
        return this.floor;
    }

    @Nullable
    public final String getIpAddress() {
        return this.ipAddress;
    }

    @NotNull
    public final String getOsVersion() {
        return this.osVersion;
    }

    @NotNull
    public final String getLogsSessionId() {
        return this.logsSessionId;
    }
}
