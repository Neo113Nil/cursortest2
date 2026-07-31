package com.smaato.sdk.ng.vpaid;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.smaato.sdk.ng.NextGen;
import com.smaato.sdk.ng.NextGenError;
import com.smaato.sdk.ng.NextGenErrorCode;
import com.smaato.sdk.ng.models.Ad;
import com.smaato.sdk.ng.models.CustomCTAData;
import com.smaato.sdk.ng.models.CustomEndCardDisplay;
import com.smaato.sdk.ng.models.EndCardData;
import com.smaato.sdk.ng.models.IntegrationType;
import com.smaato.sdk.ng.presenter.AdPresenter;
import com.smaato.sdk.ng.utils.AdCustomCTAManager;
import com.smaato.sdk.ng.utils.AdEndCardManager;
import com.smaato.sdk.ng.utils.Logger;
import com.smaato.sdk.ng.utils.NGSDKBitmapDownloader;
import com.smaato.sdk.ng.viewability.NextGenViewabilityNativeVideoAdSession;
import com.smaato.sdk.ng.vpaid.VideoAdController;
import com.smaato.sdk.ng.vpaid.enums.VastError;
import com.smaato.sdk.ng.vpaid.helpers.AssetsLoader;
import com.smaato.sdk.ng.vpaid.helpers.ErrorLog;
import com.smaato.sdk.ng.vpaid.helpers.FileLockManager;
import com.smaato.sdk.ng.vpaid.helpers.SimpleTimer;
import com.smaato.sdk.ng.vpaid.models.vpaid.AdSpotDimensions;
import com.smaato.sdk.ng.vpaid.response.AdParams;
import com.smaato.sdk.ng.vpaid.response.VastProcessor;

/* loaded from: classes4.dex */
abstract class b {
    private static final String w = "b";
    private final Context a;
    private final AssetsLoader b;
    private final String d;
    private final boolean e;
    protected final boolean f;
    private final NextGenViewabilityNativeVideoAdSession g;
    AdPresenter.ImpressionListener h;
    private int i;
    private boolean j;
    private VideoAdListener l;
    private AdCloseButtonListener m;
    private CloseButtonListener n;
    private long o;
    private SimpleTimer p;
    private VideoAdController q;
    private SimpleTimer r;
    private SimpleTimer s;
    private Ad t;
    private VideoAdCacheItem u;
    private String v;
    private final Handler c = new Handler(Looper.getMainLooper());
    private boolean k = false;

    class a implements SimpleTimer.Listener {
        a() {
        }

        @Override // com.smaato.sdk.ng.vpaid.helpers.SimpleTimer.Listener
        public void onFinish() {
            b.this.r();
        }

        @Override // com.smaato.sdk.ng.vpaid.helpers.SimpleTimer.Listener
        public void onTick(long j) {
        }
    }

    /* renamed from: com.smaato.sdk.ng.vpaid.b$b, reason: collision with other inner class name */
    class C1701b implements SimpleTimer.Listener {
        C1701b() {
        }

        @Override // com.smaato.sdk.ng.vpaid.helpers.SimpleTimer.Listener
        public void onFinish() {
            b bVar = b.this;
            bVar.s = null;
            VideoAdController unused = bVar.q;
            bVar.a();
        }

        @Override // com.smaato.sdk.ng.vpaid.helpers.SimpleTimer.Listener
        public void onTick(long j) {
        }
    }

    class c implements SimpleTimer.Listener {
        c() {
        }

        @Override // com.smaato.sdk.ng.vpaid.helpers.SimpleTimer.Listener
        public void onFinish() {
            b.this.a();
            ErrorLog.postError(b.this.i(), VastError.TIMEOUT);
            b.this.a(new PlayerInfo("Ad processing timeout"));
        }

        @Override // com.smaato.sdk.ng.vpaid.helpers.SimpleTimer.Listener
        public void onTick(long j) {
        }
    }

    class d implements VastProcessor.Listener {
        final /* synthetic */ IntegrationType a;

        d(IntegrationType integrationType) {
            this.a = integrationType;
        }

        @Override // com.smaato.sdk.ng.vpaid.response.VastProcessor.Listener
        public void onParseError(PlayerInfo playerInfo) {
            b.this.c(playerInfo);
        }

        @Override // com.smaato.sdk.ng.vpaid.response.VastProcessor.Listener
        public void onParseSuccess(AdParams adParams, String str) {
            b.this.a(adParams, str, this.a);
        }
    }

    class e implements NGSDKBitmapDownloader.DownloadListener {
        final /* synthetic */ CustomCTAData a;
        final /* synthetic */ AdParams b;
        final /* synthetic */ IntegrationType c;

        e(CustomCTAData customCTAData, AdParams adParams, IntegrationType integrationType) {
            this.a = customCTAData;
            this.b = adParams;
            this.c = integrationType;
        }

        @Override // com.smaato.sdk.ng.utils.NGSDKBitmapDownloader.DownloadListener
        public void onDownloadFailed(String str, Exception exc) {
            b.this.a(this.b, this.c, (CustomCTAData) null);
        }

        @Override // com.smaato.sdk.ng.utils.NGSDKBitmapDownloader.DownloadListener
        public void onDownloadFinish(String str, Bitmap bitmap) {
            if (bitmap != null) {
                this.a.setBitmap(bitmap);
            }
            b.this.a(this.b, this.c, this.a);
        }
    }

    class f implements AssetsLoader.OnAssetsLoaded {
        f() {
        }

        @Override // com.smaato.sdk.ng.vpaid.helpers.AssetsLoader.OnAssetsLoaded
        public void onAssetsLoaded(String str, EndCardData endCardData, String str2) {
            b.this.a(str, endCardData, str2);
        }

        @Override // com.smaato.sdk.ng.vpaid.helpers.AssetsLoader.OnAssetsLoaded
        public void onError(PlayerInfo playerInfo) {
            b.this.c(playerInfo);
        }
    }

    b(Context context, Ad ad, boolean z, boolean z2, AdPresenter.ImpressionListener impressionListener, AdCloseButtonListener adCloseButtonListener) throws Exception {
        String vast = ad.getVast();
        if (context == null || TextUtils.isEmpty(vast)) {
            throw new NextGenError(NextGenErrorCode.VAST_PLAYER_ERROR);
        }
        this.t = ad;
        this.i = 200;
        this.a = context;
        this.d = vast;
        this.b = new AssetsLoader();
        this.e = z;
        this.f = z2;
        this.g = new NextGenViewabilityNativeVideoAdSession(NextGen.getViewabilityManager(), isRewarded() ? this.t.getVideoRewardedSkipOffset() : this.t.getVideoSkipOffset());
        this.h = impressionListener;
        this.m = adCloseButtonListener;
    }

    private void A() {
        if (this.p != null) {
            return;
        }
        SimpleTimer simpleTimer = new SimpleTimer(600000L, new a());
        this.p = simpleTimer;
        simpleTimer.start();
        Logger.d(w, "Start schedule expiration");
    }

    private void C() {
        if (this.s != null) {
            return;
        }
        SimpleTimer simpleTimer = new SimpleTimer(15000L, new C1701b());
        this.s = simpleTimer;
        simpleTimer.start();
        Logger.d(w, "Start prepare timer");
    }

    private void F() {
        Logger.d(w, "Stop prepare timer");
        SimpleTimer simpleTimer = this.s;
        if (simpleTimer != null) {
            simpleTimer.cancel();
            this.s = null;
        }
    }

    private VideoAdController.OnPreparedListener c() {
        return new VideoAdController.OnPreparedListener() { // from class: com.smaato.sdk.ng.vpaid.b$$ExternalSyntheticLambda1
            @Override // com.smaato.sdk.ng.vpaid.VideoAdController.OnPreparedListener
            public final void onPrepared() {
                b.this.m();
            }
        };
    }

    private Integer j() {
        return d() != null ? AdCustomCTAManager.getCustomCtaDelay(d()) : AdCustomCTAManager.CUSTOM_CTA_DELAY_DEFAULT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m() {
        if (h() == 202) {
            Logger.d(w, "Creative call unexpected AdLoaded");
        } else {
            F();
            t();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n() {
        C();
        this.q.prepare(c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        Logger.d(w, "Ad content is expired");
        this.p = null;
        this.j = false;
        this.i = 200;
        this.b.breakLoading();
        VideoAdListener videoAdListener = this.l;
        if (videoAdListener != null) {
            videoAdListener.onAdExpired();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        A();
        long currentTimeMillis = System.currentTimeMillis() - this.o;
        String str = w;
        Logger.d(str, "Ad successfully loaded (" + currentTimeMillis + "ms)");
        this.j = true;
        this.i = 200;
        E();
        VideoAdListener videoAdListener = this.l;
        if (videoAdListener != null) {
            videoAdListener.onAdLoadSuccess();
        } else {
            Logger.w(str, "Warning: empty listener");
        }
    }

    private void y() {
        if (this.v != null) {
            FileLockManager.getInstance().release(this.v);
            Logger.d(w, "Released file lock for: " + this.v);
            this.v = null;
        }
    }

    void B() {
        if (this.r != null) {
            return;
        }
        SimpleTimer simpleTimer = new SimpleTimer(180000L, new c());
        this.r = simpleTimer;
        simpleTimer.start();
        Logger.d(w, "Start fetcher timer");
    }

    void D() {
        if (this.p != null) {
            Logger.d(w, "Stop schedule expiration");
            this.p.cancel();
            this.p = null;
        }
    }

    void E() {
        Logger.d(w, "Stop fetcher timer");
        SimpleTimer simpleTimer = this.r;
        if (simpleTimer != null) {
            simpleTimer.cancel();
            this.r = null;
        }
    }

    void a(int i) {
        this.i = i;
    }

    void b(IntegrationType integrationType) {
        VideoAdCacheItem videoAdCacheItem = this.u;
        if (videoAdCacheItem != null) {
            a(videoAdCacheItem.getAdParams(), this.d, integrationType);
        } else {
            a(integrationType);
        }
    }

    Ad d() {
        return this.t;
    }

    abstract void dismiss();

    VideoAdController e() {
        return this.q;
    }

    VideoAdListener f() {
        return this.l;
    }

    abstract AdSpotDimensions g();

    int h() {
        return this.i;
    }

    Context i() {
        return this.a;
    }

    public Boolean isInterstitial() {
        return Boolean.valueOf(this.e);
    }

    boolean isReady() {
        return this.j;
    }

    boolean isRewarded() {
        return this.k;
    }

    protected NextGenViewabilityNativeVideoAdSession k() {
        return this.g;
    }

    void l() {
        this.o = System.currentTimeMillis();
    }

    void o() {
        Logger.d(w, "Ad received click event");
        VideoAdListener videoAdListener = this.l;
        if (videoAdListener != null) {
            videoAdListener.onAdClicked();
        }
    }

    public void onAdFinishedReplaying() {
        Logger.d(w, "onAdFinishedReplaying");
        VideoAdListener videoAdListener = this.l;
        if (videoAdListener != null) {
            videoAdListener.onReplayFinish();
        }
    }

    public void onAdReplaying() {
        Logger.d(w, "onAdReplaying");
        VideoAdListener videoAdListener = this.l;
        if (videoAdListener != null) {
            videoAdListener.onReplay();
        }
    }

    public void onEndCardClosed(Boolean bool) {
        Logger.d(w, "onEndCardClosed");
        VideoAdListener videoAdListener = this.l;
        if (videoAdListener != null) {
            videoAdListener.onEndCardClosed(bool);
        }
    }

    void p() {
        CloseButtonListener closeButtonListener = this.n;
        if (closeButtonListener != null) {
            closeButtonListener.onCloseButtonVisible();
        }
    }

    void q() {
        Logger.d(w, "Video reach end");
        VideoAdListener videoAdListener = this.l;
        if (videoAdListener != null) {
            videoAdListener.onAdDidReachEnd();
        }
    }

    void setAdCloseButtonListener(CloseButtonListener closeButtonListener) {
        this.n = closeButtonListener;
    }

    void setAdListener(VideoAdListener videoAdListener) {
        this.l = videoAdListener;
    }

    void setRewarded(boolean z) {
        this.k = z;
    }

    public void setVideoCacheItem(VideoAdCacheItem videoAdCacheItem) {
        this.u = videoAdCacheItem;
    }

    void t() {
        a(new Runnable() { // from class: com.smaato.sdk.ng.vpaid.b$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                b.this.s();
            }
        });
    }

    void u() {
        Logger.d(w, "onAdSkipped");
        VideoAdListener videoAdListener = this.l;
        if (videoAdListener != null) {
            videoAdListener.onAdSkipped();
        }
    }

    void v() {
        Logger.d(w, "Ad received custom CTA load fail event");
        VideoAdListener videoAdListener = this.l;
        if (videoAdListener != null) {
            videoAdListener.onCustomCTALoadFail();
        }
    }

    void w() {
        Logger.d(w, "Ad received custom CTA show event");
        VideoAdListener videoAdListener = this.l;
        if (videoAdListener != null) {
            videoAdListener.onCustomCTAShow();
        }
    }

    void x() {
        Logger.d(w, "Release ViewControllerVast");
        y();
        VideoAdController videoAdController = this.q;
        if (videoAdController != null) {
            videoAdController.destroy();
            this.q = null;
        }
    }

    void z() {
        this.j = false;
    }

    void a(Runnable runnable) {
        this.c.post(runnable);
    }

    void c(final PlayerInfo playerInfo) {
        a(new Runnable() { // from class: com.smaato.sdk.ng.vpaid.b$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                b.this.a(playerInfo);
            }
        });
    }

    void d(String str) {
        Logger.d(w, "Ad received custom end card impression event");
        VideoAdListener videoAdListener = this.l;
        if (videoAdListener != null) {
            videoAdListener.onDefaultEndCardShow(str);
        }
    }

    void a() {
        Logger.d(w, "Cancel ad fetcher");
        this.b.breakLoading();
        this.c.removeCallbacksAndMessages(null);
    }

    void c(String str) {
        Logger.d(w, "Ad received default end card click event");
        VideoAdListener videoAdListener = this.l;
        if (videoAdListener != null) {
            videoAdListener.onDefaultEndCardClick(str);
        }
    }

    private AssetsLoader.OnAssetsLoaded b() {
        return new f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(PlayerInfo playerInfo) {
        String str = w;
        Logger.d(str, "Ad fails to load: " + playerInfo.getMessage());
        this.i = 200;
        this.j = false;
        E();
        VideoAdListener videoAdListener = this.l;
        if (videoAdListener != null) {
            videoAdListener.onAdLoadFail(playerInfo);
        } else {
            Logger.w(str, "Warning: empty listener");
        }
    }

    void c(Boolean bool) {
        Logger.d(w, "onEndCardSkipped");
        VideoAdListener videoAdListener = this.l;
        if (videoAdListener != null) {
            videoAdListener.onEndCardSkipped(bool);
        }
    }

    private void a(IntegrationType integrationType) {
        new VastProcessor(i(), g()).parseResponse(this.d, new d(integrationType));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AdParams adParams, String str, IntegrationType integrationType) {
        if (adParams.isVpaid()) {
            ErrorLog.postError(i(), VastError.VAST_VERSION_NOT_SUPPORTED);
            a(new PlayerInfo("Unsupported ad format"));
            return;
        }
        CustomCTAData a2 = a(true);
        if (a2 != null && a2.getIconURL() != null) {
            new NGSDKBitmapDownloader().download(a2.getIconURL(), new e(a2, adParams, integrationType));
        } else {
            a(adParams, integrationType, (CustomCTAData) null);
        }
    }

    void b(String str) {
        Logger.d(w, "Ad received custom end card impression event");
        VideoAdListener videoAdListener = this.l;
        if (videoAdListener != null) {
            videoAdListener.onCustomEndCardShow(str);
        }
    }

    void b(boolean z) {
        Logger.d(w, "Ad received custom CTA click event");
        VideoAdListener videoAdListener = this.l;
        if (videoAdListener != null) {
            videoAdListener.onCustomCTACLick(z);
        }
    }

    void b(Boolean bool) {
        Logger.d(w, "EndCard loading success");
        VideoAdListener videoAdListener = this.l;
        if (videoAdListener != null) {
            videoAdListener.onEndCardLoadSuccess(bool);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AdParams adParams, IntegrationType integrationType, CustomCTAData customCTAData) {
        if (customCTAData == null) {
            customCTAData = a(true);
        }
        this.q = new com.smaato.sdk.ng.vpaid.c(this, adParams, k(), this.f, this.h, this.m, customCTAData, j(), integrationType);
        VideoAdCacheItem videoAdCacheItem = this.u;
        if (videoAdCacheItem != null) {
            a(videoAdCacheItem.getVideoFilePath(), this.u.getEndCardData(), this.u.getEndCardFilePath());
        } else {
            this.b.load(adParams, this.a, b());
        }
    }

    private CustomCTAData a(boolean z) {
        if (d() == null || !AdCustomCTAManager.isAbleShow(d()).booleanValue()) {
            return null;
        }
        return d().getCustomCta(i(), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, EndCardData endCardData, String str2) {
        if (this.q == null) {
            c(new PlayerInfo("Error during video loading"));
            ErrorLog.postError(i(), VastError.UNDEFINED);
            Logger.d(w, "VideoAdController == null, after onAssetsLoaded success");
            return;
        }
        this.v = str;
        if (str != null) {
            FileLockManager.getInstance().acquire(str);
            Logger.d(w, "Acquired file lock for playback: " + str);
        }
        this.q.setVideoFilePath(str);
        if (d() != null) {
            EndCardData customEndCard = d().getCustomEndCard();
            if (AdEndCardManager.shouldShowEndcard(d())) {
                this.q.addEndCardData(endCardData);
                if (AdEndCardManager.shouldShowCustomEndcard(d()) && d().getCustomEndCardDisplay().equals(CustomEndCardDisplay.EXTENSION)) {
                    if (a(customEndCard)) {
                        this.q.addEndCardData(customEndCard);
                        this.l.onAdCustomEndCardFound();
                    } else {
                        Logger.d(w, "Custom end card data is null or empty");
                    }
                }
            } else if (AdEndCardManager.shouldShowCustomEndcard(d())) {
                if (a(customEndCard)) {
                    this.q.addEndCardData(customEndCard);
                    this.l.onAdCustomEndCardFound();
                } else {
                    Logger.d(w, "Custom end card data is null or empty");
                }
            }
        }
        this.q.setEndCardFilePath(str2);
        a(new Runnable() { // from class: com.smaato.sdk.ng.vpaid.b$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                b.this.n();
            }
        });
    }

    private boolean a(EndCardData endCardData) {
        return (endCardData == null || endCardData.getContent() == null || endCardData.getContent().isEmpty()) ? false : true;
    }

    void a(String str) {
        Logger.d(w, "Ad received custom end card click event");
        VideoAdListener videoAdListener = this.l;
        if (videoAdListener != null) {
            videoAdListener.onCustomEndCardClick(str);
        }
    }

    void a(Boolean bool) {
        Logger.d(w, "EndCard loading failed");
        VideoAdListener videoAdListener = this.l;
        if (videoAdListener != null) {
            videoAdListener.onEndCardLoadFail(bool);
        }
    }
}
