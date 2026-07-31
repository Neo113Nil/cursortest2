package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid;

import android.graphics.Rect;
import android.webkit.WebView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.r;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.s;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.t;
import com.safedk.android.internal.partials.MolocoAdsNetworkBridge;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@StabilityInferred
/* loaded from: classes12.dex */
public final class e implements d {
    public static final int b = 8;

    @NotNull
    public final WebView a;

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.MraidJsEventSenderImpl$sendJs$1", f = "MraidJsEventSender.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation continuation) {
            super(2, continuation);
            this.c = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return e.this.new a(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MolocoAdsNetworkBridge.webviewLoadUrl(e.this.a, "javascript:" + this.c);
            return Unit.INSTANCE;
        }
    }

    public e(@NotNull WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.a = webView;
    }

    public final void b(String str) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain()), null, null, new a(str, null), 3, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.d
    public void a(@NotNull String commandString) {
        Intrinsics.checkNotNullParameter(commandString, "commandString");
        b("mraidbridge.nativeCallComplete(" + JSONObject.quote(commandString) + ')');
    }

    public final String b(Rect rect) {
        StringBuilder sb = new StringBuilder();
        sb.append(rect.width());
        sb.append(',');
        sb.append(rect.height());
        return sb.toString();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.d
    public void a(@NotNull String commandString, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(commandString, "commandString");
        Intrinsics.checkNotNullParameter(msg, "msg");
        b("mraidbridge.notifyErrorEvent(" + JSONObject.quote(commandString) + ", " + JSONObject.quote(msg) + ')');
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.d
    public void a(boolean z) {
        b("mraidbridge.setIsViewable(" + z + ')');
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.d
    public void a(@NotNull r placementType) {
        Intrinsics.checkNotNullParameter(placementType, "placementType");
        b("mraidbridge.setPlacementType(" + JSONObject.quote(placementType.c()) + ')');
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.d
    public void a(@NotNull t state) {
        Intrinsics.checkNotNullParameter(state, "state");
        b("mraidbridge.setState(" + JSONObject.quote(state.c()) + ')');
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.d
    public void a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        b("mraidbridge.setSupports(" + z + ',' + z2 + ',' + z3 + ',' + z4 + ',' + z5 + ')');
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.d
    public void a(@NotNull s screenMetrics) {
        Intrinsics.checkNotNullParameter(screenMetrics, "screenMetrics");
        b("\n                mraidbridge.setScreenSize(" + b(screenMetrics.g()) + ");\n                mraidbridge.setMaxSize(" + b(screenMetrics.f()) + ");\n                mraidbridge.setCurrentPosition(" + a(screenMetrics.b()) + ");\n                mraidbridge.setDefaultPosition(" + a(screenMetrics.d()) + ");\n                mraidbridge.notifySizeChangeEvent(" + b(screenMetrics.b()) + ");\n            ");
    }

    public final String a(Rect rect) {
        StringBuilder sb = new StringBuilder();
        sb.append(rect.left);
        sb.append(',');
        sb.append(rect.top);
        sb.append(',');
        sb.append(rect.width());
        sb.append(',');
        sb.append(rect.height());
        return sb.toString();
    }
}
