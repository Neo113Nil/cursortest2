package com.unity3d.ads;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BannerConfiguration.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001:\u0001\u001cB[\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/unity3d/ads/BannerConfiguration;", "", "placementId", "", "bannerSize", "Lcom/unity3d/ads/BannerSize;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/unity3d/ads/BannerShowListener;", "extras", "", "adMarkup", "mediationInfo", "Lcom/unity3d/ads/MediationInfo;", "mediationAdUnitId", "<init>", "(Ljava/lang/String;Lcom/unity3d/ads/BannerSize;Lcom/unity3d/ads/BannerShowListener;Ljava/util/Map;Ljava/lang/String;Lcom/unity3d/ads/MediationInfo;Ljava/lang/String;)V", "getPlacementId", "()Ljava/lang/String;", "getBannerSize", "()Lcom/unity3d/ads/BannerSize;", "getListener", "()Lcom/unity3d/ads/BannerShowListener;", "getExtras", "()Ljava/util/Map;", "getAdMarkup", "getMediationInfo", "()Lcom/unity3d/ads/MediationInfo;", "getMediationAdUnitId", "Builder", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BannerConfiguration {

    @Nullable
    private final String adMarkup;

    @NotNull
    private final BannerSize bannerSize;

    @NotNull
    private final Map<String, String> extras;

    @NotNull
    private final BannerShowListener listener;

    @Nullable
    private final String mediationAdUnitId;

    @Nullable
    private final MediationInfo mediationInfo;

    @NotNull
    private final String placementId;

    public /* synthetic */ BannerConfiguration(String str, BannerSize bannerSize, BannerShowListener bannerShowListener, Map map, String str2, MediationInfo mediationInfo, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bannerSize, bannerShowListener, map, str2, mediationInfo, str3);
    }

    private BannerConfiguration(String str, BannerSize bannerSize, BannerShowListener bannerShowListener, Map<String, String> map, String str2, MediationInfo mediationInfo, String str3) {
        this.placementId = str;
        this.bannerSize = bannerSize;
        this.listener = bannerShowListener;
        this.extras = map;
        this.adMarkup = str2;
        this.mediationInfo = mediationInfo;
        this.mediationAdUnitId = str3;
    }

    @NotNull
    public final String getPlacementId() {
        return this.placementId;
    }

    @NotNull
    public final BannerSize getBannerSize() {
        return this.bannerSize;
    }

    @NotNull
    public final BannerShowListener getListener() {
        return this.listener;
    }

    /* synthetic */ BannerConfiguration(String str, BannerSize bannerSize, BannerShowListener bannerShowListener, Map map, String str2, MediationInfo mediationInfo, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bannerSize, bannerShowListener, (i & 8) != 0 ? MapsKt.emptyMap() : map, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : mediationInfo, (i & 64) != 0 ? null : str3);
    }

    @NotNull
    public final Map<String, String> getExtras() {
        return this.extras;
    }

    @Nullable
    public final String getAdMarkup() {
        return this.adMarkup;
    }

    @Nullable
    public final MediationInfo getMediationInfo() {
        return this.mediationInfo;
    }

    @Nullable
    public final String getMediationAdUnitId() {
        return this.mediationAdUnitId;
    }

    /* compiled from: BannerConfiguration.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0003J\u001a\u0010\u0011\u001a\u00020\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\fJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0003J\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/unity3d/ads/BannerConfiguration$Builder;", "", "placementId", "", "bannerSize", "Lcom/unity3d/ads/BannerSize;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/unity3d/ads/BannerShowListener;", "<init>", "(Ljava/lang/String;Lcom/unity3d/ads/BannerSize;Lcom/unity3d/ads/BannerShowListener;)V", "adMarkup", "extras", "", "mediationInfo", "Lcom/unity3d/ads/MediationInfo;", "mediationAdUnitId", "withAdMarkup", "withExtras", "withMediationInfo", "withMediationAdUnitId", "build", "Lcom/unity3d/ads/BannerConfiguration;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {

        @Nullable
        private String adMarkup;

        @NotNull
        private final BannerSize bannerSize;

        @NotNull
        private Map<String, String> extras;

        @NotNull
        private final BannerShowListener listener;

        @Nullable
        private String mediationAdUnitId;

        @Nullable
        private MediationInfo mediationInfo;

        @NotNull
        private final String placementId;

        public Builder(@NotNull String placementId, @NotNull BannerSize bannerSize, @NotNull BannerShowListener listener) {
            Intrinsics.checkNotNullParameter(placementId, "placementId");
            Intrinsics.checkNotNullParameter(bannerSize, "bannerSize");
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.placementId = placementId;
            this.bannerSize = bannerSize;
            this.listener = listener;
            this.extras = MapsKt.emptyMap();
        }

        @NotNull
        public final Builder withAdMarkup(@NotNull String adMarkup) {
            Intrinsics.checkNotNullParameter(adMarkup, "adMarkup");
            this.adMarkup = adMarkup;
            return this;
        }

        @NotNull
        public final Builder withExtras(@NotNull Map<String, String> extras) {
            Intrinsics.checkNotNullParameter(extras, "extras");
            this.extras = extras;
            return this;
        }

        @NotNull
        public final Builder withMediationInfo(@NotNull MediationInfo mediationInfo) {
            Intrinsics.checkNotNullParameter(mediationInfo, "mediationInfo");
            this.mediationInfo = mediationInfo;
            return this;
        }

        @NotNull
        public final Builder withMediationAdUnitId(@NotNull String mediationAdUnitId) {
            Intrinsics.checkNotNullParameter(mediationAdUnitId, "mediationAdUnitId");
            this.mediationAdUnitId = mediationAdUnitId;
            return this;
        }

        @NotNull
        public final BannerConfiguration build() {
            return new BannerConfiguration(this.placementId, this.bannerSize, this.listener, this.extras, this.adMarkup, this.mediationInfo, this.mediationAdUnitId, null);
        }
    }
}
