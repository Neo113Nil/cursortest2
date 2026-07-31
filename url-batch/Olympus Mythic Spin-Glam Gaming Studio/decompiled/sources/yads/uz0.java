package yads;

import android.content.Context;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class uz0 {
    public final v3 a;
    public final yu2 b;

    public uz0(v3 v3Var, yu2 yu2Var) {
        this.a = v3Var;
        this.b = yu2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, ap apVar, ContinuationImpl continuationImpl) {
        tz0 tz0Var;
        int i;
        if (continuationImpl instanceof tz0) {
            tz0Var = (tz0) continuationImpl;
            int i2 = tz0Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tz0Var.d = i2 - Integer.MIN_VALUE;
                Object obj = tz0Var.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = tz0Var.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    hm0 hm0Var = new hm0(this.a, this.b, apVar);
                    tz0Var.d = 1;
                    obj = hm0Var.a(context, tz0Var);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return (String) obj;
            }
        }
        tz0Var = new tz0(this, continuationImpl);
        Object obj2 = tz0Var.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = tz0Var.d;
        if (i != 0) {
        }
        return (String) obj2;
    }
}
