package yads;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.sync.Mutex;

/* loaded from: classes15.dex */
public final class ju2 extends SuspendLambda implements Function2 {
    public Mutex b;
    public ku2 c;
    public k51 d;
    public int e;
    public final /* synthetic */ ku2 f;
    public final /* synthetic */ k51 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ju2(ku2 ku2Var, k51 k51Var, Continuation continuation) {
        super(2, continuation);
        this.f = ku2Var;
        this.g = k51Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ju2(this.f, this.g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new ju2(this.f, this.g, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Mutex mutex;
        ku2 ku2Var;
        k51 k51Var;
        Mutex mutex2;
        Throwable th;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.e;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f.a.a(h5.j, null);
                mutex = ku2.d;
                ku2Var = this.f;
                k51Var = this.g;
                this.b = mutex;
                this.c = ku2Var;
                this.d = k51Var;
                this.e = 1;
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
                        wu2 wu2Var = (wu2) obj;
                        mutex2.unlock(null);
                        return wu2Var;
                    } catch (Throwable th2) {
                        th = th2;
                        mutex2.unlock(null);
                        throw th;
                    }
                }
                k51Var = this.d;
                ku2Var = this.c;
                Mutex mutex3 = this.b;
                ResultKt.throwOnFailure(obj);
                mutex = mutex3;
            }
            ku2Var.a.a(h5.j);
            this.b = mutex;
            this.c = ku2Var;
            this.d = k51Var;
            this.e = 2;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            cancellableContinuationImpl.invokeOnCancellation(new hu2(ku2Var));
            ku2Var.c.a(ku2Var.b, k51Var, new iu2(cancellableContinuationImpl));
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            if (result == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutex2 = mutex;
            obj = result;
            wu2 wu2Var2 = (wu2) obj;
            mutex2.unlock(null);
            return wu2Var2;
        } catch (Throwable th3) {
            mutex2 = mutex;
            th = th3;
            mutex2.unlock(null);
            throw th;
        }
    }
}
