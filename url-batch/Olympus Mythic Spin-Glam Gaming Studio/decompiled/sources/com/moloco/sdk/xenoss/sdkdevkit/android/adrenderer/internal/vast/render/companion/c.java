package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.c;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes8.dex */
public final class c implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.a {
    public static final int q = 8;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c a;

    @NotNull
    public final Context b;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a c;

    @NotNull
    public final r d;
    public final boolean e;

    @NotNull
    public final k f;

    @NotNull
    public final CoroutineScope g;

    @NotNull
    public final d h;

    @NotNull
    public a.AbstractC1677a.f i;

    @NotNull
    public final g j;

    @NotNull
    public final MutableSharedFlow k;

    @NotNull
    public final Flow l;
    public final boolean m;

    @Nullable
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k n;

    @NotNull
    public final MutableStateFlow o;

    @NotNull
    public final StateFlow p;

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.CompanionControllerImpl$1", f = "CompanionControllerImpl.kt", l = {108}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements Function2 {
        public Object a;
        public int b;

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
            return c.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            c cVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                c cVar2 = c.this;
                y e = cVar2.a.e();
                Context context = c.this.b;
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar = c.this.c;
                r rVar = c.this.d;
                int f = c.this.a.f();
                int d = c.this.a.d();
                final c cVar3 = c.this;
                Function0 function0 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.c$a$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke */
                    public final Object mo4828invoke() {
                        return c.a.a(c.this);
                    }
                };
                final c cVar4 = c.this;
                Function1 function1 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.c$a$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return c.a.a(c.this, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) obj2);
                    }
                };
                boolean z = c.this.e;
                k kVar = c.this.f;
                this.a = cVar2;
                this.b = 1;
                Object a = l.a(e, context, aVar, rVar, f, d, function0, function1, z, kVar, this);
                if (a == coroutine_suspended) {
                    return coroutine_suspended;
                }
                cVar = cVar2;
                obj = a;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cVar = (c) this.a;
                ResultKt.throwOnFailure(obj);
            }
            cVar.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k) obj);
            return Unit.INSTANCE;
        }

        public static final Unit a(c cVar) {
            cVar.j.a(cVar.i);
            cVar.a(b.a.b);
            return Unit.INSTANCE;
        }

        public static final Unit a(c cVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar2) {
            cVar.a(cVar2);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.CompanionControllerImpl$onEvent$1", f = "CompanionControllerImpl.kt", l = {57}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b bVar, Continuation continuation) {
            super(2, continuation);
            this.c = bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return c.this.new b(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow mutableSharedFlow = c.this.k;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b bVar = this.c;
                this.a = 1;
                if (mutableSharedFlow.emit(bVar, this) == coroutine_suspended) {
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

    public /* synthetic */ c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c cVar, int i, Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, r rVar, boolean z, k kVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, i, context, aVar, rVar, z, kVar);
    }

    public static Object j(c cVar) {
        return Reflection.property0(new PropertyReference0Impl(cVar.h, d.class, "goNextAction", "getGoNextAction()Lkotlinx/coroutines/flow/StateFlow;", 0));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.b
    public boolean J() {
        return this.m;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h
    @NotNull
    public StateFlow K() {
        return this.p;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void destroy() {
        CoroutineScopeKt.cancel$default(this.g, null, 1, null);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k kVar = this.n;
        if (kVar != null) {
            kVar.destroy();
        }
        a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k) null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d
    @NotNull
    public StateFlow l() {
        return this.h.l();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.d
    public void reset() {
        this.h.reset();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h
    public void y() {
        a(b.C1647b.b);
    }

    public c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c companion, int i, Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, r externalLinkHandler, boolean z, k linkHandler) {
        Intrinsics.checkNotNullParameter(companion, "companion");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(linkHandler, "linkHandler");
        this.a = companion;
        this.b = context;
        this.c = customUserEventBuilderService;
        this.d = externalLinkHandler;
        this.e = z;
        this.f = linkHandler;
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain());
        this.g = CoroutineScope;
        this.h = f.a(i, CoroutineScope);
        this.i = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.c.a.a(Offset.INSTANCE.m1308getZeroF1C5BW0());
        this.j = new g(customUserEventBuilderService, companion.b(), companion.c(), null, null, 24, null);
        MutableSharedFlow MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.k = MutableSharedFlow$default;
        this.l = MutableSharedFlow$default;
        this.m = companion.a() != null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k kVar = this.n;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(kVar != null ? kVar.k() : null);
        this.o = MutableStateFlow;
        this.p = MutableStateFlow;
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new a(null), 3, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h
    public void b() {
        this.j.a();
        a(b.c.b);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.a
    @NotNull
    public Flow a() {
        return this.l;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.b
    public void b(@NotNull a.AbstractC1677a.f position) {
        Intrinsics.checkNotNullParameter(position, "position");
        String a2 = this.a.a();
        if (a2 != null) {
            this.j.a(position);
            a(b.a.b);
            this.f.a(a2);
        }
    }

    public final Job a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b bVar) {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.g, null, null, new b(bVar, null), 3, null);
        return launch$default;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h
    public void a(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c error) {
        Intrinsics.checkNotNullParameter(error, "error");
        a(new b.d(error));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g
    public void a(@NotNull a.AbstractC1677a.c button) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.j.a(button);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g
    public void a(@NotNull a.AbstractC1677a.c.EnumC1679a buttonType) {
        Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        this.j.a(buttonType);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h
    public void a(@NotNull a.AbstractC1677a.f position) {
        Intrinsics.checkNotNullParameter(position, "position");
        this.i = position;
    }

    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k kVar) {
        this.n = kVar;
        this.o.setValue(kVar != null ? kVar.k() : null);
    }
}
