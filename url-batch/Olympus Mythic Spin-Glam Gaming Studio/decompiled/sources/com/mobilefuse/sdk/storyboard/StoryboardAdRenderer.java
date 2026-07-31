package com.mobilefuse.sdk.storyboard;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mobilefuse.sdk.AdRendererConfig;
import com.mobilefuse.sdk.AdRendererContainer;
import com.mobilefuse.sdk.AdRendererListener;
import com.mobilefuse.sdk.BaseAdRenderer;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.StoryboardListener;
import com.mobilefuse.sdk.config.ObservableConfig;
import com.mobilefuse.sdk.config.ObservableConfigKey;
import com.mobilefuse.sdk.config.Observer;
import com.mobilefuse.sdk.exception.BaseError;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.internal.RtbLossReason;
import com.mobilefuse.sdk.mraid.MraidAdRenderer;
import com.mobilefuse.sdk.omid.OmidBridge;
import com.mobilefuse.sdk.state.mute.AdMuteStateManager;
import com.mobilefuse.sdk.state.mute.AdMutedState;
import com.mobilefuse.sdk.storyboard.overlay.OverlayContainer;
import com.mobilefuse.sdk.storyboard.overlay.OverlayResponse;
import com.mobilefuse.sdk.storyboard.overlay.OverlayView;
import com.mobilefuse.sdk.vast.VastAdRenderer;
import com.mobilefuse.sdk.video.AdmClickInfoProvider;
import com.mobilefuse.sdk.video.ClickthroughBehaviour;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: StoryboardAdRenderer.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 A2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001AB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0002J\u0010\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u000bH\u0002J\b\u0010\u001c\u001a\u00020\u0018H\u0002J'\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010\"H\u0001¢\u0006\u0002\b#J\u0015\u0010$\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001fH\u0001¢\u0006\u0002\b%J\b\u0010&\u001a\u00020'H\u0002J\b\u0010(\u001a\u00020\u0018H\u0016J\b\u0010)\u001a\u00020\u0018H\u0002J\b\u0010*\u001a\u00020+H\u0016J\u0012\u0010,\u001a\u00020-2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0014J\b\u0010.\u001a\u00020\u0018H\u0002J\b\u0010/\u001a\u000200H\u0002J\b\u00101\u001a\u000200H\u0002J\u001a\u00102\u001a\u0002032\u0006\u0010\u001e\u001a\u00020\u001f2\b\u00104\u001a\u0004\u0018\u000103H\u0002J\b\u00105\u001a\u00020\u0018H\u0002J\u0012\u00106\u001a\u00020\u00182\b\u00107\u001a\u0004\u0018\u000108H\u0014J\b\u00109\u001a\u00020\u0018H\u0002J\b\u0010:\u001a\u00020\u0018H\u0014J\b\u0010;\u001a\u00020\u0018H\u0002J\b\u0010<\u001a\u00020\u0018H\u0002J\b\u0010=\u001a\u00020\u0018H\u0002J\u0018\u0010>\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010?\u001a\u00020\u0018H\u0002J\b\u0010@\u001a\u00020\u0018H\u0002R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006B"}, d2 = {"Lcom/mobilefuse/sdk/storyboard/StoryboardAdRenderer;", "Lcom/mobilefuse/sdk/BaseAdRenderer;", "Lcom/mobilefuse/sdk/storyboard/StoryboardOmidBridge;", "context", "Landroid/content/Context;", "config", "Lcom/mobilefuse/sdk/AdRendererConfig;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/mobilefuse/sdk/AdRendererListener;", "(Landroid/content/Context;Lcom/mobilefuse/sdk/AdRendererConfig;Lcom/mobilefuse/sdk/AdRendererListener;)V", "currentPage", "Lcom/mobilefuse/sdk/storyboard/StoryboardAdView;", "currentPageToMainObserver", "Lcom/mobilefuse/sdk/config/Observer;", "errorCounter", "", "listAdRenders", "", "loadedAdsCounter", "mainObserverToCurrentPage", "overlayContainer", "Lcom/mobilefuse/sdk/storyboard/overlay/OverlayContainer;", "renderedAdsCounter", "addOverlayView", "", "appendAdView", "createAdRenderListener", "view", "createContainer", "createOverlayContainer", "admResponse", "Lcom/mobilefuse/sdk/storyboard/StoryboardAdmResponse;", "parentConfig", "admClickInfoProvider", "Lcom/mobilefuse/sdk/video/AdmClickInfoProvider;", "createOverlayContainer$mobilefuse_sdk_core_release", "createStoryboardAdView", "createStoryboardAdView$mobilefuse_sdk_core_release", "createStoryboardListener", "Lcom/mobilefuse/sdk/StoryboardListener;", "destroy", "destroyCurrentRender", "getAdView", "Landroid/view/View;", "getOnLayoutChangeListener", "Landroid/view/View$OnLayoutChangeListener;", "handleAdmInfoProvider", "isLastIndex", "", "isTheLastPage", "mergeObservableConfig", "Lcom/mobilefuse/sdk/config/ObservableConfig;", "observableConfig", "onRenderError", "preloadAdmImpl", "adm", "", "registerOverlayAsOmidFriendlyObstruction", "renderAdmImpl", "saveCurrentPageAdmInfoProvider", "showAdRender", "unregisterOverlayAsOmidFriendlyObstruction", "updateConfigForPage", "updateCurrentPageAdmInfoProvider", "verifyPreloadEvent", "Companion", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes.dex */
public final class StoryboardAdRenderer extends BaseAdRenderer<StoryboardOmidBridge> {
    public static final float DEFAULT_END_CARD_CLOSE_SECONDS = 0.0f;
    public static final int DEFAULT_MAX_END_CARDS = 1;
    private StoryboardAdView currentPage;
    private Observer currentPageToMainObserver;
    private int errorCounter;
    private final List<StoryboardAdView> listAdRenders;
    private int loadedAdsCounter;
    private Observer mainObserverToCurrentPage;
    private OverlayContainer overlayContainer;
    private int renderedAdsCounter;

    private final void appendAdView() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            AdRendererContainer adRendererContainer = this.contentContainer;
            if (adRendererContainer != null) {
                adRendererContainer.addView(this.currentPage);
            }
            AdRendererContainer adRendererContainer2 = this.contentContainer;
            if (adRendererContainer2 != null) {
                adRendererContainer2.setClipChildren(false);
            }
        } catch (Throwable th) {
            int i = StoryboardAdRenderer$appendAdView$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    private final void destroyCurrentRender() {
        StoryboardAdView storyboardAdView;
        AdRendererConfig config;
        ObservableConfig observableConfig;
        ObservableConfig observableConfig2;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            OverlayContainer overlayContainer = this.overlayContainer;
            if (overlayContainer != null) {
                if (overlayContainer != null) {
                    overlayContainer.removeView();
                }
                this.overlayContainer = null;
            }
            Observer observer = this.mainObserverToCurrentPage;
            if (observer != null && (observableConfig2 = this.observableConfig) != null) {
                observableConfig2.unregisterObserver(observer);
            }
            Observer observer2 = this.currentPageToMainObserver;
            if (observer2 != null && (storyboardAdView = this.currentPage) != null && (config = storyboardAdView.getConfig()) != null && (observableConfig = config.getObservableConfig()) != null) {
                observableConfig.unregisterObserver(observer2);
            }
            AdRendererContainer adRendererContainer = this.contentContainer;
            if (adRendererContainer != null) {
                adRendererContainer.removeAllViews();
            }
            StoryboardAdView storyboardAdView2 = this.currentPage;
            if (storyboardAdView2 != null) {
                storyboardAdView2.destroy();
            }
            this.currentPage = null;
        } catch (Throwable th) {
            int i = StoryboardAdRenderer$destroyCurrentRender$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryboardAdRenderer(@NotNull Context context, @NotNull AdRendererConfig config, @NotNull AdRendererListener listener) {
        super(context, config, listener);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listAdRenders = new ArrayList();
        createContainer();
    }

    @VisibleForTesting
    public final void createStoryboardAdView$mobilefuse_sdk_core_release(@NotNull StoryboardAdmResponse admResponse) {
        Intrinsics.checkNotNullParameter(admResponse, "admResponse");
        try {
            StoryboardAdView storyboardAdView = new StoryboardAdView(this.context, updateConfigForPage(this.config, admResponse), admResponse, createStoryboardListener(), new Function0() { // from class: com.mobilefuse.sdk.storyboard.StoryboardAdRenderer$createStoryboardAdView$view$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* renamed from: invoke */
                public final Activity mo4828invoke() {
                    return StoryboardAdRenderer.this.renderingActivity;
                }
            }, new Function0() { // from class: com.mobilefuse.sdk.storyboard.StoryboardAdRenderer$createStoryboardAdView$view$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo4828invoke() {
                    invoke();
                    return Unit.INSTANCE;
                }

                public final void invoke() {
                    boolean isTheLastPage;
                    isTheLastPage = StoryboardAdRenderer.this.isTheLastPage();
                    if (isTheLastPage) {
                        StoryboardAdRenderer.this.renderingActivity = null;
                    }
                }
            });
            this.listAdRenders.add(storyboardAdView);
            storyboardAdView.updateListener(createAdRenderListener(storyboardAdView));
            storyboardAdView.prepareRenderer();
            String adm = admResponse.getAdm();
            if (adm != null) {
                storyboardAdView.preload(adm);
            }
            if (admResponse.getOverlay() != null) {
                storyboardAdView.setContainsOverlay(true);
            }
        } catch (Throwable th) {
            this.listener.onAdRuntimeError(RtbLossReason.INVALID_MARKUP);
            StabilityHelper.logException(this, th);
        }
    }

    @VisibleForTesting
    public final void createOverlayContainer$mobilefuse_sdk_core_release(@NotNull StoryboardAdmResponse admResponse, @NotNull AdRendererConfig parentConfig, @Nullable AdmClickInfoProvider admClickInfoProvider) {
        Intrinsics.checkNotNullParameter(admResponse, "admResponse");
        Intrinsics.checkNotNullParameter(parentConfig, "parentConfig");
        OverlayResponse overlay = admResponse.getOverlay();
        this.overlayContainer = overlay != null ? new OverlayContainer(this.context, overlay, parentConfig, new StoryboardAdRenderer$createOverlayContainer$1$1(this), new StoryboardAdRenderer$createOverlayContainer$1$2(this), admClickInfoProvider) : null;
    }

    private final AdRendererListener createAdRenderListener(final StoryboardAdView view) {
        return new AdRendererListener() { // from class: com.mobilefuse.sdk.storyboard.StoryboardAdRenderer$createAdRenderListener$1
            @Override // com.mobilefuse.sdk.AdRendererListener
            public void onPreloadStatusChange(boolean isPreloaded) {
                int i;
                int i2;
                StoryboardAdRenderer storyboardAdRenderer = StoryboardAdRenderer.this;
                i = storyboardAdRenderer.loadedAdsCounter;
                storyboardAdRenderer.loadedAdsCounter = i + 1;
                view.setValidToShow(isPreloaded);
                if (!isPreloaded) {
                    StoryboardAdRenderer storyboardAdRenderer2 = StoryboardAdRenderer.this;
                    i2 = storyboardAdRenderer2.errorCounter;
                    storyboardAdRenderer2.errorCounter = i2 + 1;
                }
                StoryboardAdRenderer.this.verifyPreloadEvent();
            }

            /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
            
                r0 = r2.this$0.overlayContainer;
             */
            @Override // com.mobilefuse.sdk.AdRendererListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onAdImpression() {
                int i;
                OverlayContainer overlayContainer;
                OverlayContainer overlayContainer2;
                AdRendererListener adRendererListener;
                i = StoryboardAdRenderer.this.renderedAdsCounter;
                if (i == 1) {
                    adRendererListener = ((BaseAdRenderer) StoryboardAdRenderer.this).listener;
                    adRendererListener.onAdImpression();
                }
                overlayContainer = StoryboardAdRenderer.this.overlayContainer;
                if (overlayContainer == null || overlayContainer2 == null) {
                    return;
                }
                overlayContainer2.showOverlayTimer();
            }

            @Override // com.mobilefuse.sdk.AdRendererListener
            public void onFullscreenChanged(boolean isFullscreen) {
                AdRendererListener adRendererListener;
                adRendererListener = ((BaseAdRenderer) StoryboardAdRenderer.this).listener;
                adRendererListener.onFullscreenChanged(isFullscreen);
            }

            @Override // com.mobilefuse.sdk.AdRendererListener
            public void onAdClicked(@Nullable String url) {
                AdRendererListener adRendererListener;
                adRendererListener = ((BaseAdRenderer) StoryboardAdRenderer.this).listener;
                adRendererListener.onAdClicked(url);
            }

            @Override // com.mobilefuse.sdk.AdRendererListener
            public void onAdClosed() {
                int i;
                List list;
                AdRendererListener adRendererListener;
                i = StoryboardAdRenderer.this.renderedAdsCounter;
                list = StoryboardAdRenderer.this.listAdRenders;
                if (i > list.size() - 1) {
                    adRendererListener = ((BaseAdRenderer) StoryboardAdRenderer.this).listener;
                    adRendererListener.onAdClosed();
                } else {
                    StoryboardAdRenderer.this.showAdRender();
                }
            }

            @Override // com.mobilefuse.sdk.AdRendererListener
            public void onAdRuntimeError(@Nullable RtbLossReason error) {
                int i;
                int i2;
                int i3;
                List list;
                AdRendererListener adRendererListener;
                view.setValidToShow(false);
                StoryboardAdRenderer storyboardAdRenderer = StoryboardAdRenderer.this;
                i = storyboardAdRenderer.loadedAdsCounter;
                storyboardAdRenderer.loadedAdsCounter = i + 1;
                StoryboardAdRenderer storyboardAdRenderer2 = StoryboardAdRenderer.this;
                i2 = storyboardAdRenderer2.errorCounter;
                storyboardAdRenderer2.errorCounter = i2 + 1;
                i3 = StoryboardAdRenderer.this.errorCounter;
                list = StoryboardAdRenderer.this.listAdRenders;
                if (i3 == list.size()) {
                    adRendererListener = ((BaseAdRenderer) StoryboardAdRenderer.this).listener;
                    adRendererListener.onAdRuntimeError(error);
                } else {
                    StoryboardAdRenderer.this.verifyPreloadEvent();
                }
            }
        };
    }

    @Override // com.mobilefuse.sdk.BaseAdRenderer
    @NotNull
    public View getAdView() {
        AdRendererContainer adRendererContainer = this.contentContainer;
        return adRendererContainer != null ? adRendererContainer : new View(this.context);
    }

    @Override // com.mobilefuse.sdk.BaseAdRenderer
    protected void preloadAdmImpl(@Nullable String adm) {
        try {
            if (adm != null) {
                JSONArray jSONArray = new JSONArray(adm);
                int length = jSONArray.length();
                int length2 = jSONArray.length();
                int i = 0;
                for (int i2 = 0; i2 < length2; i2++) {
                    Either<BaseError, StoryboardAdmResponse> admStoryboardResponseParse = StoryboardAdmResponse.INSTANCE.admStoryboardResponseParse(jSONArray.get(i2).toString());
                    if (admStoryboardResponseParse instanceof ErrorResult) {
                        i++;
                        if (i == length) {
                            this.listener.onAdRuntimeError(RtbLossReason.INVALID_MARKUP);
                        }
                    }
                    if (admStoryboardResponseParse instanceof SuccessResult) {
                        createStoryboardAdView$mobilefuse_sdk_core_release((StoryboardAdmResponse) ((SuccessResult) admStoryboardResponseParse).getValue());
                    }
                }
                createContainer();
                return;
            }
            this.listener.onAdRuntimeError(RtbLossReason.MISSING_MARKUP);
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showAdRender() {
        try {
            if (this.contentContainer != null && this.currentPage != null) {
                destroyCurrentRender();
            }
            StoryboardAdView storyboardAdView = this.listAdRenders.get(this.renderedAdsCounter);
            StoryboardAdView storyboardAdView2 = storyboardAdView;
            this.currentPage = storyboardAdView2;
            this.renderedAdsCounter++;
            if (storyboardAdView == null) {
                onRenderError();
                return;
            }
            if (storyboardAdView2 != null && storyboardAdView2.getIsValidToShow()) {
                appendAdView();
                handleAdmInfoProvider();
                StoryboardAdView storyboardAdView3 = this.currentPage;
                if (storyboardAdView3 != null) {
                    storyboardAdView3.showAd();
                }
                addOverlayView();
                return;
            }
            onRenderError();
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
            this.listener.onAdRuntimeError(RtbLossReason.INTERNAL_ERROR);
        }
    }

    private final void handleAdmInfoProvider() {
        StoryboardAdView storyboardAdView = this.currentPage;
        BaseAdRenderer<OmidBridge> adRenderer$mobilefuse_sdk_core_release = storyboardAdView != null ? storyboardAdView.getAdRenderer$mobilefuse_sdk_core_release() : null;
        if (this.admClickInfoProvider == null && (adRenderer$mobilefuse_sdk_core_release instanceof VastAdRenderer)) {
            saveCurrentPageAdmInfoProvider();
        } else if (adRenderer$mobilefuse_sdk_core_release instanceof MraidAdRenderer) {
            updateCurrentPageAdmInfoProvider();
        }
    }

    private final void addOverlayView() {
        StoryboardAdView storyboardAdView;
        StoryboardAdmResponse admResponse;
        StoryboardAdView storyboardAdView2;
        AdRendererConfig config;
        AdRendererContainer adRendererContainer;
        StoryboardAdView storyboardAdView3 = this.currentPage;
        if (storyboardAdView3 != null) {
            if (!storyboardAdView3.getContainsOverlay()) {
                storyboardAdView3 = null;
            }
            if (storyboardAdView3 == null || (storyboardAdView = this.currentPage) == null || (admResponse = storyboardAdView.getAdmResponse()) == null || (storyboardAdView2 = this.currentPage) == null || (config = storyboardAdView2.getConfig()) == null) {
                return;
            }
            createOverlayContainer$mobilefuse_sdk_core_release(admResponse, config, this.admClickInfoProvider);
            OverlayContainer overlayContainer = this.overlayContainer;
            if (overlayContainer == null || (adRendererContainer = this.contentContainer) == null) {
                return;
            }
            adRendererContainer.addView(overlayContainer != null ? overlayContainer.getOverlayView() : null);
        }
    }

    private final void onRenderError() {
        if (this.renderedAdsCounter < this.listAdRenders.size()) {
            showAdRender();
        } else {
            this.listener.onAdClosed();
        }
    }

    @Override // com.mobilefuse.sdk.BaseAdRenderer
    protected void renderAdmImpl() {
        showAdRender();
    }

    @Override // com.mobilefuse.sdk.BaseAdRenderer
    @NotNull
    protected View.OnLayoutChangeListener getOnLayoutChangeListener(@Nullable Context context) {
        return new View.OnLayoutChangeListener() { // from class: com.mobilefuse.sdk.storyboard.StoryboardAdRenderer$getOnLayoutChangeListener$1
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            }
        };
    }

    private final boolean isLastIndex() {
        return this.loadedAdsCounter == this.listAdRenders.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isTheLastPage() {
        return this.renderedAdsCounter >= this.listAdRenders.size();
    }

    private final AdRendererConfig updateConfigForPage(AdRendererConfig config, StoryboardAdmResponse admResponse) {
        AdRendererConfig copy;
        try {
            Boolean muted = admResponse.getMuted();
            if (muted != null) {
                final boolean booleanValue = muted.booleanValue();
                AdMuteStateManager adMuteStateManager = this.adMuteStateManager;
                if (adMuteStateManager != null) {
                    adMuteStateManager.update(new Function1() { // from class: com.mobilefuse.sdk.storyboard.StoryboardAdRenderer$updateConfigForPage$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        @NotNull
                        public final AdMutedState invoke(@NotNull AdMutedState receiver) {
                            Intrinsics.checkNotNullParameter(receiver, "$receiver");
                            return AdMutedState.copy$default(receiver, booleanValue, null, 2, null);
                        }
                    });
                }
            }
            AdMuteStateManager adMuteStateManager2 = this.adMuteStateManager;
            String uiAdm = admResponse.getUiAdm();
            copy = config.copy((r37 & 1) != 0 ? config.sdkName : null, (r37 & 2) != 0 ? config.sdkVersion : null, (r37 & 4) != 0 ? config.advertisingId : null, (r37 & 8) != 0 ? config.isLimitTrackingEnabled : false, (r37 & 16) != 0 ? config.isSubjectToCoppa : false, (r37 & 32) != 0 ? config.isTestMode : false, (r37 & 64) != 0 ? config.isFullscreenAd : false, (r37 & 128) != 0 ? config.isCloseButtonEnabled : false, (r37 & 256) != 0 ? config.isThumbnailSize : false, (r37 & 512) != 0 ? config.isTransparentBackground : false, (r37 & 1024) != 0 ? config.adWidth : 0, (r37 & 2048) != 0 ? config.adHeight : 0, (r37 & 4096) != 0 ? config.deviceIp : null, (r37 & 8192) != 0 ? config.extendedAdType : null, (r37 & 16384) != 0 ? config.observableConfig : mergeObservableConfig(admResponse, config.getObservableConfig()), (r37 & 32768) != 0 ? config.adInstanceId : 0, (r37 & 65536) != 0 ? config.closeConfigResponse : admResponse.getCloseConfigResponse(), (r37 & 131072) != 0 ? config.uiAdm : uiAdm, (r37 & 262144) != 0 ? config.adMuteStateManager : adMuteStateManager2);
            return copy;
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
            return new AdRendererConfig(null, null, null, false, false, false, false, false, false, false, 0, 0, null, null, null, 0, null, null, null, 524287, null);
        }
    }

    private final void createContainer() {
        try {
            if (this.contentContainer != null) {
                return;
            }
            AdRendererContainer adRendererContainer = new AdRendererContainer(this.context);
            adRendererContainer.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            Unit unit = Unit.INSTANCE;
            this.contentContainer = adRendererContainer;
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void verifyPreloadEvent() {
        if (isLastIndex()) {
            this.listener.onPreloadStatusChange(this.errorCounter < this.listAdRenders.size());
        }
    }

    @Override // com.mobilefuse.sdk.BaseAdRenderer
    public void destroy() {
        destroyCurrentRender();
        this.overlayContainer = null;
        this.contentContainer = null;
        this.currentPage = null;
        super.destroy();
    }

    private final StoryboardListener createStoryboardListener() {
        return new StoryboardListener() { // from class: com.mobilefuse.sdk.storyboard.StoryboardAdRenderer$createStoryboardListener$1
            @Override // com.mobilefuse.sdk.StoryboardListener
            public void showOverlay(@NotNull Uri uri) {
                OverlayContainer overlayContainer;
                OverlayContainer overlayContainer2;
                StoryboardAdView storyboardAdView;
                OverlayContainer overlayContainer3;
                OverlayView overlayView;
                AdRendererContainer adRendererContainer;
                OverlayContainer overlayContainer4;
                AdRendererConfig config;
                OverlayContainer overlayContainer5;
                Context context;
                Intrinsics.checkNotNullParameter(uri, "uri");
                String queryParameter = uri.getQueryParameter("overlay");
                if (queryParameter == null || Intrinsics.areEqual(queryParameter, "undefined")) {
                    overlayContainer = StoryboardAdRenderer.this.overlayContainer;
                    if (overlayContainer != null) {
                        overlayContainer.showOverlay();
                        return;
                    }
                    return;
                }
                overlayContainer2 = StoryboardAdRenderer.this.overlayContainer;
                if (overlayContainer2 != null) {
                    overlayContainer2.removeView();
                }
                JSONObject jSONObject = new JSONObject(queryParameter);
                StoryboardAdRenderer storyboardAdRenderer = StoryboardAdRenderer.this;
                storyboardAdView = storyboardAdRenderer.currentPage;
                OverlayContainer overlayContainer6 = null;
                if (storyboardAdView != null && (config = storyboardAdView.getConfig()) != null) {
                    OverlayContainer.Companion companion = OverlayContainer.INSTANCE;
                    overlayContainer5 = StoryboardAdRenderer.this.overlayContainer;
                    OverlayResponse parseOverlay = companion.parseOverlay(jSONObject, overlayContainer5 != null ? overlayContainer5.getResponse() : null);
                    if (parseOverlay != null) {
                        context = ((BaseAdRenderer) StoryboardAdRenderer.this).context;
                        overlayContainer6 = new OverlayContainer(context, parseOverlay, config, new StoryboardAdRenderer$createStoryboardListener$1$showOverlay$1$1$1(StoryboardAdRenderer.this), new StoryboardAdRenderer$createStoryboardListener$1$showOverlay$1$1$2(StoryboardAdRenderer.this), StoryboardAdRenderer.this.admClickInfoProvider);
                    }
                }
                storyboardAdRenderer.overlayContainer = overlayContainer6;
                overlayContainer3 = StoryboardAdRenderer.this.overlayContainer;
                if (overlayContainer3 == null || (overlayView = overlayContainer3.getOverlayView()) == null) {
                    return;
                }
                adRendererContainer = ((BaseAdRenderer) StoryboardAdRenderer.this).contentContainer;
                if (adRendererContainer != null) {
                    adRendererContainer.addView(overlayView);
                }
                overlayContainer4 = StoryboardAdRenderer.this.overlayContainer;
                if (overlayContainer4 != null) {
                    overlayContainer4.showOverlay();
                }
            }

            @Override // com.mobilefuse.sdk.StoryboardListener
            public void hideOverlay() {
                OverlayContainer overlayContainer;
                overlayContainer = StoryboardAdRenderer.this.overlayContainer;
                if (overlayContainer != null) {
                    overlayContainer.hideOverlay();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerOverlayAsOmidFriendlyObstruction() {
        OverlayView overlayView;
        StoryboardAdView storyboardAdView;
        BaseAdRenderer<OmidBridge> adRenderer$mobilefuse_sdk_core_release;
        OverlayContainer overlayContainer = this.overlayContainer;
        if (overlayContainer == null || (overlayView = overlayContainer.getOverlayView()) == null || (storyboardAdView = this.currentPage) == null || (adRenderer$mobilefuse_sdk_core_release = storyboardAdView.getAdRenderer$mobilefuse_sdk_core_release()) == null) {
            return;
        }
        adRenderer$mobilefuse_sdk_core_release.registerExternalFriendlyObstruction(overlayView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void unregisterOverlayAsOmidFriendlyObstruction() {
        OverlayView overlayView;
        StoryboardAdView storyboardAdView;
        BaseAdRenderer<OmidBridge> adRenderer$mobilefuse_sdk_core_release;
        OverlayContainer overlayContainer = this.overlayContainer;
        if (overlayContainer == null || (overlayView = overlayContainer.getOverlayView()) == null || (storyboardAdView = this.currentPage) == null || (adRenderer$mobilefuse_sdk_core_release = storyboardAdView.getAdRenderer$mobilefuse_sdk_core_release()) == null) {
            return;
        }
        adRenderer$mobilefuse_sdk_core_release.unregisterExternalFriendlyObstruction(overlayView);
    }

    private final void saveCurrentPageAdmInfoProvider() {
        try {
            if (this.admClickInfoProvider == null) {
                StoryboardAdView storyboardAdView = this.currentPage;
                this.admClickInfoProvider = storyboardAdView != null ? storyboardAdView.getCurrentAdmClickInfoProvider$mobilefuse_sdk_core_release() : null;
            }
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
        }
    }

    private final void updateCurrentPageAdmInfoProvider() {
        StoryboardAdView storyboardAdView;
        BaseAdRenderer<OmidBridge> adRenderer$mobilefuse_sdk_core_release;
        if (this.admClickInfoProvider == null || (storyboardAdView = this.currentPage) == null || (adRenderer$mobilefuse_sdk_core_release = storyboardAdView.getAdRenderer$mobilefuse_sdk_core_release()) == null) {
            return;
        }
        adRenderer$mobilefuse_sdk_core_release.admClickInfoProvider = this.admClickInfoProvider;
    }

    private final ObservableConfig mergeObservableConfig(StoryboardAdmResponse admResponse, ObservableConfig observableConfig) {
        if (observableConfig == null) {
            observableConfig = new ObservableConfig();
        }
        ObservableConfig copy = observableConfig.copy();
        Boolean muted = admResponse.getMuted();
        if (muted != null) {
            copy.setValue(ObservableConfigKey.AWAITING_MUTED, muted);
        }
        copy.setValue(ObservableConfigKey.ADM_CLICK_INFO_ENABLED, Boolean.TRUE);
        ObservableConfig.mergeValue$default(copy, ObservableConfigKey.FORCE_SKIP_SECONDS, admResponse.getForceSkipSeconds(), null, 4, null);
        ObservableConfig.mergeValue$default(copy, ObservableConfigKey.BLOCK_SKIP_SECONDS, admResponse.getBlockSkipSeconds(), null, 4, null);
        copy.mergeValue(ObservableConfigKey.VIDEO_CLICK_THROUGH_BEHAVIOUR, admResponse.getClickBehavior(), ClickthroughBehaviour.CTA_AND_VIDEO);
        copy.mergeValue(ObservableConfigKey.MAX_END_CARDS, admResponse.getMaxEndCards(), 1);
        copy.mergeValue(ObservableConfigKey.END_CARD_CLOSE_SECONDS, admResponse.getEndCardCloseSeconds(), Float.valueOf(0.0f));
        return copy;
    }
}
