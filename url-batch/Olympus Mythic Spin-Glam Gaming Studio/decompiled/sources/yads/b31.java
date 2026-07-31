package yads;

/* loaded from: classes11.dex */
public final class b31 implements vp2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ g31 b;

    public b31(g31 g31Var, String str) {
        this.b = g31Var;
        this.a = str;
    }

    @Override // yads.vp2
    public final void a(hm3 hm3Var) {
        g31 g31Var = this.b;
        String str = this.a;
        d31 d31Var = (d31) g31Var.c.remove(str);
        if (d31Var != null) {
            d31Var.c = hm3Var;
            g31Var.d.put(str, d31Var);
            if (g31Var.f == null) {
                c31 c31Var = new c31(g31Var);
                g31Var.f = c31Var;
                g31Var.e.postDelayed(c31Var, 100);
            }
        }
    }
}
