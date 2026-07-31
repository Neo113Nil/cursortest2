package com.mobilefuse.sdk.vast;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mobilefuse.sdk.AdLifecycleEvent;
import com.mobilefuse.sdk.AdRendererConfig;
import com.mobilefuse.sdk.AdRendererContainer;
import com.mobilefuse.sdk.AdRendererListener;
import com.mobilefuse.sdk.BaseAdRenderer;
import com.mobilefuse.sdk.DebuggingKt;
import com.mobilefuse.sdk.ExtendedAdType;
import com.mobilefuse.sdk.MuteChangedListener;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.Utils;
import com.mobilefuse.sdk.ad.rendering.ExtendedController;
import com.mobilefuse.sdk.ad.rendering.omniad.ThumbnailAdController;
import com.mobilefuse.sdk.ad.rendering.omniad.thumbnail.GetThumbnailInitSizeKt;
import com.mobilefuse.sdk.config.ObservableConfig;
import com.mobilefuse.sdk.config.ObservableConfigKey;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.internal.RtbLossReason;
import com.mobilefuse.sdk.omid.OmidFriendlyObstructionPurpose;
import com.mobilefuse.sdk.omid.VastOmidBridge;
import com.mobilefuse.sdk.omid.viewtree.ViewTreeInspector;
import com.mobilefuse.sdk.rtb.Protocol;
import com.mobilefuse.sdk.state.mute.AdMuteStateManager;
import com.mobilefuse.sdk.state.mute.AdMuteStateObserver;
import com.mobilefuse.sdk.state.mute.AdMutedState;
import com.mobilefuse.sdk.state.mute.AdMutedStateSource;
import com.mobilefuse.sdk.telemetry.Telemetry;
import com.mobilefuse.sdk.telemetry.metricslogging.MetricRecordName;
import com.mobilefuse.sdk.telemetry.metricslogging.TelemetryAdInfo;
import com.mobilefuse.sdk.vast.VastAdRenderer;
import com.mobilefuse.sdk.vast.endcard.EndCardSchedulerHelper;
import com.mobilefuse.sdk.video.ClickthroughBehaviour;
import com.mobilefuse.videoplayer.VideoPlayer;
import com.mobilefuse.videoplayer.VideoPlayerSettings;
import com.mobilefuse.videoplayer.controller.ExternalFullscreenControlBridge;
import com.mobilefuse.videoplayer.controller.FullscreenChangedListener;
import com.mobilefuse.videoplayer.model.DataRegulation;
import com.mobilefuse.videoplayer.model.VastError;
import com.safedk.android.internal.special.SpecialsBridge;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VastAdRenderer.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008b\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n*\u0001\u001e\b\u0016\u0018\u0000 N2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0003NOPB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001aH\u0014J\b\u0010\u001c\u001a\u00020\u001aH\u0002J\r\u0010\u001d\u001a\u00020\u001eH\u0002¢\u0006\u0002\u0010\u001fJ\b\u0010 \u001a\u00020\u001aH\u0016J\b\u0010!\u001a\u00020\u001aH\u0002J\b\u0010\"\u001a\u00020\u001aH\u0002J\b\u0010#\u001a\u00020\u001aH\u0002J\b\u0010$\u001a\u00020\u001aH\u0002J\n\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0014\u0010'\u001a\u0004\u0018\u00010(2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014J\b\u0010)\u001a\u00020\u001aH\u0002J\u001a\u0010*\u001a\u00020\u001a2\u0010\u0010+\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010&\u0018\u00010,H\u0002J\u0010\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\fH\u0002J\b\u0010/\u001a\u00020\u001aH\u0002J\b\u00100\u001a\u00020\u001aH\u0014J\b\u00101\u001a\u00020\u001aH\u0002J\b\u00102\u001a\u00020\u001aH\u0014J\b\u00103\u001a\u00020\u001aH\u0016J\b\u00104\u001a\u00020\u001aH\u0016J\b\u00105\u001a\u00020\u001aH\u0016J\b\u00106\u001a\u00020\fH\u0014J\u001c\u00107\u001a\u00020\u001a2\b\u00108\u001a\u0004\u0018\u0001092\b\u0010:\u001a\u0004\u0018\u00010;H\u0014J\u0010\u0010<\u001a\u00020\u001a2\u0006\u0010=\u001a\u00020>H\u0016J\u0012\u0010?\u001a\u00020\u001a2\b\u0010@\u001a\u0004\u0018\u00010AH\u0014J\b\u0010B\u001a\u00020\u001aH\u0002J\b\u0010C\u001a\u00020\u001aH\u0016J\b\u0010D\u001a\u00020\u001aH\u0002J\u0010\u0010E\u001a\u00020\u001a2\u0006\u0010F\u001a\u00020GH\u0002J\u0010\u0010H\u001a\u00020\u001a2\u0006\u0010F\u001a\u00020GH\u0002J\u0010\u0010I\u001a\u00020\u001a2\u0006\u0010F\u001a\u00020GH\u0002J\u0010\u0010J\u001a\u00020\u001a2\u0006\u0010K\u001a\u00020\u0010H\u0002J\u0010\u0010L\u001a\u00020\u001a2\u0006\u0010F\u001a\u00020GH\u0002J\b\u0010M\u001a\u00020\u001aH\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006Q"}, d2 = {"Lcom/mobilefuse/sdk/vast/VastAdRenderer;", "Lcom/mobilefuse/sdk/BaseAdRenderer;", "Lcom/mobilefuse/sdk/omid/VastOmidBridge;", "Lcom/mobilefuse/sdk/state/mute/AdMuteStateObserver;", "context", "Landroid/content/Context;", "config", "Lcom/mobilefuse/sdk/AdRendererConfig;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/mobilefuse/sdk/AdRendererListener;", "(Landroid/content/Context;Lcom/mobilefuse/sdk/AdRendererConfig;Lcom/mobilefuse/sdk/AdRendererListener;)V", "isVideoStreamEnabled", "", "loaderView", "Landroid/widget/ProgressBar;", "videoPlayer", "Lcom/mobilefuse/videoplayer/VideoPlayer;", "getVideoPlayer$mobilefuse_sdk_vast_release$annotations", "()V", "getVideoPlayer$mobilefuse_sdk_vast_release", "()Lcom/mobilefuse/videoplayer/VideoPlayer;", "setVideoPlayer$mobilefuse_sdk_vast_release", "(Lcom/mobilefuse/videoplayer/VideoPlayer;)V", "viewTreeInspector", "Lcom/mobilefuse/sdk/omid/viewtree/ViewTreeInspector;", "addProgressBarAsOmidFriendlyObstruction", "", "createContainer", "createExternalController", "createPlaybackListener", "com/mobilefuse/sdk/vast/VastAdRenderer$createPlaybackListener$1", "()Lcom/mobilefuse/sdk/vast/VastAdRenderer$createPlaybackListener$1;", "destroy", "destroyExtendedController", "destroyVideoPlayer", "destroyViewTreeInspector", "finishOmidSession", "getAdView", "Landroid/view/View;", "getOnLayoutChangeListener", "Landroid/view/View$OnLayoutChangeListener;", "handleAwaitingMutedConfig", "handleObstructionsChange", "friendlyObstructions", "", "handleViewTreeInspection", "start", "hideLoaderView", "initUi", "initViewTreeInspector", "initialize", "onActivityDestroy", "onActivityPauseImpl", "onActivityResumeImpl", "onAdCloseRequested", "onConfigPropertyChanged", "key", "Lcom/mobilefuse/sdk/config/ObservableConfigKey;", "value", "", "onMuteStateChanged", "updatedState", "Lcom/mobilefuse/sdk/state/mute/AdMutedState;", "preloadAdmImpl", "adm", "", "removeStateManagerObserver", "renderAdmImpl", "saveAdmClickProvider", "setupEndCardConfiguration", "observableConfig", "Lcom/mobilefuse/sdk/config/ObservableConfig;", "setupMuteConfiguration", "setupObservableConfigKeys", "setupVideoPlayerForThumbnail", "player", "setupVideoPlayerOptions", "setupViewTreeInspector", "Companion", "VastAdLifecycleEvent", "VastExtendedAdType", "mobilefuse-sdk-vast_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes9.dex */
public class VastAdRenderer extends BaseAdRenderer<VastOmidBridge> implements AdMuteStateObserver {
    public static final float DEFAULT_END_CARD_CLOSE_SECONDS = 0.0f;
    public static final int DEFAULT_MAX_END_CARDS = 1;
    public static final long END_CARD_AUTO_CLOSE_DELAY = 10000;
    private boolean isVideoStreamEnabled;
    private ProgressBar loaderView;

    @Nullable
    private VideoPlayer videoPlayer;
    private ViewTreeInspector viewTreeInspector;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final List<Protocol> supportedProtocols = CollectionsKt.listOf((Object[]) new Protocol[]{Protocol.VAST2, Protocol.VAST2_WRAPPER, Protocol.VAST3, Protocol.VAST3_WRAPPER, Protocol.VAST4, Protocol.VAST4_WRAPPER});

    /* compiled from: VastAdRenderer.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/mobilefuse/sdk/vast/VastAdRenderer$VastAdLifecycleEvent;", "", "Lcom/mobilefuse/sdk/AdLifecycleEvent;", "(Ljava/lang/String;I)V", "VAST_VIDEO_LOADED", "VAST_VIDEO_STARTED", "VAST_VIDEO_SKIPPED", "VAST_VIDEO_FIRST_QUARTILE", "VAST_VIDEO_MIDPOINT", "VAST_VIDEO_THIRD_QUARTILE", "VAST_VIDEO_COMPLETED", "mobilefuse-sdk-vast_release"}, k = 1, mv = {1, 4, 3})
    public enum VastAdLifecycleEvent implements AdLifecycleEvent {
        VAST_VIDEO_LOADED,
        VAST_VIDEO_STARTED,
        VAST_VIDEO_SKIPPED,
        VAST_VIDEO_FIRST_QUARTILE,
        VAST_VIDEO_MIDPOINT,
        VAST_VIDEO_THIRD_QUARTILE,
        VAST_VIDEO_COMPLETED
    }

    /* compiled from: VastAdRenderer.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/mobilefuse/sdk/vast/VastAdRenderer$VastExtendedAdType;", "", "Lcom/mobilefuse/sdk/ExtendedAdType;", "(Ljava/lang/String;I)V", "THUMBNAIL", "mobilefuse-sdk-vast_release"}, k = 1, mv = {1, 4, 3})
    public enum VastExtendedAdType implements ExtendedAdType {
        THUMBNAIL
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 3})
    /* loaded from: classes15.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[VastError.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[VastError.XML_PARSING_FAILED.ordinal()] = 1;
            iArr[VastError.WRAPPER_LIMIT_REACHED.ordinal()] = 2;
            iArr[VastError.MEDIAFILES_UNSUPPORTED.ordinal()] = 3;
            iArr[VastError.MEDIAFILE_TIMEOUT.ordinal()] = 4;
            iArr[VastError.MEDIAFILE_NOT_FOUND.ordinal()] = 5;
            int[] iArr2 = new int[ObservableConfigKey.values().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[ObservableConfigKey.FULLSCREEN.ordinal()] = 1;
            iArr2[ObservableConfigKey.POSITION.ordinal()] = 2;
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void getVideoPlayer$mobilefuse_sdk_vast_release$annotations() {
    }

    private final void addProgressBarAsOmidFriendlyObstruction() {
        VastOmidBridge vastOmidBridge;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            ProgressBar progressBar = this.loaderView;
            if (progressBar != null) {
                if (!hasOmidBridge() || progressBar.getVisibility() != 0) {
                    progressBar = null;
                }
                if (progressBar == null || (vastOmidBridge = (VastOmidBridge) this.omidBridge) == null) {
                    return;
                }
                vastOmidBridge.addFriendlyObstruction(progressBar, OmidFriendlyObstructionPurpose.OTHER, null);
            }
        } catch (Throwable th) {
            int i = VastAdRenderer$addProgressBarAsOmidFriendlyObstruction$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    private final void destroyExtendedController() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            ExtendedController extendedController = this.extendedController;
            if (extendedController != null) {
                extendedController.unbindContent();
            }
            this.extendedController = null;
        } catch (Throwable th) {
            int i = VastAdRenderer$destroyExtendedController$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    private final void handleAwaitingMutedConfig() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            ObservableConfig observableConfig = this.observableConfig;
            if (observableConfig == null) {
                return;
            }
            ObservableConfigKey observableConfigKey = ObservableConfigKey.AWAITING_MUTED;
            if (observableConfig.hasValue(observableConfigKey)) {
                final boolean booleanValue$default = ObservableConfig.getBooleanValue$default(observableConfig, observableConfigKey, false, 2, null);
                Function1 function1 = new Function1() { // from class: com.mobilefuse.sdk.vast.VastAdRenderer$handleAwaitingMutedConfig$1$updateFunction$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final AdMutedState invoke(@NotNull AdMutedState currentState) {
                        Intrinsics.checkNotNullParameter(currentState, "currentState");
                        return currentState.copy(booleanValue$default, AdMutedStateSource.APP_USER);
                    }
                };
                AdMuteStateManager adMuteStateManager = this.adMuteStateManager;
                if (adMuteStateManager != null) {
                    adMuteStateManager.update(function1);
                }
                observableConfig.clearValue(observableConfigKey);
            }
        } catch (Throwable th) {
            int i = VastAdRenderer$handleAwaitingMutedConfig$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleObstructionsChange(List<View> friendlyObstructions) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            VastOmidBridge vastOmidBridge = (VastOmidBridge) this.omidBridge;
            if (vastOmidBridge == null || friendlyObstructions == null) {
                return;
            }
            vastOmidBridge.removeAllFriendlyObstructions();
            for (View view : friendlyObstructions) {
                if (!Intrinsics.areEqual(view, this.loaderView) && !this.externalFriendlyObstructions.contains(view)) {
                    vastOmidBridge.addFriendlyObstruction(view, OmidFriendlyObstructionPurpose.NOT_VISIBLE, null);
                }
            }
            addProgressBarAsOmidFriendlyObstruction();
            addRegisteredExternalFriendlyObstructions();
        } catch (Throwable th) {
            int i = VastAdRenderer$handleObstructionsChange$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleViewTreeInspection(boolean start) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            ViewTreeInspector viewTreeInspector = this.viewTreeInspector;
            if (viewTreeInspector != null) {
                if (start) {
                    viewTreeInspector.startObstructionsChecking();
                } else {
                    viewTreeInspector.stopObstructionsChecking();
                }
            }
        } catch (Throwable th) {
            int i = VastAdRenderer$handleViewTreeInspection$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    private final void removeStateManagerObserver() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            AdMuteStateManager adMuteStateManager = this.adMuteStateManager;
            if (adMuteStateManager != null) {
                adMuteStateManager.removeObserver(this);
            }
        } catch (Throwable th) {
            int i = VastAdRenderer$removeStateManagerObserver$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveAdmClickProvider() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            ObservableConfig observableConfig = this.observableConfig;
            if (observableConfig != null && observableConfig.getBooleanValue(ObservableConfigKey.ADM_CLICK_INFO_ENABLED, false)) {
                VideoPlayer videoPlayer = this.videoPlayer;
                this.admClickInfoProvider = videoPlayer != null ? videoPlayer.getAdmClickInfoProvider() : null;
            }
        } catch (Throwable th) {
            int i = VastAdRenderer$saveAdmClickProvider$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    private final void setupEndCardConfiguration(ObservableConfig observableConfig) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            VideoPlayer videoPlayer = this.videoPlayer;
            if (videoPlayer == null) {
                return;
            }
            boolean booleanValue = observableConfig.getBooleanValue(ObservableConfigKey.ENDCARD_CLOSABLE, true);
            float floatValue = observableConfig.getFloatValue(ObservableConfigKey.END_CARD_CLOSE_SECONDS, 0.0f);
            int intValue = observableConfig.getIntValue(ObservableConfigKey.MAX_END_CARDS, 1);
            if (this.extendedAdType == VastExtendedAdType.THUMBNAIL) {
                EndCardSchedulerHelper.applyThumbnailScheduler(videoPlayer, floatValue, 10000L);
            } else {
                EndCardSchedulerHelper.applyBaseVastScheduler(videoPlayer, floatValue, booleanValue);
            }
            if (intValue >= 0) {
                videoPlayer.setMaxEndCardsToShow(intValue);
            }
        } catch (Throwable th) {
            int i = VastAdRenderer$setupEndCardConfiguration$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    private final void setupMuteConfiguration(final ObservableConfig observableConfig) {
        VideoPlayer videoPlayer;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            if (ObservableConfig.getBooleanValue$default(observableConfig, ObservableConfigKey.MUTE_ENABLED, false, 2, null) && (videoPlayer = this.videoPlayer) != null) {
                videoPlayer.setMuteAllowed();
                videoPlayer.setMuted(ObservableConfig.getBooleanValue$default(observableConfig, ObservableConfigKey.AWAITING_MUTED, false, 2, null));
                videoPlayer.setMuteChangedListener(new MuteChangedListener() { // from class: com.mobilefuse.sdk.vast.VastAdRenderer$setupMuteConfiguration$$inlined$handleExceptions$lambda$1
                    @Override // com.mobilefuse.sdk.MuteChangedListener
                    public final void onMutedChanged(final boolean z) {
                        AdMuteStateManager adMuteStateManager;
                        ExceptionHandlingStrategy exceptionHandlingStrategy2 = ExceptionHandlingStrategy.LogAndIgnore;
                        try {
                            Function1 function1 = new Function1() { // from class: com.mobilefuse.sdk.vast.VastAdRenderer$setupMuteConfiguration$$inlined$handleExceptions$lambda$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                @NotNull
                                public final AdMutedState invoke(@NotNull AdMutedState currentState) {
                                    Intrinsics.checkNotNullParameter(currentState, "currentState");
                                    return currentState.copy(z, AdMutedStateSource.VIDEO_UI);
                                }
                            };
                            adMuteStateManager = ((BaseAdRenderer) VastAdRenderer.this).adMuteStateManager;
                            if (adMuteStateManager != null) {
                                adMuteStateManager.update(function1);
                            }
                        } catch (Throwable th) {
                            int i = VastAdRenderer$setupMuteConfiguration$1$1$1$$special$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy2.ordinal()];
                            if (i == 1) {
                                StabilityHelper.logException("[Automatically caught]", th);
                            } else if (i != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                    }
                });
            }
        } catch (Throwable th) {
            int i = VastAdRenderer$setupMuteConfiguration$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    private final void setupObservableConfigKeys(ObservableConfig observableConfig) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            setupMuteConfiguration(observableConfig);
            setupEndCardConfiguration(observableConfig);
            setupVideoPlayerOptions(observableConfig);
        } catch (Throwable th) {
            int i = VastAdRenderer$setupObservableConfigKeys$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    private final void setupVideoPlayerOptions(ObservableConfig observableConfig) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            VideoPlayer videoPlayer = this.videoPlayer;
            if (videoPlayer == null) {
                return;
            }
            Object value = observableConfig.getValue(ObservableConfigKey.VIDEO_CLICK_THROUGH_BEHAVIOUR);
            if (value != null) {
                if (!(value instanceof ClickthroughBehaviour)) {
                    value = null;
                }
                if (value != null) {
                    videoPlayer.setClickthroughBehaviour((ClickthroughBehaviour) value);
                }
            }
            Float valueOf = Float.valueOf(observableConfig.getFloatValue(ObservableConfigKey.FORCE_SKIP_SECONDS, -1.0f));
            float f = -1;
            if (valueOf.floatValue() <= f) {
                valueOf = null;
            }
            if (valueOf != null) {
                videoPlayer.setForceSkipSeconds(valueOf.floatValue());
            }
            Float valueOf2 = Float.valueOf(observableConfig.getFloatValue(ObservableConfigKey.BLOCK_SKIP_SECONDS, -1.0f));
            Float f2 = valueOf2.floatValue() > f ? valueOf2 : null;
            if (f2 != null) {
                videoPlayer.setBlockSkipSeconds(f2.floatValue());
            }
            ObservableConfigKey observableConfigKey = ObservableConfigKey.VIDEO_STREAM_ENABLED;
            if (observableConfig.hasValue(observableConfigKey)) {
                boolean booleanValue = observableConfig.getBooleanValue(observableConfigKey, true);
                this.isVideoStreamEnabled = booleanValue;
                videoPlayer.setVideoStreamEnabled(booleanValue);
            }
            ObservableConfigKey observableConfigKey2 = ObservableConfigKey.VIDEO_CACHE_ENABLED;
            if (observableConfig.hasValue(observableConfigKey2)) {
                videoPlayer.setShouldCacheVideo(observableConfig.getBooleanValue(observableConfigKey2, true));
            }
            ObservableConfigKey observableConfigKey3 = ObservableConfigKey.ALLOW_CLICKTHROUGH_WITHOUT_TAP;
            if (observableConfig.hasValue(observableConfigKey3)) {
                videoPlayer.setAllowClickthroughWithoutTap(observableConfig.getBooleanValue(observableConfigKey3, false));
            }
        } catch (Throwable th) {
            int i = VastAdRenderer$setupVideoPlayerOptions$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupViewTreeInspector() {
        View videoView;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            VastOmidBridge vastOmidBridge = (VastOmidBridge) this.omidBridge;
            if (vastOmidBridge == null || (videoView = vastOmidBridge.getVideoView()) == null) {
                return;
            }
            Intrinsics.checkNotNullExpressionValue(videoView, "bridge.getVideoView() ?: return");
            this.viewTreeInspector = new ViewTreeInspector(videoView, new ViewTreeInspector.ObstructionsChangeListener() { // from class: com.mobilefuse.sdk.vast.VastAdRenderer$setupViewTreeInspector$$inlined$handleExceptions$lambda$1
                @Override // com.mobilefuse.sdk.omid.viewtree.ViewTreeInspector.ObstructionsChangeListener
                public final void onChanged(List<View> list) {
                    VastAdRenderer.this.handleObstructionsChange(list);
                }
            });
            addProgressBarAsOmidFriendlyObstruction();
            addRegisteredExternalFriendlyObstructions();
            ViewTreeInspector viewTreeInspector = this.viewTreeInspector;
            if (viewTreeInspector != null) {
                viewTreeInspector.startObstructionsChecking();
            }
        } catch (Throwable th) {
            int i = VastAdRenderer$setupViewTreeInspector$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VastAdRenderer(@NotNull Context context, @NotNull AdRendererConfig config, @NotNull AdRendererListener listener) {
        super(context, config, listener);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        initialize();
        VideoPlayerSettings.Companion companion = VideoPlayerSettings.INSTANCE;
        companion.setDeviceIp(config.getDeviceIp());
        companion.setAdvertisingId(config.getAdvertisingId());
        companion.setLimitTrackingEnabled(config.isLimitTrackingEnabled());
    }

    @Nullable
    /* renamed from: getVideoPlayer$mobilefuse_sdk_vast_release, reason: from getter */
    public final VideoPlayer getVideoPlayer() {
        return this.videoPlayer;
    }

    public final void setVideoPlayer$mobilefuse_sdk_vast_release(@Nullable VideoPlayer videoPlayer) {
        this.videoPlayer = videoPlayer;
    }

    protected void initialize() throws Throwable {
        createContainer();
        initUi();
        VideoPlayer videoPlayer = this.videoPlayer;
        if (videoPlayer != null) {
            videoPlayer.setUiAdm(this.config.getUiAdm());
            videoPlayer.setCloseConfigResponse(this.config.getCloseConfigResponse());
        }
        if (this.config.isSubjectToCoppa()) {
            VideoPlayerSettings.INSTANCE.addApplicableDataRegulations(DataRegulation.COPPA);
        }
        ObservableConfig observableConfig = this.observableConfig;
        if (observableConfig != null) {
            setupObservableConfigKeys(observableConfig);
        }
        startActivityLifecycleChecking();
        Telemetry.INSTANCE.reportAdMetric(TelemetryAdInfo.INSTANCE.createVastInstance(this.config.getAdInstanceId(), Boolean.valueOf(this.isVideoStreamEnabled)), MetricRecordName.ON_VIDEO_PLAYER_CREATED);
        AdMuteStateManager adMuteStateManager = this.adMuteStateManager;
        if (adMuteStateManager != null) {
            adMuteStateManager.addObserver(this);
        }
    }

    protected void createContainer() throws Throwable {
        int convertDpToPx;
        if (this.config.getAdHeight() == -1) {
            convertDpToPx = this.config.getAdHeight();
        } else {
            convertDpToPx = Utils.convertDpToPx(this.context, this.config.getAdHeight());
        }
        Object systemService = this.context.getSystemService("layout_inflater");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.LayoutInflater");
        }
        View inflate = ((LayoutInflater) systemService).inflate(R.layout.mobilefuse_vast_player_view, (ViewGroup) null);
        if (inflate == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.mobilefuse.sdk.AdRendererContainer");
        }
        this.contentContainer = (AdRendererContainer) inflate;
        final ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, convertDpToPx);
        AdRendererContainer adRendererContainer = this.contentContainer;
        if (adRendererContainer != null) {
            adRendererContainer.setAttachedToWindowCallback(new Runnable() { // from class: com.mobilefuse.sdk.vast.VastAdRenderer$createContainer$$inlined$apply$lambda$1
                @Override // java.lang.Runnable
                public final void run() {
                    VastAdRenderer.this.handleViewTreeInspection(true);
                }
            });
            adRendererContainer.setDetachedFromWindowCallback(new Runnable() { // from class: com.mobilefuse.sdk.vast.VastAdRenderer$createContainer$$inlined$apply$lambda$2
                @Override // java.lang.Runnable
                public final void run() {
                    VastAdRenderer.this.handleViewTreeInspection(false);
                }
            });
            if (this.extendedAdType != VastExtendedAdType.THUMBNAIL) {
                adRendererContainer.setBackgroundColor(-16777216);
            }
            adRendererContainer.setLayoutParams(layoutParams);
        }
    }

    protected void initUi() throws Throwable {
        AdRendererContainer adRendererContainer = this.contentContainer;
        this.videoPlayer = adRendererContainer != null ? (VideoPlayer) adRendererContainer.findViewById(R.id.vastPlayer) : null;
        AdRendererContainer adRendererContainer2 = this.contentContainer;
        this.loaderView = adRendererContainer2 != null ? (ProgressBar) adRendererContainer2.findViewById(R.id.loaderView) : null;
    }

    @Override // com.mobilefuse.sdk.BaseAdRenderer
    @Nullable
    public View getAdView() throws Throwable {
        return this.contentContainer;
    }

    @Override // com.mobilefuse.sdk.BaseAdRenderer
    protected void preloadAdmImpl(@Nullable String adm) throws Throwable {
        VideoPlayer videoPlayer;
        if (adm == null || (videoPlayer = this.videoPlayer) == null) {
            return;
        }
        videoPlayer.setOmidBridge((VastOmidBridge) this.omidBridge);
        SpecialsBridge.mobileFuseVideoPlayerLoadVast(videoPlayer, adm, new VideoPlayer.LoadListener() { // from class: com.mobilefuse.sdk.vast.VastAdRenderer$preloadAdmImpl$1
            @Override // com.mobilefuse.videoplayer.VideoPlayer.LoadListener
            public void onError(@Nullable VastError error) {
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                if (error != null) {
                    try {
                        int i = VastAdRenderer.WhenMappings.$EnumSwitchMapping$0[error.ordinal()];
                        if (i == 1) {
                            VastAdRenderer.this.onAdRuntimeError(RtbLossReason.INVALID_MARKUP);
                        } else if (i == 2) {
                            VastAdRenderer.this.onAdRuntimeError(RtbLossReason.WRAPPER_TOO_DEEP);
                        } else if (i == 3) {
                            VastAdRenderer.this.onAdRuntimeError(RtbLossReason.UNSUPPORTED_MEDIA_FILE);
                        } else if (i == 4) {
                            VastAdRenderer.this.onAdRuntimeError(RtbLossReason.ASSET_LOAD_TIMEOUT);
                        } else if (i == 5) {
                            VastAdRenderer.this.onAdRuntimeError(RtbLossReason.MEDIA_FILE_NOT_FOUND);
                        }
                    } catch (Throwable th) {
                        int i2 = VastAdRenderer$preloadAdmImpl$1$onError$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                        if (i2 == 1) {
                            StabilityHelper.logException("[Automatically caught]", th);
                            return;
                        } else {
                            if (i2 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return;
                        }
                    }
                }
                VastAdRenderer.this.onAdRuntimeError(RtbLossReason.CREATIVE_GENERAL);
            }

            @Override // com.mobilefuse.videoplayer.VideoPlayer.LoadListener
            public void onVideoLoaded() {
                AdRendererConfig adRendererConfig;
                boolean z;
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    Telemetry.Companion companion = Telemetry.INSTANCE;
                    TelemetryAdInfo.Companion companion2 = TelemetryAdInfo.INSTANCE;
                    adRendererConfig = ((BaseAdRenderer) VastAdRenderer.this).config;
                    int adInstanceId = adRendererConfig.getAdInstanceId();
                    z = VastAdRenderer.this.isVideoStreamEnabled;
                    companion.reportAdMetric(companion2.createVastInstance(adInstanceId, Boolean.valueOf(z)), MetricRecordName.VIDEO_CACHED);
                    VastAdRenderer.this.saveAdmClickProvider();
                    VastAdRenderer.this.onAdLifecycleEvent(VastAdRenderer.VastAdLifecycleEvent.VAST_VIDEO_LOADED);
                    VastAdRenderer.this.onAdPreloaded();
                } catch (Throwable th) {
                    int i = VastAdRenderer$preloadAdmImpl$1$onVideoLoaded$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i == 1) {
                        StabilityHelper.logException("[Automatically caught]", th);
                    } else if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
        });
    }

    private final void createExternalController() throws Throwable {
        Activity activity;
        VideoPlayer videoPlayer;
        AdRendererContainer adRendererContainer;
        if (this.extendedAdType != VastExtendedAdType.THUMBNAIL || (activity = this.renderingActivity) == null || (videoPlayer = this.videoPlayer) == null || (adRendererContainer = this.contentContainer) == null) {
            return;
        }
        Point point = new Point(this.config.getAdWidth(), this.config.getAdHeight());
        Point currentMediaFileSizeDp = videoPlayer.getCurrentMediaFileSizeDp();
        if (currentMediaFileSizeDp == null) {
            currentMediaFileSizeDp = point;
        }
        Point thumbnailInitSize = GetThumbnailInitSizeKt.getThumbnailInitSize(point, currentMediaFileSizeDp);
        ThumbnailAdController thumbnailAdController = new ThumbnailAdController(activity, adRendererContainer, thumbnailInitSize);
        thumbnailAdController.setAdWidth(thumbnailInitSize.x);
        thumbnailAdController.setAdHeight(thumbnailInitSize.y);
        ObservableConfig observableConfig = this.observableConfig;
        if (observableConfig != null) {
            ObservableConfigKey observableConfigKey = ObservableConfigKey.POSITION;
            if (!observableConfig.hasValue(observableConfigKey)) {
                observableConfig = null;
            }
            if (observableConfig != null) {
                thumbnailAdController.setAnchor(observableConfig.getIntValue(observableConfigKey, 3));
            }
        }
        Unit unit = Unit.INSTANCE;
        this.extendedController = thumbnailAdController;
        setupVideoPlayerForThumbnail(videoPlayer);
    }

    private final void setupVideoPlayerForThumbnail(VideoPlayer player) {
        player.setFullscreenAllowed();
        player.setEnterFullscreenOnVideoTap(true);
        player.setFullscreenChangedListener(new FullscreenChangedListener() { // from class: com.mobilefuse.sdk.vast.VastAdRenderer$setupVideoPlayerForThumbnail$$inlined$apply$lambda$1
            @Override // com.mobilefuse.videoplayer.controller.FullscreenChangedListener
            public final void onFullscreenChanged(boolean z) {
                AdRendererListener adRendererListener;
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    adRendererListener = ((BaseAdRenderer) VastAdRenderer.this).listener;
                    adRendererListener.onFullscreenChanged(z);
                } catch (Throwable th) {
                    int i = VastAdRenderer$setupVideoPlayerForThumbnail$1$1$$special$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i == 1) {
                        StabilityHelper.logException("[Automatically caught]", th);
                    } else if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
        });
        player.enableExternalFullscreenControl(new ExternalFullscreenControlBridge() { // from class: com.mobilefuse.sdk.vast.VastAdRenderer$setupVideoPlayerForThumbnail$$inlined$apply$lambda$2
            @Override // com.mobilefuse.videoplayer.controller.ExternalFullscreenControlBridge
            public void onFullscreenChangeStarted(boolean changeToFullscreen, @NotNull Function0 completedFullscreenAction) {
                ExtendedController extendedController;
                Intrinsics.checkNotNullParameter(completedFullscreenAction, "completedFullscreenAction");
                extendedController = ((BaseAdRenderer) VastAdRenderer.this).extendedController;
                if (!(extendedController instanceof ThumbnailAdController)) {
                    extendedController = null;
                }
                ThumbnailAdController thumbnailAdController = (ThumbnailAdController) extendedController;
                if (thumbnailAdController != null) {
                    thumbnailAdController.requestFullscreenChange(changeToFullscreen, completedFullscreenAction);
                }
            }
        });
    }

    @Override // com.mobilefuse.sdk.BaseAdRenderer
    public void renderAdmImpl() throws Throwable {
        initViewTreeInspector();
        createExternalController();
        ExtendedController extendedController = this.extendedController;
        if (extendedController != null) {
            extendedController.bindContent(this.contentContainer, this.renderingActivity);
        }
        VideoPlayer videoPlayer = this.videoPlayer;
        if (videoPlayer != null) {
            videoPlayer.setOnVideoSkipButtonVisible(new Function0() { // from class: com.mobilefuse.sdk.vast.VastAdRenderer$renderAdmImpl$1
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
                    VastAdRenderer.this.dispatchSkipAdAvailability();
                }
            });
        }
        handleAwaitingMutedConfig();
        VideoPlayer videoPlayer2 = this.videoPlayer;
        if (videoPlayer2 == null) {
            return;
        }
        videoPlayer2.play(this.renderingActivity, createPlaybackListener());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.mobilefuse.sdk.vast.VastAdRenderer$createPlaybackListener$1] */
    private final VastAdRenderer$createPlaybackListener$1 createPlaybackListener() {
        return new VideoPlayer.PlaybackListener() { // from class: com.mobilefuse.sdk.vast.VastAdRenderer$createPlaybackListener$1
            @Override // com.mobilefuse.videoplayer.VideoPlayer.PlaybackListener
            public void onAdCompleted() {
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    VastAdRenderer.this.onAdLifecycleEvent(VastAdRenderer.VastAdLifecycleEvent.VAST_VIDEO_COMPLETED);
                    VastAdRenderer.this.onAdClosed();
                } catch (Throwable th) {
                    int i = VastAdRenderer$createPlaybackListener$1$onAdCompleted$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i == 1) {
                        StabilityHelper.logException("[Automatically caught]", th);
                    } else if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }

            @Override // com.mobilefuse.videoplayer.VideoPlayer.PlaybackListener
            public void onAdImpression() {
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    VastAdRenderer.this.reportAdImpression();
                } catch (Throwable th) {
                    int i = VastAdRenderer$createPlaybackListener$1$onAdImpression$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i == 1) {
                        StabilityHelper.logException("[Automatically caught]", th);
                    } else if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }

            @Override // com.mobilefuse.videoplayer.VideoPlayer.PlaybackListener
            public void onClicked(@NotNull String url) {
                AdRendererListener adRendererListener;
                Intrinsics.checkNotNullParameter(url, "url");
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    adRendererListener = ((BaseAdRenderer) VastAdRenderer.this).listener;
                    adRendererListener.onAdClicked(url);
                } catch (Throwable th) {
                    int i = VastAdRenderer$createPlaybackListener$1$onClicked$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i == 1) {
                        StabilityHelper.logException("[Automatically caught]", th);
                    } else if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }

            @Override // com.mobilefuse.videoplayer.VideoPlayer.PlaybackListener
            public void onEndCardError() {
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    VastAdRenderer.this.onAdRuntimeError(RtbLossReason.CREATIVE_GENERAL);
                } catch (Throwable th) {
                    int i = VastAdRenderer$createPlaybackListener$1$onEndCardError$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i == 1) {
                        StabilityHelper.logException("[Automatically caught]", th);
                    } else if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }

            @Override // com.mobilefuse.videoplayer.VideoPlayer.PlaybackListener
            public void onVideoCompleted() {
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    VastAdRenderer.this.finishOmidSession();
                    VastAdRenderer.this.dispatchSkipAdAvailability();
                } catch (Throwable th) {
                    int i = VastAdRenderer$createPlaybackListener$1$onVideoCompleted$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i == 1) {
                        StabilityHelper.logException("[Automatically caught]", th);
                    } else if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }

            @Override // com.mobilefuse.videoplayer.VideoPlayer.PlaybackListener
            public void onVideoError() {
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    VastAdRenderer.this.onAdRuntimeError(RtbLossReason.CREATIVE_GENERAL);
                } catch (Throwable th) {
                    int i = VastAdRenderer$createPlaybackListener$1$onVideoError$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i == 1) {
                        StabilityHelper.logException("[Automatically caught]", th);
                    } else if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }

            @Override // com.mobilefuse.videoplayer.VideoPlayer.PlaybackListener
            public void onVideoFirstQuartile() {
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    VastAdRenderer.this.onAdLifecycleEvent(VastAdRenderer.VastAdLifecycleEvent.VAST_VIDEO_FIRST_QUARTILE);
                } catch (Throwable th) {
                    int i = VastAdRenderer$createPlaybackListener$1$onVideoFirstQuartile$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i == 1) {
                        StabilityHelper.logException("[Automatically caught]", th);
                    } else if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }

            @Override // com.mobilefuse.videoplayer.VideoPlayer.PlaybackListener
            public void onVideoMidpoint() {
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    VastAdRenderer.this.onAdLifecycleEvent(VastAdRenderer.VastAdLifecycleEvent.VAST_VIDEO_MIDPOINT);
                } catch (Throwable th) {
                    int i = VastAdRenderer$createPlaybackListener$1$onVideoMidpoint$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i == 1) {
                        StabilityHelper.logException("[Automatically caught]", th);
                    } else if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }

            @Override // com.mobilefuse.videoplayer.VideoPlayer.PlaybackListener
            public void onVideoSkipped() {
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    VastAdRenderer.this.finishOmidSession();
                    VastAdRenderer.this.onAdLifecycleEvent(VastAdRenderer.VastAdLifecycleEvent.VAST_VIDEO_SKIPPED);
                    VastAdRenderer.this.dispatchSkipAdAvailability();
                } catch (Throwable th) {
                    int i = VastAdRenderer$createPlaybackListener$1$onVideoSkipped$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i == 1) {
                        StabilityHelper.logException("[Automatically caught]", th);
                    } else if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }

            @Override // com.mobilefuse.videoplayer.VideoPlayer.PlaybackListener
            public void onVideoStarted() {
                ProgressBar progressBar;
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    progressBar = VastAdRenderer.this.loaderView;
                    if (progressBar != null) {
                        progressBar.setVisibility(8);
                    }
                    VastAdRenderer.this.onAdLifecycleEvent(VastAdRenderer.VastAdLifecycleEvent.VAST_VIDEO_STARTED);
                } catch (Throwable th) {
                    int i = VastAdRenderer$createPlaybackListener$1$onVideoStarted$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i == 1) {
                        StabilityHelper.logException("[Automatically caught]", th);
                    } else if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }

            @Override // com.mobilefuse.videoplayer.VideoPlayer.PlaybackListener
            public void onVideoThirdQuartile() {
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    VastAdRenderer.this.onAdLifecycleEvent(VastAdRenderer.VastAdLifecycleEvent.VAST_VIDEO_THIRD_QUARTILE);
                } catch (Throwable th) {
                    int i = VastAdRenderer$createPlaybackListener$1$onVideoThirdQuartile$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i == 1) {
                        StabilityHelper.logException("[Automatically caught]", th);
                    } else if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
        };
    }

    private final void initViewTreeInspector() throws Throwable {
        VastOmidBridge vastOmidBridge;
        if (this.viewTreeInspector == null && hasOmidBridge() && (vastOmidBridge = (VastOmidBridge) this.omidBridge) != null) {
            vastOmidBridge.setAdSessionInitCompleteListener(new Runnable() { // from class: com.mobilefuse.sdk.vast.VastAdRenderer$initViewTreeInspector$1
                @Override // java.lang.Runnable
                public final void run() {
                    ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                    try {
                        VastAdRenderer.this.setupViewTreeInspector();
                    } catch (Throwable th) {
                        int i = VastAdRenderer$initViewTreeInspector$1$$special$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                        if (i == 1) {
                            StabilityHelper.logException("[Automatically caught]", th);
                        } else if (i != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishOmidSession() throws Throwable {
        destroyOmidBridge();
        destroyViewTreeInspector();
    }

    @Override // com.mobilefuse.sdk.BaseAdRenderer
    protected void onConfigPropertyChanged(@Nullable ObservableConfigKey key, @Nullable Object value) throws Throwable {
        if (key == null) {
            return;
        }
        int i = WhenMappings.$EnumSwitchMapping$1[key.ordinal()];
        if (i == 1) {
            if (!(value instanceof Boolean)) {
                value = null;
            }
            Boolean bool = (Boolean) value;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                VideoPlayer videoPlayer = this.videoPlayer;
                if (videoPlayer != null) {
                    videoPlayer.setFullscreen(booleanValue);
                    return;
                }
                return;
            }
            return;
        }
        if (i != 2) {
            return;
        }
        ExtendedController extendedController = this.extendedController;
        if (!(extendedController instanceof ThumbnailAdController)) {
            extendedController = null;
        }
        ThumbnailAdController thumbnailAdController = (ThumbnailAdController) extendedController;
        if (thumbnailAdController != null) {
            if (!(value instanceof Integer)) {
                value = null;
            }
            Integer num = (Integer) value;
            if (num != null) {
                thumbnailAdController.setAnchor(num.intValue());
            }
        }
    }

    @Override // com.mobilefuse.sdk.BaseAdRenderer
    @Nullable
    protected View.OnLayoutChangeListener getOnLayoutChangeListener(@Nullable Context context) throws Throwable {
        return new View.OnLayoutChangeListener() { // from class: com.mobilefuse.sdk.vast.VastAdRenderer$getOnLayoutChangeListener$1
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                ExtendedController extendedController;
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                if (i3 == i7 && i4 == i8) {
                    return;
                }
                try {
                    DebuggingKt.logDebug(VastAdRenderer.this, "onLayoutChange [left: " + i + ", top: " + i2 + ", right: " + i3 + ", bottom: " + i4 + ']', "MF");
                    extendedController = ((BaseAdRenderer) VastAdRenderer.this).extendedController;
                    if (extendedController != null) {
                        extendedController.invalidateLayout();
                    }
                } catch (Throwable th) {
                    int i9 = VastAdRenderer$getOnLayoutChangeListener$1$$special$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i9 == 1) {
                        StabilityHelper.logException("[Automatically caught]", th);
                    } else if (i9 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
        };
    }

    @Override // com.mobilefuse.sdk.BaseAdRenderer
    public void onActivityResumeImpl() throws Throwable {
        VideoPlayer videoPlayer = this.videoPlayer;
        if (videoPlayer != null) {
            videoPlayer.onActivityResume();
        }
        ViewTreeInspector viewTreeInspector = this.viewTreeInspector;
        if (viewTreeInspector != null) {
            viewTreeInspector.startObstructionsChecking();
        }
    }

    @Override // com.mobilefuse.sdk.BaseAdRenderer
    public void onActivityPauseImpl() throws Throwable {
        ViewTreeInspector viewTreeInspector = this.viewTreeInspector;
        if (viewTreeInspector != null) {
            viewTreeInspector.stopObstructionsChecking();
        }
        VideoPlayer videoPlayer = this.videoPlayer;
        if (videoPlayer != null) {
            videoPlayer.onActivityPause();
        }
    }

    @Override // com.mobilefuse.sdk.BaseAdRenderer
    protected boolean onAdCloseRequested() {
        VideoPlayer videoPlayer = this.videoPlayer;
        if (videoPlayer == null) {
            return true;
        }
        videoPlayer.pause();
        return true;
    }

    private final void destroyViewTreeInspector() throws Throwable {
        ViewTreeInspector viewTreeInspector = this.viewTreeInspector;
        if (viewTreeInspector != null) {
            viewTreeInspector.stopObstructionsChecking();
        }
        this.viewTreeInspector = null;
    }

    @Override // com.mobilefuse.sdk.BaseAdRenderer
    public void destroy() throws Throwable {
        finishOmidSession();
        destroyVideoPlayer();
        hideLoaderView();
        destroyExtendedController();
        removeStateManagerObserver();
        super.destroy();
    }

    private final void destroyVideoPlayer() {
        VideoPlayer videoPlayer = this.videoPlayer;
        if (videoPlayer != null) {
            videoPlayer.destroy();
        }
        this.videoPlayer = null;
    }

    private final void hideLoaderView() {
        ProgressBar progressBar = this.loaderView;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }

    @Override // com.mobilefuse.sdk.BaseAdRenderer
    public void onActivityDestroy() throws Throwable {
        destroy();
    }

    @Override // com.mobilefuse.sdk.state.mute.AdMuteStateObserver
    public void onMuteStateChanged(@NotNull AdMutedState updatedState) {
        VideoPlayer videoPlayer;
        Intrinsics.checkNotNullParameter(updatedState, "updatedState");
        VideoPlayer videoPlayer2 = this.videoPlayer;
        if (videoPlayer2 == null || !videoPlayer2.getIsMuteAllowed() || (videoPlayer = this.videoPlayer) == null) {
            return;
        }
        videoPlayer.setMuted(updatedState.getMuted());
    }

    /* compiled from: VastAdRenderer.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/mobilefuse/sdk/vast/VastAdRenderer$Companion;", "", "()V", "DEFAULT_END_CARD_CLOSE_SECONDS", "", "DEFAULT_MAX_END_CARDS", "", "END_CARD_AUTO_CLOSE_DELAY", "", "supportedProtocols", "", "Lcom/mobilefuse/sdk/rtb/Protocol;", "getSupportedProtocols", "()Ljava/util/List;", "mobilefuse-sdk-vast_release"}, k = 1, mv = {1, 4, 3})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<Protocol> getSupportedProtocols() {
            return VastAdRenderer.supportedProtocols;
        }
    }
}
