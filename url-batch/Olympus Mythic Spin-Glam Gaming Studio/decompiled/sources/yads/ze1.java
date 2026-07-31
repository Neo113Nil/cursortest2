package yads;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.sync.Mutex;

/* loaded from: classes5.dex */
public final class ze1 extends SuspendLambda implements Function2 {
    public Mutex b;
    public ef1 c;
    public int d;
    public final /* synthetic */ ef1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ze1(ef1 ef1Var, Continuation continuation) {
        super(2, continuation);
        this.e = ef1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ze1(this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new ze1(this.e, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ef1 ef1Var;
        Mutex mutex;
        Mutex mutex2;
        Throwable th;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.d;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ef1Var = this.e;
                mutex = ef1Var.d;
                this.b = mutex;
                this.c = ef1Var;
                this.d = 1;
                if (mutex.lock(null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex2 = this.b;
                    try {
                        ResultKt.throwOnFailure(obj);
                        String str = (String) obj;
                        mutex2.unlock(null);
                        return str;
                    } catch (Throwable th2) {
                        th = th2;
                        mutex2.unlock(null);
                        throw th;
                    }
                }
                ef1Var = this.c;
                Mutex mutex3 = this.b;
                ResultKt.throwOnFailure(obj);
                mutex = mutex3;
            }
            this.b = mutex;
            this.c = null;
            this.d = 2;
            ef1Var.getClass();
            Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new bf1(ef1Var, null), this);
            if (withContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutex2 = mutex;
            obj = withContext;
            String str2 = (String) obj;
            mutex2.unlock(null);
            return str2;
        } catch (Throwable th3) {
            mutex2 = mutex;
            th = th3;
            mutex2.unlock(null);
            throw th;
        }
    }
}
