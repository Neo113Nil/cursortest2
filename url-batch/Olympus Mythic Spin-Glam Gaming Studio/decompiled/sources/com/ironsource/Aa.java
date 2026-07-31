package com.ironsource;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.ironsource.F0;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.mediation.R;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.LevelPlayAdSize;
import com.unity3d.mediation.banner.LevelPlayBannerAdView;
import com.unity3d.mediation.banner.LevelPlayBannerAdViewListener;
import java.util.UUID;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes13.dex */
public final class Aa implements InterfaceC4999z2 {

    @NotNull
    public static final a n = new a(null);

    @NotNull
    private final UUID a;

    @NotNull
    private final String b;

    @NotNull
    private final W2 c;

    @NotNull
    private final LevelPlayBannerAdView.Config d;

    @NotNull
    private final C4814p0 e;

    @NotNull
    private final R8 f;

    @NotNull
    private final LevelPlayAdSize g;

    @Nullable
    private LevelPlayBannerAdViewListener h;

    @NotNull
    private final String i;

    @Nullable
    private C4971xa j;

    @Nullable
    private Boolean k;
    private C4684hd l;
    private boolean m;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Pair<String, LevelPlayBannerAdView.Config> a(@NotNull Context context, @Nullable AttributeSet attributeSet) {
            Intrinsics.checkNotNullParameter(context, "context");
            String str = "";
            if (attributeSet == null) {
                return TuplesKt.to("", LevelPlayBannerAdView.Config.Companion.empty());
            }
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.LevelPlayBannerAdView);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…le.LevelPlayBannerAdView)");
            try {
                LevelPlayBannerAdView.Config.Builder builder = new LevelPlayBannerAdView.Config.Builder();
                if (obtainStyledAttributes.hasValue(R.styleable.LevelPlayBannerAdView_bidFloor)) {
                    builder.setBidFloor(obtainStyledAttributes.getFloat(R.styleable.LevelPlayBannerAdView_bidFloor, -1.0f));
                }
                String string = obtainStyledAttributes.getString(R.styleable.LevelPlayBannerAdView_adSize);
                if (string != null) {
                    builder.setAdSize(LevelPlayAdSize.Companion.createAdSize$mediationsdk_release(string));
                }
                String string2 = obtainStyledAttributes.getString(R.styleable.LevelPlayBannerAdView_adUnitId);
                if (string2 != null) {
                    str = string2;
                }
                Pair<String, LevelPlayBannerAdView.Config> pair = TuplesKt.to(str, builder.build());
                obtainStyledAttributes.recycle();
                return pair;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }

        private a() {
        }
    }

    public Aa(@NotNull UUID adId, @NotNull String adUnitId, @NotNull W2 bannerContainer, @NotNull LevelPlayBannerAdView.Config config, @NotNull C4814p0 adTools) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(bannerContainer, "bannerContainer");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        this.a = adId;
        this.b = adUnitId;
        this.c = bannerContainer;
        this.d = config;
        this.e = adTools;
        this.f = Kb.u.d().A();
        LevelPlayAdSize adSize = config.getAdSize();
        this.g = adSize == null ? LevelPlayAdSize.BANNER : adSize;
        String placementName = config.getPlacementName();
        this.i = placementName == null ? "" : placementName;
        adTools.f().a(new C4777n(IronSource.a.BANNER, adId, adUnitId));
        Double bidFloor = config.getBidFloor();
        if (bidFloor != null) {
            adTools.f().f().a(bidFloor.doubleValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final Aa this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!this$0.m) {
            IronLog.INTERNAL.warning(C4814p0.a(this$0.e, "Banner not loaded", (String) null, 2, (Object) null));
            return;
        }
        if (this$0.j == null) {
            IronLog.INTERNAL.warning(C4814p0.a(this$0.e, "Banner already destroyed", (String) null, 2, (Object) null));
            return;
        }
        C4936vb.a(this$0.e, new Runnable() { // from class: com.ironsource.Aa$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                Aa.b(Aa.this);
            }
        }, 0L, 2, null);
        C4971xa c4971xa = this$0.j;
        if (c4971xa != null) {
            c4971xa.c();
        }
        this$0.j = null;
        this$0.k = null;
        this$0.h = null;
    }

    private final boolean h() {
        if (this.b.length() == 0) {
            String uuid = this.a.toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "adId.toString()");
            a(new LevelPlayAdError(uuid, this.b, LevelPlayAdError.ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED, "Ad unit ID should be specified"));
            return false;
        }
        Va a2 = Kb.u.d().f().a();
        if (a2 != null && a2.a(this.b, LevelPlay.AdFormat.BANNER)) {
            return true;
        }
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this.h;
        if (levelPlayBannerAdViewListener != null) {
            String uuid2 = this.a.toString();
            Intrinsics.checkNotNullExpressionValue(uuid2, "adId.toString()");
            levelPlayBannerAdViewListener.onAdLoadFailed(new LevelPlayAdError(uuid2, this.b, LevelPlayAdError.ERROR_CODE_INVALID_AD_UNIT_ID, "Invalid ad unit id"));
        }
        return false;
    }

    public final void b() {
        IronLog.API.info("LevelPlayBannerAdView.destroyBanner()");
        this.e.c(new Runnable() { // from class: com.ironsource.Aa$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                Aa.a(Aa.this);
            }
        });
    }

    @NotNull
    public final UUID c() {
        return this.a;
    }

    @NotNull
    public final LevelPlayAdSize d() {
        return this.g;
    }

    @NotNull
    public final String e() {
        return this.b;
    }

    @Nullable
    public final LevelPlayBannerAdViewListener f() {
        return this.h;
    }

    @NotNull
    public final String g() {
        return this.i;
    }

    public final void i() {
        IronLog.API.info("LevelPlayBannerAdView.loadAd()");
        if (this.e.a()) {
            this.e.c(new Runnable() { // from class: com.ironsource.Aa$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    Aa.c(Aa.this);
                }
            });
            return;
        }
        String uuid = this.a.toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "adId.toString()");
        a(new LevelPlayAdError(uuid, this.b, LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK, "load must be called after init success callback"));
    }

    public final void j() {
        Unit unit;
        IronLog.API.info("LevelPlayBannerAdView.pauseAutoRefresh()");
        final C4971xa c4971xa = this.j;
        if (c4971xa != null) {
            this.e.c(new Runnable() { // from class: com.ironsource.Aa$$ExternalSyntheticLambda10
                @Override // java.lang.Runnable
                public final void run() {
                    Aa.a(Aa.this, c4971xa);
                }
            });
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.k = Boolean.FALSE;
        }
    }

    public final void k() {
        Unit unit;
        IronLog.API.info("LevelPlayBannerAdView.resumeAutoRefresh()");
        final C4971xa c4971xa = this.j;
        if (c4971xa != null) {
            this.e.c(new Runnable() { // from class: com.ironsource.Aa$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    Aa.b(Aa.this, c4971xa);
                }
            });
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.k = Boolean.TRUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Aa this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.m) {
            IronLog.INTERNAL.warning(C4814p0.a(this$0.e, "Banner load already called", (String) null, 2, (Object) null));
            return;
        }
        this$0.m = true;
        if (this$0.h()) {
            C4971xa a2 = this$0.a();
            this$0.j = a2;
            Boolean bool = this$0.k;
            if (bool != null) {
                if (bool.booleanValue()) {
                    a2.f();
                } else {
                    a2.d();
                }
            }
            a2.b();
        }
    }

    @Override // com.ironsource.InterfaceC4999z2
    public void d(@NotNull final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.d(new Runnable() { // from class: com.ironsource.Aa$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                Aa.a(LevelPlayAdInfo.this, this);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4999z2
    public void e(@NotNull final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.d(new Runnable() { // from class: com.ironsource.Aa$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                Aa.c(LevelPlayAdInfo.this, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Aa this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.c.removeAllViews();
        ViewParent parent = this$0.c.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this$0.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(LevelPlayAdInfo adInfo, Aa this$0) {
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdScreenDismissed() adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdCollapsed(adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(LevelPlayAdInfo adInfo, Aa this$0) {
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdScreenPresented() adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdExpanded(adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Aa this$0, C4971xa it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "$it");
        this$0.e.f().f().c();
        it.f();
    }

    @Override // com.ironsource.InterfaceC4999z2
    public void b(@NotNull final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.d(new Runnable() { // from class: com.ironsource.Aa$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                Aa.b(LevelPlayAdInfo.this, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(LevelPlayAdInfo adInfo, Aa this$0) {
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdDisplayed() adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdDisplayed(adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(LevelPlayAdInfo adInfo, Aa this$0) {
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdLeftApplication() adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLeftApplication(adInfo);
        }
    }

    public final void a(@Nullable final LevelPlayBannerAdViewListener levelPlayBannerAdViewListener) {
        IronLog.API.info("LevelPlayBannerAdView.setBannerListener()");
        this.e.c(new Runnable() { // from class: com.ironsource.Aa$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                Aa.a(Aa.this, levelPlayBannerAdViewListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Aa this$0, LevelPlayBannerAdViewListener levelPlayBannerAdViewListener) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.h = levelPlayBannerAdViewListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Aa this$0, C4971xa it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "$it");
        this$0.e.f().f().b();
        it.d();
    }

    @Override // com.ironsource.InterfaceC4999z2
    public void c(@NotNull final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.d(new Runnable() { // from class: com.ironsource.Aa$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                Aa.d(LevelPlayAdInfo.this, this);
            }
        });
    }

    private final C4971xa a() {
        C4684hd c4684hd;
        this.l = this.e.a(this.i);
        Context context = this.c.getContext();
        if (context instanceof Activity) {
            ContextProvider.getInstance().updateActivity((Activity) context);
        }
        UUID uuid = this.a;
        String str = this.b;
        C4684hd c4684hd2 = this.l;
        C4684hd c4684hd3 = null;
        if (c4684hd2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bannerPlacement");
            c4684hd = null;
        } else {
            c4684hd = c4684hd2;
        }
        J2 j2 = new J2(uuid, str, c4684hd, this.g, null, null, this.f.a(), this.d.getBidFloor(), 48, null);
        this.e.f().a(new D0(this.e, j2, null, 4, null));
        ISBannerSize a2 = this.e.a(j2.i());
        C5002z5 f = this.e.f();
        C4814p0 c4814p0 = this.e;
        C4684hd c4684hd4 = this.l;
        if (c4684hd4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bannerPlacement");
        } else {
            c4684hd3 = c4684hd4;
        }
        f.a(new Y2(c4814p0, a2, c4684hd3.c()));
        return new C4971xa(this, this.e, j2, this.c);
    }

    public /* synthetic */ Aa(UUID uuid, String str, W2 w2, LevelPlayBannerAdView.Config config, C4814p0 c4814p0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C4950w7.a.a() : uuid, str, w2, config, (i & 16) != 0 ? new C4814p0(IronSource.a.BANNER, F0.b.MEDIATION) : c4814p0);
    }

    @Override // com.ironsource.InterfaceC4999z2
    public void a(@NotNull final LevelPlayAdInfo adInfo, final boolean z) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.d(new Runnable() { // from class: com.ironsource.Aa$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                Aa.a(z, adInfo, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(boolean z, LevelPlayAdInfo adInfo, Aa this$0) {
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdLoaded() isReload: " + z + " adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLoaded(adInfo);
        }
    }

    @Override // com.ironsource.InterfaceC4999z2
    public void a(@Nullable final LevelPlayAdError levelPlayAdError) {
        if (levelPlayAdError != null) {
            this.e.d(new Runnable() { // from class: com.ironsource.Aa$$ExternalSyntheticLambda13
                @Override // java.lang.Runnable
                public final void run() {
                    Aa.a(LevelPlayAdError.this, this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayAdError it, Aa this$0) {
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdLoadFailed() error: " + it);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLoadFailed(it);
        }
    }

    @Override // com.ironsource.InterfaceC4999z2
    public void a(@NotNull final LevelPlayAdInfo adInfo, @Nullable final LevelPlayAdError levelPlayAdError) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (levelPlayAdError != null) {
            this.e.d(new Runnable() { // from class: com.ironsource.Aa$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    Aa.a(LevelPlayAdInfo.this, levelPlayAdError, this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayAdInfo adInfo, LevelPlayAdError it, Aa this$0) {
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdDisplayFailed() adInfo " + adInfo + " error: " + it);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdDisplayFailed(adInfo, it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayAdInfo adInfo, Aa this$0) {
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdClicked() adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdClicked(adInfo);
        }
    }

    @Override // com.ironsource.InterfaceC4999z2
    public void a(@NotNull final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.d(new Runnable() { // from class: com.ironsource.Aa$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                Aa.e(LevelPlayAdInfo.this, this);
            }
        });
    }
}
