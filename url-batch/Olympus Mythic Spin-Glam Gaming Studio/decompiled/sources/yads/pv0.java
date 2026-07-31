package yads;

import android.content.Context;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes3.dex */
public final class pv0 {
    public final kv0 a;
    public final fw0 b;

    public pv0(Context context) {
        kv0 kv0Var = new kv0(context);
        fw0 fw0Var = new fw0(context);
        this.a = kv0Var;
        this.b = fw0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(10:5|6|7|(1:(1:(6:11|12|13|(1:15)(1:19)|16|17)(2:21|22))(2:23|24))(2:28|(2:30|31)(2:32|(1:34)))|25|(1:27)|13|(0)(0)|16|17))|36|6|7|(0)(0)|25|(0)|13|(0)(0)|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0095, code lost:
    
        r9 = yads.ob1.a;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008b A[Catch: Exception -> 0x0095, TRY_LEAVE, TryCatch #0 {Exception -> 0x0095, blocks: (B:12:0x002b, B:13:0x007d, B:19:0x008b, B:24:0x0039, B:25:0x0062, B:32:0x0051), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(fn2 fn2Var, ContinuationImpl continuationImpl) {
        lv0 lv0Var;
        Object obj;
        Object coroutine_suspended;
        int i;
        qv0 a;
        if (continuationImpl instanceof lv0) {
            lv0Var = (lv0) continuationImpl;
            int i2 = lv0Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lv0Var.e = i2 - Integer.MIN_VALUE;
                obj = lv0Var.c;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = lv0Var.e;
                boolean z = false;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.b.a(fn2Var.a()) != null) {
                        return Boxing.boxBoolean(true);
                    }
                    kv0 kv0Var = this.a;
                    String b = fn2Var.b();
                    lv0Var.b = fn2Var;
                    lv0Var.e = 1;
                    obj = kv0Var.a(b, lv0Var);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        fn2Var = lv0Var.b;
                        ResultKt.throwOnFailure(obj);
                        if (this.b.a(fn2Var.a()) != null) {
                            z = true;
                        } else {
                            fn2Var.a().name();
                            boolean z2 = ob1.a;
                        }
                        return Boxing.boxBoolean(z);
                    }
                    fn2Var = lv0Var.b;
                    ResultKt.throwOnFailure(obj);
                }
                a = fn2Var.a();
                lv0Var.b = fn2Var;
                lv0Var.e = 2;
                if (BuildersKt.withContext(Dispatchers.getIO(), new ov0((byte[]) obj, this, a, null), lv0Var) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (this.b.a(fn2Var.a()) != null) {
                }
                return Boxing.boxBoolean(z);
            }
        }
        lv0Var = new lv0(this, continuationImpl);
        obj = lv0Var.c;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = lv0Var.e;
        boolean z3 = false;
        if (i != 0) {
        }
        a = fn2Var.a();
        lv0Var.b = fn2Var;
        lv0Var.e = 2;
        if (BuildersKt.withContext(Dispatchers.getIO(), new ov0((byte[]) obj, this, a, null), lv0Var) == coroutine_suspended) {
        }
        if (this.b.a(fn2Var.a()) != null) {
        }
        return Boxing.boxBoolean(z3);
    }
}
