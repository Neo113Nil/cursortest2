package com.mobilefuse.sdk.fullscreen;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import com.ironsource.Zf;
import com.mobilefuse.sdk.AdController;
import com.mobilefuse.sdk.MobileFuseFullscreenActivity;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.telemetry.TelemetryAdLifecycleEvent;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: BaseContentController.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001:\u0001\u001bB1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0013H\u0016J\b\u0010\u0017\u001a\u00020\u0013H\u0016J\b\u0010\u0018\u001a\u00020\u0013H\u0016J\b\u0010\u0019\u001a\u00020\u0013H\u0016J\b\u0010\u001a\u001a\u00020\u0013H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/mobilefuse/sdk/fullscreen/BaseContentController;", "", "adController", "Lcom/mobilefuse/sdk/AdController;", "activity", "Lcom/mobilefuse/sdk/MobileFuseFullscreenActivity;", "contentListener", "Lcom/mobilefuse/sdk/fullscreen/BaseContentController$ContentListener;", "layoutResId", "", "adContainerResId", "(Lcom/mobilefuse/sdk/AdController;Lcom/mobilefuse/sdk/MobileFuseFullscreenActivity;Lcom/mobilefuse/sdk/fullscreen/BaseContentController$ContentListener;II)V", "getActivity", "()Lcom/mobilefuse/sdk/MobileFuseFullscreenActivity;", "getAdController", "()Lcom/mobilefuse/sdk/AdController;", "getContentListener", "()Lcom/mobilefuse/sdk/fullscreen/BaseContentController$ContentListener;", "init", "", "mainContainer", "Landroid/widget/FrameLayout;", "onActivityDestroy", "onActivityPause", "onActivityResume", "onActivityStart", "onActivityStop", "ContentListener", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes8.dex */
public abstract class BaseContentController {

    @NotNull
    private final MobileFuseFullscreenActivity activity;
    private final int adContainerResId;

    @NotNull
    private final AdController adController;

    @NotNull
    private final ContentListener contentListener;
    private final int layoutResId;

    /* compiled from: BaseContentController.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&¨\u0006\u0006"}, d2 = {"Lcom/mobilefuse/sdk/fullscreen/BaseContentController$ContentListener;", "", Zf.f, "", Zf.g, TelemetryAdLifecycleEvent.AD_ERROR, "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
    public interface ContentListener {
        void onAdClicked();

        void onAdClosed();

        void onAdError();
    }

    public BaseContentController(@NotNull AdController adController, @NotNull MobileFuseFullscreenActivity activity, @NotNull ContentListener contentListener, @LayoutRes int i, @IdRes int i2) {
        Intrinsics.checkNotNullParameter(adController, "adController");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(contentListener, "contentListener");
        this.adController = adController;
        this.activity = activity;
        this.contentListener = contentListener;
        this.layoutResId = i;
        this.adContainerResId = i2;
        adController.setFullscreenAdBridge$mobilefuse_sdk_core_release(new AdController.FullscreenAdBridge() { // from class: com.mobilefuse.sdk.fullscreen.BaseContentController.1
            @Override // com.mobilefuse.sdk.AdController.FullscreenAdBridge
            public void onAdClosed() {
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    BaseContentController.this.getContentListener().onAdClosed();
                } catch (Throwable th) {
                    int i3 = BaseContentController$1$onAdClosed$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i3 == 1) {
                        StabilityHelper.logException("[Automatically caught]", th);
                    } else if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
        });
    }

    @NotNull
    protected final AdController getAdController() {
        return this.adController;
    }

    @NotNull
    protected final MobileFuseFullscreenActivity getActivity() {
        return this.activity;
    }

    @NotNull
    protected final ContentListener getContentListener() {
        return this.contentListener;
    }

    public void init(@NotNull FrameLayout mainContainer) {
        Intrinsics.checkNotNullParameter(mainContainer, "mainContainer");
        View inflate = this.activity.getLayoutInflater().inflate(this.layoutResId, (ViewGroup) mainContainer, false);
        if (inflate == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup = (ViewGroup) inflate;
        mainContainer.addView(viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(this.adContainerResId);
        View showInlineAd = this.adController.showInlineAd();
        if (showInlineAd == null) {
            this.contentListener.onAdError();
        } else {
            viewGroup2.addView(showInlineAd);
        }
    }

    public void onActivityStart() {
        this.adController.onActivityStart();
    }

    public void onActivityResume() {
        this.adController.onActivityResume();
    }

    public void onActivityPause() {
        this.adController.onActivityPause();
    }

    public void onActivityStop() {
        this.adController.onActivityStop();
    }

    public void onActivityDestroy() {
        this.adController.onActivityDestroy();
    }
}
