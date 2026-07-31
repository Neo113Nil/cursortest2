package yads;

import android.content.Context;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes5.dex */
public final class s42 extends SuspendLambda implements Function2 {
    public int b;
    public final /* synthetic */ u42 c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ dz1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s42(u42 u42Var, Context context, dz1 dz1Var, Continuation continuation) {
        super(2, continuation);
        this.c = u42Var;
        this.d = context;
        this.e = dz1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new s42(this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s42) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            g82 g82Var = this.c.b;
            Context context = this.d;
            dz1 dz1Var = this.e;
            this.b = 1;
            if (g82Var.a(context, dz1Var, this) == coroutine_suspended) {
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
