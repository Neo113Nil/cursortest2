package yads;

import android.view.View;

/* loaded from: classes14.dex */
public final class fk3 {
    public final ek3 a;

    public fk3(ek3 ek3Var) {
        this.a = ek3Var;
    }

    public final void a() {
        View b = this.a.b();
        if (b == null) {
            return;
        }
        this.a.a(b);
    }

    public final void b(Object obj) {
        View b = this.a.b();
        if (b == null) {
            return;
        }
        this.a.b(b, obj);
        b.setVisibility(0);
    }

    public final void a(ph phVar, hk3 hk3Var, Object obj) {
        if (this.a.b() == null) {
            return;
        }
        this.a.a(phVar, hk3Var, obj);
    }

    public final boolean a(Object obj) {
        View b = this.a.b();
        return b != null && this.a.a(b, obj);
    }
}
