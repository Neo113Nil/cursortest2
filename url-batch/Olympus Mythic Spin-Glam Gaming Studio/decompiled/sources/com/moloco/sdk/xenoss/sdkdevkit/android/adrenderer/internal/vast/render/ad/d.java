package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d;
import kotlin.Deprecated;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes13.dex */
public final class d implements c {

    @NotNull
    public final StateFlow a;

    @NotNull
    public final MutableStateFlow b;

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.AdGoNextActionImpl$1", f = "AdGoNextAction.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements Function2 {
        public int a;
        public /* synthetic */ Object b;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(k kVar, Continuation continuation) {
            return ((a) create(kVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = new a(continuation);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            k kVar = (k) this.b;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.d a = kVar instanceof k.a ? ((k.a) kVar).a() : kVar instanceof k.b ? ((k.b) kVar).a() : null;
            if (a == null) {
                return Unit.INSTANCE;
            }
            a.reset();
            return Unit.INSTANCE;
        }
    }

    public d(@NotNull StateFlow currentPlaylistItem, @NotNull CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(currentPlaylistItem, "currentPlaylistItem");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.a = currentPlaylistItem;
        FlowKt.stateIn(FlowKt.onEach(currentPlaylistItem, new a(null)), scope, SharingStarted.Companion.getEagerly(), null);
        this.b = StateFlowKt.MutableStateFlow(d.a.c.b);
    }

    @Deprecated
    public static /* synthetic */ void f() {
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d
    @NotNull
    public StateFlow l() {
        k kVar = (k) this.a.getValue();
        if (kVar instanceof k.a) {
            return ((k.a) kVar).a().l();
        }
        if (kVar instanceof k.b) {
            return ((k.b) kVar).a().l();
        }
        if (kVar instanceof k.c) {
            return ((k.c) kVar).a().l();
        }
        if (kVar instanceof k.d) {
            return ((k.d) kVar).a().l();
        }
        if (kVar == null) {
            return this.b;
        }
        throw new NoWhenBranchMatchedException();
    }
}
