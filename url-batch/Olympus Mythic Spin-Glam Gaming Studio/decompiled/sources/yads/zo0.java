package yads;

import android.view.TextureView;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class zo0 {
    public final xn0 a;
    public final an1 b;
    public final ti3 c;
    public final q52 d;
    public final dj3 e;
    public final yo0 f;
    public final jo0 g;
    public t62 h;
    public xf3 i;
    public boolean j;
    public boolean k;

    public zo0(xn0 xn0Var, an1 an1Var, ti3 ti3Var) {
        q52 q52Var = new q52();
        dj3 dj3Var = new dj3();
        this.a = xn0Var;
        this.b = an1Var;
        this.c = ti3Var;
        this.d = q52Var;
        this.e = dj3Var;
        yo0 yo0Var = new yo0(this);
        this.f = yo0Var;
        this.g = new jo0(yo0Var);
        rf1 rf1Var = xn0Var.k;
        if (!rf1Var.g) {
            rf1Var.d.add(new qf1(yo0Var));
        }
        rf1 rf1Var2 = xn0Var.k;
        if (!rf1Var2.g) {
            rf1Var2.d.add(new qf1(dj3Var));
        }
        z5.b = this;
        Iterator it = z5.a.iterator();
        while (it.hasNext()) {
            we2 we2Var = (we2) it.next();
            if (z5.b != null) {
                zo0 zo0Var = z5.b;
                if (zo0Var != null) {
                    xn0 xn0Var2 = zo0Var.a;
                    xn0Var2.getClass();
                    we2Var.getClass();
                    rf1 rf1Var3 = xn0Var2.k;
                    if (!rf1Var3.g) {
                        rf1Var3.d.add(new qf1(we2Var));
                    }
                }
            } else {
                z5.a.add(we2Var);
            }
        }
    }

    public final void a(wf3 wf3Var) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.k = false;
        this.g.b.a();
        this.a.a((TextureView) null);
        dj3 dj3Var = this.e;
        dj3Var.d = null;
        dj3Var.b();
        this.a.c(this.f);
        this.a.c(this.e);
        this.a.l();
    }

    public final boolean b() {
        return this.a.b();
    }

    public final void c() {
        if (this.j) {
            return;
        }
        this.a.a(false);
    }

    public final void d() {
        if (!this.j) {
            this.a.a(true);
        }
        if (this.k) {
            c();
        }
    }

    public final void e() {
        if (this.j || this.k) {
            return;
        }
        this.a.a(true);
    }

    public final void f() {
        if (this.j) {
            return;
        }
        xf3 xf3Var = this.i;
        t62 t62Var = this.h;
        if (xf3Var != null && t62Var != null) {
            xf3Var.e();
        }
        this.j = true;
        this.k = false;
        this.g.b.a();
        this.a.a((TextureView) null);
        dj3 dj3Var = this.e;
        dj3Var.d = null;
        dj3Var.b();
        this.a.c(this.f);
        this.a.c(this.e);
        this.a.l();
    }

    public final void a(t62 t62Var) {
        so0 so0Var;
        if (this.j) {
            return;
        }
        this.h = t62Var;
        an1 an1Var = this.b;
        an1Var.getClass();
        ed0 ed0Var = new ed0(an1Var.a, new zu2(new w53().a(), new ps2().a(an1Var.a)));
        so0 so0Var2 = so0.d;
        if (so0Var2 == null) {
            synchronized (so0.c) {
                so0Var = so0.d;
                if (so0Var == null) {
                    so0Var = new so0();
                    so0.d = so0Var;
                }
            }
            so0Var2 = so0Var;
        }
        br a = so0Var2.a(an1Var.a);
        er erVar = new er();
        erVar.a = a;
        erVar.c = ed0Var;
        ao a2 = new ie0(erVar, new sd0()).a(wl1.a(t62Var.a));
        this.a.a(false);
        this.a.a(a2);
        this.a.k();
        jo0 jo0Var = this.g;
        jo0Var.getClass();
        jo0Var.b.a(jo0.c, new io0(jo0Var));
    }

    public final void a(TextureView textureView) {
        if (this.j) {
            return;
        }
        dj3 dj3Var = this.e;
        dj3Var.d = textureView;
        dj3Var.b();
        this.a.a(textureView);
    }

    public final void a(float f) {
        if (this.j) {
            return;
        }
        this.a.a(f);
        xf3 xf3Var = this.i;
        t62 t62Var = this.h;
        if (xf3Var == null || t62Var == null) {
            return;
        }
        xf3Var.onVolumeChanged(f);
    }

    public final void a() {
        this.k = true;
        c();
    }

    public final void a(xf3 xf3Var) {
        this.i = xf3Var;
    }
}
