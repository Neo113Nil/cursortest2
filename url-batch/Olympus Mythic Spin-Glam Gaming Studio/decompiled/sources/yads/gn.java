package yads;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableDeferredKt;

/* loaded from: classes5.dex */
public final class gn extends SuspendLambda implements Function2 {
    public int b;
    public final /* synthetic */ in c;
    public final /* synthetic */ d8 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gn(in inVar, d8 d8Var, Continuation continuation) {
        super(2, continuation);
        this.c = inVar;
        this.d = d8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new gn(this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new gn(this.c, this.d, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            in inVar = this.c;
            ki2 ki2Var = inVar.d;
            if (this.d.h == null) {
                this.b = 1;
                obj = inVar.a(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (((Boolean) obj).booleanValue()) {
            vd0 vd0Var = this.c.e;
            d8 d8Var = this.d;
            v0 v0Var = vd0Var.a;
            v0Var.a.putIfAbsent(v0Var.b.a(d8Var), CompletableDeferredKt.CompletableDeferred$default(null, 1, null));
            in inVar2 = this.c;
            d8 d8Var2 = this.d;
            inVar2.a(d8Var2, inVar2.a(d8Var2), "render");
        }
        return Unit.INSTANCE;
    }
}
