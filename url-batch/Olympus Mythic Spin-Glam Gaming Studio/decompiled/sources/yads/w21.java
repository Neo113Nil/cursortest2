package yads;

import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;

/* loaded from: classes6.dex */
public final class w21 extends SuspendLambda implements Function2 {
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ z21 d;
    public final /* synthetic */ Set e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w21(z21 z21Var, Set set, Continuation continuation) {
        super(2, continuation);
        this.d = z21Var;
        this.e = set;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        w21 w21Var = new w21(this.d, this.e, continuation);
        w21Var.c = obj;
        return w21Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w21) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ProducerScope producerScope = (ProducerScope) this.c;
            this.d.a(this.e, new v21(producerScope));
            this.b = 1;
            if (ProduceKt.awaitClose$default(producerScope, null, this, 1, null) == coroutine_suspended) {
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
