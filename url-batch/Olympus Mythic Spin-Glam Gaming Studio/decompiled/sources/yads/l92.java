package yads;

import android.content.Context;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes14.dex */
public final class l92 extends SuspendLambda implements Function2 {
    public int b;
    public final /* synthetic */ n92 c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ l03 e;
    public final /* synthetic */ ArrayList f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l92(n92 n92Var, Context context, l03 l03Var, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.c = n92Var;
        this.d = context;
        this.e = l03Var;
        this.f = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new l92(this.c, this.d, this.e, this.f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l92) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            n92 n92Var = this.c;
            Context context = this.d;
            l03 l03Var = this.e;
            ArrayList arrayList = this.f;
            this.b = 1;
            obj = n92Var.a(context, l03Var, arrayList, this);
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
