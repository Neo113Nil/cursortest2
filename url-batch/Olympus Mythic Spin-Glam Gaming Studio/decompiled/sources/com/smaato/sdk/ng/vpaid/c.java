package com.smaato.sdk.ng.vpaid;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.SmaatoVideoBridge;
import com.safedk.android.utils.Logger;
import com.smaato.sdk.ng.NextGen;
import com.smaato.sdk.ng.analytics.ReportingEvent;
import com.smaato.sdk.ng.models.Ad;
import com.smaato.sdk.ng.models.CustomCTAData;
import com.smaato.sdk.ng.models.EndCardData;
import com.smaato.sdk.ng.models.IntegrationType;
import com.smaato.sdk.ng.presenter.AdPresenter;
import com.smaato.sdk.ng.utils.AdEndCardManager;
import com.smaato.sdk.ng.utils.AdTracker;
import com.smaato.sdk.ng.utils.MediaPlayerErrors;
import com.smaato.sdk.ng.utils.SkipOffsetManager;
import com.smaato.sdk.ng.utils.UrlHandler;
import com.smaato.sdk.ng.viewability.NextGenViewabilityFriendlyObstruction;
import com.smaato.sdk.ng.viewability.NextGenViewabilityNativeVideoAdSession;
import com.smaato.sdk.ng.viewability.baseom.BaseFriendlyObstructionPurpose;
import com.smaato.sdk.ng.vpaid.VideoAdController;
import com.smaato.sdk.ng.vpaid.c;
import com.smaato.sdk.ng.vpaid.enums.VastError;
import com.smaato.sdk.ng.vpaid.helpers.ErrorLog;
import com.smaato.sdk.ng.vpaid.helpers.EventTracker;
import com.smaato.sdk.ng.vpaid.helpers.TimerWithPause;
import com.smaato.sdk.ng.vpaid.macros.MacroHelper;
import com.smaato.sdk.ng.vpaid.models.vast.Tracking;
import com.smaato.sdk.ng.vpaid.models.vpaid.TrackingEvent;
import com.smaato.sdk.ng.vpaid.response.AdParams;
import com.smaato.sdk.ng.vpaid.utils.UrlClickSource;
import com.smaato.sdk.ng.vpaid.utils.Utils;
import com.smaato.sdk.ng.vpaid.vast.ViewControllerVast;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Vector;

/* loaded from: classes14.dex */
class c implements VideoAdController, ReplayListener {
    private static final String Y = "c";
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private Boolean G;
    private boolean H;
    private boolean I;
    private final NextGenViewabilityNativeVideoAdSession J;
    private final List<NextGenViewabilityFriendlyObstruction> K;
    private Boolean L;
    private final Map<h, List<h>> M;
    private final List<h> N;
    private HandlerThread O;
    private Handler P;
    private volatile boolean Q;
    private volatile h R;
    private Boolean S;
    private final MediaPlayer.OnErrorListener T;
    private final MediaPlayer.OnCompletionListener U;
    boolean V;
    Boolean W;
    private final TextureView.SurfaceTextureListener X;
    private final ViewControllerVast c;
    private final AdParams d;
    private final com.smaato.sdk.ng.vpaid.b e;
    private final MacroHelper f;
    private final AdPresenter.ImpressionListener h;
    private final AdTracker i;
    private final IntegrationType j;
    private Boolean k;
    private MediaPlayer l;
    private TimerWithPause m;
    private TimerWithPause n;
    private String o;
    private final List<EndCardData> p;
    private String q;
    private int r;
    private int s;
    private int t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;
    private final boolean a = false;
    private final boolean b = false;
    private final List<TrackingEvent> g = new ArrayList();

    class a extends TimerWithPause {
        final /* synthetic */ boolean h;
        final /* synthetic */ boolean i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j, long j2, boolean z, boolean z2) {
            super(j, j2);
            this.h = z;
            this.i = z2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(long j) {
            c cVar = c.this;
            cVar.c.setSkipProgress((int) j, cVar.r);
        }

        @Override // com.smaato.sdk.ng.vpaid.helpers.TimerWithPause
        public void onFinish() {
            c cVar = c.this;
            final boolean z = this.h;
            final boolean z2 = this.i;
            cVar.b(new Runnable() { // from class: com.smaato.sdk.ng.vpaid.c$a$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    c.a.this.a(z, z2);
                }
            });
        }

        @Override // com.smaato.sdk.ng.vpaid.helpers.TimerWithPause
        public void onTick(final long j) {
            c.this.b(new Runnable() { // from class: com.smaato.sdk.ng.vpaid.c$a$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    c.a.this.a(j);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(boolean z, boolean z2) {
            ViewControllerVast viewControllerVast = c.this.c;
            if (viewControllerVast != null) {
                viewControllerVast.endSkip(Boolean.valueOf(z), Boolean.valueOf(z2));
            }
        }
    }

    class b implements MediaPlayer.OnErrorListener {
        b() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            if (i2 == MediaPlayerErrors.MEDIA_ERROR_SYSTEM || i2 == MediaPlayerErrors.MEDIA_ERROR_SYSTEM_CALLBACK) {
                return false;
            }
            ErrorLog.postError(c.this.e.i(), VastError.MEDIA_FILE_UNSUPPORTED);
            c.this.e.c(new PlayerInfo("Error loading media file"));
            return true;
        }
    }

    /* renamed from: com.smaato.sdk.ng.vpaid.c$c, reason: collision with other inner class name */
    class C1702c extends TimerWithPause {
        final /* synthetic */ int h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1702c(long j, long j2, int i) {
            super(j, j2);
            this.h = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(long j, int i) {
            c.this.c.setProgress((int) j, i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b() {
            ViewControllerVast viewControllerVast = c.this.c;
            if (viewControllerVast != null) {
                viewControllerVast.resetProgress();
            }
            c.this.e();
        }

        @Override // com.smaato.sdk.ng.vpaid.helpers.TimerWithPause
        public void onFinish() {
            c.this.b(new Runnable() { // from class: com.smaato.sdk.ng.vpaid.c$c$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    c.C1702c.this.b();
                }
            });
        }

        @Override // com.smaato.sdk.ng.vpaid.helpers.TimerWithPause
        public void onTick(final long j) {
            c cVar = c.this;
            final int i = this.h;
            cVar.b(new Runnable() { // from class: com.smaato.sdk.ng.vpaid.c$c$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    c.C1702c.this.a(j, i);
                }
            });
            c cVar2 = c.this;
            cVar2.t = this.h - ((int) j);
            if (!cVar2.w && !cVar2.z) {
                cVar2.c();
            }
            c.this.D();
        }
    }

    class d extends TimerWithPause {
        final /* synthetic */ int h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(long j, long j2, int i) {
            super(j, j2);
            this.h = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(long j, int i) {
            c.this.c.setProgress((int) j, i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b() {
            ViewControllerVast viewControllerVast = c.this.c;
            if (viewControllerVast != null) {
                viewControllerVast.showEndcards();
            }
        }

        @Override // com.smaato.sdk.ng.vpaid.helpers.TimerWithPause
        public void onFinish() {
            c.this.b(new Runnable() { // from class: com.smaato.sdk.ng.vpaid.c$d$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    c.d.this.b();
                }
            });
        }

        @Override // com.smaato.sdk.ng.vpaid.helpers.TimerWithPause
        public void onTick(final long j) {
            c cVar = c.this;
            final int i = this.h;
            cVar.b(new Runnable() { // from class: com.smaato.sdk.ng.vpaid.c$d$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    c.d.this.a(j, i);
                }
            });
            c cVar2 = c.this;
            cVar2.t = this.h - ((int) j);
            cVar2.D();
        }
    }

    class e implements MediaPlayer.OnCompletionListener {
        e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            c.this.e();
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            Logger.d("Smaato|SafeDK: Execution> Lcom/smaato/sdk/ng/vpaid/c$e;->onCompletion(Landroid/media/MediaPlayer;)V");
            CreativeInfoManager.onVideoCompleted(com.safedk.android.utils.h.v, mediaPlayer, "media-player");
            safedk_c$e_onCompletion_b815706c64e2ad4659d5b7cb16f89af5(mediaPlayer);
        }

        public void safedk_c$e_onCompletion_b815706c64e2ad4659d5b7cb16f89af5(MediaPlayer p0) {
            c.this.b(new Runnable() { // from class: com.smaato.sdk.ng.vpaid.c$e$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    c.e.this.a();
                }
            });
        }
    }

    class f implements TextureView.SurfaceTextureListener {
        f() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            SmaatoVideoBridge.MediaPlayerSetSurface(c.this.l, new Surface(surfaceTexture));
            if (!c.this.adFinishedPlaying() || c.this.I) {
                c.this.G();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    static /* synthetic */ class g {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[UrlClickSource.values().length];
            a = iArr;
            try {
                iArr[UrlClickSource.VAST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[UrlClickSource.CUSTOM_CTA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[UrlClickSource.DEFAULT_END_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[UrlClickSource.CUSTOM_END_CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private enum h {
        PREPARE,
        PLAY,
        PAUSE,
        RESUME,
        INITIAL
    }

    c(com.smaato.sdk.ng.vpaid.b bVar, AdParams adParams, NextGenViewabilityNativeVideoAdSession nextGenViewabilityNativeVideoAdSession, boolean z, AdPresenter.ImpressionListener impressionListener, AdCloseButtonListener adCloseButtonListener, CustomCTAData customCTAData, Integer num, IntegrationType integrationType) {
        Boolean bool = Boolean.FALSE;
        this.k = bool;
        this.p = new ArrayList();
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.u = false;
        this.v = false;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = false;
        this.A = false;
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = false;
        this.H = false;
        this.I = false;
        this.L = bool;
        this.M = new LinkedHashMap();
        this.N = new Vector();
        this.Q = false;
        this.R = h.INITIAL;
        this.S = bool;
        this.T = new b();
        this.U = new e();
        this.W = null;
        this.X = new f();
        this.e = bVar;
        this.d = adParams;
        this.J = nextGenViewabilityNativeVideoAdSession;
        this.K = new ArrayList();
        this.c = new ViewControllerVast(this, z, a(bVar), b(bVar), c(bVar), adCloseButtonListener, this, customCTAData, num, bVar.d().isBrandAd(), bVar.d().hasHiddenUxControls(), bVar.d().getLearnMoreData());
        this.f = new MacroHelper();
        this.i = new AdTracker(getAdParams().getCompanionCreativeViewEvents(), null);
        if (z) {
            this.u = true;
        }
        this.H = z;
        this.h = impressionListener;
        if (bVar.d().isBrandAd()) {
            this.V = false;
        } else {
            if (isRewarded()) {
                this.V = false;
                if (bVar.d() != null) {
                    this.W = bVar.d().needCloseRewardAfterFinish();
                }
            } else {
                this.V = false;
                if (bVar.d() != null) {
                    this.W = bVar.d().needCloseInterAfterFinish();
                }
            }
            Boolean bool2 = this.W;
            if (bool2 != null) {
                this.V = bool2.booleanValue();
            }
        }
        this.G = AdEndCardManager.getDefaultEndCard();
        this.j = integrationType;
        HandlerThread handlerThread = new HandlerThread("VastActionsProcessor");
        this.O = handlerThread;
        handlerThread.start();
        this.P = new Handler(this.O.getLooper());
    }

    private void A() {
        if (this.l == null) {
            return;
        }
        b(new Runnable() { // from class: com.smaato.sdk.ng.vpaid.c$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                c.this.p();
            }
        });
        SmaatoVideoBridge.MediaPlayerSetSurface(this.l, this.c.getSurface());
        d(this.l.getDuration());
        if (!this.I) {
            b(new Runnable() { // from class: com.smaato.sdk.ng.vpaid.c$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.q();
                }
            });
        }
        com.smaato.sdk.ng.vpaid.b bVar = this.e;
        if (bVar != null && bVar.f() != null) {
            b(new Runnable() { // from class: com.smaato.sdk.ng.vpaid.c$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.r();
                }
            });
        }
        SmaatoVideoBridge.MediaPlayerStart(this.l);
    }

    private void B() throws IOException, IllegalStateException {
        MediaPlayer mediaPlayer = this.l;
        if (mediaPlayer != null) {
            SmaatoVideoBridge.MediaPlayerRelease(mediaPlayer);
        }
        this.l = new MediaPlayer();
        try {
            String str = this.o;
            if (str != null) {
                if (str.isEmpty()) {
                }
                SmaatoVideoBridge.MediaPlayerSetDataSource(this.l, this.o);
                this.l.setOnCompletionListener(this.U);
                this.l.setOnErrorListener(this.T);
                this.l.setLooping(false);
                this.l.prepare();
            }
            this.e.c(new PlayerInfo("Invalid media file uri"));
            SmaatoVideoBridge.MediaPlayerSetDataSource(this.l, this.o);
            this.l.setOnCompletionListener(this.U);
            this.l.setOnErrorListener(this.T);
            this.l.setLooping(false);
            this.l.prepare();
        } catch (IOException e2) {
            e = e2;
            com.smaato.sdk.ng.utils.Logger.e(Y, "startMediaPlayer: " + e.getMessage());
            this.e.c(new PlayerInfo("Error loading media file"));
        } catch (RuntimeException e3) {
            e = e3;
            com.smaato.sdk.ng.utils.Logger.e(Y, "startMediaPlayer: " + e.getMessage());
            this.e.c(new PlayerInfo("Error loading media file"));
        }
    }

    private void C() {
        MediaPlayer mediaPlayer;
        if (!this.y && (mediaPlayer = this.l) != null) {
            SmaatoVideoBridge.MediaPlayerSetSurface(mediaPlayer, this.c.getSurface());
            SmaatoVideoBridge.MediaPlayerStart(this.l);
        }
        if (this.y) {
            E();
        }
        TimerWithPause timerWithPause = this.m;
        if (timerWithPause != null && timerWithPause.isPaused()) {
            this.m.resume();
        }
        TimerWithPause timerWithPause2 = this.n;
        if (timerWithPause2 != null && timerWithPause2.isPaused()) {
            this.n.resume();
        }
        if (this.y || this.x) {
            return;
        }
        a("video_resume");
        b(new Runnable() { // from class: com.smaato.sdk.ng.vpaid.c$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                c.this.s();
            }
        });
        EventTracker.postEventByType(this.e.i(), this.d.getEvents(), "resume", this.f, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        ArrayList arrayList = new ArrayList();
        for (TrackingEvent trackingEvent : this.g) {
            if (this.t > trackingEvent.timeMillis) {
                String str = trackingEvent.name;
                if (str != null && str.equals("start") && !this.w && this.z) {
                    c();
                }
                EventTracker.postEvent(this.e.i(), trackingEvent.url, trackingEvent.name, this.f, false);
                b(trackingEvent.name);
                arrayList.add(trackingEvent);
            }
        }
        this.g.removeAll(arrayList);
    }

    private void E() {
        if (this.l == null) {
            return;
        }
        a(new Runnable() { // from class: com.smaato.sdk.ng.vpaid.c$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                c.this.t();
            }
        });
    }

    private float F() {
        if (getAdParams() != null && getAdParams().getDurationInteger() != null && getAdParams().getDurationInteger().intValue() > 0) {
            return getAdParams().getDurationInteger().intValue();
        }
        int i = this.s;
        if (i > 0) {
            return i / 1000.0f;
        }
        int i2 = this.r;
        if (i2 > 0) {
            return i2 / 1000.0f;
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        if (this.R == h.PAUSE && !this.x) {
            a(h.RESUME);
        } else if (isVideoVisible()) {
            a();
        }
        this.c.resume();
        y();
    }

    private void H() {
        com.smaato.sdk.ng.vpaid.b bVar;
        if (!this.F && (bVar = this.e) != null && bVar.d() != null) {
            new AdTracker(null, null, this.e.d().getBeacons("sdk_event"), null, null).trackSdkEvent(3, null);
            this.F = true;
        }
        if (NextGen.getReportingController() == null || !NextGen.isReportingEnabled().booleanValue()) {
            return;
        }
        ReportingEvent reportingEvent = new ReportingEvent();
        reportingEvent.setEventType("video_replay");
        if (isRewarded()) {
            reportingEvent.setAdFormat("rewarded");
        } else {
            reportingEvent.setAdFormat("fullscreen");
        }
        reportingEvent.setCreativeType("video");
        reportingEvent.setPlatform("android");
        reportingEvent.setSdkVersion(NextGen.getSDKVersionInfo(this.j));
        reportingEvent.setTimestamp(System.currentTimeMillis());
        com.smaato.sdk.ng.vpaid.b bVar2 = this.e;
        if (bVar2 != null && bVar2.d() != null) {
            reportingEvent.setImpId(this.e.d().getSessionId());
            reportingEvent.setCampaignId(this.e.d().getCampaignId());
            reportingEvent.setConfigId(this.e.d().getConfigId());
        }
        NextGen.getReportingController().reportEvent(reportingEvent);
    }

    private void I() {
        EventTracker.postEventByType(this.e.i(), this.d.getEvents(), "rewind", this.f, false);
    }

    private String J() {
        String endCardRedirectUrl = this.d.getEndCardRedirectUrl();
        Iterator<String> it = this.d.getEndCardClicks().iterator();
        while (it.hasNext()) {
            EventTracker.postEvent(this.e.i(), it.next(), "EndcardClick", this.f, false);
        }
        return endCardRedirectUrl;
    }

    private String K() {
        String videoRedirectUrl = this.d.getVideoRedirectUrl();
        Iterator<String> it = this.d.getVideoClicks().iterator();
        while (it.hasNext()) {
            EventTracker.postEvent(this.e.i(), it.next(), "VideoClick", this.f, false);
        }
        return videoRedirectUrl;
    }

    private void L() {
        a(new Runnable() { // from class: com.smaato.sdk.ng.vpaid.c$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                c.this.x();
            }
        });
    }

    private synchronized void a(h hVar) {
        try {
            if (!this.N.isEmpty()) {
                if (!this.N.get(r0.size() - 1).equals(hVar)) {
                }
                if (this.M.isEmpty() && this.M.containsKey(hVar)) {
                    List<h> list = this.M.get(hVar);
                    if (list != null && !list.isEmpty()) {
                        this.N.addAll(list);
                    }
                    this.M.remove(hVar);
                    return;
                }
            }
            this.N.add(hVar);
            if (this.M.isEmpty()) {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void b() {
        this.N.clear();
        this.M.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        b(new Runnable() { // from class: com.smaato.sdk.ng.vpaid.c$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                c.this.j();
            }
        });
        this.w = true;
    }

    private void d(int i) {
        if (this.I) {
            c(i);
            this.x = false;
            return;
        }
        this.s = i;
        this.t = -1;
        e(i);
        b(i);
        a(i);
        this.G = Boolean.valueOf(AdEndCardManager.isEndCardEnabled(this.e.d()).booleanValue() && g().booleanValue());
        this.m = new C1702c(i, 10L, i).create();
        a(this.V, this.G.booleanValue(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void e(int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        com.smaato.sdk.ng.vpaid.b bVar = this.e;
        if (bVar == null || bVar.d() == null) {
            return;
        }
        Integer num = -1;
        AdParams adParams = this.d;
        if (adParams != null) {
            i2 = adParams.getPublisherSkipSeconds();
            if (!TextUtils.isEmpty(this.d.getSkipTime())) {
                if (!this.d.getSkipTime().contains("%")) {
                    Integer parseDuration = Utils.parseDuration(this.d.getSkipTime());
                    if (parseDuration != null) {
                        num = Integer.valueOf(parseDuration.intValue() * 1000);
                        z = true;
                    } else {
                        z = true;
                        num = null;
                    }
                    this.G = Boolean.valueOf(!AdEndCardManager.isEndCardEnabled(this.e.d()).booleanValue() && g().booleanValue());
                    if (isRewarded()) {
                        if (!z || num == null) {
                            this.r = SkipOffsetManager.getVideoSkipOffset(this.e.d().getVideoSkipOffset(), null, num, this.G, Boolean.TRUE).intValue() * 1000;
                        } else {
                            this.r = SkipOffsetManager.getVideoSkipOffset(this.e.d().getVideoSkipOffset(), null, Integer.valueOf(num.intValue() / 1000), this.G, Boolean.TRUE).intValue() * 1000;
                        }
                    } else if (!z || num == null) {
                        this.r = SkipOffsetManager.getVideoSkipOffset(this.e.d().getVideoRewardedSkipOffset(), Integer.valueOf(i2), num, this.G, Boolean.FALSE).intValue() * 1000;
                    } else {
                        this.r = SkipOffsetManager.getVideoSkipOffset(this.e.d().getVideoRewardedSkipOffset(), Integer.valueOf(i2), Integer.valueOf(num.intValue() / 1000), this.G, Boolean.FALSE).intValue() * 1000;
                    }
                    i3 = this.r;
                    if (i3 <= i || ((i4 = i - i3) < 500 && i4 >= 0)) {
                        this.r = -1;
                    }
                    return;
                }
                num = Integer.valueOf((Utils.parsePercent(this.d.getSkipTime()) * i) / 100);
            }
        } else {
            i2 = -1;
        }
        z = false;
        this.G = Boolean.valueOf(!AdEndCardManager.isEndCardEnabled(this.e.d()).booleanValue() && g().booleanValue());
        if (isRewarded()) {
        }
        i3 = this.r;
        if (i3 <= i) {
        }
        this.r = -1;
    }

    private boolean f() {
        return this.e.d().isBrandAd() && this.e.d().hasHiddenUxControls();
    }

    private Boolean g() {
        return Boolean.valueOf(!this.p.isEmpty());
    }

    private boolean h() {
        Ad d2 = this.e.d();
        if (d2 != null) {
            return AdEndCardManager.isEndCardEnabled(d2).booleanValue();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        this.c.showCountdownTimer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        this.h.onImpression();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k() {
        getViewabilityAdSession().fireFirstQuartile();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l() {
        getViewabilityAdSession().fireMidpoint();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m() {
        getViewabilityAdSession().fireThirdQuartile();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n() {
        h remove;
        List<h> remove2;
        while (true) {
            synchronized (this) {
                try {
                    if (this.N.isEmpty()) {
                        this.Q = false;
                        return;
                    } else {
                        remove = this.N.remove(0);
                        this.R = remove;
                    }
                } finally {
                }
            }
            b(remove);
            synchronized (this) {
                try {
                    if (this.M.containsKey(remove) && (remove2 = this.M.remove(remove)) != null && !remove2.isEmpty()) {
                        this.N.addAll(0, remove2);
                    }
                } finally {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o() {
        getViewabilityAdSession().firePause();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p() {
        b(this.c.isMute(), false);
        this.c.adjustLayoutParams(this.l.getVideoWidth(), this.l.getVideoHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q() {
        getViewabilityAdSession().fireImpression();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r() {
        this.e.f().onAdStarted();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s() {
        getViewabilityAdSession().fireResume();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t() {
        try {
            SmaatoVideoBridge.MediaPlayerSetSurface(this.l, this.c.getSurface());
            if (this.v) {
                this.l.seekTo(this.s);
            }
        } catch (IllegalStateException e2) {
            com.smaato.sdk.ng.utils.Logger.e(Y, "mediaPlayer cant recover surface: " + e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u() {
        getViewabilityAdSession().fireSkipped();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v() {
        getViewabilityAdSession().fireComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w() {
        com.smaato.sdk.ng.vpaid.b bVar = this.e;
        if (bVar != null && bVar.isInterstitial().booleanValue() && this.v && this.q == null && this.V && !this.G.booleanValue()) {
            closeSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x() {
        try {
            B();
        } catch (Exception e2) {
            com.smaato.sdk.ng.utils.Logger.e(Y, "mediaPlayer re-init: " + e2.getMessage());
            b(new Runnable() { // from class: com.smaato.sdk.ng.vpaid.c$$ExternalSyntheticLambda22
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.closeSelf();
                }
            });
        }
    }

    private synchronized void y() {
        if (!this.N.isEmpty() && !this.Q) {
            this.Q = true;
            this.P.post(new Runnable() { // from class: com.smaato.sdk.ng.vpaid.c$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.n();
                }
            });
        }
    }

    private void z() {
        TimerWithPause timerWithPause = this.m;
        if (timerWithPause != null) {
            timerWithPause.pause();
        }
        TimerWithPause timerWithPause2 = this.n;
        if (timerWithPause2 != null) {
            timerWithPause2.pause();
        }
        MediaPlayer mediaPlayer = this.l;
        if (mediaPlayer != null) {
            try {
                if (mediaPlayer.isPlaying()) {
                    SmaatoVideoBridge.MediaPlayerPause(this.l);
                    b(new Runnable() { // from class: com.smaato.sdk.ng.vpaid.c$$ExternalSyntheticLambda10
                        @Override // java.lang.Runnable
                        public final void run() {
                            c.this.o();
                        }
                    });
                }
            } catch (IllegalStateException e2) {
                com.smaato.sdk.ng.utils.Logger.e(c.class.getSimpleName(), "Media player is not prepared: " + e2.getMessage());
            }
        }
        if (this.y || this.x) {
            return;
        }
        a("video_pause");
        EventTracker.postEventByType(this.e.i(), this.d.getEvents(), "pause", this.f, false);
    }

    @Override // com.smaato.sdk.ng.vpaid.VideoAdController
    public boolean adFinishedPlaying() {
        return this.v;
    }

    @Override // com.smaato.sdk.ng.vpaid.VideoAdController
    public void addEndCardData(EndCardData endCardData) {
        if (endCardData != null) {
            this.p.add(endCardData);
        }
    }

    @Override // com.smaato.sdk.ng.vpaid.VideoAdController
    public void addViewabilityFriendlyObstruction(View view, BaseFriendlyObstructionPurpose baseFriendlyObstructionPurpose, String str) {
        if (view == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.K.add(new NextGenViewabilityFriendlyObstruction(view, baseFriendlyObstructionPurpose, str));
    }

    @Override // com.smaato.sdk.ng.vpaid.VideoAdController
    public void buildVideoAdView(VideoAdView videoAdView) {
        this.c.buildVideoAdView(videoAdView);
    }

    @Override // com.smaato.sdk.ng.vpaid.VideoAdController
    public void closeEndCard() {
        closeSelf();
    }

    @Override // com.smaato.sdk.ng.vpaid.VideoAdController
    public void closeSelf() {
        EventTracker.postEventByType(this.e.i(), this.d.getEvents(), "close", this.f, true);
        EventTracker.postEventByType(this.e.i(), this.d.getEvents(), "closeLinear", this.f, true);
        this.e.dismiss();
    }

    @Override // com.smaato.sdk.ng.vpaid.VideoAdController
    public void destroy() {
        MediaPlayer mediaPlayer = this.l;
        if (mediaPlayer != null) {
            try {
                SmaatoVideoBridge.MediaPlayerRelease(mediaPlayer);
            } catch (RuntimeException unused) {
                com.smaato.sdk.ng.utils.Logger.e(Y, "Error releasing NextGen video player");
            }
        }
        if (this.R == h.INITIAL) {
            EventTracker.postEventByType(this.e.i(), this.d.getEvents(), "notUsed", this.f, true);
        }
        this.v = true;
        TimerWithPause timerWithPause = this.m;
        if (timerWithPause != null) {
            timerWithPause.pause();
            this.m = null;
        }
        TimerWithPause timerWithPause2 = this.n;
        if (timerWithPause2 != null) {
            timerWithPause2.pause();
            this.n = null;
        }
        this.c.destroy();
        b();
        HandlerThread handlerThread = this.O;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.O = null;
            this.P = null;
        }
    }

    @Override // com.smaato.sdk.ng.vpaid.VideoAdController
    public void dismiss() {
        this.c.dismiss();
    }

    @Override // com.smaato.sdk.ng.vpaid.VideoAdController
    public AdParams getAdParams() {
        return this.d;
    }

    @Override // com.smaato.sdk.ng.vpaid.VideoAdController
    public int getProgress() {
        int i;
        int i2 = this.t;
        if (i2 == -1 || (i = this.s) == -1) {
            return -1;
        }
        return (i2 * 100) / i;
    }

    @Override // com.smaato.sdk.ng.vpaid.VideoAdController
    public NextGenViewabilityNativeVideoAdSession getViewabilityAdSession() {
        return this.J;
    }

    @Override // com.smaato.sdk.ng.vpaid.VideoAdController
    public List<NextGenViewabilityFriendlyObstruction> getViewabilityFriendlyObstructions() {
        return this.K;
    }

    @Override // com.smaato.sdk.ng.vpaid.VideoAdController
    public boolean isRewarded() {
        return this.e.isRewarded();
    }

    @Override // com.smaato.sdk.ng.vpaid.VideoAdController
    public boolean isVideoVisible() {
        return this.u;
    }

    @Override // com.smaato.sdk.ng.vpaid.VideoAdController
    public void onCustomCTAClick(boolean z) {
        com.smaato.sdk.ng.vpaid.b bVar = this.e;
        if (bVar != null) {
            bVar.b(z);
        }
    }

    @Override // com.smaato.sdk.ng.vpaid.VideoAdController
    public void onCustomCTALoadFail() {
        com.smaato.sdk.ng.vpaid.b bVar = this.e;
        if (bVar != null) {
            bVar.v();
        }
    }

    @Override // com.smaato.sdk.ng.vpaid.VideoAdController
    public void onCustomCTAShow() {
        com.smaato.sdk.ng.vpaid.b bVar = this.e;
        if (bVar != null) {
            bVar.w();
        }
    }

    @Override // com.smaato.sdk.ng.vpaid.VideoAdController
    public void onCustomEndCardClick(String str) {
        com.smaato.sdk.ng.vpaid.b bVar = this.e;
        if (bVar != null) {
            bVar.a(str);
        }
    }

    @Override // com.smaato.sdk.ng.vpaid.VideoAdController
    public void onCustomEndCardShow(String str) {
        com.smaato.sdk.ng.vpaid.b bVar = this.e;
        if (bVar != null) {
            bVar.b(str);
        }
    }

    @Override // com.smaato.sdk.ng.vpaid.VideoAdController
    public void onDefaultEndCardClick(String str) {
        com.smaato.sdk.ng.vpaid.b bVar = this.e;
        if (bVar != null) {
            bVar.c(str);
        }
    }

    @Override // com.smaato.sdk.ng.vpaid.VideoAdController
    public void onDefaultEndCardShow(String str) {
        com.smaato.sdk.ng.vpaid.b bVar = this.e;
        if (bVar != null) {
            bVar.d(str);
        }
        if (this.i == null || this.k.booleanValue()) {
            return;
        }
        this.i.trackImpression();
        if (NextGen.getReportingController() != null && NextGen.isReportingEnabled().booleanValue()) {
            ReportingEvent reportingEvent = new ReportingEvent();
            reportingEvent.setEventType("creative_view");
            if (isRewarded()) {
                reportingEvent.setAdFormat("rewarded");
            } else if (this.H) {
                reportingEvent.setAdFormat("fullscreen");
            } else {
                reportingEvent.setAdFormat("banner");
            }
            reportingEvent.setCreativeType("video");
            reportingEvent.setPlatform("android");
            reportingEvent.setSdkVersion(NextGen.getSDKVersionInfo(this.j));
            reportingEvent.setTimestamp(System.currentTimeMillis());
            com.smaato.sdk.ng.vpaid.b bVar2 = this.e;
            if (bVar2 != null && bVar2.d() != null) {
                reportingEvent.setImpId(this.e.d().getSessionId());
                reportingEvent.setCampaignId(this.e.d().getCampaignId());
                reportingEvent.setConfigId(this.e.d().getConfigId());
            }
            NextGen.getReportingController().reportEvent(reportingEvent);
        }
        this.k = Boolean.TRUE;
    }

    @Override // com.smaato.sdk.ng.vpaid.VideoAdController
    public void onEndCardClosed(Boolean bool) {
        com.smaato.sdk.ng.vpaid.b bVar = this.e;
        if (bVar != null) {
            bVar.onEndCardClosed(bool);
        }
    }

    @Override // com.smaato.sdk.ng.vpaid.VideoAdController
    public void onEndCardLoadFail(Boolean bool) {
        com.smaato.sdk.ng.vpaid.b bVar = this.e;
        if (bVar != null) {
            bVar.a(bool);
        }
    }

    @Override // com.smaato.sdk.ng.vpaid.VideoAdController
    public void onEndCardLoadSuccess(Boolean bool) {
        com.smaato.sdk.ng.vpaid.b bVar = this.e;
        if (bVar != null) {
            bVar.b(bool);
        }
    }

    @Override // com.smaato.sdk.ng.vpaid.VideoAdController
    public void onVolumeChanged() {
        b(this.c.isMute(), false);
    }

    @Override // com.smaato.sdk.ng.vpaid.VideoAdController
    public void openUrl(String str, UrlClickSource urlClickSource) {
        String str2;
        String str3;
        if (urlClickSource == null) {
            return;
        }
        int i = g.a[urlClickSource.ordinal()];
        if (i == 1 || i == 2) {
            str = K();
            this.e.o();
        } else if (i == 3) {
            str = J();
            String K = K();
            if (str == null) {
                str = K;
            }
            this.e.o();
        } else if (i == 4) {
            String K2 = K();
            if (str == null) {
                str = K2;
            }
        }
        String str4 = Y;
        com.smaato.sdk.ng.utils.Logger.d(str4, "Handle external url");
        if (!Utils.isOnline(this.e.i())) {
            com.smaato.sdk.ng.utils.Logger.e(str4, "No internet connection");
            return;
        }
        Context i2 = this.e.i();
        c(str);
        if (this.e.d() != null) {
            str2 = this.e.d().getNavigationMode();
            str3 = this.e.d().getLink();
        } else {
            str2 = null;
            str3 = null;
        }
        new UrlHandler(i2).handleUrl(str, str3, str2);
    }

    @Override // com.smaato.sdk.ng.vpaid.VideoAdController
    public void pause() {
        if (this.R == h.INITIAL) {
            a(h.PAUSE, h.PLAY);
        } else {
            a(h.PAUSE);
        }
        this.c.pause();
        y();
    }

    @Override // com.smaato.sdk.ng.vpaid.VideoAdController
    public void pauseEndCardCloseButtonTimer() {
        this.c.pauseEndCardCloseButtonTimer();
    }

    @Override // com.smaato.sdk.ng.vpaid.VideoAdController
    public void playAd() {
        a(h.PREPARE);
        a(h.PLAY);
        y();
    }

    @Override // com.smaato.sdk.ng.vpaid.VideoAdController
    public void prepare(VideoAdController.OnPreparedListener onPreparedListener) {
        onPreparedListener.onPrepared();
    }

    @Override // com.smaato.sdk.ng.vpaid.ReplayListener
    public void replayVast() {
        this.y = false;
        this.e.onAdReplaying();
        ViewControllerVast viewControllerVast = this.c;
        if (viewControllerVast != null) {
            viewControllerVast.recoverGoneCountdownView();
            this.c.hideEndcards();
            this.c.hideSkipButton();
        }
        this.I = true;
        H();
        I();
        playAd();
    }

    @Override // com.smaato.sdk.ng.vpaid.VideoAdController
    public void resume() {
        if (!this.L.booleanValue() || this.l == null) {
            G();
            return;
        }
        ViewControllerVast viewControllerVast = this.c;
        if (viewControllerVast == null || viewControllerVast.getTexture() == null) {
            G();
        } else {
            this.c.getTexture().setSurfaceTextureListener(this.X);
        }
    }

    @Override // com.smaato.sdk.ng.vpaid.VideoAdController
    public void resumeEndCardCloseButtonTimer() {
        this.c.resumeEndCardCloseButtonTimer();
    }

    @Override // com.smaato.sdk.ng.vpaid.VideoAdController
    public void setEndCardFilePath(String str) {
        this.q = str;
    }

    @Override // com.smaato.sdk.ng.vpaid.VideoAdController
    public void setVideoFilePath(String str) {
        this.o = str;
    }

    @Override // com.smaato.sdk.ng.vpaid.VideoAdController
    public void setVideoVisible(boolean z) {
        if (this.u && z) {
            E();
        }
        this.u = z;
    }

    @Override // com.smaato.sdk.ng.vpaid.VideoAdController
    public void setVolume(boolean z) {
        b(z, true);
    }

    @Override // com.smaato.sdk.ng.vpaid.VideoAdController
    public void skipEndCard() {
        EndCardData d2 = d();
        if (d2 == null || !h() || (d2.getType() == EndCardData.Type.STATIC_RESOURCE && TextUtils.isEmpty(this.q))) {
            closeSelf();
            return;
        }
        com.smaato.sdk.ng.vpaid.b bVar = this.e;
        if (bVar != null) {
            bVar.c(this.S);
            ViewControllerVast viewControllerVast = this.c;
            String str = this.q;
            com.smaato.sdk.ng.vpaid.b bVar2 = this.e;
            Objects.requireNonNull(bVar2);
            viewControllerVast.showLastCustomEndCard(d2, str, new c$$ExternalSyntheticLambda3(bVar2));
        }
    }

    @Override // com.smaato.sdk.ng.vpaid.VideoAdController
    public void skipVideo() {
        this.c.hideSkipButton();
        this.c.setTimerVisible(false);
        this.c.hideMuteButton();
        b(true);
        this.x = true;
    }

    @Override // com.smaato.sdk.ng.vpaid.VideoAdController
    public void toggleMute() {
        this.c.muteVideo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Runnable runnable) {
        this.e.a(runnable);
    }

    private void c(int i) {
        this.s = i;
        this.t = -1;
        this.m = new d(i, 10L, i).create();
        a(false, true, true);
    }

    private synchronized void b(h hVar) {
        int ordinal = hVar.ordinal();
        if (ordinal == 0) {
            try {
                B();
            } catch (IOException unused) {
                L();
            }
        } else if (ordinal == 1) {
            A();
        } else if (ordinal == 2) {
            z();
        } else {
            if (ordinal != 3) {
                return;
            }
            C();
        }
    }

    private synchronized void a(h hVar, h hVar2) {
        if (hVar != null && hVar2 != null) {
            if (this.M.containsKey(hVar2) && this.M.get(hVar2) != null) {
                this.M.get(hVar2).add(hVar);
                return;
            }
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(hVar);
        this.M.put(hVar2, linkedList);
    }

    private synchronized void a() {
        List<h> list;
        try {
            if (!this.N.isEmpty()) {
                if (this.N.get(r0.size() - 1) == h.PAUSE) {
                    this.N.remove(r0.size() - 1);
                }
            }
            Map<h, List<h>> map = this.M;
            h hVar = h.PLAY;
            if (!map.containsKey(hVar) || (list = this.M.get(hVar)) == null || list.isEmpty() || !list.get(list.size() - 1).equals(h.PAUSE)) {
                return;
            }
            this.M.get(hVar).remove(list.size() - 1);
        } catch (Throwable th) {
            throw th;
        }
    }

    private void a(final boolean z, final boolean z2, boolean z3) {
        int i = this.r;
        if (i > 0 && this.H) {
            this.n = new a(i, 10L, z, z2).create();
            if (!z3 || this.c == null || f()) {
                return;
            }
            b(new Runnable() { // from class: com.smaato.sdk.ng.vpaid.c$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.i();
                }
            });
            return;
        }
        if (i == 0 && this.H && this.c != null) {
            b(new Runnable() { // from class: com.smaato.sdk.ng.vpaid.c$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.a(z, z2);
                }
            });
        }
    }

    private void b(String str) {
        if (getViewabilityAdSession() == null || TextUtils.isEmpty(str)) {
            return;
        }
        str.getClass();
        switch (str) {
            case "midpoint":
                b(new Runnable() { // from class: com.smaato.sdk.ng.vpaid.c$$ExternalSyntheticLambda17
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.this.l();
                    }
                });
                this.C = a(this.C, "midpoint");
                break;
            case "thirdQuartile":
                b(new Runnable() { // from class: com.smaato.sdk.ng.vpaid.c$$ExternalSyntheticLambda16
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.this.m();
                    }
                });
                this.D = a(this.D, "third_quartile");
                break;
            case "start":
                final float F = F();
                b(new Runnable() { // from class: com.smaato.sdk.ng.vpaid.c$$ExternalSyntheticLambda15
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.this.a(F);
                    }
                });
                this.A = a(this.A, "video_started");
                break;
            case "firstQuartile":
                b(new Runnable() { // from class: com.smaato.sdk.ng.vpaid.c$$ExternalSyntheticLambda14
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.this.k();
                    }
                });
                this.B = a(this.B, "first_quartile");
                break;
        }
    }

    private void c(String str) {
        if (Objects.equals(str, this.d.getVideoRedirectUrl())) {
            EventTracker.postEvent(this.e.i(), str, "ClickThrough", this.f, false);
        } else if (Objects.equals(str, this.d.getEndCardRedirectUrl())) {
            EventTracker.postEvent(this.e.i(), str, "CompanionClickThrough", this.f, false);
        }
    }

    private boolean c(com.smaato.sdk.ng.vpaid.b bVar) {
        if (bVar != null && bVar.d() != null) {
            Boolean isIconSizeReduced = bVar.d().isIconSizeReduced();
            String adExperience = bVar.d().getAdExperience();
            if (adExperience != null && adExperience.equalsIgnoreCase("performance") && isIconSizeReduced != null && isIconSizeReduced.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    private EndCardData d() {
        if (this.p.isEmpty()) {
            return null;
        }
        EndCardData endCardData = this.p.get(0);
        this.p.remove(0);
        return endCardData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.y) {
            return;
        }
        if (this.I) {
            this.e.onAdFinishedReplaying();
        }
        this.c.hideSkipButton();
        this.c.hideMuteButton();
        this.y = true;
        this.c.setTimerVisible(false);
        this.e.q();
        if (!this.E) {
            a("ad_complete");
            this.E = true;
        }
        b(false);
        if (this.x) {
            return;
        }
        EventTracker.postEventByType(this.e.i(), this.d.getEvents(), "complete", this.f, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z, boolean z2) {
        this.c.endSkip(Boolean.valueOf(z), Boolean.valueOf(z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(float f2) {
        getViewabilityAdSession().fireStart(f2, true);
    }

    private boolean a(boolean z, String str) {
        if (z) {
            return z;
        }
        a(str);
        return true;
    }

    private void a(int i) {
        List<String> m;
        m = c$$ExternalSyntheticBackport1.m(new Object[]{"start", "firstQuartile", "midpoint", "thirdQuartile"});
        for (String str : m) {
            Iterator<TrackingEvent> it = this.g.iterator();
            while (true) {
                if (it.hasNext()) {
                    String str2 = it.next().name;
                    if (str2 == null || !str2.equalsIgnoreCase(str)) {
                    }
                } else {
                    this.g.add(a(str, null, i, null));
                    break;
                }
            }
        }
    }

    private void b(int i) {
        this.g.clear();
        AdParams adParams = this.d;
        if (adParams == null) {
            return;
        }
        if (adParams.getImpressions() != null) {
            Iterator<String> it = this.d.getImpressions().iterator();
            while (it.hasNext()) {
                this.g.add(new TrackingEvent(it.next()));
            }
        }
        if (this.d.getEvents() != null) {
            for (Tracking tracking : this.d.getEvents()) {
                TrackingEvent trackingEvent = new TrackingEvent(tracking.getText());
                if (tracking.getEvent().equalsIgnoreCase("creativeView")) {
                    trackingEvent.timeMillis = 0;
                    trackingEvent.name = "creativeView";
                    this.g.add(trackingEvent);
                }
                if (tracking.getEvent().equalsIgnoreCase("start")) {
                    trackingEvent.timeMillis = 0;
                    trackingEvent.name = "start";
                    this.g.add(trackingEvent);
                    this.z = true;
                }
                if (tracking.getEvent().equalsIgnoreCase("firstQuartile")) {
                    trackingEvent.timeMillis = i / 4;
                    trackingEvent.name = "firstQuartile";
                    this.g.add(trackingEvent);
                }
                if (tracking.getEvent().equalsIgnoreCase("midpoint")) {
                    trackingEvent.timeMillis = i / 2;
                    trackingEvent.name = "midpoint";
                    this.g.add(trackingEvent);
                }
                if (tracking.getEvent().equalsIgnoreCase("thirdQuartile")) {
                    trackingEvent.timeMillis = (i * 3) / 4;
                    trackingEvent.name = "thirdQuartile";
                    this.g.add(trackingEvent);
                }
                if (tracking.getEvent().equalsIgnoreCase("progress") && tracking.getOffset() != null) {
                    if (tracking.getOffset().contains("%")) {
                        trackingEvent.timeMillis = (Utils.parsePercent(tracking.getOffset()) * i) / 100;
                    } else {
                        Integer parseDuration = Utils.parseDuration(tracking.getOffset());
                        if (parseDuration != null) {
                            trackingEvent.timeMillis = parseDuration.intValue() * 1000;
                        }
                    }
                    this.g.add(trackingEvent);
                }
            }
        }
    }

    private TrackingEvent a(String str, String str2, int i, String str3) {
        TrackingEvent trackingEvent = new TrackingEvent(str2);
        trackingEvent.name = str;
        if (str.equalsIgnoreCase("start")) {
            trackingEvent.timeMillis = 0;
            trackingEvent.name = "start";
            this.z = true;
        }
        if (str.equalsIgnoreCase("firstQuartile")) {
            trackingEvent.timeMillis = i / 4;
            trackingEvent.name = "firstQuartile";
        }
        if (str.equalsIgnoreCase("midpoint")) {
            trackingEvent.timeMillis = i / 2;
            trackingEvent.name = "midpoint";
        }
        if (str.equalsIgnoreCase("thirdQuartile")) {
            trackingEvent.timeMillis = (i * 3) / 4;
            trackingEvent.name = "thirdQuartile";
        }
        return trackingEvent;
    }

    private void a(Runnable runnable) {
        this.c.postDelayed(runnable, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z) {
        getViewabilityAdSession().fireVolumeChange(z);
    }

    private Integer a(com.smaato.sdk.ng.vpaid.b bVar) {
        if (bVar == null || bVar.d() == null) {
            return null;
        }
        return bVar.d().getEndCardCloseDelay();
    }

    private void a(String str) {
        if (NextGen.getReportingController() == null || !NextGen.isReportingEnabled().booleanValue()) {
            return;
        }
        ReportingEvent reportingEvent = new ReportingEvent();
        reportingEvent.setEventType(str);
        if (isRewarded()) {
            reportingEvent.setAdFormat("rewarded");
        } else if (this.H) {
            reportingEvent.setAdFormat("fullscreen");
        } else {
            reportingEvent.setAdFormat("banner");
        }
        reportingEvent.setCreativeType("video");
        reportingEvent.setPlatform("android");
        reportingEvent.setSdkVersion(NextGen.getSDKVersionInfo(IntegrationType.STANDALONE));
        reportingEvent.setTimestamp(System.currentTimeMillis());
        com.smaato.sdk.ng.vpaid.b bVar = this.e;
        if (bVar != null && bVar.d() != null) {
            reportingEvent.setImpId(this.e.d().getSessionId());
            reportingEvent.setCampaignId(this.e.d().getCampaignId());
            reportingEvent.setConfigId(this.e.d().getConfigId());
        }
        NextGen.getReportingController().reportEvent(reportingEvent);
    }

    private void b(boolean z) {
        if (this.I) {
            this.e.onAdFinishedReplaying();
            this.c.showEndcards();
            pause();
        }
        if (this.v) {
            return;
        }
        this.v = true;
        b();
        if (z) {
            b(new Runnable() { // from class: com.smaato.sdk.ng.vpaid.c$$ExternalSyntheticLambda18
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.u();
                }
            });
            this.e.u();
        } else if (!this.x) {
            b(new Runnable() { // from class: com.smaato.sdk.ng.vpaid.c$$ExternalSyntheticLambda19
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.v();
                }
            });
        }
        MediaPlayer mediaPlayer = this.l;
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            SmaatoVideoBridge.MediaPlayerPause(this.l);
        }
        TimerWithPause timerWithPause = this.m;
        if (timerWithPause != null) {
            timerWithPause.pause();
            this.m = null;
        }
        TimerWithPause timerWithPause2 = this.n;
        if (timerWithPause2 != null) {
            timerWithPause2.pause();
            this.n = null;
        }
        if (z) {
            a("skipped");
            EventTracker.postEventByType(this.e.i(), this.d.getEvents(), "skip", this.f, true);
        }
        if (this.V) {
            this.G = Boolean.FALSE;
            closeSelf();
            return;
        }
        EndCardData d2 = d();
        Boolean valueOf = Boolean.valueOf(true ^ g().booleanValue());
        if (d2 != null && h() && (d2.getType() != EndCardData.Type.STATIC_RESOURCE || !TextUtils.isEmpty(this.q))) {
            this.G = Boolean.TRUE;
            this.S = d2.isCustom();
            com.smaato.sdk.ng.vpaid.b bVar = this.e;
            if (bVar != null) {
                this.c.showEndCard(d2, this.q, valueOf, new c$$ExternalSyntheticLambda3(bVar));
            }
        } else if (z) {
            closeSelf();
        } else {
            com.smaato.sdk.ng.vpaid.b bVar2 = this.e;
            if (bVar2 != null) {
                bVar2.p();
            }
        }
        a(new Runnable() { // from class: com.smaato.sdk.ng.vpaid.c$$ExternalSyntheticLambda20
            @Override // java.lang.Runnable
            public final void run() {
                c.this.w();
            }
        });
    }

    private synchronized void b(final boolean z, boolean z2) {
        if (this.l != null) {
            try {
                b(new Runnable() { // from class: com.smaato.sdk.ng.vpaid.c$$ExternalSyntheticLambda21
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.this.a(z);
                    }
                });
                if (z) {
                    this.l.setVolume(0.0f, 0.0f);
                    if (z2) {
                        a("video_mute");
                        EventTracker.postEventByType(this.e.i(), this.d.getEvents(), "mute", this.f, false);
                    }
                } else {
                    float systemVolume = Utils.getSystemVolume(this.e.i());
                    this.l.setVolume(systemVolume, systemVolume);
                    if (z2) {
                        a("video_unmute");
                        EventTracker.postEventByType(this.e.i(), this.d.getEvents(), "unmute", this.f, false);
                    }
                }
            } catch (RuntimeException e2) {
                NextGen.reportException((Exception) e2);
                com.smaato.sdk.ng.utils.Logger.w(Y, e2.getMessage());
            }
        }
    }

    private Boolean b(com.smaato.sdk.ng.vpaid.b bVar) {
        if (bVar == null || bVar.d() == null) {
            return null;
        }
        return bVar.d().getFullScreenClickability();
    }
}
