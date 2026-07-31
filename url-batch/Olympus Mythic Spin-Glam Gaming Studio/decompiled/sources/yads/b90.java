package yads;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.sync.Mutex;

/* loaded from: classes12.dex */
public final class b90 extends SuspendLambda implements Function2 {
    public Mutex b;
    public c90 c;
    public c90 d;
    public int e;
    public final /* synthetic */ c90 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b90(c90 c90Var, Continuation continuation) {
        super(2, continuation);
        this.f = c90Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new b90(this.f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new b90(this.f, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0068  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        c90 c90Var;
        Mutex mutex;
        c90 c90Var2;
        Object obj2;
        Mutex mutex2;
        c90 c90Var3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.e;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                c90Var = this.f;
                mutex = c90Var.f;
                this.b = mutex;
                this.c = c90Var;
                this.e = 1;
                if (mutex.lock(null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c90Var2 = this.d;
                    c90Var3 = this.c;
                    mutex2 = this.b;
                    try {
                        ResultKt.throwOnFailure(obj);
                        obj2 = ((Result) obj).getValue();
                        if (Result.m8028isFailureimpl(obj2)) {
                            obj2 = null;
                        }
                        c90Var2.e = (s80) obj2;
                        c90Var = c90Var3;
                        z50 a = c90Var.c.a(c90Var.a.a(), c90Var.e);
                        mutex2.unlock(null);
                        return a;
                    } catch (Throwable th) {
                        th = th;
                        mutex = mutex2;
                        mutex.unlock(null);
                        throw th;
                    }
                }
                c90 c90Var4 = this.c;
                Mutex mutex3 = this.b;
                ResultKt.throwOnFailure(obj);
                c90Var = c90Var4;
                mutex = mutex3;
            }
            if (c90Var.e != null) {
                mutex2 = mutex;
                z50 a2 = c90Var.c.a(c90Var.a.a(), c90Var.e);
                mutex2.unlock(null);
                return a2;
            }
            en2 en2Var = c90Var.b;
            this.b = mutex;
            this.c = c90Var;
            this.d = c90Var;
            this.e = 2;
            Object a3 = en2Var.a(this);
            if (a3 == coroutine_suspended) {
                return coroutine_suspended;
            }
            c90Var2 = c90Var;
            obj2 = a3;
            mutex2 = mutex;
            c90Var3 = c90Var2;
            if (Result.m8028isFailureimpl(obj2)) {
            }
            c90Var2.e = (s80) obj2;
            c90Var = c90Var3;
            z50 a22 = c90Var.c.a(c90Var.a.a(), c90Var.e);
            mutex2.unlock(null);
            return a22;
        } catch (Throwable th2) {
            th = th2;
            mutex.unlock(null);
            throw th;
        }
    }
}
