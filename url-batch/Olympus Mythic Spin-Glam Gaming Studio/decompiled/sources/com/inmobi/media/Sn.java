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

/* loaded from: classes13.dex */
public final class Sn extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewGroup d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Sn(View view, ViewGroup viewGroup, Continuation continuation) {
        super(2, continuation);
        this.c = view;
        this.d = viewGroup;
    }

    public static final Unit a(View view, Rn rn) {
        view.removeOnAttachStateChangeListener(rn);
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Sn sn = new Sn(this.c, this.d, continuation);
        sn.b = obj;
        return sn;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Sn) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ProducerScope producerScope = (ProducerScope) this.b;
            View view = this.c;
            final Rn rn = new Rn(producerScope, view, this.d);
            view.addOnAttachStateChangeListener(rn);
            producerScope.mo8216trySendJP2dKIU(Boxing.boxBoolean(Un.b(this.c, this.d)));
            final View view2 = this.c;
            Function0 function0 = new Function0() { // from class: com.inmobi.media.Sn$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public final Object mo4828invoke() {
                    return Sn.a(view2, rn);
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
