package com.yandex.mobile.ads.common;

import com.mobilefuse.sdk.identity.EidRequestBuilder;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001$J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR%\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0016\u0010\rR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010#\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/yandex/mobile/ads/common/AdRequest;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "a", "Ljava/lang/String;", "getAdUnitId", "()Ljava/lang/String;", "adUnitId", "", "c", "Ljava/util/Map;", "getParameters", "()Ljava/util/Map;", "parameters", "d", "getBiddingData", "biddingData", "Lcom/yandex/mobile/ads/common/AdTheme;", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Lcom/yandex/mobile/ads/common/AdTheme;", "getPreferredTheme", "()Lcom/yandex/mobile/ads/common/AdTheme;", "preferredTheme", "Lcom/yandex/mobile/ads/common/AdTargeting;", "b", "Lcom/yandex/mobile/ads/common/AdTargeting;", "getTargeting", "()Lcom/yandex/mobile/ads/common/AdTargeting;", "targeting", "Builder", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AdRequest {

    /* renamed from: a, reason: from kotlin metadata */
    private final String adUnitId;

    /* renamed from: c, reason: from kotlin metadata */
    private final Map parameters;

    /* renamed from: d, reason: from kotlin metadata */
    private final String biddingData;

    /* renamed from: e, reason: from kotlin metadata */
    private final AdTheme preferredTheme;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/mobile/ads/common/AdRequest$Builder;", "", "", "adUnitId", "<init>", "(Ljava/lang/String;)V", "Lcom/yandex/mobile/ads/common/AdRequest;", "build", "()Lcom/yandex/mobile/ads/common/AdRequest;", "biddingData", "setBiddingData", "(Ljava/lang/String;)Lcom/yandex/mobile/ads/common/AdRequest$Builder;", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder {
        private final String a;
        private Map c;
        private String d;
        private AdTheme e;

        public Builder(@NotNull String str) {
            this.a = str;
        }

        @NotNull
        public final AdRequest build() {
            return new AdRequest(this.a, null, this.c, this.d, this.e, null);
        }

        @NotNull
        public final Builder setBiddingData(@Nullable String biddingData) {
            this.d = biddingData;
            return this;
        }
    }

    public AdRequest(String str, AdTargeting adTargeting, Map map, String str2, AdTheme adTheme, DefaultConstructorMarker defaultConstructorMarker) {
        this.adUnitId = str;
        this.parameters = map;
        this.biddingData = str2;
        this.preferredTheme = adTheme;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !Intrinsics.areEqual(AdRequest.class, other.getClass())) {
            return false;
        }
        AdRequest adRequest = (AdRequest) other;
        return Intrinsics.areEqual(this.adUnitId, adRequest.adUnitId) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.parameters, adRequest.parameters) && Intrinsics.areEqual(this.biddingData, adRequest.biddingData) && this.preferredTheme == adRequest.preferredTheme;
    }

    @NotNull
    public final String getAdUnitId() {
        return this.adUnitId;
    }

    @Nullable
    public final String getBiddingData() {
        return this.biddingData;
    }

    @Nullable
    public final Map<String, String> getParameters() {
        return this.parameters;
    }

    @Nullable
    public final AdTheme getPreferredTheme() {
        return this.preferredTheme;
    }

    @Nullable
    public final AdTargeting getTargeting() {
        return null;
    }

    public int hashCode() {
        int hashCode = this.adUnitId.hashCode() * 961;
        Map map = this.parameters;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        String str = this.biddingData;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        AdTheme adTheme = this.preferredTheme;
        return hashCode3 + (adTheme != null ? adTheme.hashCode() : 0);
    }
}
