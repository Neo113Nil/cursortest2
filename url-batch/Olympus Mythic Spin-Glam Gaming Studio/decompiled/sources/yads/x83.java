package yads;

import android.app.Activity;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* loaded from: classes12.dex */
public final class x83 implements j1 {
    public static final /* synthetic */ KProperty[] d = {ra.a(x83.class, "contextReference", "getContextReference()Landroid/content/Context;", 0)};
    public final e42 a;
    public final x0 b;
    public final qm2 c;

    public x83(Activity activity, e42 e42Var) {
        x0 x0Var;
        x0 x0Var2 = x0.g;
        if (x0Var2 == null) {
            synchronized (x0.f) {
                x0Var = x0.g;
                if (x0Var == null) {
                    x0Var = new x0();
                    x0.g = x0Var;
                }
            }
            x0Var2 = x0Var;
        }
        this.a = e42Var;
        this.b = x0Var2;
        this.c = new qm2(activity);
    }

    @Override // yads.j1
    public final void a(Activity activity) {
        qm2 qm2Var = this.c;
        KProperty kProperty = d[0];
        Context context = (Context) qm2Var.a.get();
        if (context == null || !Intrinsics.areEqual(context, activity)) {
            return;
        }
        this.a.a.j();
    }

    @Override // yads.j1
    public final void b(Activity activity) {
        qm2 qm2Var = this.c;
        KProperty kProperty = d[0];
        Context context = (Context) qm2Var.a.get();
        if (context == null || !Intrinsics.areEqual(context, activity)) {
            return;
        }
        this.a.a.i();
    }
}
