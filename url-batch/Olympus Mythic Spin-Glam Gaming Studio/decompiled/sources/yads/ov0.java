package yads;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes5.dex */
public final class ov0 extends SuspendLambda implements Function2 {
    public int b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ pv0 d;
    public final /* synthetic */ qv0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ov0(byte[] bArr, pv0 pv0Var, qv0 qv0Var, Continuation continuation) {
        super(2, continuation);
        this.c = bArr;
        this.d = pv0Var;
        this.e = qv0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ov0(this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ov0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            byte[] bArr = this.c;
            if (bArr == null) {
                return null;
            }
            fw0 fw0Var = this.d.b;
            qv0 qv0Var = this.e;
            this.b = 1;
            fv0 fv0Var = fw0Var.a;
            fv0Var.getClass();
            Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new ev0(fv0Var, qv0Var, bArr, null), this);
            if (withContext != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                withContext = Unit.INSTANCE;
            }
            if (withContext == coroutine_suspended) {
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
