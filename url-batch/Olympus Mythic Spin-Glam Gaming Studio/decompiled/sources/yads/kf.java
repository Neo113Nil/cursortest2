package yads;

import android.content.Context;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class kf extends SuspendLambda implements Function2 {
    public int b;
    public final /* synthetic */ mf c;
    public final /* synthetic */ Context d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kf(mf mfVar, Context context, Continuation continuation) {
        super(2, continuation);
        this.c = mfVar;
        this.d = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new kf(this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new kf(this.c, this.d, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            bg bgVar = this.c.b;
            this.b = 1;
            b = bgVar.b(this);
            if (b == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            b = ((Result) obj).getValue();
        }
        if (Result.m8028isFailureimpl(b)) {
            return null;
        }
        return b;
    }
}
