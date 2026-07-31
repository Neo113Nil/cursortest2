package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.acm.CountEvent;
import com.moloco.sdk.acm.TimerEvent;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ortb.model.C5023e;
import com.moloco.sdk.internal.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC5050b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.O;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b;
import java.io.File;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@VisibleForTesting
/* loaded from: classes10.dex */
public final class O implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x> {

    @NotNull
    public static final a l = new a(null);
    public static final int m = 8;

    @NotNull
    public static final String n = "VastFullscreenAdImpl";

    @NotNull
    public final Context a;

    @NotNull
    public final C5023e b;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y c;

    @NotNull
    public final MetricsRecorder d;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i e;

    @NotNull
    public final CoroutineScope f;

    @NotNull
    public final L g;

    @NotNull
    public final MutableStateFlow h;

    @NotNull
    public final StateFlow i;

    @NotNull
    public final MutableStateFlow j;

    @NotNull
    public final StateFlow k;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.VastFullscreenAdImpl$show$1", f = "VastFullscreenAd.kt", l = {144}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w c;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x d;

        public /* synthetic */ class a extends FunctionReferenceImpl implements Function0 {
            public a(Object obj) {
                super(0, obj, O.class, "onClose", "onClose()V", 0);
            }

            public final void a() {
                ((O) this.receiver).n();
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo4828invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w wVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x xVar, Continuation continuation) {
            super(2, continuation);
            this.c = wVar;
            this.d = xVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return O.this.new b(this.c, this.d, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v16, types: [T, com.moloco.sdk.acm.CountEvent] */
        /* JADX WARN: Type inference failed for: r0v19, types: [T, com.moloco.sdk.acm.CountEvent] */
        /* JADX WARN: Type inference failed for: r0v20, types: [T, com.moloco.sdk.acm.CountEvent] */
        /* JADX WARN: Type inference failed for: r0v21, types: [T, com.moloco.sdk.acm.CountEvent] */
        /* JADX WARN: Type inference failed for: r0v7, types: [T, com.moloco.sdk.acm.CountEvent] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Integer e;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            boolean z = false;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    com.moloco.sdk.internal.x<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c> d = O.this.g.d();
                    if (d instanceof x.a) {
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) ((x.a) d).a();
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w wVar = this.c;
                        if (wVar != null) {
                            wVar.a(cVar);
                        }
                        return Unit.INSTANCE;
                    }
                    if (!(d instanceof x.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) ((x.b) d).a();
                    if (!aVar.j().j().exists()) {
                        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                        MolocoLogger.info$default(molocoLogger, O.n, "VAST ad media file does not exist", null, false, 12, null);
                        File j = aVar.j().j();
                        com.moloco.sdk.internal.utils.f fVar = com.moloco.sdk.internal.utils.f.a;
                        File cacheDir = O.this.a.getCacheDir();
                        Intrinsics.checkNotNullExpressionValue(cacheDir, "getCacheDir(...)");
                        com.moloco.sdk.internal.utils.e a2 = fVar.a(cacheDir);
                        String b = (a2 == null || (e = a2.e()) == null) ? null : fVar.b(e.intValue());
                        String a3 = fVar.a(j, O.this.a);
                        File parentFile = j.getParentFile();
                        Integer a4 = O.this.g.a();
                        String a5 = a4 != null ? fVar.a(a4.intValue()) : null;
                        StringBuilder sb = new StringBuilder();
                        sb.append("\n                    ACM Event: vast_show_file_not_exists\n                    - storage_bucket_at_show: ");
                        sb.append(b);
                        sb.append("\n                    - storage_bucket_at_load: ");
                        sb.append(O.this.g.b());
                        sb.append("\n                    - download_bucket_at_show: ");
                        sb.append(a5);
                        sb.append("\n                    - cache_location_type: ");
                        sb.append(a3);
                        sb.append("\n                    - cache_dir_exists: ");
                        sb.append(parentFile != null && parentFile.exists());
                        sb.append("\n                ");
                        MolocoLogger.info$default(molocoLogger, O.n, StringsKt.trimIndent(sb.toString()), null, false, 12, null);
                        TimerEvent c = O.this.g.c();
                        if (c != null) {
                            O.this.d.recordTimerEvent(c);
                        }
                        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                        CountEvent countEvent = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.a0.c());
                        if (parentFile != null && parentFile.exists()) {
                            z = true;
                        }
                        ?? withTag = countEvent.withTag("cache_dir_exists", String.valueOf(z));
                        ref$ObjectRef.element = withTag;
                        if (b != null) {
                            ref$ObjectRef.element = withTag.withTag("storage_bucket_at_show", b);
                        }
                        String b2 = O.this.g.b();
                        if (b2 != null) {
                            ref$ObjectRef.element = ((CountEvent) ref$ObjectRef.element).withTag("storage_bucket_at_load", b2);
                        }
                        if (a5 != null) {
                            ref$ObjectRef.element = ((CountEvent) ref$ObjectRef.element).withTag("download_bucket_at_show", a5);
                        }
                        if (a3 != null) {
                            ref$ObjectRef.element = ((CountEvent) ref$ObjectRef.element).withTag("cache_location_type", a3);
                        }
                        O.this.d.recordCountEvent((CountEvent) ref$ObjectRef.element);
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w wVar2 = this.c;
                        if (wVar2 != null) {
                            wVar2.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l.d);
                        }
                        return Unit.INSTANCE;
                    }
                    VastActivity.Companion companion = VastActivity.INSTANCE;
                    Context context = O.this.a;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x xVar = this.d;
                    a aVar2 = new a(O.this);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y yVar = O.this.c;
                    String bundle = O.this.b.getBundle();
                    MetricsRecorder metricsRecorder = O.this.d;
                    final O o = O.this;
                    final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w wVar3 = this.c;
                    Function1 function1 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.O$b$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return O.b.a(O.this, wVar3, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b) obj2);
                        }
                    };
                    this.a = 1;
                    if (companion.a(aVar, context, xVar, aVar2, yVar, bundle, metricsRecorder, function1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                O.this.h.setValue(Boxing.boxBoolean(false));
                return Unit.INSTANCE;
            } catch (Throwable th) {
                O.this.h.setValue(Boxing.boxBoolean(false));
                throw th;
            }
        }

        public static final Unit a(O o, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w wVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar) {
            o.a(bVar, wVar);
            return Unit.INSTANCE;
        }
    }

    public O(@NotNull Context context, @NotNull C5023e bid, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d loadVast, @NotNull InterfaceC5064m decLoader, boolean z, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark, @NotNull MetricsRecorder metricsRecorder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bid, "bid");
        Intrinsics.checkNotNullParameter(loadVast, "loadVast");
        Intrinsics.checkNotNullParameter(decLoader, "decLoader");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.a = context;
        this.b = bid;
        this.c = watermark;
        this.d = metricsRecorder;
        this.e = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.a;
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain());
        this.f = CoroutineScope;
        this.g = new L(bid, CoroutineScope, loadVast, decLoader, z, metricsRecorder);
        Boolean bool = Boolean.FALSE;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(bool);
        this.h = MutableStateFlow;
        this.i = MutableStateFlow;
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(bool);
        this.j = MutableStateFlow2;
        this.k = MutableStateFlow2;
    }

    public static Object h(O o) {
        return Reflection.property0(new PropertyReference0Impl(o.g, L.class, "isLoaded", "isLoaded()Lkotlinx/coroutines/flow/StateFlow;", 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n() {
        this.j.setValue(Boolean.TRUE);
        this.h.setValue(Boolean.FALSE);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void destroy() {
        CoroutineScopeKt.cancel$default(this.f, null, 1, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j
    @NotNull
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i getCreativeType() {
        return this.e;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC5050b
    @NotNull
    public StateFlow isLoaded() {
        return this.g.isLoaded();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m
    @NotNull
    public StateFlow k() {
        return this.k;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC5049a
    @NotNull
    public StateFlow l() {
        return this.i;
    }

    public final void p() {
        this.h.setValue(Boolean.TRUE);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC5050b
    public void a(long j, @Nullable InterfaceC5050b.a aVar) {
        this.g.a(j, aVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l
    public void a(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x options, @Nullable com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w wVar) {
        Intrinsics.checkNotNullParameter(options, "options");
        BuildersKt__Builders_commonKt.launch$default(this.f, null, null, new b(wVar, options, null), 3, null);
    }

    @VisibleForTesting
    public final void a(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b event, @Nullable com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w wVar) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (Intrinsics.areEqual(event, b.g.b)) {
            p();
            return;
        }
        if (Intrinsics.areEqual(event, b.C1639b.b)) {
            p();
            return;
        }
        if (Intrinsics.areEqual(event, b.d.b)) {
            p();
            return;
        }
        if (Intrinsics.areEqual(event, b.i.b)) {
            if (wVar != null) {
                wVar.a(true);
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(event, b.j.b)) {
            if (wVar != null) {
                wVar.a();
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(event, b.c.b)) {
            if (wVar != null) {
                wVar.a(false);
            }
        } else if (Intrinsics.areEqual(event, b.a.b)) {
            if (wVar != null) {
                wVar.b();
            }
        } else if (event instanceof b.f) {
            if (wVar != null) {
                wVar.a(((b.f) event).a());
            }
        } else if (!Intrinsics.areEqual(event, b.h.b) && !Intrinsics.areEqual(event, b.e.b)) {
            throw new NoWhenBranchMatchedException();
        }
    }
}
