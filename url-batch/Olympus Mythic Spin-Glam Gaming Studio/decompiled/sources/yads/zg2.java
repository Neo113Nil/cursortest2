package yads;

import android.content.Context;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class zg2 {
    public final v3 a;
    public final yu2 b;

    public zg2(v3 v3Var, yu2 yu2Var) {
        this.a = v3Var;
        this.b = yu2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, ap apVar, ContinuationImpl continuationImpl) {
        yg2 yg2Var;
        int i;
        if (continuationImpl instanceof yg2) {
            yg2Var = (yg2) continuationImpl;
            int i2 = yg2Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yg2Var.d = i2 - Integer.MIN_VALUE;
                Object obj = yg2Var.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = yg2Var.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    jm0 jm0Var = new jm0(this.a, this.b, apVar);
                    yg2Var.d = 1;
                    obj = jm0Var.a(context, yg2Var);
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
        yg2Var = new yg2(this, continuationImpl);
        Object obj2 = yg2Var.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = yg2Var.d;
        if (i != 0) {
        }
        return (String) obj2;
    }
}
