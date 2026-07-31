package yads;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* loaded from: classes11.dex */
public final class wa1 extends SuspendLambda implements Function2 {
    public int b;
    public final /* synthetic */ za1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa1(za1 za1Var, Continuation continuation) {
        super(2, continuation);
        this.c = za1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new wa1(this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new wa1(this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        z90 z90Var;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ky0 ky0Var = this.c.b;
            this.b = 1;
            a90 a90Var = ky0Var.a;
            obj = BuildersKt.withContext(a90Var.f, new z80(a90Var, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        u51 u51Var = (u51) obj;
        if (u51Var instanceof t51) {
            z90Var = new x90(((t51) u51Var).a);
        } else if (u51Var instanceof r51) {
            z90Var = new w90(((r51) u51Var).a);
        } else {
            if (!(u51Var instanceof s51)) {
                throw new NoWhenBranchMatchedException();
            }
            z90Var = v90.a;
        }
        za1 za1Var = this.c;
        BuildersKt__Builders_commonKt.launch$default(za1Var.a, null, null, new va1(za1Var, z90Var, null), 3, null);
        return Unit.INSTANCE;
    }
}
