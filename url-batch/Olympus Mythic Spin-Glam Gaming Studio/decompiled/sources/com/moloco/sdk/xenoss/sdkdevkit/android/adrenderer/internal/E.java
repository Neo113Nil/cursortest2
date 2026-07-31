package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC5050b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes5.dex */
public final class E implements InterfaceC5050b {
    public static final int g = 8;

    @NotNull
    public final String a;

    @NotNull
    public final CoroutineScope b;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a c;

    @NotNull
    public final String d;

    @NotNull
    public final MutableStateFlow e;

    @NotNull
    public final StateFlow f;

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.StaticAdLoad$load$1", f = "StaticAdLoad.kt", l = {23}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ long c;
        public final /* synthetic */ InterfaceC5050b.a d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, InterfaceC5050b.a aVar, Continuation continuation) {
            super(2, continuation);
            this.c = j;
            this.d = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return E.this.new a(this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a aVar = E.this.c;
                String str = E.this.a;
                long j = this.c;
                this.a = 1;
                obj = aVar.a(str, j, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            com.moloco.sdk.internal.x xVar = (com.moloco.sdk.internal.x) obj;
            if (xVar instanceof x.b) {
                E.this.e.setValue(Boxing.boxBoolean(true));
                InterfaceC5050b.a aVar2 = this.d;
                if (aVar2 != null) {
                    aVar2.a();
                }
            } else {
                if (!(xVar instanceof x.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC5050b.a aVar3 = this.d;
                if (aVar3 != null) {
                    aVar3.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) ((x.a) xVar).a());
                }
            }
            return Unit.INSTANCE;
        }
    }

    public E(@NotNull String adm, @NotNull CoroutineScope scope, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a staticWebView) {
        Intrinsics.checkNotNullParameter(adm, "adm");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(staticWebView, "staticWebView");
        this.a = adm;
        this.b = scope;
        this.c = staticWebView;
        this.d = "StaticAdLoad";
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.e = MutableStateFlow;
        this.f = MutableStateFlow;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC5050b
    @NotNull
    public StateFlow isLoaded() {
        return this.f;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC5050b
    public void a(long j, @Nullable InterfaceC5050b.a aVar) {
        BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new a(j, aVar, null), 3, null);
    }
}
