package yads;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* loaded from: classes4.dex */
public final class pi2 {
    public final Mutex a = MutexKt.Mutex$default(false, 1, null);
    public final ArrayList b = new ArrayList();

    /* JADX WARN: Removed duplicated region for block: B:13:0x005a A[Catch: all -> 0x006d, TryCatch #0 {all -> 0x006d, blocks: (B:11:0x004e, B:13:0x005a, B:14:0x006f), top: B:10:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(jx0 jx0Var, Object obj, ContinuationImpl continuationImpl) {
        mi2 mi2Var;
        int i;
        Mutex mutex;
        try {
            if (continuationImpl instanceof mi2) {
                mi2Var = (mi2) continuationImpl;
                int i2 = mi2Var.g;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    mi2Var.g = i2 - Integer.MIN_VALUE;
                    Object obj2 = mi2Var.e;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = mi2Var.g;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj2);
                        mutex = this.a;
                        mi2Var.b = jx0Var;
                        mi2Var.c = obj;
                        mi2Var.d = mutex;
                        mi2Var.g = 1;
                        if (mutex.lock(null, mi2Var) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Mutex mutex2 = mi2Var.d;
                        obj = mi2Var.c;
                        jx0 jx0Var2 = mi2Var.b;
                        ResultKt.throwOnFailure(obj2);
                        mutex = mutex2;
                        jx0Var = jx0Var2;
                    }
                    a();
                    if (this.b.size() < 5) {
                        this.b.add(new li2(jx0Var, obj, System.currentTimeMillis() + 86400000));
                    }
                    Unit unit = Unit.INSTANCE;
                    mutex.unlock(null);
                    return unit;
                }
            }
            a();
            if (this.b.size() < 5) {
            }
            Unit unit2 = Unit.INSTANCE;
            mutex.unlock(null);
            return unit2;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
        mi2Var = new mi2(this, continuationImpl);
        Object obj22 = mi2Var.e;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mi2Var.g;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0059 A[Catch: all -> 0x0069, TryCatch #0 {all -> 0x0069, blocks: (B:11:0x004a, B:12:0x0053, B:14:0x0059, B:18:0x006c, B:20:0x0070, B:22:0x0074), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(jx0 jx0Var, Continuation continuation) {
        ni2 ni2Var;
        int i;
        Mutex mutex;
        Iterator it;
        Object obj;
        li2 li2Var;
        try {
            if (continuation instanceof ni2) {
                ni2Var = (ni2) continuation;
                int i2 = ni2Var.f;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    ni2Var.f = i2 - Integer.MIN_VALUE;
                    Object obj2 = ni2Var.d;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = ni2Var.f;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj2);
                        mutex = this.a;
                        ni2Var.b = jx0Var;
                        ni2Var.c = mutex;
                        ni2Var.f = 1;
                        if (mutex.lock(null, ni2Var) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Mutex mutex2 = ni2Var.c;
                        jx0 jx0Var2 = ni2Var.b;
                        ResultKt.throwOnFailure(obj2);
                        mutex = mutex2;
                        jx0Var = jx0Var2;
                    }
                    a();
                    it = this.b.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (Intrinsics.areEqual(((li2) obj).a, jx0Var)) {
                            break;
                        }
                    }
                    li2Var = (li2) obj;
                    if (li2Var != null || (r6 = li2Var.b) == null) {
                        Object obj3 = null;
                    } else {
                        this.b.remove(li2Var);
                    }
                    mutex.unlock(null);
                    return obj3;
                }
            }
            a();
            it = this.b.iterator();
            while (true) {
                if (it.hasNext()) {
                }
            }
            li2Var = (li2) obj;
            if (li2Var != null) {
            }
            Object obj32 = null;
            mutex.unlock(null);
            return obj32;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
        ni2Var = new ni2(this, continuation);
        Object obj22 = ni2Var.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = ni2Var.f;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        oi2 oi2Var;
        int i;
        Mutex mutex;
        try {
            if (continuationImpl instanceof oi2) {
                oi2Var = (oi2) continuationImpl;
                int i2 = oi2Var.e;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    oi2Var.e = i2 - Integer.MIN_VALUE;
                    Object obj = oi2Var.c;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = oi2Var.e;
                    boolean z = true;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Mutex mutex2 = this.a;
                        oi2Var.b = mutex2;
                        oi2Var.e = 1;
                        if (mutex2.lock(null, oi2Var) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex = mutex2;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex = oi2Var.b;
                        ResultKt.throwOnFailure(obj);
                    }
                    a();
                    if (this.b.size() < 5) {
                        z = false;
                    }
                    return Boxing.boxBoolean(z);
                }
            }
            a();
            if (this.b.size() < 5) {
            }
            return Boxing.boxBoolean(z);
        } finally {
            mutex.unlock(null);
        }
        oi2Var = new oi2(this, continuationImpl);
        Object obj2 = oi2Var.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = oi2Var.e;
        boolean z2 = true;
        if (i != 0) {
        }
    }

    public final void a() {
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (System.currentTimeMillis() > ((li2) ((fp0) next)).c) {
                arrayList2.add(next);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            this.b.remove((li2) it2.next());
        }
    }
}
