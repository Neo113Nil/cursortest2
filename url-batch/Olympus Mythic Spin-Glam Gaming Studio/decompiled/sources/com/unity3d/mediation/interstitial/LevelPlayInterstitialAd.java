package com.unity3d.mediation.interstitial;

import android.app.Activity;
import com.ironsource.C4610db;
import com.ironsource.C4641f6;
import com.ironsource.C4814p0;
import com.ironsource.C4950w7;
import com.ironsource.F0;
import com.ironsource.InterfaceC4818p4;
import com.ironsource.Kb;
import com.ironsource.Ya;
import com.ironsource.Z0;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes12.dex */
public final class LevelPlayInterstitialAd {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final String a;

    @NotNull
    private final C4610db b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isPlacementCapped(@NotNull String placementName) {
            Intrinsics.checkNotNullParameter(placementName, "placementName");
            return Ya.o.a(placementName, LevelPlay.AdFormat.INTERSTITIAL);
        }

        private Companion() {
        }
    }

    public static final class Config implements Ya.b {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @Nullable
        private final Double a;

        public static final class Builder {

            @Nullable
            private Double a;

            @NotNull
            public final Config build() {
                return new Config(this.a);
            }

            @NotNull
            public final Builder setBidFloor(double d) {
                this.a = Double.valueOf(d);
                return this;
            }
        }

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @NotNull
            public final Config empty() {
                return new Config(null, 1, 0 == true ? 1 : 0);
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Config() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Config copy$default(Config config, Double d, int i, Object obj) {
            if ((i & 1) != 0) {
                d = config.a;
            }
            return config.copy(d);
        }

        @Nullable
        public final Double component1() {
            return this.a;
        }

        @NotNull
        public final Config copy(@Nullable Double d) {
            return new Config(d);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Config) && Intrinsics.areEqual((Object) this.a, (Object) ((Config) obj).a);
        }

        @Override // com.ironsource.Ya.b
        @Nullable
        public Double getBidFloor() {
            return this.a;
        }

        public int hashCode() {
            Double d = this.a;
            if (d == null) {
                return 0;
            }
            return d.hashCode();
        }

        @NotNull
        public String toString() {
            return "Config(bidFloor=" + this.a + ")";
        }

        public Config(@Nullable Double d) {
            this.a = d;
        }

        public /* synthetic */ Config(Double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : d);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayInterstitialAd(@NotNull String adUnitId) {
        this(adUnitId, Config.Companion.empty());
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
    }

    public static final boolean isPlacementCapped(@NotNull String str) {
        return Companion.isPlacementCapped(str);
    }

    public static /* synthetic */ void showAd$default(LevelPlayInterstitialAd levelPlayInterstitialAd, Activity activity, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        levelPlayInterstitialAd.showAd(activity, str);
    }

    @NotNull
    public final String getAdId() {
        return this.b.b();
    }

    @NotNull
    public final String getAdUnitId() {
        return this.a;
    }

    public final boolean isAdReady() {
        return this.b.c();
    }

    public final void loadAd() {
        this.b.d();
    }

    public final void setListener(@Nullable LevelPlayInterstitialAdListener levelPlayInterstitialAdListener) {
        this.b.a(levelPlayInterstitialAdListener);
    }

    public final void showAd(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        showAd$default(this, activity, null, 2, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayInterstitialAd(@NotNull String adUnitId, @NotNull Config config) {
        this(adUnitId, new Ya.c(new C4814p0(IronSource.a.INTERSTITIAL, F0.b.MEDIATION), new C4641f6(), Kb.u.d(), new InterfaceC4818p4.a(), C4950w7.a, config, new Z0()));
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(config, "config");
    }

    public final void showAd(@NotNull Activity activity, @Nullable String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.b.a(activity, str);
    }

    public LevelPlayInterstitialAd(@NotNull String adUnitId, @NotNull Ya.c payload) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(payload, "payload");
        IronLog.API.info("adUnitId: " + adUnitId + ", config: " + payload.d());
        this.a = adUnitId;
        this.b = new C4610db(adUnitId, payload.d(), payload.b(), payload.a(), payload.g(), payload.e(), payload.f(), payload.c());
    }
}
