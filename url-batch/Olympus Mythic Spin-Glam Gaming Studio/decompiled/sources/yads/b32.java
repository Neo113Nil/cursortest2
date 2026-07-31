package yads;

import android.view.ViewGroup;

/* loaded from: classes11.dex */
public final class b32 implements hg0 {
    public final c32 a;

    public b32(p42 p42Var, vh3 vh3Var) {
        j62 j62Var = p42Var.a;
        this.a = j62Var != null ? new c32(j62Var, vh3Var) : null;
    }

    @Override // yads.hg0
    public final void a(ViewGroup viewGroup) {
        c32 c32Var = this.a;
        if (c32Var != null) {
            c32Var.a.a.add(c32Var);
        }
    }

    @Override // yads.hg0
    public final void c() {
        c32 c32Var = this.a;
        if (c32Var != null) {
            c32Var.a.a.remove(c32Var);
            c32Var.b = null;
        }
    }
}
