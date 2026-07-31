package yads;

import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;

/* loaded from: classes11.dex */
public final class my0 {
    public final c90 a;

    public my0(c90 c90Var) {
        this.a = c90Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        ly0 ly0Var;
        int i;
        Iterator it;
        if (continuationImpl instanceof ly0) {
            ly0Var = (ly0) continuationImpl;
            int i2 = ly0Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ly0Var.e = i2 - Integer.MIN_VALUE;
                Object obj = ly0Var.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = ly0Var.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    c90 c90Var = this.a;
                    ly0Var.b = str;
                    ly0Var.e = 1;
                    obj = BuildersKt.withContext(c90Var.d, new b90(c90Var, null), ly0Var);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = ly0Var.b;
                    ResultKt.throwOnFailure(obj);
                }
                it = ((z50) obj).d.a.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (Intrinsics.areEqual(((g50) next).a, str)) {
                        return next;
                    }
                }
                return null;
            }
        }
        ly0Var = new ly0(this, continuationImpl);
        Object obj2 = ly0Var.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = ly0Var.e;
        if (i != 0) {
        }
        it = ((z50) obj2).d.a.iterator();
        while (it.hasNext()) {
        }
        return null;
    }
}
