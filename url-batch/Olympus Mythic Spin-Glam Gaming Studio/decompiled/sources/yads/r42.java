package yads;

import android.content.Context;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes3.dex */
public final class r42 extends SuspendLambda implements Function2 {
    public int b;
    public final /* synthetic */ u42 c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ dz1 e;
    public final /* synthetic */ z30 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r42(u42 u42Var, Context context, dz1 dz1Var, z30 z30Var, Continuation continuation) {
        super(2, continuation);
        this.c = u42Var;
        this.d = context;
        this.e = dz1Var;
        this.f = z30Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new r42(this.c, this.d, this.e, this.f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r42) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            n62 n62Var = this.c.c;
            Context context = this.d;
            dz1 dz1Var = this.e;
            z30 z30Var = this.f;
            this.b = 1;
            obj = n62Var.a(true, context, dz1Var, z30Var, (ContinuationImpl) this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
