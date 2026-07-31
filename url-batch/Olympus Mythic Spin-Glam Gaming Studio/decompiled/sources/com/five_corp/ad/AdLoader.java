package com.five_corp.ad;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.five_corp.ad.AdLoader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes14.dex */
public class AdLoader {
    public static final Object l = new Object();
    public static final j m = new j() { // from class: com.five_corp.ad.AdLoader$$ExternalSyntheticLambda9
        @Override // com.five_corp.ad.j
        public final k a(Context context, FiveAdConfig fiveAdConfig, a aVar) {
            return new k(context, fiveAdConfig, aVar);
        }
    };
    public static AdLoader n = null;
    public static HashMap o = null;
    public static HashMap p = null;
    public final Context a;
    public final FiveAdConfig b;
    public final k c;
    public final com.five_corp.ad.internal.soundstate.e d;
    public final com.five_corp.ad.internal.context.d e;
    public final com.five_corp.ad.internal.t f;
    public final com.five_corp.ad.internal.context.r g;
    public final Handler h = new Handler(Looper.getMainLooper());
    public final com.five_corp.ad.internal.adselector.a i;
    public final com.five_corp.ad.internal.hub.global.b j;
    public final com.five_corp.ad.internal.time.a k;

    public interface CollectSignalCallback {
        void onCollect(@NonNull String str);

        void onError(@NonNull FiveAdErrorCode fiveAdErrorCode);
    }

    public interface LoadBannerAdCallback {
        void onError(@NonNull FiveAdErrorCode fiveAdErrorCode);

        void onLoad(@NonNull FiveAdCustomLayout fiveAdCustomLayout);
    }

    public interface LoadInterstitialAdCallback {
        void onError(@NonNull FiveAdErrorCode fiveAdErrorCode);

        void onLoad(@NonNull FiveAdInterstitial fiveAdInterstitial);
    }

    public interface LoadNativeAdCallback {
        void onError(@NonNull FiveAdErrorCode fiveAdErrorCode);

        void onLoad(@NonNull FiveAdNative fiveAdNative);
    }

    public interface LoadRewardAdCallback {
        void onError(@NonNull FiveAdErrorCode fiveAdErrorCode);

        void onLoad(@NonNull FiveAdVideoReward fiveAdVideoReward);
    }

    public AdLoader(Context context, FiveAdConfig fiveAdConfig, k kVar, com.five_corp.ad.internal.soundstate.e eVar, com.five_corp.ad.internal.t tVar, com.five_corp.ad.internal.context.d dVar, com.five_corp.ad.internal.context.r rVar, com.five_corp.ad.internal.adselector.a aVar) {
        this.a = context;
        this.b = fiveAdConfig;
        this.c = kVar;
        this.d = eVar;
        this.e = dVar;
        this.f = tVar;
        this.g = rVar;
        this.i = aVar;
        this.j = kVar.a;
        this.k = kVar.m;
    }

    @Nullable
    private static AdLoader a(@NonNull Context context, @NonNull FiveAdConfig fiveAdConfig, @Nullable a aVar) {
        return a(context, fiveAdConfig, aVar, false);
    }

    @Nullable
    public static AdLoader forConfig(@NonNull Context context, @NonNull FiveAdConfig fiveAdConfig) {
        return a(context, fiveAdConfig, (a) null, false);
    }

    @Nullable
    @Deprecated
    public static AdLoader getAdLoader(@NonNull Context context, @NonNull FiveAdConfig fiveAdConfig) {
        return forConfig(context, fiveAdConfig);
    }

    @NonNull
    public static String getSemanticVersion() {
        return BuildConfig.SEMVER;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void a(final h hVar, final com.five_corp.ad.internal.context.h hVar2) {
        this.h.post(new Runnable() { // from class: com.five_corp.ad.AdLoader$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                AdLoader.this.b(hVar, hVar2);
            }
        });
    }

    @AnyThread
    public void collectSignal(@NonNull AdSlotConfig adSlotConfig, @NonNull final CollectSignalCallback collectSignalCallback) {
        com.five_corp.ad.internal.context.d dVar = this.e;
        dVar.getClass();
        String uuid = UUID.randomUUID().toString();
        String str = dVar.a.appId;
        final com.five_corp.ad.internal.context.g gVar = new com.five_corp.ad.internal.context.g(uuid, adSlotConfig.slotId, adSlotConfig.getMediationInfo());
        com.five_corp.ad.internal.context.r rVar = this.g;
        this.k.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        rVar.a(new com.five_corp.ad.internal.context.q() { // from class: com.five_corp.ad.AdLoader$$ExternalSyntheticLambda5
            @Override // com.five_corp.ad.internal.context.q
            public final void a(com.five_corp.ad.internal.l lVar) {
                AdLoader.this.a(gVar, collectSignalCallback, lVar);
            }
        }, gVar, new com.five_corp.ad.internal.context.p() { // from class: com.five_corp.ad.AdLoader$$ExternalSyntheticLambda4
            @Override // com.five_corp.ad.internal.context.p
            public final void a(com.five_corp.ad.internal.context.s sVar) {
                AdLoader.this.b(collectSignalCallback, sVar);
            }
        }, currentTimeMillis, 1000L);
    }

    public void loadBannerAd(@NonNull AdSlotConfig adSlotConfig, final int i, @NonNull final LoadBannerAdCallback loadBannerAdCallback) {
        com.five_corp.ad.internal.context.d dVar = this.e;
        dVar.getClass();
        String uuid = UUID.randomUUID().toString();
        String str = dVar.a.appId;
        com.five_corp.ad.internal.context.g gVar = new com.five_corp.ad.internal.context.g(uuid, adSlotConfig.slotId, adSlotConfig.getMediationInfo());
        com.five_corp.ad.internal.context.f fVar = com.five_corp.ad.internal.context.f.CUSTOM_LAYOUT;
        h hVar = new h() { // from class: com.five_corp.ad.AdLoader$$ExternalSyntheticLambda22
            @Override // com.five_corp.ad.h
            public final void a(com.five_corp.ad.internal.context.h hVar2) {
                AdLoader.this.b(loadBannerAdCallback, i, hVar2);
            }
        };
        Objects.requireNonNull(loadBannerAdCallback);
        a(gVar, fVar, hVar, new AdLoader$$ExternalSyntheticLambda3(loadBannerAdCallback));
    }

    public void loadInterstitialAd(@NonNull AdSlotConfig adSlotConfig, @NonNull final LoadInterstitialAdCallback loadInterstitialAdCallback) {
        com.five_corp.ad.internal.context.d dVar = this.e;
        dVar.getClass();
        String uuid = UUID.randomUUID().toString();
        String str = dVar.a.appId;
        com.five_corp.ad.internal.context.g gVar = new com.five_corp.ad.internal.context.g(uuid, adSlotConfig.slotId, adSlotConfig.getMediationInfo());
        com.five_corp.ad.internal.context.f fVar = com.five_corp.ad.internal.context.f.INTERSTITIAL;
        h hVar = new h() { // from class: com.five_corp.ad.AdLoader$$ExternalSyntheticLambda17
            @Override // com.five_corp.ad.h
            public final void a(com.five_corp.ad.internal.context.h hVar2) {
                AdLoader.this.b(loadInterstitialAdCallback, hVar2);
            }
        };
        Objects.requireNonNull(loadInterstitialAdCallback);
        a(gVar, fVar, hVar, new AdLoader$$ExternalSyntheticLambda18(loadInterstitialAdCallback));
    }

    public void loadNativeAd(@NonNull AdSlotConfig adSlotConfig, final int i, @NonNull final LoadNativeAdCallback loadNativeAdCallback) {
        com.five_corp.ad.internal.context.d dVar = this.e;
        dVar.getClass();
        String uuid = UUID.randomUUID().toString();
        String str = dVar.a.appId;
        com.five_corp.ad.internal.context.g gVar = new com.five_corp.ad.internal.context.g(uuid, adSlotConfig.slotId, adSlotConfig.getMediationInfo());
        com.five_corp.ad.internal.context.f fVar = com.five_corp.ad.internal.context.f.NATIVE;
        h hVar = new h() { // from class: com.five_corp.ad.AdLoader$$ExternalSyntheticLambda20
            @Override // com.five_corp.ad.h
            public final void a(com.five_corp.ad.internal.context.h hVar2) {
                AdLoader.this.b(loadNativeAdCallback, i, hVar2);
            }
        };
        Objects.requireNonNull(loadNativeAdCallback);
        a(gVar, fVar, hVar, new AdLoader$$ExternalSyntheticLambda13(loadNativeAdCallback));
    }

    public void loadRewardAd(@NonNull AdSlotConfig adSlotConfig, @NonNull final LoadRewardAdCallback loadRewardAdCallback) {
        com.five_corp.ad.internal.context.d dVar = this.e;
        dVar.getClass();
        String uuid = UUID.randomUUID().toString();
        String str = dVar.a.appId;
        com.five_corp.ad.internal.context.g gVar = new com.five_corp.ad.internal.context.g(uuid, adSlotConfig.slotId, adSlotConfig.getMediationInfo());
        com.five_corp.ad.internal.context.f fVar = com.five_corp.ad.internal.context.f.VIDEO_REWARD;
        h hVar = new h() { // from class: com.five_corp.ad.AdLoader$$ExternalSyntheticLambda10
            @Override // com.five_corp.ad.h
            public final void a(com.five_corp.ad.internal.context.h hVar2) {
                AdLoader.this.b(loadRewardAdCallback, hVar2);
            }
        };
        Objects.requireNonNull(loadRewardAdCallback);
        a(gVar, fVar, hVar, new AdLoader$$ExternalSyntheticLambda11(loadRewardAdCallback));
    }

    public boolean registerThirdPartyIdProvider(@NonNull ThirdPartyIdProvider thirdPartyIdProvider) {
        String providerName = thirdPartyIdProvider.getProviderName();
        if (providerName.length() > 16 || !providerName.matches("^[a-z0-9]+(-?[a-z0-9]+)*$")) {
            return false;
        }
        Iterator it = this.j.g.iterator();
        while (it.hasNext()) {
            com.five_corp.ad.internal.j jVar = (com.five_corp.ad.internal.j) it.next();
            synchronized (jVar.e) {
                jVar.h.put(thirdPartyIdProvider.getProviderName(), thirdPartyIdProvider);
                jVar.g = true;
            }
            jVar.d.a(6);
        }
        return true;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void b(final CollectSignalCallback collectSignalCallback, com.five_corp.ad.internal.context.s sVar) {
        final com.five_corp.ad.internal.util.b a = this.f.a(sVar.a, sVar.d, this.d.a());
        if (a.a) {
            this.h.post(new Runnable() { // from class: com.five_corp.ad.AdLoader$$ExternalSyntheticLambda15
                @Override // java.lang.Runnable
                public final void run() {
                    AdLoader.a(AdLoader.CollectSignalCallback.this, a);
                }
            });
        } else {
            a(collectSignalCallback, a.b, sVar.a);
        }
    }

    public final void b(final BidData bidData, final i iVar, final com.five_corp.ad.internal.context.f fVar, final h hVar) {
        com.five_corp.ad.internal.util.b a = com.five_corp.ad.internal.parser.e.a(bidData.bidResponse);
        if (!a.a) {
            b(iVar, a.b, (com.five_corp.ad.internal.ad.a) null, (com.five_corp.ad.internal.context.g) null);
            return;
        }
        final com.five_corp.ad.internal.ad.b bVar = (com.five_corp.ad.internal.ad.b) a.c;
        String str = bVar.b;
        String str2 = this.b.appId;
        final com.five_corp.ad.internal.context.g gVar = new com.five_corp.ad.internal.context.g(str, bVar.a);
        com.five_corp.ad.internal.context.r rVar = this.g;
        this.k.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        rVar.a(new com.five_corp.ad.internal.context.q() { // from class: com.five_corp.ad.AdLoader$$ExternalSyntheticLambda1
            @Override // com.five_corp.ad.internal.context.q
            public final void a(com.five_corp.ad.internal.l lVar) {
                AdLoader.this.a(bVar, gVar, iVar, lVar);
            }
        }, gVar, new com.five_corp.ad.internal.context.p() { // from class: com.five_corp.ad.AdLoader$$ExternalSyntheticLambda0
            @Override // com.five_corp.ad.internal.context.p
            public final void a(com.five_corp.ad.internal.context.s sVar) {
                AdLoader.this.a(bVar, bidData, fVar, hVar, iVar, sVar);
            }
        }, currentTimeMillis, 1000L);
    }

    public void loadBannerAd(@NonNull BidData bidData, final int i, @NonNull final LoadBannerAdCallback loadBannerAdCallback) {
        com.five_corp.ad.internal.context.f fVar = com.five_corp.ad.internal.context.f.CUSTOM_LAYOUT;
        h hVar = new h() { // from class: com.five_corp.ad.AdLoader$$ExternalSyntheticLambda2
            @Override // com.five_corp.ad.h
            public final void a(com.five_corp.ad.internal.context.h hVar2) {
                AdLoader.this.a(loadBannerAdCallback, i, hVar2);
            }
        };
        Objects.requireNonNull(loadBannerAdCallback);
        a(bidData, new AdLoader$$ExternalSyntheticLambda3(loadBannerAdCallback), fVar, hVar);
    }

    public void loadInterstitialAd(@NonNull BidData bidData, @NonNull final LoadInterstitialAdCallback loadInterstitialAdCallback) {
        com.five_corp.ad.internal.context.f fVar = com.five_corp.ad.internal.context.f.INTERSTITIAL;
        h hVar = new h() { // from class: com.five_corp.ad.AdLoader$$ExternalSyntheticLambda19
            @Override // com.five_corp.ad.h
            public final void a(com.five_corp.ad.internal.context.h hVar2) {
                AdLoader.this.a(loadInterstitialAdCallback, hVar2);
            }
        };
        Objects.requireNonNull(loadInterstitialAdCallback);
        a(bidData, new AdLoader$$ExternalSyntheticLambda18(loadInterstitialAdCallback), fVar, hVar);
    }

    public void loadNativeAd(@NonNull BidData bidData, final int i, @NonNull final LoadNativeAdCallback loadNativeAdCallback) {
        com.five_corp.ad.internal.context.f fVar = com.five_corp.ad.internal.context.f.NATIVE;
        h hVar = new h() { // from class: com.five_corp.ad.AdLoader$$ExternalSyntheticLambda12
            @Override // com.five_corp.ad.h
            public final void a(com.five_corp.ad.internal.context.h hVar2) {
                AdLoader.this.a(loadNativeAdCallback, i, hVar2);
            }
        };
        Objects.requireNonNull(loadNativeAdCallback);
        a(bidData, new AdLoader$$ExternalSyntheticLambda13(loadNativeAdCallback), fVar, hVar);
    }

    public void loadRewardAd(@NonNull BidData bidData, @NonNull final LoadRewardAdCallback loadRewardAdCallback) {
        com.five_corp.ad.internal.context.f fVar = com.five_corp.ad.internal.context.f.VIDEO_REWARD;
        h hVar = new h() { // from class: com.five_corp.ad.AdLoader$$ExternalSyntheticLambda21
            @Override // com.five_corp.ad.h
            public final void a(com.five_corp.ad.internal.context.h hVar2) {
                AdLoader.this.a(loadRewardAdCallback, hVar2);
            }
        };
        Objects.requireNonNull(loadRewardAdCallback);
        a(bidData, new AdLoader$$ExternalSyntheticLambda11(loadRewardAdCallback), fVar, hVar);
    }

    @Deprecated
    public void loadBannerAd(@NonNull BidData bidData, @NonNull LoadBannerAdCallback loadBannerAdCallback) {
        loadBannerAd(bidData, 0, loadBannerAdCallback);
    }

    public void loadNativeAd(@NonNull BidData bidData, @NonNull LoadNativeAdCallback loadNativeAdCallback) {
        loadNativeAd(bidData, 0, loadNativeAdCallback);
    }

    @AnyThread
    public void collectSignal(@NonNull String str, @NonNull CollectSignalCallback collectSignalCallback) {
        collectSignal(new AdSlotConfig(str), collectSignalCallback);
    }

    public final void a(final BidData bidData, final i iVar, final com.five_corp.ad.internal.context.f fVar, final h hVar) {
        this.h.post(new Runnable() { // from class: com.five_corp.ad.AdLoader$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                AdLoader.this.b(bidData, iVar, fVar, hVar);
            }
        });
    }

    public final void a(final com.five_corp.ad.internal.ad.a aVar, final String str, final com.five_corp.ad.internal.context.s sVar, final com.five_corp.ad.internal.context.f fVar, final h hVar, final i iVar) {
        this.h.post(new Runnable() { // from class: com.five_corp.ad.AdLoader$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                AdLoader.this.b(aVar, str, sVar, fVar, hVar, iVar);
            }
        });
    }

    public static AdLoader a(Context context, FiveAdConfig fiveAdConfig, a aVar, boolean z) {
        HashMap hashMap;
        Objects.requireNonNull(context);
        Objects.requireNonNull(fiveAdConfig);
        Context applicationContext = context.getApplicationContext();
        if (fiveAdConfig.appId == null) {
            if (Log.isLoggable("com.five_corp.ad.AdLoader", 6)) {
                Log.e("com.five_corp.ad.AdLoader", "FiveAdConfig.appId must be a non-null value. We will raise an error if detect invalid fiveAdConfigs as soon.");
                return null;
            }
            System.err.println("FiveAdConfig.appId must be a non-null value. We will raise an error if detect invalid fiveAdConfigs as soon.");
            return null;
        }
        synchronized (l) {
            try {
                if (fiveAdConfig.isTest) {
                    if (p == null) {
                        p = new HashMap();
                    }
                    hashMap = p;
                } else {
                    if (o == null) {
                        o = new HashMap();
                    }
                    hashMap = o;
                }
                HashMap hashMap2 = hashMap;
                AdLoader adLoader = (AdLoader) hashMap2.get(fiveAdConfig.appId);
                if (adLoader != null) {
                    return adLoader;
                }
                if (n != null && z) {
                    throw new IllegalArgumentException("config should be same as previous one.");
                }
                k a = m.a(context, fiveAdConfig, aVar);
                boolean z2 = a.a().a;
                AdLoader adLoader2 = new AdLoader(applicationContext, fiveAdConfig, a, a.i, a.b, a.e, a.q, a.f);
                hashMap2.put(fiveAdConfig.appId, adLoader2);
                if (n == null) {
                    n = adLoader2;
                }
                if (z2) {
                    adLoader2.j.a(1);
                }
                return adLoader2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void b(final com.five_corp.ad.internal.ad.a aVar, String str, final com.five_corp.ad.internal.context.s sVar, com.five_corp.ad.internal.context.f fVar, final h hVar, final i iVar) {
        this.e.a(aVar, str, sVar, fVar, new com.five_corp.ad.internal.context.b() { // from class: com.five_corp.ad.AdLoader$$ExternalSyntheticLambda23
            @Override // com.five_corp.ad.internal.context.b
            public final void a(com.five_corp.ad.internal.context.h hVar2) {
                AdLoader.this.a(hVar, hVar2);
            }
        }, new com.five_corp.ad.internal.context.c() { // from class: com.five_corp.ad.AdLoader$$ExternalSyntheticLambda24
            @Override // com.five_corp.ad.internal.context.c
            public final void a(com.five_corp.ad.internal.l lVar) {
                AdLoader.this.a(aVar, sVar, iVar, lVar);
            }
        });
    }

    public final /* synthetic */ void b(LoadBannerAdCallback loadBannerAdCallback, int i, com.five_corp.ad.internal.context.h hVar) {
        loadBannerAdCallback.onLoad(new FiveAdCustomLayout(this.a, this.c, hVar, i));
    }

    public final /* synthetic */ void b(LoadInterstitialAdCallback loadInterstitialAdCallback, com.five_corp.ad.internal.context.h hVar) {
        loadInterstitialAdCallback.onLoad(new FiveAdInterstitial(this.a, this.c, hVar));
    }

    public static k a() {
        k kVar;
        synchronized (l) {
            try {
                AdLoader adLoader = n;
                if (adLoader == null) {
                    throw new IllegalStateException("call FiveAd.initialize() first.");
                }
                kVar = adLoader.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return kVar;
    }

    public final /* synthetic */ void b(LoadNativeAdCallback loadNativeAdCallback, int i, com.five_corp.ad.internal.context.h hVar) {
        loadNativeAdCallback.onLoad(new FiveAdNative(this.a, this.c, hVar, i));
    }

    public final /* synthetic */ void b(LoadRewardAdCallback loadRewardAdCallback, com.five_corp.ad.internal.context.h hVar) {
        loadRewardAdCallback.onLoad(new FiveAdVideoReward(this.a, this.c, hVar));
    }

    public static void a(CollectSignalCallback collectSignalCallback, com.five_corp.ad.internal.util.b bVar) {
        collectSignalCallback.onCollect((String) bVar.c);
    }

    public final void b(h hVar, com.five_corp.ad.internal.context.h hVar2) {
        hVar.a(hVar2);
        this.j.a(new com.five_corp.ad.internal.beacon.a(hVar2, 5, new com.five_corp.ad.internal.soundstate.a(1, 1, 1, this.d.a()), 0L, 0.0d));
    }

    public final /* synthetic */ void a(com.five_corp.ad.internal.ad.b bVar, com.five_corp.ad.internal.context.g gVar, i iVar, com.five_corp.ad.internal.l lVar) {
        b(iVar, lVar, bVar.c, gVar);
    }

    public final void b(final i iVar, final com.five_corp.ad.internal.l lVar, final com.five_corp.ad.internal.ad.a aVar, final com.five_corp.ad.internal.context.g gVar) {
        this.h.post(new Runnable() { // from class: com.five_corp.ad.AdLoader$$ExternalSyntheticLambda16
            @Override // java.lang.Runnable
            public final void run() {
                AdLoader.this.a(iVar, lVar, aVar, gVar);
            }
        });
    }

    public final /* synthetic */ void a(com.five_corp.ad.internal.ad.b bVar, BidData bidData, com.five_corp.ad.internal.context.f fVar, h hVar, i iVar, com.five_corp.ad.internal.context.s sVar) {
        a(bVar.c, bidData.watermark, sVar, fVar, hVar, iVar);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void a(final CollectSignalCallback collectSignalCallback, final com.five_corp.ad.internal.l lVar, final com.five_corp.ad.internal.context.g gVar) {
        this.h.post(new Runnable() { // from class: com.five_corp.ad.AdLoader$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                AdLoader.this.a(collectSignalCallback, lVar, gVar);
            }
        });
    }

    public final /* synthetic */ void a(com.five_corp.ad.internal.ad.a aVar, com.five_corp.ad.internal.context.s sVar, i iVar, com.five_corp.ad.internal.l lVar) {
        b(iVar, lVar, aVar, sVar.a);
    }

    public final /* synthetic */ void a(LoadBannerAdCallback loadBannerAdCallback, int i, com.five_corp.ad.internal.context.h hVar) {
        loadBannerAdCallback.onLoad(new FiveAdCustomLayout(this.a, this.c, hVar, i));
    }

    public final /* synthetic */ void a(LoadInterstitialAdCallback loadInterstitialAdCallback, com.five_corp.ad.internal.context.h hVar) {
        loadInterstitialAdCallback.onLoad(new FiveAdInterstitial(this.a, this.c, hVar));
    }

    public final /* synthetic */ void a(LoadNativeAdCallback loadNativeAdCallback, int i, com.five_corp.ad.internal.context.h hVar) {
        loadNativeAdCallback.onLoad(new FiveAdNative(this.a, this.c, hVar, i));
    }

    public final /* synthetic */ void a(LoadRewardAdCallback loadRewardAdCallback, com.five_corp.ad.internal.context.h hVar) {
        loadRewardAdCallback.onLoad(new FiveAdVideoReward(this.a, this.c, hVar));
    }

    public final void a(i iVar, com.five_corp.ad.internal.l lVar, com.five_corp.ad.internal.ad.a aVar, com.five_corp.ad.internal.context.g gVar) {
        iVar.onError(lVar.a.b);
        this.j.b(new com.five_corp.ad.internal.beacon.c(aVar, gVar, lVar, new com.five_corp.ad.internal.soundstate.a(1, 1, 1, this.d.a()), 0L, null, null));
    }

    public final void a(CollectSignalCallback collectSignalCallback, com.five_corp.ad.internal.l lVar, com.five_corp.ad.internal.context.g gVar) {
        collectSignalCallback.onError(lVar.a.b);
        this.j.b(new com.five_corp.ad.internal.beacon.c(null, gVar, lVar, new com.five_corp.ad.internal.soundstate.a(1, 1, 1, this.d.a()), 0L, null, null));
    }

    public final void a(com.five_corp.ad.internal.context.g gVar, com.five_corp.ad.internal.context.f fVar, h hVar, i iVar) {
        com.five_corp.ad.internal.adselector.a aVar = this.i;
        com.five_corp.ad.internal.soundstate.d a = this.d.a();
        Object obj = new Object();
        com.five_corp.ad.internal.soundstate.a aVar2 = new com.five_corp.ad.internal.soundstate.a(1, 1, 1, a);
        new ArrayList();
        synchronized (obj) {
        }
        aVar.a(gVar, fVar, aVar2, new g(this, hVar, iVar));
    }
}
