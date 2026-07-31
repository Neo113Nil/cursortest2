package yads;

import android.content.Context;
import android.os.Build;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class iv1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ nt3 b;
    public final /* synthetic */ Context c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iv1(Context context, Continuation continuation, nt3 nt3Var) {
        super(2, continuation);
        this.b = nt3Var;
        this.c = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new iv1(this.c, continuation, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        nt3 nt3Var = this.b;
        return new iv1(this.c, (Continuation) obj2, nt3Var).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Context context = this.b.a;
        mt1 a = pr.a(context, context);
        ua3.a(this.c, a);
        pe.a(this.c, a);
        if (Build.VERSION.SDK_INT >= 30) {
            AtomicBoolean atomicBoolean = kh.a;
            kh.a(this.c, a);
        }
        return Unit.INSTANCE;
    }
}
