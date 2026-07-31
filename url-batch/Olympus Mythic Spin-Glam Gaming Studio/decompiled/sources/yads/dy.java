package yads;

import android.view.ViewGroup;

/* loaded from: classes5.dex */
public final class dy implements hg0 {
    public final hg0[] a;

    public dy(hg0... hg0VarArr) {
        this.a = hg0VarArr;
    }

    @Override // yads.hg0
    public final void a(ViewGroup viewGroup) {
        for (hg0 hg0Var : this.a) {
            hg0Var.a(viewGroup);
        }
    }

    @Override // yads.hg0
    public final void c() {
        for (hg0 hg0Var : this.a) {
            hg0Var.c();
        }
    }
}
