package yads;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes10.dex */
public final class k82 extends SuspendLambda implements Function2 {
    public de3 b;
    public int c;
    public final /* synthetic */ de3 d;
    public final /* synthetic */ o82 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k82(de3 de3Var, o82 o82Var, Continuation continuation) {
        super(2, continuation);
        this.d = de3Var;
        this.e = o82Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new k82(this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new k82(this.d, this.e, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        de3 de3Var;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            de3 de3Var2 = this.d;
            if (de3Var2 == null) {
                return null;
            }
            o82 o82Var = this.e;
            List list = de3Var2.a;
            this.b = de3Var2;
            this.c = 1;
            o82Var.getClass();
            Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new n82(list, o82Var, null), this);
            if (withContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            de3Var = de3Var2;
            obj = withContext;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            de3Var = this.b;
            ResultKt.throwOnFailure(obj);
        }
        List list2 = (List) obj;
        if (list2.isEmpty()) {
            throw new o12("Invalid VAST in response");
        }
        return new de3(list2, de3Var.b, de3Var.c);
    }
}
