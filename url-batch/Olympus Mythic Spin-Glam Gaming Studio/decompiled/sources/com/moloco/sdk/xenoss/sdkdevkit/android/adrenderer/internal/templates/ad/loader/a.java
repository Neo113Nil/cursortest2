package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC5050b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes13.dex */
public final class a implements InterfaceC5050b {

    @NotNull
    public static final C1602a f = new C1602a(null);
    public static final int g = 8;

    @NotNull
    public static final String h = "WebViewAdLoad";

    @NotNull
    public final String a;

    @NotNull
    public final CoroutineScope b;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b c;

    @NotNull
    public final MutableStateFlow d;

    @NotNull
    public final StateFlow e;

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader.a$a, reason: collision with other inner class name */
    public static final class C1602a {
        public /* synthetic */ C1602a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C1602a() {
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader.WebViewAdLoad$load$1", f = "WebviewAdLoad.kt", l = {21}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ long c;
        public final /* synthetic */ InterfaceC5050b.a d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, InterfaceC5050b.a aVar, Continuation continuation) {
            super(2, continuation);
            this.c = j;
            this.d = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return a.this.new b(this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b a = a.this.a();
                String str = a.this.a;
                long j = this.c;
                this.a = 1;
                obj = a.a(str, j, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            x xVar = (x) obj;
            if (xVar instanceof x.b) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, a.h, "WebViewAdLoad: load success", null, false, 12, null);
                a.this.d.setValue(Boxing.boxBoolean(true));
                InterfaceC5050b.a aVar = this.d;
                if (aVar != null) {
                    aVar.a();
                }
            } else {
                if (!(xVar instanceof x.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                MolocoLogger.info$default(MolocoLogger.INSTANCE, a.h, "WebViewAdLoad: load failure", null, false, 12, null);
                a.this.d.setValue(Boxing.boxBoolean(false));
                InterfaceC5050b.a aVar2 = this.d;
                if (aVar2 != null) {
                    aVar2.a((c) ((x.a) xVar).a());
                }
            }
            return Unit.INSTANCE;
        }
    }

    public a(@NotNull String adm, @NotNull CoroutineScope scope, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b webView) {
        Intrinsics.checkNotNullParameter(adm, "adm");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.a = adm;
        this.b = scope;
        this.c = webView;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.d = MutableStateFlow;
        this.e = MutableStateFlow;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC5050b
    @NotNull
    public StateFlow isLoaded() {
        return this.e;
    }

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b a() {
        return this.c;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC5050b
    public void a(long j, @Nullable InterfaceC5050b.a aVar) {
        BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new b(j, aVar, null), 3, null);
    }
}
