package yads;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes6.dex */
public final class ue1 extends SuspendLambda implements Function2 {
    public int b;
    public final /* synthetic */ ve1 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Function1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ue1(ve1 ve1Var, String str, String str2, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.c = ve1Var;
        this.d = str;
        this.e = str2;
        this.f = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ue1(this.c, this.d, this.e, this.f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ue1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ef1 ef1Var = this.c.c;
            String str = this.d;
            this.b = 1;
            ef1Var.getClass();
            if (BuildersKt.withContext(Dispatchers.getIO(), new cf1(ef1Var, str, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                boolean z = ob1.a;
                this.f.invoke(this.d);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        ef1 ef1Var2 = this.c.c;
        String str2 = this.e;
        this.b = 2;
        ef1Var2.getClass();
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new df1(ef1Var2, str2, null), this);
        if (withContext != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            withContext = Unit.INSTANCE;
        }
        if (withContext == coroutine_suspended) {
            return coroutine_suspended;
        }
        boolean z2 = ob1.a;
        this.f.invoke(this.d);
        return Unit.INSTANCE;
    }
}
