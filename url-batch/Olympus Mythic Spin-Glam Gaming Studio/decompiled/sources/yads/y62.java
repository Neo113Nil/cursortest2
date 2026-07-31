package yads;

import android.content.Context;
import kotlin.collections.CollectionsKt;

/* loaded from: classes15.dex */
public final class y62 {
    public final ii3 a;
    public final ak3 b;
    public final s62 c;
    public final bz2 d;
    public final mh1 e;
    public final r52 f;
    public final nj2 g;
    public final r72 h;
    public final me2 i;
    public final me2 j;
    public final vn2 k;
    public final w62 l;
    public me2 m;

    public y62(Context context, t8 t8Var, yu2 yu2Var, zo0 zo0Var, de3 de3Var, ii3 ii3Var, ak3 ak3Var, sf3 sf3Var, wj3 wj3Var, t41 t41Var, s62 s62Var, ri2 ri2Var, bz2 bz2Var) {
        mh1 mh1Var = new mh1();
        this.a = ii3Var;
        this.b = ak3Var;
        this.c = s62Var;
        this.d = bz2Var;
        this.e = mh1Var;
        this.l = new w62(this);
        u72 u72Var = new u72(ak3Var);
        this.f = new r52(zo0Var);
        this.h = new r72(zo0Var);
        dg3 dg3Var = new dg3();
        CollectionsKt.addAll(dg3Var.a, new cg3[]{new qe2(s62Var), new wi3(ak3Var), new sl3(new s52(zo0Var), u72Var)});
        r62 r62Var = new r62(context, t8Var, yu2Var, zo0Var, (we3) CollectionsKt.first(de3Var.a), u72Var, sf3Var, wj3Var, dg3Var, t41Var);
        co2 co2Var = new co2(zo0Var, (we3) CollectionsKt.first(de3Var.a), dg3Var);
        s72 s72Var = new s72(zo0Var, ii3Var);
        nj2 nj2Var = new nj2(de3Var, new s21(context, new h42(t8Var), ri2Var));
        this.g = nj2Var;
        this.j = new me2(ak3Var, r62Var, s72Var, nj2Var);
        this.i = new me2(ak3Var, co2Var, s72Var, nj2Var);
        this.k = new vn2(ak3Var, new x62(this));
    }

    public final void a(me2 me2Var) {
        this.m = me2Var;
        if (me2Var != null) {
            me2Var.e.a = this.l;
        }
        if (me2Var != null) {
            me2Var.b.a(me2Var.e);
            me2Var.b.play();
        }
    }
}
