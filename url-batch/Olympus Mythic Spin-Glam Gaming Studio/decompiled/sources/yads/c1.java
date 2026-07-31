package yads;

import android.content.Context;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class c1 {
    public final Context a;
    public final g1 b;
    public final x0 c;
    public final y43 d;
    public final b1 e;

    public c1(Context context, v3 v3Var, yu2 yu2Var, t8 t8Var, e1 e1Var, hq0 hq0Var) {
        x0 x0Var;
        Context applicationContext = context.getApplicationContext();
        g1 g1Var = new g1(context, v3Var, yu2Var, t8Var, e1Var, hq0Var);
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
        y43 a = x43.a();
        this.a = applicationContext;
        this.b = g1Var;
        this.c = x0Var2;
        this.d = a;
        this.e = new b1(this);
    }

    public final void a() {
        this.c.a(this.a, (j1) this.e);
        this.c.a(this.a, (fq2) this.e);
    }

    public final void b() {
        this.b.a(f1.c);
        this.c.b(this.a, this.e);
        x0 x0Var = this.c;
        Context context = this.a;
        b1 b1Var = this.e;
        synchronized (x0Var.a) {
            x0Var.c.remove(b1Var);
            x0Var.b(context);
            Unit unit = Unit.INSTANCE;
        }
        this.d.a(cd1.d, this);
    }

    public final void c() {
        this.d.b(cd1.d, this);
        this.c.a(this.a, (j1) this.e);
        this.c.a(this.a, (fq2) this.e);
        this.b.b(f1.c);
    }

    public final void d() {
        this.b.a(f1.d);
    }

    public final void e() {
        this.b.b(f1.d);
    }
}
