package com.moloco.sdk.internal.publisher;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.acm.CountEvent;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.InterfaceC5043f;
import com.moloco.sdk.internal.y;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdShowListener;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import java.util.Locale;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes15.dex */
public final class A implements z {

    @NotNull
    public static final a l = new a(null);
    public static final int m = 8;

    @NotNull
    public static final String n = "InternalAdShowListenerImpl";

    @Nullable
    public final AdShowListener a;

    @NotNull
    public final InterfaceC5043f b;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a c;

    @NotNull
    public final Function0 d;

    @NotNull
    public final Function0 e;

    @NotNull
    public final com.moloco.sdk.internal.y f;

    @NotNull
    public final com.moloco.sdk.internal.f g;

    @NotNull
    public final AdFormatType h;

    @NotNull
    public final MetricsRecorder i;

    @NotNull
    public final com.moloco.sdk.internal.client_metrics_data.a j;

    @Nullable
    public final Function0 k;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.InternalAdShowListenerImpl$onAdShowSuccess$2$1", f = "InternalAdShowListener.kt", l = {129}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ long c;
        public final /* synthetic */ C5035k d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, C5035k c5035k, Continuation continuation) {
            super(2, continuation);
            this.c = j;
            this.d = c5035k;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return A.this.new b(this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar = A.this.c;
                long j = this.c;
                a.AbstractC1677a.e eVar = a.AbstractC1677a.e.b;
                String a = this.d.a();
                this.a = 1;
                obj = aVar.a(j, eVar, a, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            A.this.g.a((String) obj);
            return Unit.INSTANCE;
        }
    }

    public A(@Nullable AdShowListener adShowListener, @NotNull InterfaceC5043f appLifecycleTrackerService, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, @NotNull Function0 provideSdkEvents, @NotNull Function0 provideBUrlData, @NotNull com.moloco.sdk.internal.y sdkEventUrlTracker, @NotNull com.moloco.sdk.internal.f bUrlTracker, @NotNull AdFormatType adType, @NotNull MetricsRecorder metricsRecorder, @NotNull com.moloco.sdk.internal.client_metrics_data.a acmClickDeduper, @Nullable Function0 function0) {
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(provideSdkEvents, "provideSdkEvents");
        Intrinsics.checkNotNullParameter(provideBUrlData, "provideBUrlData");
        Intrinsics.checkNotNullParameter(sdkEventUrlTracker, "sdkEventUrlTracker");
        Intrinsics.checkNotNullParameter(bUrlTracker, "bUrlTracker");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        Intrinsics.checkNotNullParameter(acmClickDeduper, "acmClickDeduper");
        this.a = adShowListener;
        this.b = appLifecycleTrackerService;
        this.c = customUserEventBuilderService;
        this.d = provideSdkEvents;
        this.e = provideBUrlData;
        this.f = sdkEventUrlTracker;
        this.g = bUrlTracker;
        this.h = adType;
        this.i = metricsRecorder;
        this.j = acmClickDeduper;
        this.k = function0;
    }

    @Override // com.moloco.sdk.internal.publisher.z
    public void onAdClicked(@NotNull MolocoAd molocoAd) {
        String onAdClicked;
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, n, "onAdClicked: " + molocoAd, false, 4, null);
        this.b.b();
        com.moloco.sdk.internal.ortb.model.B b2 = (com.moloco.sdk.internal.ortb.model.B) this.d.mo4828invoke();
        if (b2 != null && (onAdClicked = b2.getOnAdClicked()) != null) {
            y.a.a(this.f, onAdClicked, System.currentTimeMillis(), null, 4, null);
        }
        MetricsRecorder metricsRecorder = this.i;
        CountEvent countEvent = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.D.c());
        String c = com.moloco.sdk.internal.client_metrics_data.d.c.c();
        String lowerCase = this.h.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        metricsRecorder.recordCountEvent(C5032h.a(countEvent.withTag(c, lowerCase), this.k));
        this.j.a(this.h);
        AdShowListener adShowListener = this.a;
        if (adShowListener != null) {
            adShowListener.onAdClicked(molocoAd);
        }
    }

    @Override // com.moloco.sdk.internal.publisher.z
    public void onAdHidden(@NotNull MolocoAd molocoAd) {
        String onAdHidden;
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, n, "onAdHidden: " + molocoAd, false, 4, null);
        com.moloco.sdk.internal.ortb.model.B b2 = (com.moloco.sdk.internal.ortb.model.B) this.d.mo4828invoke();
        if (b2 != null && (onAdHidden = b2.getOnAdHidden()) != null) {
            y.a.a(this.f, onAdHidden, System.currentTimeMillis(), null, 4, null);
        }
        MetricsRecorder metricsRecorder = this.i;
        CountEvent countEvent = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.d0.c());
        String c = com.moloco.sdk.internal.client_metrics_data.d.c.c();
        String lowerCase = this.h.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        metricsRecorder.recordCountEvent(C5032h.a(countEvent.withTag(c, lowerCase), this.k));
        AdShowListener adShowListener = this.a;
        if (adShowListener != null) {
            adShowListener.onAdHidden(molocoAd);
        }
    }

    @Override // com.moloco.sdk.internal.publisher.z
    public void a(@NotNull MolocoAd molocoAd, @Nullable String str) {
        String onAdShowSuccess;
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        StringBuilder sb = new StringBuilder();
        sb.append("onAdShowSuccess: ");
        sb.append(molocoAd);
        sb.append(", creativeType: ");
        Function0 function0 = this.k;
        sb.append(function0 != null ? (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i) function0.mo4828invoke() : null);
        MolocoLogger.debug$default(molocoLogger, n, sb.toString(), false, 4, null);
        com.moloco.sdk.internal.ortb.model.B b2 = (com.moloco.sdk.internal.ortb.model.B) this.d.mo4828invoke();
        if (b2 != null && (onAdShowSuccess = b2.getOnAdShowSuccess()) != null) {
            y.a.a(this.f, onAdShowSuccess, System.currentTimeMillis(), null, 4, null);
        }
        this.j.a();
        C5035k c5035k = (C5035k) this.e.mo4828invoke();
        if (c5035k != null) {
            BuildersKt__Builders_commonKt.launch$default(com.moloco.sdk.internal.scheduling.c.a.b(), null, null, new b(System.currentTimeMillis(), c5035k, null), 3, null);
        }
        CountEvent countEvent = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.B.c());
        String c = com.moloco.sdk.internal.client_metrics_data.d.c.c();
        String lowerCase = this.h.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        CountEvent a2 = C5032h.a(countEvent.withTag(c, lowerCase), this.k);
        if (str != null) {
            a2.withTag(com.moloco.sdk.internal.client_metrics_data.d.j.c(), str);
        }
        this.i.recordCountEvent(a2);
        AdShowListener adShowListener = this.a;
        if (adShowListener != null) {
            adShowListener.onAdShowSuccess(molocoAd);
        }
    }

    public /* synthetic */ A(AdShowListener adShowListener, InterfaceC5043f interfaceC5043f, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, Function0 function0, Function0 function02, com.moloco.sdk.internal.y yVar, com.moloco.sdk.internal.f fVar, AdFormatType adFormatType, MetricsRecorder metricsRecorder, com.moloco.sdk.internal.client_metrics_data.a aVar2, Function0 function03, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(adShowListener, interfaceC5043f, aVar, function0, function02, yVar, fVar, adFormatType, metricsRecorder, aVar2, (i & 1024) != 0 ? null : function03);
    }

    @Override // com.moloco.sdk.internal.publisher.z
    public void a(@NotNull com.moloco.sdk.internal.t internalError) {
        String str;
        Intrinsics.checkNotNullParameter(internalError, "internalError");
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, n, "onAdShowFailed: " + internalError, false, 4, null);
        com.moloco.sdk.internal.ortb.model.B b2 = (com.moloco.sdk.internal.ortb.model.B) this.d.mo4828invoke();
        if (b2 != null && (str = b2.getCom.ironsource.Zf.e java.lang.String()) != null) {
            this.f.a(str, System.currentTimeMillis(), internalError);
        }
        MetricsRecorder metricsRecorder = this.i;
        CountEvent countEvent = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.C.c());
        String c = com.moloco.sdk.internal.client_metrics_data.d.c.c();
        String lowerCase = this.h.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        metricsRecorder.recordCountEvent(countEvent.withTag(c, lowerCase).withTag(com.moloco.sdk.internal.client_metrics_data.d.b.c(), String.valueOf(internalError.e().getErrorType())));
        AdShowListener adShowListener = this.a;
        if (adShowListener != null) {
            adShowListener.onAdShowFailed(internalError.e());
        }
    }

    @Override // com.moloco.sdk.internal.publisher.z
    public void a() {
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, n, "onCloseOrSkipButtonShown triggered in InternalAdShowListenerImpl", false, 4, null);
    }
}
