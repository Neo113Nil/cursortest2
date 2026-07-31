package com.ogury.ad.internal;

import com.ogury.core.internal.datastore.datastore.core.DataStore;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes9.dex */
public final class g7 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ l7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7(l7 l7Var, Continuation continuation) {
        super(2, continuation);
        this.b = l7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new g7(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new g7(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        f7 f7Var = new f7(((DataStore) m7.b.getValue(this.b.a, m7.a[0])).getData());
        this.a = 1;
        Object first = FlowKt.first(f7Var, this);
        return first == coroutine_suspended ? coroutine_suspended : first;
    }
}
