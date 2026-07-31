package com.inmobi.media;

import android.os.Message;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class C3 extends SuspendLambda implements Function2 {
    public int a;

    public C3(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3((Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C3932d3 c3932d3 = (C3932d3) E3.b.getValue();
            this.a = 1;
            obj = c3932d3.a(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            E3 e3 = E3.a;
            Intrinsics.checkNotNullExpressionValue("E3", "access$getTAG$p(...)");
            E3.g.set(false);
            E3.g();
            return Unit.INSTANCE;
        }
        Message obtain = Message.obtain();
        obtain.what = 1;
        HandlerC4224o3 handlerC4224o3 = E3.d;
        if (handlerC4224o3 != null) {
            return Boxing.boxBoolean(handlerC4224o3.sendMessage(obtain));
        }
        return null;
    }
}
