package com.ironsource;

import android.content.Context;
import android.os.Handler;
import com.ironsource.R8;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.testSuite.TestSuiteActivity;
import com.unity3d.mediation.banner.LevelPlayBannerAdView;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAd;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAd;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes11.dex */
public final class Mf {

    @NotNull
    private final R8.a a;

    @NotNull
    private final WeakReference<TestSuiteActivity> b;

    @NotNull
    private final Handler c;

    @NotNull
    private final AtomicReference<LevelPlayBannerAdView> d;

    @NotNull
    private final AtomicReference<LevelPlayInterstitialAd> e;

    @NotNull
    private final AtomicReference<LevelPlayRewardedAd> f;

    public Mf(@NotNull TestSuiteActivity activity, @NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.a = Kb.u.a().d();
        this.b = new WeakReference<>(activity);
        this.c = handler;
        this.d = new AtomicReference<>();
        this.e = new AtomicReference<>();
        this.f = new AtomicReference<>();
    }

    public final void a(@NotNull Uf loadAdConfig, @NotNull String description, int i, int i2) {
        Intrinsics.checkNotNullParameter(loadAdConfig, "loadAdConfig");
        Intrinsics.checkNotNullParameter(description, "description");
        a();
        TestSuiteActivity b = b();
        if (b != null) {
            this.a.a(loadAdConfig);
            a(loadAdConfig);
            LevelPlayBannerAdView.Config build = new LevelPlayBannerAdView.Config.Builder().setAdSize(Xf.a.b(description, i, i2)).build();
            AtomicReference<LevelPlayBannerAdView> atomicReference = this.d;
            String b2 = loadAdConfig.b();
            if (b2 == null) {
                b2 = "";
            }
            LevelPlayBannerAdView levelPlayBannerAdView = new LevelPlayBannerAdView(b, b2, build);
            levelPlayBannerAdView.setBannerListener(new Nf());
            levelPlayBannerAdView.pauseAutoRefresh();
            levelPlayBannerAdView.loadAd();
            atomicReference.set(levelPlayBannerAdView);
        }
    }

    public final void b(@NotNull Uf loadAdConfig) {
        Intrinsics.checkNotNullParameter(loadAdConfig, "loadAdConfig");
        this.a.a(loadAdConfig);
        a(loadAdConfig);
        AtomicReference<LevelPlayInterstitialAd> atomicReference = this.e;
        String b = loadAdConfig.b();
        if (b == null) {
            b = "";
        }
        LevelPlayInterstitialAd levelPlayInterstitialAd = new LevelPlayInterstitialAd(b);
        levelPlayInterstitialAd.setListener(new Rf());
        levelPlayInterstitialAd.loadAd();
        atomicReference.set(levelPlayInterstitialAd);
    }

    public final boolean c() {
        LevelPlayInterstitialAd levelPlayInterstitialAd = this.e.get();
        if (levelPlayInterstitialAd != null) {
            return levelPlayInterstitialAd.isAdReady();
        }
        return false;
    }

    public final boolean d() {
        LevelPlayRewardedAd levelPlayRewardedAd = this.f.get();
        if (levelPlayRewardedAd != null) {
            return levelPlayRewardedAd.isAdReady();
        }
        return false;
    }

    public final void e() {
        TestSuiteActivity b = b();
        if (b != null) {
            LevelPlayInterstitialAd levelPlayInterstitialAd = this.e.get();
            Intrinsics.checkNotNullExpressionValue(levelPlayInterstitialAd, "interstitialAdRef.get()");
            LevelPlayInterstitialAd.showAd$default(levelPlayInterstitialAd, b, null, 2, null);
        }
    }

    public final void f() {
        TestSuiteActivity b = b();
        if (b != null) {
            LevelPlayRewardedAd levelPlayRewardedAd = this.f.get();
            Intrinsics.checkNotNullExpressionValue(levelPlayRewardedAd, "rewardedAdRef.get()");
            LevelPlayRewardedAd.showAd$default(levelPlayRewardedAd, b, null, 2, null);
        }
    }

    public final void c(@NotNull Uf loadAdConfig) {
        Intrinsics.checkNotNullParameter(loadAdConfig, "loadAdConfig");
        this.a.a(loadAdConfig);
        a(loadAdConfig);
        AtomicReference<LevelPlayRewardedAd> atomicReference = this.f;
        String b = loadAdConfig.b();
        if (b == null) {
            b = "";
        }
        LevelPlayRewardedAd levelPlayRewardedAd = new LevelPlayRewardedAd(b);
        levelPlayRewardedAd.setListener(new C4561ag());
        levelPlayRewardedAd.loadAd();
        atomicReference.set(levelPlayRewardedAd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(TestSuiteActivity testSuiteActivity, LevelPlayBannerAdView it) {
        Intrinsics.checkNotNullParameter(testSuiteActivity, "$testSuiteActivity");
        Intrinsics.checkNotNullParameter(it, "$it");
        testSuiteActivity.getContainer().removeView(it);
    }

    private final TestSuiteActivity b() {
        return this.b.get();
    }

    public final void a(double d) {
        final LevelPlayBannerAdView levelPlayBannerAdView;
        final TestSuiteActivity b = b();
        if (b == null || (levelPlayBannerAdView = this.d.get()) == null || levelPlayBannerAdView.getParent() != null) {
            return;
        }
        this.c.post(new Runnable() { // from class: com.ironsource.Mf$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                Mf.a(TestSuiteActivity.this, levelPlayBannerAdView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(TestSuiteActivity testSuiteActivity, LevelPlayBannerAdView banner) {
        Intrinsics.checkNotNullParameter(testSuiteActivity, "$testSuiteActivity");
        Intrinsics.checkNotNullParameter(banner, "$banner");
        testSuiteActivity.getContainer().addView(banner, C4597cg.a.a((Context) testSuiteActivity));
    }

    public final void a() {
        final LevelPlayBannerAdView andSet;
        final TestSuiteActivity b = b();
        if (b == null || (andSet = this.d.getAndSet(null)) == null) {
            return;
        }
        andSet.destroy();
        this.c.post(new Runnable() { // from class: com.ironsource.Mf$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Mf.b(TestSuiteActivity.this, andSet);
            }
        });
    }

    private final void a(Uf uf) {
        Unit unit;
        String a = uf.a();
        if (a != null) {
            com.ironsource.mediationsdk.c.b().a(uf.c(), a);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            IronLog.INTERNAL.verbose("applyTestMode: adNetworkName is null");
        }
    }
}
