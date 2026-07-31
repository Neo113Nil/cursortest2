package yads;

import android.content.Context;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final class m42 {
    public final CoroutineScope a;
    public final i5 b;
    public final ji c;
    public final v31 d;
    public final z21 e;
    public final c41 f;
    public final Function1 g;

    public m42(Context context, CoroutineScope coroutineScope, i5 i5Var) {
        ji jiVar = new ji();
        v31 v31Var = new v31();
        z21 z21Var = new z21(context);
        c41 c41Var = new c41();
        i42 i42Var = i42.b;
        this.a = coroutineScope;
        this.b = i5Var;
        this.c = jiVar;
        this.d = v31Var;
        this.e = z21Var;
        this.f = c41Var;
        this.g = i42Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(HashSet hashSet, ri2 ri2Var, dz1 dz1Var, ContinuationImpl continuationImpl) {
        j42 j42Var;
        int i;
        ri2 ri2Var2;
        i5 i5Var;
        h5 h5Var;
        b41 b41Var;
        if (continuationImpl instanceof j42) {
            j42Var = (j42) continuationImpl;
            int i2 = j42Var.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j42Var.h = i2 - Integer.MIN_VALUE;
                Object obj = j42Var.f;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = j42Var.h;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (hashSet.isEmpty()) {
                        return Unit.INSTANCE;
                    }
                    i5 i5Var2 = this.b;
                    h5 h5Var2 = h5.p;
                    i5Var2.a(h5Var2, null);
                    z21 z21Var = this.e;
                    j42Var.b = ri2Var;
                    j42Var.c = dz1Var;
                    j42Var.d = i5Var2;
                    j42Var.e = h5Var2;
                    j42Var.h = 1;
                    z21Var.getClass();
                    CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(j42Var), 1);
                    cancellableContinuationImpl.initCancellability();
                    z21Var.a(hashSet, new x21(cancellableContinuationImpl));
                    Object result = cancellableContinuationImpl.getResult();
                    if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(j42Var);
                    }
                    if (result == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ri2Var2 = ri2Var;
                    i5Var = i5Var2;
                    obj = result;
                    h5Var = h5Var2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h5Var = j42Var.e;
                    i5Var = j42Var.d;
                    dz1Var = j42Var.c;
                    ri2Var2 = j42Var.b;
                    ResultKt.throwOnFailure(obj);
                }
                b41Var = (b41) obj;
                if (b41Var instanceof a41) {
                    Map map = ((a41) b41Var).a;
                    t8 t8Var = dz1Var.b;
                    String str = t8Var.w;
                    g42 g42Var = g42.c;
                    if (!Intrinsics.areEqual(str, "loading_on_show") && !Intrinsics.areEqual(t8Var.w, "loading_on_back")) {
                        v31 v31Var = this.d;
                        v31Var.getClass();
                        Iterator it = dz1Var.a.a.iterator();
                        while (it.hasNext()) {
                            List list = ((ry1) it.next()).b;
                            if (!list.isEmpty()) {
                                v31Var.a(list, map);
                            }
                        }
                        ji jiVar = this.c;
                        jiVar.getClass();
                        for (ry1 ry1Var : dz1Var.a.a) {
                            List list2 = ry1Var.b;
                            if (!list2.isEmpty()) {
                                ry1Var.b = jiVar.a(list2, map);
                            }
                        }
                    }
                    ri2Var2.b.putAll(map);
                }
                Unit unit = Unit.INSTANCE;
                i5Var.a(h5Var);
                return unit;
            }
        }
        j42Var = new j42(this, continuationImpl);
        Object obj2 = j42Var.f;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = j42Var.h;
        if (i != 0) {
        }
        b41Var = (b41) obj2;
        if (b41Var instanceof a41) {
        }
        Unit unit2 = Unit.INSTANCE;
        i5Var.a(h5Var);
        return unit2;
    }
}
