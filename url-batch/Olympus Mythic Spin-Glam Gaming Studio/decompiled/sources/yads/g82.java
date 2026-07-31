package yads;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes9.dex */
public final class g82 {
    public final i5 a;
    public final do3 b;
    public final nm1 c;
    public final gx1 d;

    public g82(i5 i5Var) {
        do3 do3Var = new do3();
        nm1 nm1Var = new nm1();
        gx1 gx1Var = new gx1();
        this.a = i5Var;
        this.b = do3Var;
        this.c = nm1Var;
        this.d = gx1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, dz1 dz1Var, ContinuationImpl continuationImpl) {
        f82 f82Var;
        int i;
        Set set;
        Object obj;
        i5 i5Var;
        dz1 dz1Var2;
        h5 h5Var;
        Context context2;
        Iterator it;
        Context context3 = context;
        dz1 dz1Var3 = dz1Var;
        if (continuationImpl instanceof f82) {
            f82Var = (f82) continuationImpl;
            int i2 = f82Var.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f82Var.i = i2 - Integer.MIN_VALUE;
                Object obj2 = f82Var.g;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = f82Var.i;
                int i3 = 2;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    nm1 nm1Var = this.c;
                    nm1Var.getClass();
                    set = SequencesKt.toSet(SequencesKt.filterNotNull(SequencesKt.map(SequencesKt.flatMapIterable(CollectionsKt.asSequence(dz1Var3.a.a), new lm1(nm1Var)), mm1.b)));
                    bu2 a = uw2.a().a(context3);
                    int i4 = a != null ? a.b : 0;
                    if (!oa.a(context) || i4 == 0 || set.isEmpty()) {
                        return Unit.INSTANCE;
                    }
                    bu2 a2 = uw2.a().a(context3);
                    if (a2 != null && a2.J0) {
                        do3 do3Var = this.b;
                        f82Var.b = context3;
                        f82Var.c = dz1Var3;
                        f82Var.d = set;
                        f82Var.i = 1;
                        do3Var.getClass();
                        if (a2.J0) {
                            if (do3.a.compareAndSet(false, true)) {
                                obj = BuildersKt.withContext(Dispatchers.getDefault(), new co3(context3, null), f82Var);
                                if (obj != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                    obj = Unit.INSTANCE;
                                }
                            } else {
                                obj = Unit.INSTANCE;
                            }
                            if (obj != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                obj = Unit.INSTANCE;
                            }
                        } else {
                            obj = Unit.INSTANCE;
                        }
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = f82Var.f;
                        h5Var = f82Var.e;
                        i5Var = (i5) f82Var.d;
                        dz1Var2 = f82Var.c;
                        Context context4 = f82Var.b;
                        ResultKt.throwOnFailure(obj2);
                        context2 = context4;
                        while (it.hasNext()) {
                            ij1 ij1Var = (ij1) it.next();
                            gx1 gx1Var = this.d;
                            t8 t8Var = dz1Var2.b;
                            f82Var.b = context2;
                            f82Var.c = dz1Var2;
                            f82Var.d = i5Var;
                            f82Var.e = h5Var;
                            f82Var.f = it;
                            f82Var.i = i3;
                            gx1Var.getClass();
                            Object withContext = BuildersKt.withContext(Dispatchers.getMain().getImmediate(), new fx1(context2, ij1Var, ij1Var.a, gx1Var, t8Var, t8Var.D, null), f82Var);
                            if (withContext != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                withContext = Unit.INSTANCE;
                            }
                            if (withContext == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            i3 = 2;
                        }
                        Unit unit = Unit.INSTANCE;
                        i5Var.a(h5Var);
                        return unit;
                    }
                    Set set2 = (Set) f82Var.d;
                    dz1Var3 = f82Var.c;
                    Context context5 = f82Var.b;
                    ResultKt.throwOnFailure(obj2);
                    set = set2;
                    context3 = context5;
                }
                i5Var = this.a;
                h5 h5Var2 = h5.r;
                i5Var.a(h5Var2, null);
                Iterator it2 = set.iterator();
                dz1Var2 = dz1Var3;
                h5Var = h5Var2;
                context2 = context3;
                it = it2;
                while (it.hasNext()) {
                }
                Unit unit2 = Unit.INSTANCE;
                i5Var.a(h5Var);
                return unit2;
            }
        }
        f82Var = new f82(this, continuationImpl);
        Object obj22 = f82Var.g;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = f82Var.i;
        int i32 = 2;
        if (i != 0) {
        }
        i5Var = this.a;
        h5 h5Var22 = h5.r;
        i5Var.a(h5Var22, null);
        Iterator it22 = set.iterator();
        dz1Var2 = dz1Var3;
        h5Var = h5Var22;
        context2 = context3;
        it = it22;
        while (it.hasNext()) {
        }
        Unit unit22 = Unit.INSTANCE;
        i5Var.a(h5Var);
        return unit22;
    }
}
