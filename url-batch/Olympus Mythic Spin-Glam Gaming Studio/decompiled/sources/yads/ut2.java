package yads;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class ut2 extends SuspendLambda implements Function2 {
    public int b;
    public final /* synthetic */ xt2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ut2(xt2 xt2Var, Continuation continuation) {
        super(2, continuation);
        this.c = xt2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ut2(this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new ut2(this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            pv2 pv2Var = this.c.f;
            k51 k51Var = k51.f;
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
        dv2 dv2Var = (dv2) obj;
        if (dv2Var instanceof cv2) {
            return null;
        }
        if (dv2Var instanceof bv2) {
            return yt2.c;
        }
        throw new NoWhenBranchMatchedException();
    }
}
