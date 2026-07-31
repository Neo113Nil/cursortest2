package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@StabilityInferred
/* loaded from: classes.dex */
public final class d implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a {
    public static final int d = 8;

    @NotNull
    public final CoroutineScope a;

    @NotNull
    public final MutableSharedFlow b;

    @NotNull
    public final SharedFlow c;

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.CloseHandler$handleEvent$1", f = "CloseHandler.kt", l = {29}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements Function2 {
        public int a;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return d.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow mutableSharedFlow = d.this.b;
                Unit unit = Unit.INSTANCE;
                this.a = 1;
                if (mutableSharedFlow.emit(unit, this) == coroutine_suspended) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    @NotNull
    public String b() {
        return "CloseHandler";
    }

    @NotNull
    public final SharedFlow c() {
        return this.c;
    }

    public d(@NotNull CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.a = scope;
        MutableSharedFlow MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.b = MutableSharedFlow$default;
        this.c = FlowKt.asSharedFlow(MutableSharedFlow$default);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    @NotNull
    public Set<String> a() {
        return SetsKt.setOf("close");
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public void a(@NotNull JSONObject event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (Intrinsics.areEqual(event.getString("event"), CollectionsKt.first(a()))) {
            BuildersKt__Builders_commonKt.launch$default(this.a, null, null, new a(null), 3, null);
            return;
        }
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, b(), "Event not supported: " + event.getString("event"), false, 4, null);
    }

    public /* synthetic */ d(CoroutineScope coroutineScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()) : coroutineScope);
    }
}
