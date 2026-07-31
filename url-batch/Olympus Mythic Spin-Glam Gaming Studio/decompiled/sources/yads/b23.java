package yads;

import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* loaded from: classes11.dex */
public final class b23 {
    public final bu2 a;
    public final ov2 b;
    public boolean c;
    public final Mutex d = MutexKt.Mutex$default(false, 1, null);

    public b23(bu2 bu2Var, ov2 ov2Var) {
        this.a = bu2Var;
        this.b = ov2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054 A[Catch: all -> 0x005a, TRY_LEAVE, TryCatch #0 {all -> 0x005a, blocks: (B:11:0x0050, B:13:0x0054, B:17:0x005d), top: B:10:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d A[Catch: all -> 0x005a, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x005a, blocks: (B:11:0x0050, B:13:0x0054, B:17:0x005d), top: B:10:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        a23 a23Var;
        int i;
        Mutex mutex;
        Object obj;
        try {
            if (continuationImpl instanceof a23) {
                a23Var = (a23) continuationImpl;
                int i2 = a23Var.e;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    a23Var.e = i2 - Integer.MIN_VALUE;
                    Object obj2 = a23Var.c;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = a23Var.e;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj2);
                        if (this.c) {
                            return Unit.INSTANCE;
                        }
                        Mutex mutex2 = this.d;
                        a23Var.b = mutex2;
                        a23Var.e = 1;
                        if (mutex2.lock(null, a23Var) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex = mutex2;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex = a23Var.b;
                        ResultKt.throwOnFailure(obj2);
                    }
                    if (!this.c) {
                        return Unit.INSTANCE;
                    }
                    this.c = true;
                    Unit unit = Unit.INSTANCE;
                    mutex.unlock(null);
                    List<fi2> list = this.a.Q0;
                    if (list == null) {
                        return unit;
                    }
                    if (list.isEmpty()) {
                        list = null;
                    }
                    if (list == null) {
                        return unit;
                    }
                    xx0 xx0Var = (xx0) this.b.mo4828invoke();
                    for (fi2 fi2Var : list) {
                        ox0 ox0Var = px0.c;
                        String str = fi2Var.b.b;
                        ox0Var.getClass();
                        Iterator<E> it = px0.h.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (Intrinsics.areEqual(((px0) obj).b, str)) {
                                break;
                            }
                        }
                        px0 px0Var = (px0) obj;
                        if (px0Var != null) {
                            try {
                                d8 d8Var = new d8(fi2Var.a, null, null, null, null, null, null, null, null, false, null, null);
                                pn pnVar = (pn) xx0Var.b.get(px0Var);
                                if (pnVar != null) {
                                    BuildersKt__Builders_commonKt.launch$default(xx0Var.a, Dispatchers.getMain(), null, new wx0(xx0Var, d8Var, px0Var, pnVar, null), 2, null);
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
            }
            if (!this.c) {
            }
        } finally {
            mutex.unlock(null);
        }
        a23Var = new a23(this, continuationImpl);
        Object obj22 = a23Var.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = a23Var.e;
        if (i != 0) {
        }
    }
}
