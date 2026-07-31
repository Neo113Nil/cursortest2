package yads;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.Deferred;

/* loaded from: classes4.dex */
public final class sc extends SuspendLambda implements Function2 {
    public int b;
    public final /* synthetic */ tc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sc(tc tcVar, Continuation continuation) {
        super(2, continuation);
        this.c = tcVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new sc(this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new sc(this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Deferred deferred = this.c.e;
            this.b = 1;
            obj = deferred.await(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        ed edVar = obj instanceof ed ? (ed) obj : null;
        if (edVar != null) {
            return edVar.a;
        }
        return null;
    }
}
