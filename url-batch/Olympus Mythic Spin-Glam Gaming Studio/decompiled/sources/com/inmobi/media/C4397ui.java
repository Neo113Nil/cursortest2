package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;

/* renamed from: com.inmobi.media.ui, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4397ui extends SuspendLambda implements Function2 {
    public Mutex a;
    public GestureDetectorOnGestureListenerC4476xi b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ GestureDetectorOnGestureListenerC4476xi e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4397ui(GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi, Continuation continuation) {
        super(2, continuation);
        this.e = gestureDetectorOnGestureListenerC4476xi;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C4397ui c4397ui = new C4397ui(this.e, continuation);
        c4397ui.d = obj;
        return c4397ui;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C4397ui c4397ui = new C4397ui(this.e, (Continuation) obj2);
        c4397ui.d = (CoroutineScope) obj;
        return c4397ui.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi;
        Mutex mutex;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.d;
            GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi2 = this.e;
            Mutex mutex2 = gestureDetectorOnGestureListenerC4476xi2.y;
            this.d = coroutineScope2;
            this.a = mutex2;
            this.b = gestureDetectorOnGestureListenerC4476xi2;
            this.c = 1;
            if (mutex2.lock(null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            coroutineScope = coroutineScope2;
            gestureDetectorOnGestureListenerC4476xi = gestureDetectorOnGestureListenerC4476xi2;
            mutex = mutex2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gestureDetectorOnGestureListenerC4476xi = this.b;
            mutex = this.a;
            coroutineScope = (CoroutineScope) this.d;
            ResultKt.throwOnFailure(obj);
        }
        try {
            if (Intrinsics.areEqual("Loading", gestureDetectorOnGestureListenerC4476xi.A)) {
                InterfaceC4466x9 interfaceC4466x9 = gestureDetectorOnGestureListenerC4476xi.i;
                if (interfaceC4466x9 != null) {
                    String str = GestureDetectorOnGestureListenerC4476xi.i1;
                    Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
                    ((C4493y9) interfaceC4466x9).a(str, "updateWebViewLoaded " + coroutineScope);
                }
                gestureDetectorOnGestureListenerC4476xi.getListener().g(gestureDetectorOnGestureListenerC4476xi);
                gestureDetectorOnGestureListenerC4476xi.setAndUpdateViewState("Default");
                InterfaceC4466x9 interfaceC4466x92 = gestureDetectorOnGestureListenerC4476xi.i;
                if (interfaceC4466x92 != null) {
                    String str2 = GestureDetectorOnGestureListenerC4476xi.i1;
                    Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$cp(...)");
                    ((C4493y9) interfaceC4466x92).a(str2, "updateWebViewLoaded state changed to " + gestureDetectorOnGestureListenerC4476xi.getViewState());
                }
            }
            Unit unit = Unit.INSTANCE;
            mutex.unlock(null);
            return unit;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
    }
}
