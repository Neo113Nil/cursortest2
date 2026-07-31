package yads;

import android.content.Context;
import android.view.View;
import kotlin.collections.CollectionsKt;

/* loaded from: classes9.dex */
public final class jc3 {
    public final uf3 a;
    public final bk3 b;
    public final we3 c;
    public final tg3 d;
    public final wj3 e;
    public final i5 f;
    public final jg3 g;
    public final gg3 h;
    public final nf3 i;

    public jc3(Context context, yu2 yu2Var, uf3 uf3Var, bk3 bk3Var, we3 we3Var, aj3 aj3Var, tg3 tg3Var, wj3 wj3Var, dg3 dg3Var, of3 of3Var, t8 t8Var, boolean z) {
        this.a = uf3Var;
        this.b = bk3Var;
        this.c = we3Var;
        this.d = tg3Var;
        this.e = wj3Var;
        i5 i5Var = new i5();
        this.f = i5Var;
        jg3 jg3Var = new jg3(context, yu2Var, t8Var, we3Var, i5Var, tg3Var, bk3Var, aj3Var, wj3Var);
        this.g = jg3Var;
        gg3 gg3Var = new gg3(uf3Var, dg3Var);
        this.h = gg3Var;
        this.i = new nf3(we3Var, uf3Var, gg3Var, jg3Var, tg3Var, i5Var, wj3Var, of3Var, z);
        pl2 pl2Var = new pl2(wj3Var);
        xj2 xj2Var = new xj2(context, we3Var);
        tc3 tc3Var = new tc3(we3Var, bk3Var, wj3Var, of3Var);
        fd3 fd3Var = new fd3(bk3Var, wj3Var, uf3Var);
        nl3 nl3Var = new nl3(we3Var, bk3Var, tg3Var, wj3Var, of3Var);
        if (!z) {
            CollectionsKt.addAll(dg3Var.a, new cg3[]{tc3Var});
        } else {
            CollectionsKt.addAll(dg3Var.a, new cg3[]{pl2Var, xj2Var, fd3Var, tc3Var, nl3Var});
            CollectionsKt.addAll(dg3Var.b, new eg3[]{nl3Var});
        }
    }

    public final void a() {
        this.a.a(this.i);
        this.a.a(this.c);
        this.f.a(h5.z, null);
        View view = this.b.getView();
        if (view != null) {
            this.e.a(view, this.b.a());
        }
        og3 og3Var = this.g.g;
        if (!og3Var.e && !og3Var.d) {
            og3Var.e = true;
            og3Var.c.post(new ng3(og3Var));
        }
        this.d.a(rg3.c);
    }
}
