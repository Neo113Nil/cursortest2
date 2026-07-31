package yads;

import android.app.Activity;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;

/* loaded from: classes4.dex */
public final class kr2 {
    public final br2 a;
    public final zk2 b;
    public final qh1 c;
    public final lh1 d;
    public final AtomicBoolean e;
    public final Lazy f;

    public kr2(Context context, br2 br2Var, zk2 zk2Var) {
        qh1 qh1Var = new qh1(context);
        au2.a.getClass();
        lh1 a = n51.a();
        this.a = br2Var;
        this.b = zk2Var;
        this.c = qh1Var;
        this.d = a;
        this.e = new AtomicBoolean(false);
        this.f = LazyKt.lazy(new jr2(this));
        br2Var.l = zk2Var;
        br2Var.m.a = zk2Var;
    }

    public final void a(final Activity activity) {
        this.c.a();
        this.d.a(new Runnable() { // from class: yads.kr2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                kr2.a(kr2.this, activity);
            }
        });
    }

    public static final void a(kr2 kr2Var, Activity activity) {
        if (!kr2Var.e.getAndSet(true)) {
            Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(kr2Var.a.a(activity));
            if (m8026exceptionOrNullimpl != null) {
                kr2Var.b.a(new m6(String.valueOf(m8026exceptionOrNullimpl.getMessage())));
                return;
            }
            return;
        }
        kr2Var.b.a(n6.a);
    }
}
