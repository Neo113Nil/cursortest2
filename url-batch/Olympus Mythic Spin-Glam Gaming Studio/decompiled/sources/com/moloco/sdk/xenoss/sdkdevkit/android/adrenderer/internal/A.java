package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC5050b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes5.dex */
public final class A implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f> {

    @NotNull
    public final Context a;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y b;

    @NotNull
    public final y c;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e d;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.j e;

    @NotNull
    public final MraidActivity.Companion f;

    @Nullable
    public final String g;

    @NotNull
    public final MetricsRecorder h;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i i;

    @NotNull
    public final CoroutineScope j;

    @Nullable
    public InterfaceC5050b.a k;

    @Nullable
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e l;
    public boolean m;

    @NotNull
    public final MutableStateFlow n;

    @NotNull
    public final StateFlow o;

    @NotNull
    public final MutableStateFlow p;

    @NotNull
    public final StateFlow q;

    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1 {
        public a(Object obj) {
            super(1, obj, A.class, "onError", "onError(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/MraidAdError;)V", 0);
        }

        public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((A) this.receiver).a(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d) obj);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class b extends FunctionReferenceImpl implements Function0 {
        public b(Object obj) {
            super(0, obj, A.class, "destroy", "destroy()V", 0);
        }

        public final void a() {
            ((A) this.receiver).destroy();
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class c extends FunctionReferenceImpl implements Function0 {
        public c(Object obj) {
            super(0, obj, A.class, "onForciblyClosed", "onForciblyClosed()V", 0);
        }

        public final void a() {
            ((A) this.receiver).n();
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public A(@NotNull Context context, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark, @NotNull y mraidAdLoader, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e mraidBaseAd, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.j mraidFullscreenController, @NotNull MraidActivity.Companion mraidActivity, @Nullable String str, @NotNull MetricsRecorder metricsRecorder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(mraidAdLoader, "mraidAdLoader");
        Intrinsics.checkNotNullParameter(mraidBaseAd, "mraidBaseAd");
        Intrinsics.checkNotNullParameter(mraidFullscreenController, "mraidFullscreenController");
        Intrinsics.checkNotNullParameter(mraidActivity, "mraidActivity");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.a = context;
        this.b = watermark;
        this.c = mraidAdLoader;
        this.d = mraidBaseAd;
        this.e = mraidFullscreenController;
        this.f = mraidActivity;
        this.g = str;
        this.h = metricsRecorder;
        this.i = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.b;
        this.j = CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain());
        Boolean bool = Boolean.FALSE;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(bool);
        this.n = MutableStateFlow;
        this.o = MutableStateFlow;
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(bool);
        this.p = MutableStateFlow2;
        this.q = MutableStateFlow2;
    }

    public static Object b(A a2) {
        return Reflection.property0(new PropertyReference0Impl(a2.c, y.class, "isLoaded", "isLoaded()Lkotlinx/coroutines/flow/StateFlow;", 0));
    }

    public static final Unit c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e eVar) {
        if (eVar != null) {
            eVar.a();
        }
        return Unit.INSTANCE;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void destroy() {
        CoroutineScopeKt.cancel$default(this.j, null, 1, null);
        this.d.destroy();
        this.n.setValue(Boolean.FALSE);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j
    @NotNull
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i getCreativeType() {
        return this.i;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC5050b
    @NotNull
    public StateFlow isLoaded() {
        return this.c.isLoaded();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m
    @NotNull
    public StateFlow k() {
        return this.q;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC5049a
    @NotNull
    public StateFlow l() {
        return this.o;
    }

    public final void n() {
        this.p.setValue(Boolean.TRUE);
    }

    public static final Unit b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e eVar) {
        if (eVar != null) {
            eVar.b();
        }
        return Unit.INSTANCE;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC5050b
    public void a(long j, @Nullable InterfaceC5050b.a aVar) {
        this.k = aVar;
        this.d.b(new a(this));
        this.c.a(j, aVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l
    public void a(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f options, @Nullable final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e eVar) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.d.a(new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.A$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return A.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e.this);
            }
        });
        this.d.a(new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.A$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return A.a(A.this, (String) obj);
            }
        });
        this.l = eVar;
        this.m = true;
        com.moloco.sdk.internal.x<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d> a2 = this.c.a();
        if (a2 instanceof x.a) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d dVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d) ((x.a) a2).a();
            if (eVar != null) {
                eVar.a(dVar);
                return;
            }
            return;
        }
        if (a2 instanceof x.b) {
            if (this.f.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c) ((x.b) a2).a(), this.e, this.a, options, this.b, new b(this), new c(this), this.d.T(), new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.A$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public final Object mo4828invoke() {
                    return A.c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e.this);
                }
            }, new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.A$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return A.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e.this, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) obj);
                }
            }, this.g, this.h)) {
                this.n.setValue(Boolean.TRUE);
                return;
            } else {
                if (eVar != null) {
                    eVar.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.j);
                    return;
                }
                return;
            }
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Unit a(A a2, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        a2.e.a(url, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.f.a());
        return Unit.INSTANCE;
    }

    public static final Unit a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e eVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (eVar != null) {
            eVar.a(error);
        }
        return Unit.INSTANCE;
    }

    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d dVar) {
        if (this.m) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e eVar = this.l;
            if (eVar != null) {
                eVar.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.e.b(dVar));
                return;
            }
            return;
        }
        InterfaceC5050b.a aVar = this.k;
        if (aVar != null) {
            aVar.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.e.b(dVar));
        }
    }
}
