package yads;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* loaded from: classes3.dex */
public final class on extends SuspendLambda implements Function3 {
    public int b;
    public /* synthetic */ d8 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ pn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public on(pn pnVar, Continuation continuation) {
        super(3, continuation);
        this.e = pnVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        on onVar = new on(this.e, (Continuation) obj3);
        onVar.c = (d8) obj;
        onVar.d = obj2;
        return onVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            d8 d8Var = this.c;
            Object obj2 = this.d;
            pn pnVar = this.e;
            this.c = null;
            this.b = 1;
            if (pnVar.a(d8Var, obj2, this) == coroutine_suspended) {
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
