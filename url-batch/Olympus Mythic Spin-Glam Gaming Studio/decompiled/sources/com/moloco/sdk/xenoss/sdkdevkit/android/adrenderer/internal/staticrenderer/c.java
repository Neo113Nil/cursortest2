package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer;

import android.graphics.Bitmap;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.webkit.WebViewClientCompat;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.s;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.j;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import kotlin.Deprecated;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes11.dex */
public final class c extends WebViewClientCompat implements g {

    @NotNull
    public static final a m = new a(null);
    public static final int n = 8;

    @NotNull
    public static final String o = "WebViewClientImpl";

    @NotNull
    public final CoroutineScope a;

    @NotNull
    public final s b;

    @NotNull
    public final h c;

    @NotNull
    public final MutableStateFlow d;

    @NotNull
    public final StateFlow e;

    @NotNull
    public final MutableStateFlow f;

    @NotNull
    public final StateFlow g;

    @NotNull
    public final MutableStateFlow h;

    @NotNull
    public final StateFlow i;

    @NotNull
    public final MutableSharedFlow j;

    @NotNull
    public final SharedFlow k;

    @Nullable
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a l;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.WebViewClientImpl$shouldOverrideUrlLoading$1$1$1", f = "WebViewClientImpl.kt", l = {79}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ String c;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a aVar, Continuation continuation) {
            super(2, continuation);
            this.c = str;
            this.d = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return c.this.new b(this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                s sVar = c.this.b;
                String str = this.c;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a aVar = this.d;
                h e = c.this.e();
                MutableSharedFlow mutableSharedFlow = c.this.j;
                this.a = 1;
                if (sVar.a(str, aVar, e, mutableSharedFlow, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ c(CoroutineScope coroutineScope, s sVar, h hVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineScope, sVar, (i & 4) != 0 ? j.a() : hVar);
    }

    @VisibleForTesting
    public static /* synthetic */ void j() {
    }

    public final void c() {
        this.d.setValue(Boolean.TRUE);
    }

    @NotNull
    public final h e() {
        return this.c;
    }

    @NotNull
    public final SharedFlow f() {
        return this.k;
    }

    @Nullable
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a i() {
        return this.l;
    }

    @NotNull
    public final StateFlow l() {
        return this.i;
    }

    @NotNull
    public final StateFlow m() {
        return this.e;
    }

    @NotNull
    public final StateFlow o() {
        return this.g;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.h.D, view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(@Nullable WebView webView, @Nullable String str) {
        super.onPageFinished(webView, str);
        MutableStateFlow mutableStateFlow = this.d;
        Boolean bool = Boolean.TRUE;
        mutableStateFlow.setValue(bool);
        this.f.setValue(bool);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        BrandSafetyUtils.onWebViewPageStarted(com.safedk.android.utils.h.D, view, url);
    }

    @Override // android.webkit.WebViewClient
    @Deprecated
    public void onReceivedError(@Nullable WebView webView, int i, @Nullable String str, @Nullable String str2) {
        Logger.d("MolocoAds|SafeDK: Execution> Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/staticrenderer/c;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
        BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.D, webView, i, str, str2);
        safedk_c_onReceivedError_a182e53f8dc92939dd84b051f30079a3(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(@Nullable WebView webView, @Nullable RenderProcessGoneDetail renderProcessGoneDetail) {
        this.h.setValue(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g.d);
        MolocoLogger.error$default(MolocoLogger.INSTANCE, o, "onRenderProcessGone", null, false, 12, null);
        return true;
    }

    @Deprecated
    public void safedk_c_onReceivedError_a182e53f8dc92939dd84b051f30079a3(WebView p0, int p1, String p2, String p3) {
        super.onReceivedError(p0, p1, p2, p3);
        this.h.setValue(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g.c);
        MolocoLogger.error$default(MolocoLogger.INSTANCE, o, "onReceivedError " + p2, null, false, 12, null);
    }

    @Deprecated
    public boolean safedk_c_shouldOverrideUrlLoading_6981853ef9fbea81f31e8f41863c0872(WebView p0, String p1) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a aVar;
        if (p1 == null || (aVar = this.l) == null) {
            return true;
        }
        BuildersKt__Builders_commonKt.launch$default(this.a, null, null, new b(p1, aVar, null), 3, null);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.h.D, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    @Deprecated
    public boolean shouldOverrideUrlLoading(@Nullable WebView webView, @Nullable String str) {
        Logger.d("MolocoAds|SafeDK: Execution> Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/staticrenderer/c;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean safedk_c_shouldOverrideUrlLoading_6981853ef9fbea81f31e8f41863c0872 = safedk_c_shouldOverrideUrlLoading_6981853ef9fbea81f31e8f41863c0872(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.D, webView, str, safedk_c_shouldOverrideUrlLoading_6981853ef9fbea81f31e8f41863c0872);
        return safedk_c_shouldOverrideUrlLoading_6981853ef9fbea81f31e8f41863c0872;
    }

    public final void a(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a adTouch) {
        Intrinsics.checkNotNullParameter(adTouch, "adTouch");
        this.l = adTouch;
    }

    public c(@NotNull CoroutineScope scope, @NotNull s clickthroughService, @NotNull h buttonTracker) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(clickthroughService, "clickthroughService");
        Intrinsics.checkNotNullParameter(buttonTracker, "buttonTracker");
        this.a = scope;
        this.b = clickthroughService;
        this.c = buttonTracker;
        Boolean bool = Boolean.FALSE;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(bool);
        this.d = MutableStateFlow;
        this.e = MutableStateFlow;
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(bool);
        this.f = MutableStateFlow2;
        this.g = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this.h = MutableStateFlow3;
        this.i = FlowKt.asStateFlow(MutableStateFlow3);
        MutableSharedFlow MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.j = MutableSharedFlow$default;
        this.k = MutableSharedFlow$default;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g
    public void a(@NotNull a.AbstractC1677a.c button) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.c.a(button);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g
    public void a(@NotNull a.AbstractC1677a.c.EnumC1679a buttonType) {
        Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        this.c.a(buttonType);
    }
}
