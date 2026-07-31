package yads;

import android.content.Context;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes15.dex */
public final class l62 extends SuspendLambda implements Function2 {
    public int b;
    public final /* synthetic */ n62 c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ t8 e;
    public final /* synthetic */ dz1 f;
    public final /* synthetic */ z30 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l62(n62 n62Var, Context context, t8 t8Var, dz1 dz1Var, z30 z30Var, Continuation continuation) {
        super(2, continuation);
        this.c = n62Var;
        this.d = context;
        this.e = t8Var;
        this.f = dz1Var;
        this.g = z30Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new l62(this.c, this.d, this.e, this.f, this.g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l62) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            n62 n62Var = this.c;
            Context context = this.d;
            t8 t8Var = this.e;
            dz1 dz1Var = this.f;
            z30 z30Var = this.g;
            this.b = 1;
            if (n62Var.a(context, t8Var, dz1Var, z30Var, this) == coroutine_suspended) {
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
