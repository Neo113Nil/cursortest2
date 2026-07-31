package yads;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes4.dex */
public final class kn extends SuspendLambda implements Function2 {
    public int b;
    public final /* synthetic */ ln c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kn(ln lnVar, Object obj, Continuation continuation) {
        super(2, continuation);
        this.c = lnVar;
        this.d = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new kn(this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new kn(this.c, this.d, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ln lnVar = this.c;
            on onVar = lnVar.e;
            d8 d8Var = lnVar.b;
            Object obj2 = this.d;
            this.b = 1;
            if (onVar.invoke(d8Var, obj2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        ln lnVar2 = this.c;
        lnVar2.d.a(lnVar2.b, this.d);
        CancellableContinuationImpl cancellableContinuationImpl = this.c.a;
        Result.Companion companion = Result.INSTANCE;
        Unit unit = Unit.INSTANCE;
        cancellableContinuationImpl.resumeWith(Result.m8023constructorimpl(unit));
        return unit;
    }
}
