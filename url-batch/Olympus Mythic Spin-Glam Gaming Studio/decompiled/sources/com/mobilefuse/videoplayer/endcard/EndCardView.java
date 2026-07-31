package com.mobilefuse.videoplayer.endcard;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mobilefuse.sdk.AdRendererConfig;
import com.mobilefuse.sdk.AdRendererListener;
import com.mobilefuse.sdk.BaseAdRenderer;
import com.mobilefuse.sdk.CloseConfigResponse;
import com.mobilefuse.sdk.DebuggingKt;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.assetsmanager.MobileFuseAssetManager;
import com.mobilefuse.sdk.component.AdRendererComponent;
import com.mobilefuse.sdk.component.ComponentRegistrar;
import com.mobilefuse.sdk.component.ComponentType;
import com.mobilefuse.sdk.concurrency.Schedulers;
import com.mobilefuse.sdk.concurrency.SchedulersKt;
import com.mobilefuse.sdk.config.ObservableConfig;
import com.mobilefuse.sdk.config.ObservableConfigKey;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.internal.RtbLossReason;
import com.mobilefuse.sdk.omid.OmidBridge;
import com.mobilefuse.sdk.rx.Flow;
import com.mobilefuse.sdk.rx.FlowCollector;
import com.mobilefuse.sdk.rx.FlowKt;
import com.mobilefuse.videoplayer.VideoPlayerSettings;
import com.mobilefuse.videoplayer.endcard.EndCardView;
import com.mobilefuse.videoplayer.endcard.scheduler.EndCardConfig;
import com.mobilefuse.videoplayer.model.VastBaseResource;
import com.mobilefuse.videoplayer.model.VastClickThrough;
import com.mobilefuse.videoplayer.model.VastCompanion;
import com.mobilefuse.videoplayer.model.VastError;
import com.mobilefuse.videoplayer.model.VastHtmlResource;
import com.mobilefuse.videoplayer.model.VastIFrameResource;
import com.mobilefuse.videoplayer.model.VastResourceType;
import com.mobilefuse.videoplayer.model.VastStaticResource;
import com.mobilefuse.videoplayer.model.VastTrackingEventType;
import com.mobilefuse.videoplayer.utils.MediaUtilsKt;
import com.mobilefuse.videoplayer.view.ViewCloseTrigger;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.h;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EndCardView.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u000eJ\u0019\u0010\u0015\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001b\u0010\u000eJ\u0017\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0011\u0010 \u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b \u0010!J!\u0010%\u001a\u00020\f2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\f0\"¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\f¢\u0006\u0004\b'\u0010\u000eJ\r\u0010(\u001a\u00020\f¢\u0006\u0004\b(\u0010\u000eJ\r\u0010)\u001a\u00020\f¢\u0006\u0004\b)\u0010\u000eR\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001c\u0010.\u001a\b\u0012\u0002\b\u0003\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00100\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00105\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00104R\u0016\u00106\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010;R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010?\u001a\u0004\b@\u0010A¨\u0006B"}, d2 = {"Lcom/mobilefuse/videoplayer/endcard/EndCardView;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/app/Activity;", "renderingActivity", "Lcom/mobilefuse/videoplayer/endcard/scheduler/EndCardConfig;", "config", "Lcom/mobilefuse/videoplayer/endcard/EndCardListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Landroid/content/Context;Landroid/app/Activity;Lcom/mobilefuse/videoplayer/endcard/scheduler/EndCardConfig;Lcom/mobilefuse/videoplayer/endcard/EndCardListener;)V", "", h.aj, "()V", "Lcom/mobilefuse/sdk/AdRendererListener;", "createAdRendererListener", "()Lcom/mobilefuse/sdk/AdRendererListener;", "triggerClickThrough", "Lcom/mobilefuse/videoplayer/model/VastClickThrough;", "clickThrough", "onClickThrough", "(Lcom/mobilefuse/videoplayer/model/VastClickThrough;)V", "Lcom/mobilefuse/videoplayer/view/ViewCloseTrigger;", "closeTrigger", "close", "(Lcom/mobilefuse/videoplayer/view/ViewCloseTrigger;)V", "cancelAutoCloseTimer", "Lcom/mobilefuse/sdk/rx/Flow;", "", "getResourceHtmlContentFlow", "()Lcom/mobilefuse/sdk/rx/Flow;", "getStaticResourceHtmlContent", "()Ljava/lang/String;", "Lkotlin/Function1;", "", "onComplete", "renderAd", "(Lkotlin/jvm/functions/Function1;)V", "enabledAutoClose", "disableAutoClose", "destroy", "Lcom/mobilefuse/videoplayer/model/VastCompanion;", "vastCompanion", "Lcom/mobilefuse/videoplayer/model/VastCompanion;", "Lcom/mobilefuse/sdk/BaseAdRenderer;", "adRenderer", "Lcom/mobilefuse/sdk/BaseAdRenderer;", "adRendererListener", "Lcom/mobilefuse/sdk/AdRendererListener;", "Landroid/view/View;", "adView", "Landroid/view/View;", "clickThroughView", "autoCloseEnabled", "Z", "Ljava/util/Timer;", "autoCloseTimer", "Ljava/util/Timer;", "Landroid/app/Activity;", "Lcom/mobilefuse/videoplayer/endcard/scheduler/EndCardConfig;", "getConfig", "()Lcom/mobilefuse/videoplayer/endcard/scheduler/EndCardConfig;", "Lcom/mobilefuse/videoplayer/endcard/EndCardListener;", "getListener", "()Lcom/mobilefuse/videoplayer/endcard/EndCardListener;", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class EndCardView extends RelativeLayout {
    private BaseAdRenderer<?> adRenderer;
    private AdRendererListener adRendererListener;
    private View adView;
    private boolean autoCloseEnabled;
    private Timer autoCloseTimer;
    private View clickThroughView;

    @NotNull
    private final EndCardConfig config;

    @NotNull
    private final EndCardListener listener;
    private Activity renderingActivity;
    private final VastCompanion vastCompanion;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 3})
    /* loaded from: classes3.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VastResourceType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[VastResourceType.HTML.ordinal()] = 1;
            iArr[VastResourceType.IFRAME.ordinal()] = 2;
            iArr[VastResourceType.STATIC.ordinal()] = 3;
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
            this.renderingActivity = null;
            BaseAdRenderer<?> baseAdRenderer = this.adRenderer;
            if (baseAdRenderer != null) {
                baseAdRenderer.destroy();
            }
            this.adRenderer = null;
            this.adRendererListener = null;
        } catch (Throwable th) {
            int i = EndCardView$destroy$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @NotNull
    public final EndCardConfig getConfig() {
        return this.config;
    }

    @NotNull
    public final EndCardListener getListener() {
        return this.listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EndCardView(@NotNull Context context, @Nullable Activity activity, @NotNull EndCardConfig config, @NotNull EndCardListener listener) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.renderingActivity = activity;
        this.config = config;
        this.listener = listener;
        this.vastCompanion = config.getCompanion();
        setBackgroundColor(0);
    }

    public final void renderAd(@NotNull final Function1 onComplete) {
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        ComponentType componentType = ComponentType.MRAID_AD_RENDERER;
        final AdRendererComponent registeredComponent = ComponentRegistrar.getRegisteredComponent(componentType);
        if (registeredComponent == null) {
            DebuggingKt.logError$default(this, "Can't render EndCard. Reason: There is no Ad Renderer Component registered for Component Type: " + componentType, null, null, 6, null);
            onComplete.invoke(Boolean.FALSE);
            return;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        int[] screenSizeAsDp = MediaUtilsKt.getScreenSizeAsDp(context);
        VideoPlayerSettings.Companion companion = VideoPlayerSettings.INSTANCE;
        String sdkName = companion.getSdkName();
        String sdkVersion = companion.getSdkVersion();
        String advertisingId = companion.getAdvertisingId();
        boolean isLimitTrackingEnabled = companion.isLimitTrackingEnabled();
        int i = screenSizeAsDp[0];
        int i2 = screenSizeAsDp[1];
        CloseConfigResponse closeConfigResponse = this.config.getCloseConfigResponse();
        ObservableConfig observableConfig = new ObservableConfig();
        observableConfig.setValue(ObservableConfigKey.FORCE_SKIP_SECONDS, Float.valueOf(this.config.getCloseButtonDelaySeconds()));
        observableConfig.setValue(ObservableConfigKey.ALLOW_CLICKTHROUGH_WITHOUT_TAP, Boolean.valueOf(this.config.getAllowClickthroughWithoutTap()));
        Unit unit = Unit.INSTANCE;
        final AdRendererConfig adRendererConfig = new AdRendererConfig(sdkName, sdkVersion, advertisingId, isLimitTrackingEnabled, false, false, false, this.config.isClosable(), this.config.isThumbnailSize(), false, i, i2, null, null, observableConfig, 0, closeConfigResponse, null, null, 438832, null);
        AdRendererListener createAdRendererListener = createAdRendererListener();
        this.adRendererListener = createAdRendererListener;
        if (createAdRendererListener != null) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            BaseAdRenderer<OmidBridge> createInstance = registeredComponent.createInstance(context2, adRendererConfig, createAdRendererListener);
            this.adRenderer = createInstance;
            if (createInstance == null) {
                DebuggingKt.logError$default(this, "Can't render EndCard. Reason: adRenderer instance is a null", null, null, 6, null);
                onComplete.invoke(Boolean.FALSE);
            } else {
                if (this.vastCompanion.getResource() == null) {
                    onComplete.invoke(Boolean.FALSE);
                    return;
                }
                final Flow<String> resourceHtmlContentFlow = getResourceHtmlContentFlow();
                final Schedulers schedulers = Schedulers.MAIN;
                FlowKt.flow(new Function1() { // from class: com.mobilefuse.videoplayer.endcard.EndCardView$$special$$inlined$runOn$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((FlowCollector<? super String>) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull final FlowCollector<? super String> flow) {
                        Intrinsics.checkNotNullParameter(flow, "$this$flow");
                        Flow.this.collect(new FlowCollector() { // from class: com.mobilefuse.videoplayer.endcard.EndCardView$$special$$inlined$runOn$1.1
                            @Override // com.mobilefuse.sdk.rx.FlowCollector
                            public void emitError(@NotNull Throwable error) {
                                Intrinsics.checkNotNullParameter(error, "error");
                                FlowCollector.DefaultImpls.emitError(this, error);
                            }

                            @Override // com.mobilefuse.sdk.rx.FlowCollector
                            public void emitSuccess(T t) {
                                FlowCollector.DefaultImpls.emitSuccess(this, t);
                            }

                            @Override // com.mobilefuse.sdk.rx.FlowCollector
                            public final void emit(@NotNull final Either<? extends Throwable, ? extends T> value) {
                                Intrinsics.checkNotNullParameter(value, "value");
                                final FlowCollector flowCollector = flow;
                                SchedulersKt.runOnScheduler(schedulers, new Function0() { // from class: com.mobilefuse.videoplayer.endcard.EndCardView$$special$.inlined.runOn.1.1.1
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
                                        FlowCollector.this.emit(value);
                                    }
                                });
                            }
                        });
                    }
                }).collect(new FlowCollector() { // from class: com.mobilefuse.videoplayer.endcard.EndCardView$renderAd$$inlined$let$lambda$1
                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public void emitError(@NotNull Throwable error) {
                        Intrinsics.checkNotNullParameter(error, "error");
                        FlowCollector.DefaultImpls.emitError(this, error);
                    }

                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public void emitSuccess(T t) {
                        FlowCollector.DefaultImpls.emitSuccess(this, t);
                    }

                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public final void emit(@NotNull Either<? extends Throwable, ? extends T> result) {
                        BaseAdRenderer baseAdRenderer;
                        Intrinsics.checkNotNullParameter(result, "result");
                        if (result instanceof SuccessResult) {
                            String str = (String) ((SuccessResult) result).getValue();
                            if (str != null) {
                                baseAdRenderer = EndCardView.this.adRenderer;
                                if (baseAdRenderer == null) {
                                    DebuggingKt.logError$default(EndCardView.this, "Can't render EndCard. Reason: can't request ad renderer to praload an ad", null, null, 6, null);
                                    onComplete.invoke(Boolean.FALSE);
                                    return;
                                } else {
                                    baseAdRenderer.preloadAd(str);
                                    onComplete.invoke(Boolean.TRUE);
                                    return;
                                }
                            }
                            DebuggingKt.logError$default(EndCardView.this, "Can't render EndCard. Reason: html content is a null", null, null, 6, null);
                            onComplete.invoke(Boolean.FALSE);
                        }
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showAd() {
        VastResourceType resourceType;
        BaseAdRenderer<?> baseAdRenderer = this.adRenderer;
        if (baseAdRenderer == null) {
            this.listener.onError(VastError.UNABLE_TO_DISPLAY_REQUIRED_COMPANION);
            return;
        }
        VastBaseResource resource = this.vastCompanion.getResource();
        if (resource == null || (resourceType = resource.getResourceType()) == null) {
            this.listener.onError(VastError.UNABLE_TO_DISPLAY_REQUIRED_COMPANION);
            return;
        }
        Activity activity = this.renderingActivity;
        if (activity != null) {
            baseAdRenderer.renderingActivity = activity;
        }
        baseAdRenderer.renderAd();
        this.adView = baseAdRenderer.getAdViewProperty();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(this.adView, layoutParams);
        if (resourceType == VastResourceType.STATIC) {
            View view = new View(getContext());
            view.setOnClickListener(new View.OnClickListener() { // from class: com.mobilefuse.videoplayer.endcard.EndCardView$showAd$$inlined$apply$lambda$1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    EndCardView.this.triggerClickThrough();
                }
            });
            view.setBackgroundColor(16777215);
            Unit unit = Unit.INSTANCE;
            this.clickThroughView = view;
            addView(this.clickThroughView, 0, new RelativeLayout.LayoutParams(-1, -1));
        }
        this.listener.onTrackingEvent(this.vastCompanion, VastTrackingEventType.creativeView);
    }

    private final AdRendererListener createAdRendererListener() {
        return new AdRendererListener() { // from class: com.mobilefuse.videoplayer.endcard.EndCardView$createAdRendererListener$1
            @Override // com.mobilefuse.sdk.AdRendererListener
            public void onAdImpression() {
            }

            @Override // com.mobilefuse.sdk.AdRendererListener
            public void onFullscreenChanged(boolean isFullscreen) {
            }

            @Override // com.mobilefuse.sdk.AdRendererListener
            public void onAdClicked(@NotNull String url) {
                Intrinsics.checkNotNullParameter(url, "url");
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    EndCardView.this.triggerClickThrough();
                } catch (Throwable th) {
                    int i = EndCardView$createAdRendererListener$1$onAdClicked$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i == 1) {
                        StabilityHelper.logException("[Automatically caught]", th);
                    } else if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }

            @Override // com.mobilefuse.sdk.AdRendererListener
            public void onAdClosed() {
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    EndCardView.this.close(ViewCloseTrigger.USER);
                } catch (Throwable th) {
                    int i = EndCardView$createAdRendererListener$1$onAdClosed$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i == 1) {
                        StabilityHelper.logException("[Automatically caught]", th);
                    } else if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }

            @Override // com.mobilefuse.sdk.AdRendererListener
            public void onPreloadStatusChange(boolean isPreloaded) {
                try {
                    if (isPreloaded) {
                        EndCardView.this.showAd();
                    } else {
                        EndCardView.this.getListener().onError(VastError.COMPANION_RESOURCE_LOAD_FAILED);
                    }
                } catch (Throwable th) {
                    StabilityHelper.logException(this, th);
                }
            }

            @Override // com.mobilefuse.sdk.AdRendererListener
            public void onAdRuntimeError(@NotNull RtbLossReason error) {
                Intrinsics.checkNotNullParameter(error, "error");
                EndCardView.this.getListener().onError(VastError.COMPANION_RESOURCE_LOAD_FAILED);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void triggerClickThrough() {
        VastResourceType resourceType;
        try {
            VastBaseResource resource = this.vastCompanion.getResource();
            if (resource != null && (resourceType = resource.getResourceType()) != null) {
                onClickThrough(resourceType == VastResourceType.STATIC ? this.vastCompanion.getClickThrough() : null);
            }
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
        }
    }

    private final void onClickThrough(VastClickThrough clickThrough) {
        this.listener.onClicked(this.vastCompanion, clickThrough);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void close(ViewCloseTrigger closeTrigger) {
        this.listener.onTrackingEvent(this.vastCompanion, VastTrackingEventType.closeLinear);
        this.listener.onClosed(this.vastCompanion, closeTrigger);
        cancelAutoCloseTimer();
    }

    public final void enabledAutoClose() {
        if (((Boolean) this.config.getAutoCloseAllowed().mo4828invoke()).booleanValue() && !this.autoCloseEnabled && this.config.getAutoCloseDelayMillis() > 0) {
            this.autoCloseEnabled = true;
            Timer timer = new Timer();
            timer.schedule(new TimerTask() { // from class: com.mobilefuse.videoplayer.endcard.EndCardView$enabledAutoClose$$inlined$apply$lambda$1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    Handler handler = EndCardView.this.getHandler();
                    if (handler != null) {
                        handler.post(new Runnable() { // from class: com.mobilefuse.videoplayer.endcard.EndCardView$enabledAutoClose$$inlined$apply$lambda$1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                try {
                                    EndCardView.this.close(ViewCloseTrigger.AUTO_CLOSE);
                                } catch (Throwable th) {
                                    StabilityHelper.logException(EndCardView$enabledAutoClose$$inlined$apply$lambda$1.this, th);
                                }
                            }
                        });
                    }
                }
            }, this.config.getAutoCloseDelayMillis());
            Unit unit = Unit.INSTANCE;
            this.autoCloseTimer = timer;
        }
    }

    public final void disableAutoClose() {
        if (this.autoCloseEnabled) {
            this.autoCloseEnabled = false;
            cancelAutoCloseTimer();
        }
    }

    private final void cancelAutoCloseTimer() {
        Timer timer = this.autoCloseTimer;
        if (timer == null) {
            return;
        }
        try {
            timer.cancel();
            this.autoCloseTimer = null;
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
        }
    }

    private final Flow<String> getResourceHtmlContentFlow() {
        final Flow flowSingle = FlowKt.flowSingle(new Function0() { // from class: com.mobilefuse.videoplayer.endcard.EndCardView$getResourceHtmlContentFlow$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* renamed from: invoke */
            public final String mo4828invoke() {
                VastCompanion vastCompanion;
                String staticResourceHtmlContent;
                vastCompanion = EndCardView.this.vastCompanion;
                VastBaseResource resource = vastCompanion.getResource();
                if (resource == null) {
                    return null;
                }
                int i = EndCardView.WhenMappings.$EnumSwitchMapping$0[resource.getResourceType().ordinal()];
                if (i == 1) {
                    if (resource instanceof VastHtmlResource) {
                        return ((VastHtmlResource) resource).getHtmlContent();
                    }
                    return null;
                }
                if (i == 2) {
                    if (resource instanceof VastIFrameResource) {
                        return ((VastIFrameResource) resource).getUrl();
                    }
                    return null;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                staticResourceHtmlContent = EndCardView.this.getStaticResourceHtmlContent();
                return staticResourceHtmlContent;
            }
        });
        final Schedulers schedulers = Schedulers.IO;
        final Flow flow = FlowKt.flow(new Function1() { // from class: com.mobilefuse.videoplayer.endcard.EndCardView$getResourceHtmlContentFlow$$inlined$emitOn$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FlowCollector<? super String>) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull final FlowCollector<? super String> flow2) {
                Intrinsics.checkNotNullParameter(flow2, "$this$flow");
                SchedulersKt.runOnScheduler(schedulers, new Function0() { // from class: com.mobilefuse.videoplayer.endcard.EndCardView$getResourceHtmlContentFlow$$inlined$emitOn$1.1
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
                        Flow.this.collect(new FlowCollector() { // from class: com.mobilefuse.videoplayer.endcard.EndCardView$getResourceHtmlContentFlow$.inlined.emitOn.1.1.1
                            @Override // com.mobilefuse.sdk.rx.FlowCollector
                            public void emitError(@NotNull Throwable error) {
                                Intrinsics.checkNotNullParameter(error, "error");
                                FlowCollector.DefaultImpls.emitError(this, error);
                            }

                            @Override // com.mobilefuse.sdk.rx.FlowCollector
                            public void emitSuccess(T t) {
                                FlowCollector.DefaultImpls.emitSuccess(this, t);
                            }

                            @Override // com.mobilefuse.sdk.rx.FlowCollector
                            public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
                                Intrinsics.checkNotNullParameter(value, "value");
                                flow2.emit(value);
                            }
                        });
                    }
                });
            }
        });
        return FlowKt.flow(new Function1() { // from class: com.mobilefuse.videoplayer.endcard.EndCardView$getResourceHtmlContentFlow$$inlined$catchElse$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FlowCollector<? super String>) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull final FlowCollector<? super String> flow2) {
                Intrinsics.checkNotNullParameter(flow2, "$this$flow");
                Flow.this.collect(new FlowCollector() { // from class: com.mobilefuse.videoplayer.endcard.EndCardView$getResourceHtmlContentFlow$$inlined$catchElse$1.1
                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public void emitError(@NotNull Throwable error) {
                        Intrinsics.checkNotNullParameter(error, "error");
                        FlowCollector.DefaultImpls.emitError(this, error);
                    }

                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public void emitSuccess(T t) {
                        FlowCollector.DefaultImpls.emitSuccess(this, t);
                    }

                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        FlowCollector flowCollector = flow2;
                        if (!(value instanceof ErrorResult)) {
                            if (value instanceof SuccessResult) {
                                flowCollector.emit(value);
                            }
                        } else {
                            flowCollector.emit(new SuccessResult(null));
                        }
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getStaticResourceHtmlContent() {
        String str;
        VastStaticResource vastStaticResource = (VastStaticResource) this.vastCompanion.getResource();
        if (vastStaticResource == null || vastStaticResource.getUrl() == null) {
            return null;
        }
        try {
            MobileFuseAssetManager mobileFuseAssetManager = MobileFuseAssetManager.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            String specificAssetContentSync = mobileFuseAssetManager.getSpecificAssetContentSync("vast_static_resource.html", context);
            if (specificAssetContentSync != null) {
                String replace$default = StringsKt.replace$default(specificAssetContentSync, "{RESOURCE_SRC_URL}", vastStaticResource.getUrl(), false, 4, (Object) null);
                VastClickThrough clickThrough = this.vastCompanion.getClickThrough();
                if (clickThrough != null) {
                    str = clickThrough.getUrl();
                    if (str == null) {
                    }
                    return StringsKt.replace$default(replace$default, "{CLICK_THROUGH}", str, false, 4, (Object) null);
                }
                str = "#";
                return StringsKt.replace$default(replace$default, "{CLICK_THROUGH}", str, false, 4, (Object) null);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
