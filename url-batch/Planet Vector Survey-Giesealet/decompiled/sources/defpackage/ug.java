package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ug {
    public final y8 b;
    public final bk c;
    public eb e;
    public ws0 f;
    public boolean g;
    public final z8 a = new z8(0, this);
    public qu d = new m5(2, null, 1);

    public ug(bk bkVar, ih0 ih0Var) {
        this.b = new y8(this, ih0Var);
        this.c = bkVar;
    }

    public final boolean a() {
        return this.a.b && this.b.b;
    }

    public final void b() {
        eb ebVar = this.e;
        if (ebVar != null) {
            ebVar.g(new CancellationException("onBack cancelled"), true);
        }
        ws0 ws0Var = this.f;
        if (ws0Var != null) {
            ws0Var.a(null);
        }
        this.e = null;
        this.f = null;
        this.g = false;
    }

    public final void c() {
        if (this.e != null && !this.g) {
            b();
        }
        kj kjVar = null;
        if (this.e == null) {
            this.g = false;
            this.e = x40.b(-2, cb.d, 4);
            this.f = d31.E(this.c, null, new c(this, kjVar, 8), 3);
        }
        eb ebVar = this.e;
        if (ebVar != null) {
            ebVar.g(null, false);
        }
        this.g = false;
    }

    public final void d() {
        b();
        if (a()) {
            this.g = true;
            this.e = x40.b(-2, cb.d, 4);
            this.f = d31.E(this.c, null, new c(this, null, 8), 3);
        }
    }

    public final void e(boolean z) {
        ws0 ws0Var;
        if (!z && a() && (ws0Var = this.f) != null && !ws0Var.b()) {
            b();
        }
        this.a.d(z);
        this.b.f(z);
    }
}
