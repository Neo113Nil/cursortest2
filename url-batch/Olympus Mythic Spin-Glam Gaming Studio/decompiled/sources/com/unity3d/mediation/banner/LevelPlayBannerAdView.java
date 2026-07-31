package com.unity3d.mediation.banner;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.ironsource.Aa;
import com.ironsource.C4950w7;
import com.ironsource.W2;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdSize;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes9.dex */
public final class LevelPlayBannerAdView extends FrameLayout {

    @NotNull
    private final Aa a;

    public static final class Config {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @Nullable
        private final LevelPlayAdSize a;

        @Nullable
        private final Double b;

        @Nullable
        private final String c;

        public static final class Builder {

            @Nullable
            private LevelPlayAdSize a;

            @Nullable
            private Double b;

            @Nullable
            private String c;

            @NotNull
            public final Config build() {
                return new Config(this.a, this.b, this.c);
            }

            @NotNull
            public final Builder setAdSize(@NotNull LevelPlayAdSize adSize) {
                Intrinsics.checkNotNullParameter(adSize, "adSize");
                this.a = adSize;
                return this;
            }

            @NotNull
            public final Builder setBidFloor(double d) {
                this.b = Double.valueOf(d);
                return this;
            }

            @NotNull
            public final Builder setPlacementName(@NotNull String placementName) {
                Intrinsics.checkNotNullParameter(placementName, "placementName");
                this.c = placementName;
                return this;
            }
        }

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final Config empty() {
                return new Config(null, null, null, 7, null);
            }

            private Companion() {
            }
        }

        public Config() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ Config copy$default(Config config, LevelPlayAdSize levelPlayAdSize, Double d, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                levelPlayAdSize = config.a;
            }
            if ((i & 2) != 0) {
                d = config.b;
            }
            if ((i & 4) != 0) {
                str = config.c;
            }
            return config.copy(levelPlayAdSize, d, str);
        }

        @Nullable
        public final LevelPlayAdSize component1() {
            return this.a;
        }

        @Nullable
        public final Double component2() {
            return this.b;
        }

        @Nullable
        public final String component3() {
            return this.c;
        }

        @NotNull
        public final Config copy(@Nullable LevelPlayAdSize levelPlayAdSize, @Nullable Double d, @Nullable String str) {
            return new Config(levelPlayAdSize, d, str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return Intrinsics.areEqual(this.a, config.a) && Intrinsics.areEqual((Object) this.b, (Object) config.b) && Intrinsics.areEqual(this.c, config.c);
        }

        @Nullable
        public final LevelPlayAdSize getAdSize() {
            return this.a;
        }

        @Nullable
        public final Double getBidFloor() {
            return this.b;
        }

        @Nullable
        public final String getPlacementName() {
            return this.c;
        }

        public int hashCode() {
            LevelPlayAdSize levelPlayAdSize = this.a;
            int hashCode = (levelPlayAdSize == null ? 0 : levelPlayAdSize.hashCode()) * 31;
            Double d = this.b;
            int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
            String str = this.c;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Config(adSize=" + this.a + ", bidFloor=" + this.b + ", placementName=" + this.c + ")";
        }

        public Config(@Nullable LevelPlayAdSize levelPlayAdSize, @Nullable Double d, @Nullable String str) {
            this.a = levelPlayAdSize;
            this.b = d;
            this.c = str;
        }

        public /* synthetic */ Config(LevelPlayAdSize levelPlayAdSize, Double d, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : levelPlayAdSize, (i & 2) != 0 ? null : d, (i & 4) != 0 ? null : str);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final Aa a(String str, Config config) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        W2 a = a(context);
        addView(a);
        return new Aa(C4950w7.a.a(), str, a, config, null, 16, null);
    }

    public final void destroy() {
        this.a.b();
    }

    @NotNull
    public final String getAdId() {
        String uuid = this.a.c().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "bannerViewInternal.adId.toString()");
        return uuid;
    }

    @NotNull
    public final LevelPlayAdSize getAdSize() {
        return this.a.d();
    }

    @NotNull
    public final String getAdUnitId() {
        return this.a.e();
    }

    @Nullable
    public final LevelPlayBannerAdViewListener getBannerListener() {
        return this.a.f();
    }

    @NotNull
    public final String getPlacementName() {
        return this.a.g();
    }

    public final void loadAd() {
        this.a.i();
    }

    public final void pauseAutoRefresh() {
        this.a.j();
    }

    public final void resumeAutoRefresh() {
        this.a.k();
    }

    public final void setBannerListener(@Nullable LevelPlayBannerAdViewListener levelPlayBannerAdViewListener) {
        this.a.a(levelPlayBannerAdViewListener);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ LevelPlayBannerAdView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        IronLog.API.info("context: " + context.getClass().getSimpleName());
        Pair<String, Config> a = Aa.n.a(context, attributeSet);
        this.a = a(a.component1(), a.component2());
    }

    private final W2 a(Context context) {
        W2 w2 = new W2(context);
        w2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return w2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(@NotNull Context context, @NotNull String adUnitId) {
        this(context, adUnitId, Config.Companion.empty());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(@NotNull Context context, @NotNull String adUnitId, @NotNull Config config) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(config, "config");
        IronLog.API.info("adUnitId: " + adUnitId + ", config: " + config + ", context: " + context.getClass().getSimpleName());
        this.a = a(adUnitId, config);
    }
}
