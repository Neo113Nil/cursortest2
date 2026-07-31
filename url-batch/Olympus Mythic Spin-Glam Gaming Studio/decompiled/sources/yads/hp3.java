package yads;

import java.util.List;

/* loaded from: classes5.dex */
public final class hp3 implements vo2 {
    public final List a;
    public final /* synthetic */ ip3 b;

    public hp3(ip3 ip3Var, List list) {
        this.b = ip3Var;
        this.a = list;
    }

    @Override // yads.vo2
    public final void a(le3 le3Var) {
        ip3 ip3Var = this.b;
        ip3Var.e--;
        a();
    }

    @Override // yads.vo2
    public final void onSuccess(Object obj) {
        r0.e--;
        this.b.c.addAll((List) obj);
        a();
    }

    public final void a() {
        ip3 ip3Var = this.b;
        bh3 bh3Var = ip3Var.d;
        if (ip3Var.e != 0 || bh3Var == null) {
            return;
        }
        i5 i5Var = ip3Var.a;
        i5Var.a(h5.x, i5Var.b, this.a);
        bh3Var.onSuccess(this.b.c);
    }
}
