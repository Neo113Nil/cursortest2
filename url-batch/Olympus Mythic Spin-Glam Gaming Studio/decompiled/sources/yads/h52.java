package yads;

import android.view.View;

/* loaded from: classes13.dex */
public final class h52 {
    public final ar2 a;
    public final ww0 b;
    public View c;

    public h52(l73 l73Var, p42 p42Var, x63 x63Var) {
        this.a = new ar2(l73Var);
        g52 g52Var = new g52(this);
        j62 j62Var = p42Var.a;
        d82 d82Var = p42Var.b;
        this.b = j62Var != null ? new i72(j62Var, g52Var, x63Var) : d82Var != null ? new i82(d82Var, g52Var, x63Var) : new u32(g52Var, x63Var);
    }
}
