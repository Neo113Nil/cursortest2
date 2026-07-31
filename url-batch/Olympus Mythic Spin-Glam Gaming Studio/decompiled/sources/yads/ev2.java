package yads;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes9.dex */
public final class ev2 extends SuspendLambda implements Function2 {
    public int b;
    public final /* synthetic */ pv2 c;
    public final /* synthetic */ fv2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ev2(pv2 pv2Var, fv2 fv2Var, Continuation continuation) {
        super(2, continuation);
        this.c = pv2Var;
        this.d = fv2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ev2(this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new ev2(this.c, this.d, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                pv2 pv2Var = this.c;
                k51 k51Var = k51.c;
                this.b = 1;
                obj = pv2Var.a(k51Var, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.d.d.a((dv2) obj);
            fv2.g.remove(this.c);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            fv2.g.remove(this.c);
            throw th;
        }
    }
}
