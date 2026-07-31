package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@SuppressLint({"ViewConstructor"})
/* loaded from: classes5.dex */
public final class N extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w> {

    @NotNull
    public static final a r = new a(null);
    public static final int s = 8;

    @NotNull
    public static final String t = "VastBannerView";

    @NotNull
    public final Context j;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a k;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x l;

    @NotNull
    public final r m;

    @NotNull
    public final CoroutineScope n;

    @NotNull
    public final L o;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i p;

    @Nullable
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a q;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.VastBannerView$listenToPlayerEvents$1", f = "VastBannerView.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements Function2 {
        public int a;
        public /* synthetic */ Object b;

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar, Continuation continuation) {
            return ((b) create(bVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            b bVar = N.this.new b(continuation);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b) this.b;
            if (Intrinsics.areEqual(bVar, b.i.b)) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w adShowListener = N.this.getAdShowListener();
                if (adShowListener != null) {
                    adShowListener.a(true);
                }
            } else if (!Intrinsics.areEqual(bVar, b.j.b)) {
                if (Intrinsics.areEqual(bVar, b.c.b)) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w adShowListener2 = N.this.getAdShowListener();
                    if (adShowListener2 != null) {
                        adShowListener2.a(false);
                    }
                } else if (Intrinsics.areEqual(bVar, b.a.b)) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w adShowListener3 = N.this.getAdShowListener();
                    if (adShowListener3 != null) {
                        adShowListener3.b();
                    }
                } else if (bVar instanceof b.f) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w adShowListener4 = N.this.getAdShowListener();
                    if (adShowListener4 != null) {
                        adShowListener4.a(((b.f) bVar).a());
                    }
                } else if (!Intrinsics.areEqual(bVar, b.g.b) && !Intrinsics.areEqual(bVar, b.C1639b.b) && !Intrinsics.areEqual(bVar, b.d.b) && !Intrinsics.areEqual(bVar, b.h.b) && !Intrinsics.areEqual(bVar, b.e.b)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(@NotNull Context context, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x options, @NotNull r externalLinkHandler, @NotNull CoroutineScope scope, @NotNull L adLoader) {
        super(context, scope);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(adLoader, "adLoader");
        this.j = context;
        this.k = customUserEventBuilderService;
        this.l = options;
        this.m = externalLinkHandler;
        this.n = scope;
        this.o = adLoader;
        setTag("MolocoVastBannerView");
        this.p = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.a;
    }

    public final void a(Throwable th) {
        MolocoLogger.error$default(MolocoLogger.INSTANCE, t, "Compose dependency not available, cannot render VAST banner ad", th, false, 8, null);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w adShowListener = getAdShowListener();
        if (adShowListener != null) {
            adShowListener.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l.e);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void destroy() {
        super.destroy();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar = this.q;
        if (aVar != null) {
            aVar.destroy();
        }
        this.q = null;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.D, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j
    @NotNull
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i getCreativeType() {
        return this.p;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B
    public void k() {
        com.moloco.sdk.internal.x<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c> d = getAdLoader().d();
        if (d instanceof x.a) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) ((x.a) d).a();
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w adShowListener = getAdShowListener();
            if (adShowListener != null) {
                adShowListener.a(cVar);
                return;
            }
            return;
        }
        if (!(d instanceof x.b)) {
            throw new NoWhenBranchMatchedException();
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) ((x.b) d).a(), this.m, this.j, this.k, this.l.i(), this.l.g(), this.l.h(), this.l.e(), this.l.f(), this.l.d(), this.l.c(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.i(false, false, false, false, null, null, null).a(this.m, null));
        this.q = a2;
        try {
            setAdView((View) this.l.j().invoke(this.j, a2));
            n();
            a2.d();
        } catch (ClassNotFoundException e) {
            a(e);
        } catch (NoClassDefFoundError e2) {
            a(e2);
        }
    }

    public final void n() {
        Flow a2;
        Flow onEach;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar = this.q;
        if (aVar == null || (a2 = aVar.a()) == null || (onEach = FlowKt.onEach(a2, new b(null))) == null) {
            return;
        }
        FlowKt.launchIn(onEach, this.n);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B
    @NotNull
    public L getAdLoader() {
        return this.o;
    }
}
