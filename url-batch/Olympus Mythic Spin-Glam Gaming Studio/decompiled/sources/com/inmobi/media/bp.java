package com.inmobi.media;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.ViewCompat;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;

/* loaded from: classes15.dex */
public final class bp extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ViewGroup c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp(ViewGroup viewGroup, Continuation continuation) {
        super(2, continuation);
        this.c = viewGroup;
    }

    public static final void a(ProducerScope producerScope, boolean z) {
        producerScope.mo8216trySendJP2dKIU(Boolean.valueOf(z));
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        bp bpVar = new bp(this.c, continuation);
        bpVar.b = obj;
        return bpVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        bp bpVar = new bp(this.c, (Continuation) obj2);
        bpVar.b = (ProducerScope) obj;
        return bpVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final ProducerScope producerScope = (ProducerScope) this.b;
            ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.inmobi.media.bp$$ExternalSyntheticLambda0
                @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
                public final void onWindowFocusChanged(boolean z) {
                    bp.a(ProducerScope.this, z);
                }
            };
            this.c.getViewTreeObserver().addOnWindowFocusChangeListener(onWindowFocusChangeListener);
            ViewGroup viewGroup = this.c;
            if (ViewCompat.isAttachedToWindow(viewGroup)) {
                viewGroup.addOnAttachStateChangeListener(new ap(viewGroup, viewGroup, onWindowFocusChangeListener));
            } else {
                viewGroup.getViewTreeObserver().removeOnWindowFocusChangeListener(onWindowFocusChangeListener);
            }
            Function0 function0 = new Function0() { // from class: com.inmobi.media.bp$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public final Object mo4828invoke() {
                    return bp.a();
                }
            };
            this.a = 1;
            if (ProduceKt.awaitClose(producerScope, function0, this) == coroutine_suspended) {
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

    public static final Unit a() {
        return Unit.INSTANCE;
    }
}
