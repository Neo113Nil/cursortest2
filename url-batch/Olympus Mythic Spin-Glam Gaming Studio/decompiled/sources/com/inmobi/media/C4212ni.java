package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* renamed from: com.inmobi.media.ni, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4212ni extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ GestureDetectorOnGestureListenerC4476xi b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4212ni(GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi, String str, long j, int i, Continuation continuation) {
        super(2, continuation);
        this.b = gestureDetectorOnGestureListenerC4476xi;
        this.c = str;
        this.d = j;
        this.e = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C4212ni c4212ni = new C4212ni(this.b, this.c, this.d, this.e, continuation);
        c4212ni.a = obj;
        return c4212ni;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4212ni) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.a;
        if (this.b.N.get() || !CoroutineScopeKt.isActive(coroutineScope)) {
            InterfaceC4466x9 interfaceC4466x9 = this.b.i;
            if (interfaceC4466x9 != null) {
                String str = GestureDetectorOnGestureListenerC4476xi.i1;
                Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
                ((C4493y9) interfaceC4466x9).a(str, "Skipping loadHtmlUrl, RenderView destroyed");
            }
            return Unit.INSTANCE;
        }
        String str2 = this.c;
        if (str2 == null || str2.length() == 0) {
            InterfaceC4466x9 interfaceC4466x92 = this.b.i;
            if (interfaceC4466x92 != null) {
                String str3 = GestureDetectorOnGestureListenerC4476xi.i1;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$cp(...)");
                ((C4493y9) interfaceC4466x92).a(str3, "Prefetch empty/failed, signaling ad load failure");
            }
            Hi renderViewTelemetry = this.b.getRenderViewTelemetry();
            if (renderViewTelemetry != null) {
                renderViewTelemetry.a(this.d, Boxing.boxShort((short) this.e));
            }
            GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = this.b;
            int i = this.e;
            gestureDetectorOnGestureListenerC4476xi.getClass();
            gestureDetectorOnGestureListenerC4476xi.d(GestureDetectorOnGestureListenerC4476xi.d(i));
        } else {
            InterfaceC4466x9 interfaceC4466x93 = this.b.i;
            if (interfaceC4466x93 != null) {
                String str4 = GestureDetectorOnGestureListenerC4476xi.i1;
                Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$cp(...)");
                ((C4493y9) interfaceC4466x93).a(str4, "Prefetch succeeded, loading HTML content in WebView");
            }
            Hi renderViewTelemetry2 = this.b.getRenderViewTelemetry();
            if (renderViewTelemetry2 != null) {
                renderViewTelemetry2.a(this.d, (Short) null);
            }
            this.b.i(this.c);
        }
        return Unit.INSTANCE;
    }
}
