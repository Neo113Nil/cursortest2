package yads;

import android.content.Context;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
public final class n62 {
    public final CoroutineScope a;
    public final le0 b;
    public final eu0 c;
    public final kz1 d;

    public n62(Context context, CoroutineScope coroutineScope, v3 v3Var, i5 i5Var, yu2 yu2Var) {
        le0 le0Var = new le0(context, i5Var);
        eu0 eu0Var = new eu0(context, i5Var);
        kz1 kz1Var = new kz1(context, v3Var, i5Var, yu2Var);
        this.a = coroutineScope;
        this.b = le0Var;
        this.c = eu0Var;
        this.d = kz1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(boolean z, Context context, dz1 dz1Var, z30 z30Var, ContinuationImpl continuationImpl) {
        k62 k62Var;
        int i;
        z30 z30Var2;
        Context context2;
        boolean z2;
        dz1 dz1Var2;
        if (continuationImpl instanceof k62) {
            k62Var = (k62) continuationImpl;
            int i2 = k62Var.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k62Var.g = i2 - Integer.MIN_VALUE;
                k62 k62Var2 = k62Var;
                Object obj = k62Var2.e;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = k62Var2.g;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    kz1 kz1Var = this.d;
                    k62Var2.c = context;
                    z30Var2 = z30Var;
                    k62Var2.d = z30Var2;
                    k62Var2.b = z;
                    k62Var2.g = 1;
                    obj = kz1Var.a(context, dz1Var, k62Var2);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    context2 = context;
                    z2 = z;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        dz1 dz1Var3 = (dz1) k62Var2.c;
                        ResultKt.throwOnFailure(obj);
                        return dz1Var3;
                    }
                    z2 = k62Var2.b;
                    z30Var2 = k62Var2.d;
                    context2 = (Context) k62Var2.c;
                    ResultKt.throwOnFailure(obj);
                }
                z30 z30Var3 = z30Var2;
                dz1Var2 = (dz1) obj;
                if (dz1Var2 != null) {
                    return null;
                }
                if (z2) {
                    t8 t8Var = dz1Var2.b;
                    if (t8Var.E) {
                        BuildersKt__Builders_commonKt.launch$default(this.a, null, null, new l62(this, context2, t8Var, dz1Var2, z30Var3, null), 3, null);
                    } else if (t8Var.x) {
                        k62Var2.c = dz1Var2;
                        k62Var2.d = null;
                        k62Var2.g = 2;
                        if (a(context2, t8Var, dz1Var2, z30Var3, k62Var2) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                return dz1Var2;
            }
        }
        k62Var = new k62(this, continuationImpl);
        k62 k62Var22 = k62Var;
        Object obj2 = k62Var22.e;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = k62Var22.g;
        if (i != 0) {
        }
        z30 z30Var32 = z30Var2;
        dz1Var2 = (dz1) obj2;
        if (dz1Var2 != null) {
        }
    }

    public final Object a(Context context, t8 t8Var, dz1 dz1Var, z30 z30Var, ContinuationImpl continuationImpl) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuationImpl), 1);
        cancellableContinuationImpl.initCancellability();
        m62 m62Var = new m62(cancellableContinuationImpl);
        boolean a = tq0.a(context, sq0.c);
        v62[] v62VarArr = v62.b;
        if (Intrinsics.areEqual("first_video_preloading_strategy", t8Var.v) && a) {
            eu0 eu0Var = this.c;
            synchronized (eu0Var.d) {
                try {
                    s12 s12Var = dz1Var.a;
                    p72 p72Var = eu0Var.c;
                    p72Var.getClass();
                    List list = SequencesKt.toList(SequencesKt.map(SequencesKt.map(SequencesKt.mapNotNull(SequencesKt.flatMapIterable(CollectionsKt.asSequence(s12Var.a), new m72(p72Var)), n72.b), k72.b), l72.b));
                    if (list.isEmpty()) {
                        m62Var.a();
                    } else {
                        cu0 cu0Var = new cu0(eu0Var.a, m62Var, eu0Var.b, CollectionsKt.drop(list, 1).iterator(), z30Var);
                        eu0Var.a.a(h5.q, null);
                        Pair pair = (Pair) CollectionsKt.first(list);
                        eu0Var.b.a((String) pair.component1(), cu0Var, (String) pair.component2());
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            this.b.a(dz1Var, m62Var, z30Var);
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuationImpl);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }
}
