package yads;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScopeKt;

/* loaded from: classes13.dex */
public final class dw0 extends SuspendLambda implements Function2 {
    public int b;
    public final /* synthetic */ ew0 c;
    public final /* synthetic */ List d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dw0(ew0 ew0Var, List list, Continuation continuation) {
        super(2, continuation);
        this.c = ew0Var;
        this.d = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new dw0(this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new dw0(this.c, this.d, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            pv0 pv0Var = this.c.a;
            List list = this.d;
            this.b = 1;
            pv0Var.getClass();
            if (CoroutineScopeKt.coroutineScope(new nv0(list, pv0Var, null), this) == coroutine_suspended) {
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
