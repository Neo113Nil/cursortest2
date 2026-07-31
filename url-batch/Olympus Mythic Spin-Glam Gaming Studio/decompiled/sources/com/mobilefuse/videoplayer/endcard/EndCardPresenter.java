package com.mobilefuse.videoplayer.endcard;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.mobilefuse.sdk.CloseConfigResponse;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.videoplayer.endcard.scheduler.EndCardConfig;
import com.mobilefuse.videoplayer.endcard.scheduler.EndCardScheduler;
import com.mobilefuse.videoplayer.model.VastClickThrough;
import com.mobilefuse.videoplayer.model.VastCompanion;
import com.mobilefuse.videoplayer.model.VastError;
import com.mobilefuse.videoplayer.model.VastTrackingEventType;
import com.mobilefuse.videoplayer.view.ViewCloseTrigger;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EndCardPresenter.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0019\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\"\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\rH\u0000¢\u0006\u0004\b \u0010!J\r\u0010#\u001a\u00020\u001b¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u001b¢\u0006\u0004\b%\u0010$R$\u0010\u000e\u001a\u00020\r2\u0006\u0010&\u001a\u00020\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b7\u00108R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b:\u0010;R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010'\u001a\u0004\b?\u0010)R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010C\u001a\u0004\bD\u0010E¨\u0006F"}, d2 = {"Lcom/mobilefuse/videoplayer/endcard/EndCardPresenter;", "", "Landroid/widget/FrameLayout;", "container", "Landroid/content/Context;", "context", "Landroid/app/Activity;", "renderingActivity", "Lcom/mobilefuse/videoplayer/endcard/scheduler/EndCardScheduler;", "scheduler", "", "Lcom/mobilefuse/videoplayer/model/VastCompanion;", "companions", "", "fullscreenMode", "allowClickthroughWithoutTap", "Lcom/mobilefuse/sdk/CloseConfigResponse;", "closeConfigResponse", "Lcom/mobilefuse/videoplayer/endcard/EndCardListener;", "endCardListener", "<init>", "(Landroid/widget/FrameLayout;Landroid/content/Context;Landroid/app/Activity;Lcom/mobilefuse/videoplayer/endcard/scheduler/EndCardScheduler;Ljava/util/List;ZZLcom/mobilefuse/sdk/CloseConfigResponse;Lcom/mobilefuse/videoplayer/endcard/EndCardListener;)V", "getNextCompanion", "()Lcom/mobilefuse/videoplayer/model/VastCompanion;", "Lcom/mobilefuse/videoplayer/view/ViewCloseTrigger;", "earlierViewCloseTrigger", "Lkotlin/Function1;", "", "onEndCardRendered", "showNextEndCard", "(Lcom/mobilefuse/videoplayer/view/ViewCloseTrigger;Lkotlin/jvm/functions/Function1;)V", "fullscreen", "onFullscreenChanged$mobilefuse_video_player_release", "(Z)V", "onFullscreenChanged", "destroyCurrentEndCard", "()V", "destroy", "<set-?>", "Z", "getFullscreenMode", "()Z", "Lcom/mobilefuse/videoplayer/endcard/EndCardView;", "currentEndCard", "Lcom/mobilefuse/videoplayer/endcard/EndCardView;", "", "nextCompanionIndex", "I", "Landroid/widget/FrameLayout;", "getContainer", "()Landroid/widget/FrameLayout;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Landroid/app/Activity;", "getRenderingActivity", "()Landroid/app/Activity;", "Lcom/mobilefuse/videoplayer/endcard/scheduler/EndCardScheduler;", "getScheduler", "()Lcom/mobilefuse/videoplayer/endcard/scheduler/EndCardScheduler;", "Ljava/util/List;", "getCompanions", "()Ljava/util/List;", "getAllowClickthroughWithoutTap", "Lcom/mobilefuse/sdk/CloseConfigResponse;", "getCloseConfigResponse", "()Lcom/mobilefuse/sdk/CloseConfigResponse;", "Lcom/mobilefuse/videoplayer/endcard/EndCardListener;", "getEndCardListener", "()Lcom/mobilefuse/videoplayer/endcard/EndCardListener;", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes8.dex */
public final class EndCardPresenter {
    private final boolean allowClickthroughWithoutTap;

    @Nullable
    private final CloseConfigResponse closeConfigResponse;

    @NotNull
    private final List<VastCompanion> companions;

    @NotNull
    private final FrameLayout container;

    @NotNull
    private final Context context;
    private EndCardView currentEndCard;

    @NotNull
    private final EndCardListener endCardListener;
    private boolean fullscreenMode;
    private int nextCompanionIndex;

    @Nullable
    private final Activity renderingActivity;

    @NotNull
    private final EndCardScheduler scheduler;

    public final void destroy() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            destroyCurrentEndCard();
        } catch (Throwable th) {
            int i = EndCardPresenter$destroy$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final void destroyCurrentEndCard() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            EndCardView endCardView = this.currentEndCard;
            if (endCardView == null) {
                return;
            }
            ViewParent viewParent = null;
            this.currentEndCard = null;
            endCardView.destroy();
            ViewParent parent = endCardView.getParent();
            if (parent != null) {
                if (parent instanceof ViewGroup) {
                    viewParent = parent;
                }
                ViewGroup viewGroup = (ViewGroup) viewParent;
                if (viewGroup != null) {
                    viewGroup.removeView(endCardView);
                }
            }
        } catch (Throwable th) {
            int i = EndCardPresenter$destroyCurrentEndCard$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final void onFullscreenChanged$mobilefuse_video_player_release(boolean fullscreen) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            this.fullscreenMode = fullscreen;
            EndCardView endCardView = this.currentEndCard;
            if (endCardView != null) {
                if (!fullscreen) {
                    endCardView.enabledAutoClose();
                } else {
                    endCardView.disableAutoClose();
                }
            }
        } catch (Throwable th) {
            int i = EndCardPresenter$onFullscreenChanged$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public EndCardPresenter(@NotNull FrameLayout container, @NotNull Context context, @Nullable Activity activity, @NotNull EndCardScheduler scheduler, @NotNull List<VastCompanion> companions, boolean z, boolean z2, @Nullable CloseConfigResponse closeConfigResponse, @NotNull EndCardListener endCardListener) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scheduler, "scheduler");
        Intrinsics.checkNotNullParameter(companions, "companions");
        Intrinsics.checkNotNullParameter(endCardListener, "endCardListener");
        this.container = container;
        this.context = context;
        this.renderingActivity = activity;
        this.scheduler = scheduler;
        this.companions = companions;
        this.allowClickthroughWithoutTap = z2;
        this.closeConfigResponse = closeConfigResponse;
        this.endCardListener = endCardListener;
        this.fullscreenMode = z;
    }

    @NotNull
    public final FrameLayout getContainer() {
        return this.container;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Nullable
    public final Activity getRenderingActivity() {
        return this.renderingActivity;
    }

    @NotNull
    public final EndCardScheduler getScheduler() {
        return this.scheduler;
    }

    @NotNull
    public final List<VastCompanion> getCompanions() {
        return this.companions;
    }

    public /* synthetic */ EndCardPresenter(FrameLayout frameLayout, Context context, Activity activity, EndCardScheduler endCardScheduler, List list, boolean z, boolean z2, CloseConfigResponse closeConfigResponse, EndCardListener endCardListener, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(frameLayout, context, activity, endCardScheduler, list, z, (i & 64) != 0 ? false : z2, closeConfigResponse, endCardListener);
    }

    public final boolean getAllowClickthroughWithoutTap() {
        return this.allowClickthroughWithoutTap;
    }

    @Nullable
    public final CloseConfigResponse getCloseConfigResponse() {
        return this.closeConfigResponse;
    }

    @NotNull
    public final EndCardListener getEndCardListener() {
        return this.endCardListener;
    }

    public final boolean getFullscreenMode() {
        return this.fullscreenMode;
    }

    private final VastCompanion getNextCompanion() {
        if (this.nextCompanionIndex >= this.companions.size()) {
            return null;
        }
        VastCompanion vastCompanion = this.companions.get(this.nextCompanionIndex);
        this.nextCompanionIndex++;
        return vastCompanion;
    }

    public static /* synthetic */ void showNextEndCard$default(EndCardPresenter endCardPresenter, ViewCloseTrigger viewCloseTrigger, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1() { // from class: com.mobilefuse.videoplayer.endcard.EndCardPresenter$showNextEndCard$1
                public final void invoke(boolean z) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke(((Boolean) obj2).booleanValue());
                    return Unit.INSTANCE;
                }
            };
        }
        endCardPresenter.showNextEndCard(viewCloseTrigger, function1);
    }

    public final void showNextEndCard(@NotNull final ViewCloseTrigger earlierViewCloseTrigger, @NotNull final Function1 onEndCardRendered) {
        Either errorResult;
        VastCompanion nextCompanion;
        Intrinsics.checkNotNullParameter(earlierViewCloseTrigger, "earlierViewCloseTrigger");
        Intrinsics.checkNotNullParameter(onEndCardRendered, "onEndCardRendered");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            nextCompanion = getNextCompanion();
        } catch (Throwable th) {
            if (EndCardPresenter$showNextEndCard$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$2[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            errorResult = new ErrorResult(th);
        }
        if (nextCompanion == null) {
            this.endCardListener.onCompleted();
            onEndCardRendered.invoke(Boolean.FALSE);
            return;
        }
        EndCardConfig nextEndCardConfig = this.scheduler.getNextEndCardConfig(this, earlierViewCloseTrigger, nextCompanion, this.nextCompanionIndex == this.companions.size(), this.allowClickthroughWithoutTap, this.closeConfigResponse);
        if (nextEndCardConfig == null) {
            this.endCardListener.onCompleted();
            onEndCardRendered.invoke(Boolean.FALSE);
            return;
        }
        EndCardView endCardView = new EndCardView(this.context, this.renderingActivity, nextEndCardConfig, new EndCardListener() { // from class: com.mobilefuse.videoplayer.endcard.EndCardPresenter$showNextEndCard$$inlined$gracefullyHandleException$lambda$1
            @Override // com.mobilefuse.videoplayer.endcard.EndCardListener
            public void onCompleted() {
            }

            @Override // com.mobilefuse.videoplayer.endcard.EndCardListener
            public void onClosed(@NotNull VastCompanion companion, @NotNull ViewCloseTrigger closeTrigger) {
                Intrinsics.checkNotNullParameter(companion, "companion");
                Intrinsics.checkNotNullParameter(closeTrigger, "closeTrigger");
                ExceptionHandlingStrategy exceptionHandlingStrategy2 = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    EndCardPresenter.this.getEndCardListener().onClosed(companion, closeTrigger);
                    EndCardPresenter.this.destroyCurrentEndCard();
                    EndCardPresenter.showNextEndCard$default(EndCardPresenter.this, closeTrigger, null, 2, null);
                } catch (Throwable th2) {
                    int i = EndCardPresenter$showNextEndCard$2$endCard$1$onClosed$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy2.ordinal()];
                    if (i == 1) {
                        StabilityHelper.logException("[Automatically caught]", th2);
                    } else if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }

            @Override // com.mobilefuse.videoplayer.endcard.EndCardListener
            public void onClicked(@NotNull VastCompanion companion, @Nullable VastClickThrough clickThrough) {
                Intrinsics.checkNotNullParameter(companion, "companion");
                EndCardPresenter.this.getEndCardListener().onClicked(companion, clickThrough);
            }

            @Override // com.mobilefuse.videoplayer.endcard.EndCardListener
            public void onError(@NotNull VastError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                EndCardPresenter.this.getEndCardListener().onError(error);
            }

            @Override // com.mobilefuse.videoplayer.endcard.EndCardListener
            public void onTrackingEvent(@NotNull VastCompanion companion, @NotNull VastTrackingEventType eventType) {
                Intrinsics.checkNotNullParameter(companion, "companion");
                Intrinsics.checkNotNullParameter(eventType, "eventType");
                EndCardPresenter.this.getEndCardListener().onTrackingEvent(companion, eventType);
            }
        });
        this.currentEndCard = endCardView;
        if (((Boolean) nextEndCardConfig.getAutoCloseAllowed().mo4828invoke()).booleanValue()) {
            endCardView.enabledAutoClose();
        }
        this.container.addView(endCardView, new RelativeLayout.LayoutParams(-1, -1));
        endCardView.renderAd(onEndCardRendered);
        errorResult = new SuccessResult(Unit.INSTANCE);
        if (!(errorResult instanceof ErrorResult)) {
            if (!(errorResult instanceof SuccessResult)) {
                throw new NoWhenBranchMatchedException();
            }
            ((SuccessResult) errorResult).getValue();
        } else {
            this.endCardListener.onError(VastError.UNABLE_TO_DISPLAY_REQUIRED_COMPANION);
            onEndCardRendered.invoke(Boolean.FALSE);
        }
    }
}
