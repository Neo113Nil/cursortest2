package yads;

import android.content.Context;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes8.dex */
public final class nh2 extends SuspendLambda implements Function2 {
    public int b;
    public final /* synthetic */ rh2 c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ e00 e;
    public final /* synthetic */ l03 f;
    public final /* synthetic */ List g;
    public final /* synthetic */ long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nh2(long j, Context context, List list, Continuation continuation, e00 e00Var, rh2 rh2Var, l03 l03Var) {
        super(2, continuation);
        this.c = rh2Var;
        this.d = context;
        this.e = e00Var;
        this.f = l03Var;
        this.g = list;
        this.h = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        rh2 rh2Var = this.c;
        Context context = this.d;
        e00 e00Var = this.e;
        l03 l03Var = this.f;
        return new nh2(this.h, context, this.g, continuation, e00Var, rh2Var, l03Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((nh2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            rh2 rh2Var = this.c;
            Context context = this.d;
            e00 e00Var = this.e;
            l03 l03Var = this.f;
            List list = this.g;
            long j = this.h;
            this.b = 1;
            obj = rh2.a(rh2Var, context, e00Var, l03Var, list, j, this);
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
