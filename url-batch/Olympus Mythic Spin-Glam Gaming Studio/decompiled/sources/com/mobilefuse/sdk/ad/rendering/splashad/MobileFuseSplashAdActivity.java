package com.mobilefuse.sdk.ad.rendering.splashad;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.ad.view.CloseButton;
import com.mobilefuse.sdk.concurrency.SchedulersKt;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.mraid.R;
import com.mobilefuse.sdk.omid.OmidBridge;
import com.mobilefuse.sdk.omid.OmidFriendlyObstructionPurpose;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MobileFuseSplashAdActivity.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\nH\u0002J\b\u0010\u0010\u001a\u00020\nH\u0002J\b\u0010\u0011\u001a\u00020\nH\u0002J\b\u0010\u0012\u001a\u00020\nH\u0016J\u0012\u0010\u0013\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\b\u0010\u0016\u001a\u00020\nH\u0002J\b\u0010\u0017\u001a\u00020\nH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/mobilefuse/sdk/ad/rendering/splashad/MobileFuseSplashAdActivity;", "Landroid/app/Activity;", "()V", "closeBtn", "Lcom/mobilefuse/sdk/ad/view/CloseButton;", "splashAdController", "Lcom/mobilefuse/sdk/ad/rendering/splashad/SplashAdController;", "webView", "Landroid/webkit/WebView;", "addCloseButton", "", "isTransparent", "", "container", "Landroid/widget/RelativeLayout;", "addWebView", "animateAdClose", "closeActivity", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "requestToClose", "updateCloseBtnAsOmidFriendlyObstruction", "mobilefuse-sdk-mraid_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes10.dex */
public final class MobileFuseSplashAdActivity extends Activity {
    private CloseButton closeBtn;
    private SplashAdController splashAdController;
    private WebView webView;

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, h.E, me);
        return super.dispatchTouchEvent(me);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closeActivity() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            SplashAdController splashAdController = this.splashAdController;
            if (splashAdController != null) {
                splashAdController.onExpandActivityClosed();
            }
            CloseButton closeButton = this.closeBtn;
            if (closeButton != null) {
                closeButton.destroy();
            }
            finish();
        } catch (Throwable th) {
            int i = MobileFuseSplashAdActivity$closeActivity$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateCloseBtnAsOmidFriendlyObstruction() {
        OmidBridge omidBridge;
        CloseButton closeButton;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            SplashAdController splashAdController = this.splashAdController;
            if (splashAdController != null && (omidBridge = splashAdController.getOmidBridge()) != null && (closeButton = this.closeBtn) != null) {
                omidBridge.removeFriendlyObstruction(closeButton);
                if (closeButton.isVisible()) {
                    omidBridge.addFriendlyObstruction(closeButton, OmidFriendlyObstructionPurpose.CLOSE_AD, null);
                }
            }
        } catch (Throwable th) {
            int i = MobileFuseSplashAdActivity$updateCloseBtnAsOmidFriendlyObstruction$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            requestToClose();
        } catch (Throwable th) {
            int i = MobileFuseSplashAdActivity$onBackPressed$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @Override // android.app.Activity
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mobilefuse_splash_ad_fullscreen);
        addWebView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addCloseButton(final boolean isTransparent, final RelativeLayout container) {
        Either errorResult;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            CloseButton closeButton = new CloseButton(this, 0, 0, new Function0() { // from class: com.mobilefuse.sdk.ad.rendering.splashad.MobileFuseSplashAdActivity$addCloseButton$1$closeBtn$1
                public final void invoke() {
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo4828invoke() {
                    invoke();
                    return Unit.INSTANCE;
                }
            }, new Function0() { // from class: com.mobilefuse.sdk.ad.rendering.splashad.MobileFuseSplashAdActivity$addCloseButton$$inlined$gracefullyHandleException$lambda$1
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
                    MobileFuseSplashAdActivity.this.requestToClose();
                }
            }, null, null, 102, null);
            this.closeBtn = closeButton;
            closeButton.setTransparent(isTransparent);
            closeButton.setOnVisibilityChange(new Function1() { // from class: com.mobilefuse.sdk.ad.rendering.splashad.MobileFuseSplashAdActivity$addCloseButton$$inlined$gracefullyHandleException$lambda$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke(((Boolean) obj).booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean z) {
                    MobileFuseSplashAdActivity.this.updateCloseBtnAsOmidFriendlyObstruction();
                }
            });
            closeButton.show();
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(closeButton.getInteractionSizePx(), closeButton.getInteractionSizePx());
            layoutParams.alignWithParent = true;
            layoutParams.addRule(11);
            layoutParams.addRule(10);
            container.addView(closeButton, layoutParams);
            errorResult = new SuccessResult(Unit.INSTANCE);
        } catch (Throwable th) {
            if (MobileFuseSplashAdActivity$addCloseButton$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$2[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            errorResult = new ErrorResult(th);
        }
        if (errorResult instanceof ErrorResult) {
            ExceptionHandlingStrategy exceptionHandlingStrategy2 = ExceptionHandlingStrategy.LogAndIgnore;
            try {
                requestToClose();
            } catch (Throwable th2) {
                int i = MobileFuseSplashAdActivity$$special$$inlined$handleExceptions$2$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy2.ordinal()];
                if (i == 1) {
                    StabilityHelper.logException("[Automatically caught]", th2);
                } else if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
    }

    private final void addWebView() {
        Either errorResult;
        WeakReference<SplashAdController> currentFullscreenController$mobilefuse_sdk_mraid_release;
        final SplashAdController splashAdController;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            currentFullscreenController$mobilefuse_sdk_mraid_release = SplashAdController.INSTANCE.getCurrentFullscreenController$mobilefuse_sdk_mraid_release();
        } catch (Throwable th) {
            if (MobileFuseSplashAdActivity$addWebView$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$2[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            errorResult = new ErrorResult(th);
        }
        if (currentFullscreenController$mobilefuse_sdk_mraid_release == null || (splashAdController = currentFullscreenController$mobilefuse_sdk_mraid_release.get()) == null) {
            finish();
            return;
        }
        this.splashAdController = splashAdController;
        Intrinsics.checkNotNullExpressionValue(splashAdController, "SplashAdController.curre…         return\n        }");
        splashAdController.onWebViewExpanded(new Function0() { // from class: com.mobilefuse.sdk.ad.rendering.splashad.MobileFuseSplashAdActivity$addWebView$$inlined$gracefullyHandleException$lambda$1
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
                CloseButton closeButton;
                closeButton = MobileFuseSplashAdActivity.this.closeBtn;
                if (closeButton != null) {
                    closeButton.hide();
                }
                MobileFuseSplashAdActivity.this.animateAdClose();
            }
        });
        final RelativeLayout mainContainer = (RelativeLayout) findViewById(R.id.mainContainer);
        WebView webView = splashAdController.getWebView();
        this.webView = webView;
        ViewParent parent = webView.getParent();
        if (parent == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ((ViewGroup) parent).removeView(webView);
        Intrinsics.checkNotNullExpressionValue(mainContainer, "mainContainer");
        mainContainer.setVisibility(4);
        mainContainer.addView(webView);
        errorResult = new SuccessResult(Boolean.valueOf(SchedulersKt.getGlobalHandler().postDelayed(new Runnable() { // from class: com.mobilefuse.sdk.ad.rendering.splashad.MobileFuseSplashAdActivity$addWebView$$inlined$gracefullyHandleException$lambda$2
            @Override // java.lang.Runnable
            public final void run() {
                RelativeLayout mainContainer2 = mainContainer;
                Intrinsics.checkNotNullExpressionValue(mainContainer2, "mainContainer");
                mainContainer2.setVisibility(0);
                MobileFuseSplashAdActivity mobileFuseSplashAdActivity = this;
                boolean isExpandedCloseBtnTransparent = splashAdController.getIsExpandedCloseBtnTransparent();
                RelativeLayout mainContainer3 = mainContainer;
                Intrinsics.checkNotNullExpressionValue(mainContainer3, "mainContainer");
                mobileFuseSplashAdActivity.addCloseButton(isExpandedCloseBtnTransparent, mainContainer3);
            }
        }, 200L)));
        if (errorResult instanceof ErrorResult) {
            ExceptionHandlingStrategy exceptionHandlingStrategy2 = ExceptionHandlingStrategy.LogAndIgnore;
            try {
                requestToClose();
            } catch (Throwable th2) {
                int i = MobileFuseSplashAdActivity$$special$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy2.ordinal()];
                if (i == 1) {
                    StabilityHelper.logException("[Automatically caught]", th2);
                } else if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateAdClose() {
        Either errorResult;
        final WebView webView;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            webView = this.webView;
        } catch (Throwable th) {
            if (MobileFuseSplashAdActivity$animateAdClose$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$2[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            errorResult = new ErrorResult(th);
        }
        if (webView == null) {
            closeActivity();
            return;
        }
        final float x = webView.getX();
        final float f = (-webView.getWidth()) - x;
        final ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(500L);
        Intrinsics.checkNotNullExpressionValue(duration, "ValueAnimator.ofFloat(0f, 1f).setDuration(500)");
        duration.setInterpolator(new FastOutSlowInInterpolator());
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.mobilefuse.sdk.ad.rendering.splashad.MobileFuseSplashAdActivity$animateAdClose$1$1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(@NotNull ValueAnimator it) {
                Intrinsics.checkNotNullParameter(it, "it");
                WebView webView2 = webView;
                float f2 = x;
                float f3 = f;
                Object animatedValue = duration.getAnimatedValue();
                if (animatedValue == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                }
                webView2.setX(f2 + (f3 * ((Float) animatedValue).floatValue()));
            }
        });
        duration.addListener(new Animator.AnimatorListener() { // from class: com.mobilefuse.sdk.ad.rendering.splashad.MobileFuseSplashAdActivity$animateAdClose$$inlined$gracefullyHandleException$lambda$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                MobileFuseSplashAdActivity.this.closeActivity();
            }
        });
        duration.start();
        errorResult = new SuccessResult(Unit.INSTANCE);
        if (errorResult instanceof ErrorResult) {
            closeActivity();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestToClose() {
        SplashAdController splashAdController = this.splashAdController;
        if (splashAdController != null) {
            splashAdController.onCloseRequestedFromExpandActivity();
        } else {
            closeActivity();
        }
    }
}
