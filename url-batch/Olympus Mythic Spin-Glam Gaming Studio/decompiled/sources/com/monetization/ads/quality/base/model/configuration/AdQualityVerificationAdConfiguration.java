package com.monetization.ads.quality.base.model.configuration;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yads.c4;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0001HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000eHÆ\u0003Jy\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000eHÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006."}, d2 = {"Lcom/monetization/ads/quality/base/model/configuration/AdQualityVerificationAdConfiguration;", "", "verifiableAdNetwork", "Lcom/monetization/ads/quality/base/model/configuration/AdQualityVerifiableNetwork;", "adUnitId", "", "adObject", "adType", "Lcom/monetization/ads/quality/base/model/configuration/AdQualityVerifierAdType;", "adContent", "adNetworkUnitId", "mediationId", "adNetworkCreativeId", "extraData", "", "(Lcom/monetization/ads/quality/base/model/configuration/AdQualityVerifiableNetwork;Ljava/lang/String;Ljava/lang/Object;Lcom/monetization/ads/quality/base/model/configuration/AdQualityVerifierAdType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getAdContent", "()Ljava/lang/String;", "getAdNetworkCreativeId", "getAdNetworkUnitId", "getAdObject", "()Ljava/lang/Object;", "getAdType", "()Lcom/monetization/ads/quality/base/model/configuration/AdQualityVerifierAdType;", "getAdUnitId", "getExtraData", "()Ljava/util/Map;", "getMediationId", "getVerifiableAdNetwork", "()Lcom/monetization/ads/quality/base/model/configuration/AdQualityVerifiableNetwork;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class AdQualityVerificationAdConfiguration {

    @Nullable
    private final String adContent;

    @Nullable
    private final String adNetworkCreativeId;

    @Nullable
    private final String adNetworkUnitId;

    @NotNull
    private final Object adObject;

    @NotNull
    private final AdQualityVerifierAdType adType;

    @NotNull
    private final String adUnitId;

    @Nullable
    private final Map<String, Object> extraData;

    @Nullable
    private final String mediationId;

    @NotNull
    private final AdQualityVerifiableNetwork verifiableAdNetwork;

    public AdQualityVerificationAdConfiguration(@NotNull AdQualityVerifiableNetwork adQualityVerifiableNetwork, @NotNull String str, @NotNull Object obj, @NotNull AdQualityVerifierAdType adQualityVerifierAdType, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Map<String, ? extends Object> map) {
        this.verifiableAdNetwork = adQualityVerifiableNetwork;
        this.adUnitId = str;
        this.adObject = obj;
        this.adType = adQualityVerifierAdType;
        this.adContent = str2;
        this.adNetworkUnitId = str3;
        this.mediationId = str4;
        this.adNetworkCreativeId = str5;
        this.extraData = map;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final AdQualityVerifiableNetwork getVerifiableAdNetwork() {
        return this.verifiableAdNetwork;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getAdUnitId() {
        return this.adUnitId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Object getAdObject() {
        return this.adObject;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final AdQualityVerifierAdType getAdType() {
        return this.adType;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getAdContent() {
        return this.adContent;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getAdNetworkUnitId() {
        return this.adNetworkUnitId;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getMediationId() {
        return this.mediationId;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getAdNetworkCreativeId() {
        return this.adNetworkCreativeId;
    }

    @Nullable
    public final Map<String, Object> component9() {
        return this.extraData;
    }

    @NotNull
    public final AdQualityVerificationAdConfiguration copy(@NotNull AdQualityVerifiableNetwork verifiableAdNetwork, @NotNull String adUnitId, @NotNull Object adObject, @NotNull AdQualityVerifierAdType adType, @Nullable String adContent, @Nullable String adNetworkUnitId, @Nullable String mediationId, @Nullable String adNetworkCreativeId, @Nullable Map<String, ? extends Object> extraData) {
        return new AdQualityVerificationAdConfiguration(verifiableAdNetwork, adUnitId, adObject, adType, adContent, adNetworkUnitId, mediationId, adNetworkCreativeId, extraData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdQualityVerificationAdConfiguration)) {
            return false;
        }
        AdQualityVerificationAdConfiguration adQualityVerificationAdConfiguration = (AdQualityVerificationAdConfiguration) other;
        return this.verifiableAdNetwork == adQualityVerificationAdConfiguration.verifiableAdNetwork && Intrinsics.areEqual(this.adUnitId, adQualityVerificationAdConfiguration.adUnitId) && Intrinsics.areEqual(this.adObject, adQualityVerificationAdConfiguration.adObject) && this.adType == adQualityVerificationAdConfiguration.adType && Intrinsics.areEqual(this.adContent, adQualityVerificationAdConfiguration.adContent) && Intrinsics.areEqual(this.adNetworkUnitId, adQualityVerificationAdConfiguration.adNetworkUnitId) && Intrinsics.areEqual(this.mediationId, adQualityVerificationAdConfiguration.mediationId) && Intrinsics.areEqual(this.adNetworkCreativeId, adQualityVerificationAdConfiguration.adNetworkCreativeId) && Intrinsics.areEqual(this.extraData, adQualityVerificationAdConfiguration.extraData);
    }

    @Nullable
    public final String getAdContent() {
        return this.adContent;
    }

    @Nullable
    public final String getAdNetworkCreativeId() {
        return this.adNetworkCreativeId;
    }

    @Nullable
    public final String getAdNetworkUnitId() {
        return this.adNetworkUnitId;
    }

    @NotNull
    public final Object getAdObject() {
        return this.adObject;
    }

    @NotNull
    public final AdQualityVerifierAdType getAdType() {
        return this.adType;
    }

    @NotNull
    public final String getAdUnitId() {
        return this.adUnitId;
    }

    @Nullable
    public final Map<String, Object> getExtraData() {
        return this.extraData;
    }

    @Nullable
    public final String getMediationId() {
        return this.mediationId;
    }

    @NotNull
    public final AdQualityVerifiableNetwork getVerifiableAdNetwork() {
        return this.verifiableAdNetwork;
    }

    public int hashCode() {
        int hashCode = (this.adType.hashCode() + ((this.adObject.hashCode() + c4.a(this.verifiableAdNetwork.hashCode() * 31, 31, this.adUnitId)) * 31)) * 31;
        String str = this.adContent;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.adNetworkUnitId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.mediationId;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.adNetworkCreativeId;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Map<String, Object> map = this.extraData;
        return hashCode5 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AdQualityVerificationAdConfiguration(verifiableAdNetwork=" + this.verifiableAdNetwork + ", adUnitId=" + this.adUnitId + ", adObject=" + this.adObject + ", adType=" + this.adType + ", adContent=" + this.adContent + ", adNetworkUnitId=" + this.adNetworkUnitId + ", mediationId=" + this.mediationId + ", adNetworkCreativeId=" + this.adNetworkCreativeId + ", extraData=" + this.extraData + ")";
    }

    public /* synthetic */ AdQualityVerificationAdConfiguration(AdQualityVerifiableNetwork adQualityVerifiableNetwork, String str, Object obj, AdQualityVerifierAdType adQualityVerifierAdType, String str2, String str3, String str4, String str5, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(adQualityVerifiableNetwork, str, obj, adQualityVerifierAdType, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : map);
    }
}
