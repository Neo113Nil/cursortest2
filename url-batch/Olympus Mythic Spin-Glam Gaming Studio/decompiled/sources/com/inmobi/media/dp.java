package com.inmobi.media;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.ViewCompat;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;

/* loaded from: classes15.dex */
public final class dp extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ViewGroup c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dp(ViewGroup viewGroup, Continuation continuation) {
        super(2, continuation);
        this.c = viewGroup;
    }

    public static final void a(ProducerScope producerScope, int i) {
        producerScope.mo8216trySendJP2dKIU(Boolean.valueOf(i == 0));
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        dp dpVar = new dp(this.c, continuation);
        dpVar.b = obj;
        return dpVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        dp dpVar = new dp(this.c, (Continuation) obj2);
        dpVar.b = (ProducerScope) obj;
        return dpVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final ProducerScope producerScope = (ProducerScope) this.b;
            producerScope.mo8216trySendJP2dKIU(Boxing.boxBoolean(this.c.getWindowVisibility() == 0));
            ViewTreeObserver.OnWindowVisibilityChangeListener onWindowVisibilityChangeListener = new ViewTreeObserver.OnWindowVisibilityChangeListener() { // from class: com.inmobi.media.dp$$ExternalSyntheticLambda1
                @Override // android.view.ViewTreeObserver.OnWindowVisibilityChangeListener
                public final void onWindowVisibilityChanged(int i2) {
                    dp.a(ProducerScope.this, i2);
                }
            };
            this.c.getViewTreeObserver().addOnWindowVisibilityChangeListener(onWindowVisibilityChangeListener);
            ViewGroup viewGroup = this.c;
            if (ViewCompat.isAttachedToWindow(viewGroup)) {
                viewGroup.addOnAttachStateChangeListener(new cp(viewGroup, viewGroup, onWindowVisibilityChangeListener));
            } else {
                viewGroup.getViewTreeObserver().removeOnWindowVisibilityChangeListener(onWindowVisibilityChangeListener);
            }
            Function0 function0 = new Function0() { // from class: com.inmobi.media.dp$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public final Object mo4828invoke() {
                    return dp.a();
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
