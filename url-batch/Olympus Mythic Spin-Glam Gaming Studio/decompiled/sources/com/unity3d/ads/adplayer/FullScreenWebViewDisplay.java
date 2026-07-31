package com.unity3d.ads.adplayer;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.webkit.WebView;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.protobuf.ByteString;
import com.ironsource.X3;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;
import com.unity3d.ads.R;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.JSONObjectExtensionsKt;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.domain.ISDKDispatchers;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import java.util.Map;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: FullScreenWebViewDisplay.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0014J\u000e\u0010(\u001a\u00020%H\u0082@¢\u0006\u0002\u0010)J\"\u0010*\u001a\u00020%2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020.H\u0002J\u0010\u00102\u001a\u00020%2\u0006\u00103\u001a\u000204H\u0002J\b\u00105\u001a\u00020%H\u0002J\b\u00106\u001a\u00020%H\u0002J\u001a\u00107\u001a\u00020.2\u0006\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\b\u0010<\u001a\u00020%H\u0014J\b\u0010=\u001a\u00020%H\u0014J\b\u0010>\u001a\u00020%H\u0014J\u0010\u0010?\u001a\u00020%2\u0006\u0010@\u001a\u00020.H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u000f\u001a\u0004\b!\u0010\"R\u001c\u0010/\u001a\u0010\u0012\f\u0012\n 1*\u0004\u0018\u00010,0,00X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006A²\u0006\n\u0010B\u001a\u00020CX\u008a\u0084\u0002"}, d2 = {"Lcom/unity3d/ads/adplayer/FullScreenWebViewDisplay;", "Landroidx/activity/ComponentActivity;", "Lcom/unity3d/services/core/di/IServiceComponent;", "<init>", "()V", "opportunityId", "", "showOptions", "", "", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "getSendDiagnosticEvent", "()Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent$delegate", "Lkotlin/Lazy;", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "getAdObject", "()Lcom/unity3d/ads/core/data/model/AdObject;", "adObject$delegate", "dispatchers", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "getDispatchers", "()Lcom/unity3d/services/core/domain/ISDKDispatchers;", "dispatchers$delegate", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "getSessionRepository", "()Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository$delegate", "navBarMode", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$FullscreenNavBarMode;", "getNavBarMode", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$FullscreenNavBarMode;", "navBarMode$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "listenToAdPlayerEvents", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "openUrl", SDKConstants.PARAM_INTENT, "Landroid/content/Intent;", HandleInvocationsFromAdViewer.KEY_USE_ACTIVITY_FOR_RESULT, "", "startForResult", "Landroidx/activity/result/ActivityResultLauncher;", "kotlin.jvm.PlatformType", "loadWebView", "webView", "Landroid/webkit/WebView;", "applyNavBarMode", "hideSystemNavBar", "onKeyDown", "keyCode", "", "event", "Landroid/view/KeyEvent;", X3.i.u0, X3.i.t0, "onDestroy", "onWindowFocusChanged", "hasFocus", "unity-ads_defaultRelease", "adRepository", "Lcom/unity3d/ads/core/data/repository/AdRepository;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FullScreenWebViewDisplay extends ComponentActivity implements IServiceComponent {

    /* renamed from: adObject$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy adObject;

    /* renamed from: dispatchers$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy dispatchers;

    /* renamed from: navBarMode$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy navBarMode;

    @NotNull
    private String opportunityId = "";

    /* renamed from: sendDiagnosticEvent$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy sendDiagnosticEvent;

    /* renamed from: sessionRepository$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy sessionRepository;

    @Nullable
    private Map<String, ? extends Object> showOptions;

    @NotNull
    private final ActivityResultLauncher<Intent> startForResult;

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, "com.unity3d.ads");
        p0.startActivity(p1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startForResult$lambda$12(ActivityResult activityResult) {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, "com.unity3d.ads", me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, @Nullable KeyEvent event) {
        return keyCode == 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdObject adObject_delegate$lambda$2(final FullScreenWebViewDisplay fullScreenWebViewDisplay) {
        Object m8023constructorimpl;
        final String str = "";
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$adObject_delegate$lambda$2$$inlined$inject$default$1
            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.data.repository.AdRepository, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final AdRepository mo4828invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, Reflection.getOrCreateKotlinClass(AdRepository.class));
            }
        });
        try {
            Result.Companion companion = Result.INSTANCE;
            AdRepository adObject_delegate$lambda$2$lambda$0 = adObject_delegate$lambda$2$lambda$0(lazy);
            UUID fromString = UUID.fromString(fullScreenWebViewDisplay.opportunityId);
            Intrinsics.checkNotNullExpressionValue(fromString, "fromString(...)");
            m8023constructorimpl = Result.m8023constructorimpl(adObject_delegate$lambda$2$lambda$0.getAd(ProtobufExtensionsKt.toByteString(fromString)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8028isFailureimpl(m8023constructorimpl)) {
            m8023constructorimpl = null;
        }
        return (AdObject) m8023constructorimpl;
    }

    public FullScreenWebViewDisplay() {
        final String str = "";
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.sendDiagnosticEvent = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$special$$inlined$inject$default$1
            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.SendDiagnosticEvent, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final SendDiagnosticEvent mo4828invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class));
            }
        });
        this.adObject = LazyKt.lazy(new Function0() { // from class: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                AdObject adObject_delegate$lambda$2;
                adObject_delegate$lambda$2 = FullScreenWebViewDisplay.adObject_delegate$lambda$2(FullScreenWebViewDisplay.this);
                return adObject_delegate$lambda$2;
            }
        });
        this.dispatchers = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$special$$inlined$inject$default$2
            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.services.core.domain.ISDKDispatchers, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final ISDKDispatchers mo4828invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, Reflection.getOrCreateKotlinClass(ISDKDispatchers.class));
            }
        });
        this.sessionRepository = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$special$$inlined$inject$default$3
            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.data.repository.SessionRepository, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final SessionRepository mo4828invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, Reflection.getOrCreateKotlinClass(SessionRepository.class));
            }
        });
        this.navBarMode = LazyKt.lazy(new Function0() { // from class: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                NativeConfigurationOuterClass.FullscreenNavBarMode navBarMode_delegate$lambda$3;
                navBarMode_delegate$lambda$3 = FullScreenWebViewDisplay.navBarMode_delegate$lambda$3(FullScreenWebViewDisplay.this);
                return navBarMode_delegate$lambda$3;
            }
        });
        ActivityResultLauncher<Intent> registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$$ExternalSyntheticLambda3
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                FullScreenWebViewDisplay.startForResult$lambda$12((ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResult(...)");
        this.startForResult = registerForActivityResult;
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    @NotNull
    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SendDiagnosticEvent getSendDiagnosticEvent() {
        return (SendDiagnosticEvent) this.sendDiagnosticEvent.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdObject getAdObject() {
        return (AdObject) this.adObject.getValue();
    }

    private static final AdRepository adObject_delegate$lambda$2$lambda$0(Lazy lazy) {
        return (AdRepository) lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ISDKDispatchers getDispatchers() {
        return (ISDKDispatchers) this.dispatchers.getValue();
    }

    private final SessionRepository getSessionRepository() {
        return (SessionRepository) this.sessionRepository.getValue();
    }

    private final NativeConfigurationOuterClass.FullscreenNavBarMode getNavBarMode() {
        Object value = this.navBarMode.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (NativeConfigurationOuterClass.FullscreenNavBarMode) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeConfigurationOuterClass.FullscreenNavBarMode navBarMode_delegate$lambda$3(FullScreenWebViewDisplay fullScreenWebViewDisplay) {
        return fullScreenWebViewDisplay.getSessionRepository().getFeatureFlags().getFullscreenNavBarMode();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        CoroutineScope scope;
        Object m8023constructorimpl;
        Map<String, ? extends Object> map;
        if (getNavBarMode() == NativeConfigurationOuterClass.FullscreenNavBarMode.FULLSCREEN_NAV_BAR_MODE_TRANSPARENT) {
            setTheme(R.style.Theme_UnityAds_FullScreen_TransparentNav);
        }
        super.onCreate(savedInstanceState);
        applyNavBarMode();
        String stringExtra = getIntent().getStringExtra("opportunityId");
        if (stringExtra == null) {
            stringExtra = "not_provided";
        }
        this.opportunityId = stringExtra;
        AdObject adObject = getAdObject();
        if ((adObject != null ? adObject.getWebViewLessLoadingRequiredData() : null) != null && savedInstanceState == null) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(getSendDiagnosticEvent(), "native_webview_less_ad_activity_launched", (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 126, (Object) null);
        }
        if (Intrinsics.areEqual(this.opportunityId, "not_provided")) {
            setResult(0);
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(getDispatchers().getDefault()), null, null, new FullScreenWebViewDisplay$onCreate$1(this, null), 3, null);
            finish();
            return;
        }
        AdObject adObject2 = getAdObject();
        AdPlayer adPlayer = adObject2 != null ? adObject2.getAdPlayer() : null;
        if (adPlayer == null || (scope = adPlayer.getScope()) == null || !CoroutineScopeKt.isActive(scope)) {
            setResult(0);
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(getDispatchers().getDefault()), null, null, new FullScreenWebViewDisplay$onCreate$2(this, null), 3, null);
            finish();
            return;
        }
        boolean hasExtra = getIntent().hasExtra(X3.i.n);
        Boolean valueOf = Boolean.valueOf(hasExtra);
        if (!hasExtra) {
            valueOf = null;
        }
        if (valueOf != null) {
            setRequestedOrientation(getIntent().getIntExtra(X3.i.n, -1));
        }
        String stringExtra2 = getIntent().getStringExtra("showOptions");
        if (stringExtra2 != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                m8023constructorimpl = Result.m8023constructorimpl(JSONObjectExtensionsKt.toBuiltInMap(new JSONObject(stringExtra2)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m8028isFailureimpl(m8023constructorimpl)) {
                m8023constructorimpl = null;
            }
            map = (Map) m8023constructorimpl;
        } else {
            map = null;
        }
        this.showOptions = map;
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new FullScreenWebViewDisplay$onCreate$6(this, null), 3, null);
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        Intrinsics.checkNotNullExpressionValue(onBackPressedDispatcher, "<get-onBackPressedDispatcher>(...)");
        OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, this, false, new Function1() { // from class: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit onCreate$lambda$8;
                onCreate$lambda$8 = FullScreenWebViewDisplay.onCreate$lambda$8((OnBackPressedCallback) obj);
                return onCreate$lambda$8;
            }
        }, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$8(OnBackPressedCallback addCallback) {
        Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
        return Unit.INSTANCE;
    }

    static /* synthetic */ void openUrl$default(FullScreenWebViewDisplay fullScreenWebViewDisplay, String str, Intent intent, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        fullScreenWebViewDisplay.openUrl(str, intent, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openUrl(String opportunityId, Intent intent, boolean useActivityForResult) {
        Object m8023constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (useActivityForResult) {
                this.startForResult.launch(intent);
            } else {
                intent.setFlags(268435456);
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this, intent);
            }
            m8023constructorimpl = Result.m8023constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), getDispatchers().getDefault(), null, new FullScreenWebViewDisplay$openUrl$1(opportunityId, Result.m8029isSuccessimpl(m8023constructorimpl), null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadWebView(WebView webView) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(getDispatchers().getMain()), null, null, new FullScreenWebViewDisplay$loadWebView$1(webView, this, null), 3, null);
    }

    private final void applyNavBarMode() {
        if (getNavBarMode() == NativeConfigurationOuterClass.FullscreenNavBarMode.FULLSCREEN_NAV_BAR_MODE_UNSPECIFIED) {
            return;
        }
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        if (getNavBarMode() == NativeConfigurationOuterClass.FullscreenNavBarMode.FULLSCREEN_NAV_BAR_MODE_HIDDEN) {
            hideSystemNavBar();
        }
    }

    private final void hideSystemNavBar() {
        WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(getWindow(), getWindow().getDecorView());
        windowInsetsControllerCompat.hide(WindowInsetsCompat.Type.navigationBars());
        windowInsetsControllerCompat.setSystemBarsBehavior(2);
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(getDispatchers().getDefault()), null, null, new FullScreenWebViewDisplay$onResume$1(this, null), 3, null);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(getDispatchers().getDefault()), null, null, new FullScreenWebViewDisplay$onPause$1(this, null), 3, null);
        if (isFinishing()) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(getDispatchers().getDefault()), null, null, new FullScreenWebViewDisplay$onPause$2(this, null), 3, null);
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        if (isFinishing()) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(getDispatchers().getDefault()), null, null, new FullScreenWebViewDisplay$onDestroy$1(this, null), 3, null);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus && getNavBarMode() == NativeConfigurationOuterClass.FullscreenNavBarMode.FULLSCREEN_NAV_BAR_MODE_HIDDEN) {
            hideSystemNavBar();
        }
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(getDispatchers().getDefault()), null, null, new FullScreenWebViewDisplay$onWindowFocusChanged$1(this, hasFocus, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object listenToAdPlayerEvents(Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final SharedFlow onSubscription = FlowKt.onSubscription(AndroidFullscreenWebViewAdPlayer.INSTANCE.getDisplayMessages(), new FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1(this, cancellableContinuationImpl, null));
        FlowKt.launchIn(FlowKt.onEach(new Flow() { // from class: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$10$$inlined$filter$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation2) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this), continuation2);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$10$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ FullScreenWebViewDisplay this$0;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$10$$inlined$filter$1$2", f = "FullScreenWebViewDisplay.kt", l = {50}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$10$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, FullScreenWebViewDisplay fullScreenWebViewDisplay) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = fullScreenWebViewDisplay;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    String str;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i2 = anonymousClass1.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                String opportunityId = ((DisplayMessage) obj).getOpportunityId();
                                str = this.this$0.opportunityId;
                                if (Intrinsics.areEqual(opportunityId, str)) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }
        }, new FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }
}
