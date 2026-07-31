package yads;

import android.view.ViewGroup;

/* loaded from: classes6.dex */
public final class lp2 implements hg0 {
    public final o2 a;
    public final int b;

    public lp2(o2 o2Var, int i) {
        this.a = o2Var;
        this.b = i;
    }

    @Override // yads.hg0
    public final void a(ViewGroup viewGroup) {
        if (this.b == 1) {
            this.a.a(7);
        } else {
            this.a.a(6);
        }
    }

    @Override // yads.hg0
    public final void c() {
    }
}
