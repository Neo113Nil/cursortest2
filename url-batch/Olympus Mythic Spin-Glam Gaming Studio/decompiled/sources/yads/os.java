package yads;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes3.dex */
public final class os extends SuspendLambda implements Function2 {
    public int b;
    public final /* synthetic */ ts c;
    public final /* synthetic */ ps d;
    public final /* synthetic */ kr2 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public os(ts tsVar, ps psVar, kr2 kr2Var, Continuation continuation) {
        super(2, continuation);
        this.c = tsVar;
        this.d = psVar;
        this.e = kr2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new os(this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((os) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            gs2 gs2Var = this.c.i;
            d8 d8Var = this.d.a;
            kr2 kr2Var = this.e;
            this.b = 1;
            pi2 pi2Var = gs2Var.a;
            gs2Var.b.getClass();
            Object a = pi2Var.a(kx0.a(d8Var), kr2Var, this);
            if (a != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                a = Unit.INSTANCE;
            }
            if (a == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        vd0 vd0Var = this.c.e;
        vd0Var.a.a(this.d.a, this.e);
        return Unit.INSTANCE;
    }
}
