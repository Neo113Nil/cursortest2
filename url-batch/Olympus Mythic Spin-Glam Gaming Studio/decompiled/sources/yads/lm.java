package yads;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class lm extends SuspendLambda implements Function2 {
    public final /* synthetic */ wm b;
    public final /* synthetic */ bv2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lm(wm wmVar, bv2 bv2Var, Continuation continuation) {
        super(2, continuation);
        this.b = wmVar;
        this.c = bv2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new lm(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new lm(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.b.b(this.c.a);
        return Unit.INSTANCE;
    }
}
