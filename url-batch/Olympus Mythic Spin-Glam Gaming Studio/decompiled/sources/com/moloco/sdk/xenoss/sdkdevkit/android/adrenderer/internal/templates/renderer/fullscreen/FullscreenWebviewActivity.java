package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.ironsource.X3;
import com.moloco.sdk.acm.CountEvent;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C5051a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0011B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000b\u0010\u0003J'\u0010\u0011\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0014J\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0016*\u00020\u0015H\u0002¢\u0006\u0004\b\u0011\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/fullscreen/FullscreenWebviewActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", X3.i.t0, X3.i.u0, "onDestroy", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/orientation/b;", "expectedOrientationSettings", "Lkotlinx/coroutines/CoroutineScope;", "scope", "a", "(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/CoroutineScope;)V", "orientationSettings", "(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/orientation/b;)V", "Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/orientation/a;", "", "(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/orientation/a;)Ljava/lang/Integer;", "Landroidx/activity/OnBackPressedCallback;", "Landroidx/activity/OnBackPressedCallback;", "backCallback", "b", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes4.dex */
public final class FullscreenWebviewActivity extends AppCompatActivity {

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int c = 8;

    @NotNull
    public static final String d = "FullscreenWebviewActivity";

    @NotNull
    public static WeakReference<a> e = new WeakReference<>(null);

    @NotNull
    public static WeakReference<FullscreenWebviewActivity> f = new WeakReference<>(null);

    @NotNull
    public static WeakReference<MetricsRecorder> g = new WeakReference<>(null);

    @Nullable
    public static MutableStateFlow h;

    @Nullable
    public static MutableStateFlow i;

    /* renamed from: a, reason: from kotlin metadata */
    @Nullable
    public OnBackPressedCallback backCallback;

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
            Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
            if (p1 == null) {
                return;
            }
            BrandSafetyUtils.detectAdClick(p1, h.D);
            p0.startActivity(p1);
        }

        public final void a(@NotNull Context context, @NotNull MutableStateFlow isAdDisplayingEvent, @NotNull a webviewAd, @NotNull MetricsRecorder metricsRecorder, @NotNull MutableStateFlow isAdForciblyClosed) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(isAdDisplayingEvent, "isAdDisplayingEvent");
            Intrinsics.checkNotNullParameter(webviewAd, "webviewAd");
            Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
            Intrinsics.checkNotNullParameter(isAdForciblyClosed, "isAdForciblyClosed");
            MolocoLogger.info$default(MolocoLogger.INSTANCE, FullscreenWebviewActivity.d, "Showing ad", null, false, 12, null);
            FullscreenWebviewActivity.e = new WeakReference(webviewAd);
            FullscreenWebviewActivity.h = isAdDisplayingEvent;
            FullscreenWebviewActivity.i = isAdForciblyClosed;
            FullscreenWebviewActivity.g = new WeakReference(metricsRecorder);
            Intent intent = new Intent(context, (Class<?>) FullscreenWebviewActivity.class);
            intent.setFlags(268435456);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
        }

        public Companion() {
        }

        public final void a() {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, FullscreenWebviewActivity.d, "Closing ad", null, false, 12, null);
            FullscreenWebviewActivity.e.clear();
            MutableStateFlow mutableStateFlow = FullscreenWebviewActivity.h;
            if (mutableStateFlow != null) {
                mutableStateFlow.setValue(Boolean.FALSE);
            }
            FullscreenWebviewActivity.h = null;
            FullscreenWebviewActivity fullscreenWebviewActivity = (FullscreenWebviewActivity) FullscreenWebviewActivity.f.get();
            if (fullscreenWebviewActivity != null && !fullscreenWebviewActivity.isFinishing() && !fullscreenWebviewActivity.isDestroyed()) {
                fullscreenWebviewActivity.finish();
            }
            FullscreenWebviewActivity.f.clear();
            FullscreenWebviewActivity.g.clear();
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a.values().length];
            try {
                iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public /* synthetic */ class c extends AdaptedFunctionReference implements Function2 {
        public c(Object obj) {
            super(2, obj, FullscreenWebviewActivity.class, "setOrientation", "setOrientation(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/orientation/OrientationSettings;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b bVar, Continuation continuation) {
            return FullscreenWebviewActivity.b((FullscreenWebviewActivity) this.receiver, bVar, continuation);
        }
    }

    public static final Unit f() {
        MolocoLogger.error$default(MolocoLogger.INSTANCE, d, "WebviewAd is null in onPause, cannot call webviewBridge.viewVisible", null, false, 12, null);
        return Unit.INSTANCE;
    }

    public static final Unit g() {
        MolocoLogger.error$default(MolocoLogger.INSTANCE, d, "WebviewAd is null in onResume, cannot call webviewBridge.viewVisible", null, false, 12, null);
        return Unit.INSTANCE;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, h.D, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        String str = d;
        MolocoLogger.info$default(molocoLogger, str, "onCreate called", null, false, 12, null);
        MetricsRecorder metricsRecorder = g.get();
        if (metricsRecorder != null) {
            metricsRecorder.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.W.c()));
        }
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        Intrinsics.checkNotNullExpressionValue(onBackPressedDispatcher, "<get-onBackPressedDispatcher>(...)");
        this.backCallback = OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, this, false, new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FullscreenWebviewActivity.a((OnBackPressedCallback) obj);
            }
        }, 2, null);
        f = new WeakReference<>(this);
        a aVar = e.get();
        if (aVar == null) {
            MolocoLogger.error$default(molocoLogger, str, "WebviewAd is null, something went wrong", null, false, 12, null);
            finish();
            return;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b p = aVar.p();
        if (p.getParent() != null) {
            ViewParent parent = p.getParent();
            Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(p);
        }
        setContentView(p);
        MutableStateFlow mutableStateFlow = h;
        if (mutableStateFlow != null) {
            mutableStateFlow.setValue(Boolean.TRUE);
        }
        MolocoLogger.info$default(molocoLogger, str, "WebView is not null, proceeding to notify viewReady and viewVisible", null, false, 12, null);
        aVar.s().a();
        C5051a.a(this);
        a(this, aVar.x(), null, 2, null);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, d, "onDestroy called for FullscreenWebviewActivity", null, false, 12, null);
        MutableStateFlow mutableStateFlow = i;
        if (mutableStateFlow != null) {
            mutableStateFlow.setValue(Boolean.TRUE);
        }
        i = null;
        OnBackPressedCallback onBackPressedCallback = this.backCallback;
        if (onBackPressedCallback != null && onBackPressedCallback.getIsEnabled()) {
            onBackPressedCallback.remove();
        }
        INSTANCE.a();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.a s;
        super.onPause();
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        String str = d;
        MolocoLogger.info$default(molocoLogger, str, "Lifecycle onPause called", null, false, 12, null);
        if (isFinishing() || isDestroyed()) {
            MolocoLogger.info$default(molocoLogger, str, "Activity is finishing or destroyed, skipping viewVisible call", null, false, 12, null);
            return;
        }
        MolocoLogger.info$default(molocoLogger, str, "Activity is not finishing or destroyed, setting viewVisible to false", null, false, 12, null);
        a aVar = e.get();
        if (aVar == null || (s = aVar.s()) == null) {
            new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public final Object mo4828invoke() {
                    return FullscreenWebviewActivity.f();
                }
            };
        } else {
            s.a(false);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.a s;
        super.onResume();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, d, "Lifecycle onResume called", null, false, 12, null);
        a aVar = e.get();
        if (aVar == null || (s = aVar.s()) == null) {
            new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public final Object mo4828invoke() {
                    return FullscreenWebviewActivity.g();
                }
            };
        } else {
            s.a(true);
        }
    }

    public static final /* synthetic */ Object b(FullscreenWebviewActivity fullscreenWebviewActivity, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b bVar, Continuation continuation) {
        fullscreenWebviewActivity.a(bVar);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void a(FullscreenWebviewActivity fullscreenWebviewActivity, StateFlow stateFlow, CoroutineScope coroutineScope, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            coroutineScope = CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain());
        }
        fullscreenWebviewActivity.a(stateFlow, coroutineScope);
    }

    public final void a(StateFlow expectedOrientationSettings, CoroutineScope scope) {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, d, "Starting to listen to orientation events", null, false, 12, null);
        a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b) expectedOrientationSettings.getValue());
        FlowKt.launchIn(FlowKt.onEach(expectedOrientationSettings, new c(this)), scope);
    }

    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b orientationSettings) {
        if (orientationSettings.d() == com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a.d) {
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, d, "Orientation is none, not setting requested orientation", false, 4, null);
            return;
        }
        Integer a = a(orientationSettings.d());
        if (a != null) {
            int intValue = a.intValue();
            MolocoLogger.info$default(MolocoLogger.INSTANCE, d, "Setting orientation to " + intValue, null, false, 12, null);
            setRequestedOrientation(intValue);
        }
    }

    public final Integer a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a aVar) {
        int i2 = b.a[aVar.ordinal()];
        if (i2 == 1) {
            return 1;
        }
        if (i2 == 2) {
            return 0;
        }
        if (i2 == 3) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Unit a(OnBackPressedCallback addCallback) {
        Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, d, "Back press detected, but disabled", false, 4, null);
        return Unit.INSTANCE;
    }
}
