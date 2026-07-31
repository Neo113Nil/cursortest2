package com.pubmatic.sdk.video.player;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Build;
import android.os.Handler;
import android.os.Trace;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.adjust.sdk.Constants;
import com.ironsource.T3;
import com.pubmatic.sdk.common.POBAdSize;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayHandler;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.log.POBLogConstants;
import com.pubmatic.sdk.common.models.POBDeviceInfo;
import com.pubmatic.sdk.common.network.POBNetworkHandler;
import com.pubmatic.sdk.common.network.POBTrackerHandler;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.common.view.POBOpenStoreButton;
import com.pubmatic.sdk.video.POBVastError;
import com.pubmatic.sdk.video.POBVastErrorHandler;
import com.pubmatic.sdk.video.POBVastPlayerConfig;
import com.pubmatic.sdk.video.POBVideoLogConstants;
import com.pubmatic.sdk.video.R;
import com.pubmatic.sdk.video.player.POBVastHTMLView;
import com.pubmatic.sdk.video.player.POBVideoPlayer;
import com.pubmatic.sdk.video.player.POBVideoPlayerView;
import com.pubmatic.sdk.video.vastmodels.POBCompanion;
import com.pubmatic.sdk.video.vastmodels.POBIcon;
import com.pubmatic.sdk.video.vastmodels.POBLinear;
import com.pubmatic.sdk.video.vastmodels.POBMediaFile;
import com.pubmatic.sdk.video.vastmodels.POBTracking;
import com.pubmatic.sdk.video.vastmodels.POBVast;
import com.pubmatic.sdk.video.vastmodels.POBVastAd;
import com.pubmatic.sdk.video.vastmodels.POBVastCreative;
import com.pubmatic.sdk.video.vastmodels.POBVastCreativeExtension;
import com.pubmatic.sdk.video.vastparser.POBVastParser;
import com.pubmatic.sdk.video.vastparser.POBVastParserListener;
import com.pubmatic.sdk.video.xmlserialiser.POBXMLNodeListener;
import com.pubmatic.sdk.webrendering.POBUIUtil;
import com.pubmatic.sdk.webrendering.ui.POBCustomProductPageView;
import com.pubmatic.sdk.webrendering.ui.POBOnSkipOptionUpdateListener;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class POBVastPlayer extends FrameLayout implements POBVideoPlayerView.POBVideoPlayerListener, POBProgressiveEventListener, POBACTHandling {
    public static final int MEDIA_CONTROL_VISIBILITY_DELAY = 200;
    private final View.OnClickListener A;
    private double B;
    private long C;
    private List D;
    private TextView E;
    private POBVastErrorHandler F;
    private POBDeviceInfo G;
    private POBProgressiveEventHandler H;
    private POBCompanion I;
    private Queue J;
    private POBIconView K;
    private POBOnSkipOptionUpdateListener L;
    private POBEndCardRendering M;
    private String N;
    private boolean O;
    private final POBVastPlayerConfig P;
    private Linearity Q;
    private final MutableContextWrapper R;
    private boolean S;
    private boolean T;
    private boolean U;
    private String V;
    private boolean W;
    private int a;
    private POBVastParserListener a0;
    private Map b;
    private POBNetworkHandler c;
    private POBTrackerHandler d;
    private POBVastPlayerListener e;
    private int f;
    private POBAdSize g;
    private POBVideoPlayer h;
    private TextView i;
    private ImageButton j;
    private POBOpenStoreButton k;
    private POBOpenStoreClickAction l;
    private ImageButton m;
    private POBVastAd n;
    private ImageView o;
    private EndCardSelectionType p;
    private String q;
    private JSONArray r;
    private POBCTAOverlayData s;
    private POBCTAOverlayHandler t;
    private boolean u;
    private boolean v;
    private boolean w;
    private POBVastError x;
    private boolean y;
    private POBMediaFile z;

    public enum EndCardSelectionType {
        DUAL_END_CARD,
        NEAREST_END_CARD
    }

    public enum Linearity {
        LINEAR,
        NON_LINEAR,
        ANY
    }

    public enum POBOpenStoreClickAction {
        DEFAULT,
        PROGRESS,
        COMPLETE
    }

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (POBVastPlayer.this.V != null) {
                POBVastPlayer pOBVastPlayer = POBVastPlayer.this;
                pOBVastPlayer.a(pOBVastPlayer.V);
                POBVastPlayer.this.n();
            }
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (POBVastPlayer.this.e != null) {
                POBVastPlayer.this.e.onClose();
            }
        }
    }

    class c implements Runnable {
        final /* synthetic */ int a;

        c(int i) {
            this.a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (POBVastPlayer.this.j != null && POBVastPlayer.this.i != null && POBVastPlayer.this.O) {
                int i = this.a / 1000;
                if (!POBVastPlayer.this.w) {
                    if (POBVastPlayer.this.B > i) {
                        POBVastPlayer.this.i.setText(String.valueOf(((int) POBVastPlayer.this.B) - i));
                    } else if (POBVastPlayer.this.B != POBVastPlayer.this.C) {
                        POBVastPlayer.this.h();
                        POBVastPlayer.this.w = true;
                        POBVastPlayer.this.i.setVisibility(8);
                        if (!POBVastPlayer.this.u) {
                            POBVastPlayer.this.a(true);
                        }
                    } else {
                        if (POBVastPlayer.this.k != null) {
                            POBVastPlayer.this.k.setVisibility(0);
                        }
                        POBVastPlayer.this.w = true;
                    }
                }
            }
            if (POBVastPlayer.this.H != null) {
                POBVastPlayer.this.H.onProgress(this.a / 1000);
            }
        }
    }

    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int id = view.getId();
            if (id == R.id.pob_learn_more_btn) {
                POBVastPlayer.this.i();
                return;
            }
            if (id == com.pubmatic.sdk.common.R.id.pob_close_btn) {
                if (POBVastPlayer.this.h != null) {
                    if (POBVastPlayer.this.h.getPlayerState() != POBVideoPlayer.VideoPlayerState.ERROR) {
                        if (POBVastPlayer.this.e != null) {
                            POBVastPlayer.this.e.onSkip();
                            return;
                        }
                        return;
                    } else {
                        if (POBVastPlayer.this.e != null) {
                            POBVastPlayer.this.e.onClose();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (id != com.pubmatic.sdk.common.R.id.pob_forward_btn) {
                if (id == com.pubmatic.sdk.common.R.id.pob_open_store_btn) {
                    POBVastPlayer.this.l = POBOpenStoreClickAction.PROGRESS;
                    POBVastPlayer.this.i();
                    return;
                } else {
                    if (id != com.pubmatic.sdk.common.R.id.pob_custom_product_close_btn || POBVastPlayer.this.e == null) {
                        return;
                    }
                    POBVastPlayer.this.e.onClose();
                    return;
                }
            }
            POBVastPlayer.this.p();
            POBVastPlayer.this.r();
            POBVastPlayer.this.o();
            if (POBVastPlayer.this.h != null) {
                POBVastPlayer.this.h.stop();
                POBVastPlayer.this.c();
                if (POBVastPlayer.this.s != null) {
                    POBVastPlayer pOBVastPlayer = POBVastPlayer.this;
                    pOBVastPlayer.b(pOBVastPlayer.s.getEndcardDelay());
                }
            }
        }
    }

    class e implements POBVastParserListener {
        e() {
        }

        @Override // com.pubmatic.sdk.video.vastparser.POBVastParserListener
        public void onFailure(POBVast pOBVast, POBVastError pOBVastError) {
            if (pOBVast == null || pOBVast.getAds() == null || pOBVast.getAds().isEmpty()) {
                POBVastPlayer.this.a((POBVastAd) null, pOBVastError);
            } else {
                POBVastPlayer.this.a(pOBVast.getAds().get(0), pOBVastError);
            }
        }

        @Override // com.pubmatic.sdk.video.vastparser.POBVastParserListener
        public void onSuccess(POBVast pOBVast) {
            if (pOBVast.getAds() == null || pOBVast.getAds().isEmpty()) {
                return;
            }
            POBVastPlayer.this.c(pOBVast.getAds().get(0));
        }
    }

    class f implements POBCTAOverlayHandler.POBCTAOverlayListener {
        f() {
        }

        @Override // com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayHandler.POBCTAOverlayListener
        public void onClick() {
            POBLog.debug("POBVastPlayer", POBLogConstants.MSG_CTA_OVERLAY_CLICKED, new Object[0]);
            POBVastPlayer.this.j();
        }

        @Override // com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayHandler.POBCTAOverlayListener
        public void onDismiss() {
            POBLog.debug("POBVastPlayer", POBLogConstants.MSG_CTA_OVERLAY_DISMISSED, new Object[0]);
            POBVastPlayer.this.k();
        }

        @Override // com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayHandler.POBCTAOverlayListener
        public void onShow() {
            POBLog.debug("POBVastPlayer", POBLogConstants.MSG_CTA_OVERLAY_PRESENTED, new Object[0]);
            POBUIUtil.bringViewsToFront(POBVastPlayer.this.o);
        }
    }

    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (POBVastPlayer.this.e != null) {
                POBVastPlayer.this.e.onDsaInfoIconClick();
            }
        }
    }

    class h implements POBOnSkipOptionUpdateListener {
        h() {
        }

        @Override // com.pubmatic.sdk.webrendering.ui.POBOnSkipOptionUpdateListener
        public void onSkipOptionUpdate(boolean z) {
            POBVastPlayer.this.a(z);
        }
    }

    class i implements POBEndCardViewListener {
        i() {
        }

        @Override // com.pubmatic.sdk.video.player.POBEndCardViewListener
        public void onClick(String str, boolean z) {
            if (POBVastPlayer.this.I != null) {
                List<String> clickTrackers = POBVastPlayer.this.I.getClickTrackers();
                if (clickTrackers == null || clickTrackers.isEmpty()) {
                    POBLog.debug("POBVastPlayer", POBVideoLogConstants.MSG_END_CARD_NO_CLICK_TRACKERS, new Object[0]);
                    POBVastPlayer.this.n();
                } else {
                    POBVastPlayer.this.a(clickTrackers);
                }
            } else {
                POBVastPlayer.this.n();
            }
            if (z) {
                POBVastPlayer.this.t();
            } else {
                POBVastPlayer.this.a(str);
            }
        }

        @Override // com.pubmatic.sdk.video.player.POBEndCardViewListener
        public void onClose() {
            if (POBVastPlayer.this.e != null) {
                POBVastPlayer.this.e.onClose();
            }
        }

        @Override // com.pubmatic.sdk.video.player.POBEndCardViewListener
        public void onEmptyAreaClick() {
            if (POBVastPlayer.this.I == null) {
                POBVastPlayer.this.i();
                return;
            }
            if (POBUtils.isNullOrEmpty(POBVastPlayer.this.I.getClickThroughURL())) {
                POBLog.debug("POBVastPlayer", POBVideoLogConstants.MSG_END_CARD_NO_CLICK_THROUGH_URL, new Object[0]);
                POBVastPlayer pOBVastPlayer = POBVastPlayer.this;
                pOBVastPlayer.b(pOBVastPlayer.n);
            } else {
                POBVastPlayer pOBVastPlayer2 = POBVastPlayer.this;
                pOBVastPlayer2.a(pOBVastPlayer2.I.getClickThroughURL());
            }
            List<String> clickTrackers = POBVastPlayer.this.I.getClickTrackers();
            if (clickTrackers != null && !clickTrackers.isEmpty()) {
                POBVastPlayer.this.a(clickTrackers);
            } else {
                POBLog.debug("POBVastPlayer", POBVideoLogConstants.MSG_END_CARD_NO_CLICK_TRACKERS, new Object[0]);
                POBVastPlayer.this.n();
            }
        }

        @Override // com.pubmatic.sdk.video.player.POBEndCardViewListener
        public void onEndCardWillLeaveApp() {
            POBVastPlayer.this.m();
        }

        @Override // com.pubmatic.sdk.video.player.POBEndCardViewListener
        public void onError(POBVastError pOBVastError) {
            POBVastPlayer pOBVastPlayer = POBVastPlayer.this;
            pOBVastPlayer.a(pOBVastPlayer.n, pOBVastError);
        }

        @Override // com.pubmatic.sdk.video.player.POBEndCardViewListener
        public void onForward() {
            if (!POBVastPlayer.this.s()) {
                POBVastPlayer.this.p();
                POBVastPlayer.this.r();
            }
            if (POBVastPlayer.this.M == null || POBVastPlayer.this.J.isEmpty()) {
                POBVastPlayer.this.x();
                POBUIUtil.bringViewsToFront(POBVastPlayer.this.m, POBVastPlayer.this.o);
            } else {
                POBVastPlayer.this.c();
            }
            if (POBVastPlayer.this.t == null || POBVastPlayer.this.s()) {
                return;
            }
            POBVastPlayer.this.t.show();
        }

        @Override // com.pubmatic.sdk.video.player.POBEndCardViewListener
        public void onLearnMoreClick() {
            POBVastPlayer.this.i();
        }

        @Override // com.pubmatic.sdk.video.player.POBEndCardViewListener
        public void onLoad() {
            POBVastPlayer.this.W = true;
            if (POBVastPlayer.this.I != null) {
                POBVastPlayer pOBVastPlayer = POBVastPlayer.this;
                pOBVastPlayer.a(pOBVastPlayer.I.getTrackingEventUrls(POBVastCreative.POBEventTypes.CREATIVE_VIEW));
            }
        }
    }

    class j implements POBVastHTMLView.b {
        final /* synthetic */ POBIcon a;

        j(POBIcon pOBIcon) {
            this.a = pOBIcon;
        }

        @Override // com.pubmatic.sdk.video.player.POBVastHTMLView.b
        public void a(String str) {
            POBLog.debug("POBVastPlayer", POBVideoLogConstants.MSG_ICON_CLICKED, new Object[0]);
            List<String> clickTrackers = this.a.getClickTrackers();
            if (clickTrackers != null) {
                POBVastPlayer.this.a(clickTrackers);
            }
            POBLog.debug("POBVastPlayer", POBVideoLogConstants.MSG_ICON_OPEN_LANDING_PAGE, str);
            if (POBVastPlayer.this.e != null) {
                POBVastPlayer.this.e.onIndustryIconClick(str);
            }
        }

        @Override // com.pubmatic.sdk.video.player.POBVastHTMLView.b
        public void onError(POBVastError pOBVastError) {
            POBLog.debug("POBVastPlayer", POBVideoLogConstants.MSG_ICON_RENDERING_FAILURE, new Object[0]);
        }

        @Override // com.pubmatic.sdk.video.player.POBVastHTMLView.b
        public void onLoad() {
            POBLog.debug("POBVastPlayer", POBVideoLogConstants.MSG_ICON_LOADED, new Object[0]);
            if (POBVastPlayer.this.K != null) {
                POBVastPlayer pOBVastPlayer = POBVastPlayer.this;
                pOBVastPlayer.b(pOBVastPlayer.K, this.a);
            }
        }
    }

    class k implements Runnable {
        final /* synthetic */ POBIconView a;
        final /* synthetic */ POBIcon b;

        k(POBIconView pOBIconView, POBIcon pOBIcon) {
            this.a = pOBIconView;
            this.b = pOBIcon;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (POBVastPlayer.this.K != null) {
                POBVastPlayer.this.c(this.a, this.b);
                POBUIUtil.bringViewsToFront(POBVastPlayer.this.o);
            }
        }
    }

    class l implements Runnable {
        final /* synthetic */ POBIconView a;

        l(POBIconView pOBIconView) {
            this.a = pOBIconView;
        }

        @Override // java.lang.Runnable
        public void run() {
            POBLog.debug("POBVastPlayer", POBVideoLogConstants.MSG_REMOVING_ICON, new Object[0]);
            POBVastPlayer.this.removeView(this.a);
        }
    }

    protected POBVastPlayer(@NonNull MutableContextWrapper mutableContextWrapper, @NonNull POBVastPlayerConfig pOBVastPlayerConfig) {
        super(mutableContextWrapper);
        this.a = 0;
        this.f = 3;
        this.l = POBOpenStoreClickAction.DEFAULT;
        this.u = false;
        this.v = true;
        this.w = false;
        this.y = true;
        this.A = new d();
        this.J = new LinkedList();
        this.O = true;
        this.Q = Linearity.ANY;
        this.S = false;
        this.W = false;
        this.a0 = new e();
        this.R = mutableContextWrapper;
        POBNetworkHandler networkHandlerWithBackgroundThreadDelivery = POBInstanceProvider.getNetworkHandlerWithBackgroundThreadDelivery();
        this.c = networkHandlerWithBackgroundThreadDelivery;
        POBTrackerHandler trackerHandler = POBInstanceProvider.getTrackerHandler(networkHandlerWithBackgroundThreadDelivery);
        this.d = trackerHandler;
        this.F = new POBVastErrorHandler(trackerHandler);
        this.P = pOBVastPlayerConfig;
        this.D = new ArrayList();
        this.b = Collections.synchronizedMap(new HashMap(4));
    }

    private int a(int i2) {
        return i2 == -1 ? 402 : 405;
    }

    @NonNull
    public static POBVastPlayer createInstance(@NonNull Context context, @NonNull POBVastPlayerConfig pOBVastPlayerConfig) {
        return new POBVastPlayer(new MutableContextWrapper(context.getApplicationContext()), pOBVastPlayerConfig);
    }

    @NonNull
    private Queue<POBCompanion> getCompanions() {
        LinkedList linkedList = new LinkedList();
        POBVastAd pOBVastAd = this.n;
        if (pOBVastAd != null) {
            List<POBCompanion> companions = pOBVastAd.getCompanions();
            if (this.p == EndCardSelectionType.DUAL_END_CARD && companions != null && 2 == companions.size()) {
                linkedList.addAll(companions);
                return linkedList;
            }
            POBCompanion a2 = a(this.n);
            if (a2 != null) {
                linkedList.add(a2);
            }
        }
        return linkedList;
    }

    @NonNull
    private Map<Object, Object> getVASTMacros() {
        this.b.put("[ADCOUNT]", String.valueOf(this.a));
        this.b.put("[CACHEBUSTING]", Integer.valueOf(POBUtils.getRandomNumber(10000000, 99999999)));
        return this.b;
    }

    public void destroy() {
        POBLog.debug("POBVastPlayer", POBVideoLogConstants.MSG_VAST_PLAYER_DESTROY, new Object[0]);
        if (!this.D.contains(POBVastAd.POBVastAdParameter.IMPRESSIONS.name()) && this.D.contains(POBVastCreative.POBEventTypes.LOADED.name())) {
            a(POBVastCreative.POBEventTypes.NOT_USED);
        } else if (this.O) {
            l();
        }
        POBVideoPlayer pOBVideoPlayer = this.h;
        if (pOBVideoPlayer != null) {
            pOBVideoPlayer.destroy();
        }
        q();
        POBEndCardRendering pOBEndCardRendering = this.M;
        if (pOBEndCardRendering != null) {
            pOBEndCardRendering.setListener(null);
        }
        POBIconView pOBIconView = this.K;
        if (pOBIconView != null) {
            pOBIconView.destroy();
            this.K = null;
        }
        removeAllViews();
        this.a = 0;
        this.M = null;
        this.e = null;
        this.a0 = null;
        this.I = null;
        this.x = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.F, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.pubmatic.sdk.video.player.POBACTHandling
    public boolean getACTEnabled() {
        return this.U;
    }

    public boolean getSkipabilityEnabled() {
        return this.O;
    }

    @NonNull
    public POBVastPlayerConfig getVastPlayerConfig() {
        return this.P;
    }

    public float getVideoAspectRatio() {
        POBMediaFile pOBMediaFile = this.z;
        if (pOBMediaFile == null) {
            return 0.0f;
        }
        int width = pOBMediaFile.getWidth();
        int height = this.z.getHeight();
        if (width <= 0 || height <= 0) {
            return 0.0f;
        }
        return width / height;
    }

    @Override // com.pubmatic.sdk.video.player.POBACTHandling
    public void handleDeferredOpenStoreClick() {
        if (this.l == POBOpenStoreClickAction.PROGRESS) {
            POBVideoPlayer pOBVideoPlayer = this.h;
            if (pOBVideoPlayer == null || pOBVideoPlayer.getPlayerState() != POBVideoPlayer.VideoPlayerState.COMPLETE) {
                y();
            } else {
                u();
            }
            this.l = POBOpenStoreClickAction.COMPLETE;
        }
    }

    public void load(@NonNull String str) {
        Trace.beginSection("POB Vast Parsing");
        POBVastParser pOBVastParser = new POBVastParser(this.c, this.f, this.a0);
        pOBVastParser.setWrapperTimeout(this.P.getWrapperUriTimeout());
        pOBVastParser.parse(str);
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayerView.POBVideoPlayerListener
    public void onBufferUpdate(int i2) {
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayerView.POBVideoPlayerListener
    public void onClick() {
        i();
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayerView.POBVideoPlayerListener
    public void onCompletion() {
        POBVastCreative.POBEventTypes pOBEventTypes = POBVastCreative.POBEventTypes.COMPLETE;
        a(pOBEventTypes);
        b(pOBEventTypes);
        POBVastPlayerListener pOBVastPlayerListener = this.e;
        if (pOBVastPlayerListener != null) {
            pOBVastPlayerListener.onPlaybackCompleted(this.C);
        }
        TextView textView = this.i;
        if (textView != null) {
            textView.setVisibility(8);
        }
        if (!this.U || this.l == POBOpenStoreClickAction.COMPLETE) {
            u();
        }
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayerView.POBVideoPlayerListener
    public void onFailure(int i2, @NonNull String str) {
        a(this.n, new POBVastError(a(i2), str));
        POBOpenStoreButton pOBOpenStoreButton = this.k;
        if (pOBOpenStoreButton != null && pOBOpenStoreButton.isShown()) {
            this.k.setVisibility(8);
        }
        ImageButton imageButton = this.j;
        if (imageButton != null) {
            if (imageButton.getId() == com.pubmatic.sdk.common.R.id.pob_forward_btn || !this.j.isShown()) {
                TextView textView = this.i;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                POBUIUtil.updateSkipButtonToCloseButton(this.j);
                this.j.setVisibility(0);
                this.w = true;
                a(true);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayerView.POBVideoPlayerListener
    public void onMute(boolean z) {
        if (z) {
            POBVastCreative.POBEventTypes pOBEventTypes = POBVastCreative.POBEventTypes.MUTE;
            a(pOBEventTypes);
            b(pOBEventTypes);
        } else {
            POBVastCreative.POBEventTypes pOBEventTypes2 = POBVastCreative.POBEventTypes.UNMUTE;
            a(pOBEventTypes2);
            b(pOBEventTypes2);
        }
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayerView.POBVideoPlayerListener
    public void onPause() {
        POBLog.debug("POBVastPlayer", POBVideoLogConstants.MSG_VAST_PLAYER_VIDEO_PLAYER_PAUSED, new Object[0]);
        POBVastCreative.POBEventTypes pOBEventTypes = POBVastCreative.POBEventTypes.PAUSE;
        a(pOBEventTypes);
        b(pOBEventTypes);
    }

    @Override // com.pubmatic.sdk.video.player.POBProgressiveEventListener
    public void onProgressReached(@NonNull Map<POBVastCreative.POBEventTypes, List<String>> map) {
        for (Map.Entry<POBVastCreative.POBEventTypes, List<String>> entry : map.entrySet()) {
            POBVastCreative.POBEventTypes key = entry.getKey();
            POBLog.debug("POBVastPlayer", POBVideoLogConstants.MSG_VAST_PLAYER_EXECUTE_TRACKER_EVENT, key.getValue());
            List<String> value = entry.getValue();
            b(key);
            if (value != null && this.n != null) {
                a(value);
                this.D.add(key.name());
            }
        }
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayerView.POBVideoPlayerListener
    public void onProgressUpdate(int i2) {
        post(new c(i2));
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayerView.POBVideoPlayerListener
    public void onReadyToPlay(@NonNull POBVideoPlayerView pOBVideoPlayerView) {
        Logger.d("PubMatic|SafeDK: Execution> Lcom/pubmatic/sdk/video/player/POBVastPlayer;->onReadyToPlay(Lcom/pubmatic/sdk/video/player/POBVideoPlayerView;)V");
        CreativeInfoManager.onAdReadyToPlay(com.safedk.android.utils.h.F, this, pOBVideoPlayerView);
        safedk_POBVastPlayer_onReadyToPlay_4f2b32bbddb4b239cffa1137b721cd39(pOBVideoPlayerView);
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayerView.POBVideoPlayerListener
    public void onResume() {
        POBLog.debug("POBVastPlayer", POBVideoLogConstants.MSG_VAST_PLAYER_VIDEO_PLAYER_PLAY, new Object[0]);
        POBVastCreative.POBEventTypes pOBEventTypes = POBVastCreative.POBEventTypes.RESUME;
        a(pOBEventTypes);
        b(pOBEventTypes);
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayerView.POBVideoPlayerListener
    public void onStart() {
        Logger.d("PubMatic|SafeDK: Execution> Lcom/pubmatic/sdk/video/player/POBVastPlayer;->onStart()V");
        CreativeInfoManager.onAdStarted(com.safedk.android.utils.h.F, this);
        safedk_POBVastPlayer_onStart_5a75b23c8260057e4a20d83a124f5b6f();
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        if (30 == Build.VERSION.SDK_INT && i2 == 0) {
            bringToFront();
        }
    }

    public void pause() {
        POBVideoPlayer pOBVideoPlayer = this.h;
        if (pOBVideoPlayer == null || pOBVideoPlayer.getPlayerState() != POBVideoPlayer.VideoPlayerState.PLAYING || this.h.getPlayerState() == POBVideoPlayer.VideoPlayerState.STOPPED) {
            return;
        }
        this.h.pause();
    }

    public void play() {
        POBVideoPlayer pOBVideoPlayer = this.h;
        if (pOBVideoPlayer != null) {
            if ((pOBVideoPlayer.getPlayerState() != POBVideoPlayer.VideoPlayerState.PAUSED && this.h.getPlayerState() != POBVideoPlayer.VideoPlayerState.LOADED) || this.h.getPlayerState() == POBVideoPlayer.VideoPlayerState.STOPPED || this.h.getPlayerState() == POBVideoPlayer.VideoPlayerState.COMPLETE) {
                return;
            }
            this.h.play();
        }
    }

    public void safedk_POBVastPlayer_onReadyToPlay_4f2b32bbddb4b239cffa1137b721cd39(POBVideoPlayerView p0) {
        this.a++;
        long mediaDuration = p0.getMediaDuration() / 1000;
        this.C = mediaDuration;
        if (this.O) {
            this.B = POBVastPlayerUtil.getSkipOffset(this.B, this.P, mediaDuration);
            POBLog.debug("POBVastPlayer", "Video skipOffset: " + this.B, new Object[0]);
        }
        POBLog.debug("POBVastPlayer", POBVideoLogConstants.MSG_VAST_PLAYER_SKIP_OFFSET, Long.valueOf(this.C), Double.valueOf(this.B));
        Trace.endSection();
        POBVastPlayerListener pOBVastPlayerListener = this.e;
        if (pOBVastPlayerListener != null) {
            pOBVastPlayerListener.onReadyToPlay(this.n, (float) this.B);
        }
        a(POBVastCreative.POBEventTypes.LOADED);
        a(this.C);
        if (this.v) {
            Queue<POBCompanion> companions = getCompanions();
            this.J = companions;
            if (companions.size() <= 1) {
                this.V = POBVastPlayerUtil.getCustomProductPageClickUrl(this.n, this.q);
            }
        }
    }

    public void safedk_POBVastPlayer_onStart_5a75b23c8260057e4a20d83a124f5b6f() {
        POBCTAOverlayData pOBCTAOverlayData;
        POBLog.debug("POBVastPlayer", POBVideoLogConstants.MSG_VAST_PLAYER_VIDEO_PLAYER_PLAY, new Object[0]);
        b(true);
        POBVastAd.POBVastAdParameter pOBVastAdParameter = POBVastAd.POBVastAdParameter.IMPRESSIONS;
        if (this.n != null) {
            POBLog.debug("POBVastPlayer", POBVideoLogConstants.MSG_VAST_PLAYER_EXECUTE_TRACKER_EVENT, pOBVastAdParameter.getValue());
            a(this.n.getCombinedList(pOBVastAdParameter));
            this.D.add(pOBVastAdParameter.name());
            a(POBVastCreative.POBEventTypes.START);
            if (this.e != null && (this.n.getCreative() instanceof POBLinear)) {
                this.e.onVideoStarted(this.C, this.P.isPlayOnMute() ? 0.0f : 1.0f);
            }
            if (POBVastPlayerConfig.POBVastPlayerUIConfig.canLoadIndustryIcon(this.P.getVastPlayerUIConfig())) {
                v();
            }
            POBCTAOverlayHandler pOBCTAOverlayHandler = this.t;
            if (pOBCTAOverlayHandler == null || (pOBCTAOverlayData = this.s) == null) {
                return;
            }
            pOBCTAOverlayHandler.showWithDelay(pOBCTAOverlayData.getDelay());
        }
    }

    @Override // com.pubmatic.sdk.video.player.POBACTHandling
    public void setACTEnabled(boolean z) {
        this.U = z;
    }

    public void setAdomains(@NonNull JSONArray jSONArray) {
        this.r = jSONArray;
    }

    public void setAutoPlayOnForeground(boolean z) {
        POBVideoPlayer pOBVideoPlayer = this.h;
        if (pOBVideoPlayer != null) {
            pOBVideoPlayer.setAutoPlayOnForeground(z);
        }
    }

    public void setBaseContext(@NonNull Context context) {
        this.R.setBaseContext(context);
    }

    public void setBidBundleId(@Nullable String str) {
        this.q = str;
    }

    public void setCTAOverlayData(@Nullable POBCTAOverlayData pOBCTAOverlayData) {
        this.s = pOBCTAOverlayData;
    }

    public void setDeviceInfo(@NonNull POBDeviceInfo pOBDeviceInfo) {
        this.G = pOBDeviceInfo;
    }

    public void setEnableLearnMoreButton(boolean z) {
        this.y = z;
    }

    public void setEndCardEnabled(boolean z) {
        this.v = z;
    }

    public void setEndCardSelectionType(@Nullable EndCardSelectionType endCardSelectionType) {
        this.p = endCardSelectionType;
    }

    public void setEndCardSize(@Nullable POBAdSize pOBAdSize) {
        this.g = pOBAdSize;
    }

    public void setFSCEnabled(boolean z) {
        this.T = z;
    }

    public void setLinearity(Linearity linearity) {
        this.Q = linearity;
    }

    public void setMaxWrapperThreshold(int i2) {
        this.f = i2;
    }

    public void setOnSkipOptionUpdateListener(@Nullable POBOnSkipOptionUpdateListener pOBOnSkipOptionUpdateListener) {
        this.L = pOBOnSkipOptionUpdateListener;
    }

    public void setPlacementType(@NonNull String str) {
        this.N = str;
        this.S = "interstitial".equals(str);
    }

    public void setShowEndCardOnSkip(boolean z) {
        this.u = z;
    }

    public void setSkipabilityEnabled(boolean z) {
        this.O = z;
    }

    public void setVastPlayerListener(@Nullable POBVastPlayerListener pOBVastPlayerListener) {
        this.e = pOBVastPlayerListener;
    }

    public void setWatermark(@Nullable String str) {
        if (str != null) {
            this.o = POBUIUtil.createWatermarkView(this.R, str);
        }
    }

    private void d() {
        TextView createSkipDurationTextView = POBUIUtil.createSkipDurationTextView(getContext(), com.pubmatic.sdk.webrendering.R.id.pob_skip_duration_timer);
        this.i = createSkipDurationTextView;
        addView(createSkipDurationTextView, POBUIUtil.getLayoutParamsForTopRightPosition(getContext()));
    }

    private void e() {
        if (this.O) {
            d();
            a();
        }
    }

    private void f() {
        ImageView imageView = this.o;
        if (imageView != null) {
            addView(imageView);
        }
    }

    private void g() {
        POBVastAd pOBVastAd;
        POBCTAOverlayData pOBCTAOverlayData = this.s;
        if (pOBCTAOverlayData != null) {
            if (POBUtils.isNullOrEmpty(pOBCTAOverlayData.getClickUrl()) && (pOBVastAd = this.n) != null && pOBVastAd.getClosestClickThroughURL() != null) {
                this.s = POBCTAOverlayData.copyClickUrl(this.s, this.n.getClosestClickThroughURL());
            }
            if (POBCTAOverlayHandler.isCTAOverlayValid(this.s)) {
                POBCTAOverlayHandler pOBCTAOverlayHandler = new POBCTAOverlayHandler(this, this.s, !this.S);
                this.t = pOBCTAOverlayHandler;
                pOBCTAOverlayHandler.setCTAOverlayListener(new f());
                return;
            }
        }
        POBLog.debug("POBVastPlayer", POBLogConstants.MSG_CTA_OVERLAY_FAILED, "CTA overlay data invalid");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        POBOpenStoreButton pOBOpenStoreButton = this.k;
        if (pOBOpenStoreButton != null) {
            pOBOpenStoreButton.setVisibility(0);
            return;
        }
        ImageButton imageButton = this.j;
        if (imageButton != null) {
            imageButton.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        b(this.n);
        n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        POBCTAOverlayData pOBCTAOverlayData = this.s;
        if (pOBCTAOverlayData != null && pOBCTAOverlayData.getClickTrackers() != null && !this.s.getClickTrackers().isEmpty()) {
            a(this.s.getClickTrackers());
        }
        n();
        POBCTAOverlayData pOBCTAOverlayData2 = this.s;
        String clickUrl = pOBCTAOverlayData2 != null ? pOBCTAOverlayData2.getClickUrl() : null;
        if (POBUtils.isNullOrEmpty(clickUrl)) {
            return;
        }
        a(clickUrl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        POBCTAOverlayHandler pOBCTAOverlayHandler = this.t;
        if (pOBCTAOverlayHandler != null) {
            if (this.W) {
                q();
            } else {
                pOBCTAOverlayHandler.hide();
            }
        }
    }

    private void l() {
        POBVideoPlayer pOBVideoPlayer;
        List list = this.D;
        POBVastCreative.POBEventTypes pOBEventTypes = POBVastCreative.POBEventTypes.CLOSE_LINEAR;
        if (list.contains(pOBEventTypes.name())) {
            return;
        }
        List list2 = this.D;
        POBVastCreative.POBEventTypes pOBEventTypes2 = POBVastCreative.POBEventTypes.CLOSE;
        if (list2.contains(pOBEventTypes2.name()) || this.n == null || (pOBVideoPlayer = this.h) == null) {
            return;
        }
        if (!this.u && pOBVideoPlayer.getPlayerState() != POBVideoPlayer.VideoPlayerState.COMPLETE) {
            o();
        }
        if (this.n.getCombinedTrackingEventList(pOBEventTypes).isEmpty()) {
            a(pOBEventTypes2);
        } else {
            a(pOBEventTypes);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        POBVastPlayerListener pOBVastPlayerListener = this.e;
        if (pOBVastPlayerListener != null) {
            pOBVastPlayerListener.onEndCardWillLeaveApp();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        if (this.n != null) {
            POBVastAd.POBVastAdParameter pOBVastAdParameter = POBVastAd.POBVastAdParameter.CLICKTRACKING;
            POBLog.debug("POBVastPlayer", POBVideoLogConstants.MSG_VAST_PLAYER_EXECUTE_TRACKER_EVENT, pOBVastAdParameter.getValue());
            List<String> combinedList = this.n.getCombinedList(pOBVastAdParameter);
            if (combinedList.isEmpty()) {
                POBLog.debug("POBVastPlayer", POBVideoLogConstants.EMPTY_TRACKER_URL_LIST_LOG, new Object[0]);
            } else {
                a(combinedList);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        POBVastCreative.POBEventTypes pOBEventTypes = POBVastCreative.POBEventTypes.SKIP;
        b(pOBEventTypes);
        a(pOBEventTypes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        POBCTAOverlayHandler pOBCTAOverlayHandler = this.t;
        if (pOBCTAOverlayHandler != null) {
            pOBCTAOverlayHandler.hide();
        }
    }

    private void q() {
        POBCTAOverlayHandler pOBCTAOverlayHandler = this.t;
        if (pOBCTAOverlayHandler != null) {
            pOBCTAOverlayHandler.cleanUp();
            this.t = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        POBCTAOverlayHandler pOBCTAOverlayHandler = this.t;
        if (pOBCTAOverlayHandler != null) {
            pOBCTAOverlayHandler.invalidateTimer();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean s() {
        POBCTAOverlayHandler pOBCTAOverlayHandler = this.t;
        if (pOBCTAOverlayHandler != null) {
            return pOBCTAOverlayHandler.isShowWithDelayInitiated();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        POBVastPlayerListener pOBVastPlayerListener = this.e;
        if (pOBVastPlayerListener != null) {
            pOBVastPlayerListener.shouldForwardClickEvent();
        }
    }

    private void u() {
        if (!this.v) {
            b(false);
            return;
        }
        setOnClickListener(null);
        p();
        r();
        c();
        POBCTAOverlayData pOBCTAOverlayData = this.s;
        if (pOBCTAOverlayData != null) {
            b(pOBCTAOverlayData.getEndcardDelay());
        }
    }

    private void v() {
        POBVastAd pOBVastAd = this.n;
        if (pOBVastAd != null) {
            a(pOBVastAd.getClosestIcon());
        }
    }

    private boolean w() {
        return this.J.size() > 1 || !POBUtils.isNullOrEmpty(this.V);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        POBCustomProductPageView pOBCustomProductPageView = new POBCustomProductPageView(this.R.getBaseContext());
        pOBCustomProductPageView.setInstallButtonClickListener(new a());
        pOBCustomProductPageView.setCloseBtnClickListener(new b());
        addView(pOBCustomProductPageView);
    }

    private void y() {
        POBOpenStoreButton pOBOpenStoreButton = this.k;
        if (pOBOpenStoreButton != null) {
            pOBOpenStoreButton.setVisibility(8);
        }
        ImageButton imageButton = this.j;
        if (imageButton != null) {
            imageButton.setVisibility(0);
        }
    }

    private void z() {
        POBVideoPlayer pOBVideoPlayer = this.h;
        if (pOBVideoPlayer != null) {
            pOBVideoPlayer.setPrepareTimeout(this.P.getMediaUriTimeout());
            this.h.playOnMute(this.P.isPlayOnMute());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(POBVastAd pOBVastAd) {
        POBVastError pOBVastError;
        Linearity linearity;
        POBLog.debug("POBVastPlayer", POBVideoLogConstants.MSG_VAST_PLAYER_RENDERING_STARTED, new Object[0]);
        this.n = pOBVastAd;
        POBVastCreative creative = pOBVastAd.getCreative();
        this.b.put("[ADSERVINGID]", this.n.getAdServingId());
        this.b.put("[PODSEQUENCE]", String.valueOf(this.n.getAdSequence()));
        this.D = new ArrayList();
        if (creative != null) {
            if (this.P.isCtaOverlayEnabled()) {
                POBCTAOverlayData a2 = a(creative);
                if (a2 != null) {
                    this.s = a2;
                } else {
                    POBLog.debug("POBVastPlayer", "Using CTA overlay data from bid response", new Object[0]);
                }
            }
            if (creative.getVastCreativeType() == POBVastCreative.CreativeType.LINEAR && ((linearity = this.Q) == Linearity.LINEAR || linearity == Linearity.ANY)) {
                a((POBLinear) creative);
                pOBVastError = null;
            } else {
                pOBVastError = new POBVastError(201, POBVideoLogConstants.MSG_VAST_PLAYER_LINEARITY_NOT_FOUND);
            }
        } else {
            pOBVastError = new POBVastError(400, POBVideoLogConstants.MSG_VAST_PLAYER_NO_CREATIVE);
        }
        if (pOBVastError != null) {
            a(this.n, pOBVastError);
        }
    }

    private void b(POBVastCreative.POBEventTypes pOBEventTypes) {
        POBVastPlayerListener pOBVastPlayerListener = this.e;
        if (pOBVastPlayerListener != null) {
            pOBVastPlayerListener.onVideoEventOccurred(pOBEventTypes);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i2) {
        POBCTAOverlayHandler pOBCTAOverlayHandler = this.t;
        if (pOBCTAOverlayHandler != null) {
            pOBCTAOverlayHandler.showWithDelay(i2);
        }
    }

    private void b() {
        ImageButton createAdInfoIconButton = POBUIUtil.createAdInfoIconButton(this.R, com.pubmatic.sdk.common.R.id.pob_ad_info_icon_btn, com.pubmatic.sdk.common.R.drawable.pob_ad_info_icon, this.S, false);
        this.m = createAdInfoIconButton;
        createAdInfoIconButton.setOnClickListener(new g());
        addView(this.m);
    }

    private void a(POBVastCreative.POBEventTypes pOBEventTypes) {
        if (this.n != null) {
            POBLog.debug("POBVastPlayer", POBVideoLogConstants.MSG_VAST_PLAYER_EXECUTE_TRACKER_EVENT, pOBEventTypes.getValue());
            a(this.n.getCombinedTrackingEventList(pOBEventTypes));
            this.D.add(pOBEventTypes.name());
            return;
        }
        POBLog.debug("POBVastPlayer", "Selected Vast Ad is null", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List list) {
        this.d.sendTrackers(POBTrackerHandler.sanitizeURLScheme((List<String>) list), getVASTMacros());
    }

    private void a(POBLinear pOBLinear) {
        POBVastError pOBVastError;
        List<POBMediaFile> mediaFiles = pOBLinear.getMediaFiles();
        if (mediaFiles != null && !mediaFiles.isEmpty()) {
            this.B = pOBLinear.getSkipOffset();
            boolean isWiFiConnected = POBInstanceProvider.getNetworkMonitor(getContext().getApplicationContext()).isWiFiConnected();
            int scaleFactor = POBVastPlayerUtil.getScaleFactor(getContext().getApplicationContext());
            int bitRate = POBVastPlayerUtil.getBitRate(scaleFactor == 1, isWiFiConnected);
            POBLog.info("POBVastPlayer", POBVideoLogConstants.MSG_EXPECTED_BIT_RATE, scaleFactor == 1 ? "low" : Constants.HIGH, isWiFiConnected ? T3.b : "non-wifi", Integer.valueOf(bitRate));
            POBVideoPlayer.SupportedMediaType[] supportedMediaTypeArr = POBVideoPlayer.SUPPORTED_MEDIA_TYPE;
            POBDeviceInfo pOBDeviceInfo = this.G;
            POBMediaFile filterMediaFiles = POBVastPlayerUtil.filterMediaFiles(mediaFiles, supportedMediaTypeArr, bitRate, pOBDeviceInfo.screenWidth, pOBDeviceInfo.screenHeight);
            this.z = filterMediaFiles;
            if (filterMediaFiles != null) {
                POBLog.info("POBVastPlayer", POBVideoLogConstants.MSG_SELECTED_MEDIAL_FILE, filterMediaFiles, mediaFiles, Integer.valueOf(bitRate), this.z.getWidth() + VastAttributes.HORIZONTAL_POSITION + this.z.getHeight(), Arrays.toString(supportedMediaTypeArr));
                String mediaFileURL = this.z.getMediaFileURL();
                POBLog.debug("POBVastPlayer", POBVideoLogConstants.MSG_VAST_SELECTED_MEDIA_FILE, mediaFileURL);
                this.h = a(getContext());
                z();
                e();
                if (POBVastPlayerConfig.POBVastPlayerUIConfig.canLoadAdInfoIcon(this.P.getVastPlayerUIConfig())) {
                    b();
                }
                g();
                f();
                if (mediaFileURL != null) {
                    Trace.endSection();
                    Trace.beginSection("POB Rendering");
                    this.h.load(mediaFileURL);
                    pOBVastError = null;
                } else {
                    pOBVastError = new POBVastError(403, POBVideoLogConstants.MSG_VAST_PLAYER_LINEAR_MEDIA_NOT_SUPPORTED);
                }
                b(false);
            } else {
                pOBVastError = new POBVastError(403, POBVideoLogConstants.MSG_VAST_PLAYER_LINEAR_MEDIA_NOT_SUPPORTED);
            }
        } else {
            pOBVastError = new POBVastError(401, POBVideoLogConstants.MSG_VAST_PLAYER_LINEAR_MEDIA_NOT_FOUND);
        }
        if (pOBVastError != null) {
            a(this.n, pOBVastError);
        }
    }

    private POBVideoPlayerController b(Context context) {
        boolean z;
        boolean z2;
        int i2 = R.layout.pob_video_mute_button_default;
        if (this.P.getVastPlayerUIConfig() != null) {
            POBVastPlayerConfig.POBVastPlayerUIConfig vastPlayerUIConfig = this.P.getVastPlayerUIConfig();
            int muteButtonLayoutResId = vastPlayerUIConfig.getMuteButtonLayoutResId();
            boolean isProgressBarVisible = vastPlayerUIConfig.isProgressBarVisible();
            z = vastPlayerUIConfig.isMuteButtonVisible();
            i2 = muteButtonLayoutResId;
            z2 = isProgressBarVisible;
        } else {
            z = true;
            z2 = true;
        }
        return new POBVideoPlayerController(context, i2, z2, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        POBVastError pOBVastError;
        POBLog.debug("POBVastPlayer", POBVideoLogConstants.MSG_RENDERING_END_CARD, new Object[0]);
        if ("interstitial".equals(this.N)) {
            POBMraidEndCardView pOBMraidEndCardView = new POBMraidEndCardView(this.R.getBaseContext(), w(), this.P.shouldShowEndCardNavigationControl());
            this.M = pOBMraidEndCardView;
            pOBMraidEndCardView.setFSCEnabled(this.T);
            this.M.setSkipAfter(this.P.getEndCardSkipAfter());
            this.M.setOnSkipOptionUpdateListener(new h());
        } else {
            POBEndCardView pOBEndCardView = new POBEndCardView(getContext());
            this.M = pOBEndCardView;
            pOBEndCardView.setFSCEnabled(this.T);
        }
        this.M.setLearnMoreTitle(POBUIUtil.getLocalizedStringForKey(getContext(), "openwrap_learn_more_title", "Learn More"));
        this.M.setListener(new i());
        if (this.n != null) {
            if (this.J.isEmpty() && (pOBVastError = this.x) != null) {
                a(this.n, pOBVastError);
            }
            POBCompanion pOBCompanion = (POBCompanion) this.J.poll();
            this.I = pOBCompanion;
            if (pOBCompanion != null) {
                POBLog.debug("POBVastPlayer", POBVideoLogConstants.MSG_RENDERING_COMPANION_END_CARD, pOBCompanion);
                this.I.setAdomains(this.r);
            }
            this.M.render(this.I);
            addView(this.M.getView());
            b(false);
            ImageButton imageButton = this.j;
            if (imageButton != null) {
                imageButton.setVisibility(8);
            }
            POBOpenStoreButton pOBOpenStoreButton = this.k;
            if (pOBOpenStoreButton != null) {
                pOBOpenStoreButton.setVisibility(8);
            }
            ImageButton imageButton2 = this.m;
            if (imageButton2 != null) {
                a(imageButton2);
            }
            POBIconView pOBIconView = this.K;
            if (pOBIconView != null) {
                a(pOBIconView);
            }
            POBUIUtil.bringViewsToFront(this.m, this.K, this.o);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(POBVastAd pOBVastAd) {
        if (pOBVastAd != null) {
            a(pOBVastAd.getClosestClickThroughURL());
        }
    }

    private void b(boolean z) {
        POBVideoPlayer pOBVideoPlayer = this.h;
        if (pOBVideoPlayer != null) {
            POBPlayerController controllerView = pOBVideoPlayer.getControllerView();
            if (controllerView != null) {
                if (z) {
                    com.pubmatic.sdk.video.player.a.b(controllerView, 200);
                } else {
                    com.pubmatic.sdk.video.player.a.a(controllerView, 200);
                }
            }
            TextView textView = this.E;
            if (textView != null) {
                if (z) {
                    com.pubmatic.sdk.video.player.a.b(textView, 200);
                } else {
                    com.pubmatic.sdk.video.player.a.a(textView, 200);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(POBIconView pOBIconView, POBIcon pOBIcon) {
        new Handler().postDelayed(new k(pOBIconView, pOBIcon), pOBIcon.getOffset() * 1000);
    }

    private POBVideoPlayerView a(Context context) {
        POBVideoPlayerView pOBVideoPlayerView = new POBVideoPlayerView(context);
        pOBVideoPlayerView.setListener(this);
        pOBVideoPlayerView.setFSCEnabled(this.T);
        POBVideoPlayerController b2 = b(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 80;
        pOBVideoPlayerView.setControllerView(b2, layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        addView(pOBVideoPlayerView, layoutParams2);
        a(pOBVideoPlayerView);
        return pOBVideoPlayerView;
    }

    private void a(POBVideoPlayerView pOBVideoPlayerView) {
        if (this.y) {
            TextView a2 = com.pubmatic.sdk.video.player.a.a(getContext(), R.id.pob_learn_more_btn, POBUIUtil.getLocalizedStringForKey(getContext(), "openwrap_learn_more_title", "Learn More"), getResources().getColor(com.pubmatic.sdk.webrendering.R.color.pob_controls_background_color));
            this.E = a2;
            a2.setOnClickListener(this.A);
            pOBVideoPlayerView.addView(this.E);
        }
    }

    private void a() {
        if (this.U) {
            POBOpenStoreButton createOpenStoreButton = POBUIUtil.createOpenStoreButton(getContext());
            this.k = createOpenStoreButton;
            createOpenStoreButton.setVisibility(8);
            this.k.setOnClickListener(this.A);
            addView(this.k);
        }
        if (this.u) {
            this.j = POBUIUtil.createSkipButton(getContext(), com.pubmatic.sdk.common.R.id.pob_forward_btn, com.pubmatic.sdk.webrendering.R.drawable.pob_ic_forward_24);
        } else {
            this.j = POBUIUtil.createSkipButton(getContext(), com.pubmatic.sdk.common.R.id.pob_close_btn, com.pubmatic.sdk.common.R.drawable.pob_ic_close_black_24dp);
        }
        this.j.setVisibility(8);
        this.w = false;
        this.j.setOnClickListener(this.A);
        addView(this.j);
    }

    private void a(long j2) {
        this.H = new POBProgressiveEventHandler(this);
        a(((int) (25 * j2)) / 100, POBVastCreative.POBEventTypes.FIRST_QUARTILE);
        a(((int) (50 * j2)) / 100, POBVastCreative.POBEventTypes.MID_POINT);
        a(((int) (75 * j2)) / 100, POBVastCreative.POBEventTypes.THIRD_QUARTILE);
        POBVastAd pOBVastAd = this.n;
        if (pOBVastAd != null) {
            for (POBXMLNodeListener pOBXMLNodeListener : pOBVastAd.getCombinedObjectList(POBVastAd.POBVastAdParameter.PROGRESS_TRACKING_EVENT)) {
                if (pOBXMLNodeListener instanceof POBTracking) {
                    POBTracking pOBTracking = (POBTracking) pOBXMLNodeListener;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(pOBTracking.getUrl());
                    this.H.addProgressUrls(Integer.valueOf((int) POBUtils.convertToSeconds(String.valueOf(j2), pOBTracking.getOffset())), POBVastCreative.POBEventTypes.PROGRESS, arrayList);
                }
            }
        }
    }

    private void a(int i2, POBVastCreative.POBEventTypes pOBEventTypes) {
        POBVastAd pOBVastAd = this.n;
        if (pOBVastAd == null || this.H == null) {
            return;
        }
        this.H.addProgressUrls(Integer.valueOf(i2), pOBEventTypes, pOBVastAd.getCombinedTrackingEventList(pOBEventTypes));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(POBVastAd pOBVastAd, POBVastError pOBVastError) {
        if (pOBVastAd != null) {
            this.F.executeVastErrorsWithMacros(pOBVastAd.getCombinedList(POBVastAd.POBVastAdParameter.ERRORS), getVASTMacros(), pOBVastError, POBVastPlayerUtil.generateErrorQueryParams(getContext(), this.G, this.z));
        } else {
            this.F.executeVastErrors(null, pOBVastError);
        }
        Trace.endSection();
        POBError convertToPOBError = POBVastErrorHandler.convertToPOBError(pOBVastError);
        if (convertToPOBError != null) {
            a(convertToPOBError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        POBOnSkipOptionUpdateListener pOBOnSkipOptionUpdateListener = this.L;
        if (pOBOnSkipOptionUpdateListener != null) {
            pOBOnSkipOptionUpdateListener.onSkipOptionUpdate(z);
        }
    }

    private void a(POBError pOBError) {
        POBLog.error("POBVastPlayer", "%s", pOBError);
        POBVastPlayerListener pOBVastPlayerListener = this.e;
        if (pOBVastPlayerListener != null) {
            pOBVastPlayerListener.onFailedToPlay(pOBError);
        }
    }

    private void a(View view) {
        if (!this.S || view.getLayoutParams() == null) {
            return;
        }
        ((FrameLayout.LayoutParams) view.getLayoutParams()).gravity = 80;
    }

    private POBCompanion a(POBVastAd pOBVastAd) {
        List<POBCompanion> combinedCompanions = pOBVastAd.getCombinedCompanions();
        if (combinedCompanions != null && !combinedCompanions.isEmpty()) {
            float width = getWidth();
            float height = getHeight();
            POBAdSize pOBAdSize = this.g;
            if (pOBAdSize != null) {
                width = POBUtils.convertDpToPixelWithFloatPrecession(pOBAdSize.getAdWidth());
                height = POBUtils.convertDpToPixelWithFloatPrecession(this.g.getAdHeight());
            }
            POBCompanion suitableEndCardCompanion = POBVastPlayerUtil.getSuitableEndCardCompanion(combinedCompanions, width, height);
            if (suitableEndCardCompanion == null) {
                this.x = new POBVastError(601, POBVideoLogConstants.MSG_NO_MATCHING_END_CARD_FOUND);
                return suitableEndCardCompanion;
            }
            POBLog.debug("POBVastPlayer", POBVideoLogConstants.MSG_SELECTED_END_CARD + suitableEndCardCompanion, new Object[0]);
            return suitableEndCardCompanion;
        }
        this.x = new POBVastError(603, POBVideoLogConstants.MSG_NO_END_CARD);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        POBVastPlayerListener pOBVastPlayerListener = this.e;
        if (pOBVastPlayerListener != null) {
            pOBVastPlayerListener.onOpenLandingPage(str);
        }
    }

    private void a(POBIcon pOBIcon) {
        if (pOBIcon != null && pOBIcon.getResource() != null && pOBIcon.getOffset() <= this.C && !POBUtils.isNullOrEmpty(pOBIcon.getResource().getResource())) {
            POBLog.debug("POBVastPlayer", POBVideoLogConstants.MSG_RENDERING_ICON, pOBIcon.getProgram(), Integer.valueOf(pOBIcon.getOffset()), Integer.valueOf(pOBIcon.getDuration()));
            POBIconView pOBIconView = new POBIconView(getContext());
            this.K = pOBIconView;
            pOBIconView.setId(R.id.pob_industry_icon_one);
            this.K.setListener(new j(pOBIcon));
            this.K.a(pOBIcon);
            return;
        }
        POBLog.debug("POBVastPlayer", POBVideoLogConstants.MSG_ICON_UNAVAILABLE_RESOURCE, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(POBIconView pOBIconView, POBIcon pOBIcon) {
        long duration = pOBIcon.getDuration() * 1000;
        if (duration > 0) {
            new Handler().postDelayed(new l(pOBIconView), duration);
        }
        a(pOBIconView, pOBIcon);
        List<String> viewTrackers = pOBIcon.getViewTrackers();
        if (viewTrackers != null) {
            a(viewTrackers);
        }
    }

    private void a(POBIconView pOBIconView, POBIcon pOBIcon) {
        addView(pOBIconView, com.pubmatic.sdk.video.player.a.a(getContext(), pOBIcon.getContentWidth(), pOBIcon.getContentHeight(), this.m, this.S));
    }

    private POBCTAOverlayData a(POBVastCreative pOBVastCreative) {
        String str;
        JSONObject optJSONObject;
        POBVastAd pOBVastAd;
        POBVastCreativeExtension pubMaticExtension = pOBVastCreative.getPubMaticExtension();
        if (pubMaticExtension == null || (str = pubMaticExtension.get_value()) == null) {
            return null;
        }
        try {
            optJSONObject = new JSONObject(str).optJSONObject("ctaoverlay");
        } catch (Exception e2) {
            POBLog.error("POBVastPlayer", "Failed to parse CTA Overlay from CreativeExtension: %s", e2.getMessage());
        }
        if (optJSONObject == null) {
            return null;
        }
        POBLog.debug("POBVastPlayer", "CTAOverlay Data received from VAST CreativeExtensions: %s", optJSONObject);
        POBCTAOverlayData parse = POBCTAOverlayData.parse(optJSONObject);
        if (POBUtils.isNullOrEmpty(parse.getClickUrl()) && (pOBVastAd = this.n) != null && pOBVastAd.getClosestClickThroughURL() != null) {
            parse = POBCTAOverlayData.copyClickUrl(parse, this.n.getClosestClickThroughURL());
        }
        if (POBCTAOverlayHandler.isCTAOverlayValid(parse)) {
            POBLog.debug("POBVastPlayer", "Using CTA overlay data from creative", new Object[0]);
            return parse;
        }
        POBLog.debug("POBVastPlayer", "CTA Overlay from VAST CreativeExtensions is invalid, using bid CTA overlay", new Object[0]);
        return null;
    }
}
