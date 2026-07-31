package com.mobilefuse.sdk.storyboard;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mobilefuse.sdk.AdRendererConfig;
import com.mobilefuse.sdk.AdRendererListener;
import com.mobilefuse.sdk.AdRendererType;
import com.mobilefuse.sdk.BaseAdRenderer;
import com.mobilefuse.sdk.DebuggingKt;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.StoryboardListener;
import com.mobilefuse.sdk.component.AdRendererComponent;
import com.mobilefuse.sdk.component.ComponentRegistrar;
import com.mobilefuse.sdk.component.ComponentType;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.internal.RtbLossReason;
import com.mobilefuse.sdk.mraid.MraidAdRenderer;
import com.mobilefuse.sdk.network.model.AdmMediaType;
import com.mobilefuse.sdk.omid.OmidBridge;
import com.mobilefuse.sdk.omid.OmidService;
import com.mobilefuse.sdk.video.AdmClickInfoProvider;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.h;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: StoryboardAdView.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b¢\u0006\u0002\u0010\u000fJ\u0014\u0010.\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u000e0/H\u0002J\u0006\u00101\u001a\u00020\u000eJ\u0015\u00102\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u0000¢\u0006\u0002\b3J\u000f\u00104\u001a\u0004\u0018\u000105H\u0000¢\u0006\u0002\b6J\u000e\u00107\u001a\u00020\u000e2\u0006\u00108\u001a\u000209J\u0006\u0010:\u001a\u00020\u000eJ\b\u0010;\u001a\u00020\u000eH\u0002J\u0006\u0010<\u001a\u00020\u000eJ\u000e\u0010=\u001a\u00020\u000e2\u0006\u0010>\u001a\u00020'R\u0016\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0019\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u001a\u0010$\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001e\"\u0004\b%\u0010 R\u001c\u0010&\u001a\u0004\u0018\u00010'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-¨\u0006?"}, d2 = {"Lcom/mobilefuse/sdk/storyboard/StoryboardAdView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "config", "Lcom/mobilefuse/sdk/AdRendererConfig;", "admResponse", "Lcom/mobilefuse/sdk/storyboard/StoryboardAdmResponse;", "storyboardListener", "Lcom/mobilefuse/sdk/StoryboardListener;", "getRenderingActivity", "Lkotlin/Function0;", "Landroid/app/Activity;", "destroyRenderingActivity", "", "(Landroid/content/Context;Lcom/mobilefuse/sdk/AdRendererConfig;Lcom/mobilefuse/sdk/storyboard/StoryboardAdmResponse;Lcom/mobilefuse/sdk/StoryboardListener;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "adRenderer", "Lcom/mobilefuse/sdk/BaseAdRenderer;", "Lcom/mobilefuse/sdk/omid/OmidBridge;", "adView", "Landroid/view/View;", "getAdmResponse", "()Lcom/mobilefuse/sdk/storyboard/StoryboardAdmResponse;", "component", "Lcom/mobilefuse/sdk/component/AdRendererComponent;", "getConfig", "()Lcom/mobilefuse/sdk/AdRendererConfig;", "containsOverlay", "", "getContainsOverlay", "()Z", "setContainsOverlay", "(Z)V", "getDestroyRenderingActivity", "()Lkotlin/jvm/functions/Function0;", "getGetRenderingActivity", "isValidToShow", "setValidToShow", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/mobilefuse/sdk/AdRendererListener;", "getListener", "()Lcom/mobilefuse/sdk/AdRendererListener;", "setListener", "(Lcom/mobilefuse/sdk/AdRendererListener;)V", "getStoryboardListener", "()Lcom/mobilefuse/sdk/StoryboardListener;", "appendView", "Lcom/mobilefuse/sdk/exception/Either;", "", "destroy", "getAdRenderer", "getAdRenderer$mobilefuse_sdk_core_release", "getCurrentAdmClickInfoProvider", "Lcom/mobilefuse/sdk/video/AdmClickInfoProvider;", "getCurrentAdmClickInfoProvider$mobilefuse_sdk_core_release", "preload", "adm", "", "prepareRenderer", "setMraidListener", h.aj, "updateListener", "listenerUpdated", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
@SuppressLint({"ViewConstructor"})
/* loaded from: classes9.dex */
public final class StoryboardAdView extends RelativeLayout {
    private BaseAdRenderer<OmidBridge> adRenderer;
    private View adView;

    @NotNull
    private final StoryboardAdmResponse admResponse;
    private AdRendererComponent component;

    @NotNull
    private final AdRendererConfig config;
    private boolean containsOverlay;

    @NotNull
    private final Function0 destroyRenderingActivity;

    @NotNull
    private final Function0 getRenderingActivity;
    private boolean isValidToShow;

    @Nullable
    private AdRendererListener listener;

    @NotNull
    private final StoryboardListener storyboardListener;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 3})
    /* loaded from: classes5.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdmMediaType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[AdmMediaType.BANNER.ordinal()] = 1;
            iArr[AdmMediaType.VIDEO.ordinal()] = 2;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.E, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final void destroy() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            this.destroyRenderingActivity.mo4828invoke();
            BaseAdRenderer<OmidBridge> baseAdRenderer = this.adRenderer;
            if (baseAdRenderer != null) {
                baseAdRenderer.destroy();
            }
            this.adRenderer = null;
        } catch (Throwable th) {
            int i = StoryboardAdView$destroy$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @NotNull
    public final AdRendererConfig getConfig() {
        return this.config;
    }

    @NotNull
    public final StoryboardAdmResponse getAdmResponse() {
        return this.admResponse;
    }

    @NotNull
    public final StoryboardListener getStoryboardListener() {
        return this.storyboardListener;
    }

    @NotNull
    public final Function0 getGetRenderingActivity() {
        return this.getRenderingActivity;
    }

    @NotNull
    public final Function0 getDestroyRenderingActivity() {
        return this.destroyRenderingActivity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryboardAdView(@NotNull Context context, @NotNull AdRendererConfig config, @NotNull StoryboardAdmResponse admResponse, @NotNull StoryboardListener storyboardListener, @NotNull Function0 getRenderingActivity, @NotNull Function0 destroyRenderingActivity) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(admResponse, "admResponse");
        Intrinsics.checkNotNullParameter(storyboardListener, "storyboardListener");
        Intrinsics.checkNotNullParameter(getRenderingActivity, "getRenderingActivity");
        Intrinsics.checkNotNullParameter(destroyRenderingActivity, "destroyRenderingActivity");
        this.config = config;
        this.admResponse = admResponse;
        this.storyboardListener = storyboardListener;
        this.getRenderingActivity = getRenderingActivity;
        this.destroyRenderingActivity = destroyRenderingActivity;
        setBackgroundColor(0);
    }

    @Nullable
    public final AdRendererListener getListener() {
        return this.listener;
    }

    public final void setListener(@Nullable AdRendererListener adRendererListener) {
        this.listener = adRendererListener;
    }

    /* renamed from: isValidToShow, reason: from getter */
    public final boolean getIsValidToShow() {
        return this.isValidToShow;
    }

    public final void setValidToShow(boolean z) {
        this.isValidToShow = z;
    }

    public final boolean getContainsOverlay() {
        return this.containsOverlay;
    }

    public final void setContainsOverlay(boolean z) {
        this.containsOverlay = z;
    }

    public final void updateListener(@NotNull AdRendererListener listenerUpdated) {
        Intrinsics.checkNotNullParameter(listenerUpdated, "listenerUpdated");
        this.listener = listenerUpdated;
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [T extends com.mobilefuse.sdk.omid.OmidBridge, com.mobilefuse.sdk.omid.OmidBridge] */
    /* JADX WARN: Type inference failed for: r2v3, types: [T extends com.mobilefuse.sdk.omid.OmidBridge, com.mobilefuse.sdk.omid.OmidBridge] */
    public final void prepareRenderer() {
        AdRendererListener adRendererListener = this.listener;
        if (adRendererListener == null) {
            return;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[this.admResponse.getType().ordinal()];
        BaseAdRenderer<OmidBridge> baseAdRenderer = null;
        if (i == 1) {
            AdRendererComponent registeredComponent = ComponentRegistrar.getRegisteredComponent(ComponentType.MRAID_AD_RENDERER);
            this.component = registeredComponent;
            if (registeredComponent != null) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "context");
                baseAdRenderer = registeredComponent.createInstance(context, this.config, adRendererListener);
            }
            this.adRenderer = baseAdRenderer;
            setMraidListener();
            BaseAdRenderer<OmidBridge> baseAdRenderer2 = this.adRenderer;
            if (baseAdRenderer2 != null) {
                baseAdRenderer2.omidBridge = OmidService.createOmidBridge(AdRendererType.MRAID);
            }
        } else if (i == 2) {
            AdRendererComponent registeredComponent2 = ComponentRegistrar.getRegisteredComponent(ComponentType.VAST_AD_RENDERER);
            this.component = registeredComponent2;
            if (registeredComponent2 != null) {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "context");
                baseAdRenderer = registeredComponent2.createInstance(context2, this.config, adRendererListener);
            }
            this.adRenderer = baseAdRenderer;
            if (baseAdRenderer != null) {
                baseAdRenderer.omidBridge = OmidService.createOmidBridge(AdRendererType.VAST);
            }
        }
        if (this.component == null) {
            DebuggingKt.logError$default(this, "Can't render. Ad Renderer Component registered", null, null, 6, null);
            adRendererListener.onAdRuntimeError(RtbLossReason.INTERNAL_ERROR);
        } else if (this.adRenderer == null) {
            DebuggingKt.logError$default(this, "Can't render. adRenderer instance is null", null, null, 6, null);
            adRendererListener.onAdRuntimeError(RtbLossReason.INTERNAL_ERROR);
        }
    }

    private final Either<Throwable, Unit> appendView() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            BaseAdRenderer<OmidBridge> baseAdRenderer = this.adRenderer;
            this.adView = baseAdRenderer != null ? baseAdRenderer.getAdViewProperty() : null;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            addView(this.adView, layoutParams);
            return new SuccessResult(Unit.INSTANCE);
        } catch (Throwable th) {
            if (StoryboardAdView$appendView$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$2[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            return new ErrorResult(th);
        }
    }

    public final void preload(@NotNull String adm) {
        Intrinsics.checkNotNullParameter(adm, "adm");
        BaseAdRenderer<OmidBridge> baseAdRenderer = this.adRenderer;
        if (baseAdRenderer != null && this.component != null) {
            if (baseAdRenderer != null) {
                baseAdRenderer.preloadAd(adm);
            }
        } else {
            AdRendererListener adRendererListener = this.listener;
            if (adRendererListener != null) {
                adRendererListener.onPreloadStatusChange(false);
            }
        }
    }

    public final void showAd() {
        BaseAdRenderer<OmidBridge> baseAdRenderer = this.adRenderer;
        if (baseAdRenderer == null) {
            AdRendererListener adRendererListener = this.listener;
            if (adRendererListener != null) {
                adRendererListener.onAdRuntimeError(RtbLossReason.INTERNAL_ERROR);
                return;
            }
            return;
        }
        if (baseAdRenderer != null) {
            baseAdRenderer.renderingActivity = (Activity) this.getRenderingActivity.mo4828invoke();
        }
        BaseAdRenderer<OmidBridge> baseAdRenderer2 = this.adRenderer;
        if (baseAdRenderer2 != null) {
            baseAdRenderer2.renderAd();
        }
        appendView();
    }

    private final void setMraidListener() {
        BaseAdRenderer<OmidBridge> baseAdRenderer = this.adRenderer;
        if (baseAdRenderer == null || !(baseAdRenderer instanceof MraidAdRenderer)) {
            return;
        }
        ((MraidAdRenderer) baseAdRenderer).setJsBridgeCallListener(new MraidAdRenderer.JsBridgeCallListener() { // from class: com.mobilefuse.sdk.storyboard.StoryboardAdView$setMraidListener$$inlined$run$lambda$1
            @Override // com.mobilefuse.sdk.mraid.MraidAdRenderer.JsBridgeCallListener
            public boolean onBridgeCall(@Nullable final Uri callUri) {
                String it;
                if (callUri == null || (it = callUri.getHost()) == null) {
                    return false;
                }
                Intrinsics.checkNotNullExpressionValue(it, "it");
                if (it.length() <= 0) {
                    it = null;
                }
                if (it == null) {
                    return false;
                }
                Intrinsics.checkNotNullExpressionValue(it, "callUri?.host?.takeIf { …Empty() } ?: return false");
                Function0 function0 = (Function0) MapsKt.mapOf(TuplesKt.to("showOverlay", new Function0() { // from class: com.mobilefuse.sdk.storyboard.StoryboardAdView$setMraidListener$$inlined$run$lambda$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                        StoryboardAdView.this.getStoryboardListener().showOverlay(callUri);
                    }
                }), TuplesKt.to("hideOverlay", new Function0() { // from class: com.mobilefuse.sdk.storyboard.StoryboardAdView$setMraidListener$$inlined$run$lambda$1.2
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
                        StoryboardAdView.this.getStoryboardListener().hideOverlay();
                    }
                })).get(it);
                if (function0 == null) {
                    return false;
                }
                function0.mo4828invoke();
                return true;
            }

            @Override // com.mobilefuse.sdk.mraid.MraidAdRenderer.JsBridgeCallListener
            @NotNull
            public Map<String, Boolean> getMraidSupportsList() {
                return MapsKt.mapOf(TuplesKt.to("overlay", Boolean.TRUE), TuplesKt.to("productStoreView", Boolean.FALSE));
            }
        });
    }

    @Nullable
    public final BaseAdRenderer<OmidBridge> getAdRenderer$mobilefuse_sdk_core_release() {
        return this.adRenderer;
    }

    @Nullable
    public final AdmClickInfoProvider getCurrentAdmClickInfoProvider$mobilefuse_sdk_core_release() {
        BaseAdRenderer<OmidBridge> baseAdRenderer = this.adRenderer;
        if (baseAdRenderer != null) {
            return baseAdRenderer.admClickInfoProvider;
        }
        return null;
    }
}
