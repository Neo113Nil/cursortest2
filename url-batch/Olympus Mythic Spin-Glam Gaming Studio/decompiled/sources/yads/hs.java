package yads;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes5.dex */
public final class hs extends SuspendLambda implements Function2 {
    public int b;
    public final /* synthetic */ ls c;
    public final /* synthetic */ is d;
    public final /* synthetic */ zb1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs(ls lsVar, is isVar, zb1 zb1Var, Continuation continuation) {
        super(2, continuation);
        this.c = lsVar;
        this.d = isVar;
        this.e = zb1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new hs(this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((hs) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            kc1 kc1Var = this.c.i;
            d8 d8Var = this.d.a;
            zb1 zb1Var = this.e;
            this.b = 1;
            pi2 pi2Var = kc1Var.a;
            kc1Var.b.getClass();
            Object a = pi2Var.a(kx0.a(d8Var), zb1Var, this);
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
