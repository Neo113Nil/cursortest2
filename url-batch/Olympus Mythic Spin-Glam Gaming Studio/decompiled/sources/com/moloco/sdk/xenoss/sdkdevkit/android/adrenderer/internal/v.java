package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.ortb.model.C5023e;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity;
import kotlin.UInt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes6.dex */
public final class v implements InterfaceC5071u {
    public static final int a = 0;

    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1 {
        public a(Object obj) {
            super(1, obj, b.class, "loadAndReadyMraid", "loadAndReadyMraid(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((b) this.receiver).b(continuation);
        }
    }

    public static final class b extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e {
        public final /* synthetic */ MutableStateFlow o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, r rVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f fVar, MutableStateFlow mutableStateFlow, String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.r rVar2) {
            super(context, str, rVar2, null, null, null, rVar, false, fVar, 184, null);
            this.o = mutableStateFlow;
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e
        public void s() {
            super.s();
            this.o.setValue(Boolean.FALSE);
        }
    }

    public /* synthetic */ class c extends FunctionReferenceImpl implements Function0 {
        public c(Object obj) {
            super(0, obj, b.class, "closeFullscreenAdRepresentation", "closeFullscreenAdRepresentation()V", 0);
        }

        public final void a() {
            ((b) this.receiver).s();
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.InterfaceC5071u
    @NotNull
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f> a(@NotNull Context context, @NotNull CoroutineScope scope, @NotNull C5023e bid, @NotNull r externalLinkHandler, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark, @NotNull MutableStateFlow isAdDisplaying, boolean z, @NotNull MetricsRecorder metricsRecorder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(bid, "bid");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(isAdDisplaying, "isAdDisplaying");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.h.a(context, scope, z);
        b bVar = new b(context, externalLinkHandler, a2, isAdDisplaying, bid.getAdm(), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.r.c);
        return B.a(context, watermark, new y(scope, bid, a.C1563a.a.a(), new a(bVar)), bVar, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.k(true, new c(bVar), scope, UInt.m8055constructorimpl(RangesKt.coerceAtLeast(0, 0)), a2.c(), a2.v(), null, 64, null), MraidActivity.INSTANCE, bid.getBundle(), metricsRecorder);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.InterfaceC5071u
    @NotNull
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x> a(@NotNull Context context, @NotNull C5023e bid, boolean z, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark, @NotNull MetricsRecorder metricsRecorder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bid, "bid");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        return P.a(context, bid, a.g.a.b().h(), watermark, metricsRecorder, null, null, 96, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.InterfaceC5071u
    @NotNull
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f> a(@NotNull Context context, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, @NotNull String adm, @NotNull r externalLinkHandler, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark, @NotNull MetricsRecorder metricsRecorder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(adm, "adm");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        return H.a(context, customUserEventBuilderService, adm, externalLinkHandler, watermark, metricsRecorder);
    }
}
