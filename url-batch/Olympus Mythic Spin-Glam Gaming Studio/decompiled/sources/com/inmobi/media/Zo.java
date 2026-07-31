package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
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

/* loaded from: classes14.dex */
public final class Zo extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ViewGroup c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Zo(ViewGroup viewGroup, Continuation continuation) {
        super(2, continuation);
        this.c = viewGroup;
    }

    public static final Unit a(View view, Yo yo) {
        view.removeOnAttachStateChangeListener(yo);
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Zo zo = new Zo(this.c, continuation);
        zo.b = obj;
        return zo;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Zo zo = new Zo(this.c, (Continuation) obj2);
        zo.b = (ProducerScope) obj;
        return zo.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ProducerScope producerScope = (ProducerScope) this.b;
            producerScope.mo8216trySendJP2dKIU(Boxing.boxBoolean(this.c.isAttachedToWindow()));
            final Yo yo = new Yo(producerScope);
            this.c.addOnAttachStateChangeListener(yo);
            final ViewGroup viewGroup = this.c;
            Function0 function0 = new Function0() { // from class: com.inmobi.media.Zo$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public final Object mo4828invoke() {
                    return Zo.a(viewGroup, yo);
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
}
