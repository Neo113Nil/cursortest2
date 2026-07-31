package yads;

import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.TimeoutKt;

/* loaded from: classes5.dex */
public final class vd0 {
    public final v0 a;
    public final FunctionReferenceImpl b;

    /* JADX WARN: Multi-variable type inference failed */
    public vd0(v0 v0Var, Function2 function2) {
        this.a = v0Var;
        this.b = (FunctionReferenceImpl) function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r10v2, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.FunctionReferenceImpl] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(d8 d8Var, long j, ContinuationImpl continuationImpl) {
        ud0 ud0Var;
        Object obj;
        int i;
        if (continuationImpl instanceof ud0) {
            ud0Var = (ud0) continuationImpl;
            int i2 = ud0Var.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ud0Var.f = i2 - Integer.MIN_VALUE;
                obj = ud0Var.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = ud0Var.f;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ?? r10 = this.b;
                    ud0Var.b = d8Var;
                    ud0Var.c = j;
                    ud0Var.f = 1;
                    obj = r10.invoke(d8Var, ud0Var);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        if (obj != null) {
                            return null;
                        }
                        return obj;
                    }
                    j = ud0Var.c;
                    d8Var = ud0Var.b;
                    ResultKt.throwOnFailure(obj);
                }
                if (obj == null) {
                    return obj;
                }
                v0 v0Var = this.a;
                if (!v0Var.a.containsKey(v0Var.b.a(d8Var))) {
                    return null;
                }
                v0 v0Var2 = this.a;
                ud0Var.b = null;
                ud0Var.f = 2;
                CompletableDeferred completableDeferred = (CompletableDeferred) v0Var2.a.get(v0Var2.b.a(d8Var));
                obj = completableDeferred == null ? null : TimeoutKt.withTimeoutOrNull(j, new u0(completableDeferred, null), ud0Var);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (obj != null) {
                }
            }
        }
        ud0Var = new ud0(this, continuationImpl);
        obj = ud0Var.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = ud0Var.f;
        if (i != 0) {
        }
        if (obj == null) {
        }
    }
}
