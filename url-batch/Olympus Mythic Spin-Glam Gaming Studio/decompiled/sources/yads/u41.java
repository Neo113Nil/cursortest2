package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes14.dex */
public final class u41 implements x41, kv1, fi3, pn2 {
    public final i02 a;
    public final v4 b;
    public final v41 c;
    public final Context d;
    public ArrayList e;
    public y4 f;

    public u41(Context context, i02 i02Var, w41 w41Var, v4 v4Var) {
        v41 v41Var = new v41(w41Var);
        this.a = i02Var;
        this.b = v4Var;
        this.c = v41Var;
        this.d = context.getApplicationContext();
    }

    public final void a() {
        v4 v4Var = this.b;
        String str = v4Var.a.a;
        if (str != null && str.length() != 0) {
            u4 u4Var = v4Var.b;
            u4Var.getClass();
            synchronized (u4.c) {
                u4Var.b.remove(str);
                u4Var.b.add(str);
            }
        }
        i02 i02Var = this.a;
        i02Var.a.a(this.f);
    }

    @Override // yads.kv1
    public final void b() {
        if (j()) {
            return;
        }
        v41 v41Var = this.c;
        if (!v41Var.d) {
            v41Var.d = true;
            for (fo2 fo2Var : v41.f) {
                w41 w41Var = v41Var.a;
                Map map = v41Var.b;
                io2 a = w41Var.a();
                a.a.putAll(map);
                w41Var.a(fo2Var, a);
            }
        }
        if (i()) {
            a();
        }
    }

    @Override // yads.x41
    public final void c() {
        if (!j() || i()) {
            return;
        }
        a();
    }

    @Override // yads.fi3
    public final void d() {
        if (j()) {
            return;
        }
        v41 v41Var = this.c;
        if (!v41Var.c) {
            v41Var.c = true;
            for (fo2 fo2Var : v41.e) {
                w41 w41Var = v41Var.a;
                Map map = v41Var.b;
                io2 a = w41Var.a();
                a.a.putAll(map);
                w41Var.a(fo2Var, a);
            }
        }
        if (i()) {
            return;
        }
        a();
    }

    @Override // yads.kv1
    public final void e() {
        if (j()) {
            return;
        }
        v41 v41Var = this.c;
        if (!v41Var.c) {
            v41Var.c = true;
            for (fo2 fo2Var : v41.e) {
                w41 w41Var = v41Var.a;
                Map map = v41Var.b;
                io2 a = w41Var.a();
                a.a.putAll(map);
                w41Var.a(fo2Var, a);
            }
        }
        if (i()) {
            return;
        }
        a();
    }

    @Override // yads.pn2
    public final void f() {
    }

    @Override // yads.x41
    public final void g() {
        if (j() && i()) {
            a();
        }
    }

    @Override // yads.fi3
    public final void h() {
        if (j()) {
            return;
        }
        v41 v41Var = this.c;
        if (!v41Var.d) {
            v41Var.d = true;
            for (fo2 fo2Var : v41.f) {
                w41 w41Var = v41Var.a;
                Map map = v41Var.b;
                io2 a = w41Var.a();
                a.a.putAll(map);
                w41Var.a(fo2Var, a);
            }
        }
        if (i()) {
            a();
        }
    }

    public final boolean i() {
        vw2 vw2Var;
        vw2 vw2Var2 = vw2.l;
        if (vw2Var2 == null) {
            synchronized (vw2.k) {
                vw2Var = vw2.l;
                if (vw2Var == null) {
                    vw2Var = new vw2();
                    vw2.l = vw2Var;
                }
            }
            vw2Var2 = vw2Var;
        }
        bu2 a = vw2Var2.a(this.d);
        return a == null || a.u;
    }

    public final boolean j() {
        ArrayList arrayList = this.e;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }
}
