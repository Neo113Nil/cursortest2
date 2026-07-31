package yads;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes5.dex */
public final class en extends SuspendLambda implements Function2 {
    public int b;
    public final /* synthetic */ in c;
    public final /* synthetic */ d8 d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public en(in inVar, d8 d8Var, Object obj, Continuation continuation) {
        super(2, continuation);
        this.c = inVar;
        this.d = d8Var;
        this.e = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new en(this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((en) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0035, code lost:
    
        if (((java.lang.Boolean) r5).booleanValue() != false) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            in inVar = this.c;
            ki2 ki2Var = inVar.d;
            d8 d8Var = this.d;
            if (d8Var.h == null) {
                Object obj2 = this.e;
                this.b = 1;
                obj = in.a(inVar, d8Var, obj2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            in inVar2 = this.c;
            inVar2.a(this.d, inVar2.b(this.e), "default");
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
    }
}
