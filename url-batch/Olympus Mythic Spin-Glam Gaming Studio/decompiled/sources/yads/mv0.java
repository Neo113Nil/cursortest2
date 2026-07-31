package yads;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes11.dex */
public final class mv0 extends SuspendLambda implements Function2 {
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ pv0 d;
    public final /* synthetic */ fn2 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mv0(pv0 pv0Var, fn2 fn2Var, Continuation continuation) {
        super(2, continuation);
        this.d = pv0Var;
        this.e = fn2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        mv0 mv0Var = new mv0(this.d, this.e, continuation);
        mv0Var.c = obj;
        return mv0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((mv0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m8023constructorimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                pv0 pv0Var = this.d;
                fn2 fn2Var = this.e;
                Result.Companion companion = Result.INSTANCE;
                this.b = 1;
                obj = pv0Var.a(fn2Var, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            m8023constructorimpl = Result.m8023constructorimpl(Boxing.boxBoolean(((Boolean) obj).booleanValue()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        return Result.m8022boximpl(m8023constructorimpl);
    }
}
