package yads;

import java.util.List;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;

/* loaded from: classes14.dex */
public final class jy0 {
    public final c90 a;

    public jy0(c90 c90Var) {
        this.a = c90Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        iy0 iy0Var;
        int i;
        if (continuationImpl instanceof iy0) {
            iy0Var = (iy0) continuationImpl;
            int i2 = iy0Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iy0Var.d = i2 - Integer.MIN_VALUE;
                Object obj = iy0Var.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = iy0Var.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    c90 c90Var = this.a;
                    iy0Var.d = 1;
                    obj = BuildersKt.withContext(c90Var.d, new b90(c90Var, null), iy0Var);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                z50 z50Var = (z50) obj;
                List list = z50Var.h;
                r50 r50Var = z50Var.a;
                g90 g90Var = z50Var.b;
                return new a80(list, r50Var, new h90(g90Var.a, new j90(!g90Var.b ? g90Var.c.isEmpty() ? i90.b : i90.c : i90.d, g90Var.c)), z50Var.c, z50Var.d, z50Var.e, z50Var.f);
            }
        }
        iy0Var = new iy0(this, continuationImpl);
        Object obj2 = iy0Var.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = iy0Var.d;
        if (i != 0) {
        }
        z50 z50Var2 = (z50) obj2;
        List list2 = z50Var2.h;
        r50 r50Var2 = z50Var2.a;
        g90 g90Var2 = z50Var2.b;
        return new a80(list2, r50Var2, new h90(g90Var2.a, new j90(!g90Var2.b ? g90Var2.c.isEmpty() ? i90.b : i90.c : i90.d, g90Var2.c)), z50Var2.c, z50Var2.d, z50Var2.e, z50Var2.f);
    }
}
