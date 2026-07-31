package com.mobilefuse.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.ironsource.X3;
import com.mobilefuse.sdk.core.R;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.fullscreen.BaseContentController;
import com.mobilefuse.sdk.fullscreen.MraidContentController;
import com.mobilefuse.sdk.fullscreen.StoryboardContentController;
import com.mobilefuse.sdk.fullscreen.VastContentController;
import com.mobilefuse.sdk.network.model.AdmMediaType;
import com.mobilefuse.sdk.network.model.MfxBidResponse;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MobileFuseFullscreenActivity.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000;\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u000f\b\u0016\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0002J\r\u0010\u000e\u001a\u00020\u000fH\u0002¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\nH\u0017J\u0012\u0010\u0012\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\b\u0010\u0015\u001a\u00020\nH\u0014J\b\u0010\u0016\u001a\u00020\nH\u0014J\b\u0010\u0017\u001a\u00020\nH\u0014J\b\u0010\u0018\u001a\u00020\nH\u0014J\b\u0010\u0019\u001a\u00020\nH\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/mobilefuse/sdk/MobileFuseFullscreenActivity;", "Landroid/app/Activity;", "()V", "contentController", "Lcom/mobilefuse/sdk/fullscreen/BaseContentController;", "mainContainer", "Landroid/widget/FrameLayout;", "userExplicitlyClosedAd", "", "closeActivity", "", "createContentController", "controller", "Lcom/mobilefuse/sdk/AdController;", "createContentListener", "com/mobilefuse/sdk/MobileFuseFullscreenActivity$createContentListener$1", "()Lcom/mobilefuse/sdk/MobileFuseFullscreenActivity$createContentListener$1;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", X3.i.t0, X3.i.u0, "onStart", "onStop", "Companion", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes15.dex */
public class MobileFuseFullscreenActivity extends Activity {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static AdController adController;
    private BaseContentController contentController;
    private FrameLayout mainContainer;
    private boolean userExplicitlyClosedAd;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 3})
    /* loaded from: classes13.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdmMediaType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[AdmMediaType.VIDEO.ordinal()] = 1;
            iArr[AdmMediaType.BANNER.ordinal()] = 2;
            iArr[AdmMediaType.STORYBOARD.ordinal()] = 3;
        }
    }

    public static final void showAd(@NotNull AdController adController2) {
        INSTANCE.showAd(adController2);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, h.E, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.app.Activity
    @Deprecated
    public void onBackPressed() {
    }

    @Override // android.app.Activity
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        Object m8023constructorimpl;
        AdController adController2;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mobilefuse_ad_fullscreen);
        try {
            Result.Companion companion = Result.INSTANCE;
            this.mainContainer = (FrameLayout) findViewById(R.id.mainContainer);
            adController2 = adController;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        if (adController2 == null) {
            closeActivity();
            return;
        }
        if (adController2.isDestroyed()) {
            closeActivity();
            return;
        }
        adController2.setRenderingActivity(this);
        BaseContentController createContentController = createContentController(adController2);
        this.contentController = createContentController;
        FrameLayout frameLayout = this.mainContainer;
        Unit unit = null;
        if (frameLayout != null && createContentController != null) {
            createContentController.init(frameLayout);
            unit = Unit.INSTANCE;
        }
        m8023constructorimpl = Result.m8023constructorimpl(unit);
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
        if (m8026exceptionOrNullimpl != null) {
            StabilityHelper.logException(this, m8026exceptionOrNullimpl);
            closeActivity();
        }
    }

    private final BaseContentController createContentController(AdController controller) {
        MobileFuseFullscreenActivity$createContentListener$1 createContentListener = createContentListener();
        MfxBidResponse mfxBidResponse = controller.bidResponse;
        AdmMediaType type = mfxBidResponse != null ? mfxBidResponse.getType() : null;
        if (type != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
            if (i == 1) {
                return new VastContentController(controller, this, createContentListener);
            }
            if (i == 2) {
                return new MraidContentController(controller, this, createContentListener);
            }
            if (i == 3) {
                return new StoryboardContentController(controller, this, createContentListener);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported media type: ");
        MfxBidResponse mfxBidResponse2 = controller.bidResponse;
        sb.append(mfxBidResponse2 != null ? mfxBidResponse2.getType() : null);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.mobilefuse.sdk.MobileFuseFullscreenActivity$createContentListener$1] */
    private final MobileFuseFullscreenActivity$createContentListener$1 createContentListener() {
        return new BaseContentController.ContentListener() { // from class: com.mobilefuse.sdk.MobileFuseFullscreenActivity$createContentListener$1
            @Override // com.mobilefuse.sdk.fullscreen.BaseContentController.ContentListener
            public void onAdClicked() {
            }

            @Override // com.mobilefuse.sdk.fullscreen.BaseContentController.ContentListener
            public void onAdClosed() {
                MobileFuseFullscreenActivity.this.userExplicitlyClosedAd = true;
                MobileFuseFullscreenActivity.this.closeActivity();
            }

            @Override // com.mobilefuse.sdk.fullscreen.BaseContentController.ContentListener
            public void onAdError() {
                MobileFuseFullscreenActivity.this.closeActivity();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closeActivity() {
        finish();
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            BaseContentController baseContentController = this.contentController;
            if (baseContentController != null) {
                baseContentController.onActivityStart();
            }
        } catch (Throwable th) {
            int i = MobileFuseFullscreenActivity$onStart$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            BaseContentController baseContentController = this.contentController;
            if (baseContentController != null) {
                baseContentController.onActivityResume();
            }
        } catch (Throwable th) {
            int i = MobileFuseFullscreenActivity$onResume$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            BaseContentController baseContentController = this.contentController;
            if (baseContentController != null) {
                baseContentController.onActivityPause();
            }
        } catch (Throwable th) {
            int i = MobileFuseFullscreenActivity$onPause$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            BaseContentController baseContentController = this.contentController;
            if (baseContentController != null) {
                baseContentController.onActivityStop();
            }
        } catch (Throwable th) {
            int i = MobileFuseFullscreenActivity$onStop$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            AdController adController2 = adController;
            if (!this.userExplicitlyClosedAd && adController2 != null) {
                adController2.closeFullscreenAd();
            }
            BaseContentController baseContentController = this.contentController;
            if (baseContentController != null) {
                baseContentController.onActivityDestroy();
            }
            if (adController2 != null) {
                AdService.disposeFullscreenAdLock(adController2);
            }
            adController = null;
        } catch (Throwable th) {
            int i = MobileFuseFullscreenActivity$onDestroy$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* compiled from: MobileFuseFullscreenActivity.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/mobilefuse/sdk/MobileFuseFullscreenActivity$Companion;", "", "()V", "adController", "Lcom/mobilefuse/sdk/AdController;", com.safedk.android.analytics.brandsafety.creatives.discoveries.h.aj, "", "controller", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
    public static final class Companion {
        public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
            Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
            if (p1 == null) {
                return;
            }
            BrandSafetyUtils.detectAdClick(p1, h.E);
            p0.startActivity(p1);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void showAd(@NotNull AdController controller) {
            Class cls;
            Intrinsics.checkNotNullParameter(controller, "controller");
            MobileFuseFullscreenActivity.adController = controller;
            Context context = controller.getContext();
            if (controller.isTransparentBackground()) {
                cls = MobileFuseFullscreenTransparentActivity.class;
            } else {
                cls = MobileFuseFullscreenActivity.class;
            }
            Intent intent = new Intent(context, (Class<?>) cls);
            intent.setFlags(268435456);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
        }
    }
}
