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

/* renamed from: com.inmobi.media.n3, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4197n3 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ HandlerC4224o3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4197n3(HandlerC4224o3 handlerC4224o3, Continuation continuation) {
        super(2, continuation);
        this.b = handlerC4224o3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4197n3(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4197n3(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
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
        if (((Boolean) obj).booleanValue()) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            return Boxing.boxBoolean(this.b.sendMessage(obtain));
        }
        E3 e3 = E3.a;
        Intrinsics.checkNotNullExpressionValue("E3", "access$getTAG$p(...)");
        E3.g.set(false);
        return Unit.INSTANCE;
    }
}
