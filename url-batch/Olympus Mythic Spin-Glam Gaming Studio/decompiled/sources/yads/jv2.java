package yads;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes14.dex */
public final class jv2 extends SuspendLambda implements Function2 {
    public int b;
    public final /* synthetic */ pv2 c;
    public final /* synthetic */ wu2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv2(pv2 pv2Var, wu2 wu2Var, Continuation continuation) {
        super(2, continuation);
        this.c = pv2Var;
        this.d = wu2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new jv2(this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new jv2(this.c, this.d, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            pv2 pv2Var = this.c;
            bu2 bu2Var = ((vu2) this.d).a;
            this.b = 1;
            if (pv2.a(pv2Var, bu2Var, this) == coroutine_suspended) {
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
