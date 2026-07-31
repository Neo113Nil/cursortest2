package yads;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;

/* loaded from: classes5.dex */
public final class bd extends SuspendLambda implements Function2 {
    public int b;
    public final /* synthetic */ cd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd(cd cdVar, Continuation continuation) {
        super(2, continuation);
        this.c = cdVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new bd(this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new bd(this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            cd cdVar = this.c;
            this.b = 1;
            obj = BuildersKt.withContext(cdVar.a, new ad(cdVar, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        oc ocVar = (oc) obj;
        return (ocVar.a == null && ocVar.b == null) ? dd.a : new ed(ocVar);
    }
}
