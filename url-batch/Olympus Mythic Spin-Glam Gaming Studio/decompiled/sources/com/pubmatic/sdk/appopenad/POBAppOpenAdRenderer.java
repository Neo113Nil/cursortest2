package com.pubmatic.sdk.appopenad;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.j;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.pubmatic.sdk.appopenad.ui.POBAppOpenAdViewContainer;
import com.pubmatic.sdk.common.POBDataType;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.pubmatic.sdk.common.base.POBAdRendererListener;
import com.pubmatic.sdk.common.cache.POBAdViewCacheService;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayHandler;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.log.POBLogConstants;
import com.pubmatic.sdk.common.ui.POBBannerRendering;
import com.pubmatic.sdk.common.ui.POBFullScreenActivityListener;
import com.pubmatic.sdk.common.ui.POBFullScreenRendererListener;
import com.pubmatic.sdk.common.ui.POBInterstitialRendering;
import com.pubmatic.sdk.common.ui.POBVideoAdEventListener;
import com.pubmatic.sdk.common.view.POBWebView;
import com.pubmatic.sdk.common.viewability.POBObstructionUpdateListener;
import com.pubmatic.sdk.video.renderer.POBVideoRenderingListener;
import com.pubmatic.sdk.webrendering.mraid.POBMraidRenderer;
import com.pubmatic.sdk.webrendering.ui.POBAdViewContainer;
import com.pubmatic.sdk.webrendering.ui.POBFullScreenActivity;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 ^2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002^_B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\r\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0014J\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010 \u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\f2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\fH\u0016¢\u0006\u0004\b&\u0010\u0014J\u0019\u0010)\u001a\u00020\f2\b\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b)\u0010*J!\u0010+\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\f2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\fH\u0016¢\u0006\u0004\b1\u0010\u0014J\u0017\u00103\u001a\u00020\f2\u0006\u00102\u001a\u00020\"H\u0016¢\u0006\u0004\b3\u0010%J\u000f\u00104\u001a\u00020\fH\u0016¢\u0006\u0004\b4\u0010\u0014J\u000f\u00105\u001a\u00020\fH\u0016¢\u0006\u0004\b5\u0010\u0014J\u000f\u00106\u001a\u00020\fH\u0016¢\u0006\u0004\b6\u0010\u0014J\u000f\u00107\u001a\u00020\fH\u0016¢\u0006\u0004\b7\u0010\u0014J\u000f\u00108\u001a\u00020\fH\u0016¢\u0006\u0004\b8\u0010\u0014J\u000f\u00109\u001a\u00020\fH\u0016¢\u0006\u0004\b9\u0010\u0014J\u000f\u0010:\u001a\u00020\fH\u0016¢\u0006\u0004\b:\u0010\u0014J\u0017\u0010=\u001a\u00020\f2\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010A\u001a\u00020\f2\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010CR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010DR\u0018\u0010G\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010FR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010HR\u0018\u0010K\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010JR\u0018\u0010N\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010S\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0018\u0010W\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0018\u0010]\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\¨\u0006`"}, d2 = {"Lcom/pubmatic/sdk/appopenad/POBAppOpenAdRenderer;", "Lcom/pubmatic/sdk/video/renderer/POBVideoRenderingListener;", "Lcom/pubmatic/sdk/common/base/POBAdRendererListener;", "Lcom/pubmatic/sdk/common/ui/POBInterstitialRendering;", "Landroid/content/Context;", "appContext", "Lcom/pubmatic/sdk/appopenad/POBAppOpenAdRenderer$RendererBuilder;", "rendererBuilder", "<init>", "(Landroid/content/Context;Lcom/pubmatic/sdk/appopenad/POBAppOpenAdRenderer$RendererBuilder;)V", "Landroid/view/View;", "view", "", "a", "(Landroid/view/View;)V", "Lcom/pubmatic/sdk/webrendering/ui/POBAdViewContainer;", "containerView", "(Lcom/pubmatic/sdk/webrendering/ui/POBAdViewContainer;)V", "b", "c", "()V", EidRequestBuilder.REQUEST_FIELD_EMAIL, "d", "Lcom/pubmatic/sdk/common/base/POBAdDescriptor;", "descriptor", "renderAd", "(Lcom/pubmatic/sdk/common/base/POBAdDescriptor;)V", "Lcom/pubmatic/sdk/common/ui/POBFullScreenRendererListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setAdRendererListener", "(Lcom/pubmatic/sdk/common/ui/POBFullScreenRendererListener;)V", "Lcom/pubmatic/sdk/common/ui/POBVideoAdEventListener;", "setVideoAdEventListener", "(Lcom/pubmatic/sdk/common/ui/POBVideoAdEventListener;)V", "", "requestedOrientation", "show", "(I)V", "destroy", "", MBridgeConstans.EXTRA_KEY_WM, "setWatermark", "(Ljava/lang/String;)V", "onAdRender", "(Landroid/view/View;Lcom/pubmatic/sdk/common/base/POBAdDescriptor;)V", "Lcom/pubmatic/sdk/common/POBError;", "error", "onAdRenderingFailed", "(Lcom/pubmatic/sdk/common/POBError;)V", "onRenderAdClick", "interval", "onAdReadyToRefresh", "onAdInteractionStarted", "onAdInteractionStopped", "onAdUnload", "onLeavingApplication", "onAdExpired", "onRenderProcessGone", "onAdImpression", "Lcom/pubmatic/sdk/common/POBDataType$POBVideoAdEventType;", "event", "notifyAdEvent", "(Lcom/pubmatic/sdk/common/POBDataType$POBVideoAdEventType;)V", "", "isEnable", "onSkipOptionUpdate", "(Z)V", "Landroid/content/Context;", "Lcom/pubmatic/sdk/appopenad/POBAppOpenAdRenderer$RendererBuilder;", "Lcom/pubmatic/sdk/common/ui/POBBannerRendering;", "Lcom/pubmatic/sdk/common/ui/POBBannerRendering;", "renderer", "Lcom/pubmatic/sdk/common/ui/POBFullScreenRendererListener;", "Lcom/pubmatic/sdk/common/ui/POBFullScreenActivityListener;", "Lcom/pubmatic/sdk/common/ui/POBFullScreenActivityListener;", "eventListener", InneractiveMediationDefs.GENDER_FEMALE, "Lcom/pubmatic/sdk/common/ui/POBVideoAdEventListener;", "videoAdEventListener", "g", "Lcom/pubmatic/sdk/common/base/POBAdDescriptor;", "h", "Landroid/view/View;", "renderedView", "Lcom/pubmatic/sdk/webrendering/mraid/POBMraidRenderer;", "i", "Lcom/pubmatic/sdk/webrendering/mraid/POBMraidRenderer;", "mraidRenderer", j.b, "Ljava/lang/String;", "Lcom/pubmatic/sdk/common/ctaoverlay/POBCTAOverlayHandler;", CampaignEx.JSON_KEY_AD_K, "Lcom/pubmatic/sdk/common/ctaoverlay/POBCTAOverlayHandler;", "ctaOverlayHandler", "Companion", "RendererBuilder", "appopenad_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes14.dex */
public final class POBAppOpenAdRenderer implements POBVideoRenderingListener, POBAdRendererListener, POBInterstitialRendering {

    /* renamed from: a, reason: from kotlin metadata */
    private final Context appContext;

    /* renamed from: b, reason: from kotlin metadata */
    private final RendererBuilder rendererBuilder;

    /* renamed from: c, reason: from kotlin metadata */
    private POBBannerRendering renderer;

    /* renamed from: d, reason: from kotlin metadata */
    private POBFullScreenRendererListener listener;

    /* renamed from: e, reason: from kotlin metadata */
    private POBFullScreenActivityListener eventListener;

    /* renamed from: f, reason: from kotlin metadata */
    private POBVideoAdEventListener videoAdEventListener;

    /* renamed from: g, reason: from kotlin metadata */
    private POBAdDescriptor descriptor;

    /* renamed from: h, reason: from kotlin metadata */
    private View renderedView;

    /* renamed from: i, reason: from kotlin metadata */
    private POBMraidRenderer mraidRenderer;

    /* renamed from: j, reason: from kotlin metadata */
    private String watermark;

    /* renamed from: k, reason: from kotlin metadata */
    private POBCTAOverlayHandler ctaOverlayHandler;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/pubmatic/sdk/appopenad/POBAppOpenAdRenderer$RendererBuilder;", "", "build", "Lcom/pubmatic/sdk/common/ui/POBBannerRendering;", "descriptor", "Lcom/pubmatic/sdk/common/base/POBAdDescriptor;", "rendererId", "", "appopenad_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface RendererBuilder {
        @Nullable
        POBBannerRendering build(@NotNull POBAdDescriptor descriptor, int rendererId);
    }

    public POBAppOpenAdRenderer(@NotNull Context appContext, @NotNull RendererBuilder rendererBuilder) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(rendererBuilder, "rendererBuilder");
        this.appContext = appContext;
        this.rendererBuilder = rendererBuilder;
    }

    private final void a(final View view) {
        this.eventListener = new POBFullScreenActivityListener() { // from class: com.pubmatic.sdk.appopenad.POBAppOpenAdRenderer$cacheRendererViewConfig$1
            @Override // com.pubmatic.sdk.common.ui.POBFullScreenActivityListener
            public void onCreate(@NotNull Activity context) {
                POBMraidRenderer pOBMraidRenderer;
                Intrinsics.checkNotNullParameter(context, "context");
                View view2 = view;
                if (view2 instanceof POBAdViewContainer) {
                    ((POBAdViewContainer) view2).getAdView().setBaseContext(context);
                    pOBMraidRenderer = this.mraidRenderer;
                    if (pOBMraidRenderer != null) {
                        this.a((POBAdViewContainer) view);
                    }
                }
            }

            @Override // com.pubmatic.sdk.common.ui.POBFullScreenActivityListener
            public void onDestroy() {
                POBFullScreenRendererListener pOBFullScreenRendererListener;
                Context context;
                View view2 = view;
                if (view2 instanceof POBAdViewContainer) {
                    POBWebView adView = ((POBAdViewContainer) view2).getAdView();
                    context = this.appContext;
                    adView.setBaseContext(context.getApplicationContext());
                }
                this.e();
                pOBFullScreenRendererListener = this.listener;
                if (pOBFullScreenRendererListener != null) {
                    pOBFullScreenRendererListener.onAdInteractionStopped();
                }
            }
        };
        Context applicationContext = this.appContext.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "appContext.applicationContext");
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) view;
        POBAdDescriptor pOBAdDescriptor = this.descriptor;
        POBAppOpenAdViewContainer pOBAppOpenAdViewContainer = new POBAppOpenAdViewContainer(applicationContext, viewGroup, pOBAdDescriptor != null ? pOBAdDescriptor.isVideo() : false);
        pOBAppOpenAdViewContainer.setOnForwardClickListener(new POBAppOpenAdViewContainer.OnForwardClickListener() { // from class: com.pubmatic.sdk.appopenad.POBAppOpenAdRenderer$$ExternalSyntheticLambda0
            @Override // com.pubmatic.sdk.appopenad.ui.POBAppOpenAdViewContainer.OnForwardClickListener
            public final void onForwardClick() {
                POBAppOpenAdRenderer.a(POBAppOpenAdRenderer.this);
            }
        });
        POBFullScreenActivityListener pOBFullScreenActivityListener = this.eventListener;
        if (pOBFullScreenActivityListener != null) {
            POBInstanceProvider.getAdViewCacheService().storeAdView(Integer.valueOf(hashCode()), new POBAdViewCacheService.AdViewConfig(pOBAppOpenAdViewContainer, pOBFullScreenActivityListener));
        }
    }

    private final void b(final POBAdViewContainer containerView) {
        final POBCTAOverlayHandler pOBCTAOverlayHandler = this.ctaOverlayHandler;
        if (pOBCTAOverlayHandler == null) {
            return;
        }
        final POBCTAOverlayData ctaOverlayData = pOBCTAOverlayHandler.getCtaOverlayData();
        pOBCTAOverlayHandler.setCTAOverlayListener(new POBCTAOverlayHandler.POBCTAOverlayListener() { // from class: com.pubmatic.sdk.appopenad.POBAppOpenAdRenderer$showCTAOverlayView$1
            @Override // com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayHandler.POBCTAOverlayListener
            public void onClick() {
                POBMraidRenderer pOBMraidRenderer;
                POBLog.debug("POBAppOpenAdsRenderer", POBLogConstants.MSG_CTA_OVERLAY_CLICKED, new Object[0]);
                pOBMraidRenderer = this.mraidRenderer;
                if (pOBMraidRenderer != null) {
                    pOBMraidRenderer.handleClickThrough(ctaOverlayData.getClickUrl(), ctaOverlayData.getClickTrackers());
                }
            }

            @Override // com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayHandler.POBCTAOverlayListener
            public void onDismiss() {
                POBLog.debug("POBAppOpenAdsRenderer", POBLogConstants.MSG_CTA_OVERLAY_DISMISSED, new Object[0]);
                this.c();
            }

            @Override // com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayHandler.POBCTAOverlayListener
            public void onShow() {
                POBMraidRenderer pOBMraidRenderer;
                POBLog.debug("POBAppOpenAdsRenderer", POBLogConstants.MSG_CTA_OVERLAY_PRESENTED, new Object[0]);
                ImageView watermarkView = POBAdViewContainer.this.getWatermarkView();
                if (watermarkView != null) {
                    watermarkView.bringToFront();
                }
                pOBMraidRenderer = this.mraidRenderer;
                if (pOBMraidRenderer != null) {
                    pOBMraidRenderer.addFriendlyObstructions(pOBCTAOverlayHandler.getCtaOverlayView(), POBObstructionUpdateListener.POBFriendlyObstructionPurpose.OTHER);
                }
            }
        });
        pOBCTAOverlayHandler.showWithDelay(ctaOverlayData.getDelay());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        POBCTAOverlayHandler pOBCTAOverlayHandler = this.ctaOverlayHandler;
        if (pOBCTAOverlayHandler != null) {
            POBMraidRenderer pOBMraidRenderer = this.mraidRenderer;
            if (pOBMraidRenderer != null) {
                pOBMraidRenderer.removeFriendlyObstructions(pOBCTAOverlayHandler.getCtaOverlayView());
            }
            pOBCTAOverlayHandler.cleanUp();
        }
        this.ctaOverlayHandler = null;
    }

    private final void d() {
        POBBannerRendering pOBBannerRendering = this.renderer;
        if (pOBBannerRendering != null) {
            pOBBannerRendering.invalidateExpiration();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        POBBannerRendering pOBBannerRendering = this.renderer;
        if (pOBBannerRendering != null) {
            pOBBannerRendering.destroy();
        }
        this.renderer = null;
    }

    @Override // com.pubmatic.sdk.common.ui.POBInterstitialRendering
    public void destroy() {
        e();
        b();
    }

    @Override // com.pubmatic.sdk.video.renderer.POBVideoRenderingListener
    public void notifyAdEvent(@NotNull POBDataType.POBVideoAdEventType event) {
        Intrinsics.checkNotNullParameter(event, "event");
        POBVideoAdEventListener pOBVideoAdEventListener = this.videoAdEventListener;
        if (pOBVideoAdEventListener != null) {
            pOBVideoAdEventListener.onVideoAdEvent(event);
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdExpired() {
        POBFullScreenRendererListener pOBFullScreenRendererListener = this.listener;
        if (pOBFullScreenRendererListener != null) {
            pOBFullScreenRendererListener.onAdExpired();
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdImpression() {
        POBFullScreenRendererListener pOBFullScreenRendererListener = this.listener;
        if (pOBFullScreenRendererListener != null) {
            pOBFullScreenRendererListener.onAdImpression();
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdInteractionStarted() {
        d();
        POBFullScreenRendererListener pOBFullScreenRendererListener = this.listener;
        if (pOBFullScreenRendererListener != null) {
            pOBFullScreenRendererListener.onAdInteractionStarted();
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdInteractionStopped() {
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdReadyToRefresh(int interval) {
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdRender(@NotNull View view, @Nullable POBAdDescriptor descriptor) {
        POBFullScreenRendererListener pOBFullScreenRendererListener;
        Intrinsics.checkNotNullParameter(view, "view");
        this.renderedView = view;
        if (descriptor == null || (pOBFullScreenRendererListener = this.listener) == null) {
            return;
        }
        pOBFullScreenRendererListener.onAdRender(descriptor);
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdRenderingFailed(@NotNull POBError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        POBFullScreenRendererListener pOBFullScreenRendererListener = this.listener;
        if (pOBFullScreenRendererListener != null) {
            pOBFullScreenRendererListener.onAdRenderingFailed(error);
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdUnload() {
        POBFullScreenRendererListener pOBFullScreenRendererListener = this.listener;
        if (pOBFullScreenRendererListener != null) {
            pOBFullScreenRendererListener.onAdUnload();
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onLeavingApplication() {
        POBFullScreenRendererListener pOBFullScreenRendererListener = this.listener;
        if (pOBFullScreenRendererListener != null) {
            pOBFullScreenRendererListener.onLeavingApplication();
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onRenderAdClick() {
        POBFullScreenRendererListener pOBFullScreenRendererListener = this.listener;
        if (pOBFullScreenRendererListener != null) {
            pOBFullScreenRendererListener.onAdClicked();
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onRenderProcessGone() {
        POBFullScreenRendererListener pOBFullScreenRendererListener = this.listener;
        if (pOBFullScreenRendererListener != null) {
            pOBFullScreenRendererListener.onRenderProcessGone();
        }
        b();
    }

    @Override // com.pubmatic.sdk.video.renderer.POBVideoRenderingListener
    public void onSkipOptionUpdate(boolean isEnable) {
    }

    @Override // com.pubmatic.sdk.common.ui.POBInterstitialRendering
    public void renderAd(@NotNull POBAdDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        POBLog.debug("POBAppOpenAdsRenderer", POBLogConstants.MSG_RENDERING_ON_START, new Object[0]);
        this.descriptor = descriptor;
        if (descriptor.getRenderableContent() != null) {
            POBBannerRendering build = this.rendererBuilder.build(descriptor, hashCode());
            this.renderer = build;
            if (build != null) {
                build.setAdRendererListener(this);
                build.setWatermark(this.watermark);
                build.renderAd(descriptor);
                return;
            }
            return;
        }
        POBFullScreenRendererListener pOBFullScreenRendererListener = this.listener;
        if (pOBFullScreenRendererListener != null) {
            pOBFullScreenRendererListener.onAdRenderingFailed(new POBError(1009, POBLogConstants.MSG_RENDERING_FAILED_ERROR + descriptor));
        }
    }

    @Override // com.pubmatic.sdk.common.ui.POBInterstitialRendering
    public void setAdRendererListener(@Nullable POBFullScreenRendererListener listener) {
        this.listener = listener;
    }

    @Override // com.pubmatic.sdk.common.ui.POBInterstitialRendering
    public void setVideoAdEventListener(@Nullable POBVideoAdEventListener listener) {
        this.videoAdEventListener = listener;
    }

    @Override // com.pubmatic.sdk.common.ui.POBInterstitialRendering
    public void setWatermark(@Nullable String watermark) {
        this.watermark = watermark;
    }

    @Override // com.pubmatic.sdk.common.ui.POBInterstitialRendering
    public void show(int requestedOrientation) {
        View view;
        POBLog.info("POBAppOpenAdsRenderer", "show appOpenAd", new Object[0]);
        if (this.descriptor == null || (view = this.renderedView) == null) {
            String str = "Can not show app open ad for descriptor: " + this.descriptor;
            POBLog.error("POBAppOpenAdsRenderer", str, new Object[0]);
            POBFullScreenRendererListener pOBFullScreenRendererListener = this.listener;
            if (pOBFullScreenRendererListener != null) {
                pOBFullScreenRendererListener.onAdRenderingFailed(new POBError(1009, str));
                return;
            }
            return;
        }
        a(view);
        if (POBInstanceProvider.getAdViewCacheService().getStoredAdView(Integer.valueOf(hashCode())) != null) {
            POBBannerRendering pOBBannerRendering = this.renderer;
            if (pOBBannerRendering instanceof POBMraidRenderer) {
                Intrinsics.checkNotNull(pOBBannerRendering, "null cannot be cast to non-null type com.pubmatic.sdk.webrendering.mraid.POBMraidRenderer");
                POBMraidRenderer pOBMraidRenderer = (POBMraidRenderer) pOBBannerRendering;
                this.mraidRenderer = pOBMraidRenderer;
                if (pOBMraidRenderer != null) {
                    pOBMraidRenderer.signalImpressionEvent();
                }
            }
            try {
                POBAdDescriptor pOBAdDescriptor = this.descriptor;
                if (pOBAdDescriptor != null) {
                    POBFullScreenActivity.startFullScreenActivity(this.appContext, requestedOrientation, pOBAdDescriptor, com.pubmatic.sdk.webrendering.R.style.POBFullScreenActivityTheme, hashCode());
                }
                onAdInteractionStarted();
                Unit unit = Unit.INSTANCE;
            } catch (Exception e) {
                POBLog.error("POBAppOpenAdsRenderer", "Unable to start full screen activity. Error: %s", e.getMessage());
                POBFullScreenRendererListener pOBFullScreenRendererListener2 = this.listener;
                if (pOBFullScreenRendererListener2 != null) {
                    StringBuilder sb = new StringBuilder();
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String format = String.format(POBLogConstants.MSG_AD_SHOW_ERROR, Arrays.copyOf(new Object[]{"app open"}, 1));
                    Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
                    sb.append(format);
                    sb.append(e.getMessage());
                    pOBFullScreenRendererListener2.onAdRenderingFailed(new POBError(1009, sb.toString()));
                    Unit unit2 = Unit.INSTANCE;
                }
            }
        }
    }

    private final void b() {
        c();
        POBInstanceProvider.getAdViewCacheService().popStoredAdView(Integer.valueOf(hashCode()));
        this.eventListener = null;
        this.videoAdEventListener = null;
        this.listener = null;
        this.renderedView = null;
        this.descriptor = null;
        this.watermark = null;
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(POBAppOpenAdRenderer this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final POBAdViewContainer containerView) {
        POBMraidRenderer pOBMraidRenderer = this.mraidRenderer;
        if (pOBMraidRenderer != null) {
            pOBMraidRenderer.fetchCreativeCTAOverlayData(new POBMraidRenderer.POBCTAOverlayDataListener() { // from class: com.pubmatic.sdk.appopenad.POBAppOpenAdRenderer$$ExternalSyntheticLambda1
                @Override // com.pubmatic.sdk.webrendering.mraid.POBMraidRenderer.POBCTAOverlayDataListener
                public final void onCTAOverlayDataReceived(POBCTAOverlayData pOBCTAOverlayData) {
                    POBAppOpenAdRenderer.a(POBAppOpenAdRenderer.this, containerView, pOBCTAOverlayData);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(POBAppOpenAdRenderer this$0, POBAdViewContainer containerView, POBCTAOverlayData pOBCTAOverlayData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(containerView, "$containerView");
        POBAdDescriptor pOBAdDescriptor = this$0.descriptor;
        this$0.ctaOverlayHandler = POBCTAOverlayHandler.INSTANCE.resolveAndGetCTAOverlayHandler(pOBCTAOverlayData, pOBAdDescriptor != null ? pOBAdDescriptor.getCTAOverlayData() : null, containerView, false);
        this$0.b(containerView);
    }

    private final void a() {
        POBFullScreenActivity.closeActivity(this.appContext, hashCode());
    }
}
