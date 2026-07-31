package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUnifiedIdService;
import com.inmobi.unifiedId.InMobiUserDataModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes13.dex */
public final class T9 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ InMobiUserDataModel b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T9(InMobiUserDataModel inMobiUserDataModel, Continuation continuation) {
        super(2, continuation);
        this.b = inMobiUserDataModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new T9(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new T9(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            InMobiUserDataModel inMobiUserDataModel = this.b;
            this.a = 1;
            a = InMobiUnifiedIdService.a(inMobiUserDataModel, this);
            if (a == coroutine_suspended) {
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
