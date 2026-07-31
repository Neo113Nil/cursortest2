package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.content.Context;
import android.graphics.Rect;
import android.webkit.WebView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n;
import com.safedk.android.internal.partials.MolocoAdsNetworkBridge;
import kotlin.NoWhenBranchMatchedException;
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
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@StabilityInferred
/* loaded from: classes9.dex */
public final class g implements f {
    public static final int i = 8;
    public final boolean a;

    @NotNull
    public final CoroutineScope b;

    @NotNull
    public final MutableSharedFlow c;

    @NotNull
    public final SharedFlow d;

    @NotNull
    public final v e;

    @NotNull
    public final WebView f;

    @NotNull
    public final StateFlow g;

    @NotNull
    public final StateFlow h;

    public static final class a implements o {
        public a() {
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.o
        public boolean a(String fromUrl) {
            Intrinsics.checkNotNullParameter(fromUrl, "fromUrl");
            return g.this.b(fromUrl);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidBridgeImpl$consumeMraidJsCommand$1", f = "MraidBridge.kt", l = {101}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements Function2 {
        public Object a;
        public int b;
        public final /* synthetic */ x<n, n.b.a> c;
        public final /* synthetic */ g d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x<n, n.b.a> xVar, g gVar, Continuation continuation) {
            super(2, continuation);
            this.c = xVar;
            this.d = gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            n nVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                n nVar2 = (n) ((x.b) this.c).a();
                MutableSharedFlow mutableSharedFlow = this.d.c;
                this.a = nVar2;
                this.b = 1;
                if (mutableSharedFlow.emit(nVar2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                nVar = nVar2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nVar = (n) this.a;
                ResultKt.throwOnFailure(obj);
            }
            this.d.a(nVar);
            return Unit.INSTANCE;
        }
    }

    public g(@NotNull Context context, @NotNull CoroutineScope scope, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.a = z;
        this.b = CoroutineScopeKt.plus(scope, com.moloco.sdk.internal.scheduling.b.a().getMain());
        MutableSharedFlow MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.c = MutableSharedFlow$default;
        this.d = MutableSharedFlow$default;
        v vVar = new v(context, new a());
        this.e = vVar;
        this.f = vVar;
        this.g = vVar.c();
        this.h = vVar.getUnrecoverableError();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f
    @NotNull
    public StateFlow H() {
        return this.g;
    }

    public final boolean b(String str) {
        x<n, n.b.a> a2 = n.b.a(str);
        if (a2 instanceof x.b) {
            BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new b(a2, this, null), 3, null);
            return true;
        }
        if (a2 instanceof x.a) {
            return ((n.b.a) ((x.a) a2).a()).b();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f
    @NotNull
    public WebView c() {
        return this.f;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void destroy() {
        this.e.destroy();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f
    public void j() {
        c("mraidbridge.notifyReadyEvent()");
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f
    @NotNull
    public SharedFlow v() {
        return this.d;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f
    @NotNull
    public StateFlow w() {
        return this.h;
    }

    public final void c(String str) {
        MolocoAdsNetworkBridge.webviewLoadUrl(this.e, "javascript:" + str);
    }

    public final void a(n nVar) {
        c("mraidbridge.nativeCallComplete(" + JSONObject.quote(nVar.a()) + ')');
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f
    public void a(@NotNull n command, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(command, "command");
        Intrinsics.checkNotNullParameter(msg, "msg");
        c("mraidbridge.notifyErrorEvent(" + JSONObject.quote(command.a()) + ", " + JSONObject.quote(msg) + ')');
    }

    public final String b(Rect rect) {
        StringBuilder sb = new StringBuilder();
        sb.append(rect.width());
        sb.append(',');
        sb.append(rect.height());
        return sb.toString();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f
    public void a(boolean z) {
        c("mraidbridge.setIsViewable(" + z + ')');
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f
    public void a(@NotNull r placementType) {
        Intrinsics.checkNotNullParameter(placementType, "placementType");
        c("mraidbridge.setPlacementType(" + JSONObject.quote(placementType.c()) + ')');
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f
    public void a(@NotNull t state) {
        Intrinsics.checkNotNullParameter(state, "state");
        c("mraidbridge.setState(" + JSONObject.quote(state.c()) + ')');
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f
    public void a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        c("mraidbridge.setSupports(" + z + ',' + z2 + ',' + z3 + ',' + z4 + ',' + z5 + ')');
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f
    public void a(@NotNull s screenMetrics) {
        Intrinsics.checkNotNullParameter(screenMetrics, "screenMetrics");
        c("\n                mraidbridge.setScreenSize(" + b(screenMetrics.g()) + ");\n                mraidbridge.setMaxSize(" + b(screenMetrics.f()) + ");\n                mraidbridge.setCurrentPosition(" + a(screenMetrics.b()) + ");\n                mraidbridge.setDefaultPosition(" + a(screenMetrics.d()) + ")\n            ");
        StringBuilder sb = new StringBuilder();
        sb.append("mraidbridge.notifySizeChangeEvent(");
        sb.append(b(screenMetrics.b()));
        sb.append(')');
        c(sb.toString());
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

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f
    @Nullable
    public Object a(@NotNull String str, @NotNull Continuation continuation) {
        return this.e.a(str, this.a, continuation);
    }
}
