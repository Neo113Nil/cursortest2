package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.s;
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
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@StabilityInferred
/* loaded from: classes4.dex */
public final class b implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a {
    public static final int e = 8;

    @NotNull
    public final s a;

    @NotNull
    public final CoroutineScope b;

    @NotNull
    public final MutableSharedFlow c;

    @NotNull
    public final MutableSharedFlow d;

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.ClickthroughEventHandler$handleEvent$1", f = "ClickthroughEventHandler.kt", l = {34}, m = "invokeSuspend")
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
            return b.this.new a(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                s sVar = b.this.a;
                String str = this.c;
                Intrinsics.checkNotNull(str);
                MutableSharedFlow mutableSharedFlow = b.this.c;
                this.a = 1;
                if (sVar.a(str, mutableSharedFlow, this) == coroutine_suspended) {
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

    public b(@NotNull s clickthroughService, @NotNull CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(clickthroughService, "clickthroughService");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.a = clickthroughService;
        this.b = scope;
        MutableSharedFlow MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.c = MutableSharedFlow$default;
        this.d = MutableSharedFlow$default;
    }

    @NotNull
    public final MutableSharedFlow c() {
        return this.d;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    @NotNull
    public Set<String> a() {
        return SetsKt.setOf("clickthrough");
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    @NotNull
    public String b() {
        return "ClickthroughEventHandler";
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public void a(@NotNull JSONObject event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!Intrinsics.areEqual(event.getString("event"), CollectionsKt.first(a()))) {
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, b(), "Event not supported: " + event.getString("event"), false, 4, null);
            return;
        }
        String string = event.getString("contentType");
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, b(), "Ad clicked on " + string, false, 4, null);
        BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new a(event.getString("url"), null), 3, null);
    }

    public /* synthetic */ b(s sVar, CoroutineScope coroutineScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sVar, (i & 2) != 0 ? CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()) : coroutineScope);
    }
}
