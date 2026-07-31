package yads;

import android.view.View;

/* loaded from: classes15.dex */
public class bc0 implements qh {
    public final ek3 a;

    public bc0(ek3 ek3Var) {
        this.a = ek3Var;
    }

    @Override // yads.qh
    public final void a() {
        View b = this.a.b();
        if (b == null) {
            return;
        }
        this.a.a(b);
    }

    public void b(Object obj) {
        c(obj);
    }

    @Override // yads.qh
    public final wk3 c() {
        View b = this.a.b();
        if (b != null) {
            return new wk3(b);
        }
        return null;
    }

    @Override // yads.qh
    public final boolean d() {
        return hl3.a(this.a.b()) >= 100;
    }

    @Override // yads.qh
    public final void destroy() {
    }

    @Override // yads.qh
    public final boolean e() {
        return this.a.c();
    }

    @Override // yads.qh
    public final boolean b() {
        return this.a.b() != null;
    }

    @Override // yads.qh
    public final void c(Object obj) {
        View b = this.a.b();
        if (b == null) {
            return;
        }
        this.a.b(b, obj);
        b.setVisibility(0);
    }

    @Override // yads.qh
    public final void a(ph phVar, hk3 hk3Var) {
        this.a.a(phVar, hk3Var, phVar.c);
    }

    @Override // yads.qh
    public final boolean a(Object obj) {
        View b = this.a.b();
        return b != null && this.a.a(b, obj);
    }
}
