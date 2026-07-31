package yads;

import android.app.Activity;
import android.content.Context;
import android.view.Window;
import android.widget.RelativeLayout;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d2 implements e2, fz {
    public final Activity a;
    public final RelativeLayout b;
    public final Window c;
    public final m12 d;
    public final t8 e;
    public final o2 f;
    public final v3 g;
    public final bu2 h;
    public final vw0 i;
    public final ax0 j;
    public final lx0 k;

    public d2(Activity activity, RelativeLayout relativeLayout, Window window, m12 m12Var, t8 t8Var, o2 o2Var, z1 z1Var, v3 v3Var, yu2 yu2Var, int i, bu2 bu2Var) {
        ArrayList arrayList;
        ri0 ri0Var;
        lx0 rx0Var;
        Object obj;
        vw0 vw0Var = new vw0(activity);
        ax0 ax0Var = new ax0(v3Var.a);
        this.a = activity;
        this.b = relativeLayout;
        this.c = window;
        this.d = m12Var;
        this.e = t8Var;
        this.f = o2Var;
        this.g = v3Var;
        this.h = bu2Var;
        this.i = vw0Var;
        this.j = ax0Var;
        sx0 sx0Var = new sx0(activity, t8Var, relativeLayout, this, z1Var, i, o2Var, v3Var, yu2Var);
        Context context = ((nt3) sx0Var.c).a;
        pr2 pr2Var = new pr2(activity, new pi0(m12Var, this, pr.a(context, context)), this);
        t3 t3Var = sx0Var.f;
        t8 t8Var2 = sx0Var.a;
        t3Var.getClass();
        r2 oq2Var = t8Var2.a == e00.f ? new oq2(t3Var.a, pr2Var) : new pb1();
        List f = m12Var.f();
        if (f != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : f) {
                String str = ((ri0) obj2).a;
                ng0[] ng0VarArr = ng0.b;
                if (Intrinsics.areEqual(str, "ad")) {
                    arrayList2.add(obj2);
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        List f2 = m12Var.f();
        if (f2 != null) {
            ListIterator listIterator = f2.listIterator(f2.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                String str2 = ((ri0) obj).a;
                ng0[] ng0VarArr2 = ng0.b;
                if (Intrinsics.areEqual(str2, "pack_shot")) {
                    break;
                }
            }
            ri0Var = (ri0) obj;
        } else {
            ri0Var = null;
        }
        s12 b = m12Var.b();
        b6 b6Var = b != null ? b.j : null;
        String str3 = sx0Var.a.p;
        kg0[] kg0VarArr = kg0.b;
        if (!Intrinsics.areEqual(str3, "ad_pod") || b6Var == null || (!(m12Var instanceof k32) && ri0Var == null)) {
            rx0Var = new rx0(sx0Var.e.a(activity, sx0Var.b, m12Var, sx0Var.d, new bl2(oq2Var), pr2Var, new x63(new yj2(), new vz2(sx0Var.a), new b03(sx0Var.a), new a03()), new c03(), arrayList != null ? (ri0) CollectionsKt.firstOrNull((List) arrayList) : null, null), this);
        } else {
            rx0Var = new f6(activity, m12Var, sx0Var.d, pr2Var, arrayList, ri0Var, sx0Var.b, oq2Var, this, sx0Var.e, b6Var);
        }
        this.k = rx0Var;
    }

    @Override // yads.e2
    public final void a() {
        this.f.a(2, null);
    }

    @Override // yads.e2
    public final void b() {
        this.f.a(3, null);
    }

    @Override // yads.e2
    public final void c() {
        if (this.g.a != e00.i) {
            this.b.setBackground(r8.a);
        }
        this.k.c();
        this.f.a(0, null);
        this.f.a(5, null);
        boolean z = ob1.a;
    }

    @Override // yads.e2
    public final boolean d() {
        vw2 vw2Var;
        vw0 vw0Var = this.i;
        vw2 vw2Var2 = vw2.l;
        if (vw2Var2 == null) {
            vw0Var.getClass();
            synchronized (vw2.k) {
                vw2Var = vw2.l;
                if (vw2Var == null) {
                    vw2Var = new vw2();
                    vw2.l = vw2Var;
                }
            }
            vw2Var2 = vw2Var;
        }
        bu2 a = vw2Var2.a(vw0Var.a);
        return a != null && a.s;
    }

    @Override // yads.fz
    public final void e() {
        this.f.a.finish();
    }

    @Override // yads.e2
    public final void f() {
        bu2 bu2Var;
        this.f.a(this.a.getResources().getConfiguration().orientation == 1 ? 7 : 6);
        this.c.requestFeature(1);
        this.c.addFlags(1024);
        this.c.addFlags(16777216);
        this.j.a(this.c, this.b);
        if (this.e.F || ((bu2Var = this.h) != null && bu2Var.I0)) {
            ax0 ax0Var = this.j;
            Window window = this.c;
            ax0Var.getClass();
            WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(window, window.getDecorView());
            insetsController.setSystemBarsBehavior(2);
            insetsController.hide(WindowInsetsCompat.Type.navigationBars());
        }
    }

    @Override // yads.e2
    public final void g() {
        this.k.invalidate();
    }

    @Override // yads.e2
    public final void onAdClosed() {
        this.d.destroy();
        this.f.a(4, null);
    }
}
