package yads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes5.dex */
public final class dq1 extends SuspendLambda implements Function2 {
    public int b;
    public final /* synthetic */ com.monetization.ads.mediation.base.initialize.a c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ er1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dq1(com.monetization.ads.mediation.base.initialize.a aVar, Context context, er1 er1Var, Continuation continuation) {
        super(2, continuation);
        this.c = aVar;
        this.d = context;
        this.e = er1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new dq1(this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((dq1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            com.monetization.ads.mediation.base.initialize.a aVar = this.c;
            Context context = this.d;
            er1 er1Var = this.e;
            this.b = 1;
            AtomicBoolean atomicBoolean = com.monetization.ads.mediation.base.initialize.a.g;
            if (aVar.a(context, er1Var, this) == coroutine_suspended) {
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
