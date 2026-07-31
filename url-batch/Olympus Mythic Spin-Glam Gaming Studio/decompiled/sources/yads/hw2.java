package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.List;
import kotlin.reflect.KProperty;

/* loaded from: classes6.dex */
public final class hw2 implements ml {
    public final fl a;
    public final km b;
    public final c52 c;
    public final vl d;
    public final s22 e;
    public final mt2 f;
    public final a32 g;
    public final Handler h;
    public final vw2 i;
    public final hl j;
    public final u02 k;
    public final fz l;
    public final ik3 m;
    public final Context n;
    public final ViewTreeObserver.OnPreDrawListener o;
    public t8 p;
    public m12 q;
    public boolean r;
    public ul s;

    public hw2(Context context, fl flVar, km kmVar, c52 c52Var, vl vlVar, s22 s22Var, mt2 mt2Var, a32 a32Var, Handler handler, vw2 vw2Var, hl hlVar, u02 u02Var, fz fzVar, ik3 ik3Var) {
        this.a = flVar;
        this.b = kmVar;
        this.c = c52Var;
        this.d = vlVar;
        this.e = s22Var;
        this.f = mt2Var;
        this.g = a32Var;
        this.h = handler;
        this.i = vw2Var;
        this.j = hlVar;
        this.k = u02Var;
        this.l = fzVar;
        this.m = ik3Var;
        this.n = pz.a(context);
        this.o = new ViewTreeObserver.OnPreDrawListener() { // from class: yads.hw2$$ExternalSyntheticLambda1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return hw2.a(hw2.this);
            }
        };
    }

    public static final void a(fl flVar) {
        flVar.c();
    }

    public static final void b(hw2 hw2Var) {
        hw2Var.m.a(hw2Var.a.D, false);
    }

    @Override // yads.ml
    public final String c() {
        m12 m12Var = this.q;
        if (m12Var != null) {
            return m12Var.c();
        }
        return null;
    }

    @Override // yads.ml
    public final String getAdInfo() {
        return this.k.c(this.q);
    }

    public static final boolean a(final hw2 hw2Var) {
        hw2Var.h.postDelayed(new Runnable() { // from class: yads.hw2$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                hw2.b(hw2.this);
            }
        }, 50L);
        return true;
    }

    @Override // yads.ml
    public final String a() {
        return this.k.a(this.q);
    }

    @Override // yads.ml
    public final void a(Context context) {
        ul ulVar = this.s;
        if (ulVar != null) {
            sl slVar = ulVar.a.e;
            qm2 qm2Var = slVar.d;
            KProperty kProperty = sl.e[0];
            ViewGroup viewGroup = (ViewGroup) qm2Var.a.get();
            if (viewGroup != null) {
                kk3.a(viewGroup);
            }
            hg0 hg0Var = slVar.c;
            if (hg0Var != null) {
                hg0Var.c();
            }
        }
        this.c.b.a();
        this.p = null;
        this.q = null;
        this.r = true;
    }

    @Override // yads.ml
    public final List b() {
        u02 u02Var = this.k;
        m12 m12Var = this.q;
        u02Var.getClass();
        return u02.b(m12Var);
    }

    @Override // yads.ml
    public final void a(Context context, t8 t8Var) {
        this.b.a.a(h5.c, null);
        bu2 a = this.i.a(context);
        if (!(a != null ? a.E : false)) {
            this.a.b(e8.a);
            return;
        }
        if (this.r) {
            return;
        }
        l03 l03Var = this.a.c.d.a;
        ju0 c = t8Var.c();
        this.p = t8Var;
        if (l03Var != null && n03.a(context, t8Var, c, this.j, l03Var)) {
            this.c.a(t8Var, new fw2(this), new ew2(this, context, t8Var));
            return;
        }
        d4 a2 = e8.a(l03Var != null ? l03Var.c(context) : 0, l03Var != null ? l03Var.a(context) : 0, c.c, c.d, hl3.d(context), hl3.b(context));
        ab1.a(a2.c, new Object[0]);
        this.a.b(a2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public hw2(Context context, final fl flVar, km kmVar, yu2 yu2Var) {
        this(context, flVar, kmVar, r5, r6, r7, r8, r9, r10, r11, new hl(), new u02(), new fz() { // from class: yads.hw2$$ExternalSyntheticLambda0
            @Override // yads.fz
            public final void e() {
                hw2.a(fl.this);
            }
        }, new ik3());
        vw2 vw2Var;
        vw2 vw2Var2;
        c52 c52Var = new c52(context, kmVar.b, kmVar.a, yu2Var);
        vl vlVar = new vl(kmVar.b, kmVar.c);
        v3 v3Var = kmVar.b;
        s22 s22Var = new s22(v3Var);
        mt2 mt2Var = new mt2(v3Var, kmVar.c);
        a32 a32Var = new a32(flVar);
        Handler handler = new Handler(Looper.getMainLooper());
        vw2 vw2Var3 = vw2.l;
        if (vw2Var3 == null) {
            synchronized (vw2.k) {
                vw2Var2 = vw2.l;
                if (vw2Var2 == null) {
                    vw2Var2 = new vw2();
                    vw2.l = vw2Var2;
                }
            }
            vw2Var = vw2Var2;
        } else {
            vw2Var = vw2Var3;
        }
    }
}
