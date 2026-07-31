package yads;

import android.app.Application;
import android.content.Context;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class x0 {
    public static final Object f = new Object();
    public static volatile x0 g;
    public final Object a = new Object();
    public final WeakHashMap b = new WeakHashMap();
    public final WeakHashMap c = new WeakHashMap();
    public final w0 d = new w0(this);
    public boolean e;

    public final boolean a() {
        boolean z;
        synchronized (this.a) {
            z = this.e;
        }
        return z;
    }

    public final void b(Context context, j1 j1Var) {
        synchronized (this.a) {
            this.b.remove(j1Var);
            b(context);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void a(Context context, j1 j1Var) {
        synchronized (this.a) {
            try {
                this.b.put(j1Var, null);
                if (!a()) {
                    a(context);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Context context) {
        synchronized (this.a) {
            try {
                if (this.b.isEmpty() && this.c.isEmpty()) {
                    try {
                        if (a()) {
                            Context applicationContext = context.getApplicationContext();
                            Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
                            ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this.d);
                            this.e = false;
                        }
                    } catch (Throwable unused) {
                        boolean z = ob1.a;
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(Context context, fq2 fq2Var) {
        synchronized (this.a) {
            try {
                this.c.put(fq2Var, null);
                if (!a()) {
                    a(context);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(Context context) {
        try {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this.d);
            this.e = true;
        } catch (Throwable unused) {
            boolean z = ob1.a;
        }
    }
}
