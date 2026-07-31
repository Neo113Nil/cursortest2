package yads;

import android.content.Context;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes12.dex */
public final class x42 extends SuspendLambda implements Function2 {
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ z42 d;
    public final /* synthetic */ v3 e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ dz1 g;
    public final /* synthetic */ ri2 h;
    public final /* synthetic */ z30 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x42(z42 z42Var, v3 v3Var, Context context, dz1 dz1Var, ri2 ri2Var, z30 z30Var, Continuation continuation) {
        super(2, continuation);
        this.d = z42Var;
        this.e = v3Var;
        this.f = context;
        this.g = dz1Var;
        this.h = ri2Var;
        this.i = z30Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        x42 x42Var = new x42(this.d, this.e, this.f, this.g, this.h, this.i, continuation);
        x42Var.c = obj;
        return x42Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x42) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m8023constructorimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                z42 z42Var = this.d;
                v3 v3Var = this.e;
                Context context = this.f;
                dz1 dz1Var = this.g;
                ri2 ri2Var = this.h;
                z30 z30Var = this.i;
                Result.Companion companion = Result.INSTANCE;
                u42 u42Var = z42Var.b;
                this.b = 1;
                u42Var.getClass();
                obj = BuildersKt.withContext(Dispatchers.getIO(), new t42(v3Var, u42Var, context, dz1Var, z30Var, ri2Var, null), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            m8023constructorimpl = Result.m8023constructorimpl((dz1) obj);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8028isFailureimpl(m8023constructorimpl)) {
            return null;
        }
        return m8023constructorimpl;
    }
}
