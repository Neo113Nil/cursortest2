package yads;

import android.app.Activity;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;

/* loaded from: classes6.dex */
public final class zb1 {
    public final qb1 a;
    public final xk2 b;
    public final qh1 c;
    public final lh1 d;
    public final AtomicBoolean e;
    public final Lazy f;

    public zb1(Context context, qb1 qb1Var, xk2 xk2Var) {
        qh1 qh1Var = new qh1(context);
        au2.a.getClass();
        lh1 a = n51.a();
        this.a = qb1Var;
        this.b = xk2Var;
        this.c = qh1Var;
        this.d = a;
        this.e = new AtomicBoolean(false);
        this.f = LazyKt.lazy(new yb1(this));
        qb1Var.l = xk2Var;
    }

    public final void a(final Activity activity) {
        this.c.a();
        this.d.a(new Runnable() { // from class: yads.zb1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                zb1.a(zb1.this, activity);
            }
        });
    }

    public static final void a(zb1 zb1Var, Activity activity) {
        if (!zb1Var.e.getAndSet(true)) {
            Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(zb1Var.a.a(activity));
            if (m8026exceptionOrNullimpl != null) {
                zb1Var.b.a(new m6(String.valueOf(m8026exceptionOrNullimpl.getMessage())));
                return;
            }
            return;
        }
        zb1Var.b.a(n6.a);
    }
}
