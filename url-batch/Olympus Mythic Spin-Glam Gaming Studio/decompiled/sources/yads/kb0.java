package yads;

import android.content.Context;
import android.view.View;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class kb0 implements l0 {
    public final pb0 a;

    public kb0(pb0 pb0Var) {
        this.a = pb0Var;
    }

    @Override // yads.l0
    public final /* bridge */ /* synthetic */ Object a(View view, j0 j0Var, r0 r0Var) {
        return a(view, (ib0) j0Var, (ContinuationImpl) r0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(View view, ib0 ib0Var, ContinuationImpl continuationImpl) {
        jb0 jb0Var;
        int i;
        if (continuationImpl instanceof jb0) {
            jb0Var = (jb0) continuationImpl;
            int i2 = jb0Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jb0Var.d = i2 - Integer.MIN_VALUE;
                Object obj = jb0Var.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = jb0Var.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Context context = view.getContext();
                    pb0 pb0Var = this.a;
                    jb0Var.d = 1;
                    obj = pb0Var.a(context, ib0Var, jb0Var);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return new oz0(true, (pz0) obj);
            }
        }
        jb0Var = new jb0(this, continuationImpl);
        Object obj2 = jb0Var.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = jb0Var.d;
        if (i != 0) {
        }
        return new oz0(true, (pz0) obj2);
    }
}
