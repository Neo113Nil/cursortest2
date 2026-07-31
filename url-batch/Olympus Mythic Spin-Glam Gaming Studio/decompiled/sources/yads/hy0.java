package yads;

import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;

/* loaded from: classes5.dex */
public final class hy0 {
    public final c90 a;

    public hy0(c90 c90Var) {
        this.a = c90Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060 A[LOOP:0: B:11:0x005a->B:13:0x0060, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        gy0 gy0Var;
        int i;
        if (continuationImpl instanceof gy0) {
            gy0Var = (gy0) continuationImpl;
            int i2 = gy0Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gy0Var.d = i2 - Integer.MIN_VALUE;
                Object obj = gy0Var.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = gy0Var.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    c90 c90Var = this.a;
                    gy0Var.d = 1;
                    obj = BuildersKt.withContext(c90Var.d, new b90(c90Var, null), gy0Var);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                List<e40> list = ((z50) obj).g;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (e40 e40Var : list) {
                    arrayList.add(new j40(e40Var.a, e40Var.b, e40Var.c));
                }
                return new a50(arrayList);
            }
        }
        gy0Var = new gy0(this, continuationImpl);
        Object obj2 = gy0Var.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = gy0Var.d;
        if (i != 0) {
        }
        List<e40> list2 = ((z50) obj2).g;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        while (r6.hasNext()) {
        }
        return new a50(arrayList2);
    }
}
