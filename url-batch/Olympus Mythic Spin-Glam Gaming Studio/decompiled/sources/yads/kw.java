package yads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class kw implements hg0, a2 {
    public final t8 a;
    public final z1 b;
    public final pl3 c;
    public final d2 d;
    public final pz1 e;
    public final z30 f;
    public final x63 g;
    public zv h;
    public final yj2 i;
    public final uv j;

    public kw(t8 t8Var, z1 z1Var, pl3 pl3Var, d2 d2Var, pz1 pz1Var, z30 z30Var, x63 x63Var) {
        this.a = t8Var;
        this.b = z1Var;
        this.c = pl3Var;
        this.d = d2Var;
        this.e = pz1Var;
        this.f = z30Var;
        this.g = x63Var;
        this.i = x63Var.a;
        this.j = x63Var.d;
    }

    @Override // yads.hg0
    public final void a(ViewGroup viewGroup) {
        vw2 vw2Var;
        View a = this.e.a(viewGroup);
        ProgressBar b = this.e.b(viewGroup);
        if (a != null) {
            this.b.b.add(this);
            Context context = a.getContext();
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
            bu2 a2 = vw2Var2.a(context);
            boolean z = a2 != null && a2.F;
            mg0[] mg0VarArr = mg0.b;
            if (!Intrinsics.areEqual("divkit", this.a.k) || !z) {
                a.setOnClickListener(new jw(this.d, this.f));
            }
            Long l = this.a.j;
            long longValue = l != null ? l.longValue() : 0L;
            zv sj2Var = b != null ? new sj2(a, b, new fm0(), new fw(), this.f, this.i, longValue) : this.j.a() ? new wc0(a, this.c, this.f, longValue, this.g.e) : null;
            this.h = sj2Var;
            if (sj2Var != null) {
                sj2Var.onAdDisplayed();
            }
            if (a.getTag() == null) {
                a.setTag("close");
            }
        }
    }

    @Override // yads.a2
    public final void b() {
        zv zvVar = this.h;
        if (zvVar != null) {
            zvVar.b();
        }
    }

    @Override // yads.hg0
    public final void c() {
        this.b.b.remove(this);
        zv zvVar = this.h;
        if (zvVar != null) {
            zvVar.invalidate();
        }
    }

    @Override // yads.a2
    public final void a() {
        zv zvVar = this.h;
        if (zvVar != null) {
            zvVar.a();
        }
    }
}
