package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes11.dex */
public final class o82 {
    public final af3 a;
    public final hh3 b;

    public o82(Context context, v3 v3Var, i5 i5Var, yu2 yu2Var) {
        af3 af3Var = new af3(context, new u62());
        hh3 hh3Var = new hh3(context, v3Var, yu2Var, new w52(v3Var), new nb2(), i5Var);
        this.a = af3Var;
        this.b = hh3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(o82 o82Var, List list, ContinuationImpl continuationImpl) {
        l82 l82Var;
        int i;
        fh3 fh3Var;
        o82Var.getClass();
        if (continuationImpl instanceof l82) {
            l82Var = (l82) continuationImpl;
            int i2 = l82Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l82Var.d = i2 - Integer.MIN_VALUE;
                Object obj = l82Var.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = l82Var.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    hh3 hh3Var = o82Var.b;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((we3) it.next()).b);
                    }
                    l82Var.d = 1;
                    hh3Var.getClass();
                    CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(l82Var), 1);
                    cancellableContinuationImpl.initCancellability();
                    gh3 gh3Var = new gh3(cancellableContinuationImpl);
                    ch3 ch3Var = hh3Var.a;
                    Object obj2 = new Object();
                    ch3Var.c.getClass();
                    zg3 a = ah3.a(arrayList);
                    ch3Var.d.addAll(a.a);
                    ch3Var.b.a(ch3Var.a, a.b, new bh3(ch3Var, gh3Var, obj2), obj2);
                    obj = cancellableContinuationImpl.getResult();
                    if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(l82Var);
                    }
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                fh3Var = (fh3) obj;
                if (!(fh3Var instanceof dh3)) {
                    return CollectionsKt.emptyList();
                }
                if (fh3Var instanceof eh3) {
                    return o82Var.a.a(((eh3) fh3Var).a);
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        l82Var = new l82(o82Var, continuationImpl);
        Object obj3 = l82Var.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = l82Var.d;
        if (i != 0) {
        }
        fh3Var = (fh3) obj3;
        if (!(fh3Var instanceof dh3)) {
        }
    }
}
