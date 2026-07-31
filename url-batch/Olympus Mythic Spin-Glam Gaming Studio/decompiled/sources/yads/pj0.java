package yads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes4.dex */
public final class pj0 {
    public static final AtomicBoolean e = new AtomicBoolean(true);
    public final i5 a;
    public final Context b;
    public final r4 c;
    public final g01 d;

    public pj0(Context context, i5 i5Var) {
        Context applicationContext = context.getApplicationContext();
        r4 r4Var = new r4();
        g01 g01Var = new g01();
        this.a = i5Var;
        this.b = applicationContext;
        this.c = r4Var;
        this.d = g01Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        lj0 lj0Var;
        int i;
        h5 h5Var;
        i5 i5Var;
        Throwable th;
        if (continuationImpl instanceof lj0) {
            lj0Var = (lj0) continuationImpl;
            int i2 = lj0Var.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lj0Var.f = i2 - Integer.MIN_VALUE;
                Object obj = lj0Var.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = lj0Var.f;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (e.getAndSet(false)) {
                        i5 i5Var2 = this.a;
                        h5 h5Var2 = h5.E;
                        i5Var2.b(h5Var2);
                        try {
                            CoroutineDispatcher a = w10.a();
                            mj0 mj0Var = new mj0(this, null);
                            lj0Var.b = i5Var2;
                            lj0Var.c = h5Var2;
                            lj0Var.f = 1;
                            if (BuildersKt.withContext(a, mj0Var, lj0Var) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            i5Var = i5Var2;
                            h5Var = h5Var2;
                        } catch (Throwable th2) {
                            h5Var = h5Var2;
                            i5Var = i5Var2;
                            th = th2;
                            th.getMessage();
                            boolean z = ob1.a;
                            Unit unit = Unit.INSTANCE;
                            i5Var.a(h5Var);
                            return Unit.INSTANCE;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h5Var = lj0Var.c;
                i5Var = lj0Var.b;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Throwable th3) {
                    th = th3;
                    th.getMessage();
                    boolean z2 = ob1.a;
                    Unit unit2 = Unit.INSTANCE;
                    i5Var.a(h5Var);
                    return Unit.INSTANCE;
                }
                Unit unit22 = Unit.INSTANCE;
                i5Var.a(h5Var);
                return Unit.INSTANCE;
            }
        }
        lj0Var = new lj0(this, continuationImpl);
        Object obj2 = lj0Var.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = lj0Var.f;
        if (i != 0) {
        }
        Unit unit222 = Unit.INSTANCE;
        i5Var.a(h5Var);
        return Unit.INSTANCE;
    }

    public final void a(String str) {
        if (this.d.a(2000, str)) {
            boolean z = ob1.a;
        } else {
            boolean z2 = ob1.a;
        }
    }
}
