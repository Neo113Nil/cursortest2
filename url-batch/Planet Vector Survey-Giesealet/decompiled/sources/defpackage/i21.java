package defpackage;

import android.view.View;
import com.vectorharbor.planetvectorsurvey.R;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class i21 {
    public static final WeakHashMap u = new WeakHashMap();
    public final x5 a = pg0.f("captionBar", 4);
    public final x5 b;
    public final x5 c;
    public final x5 d;
    public final x5 e;
    public final x5 f;
    public final x5 g;
    public final x5 h;
    public final x5 i;
    public final yy0 j;
    public final yy0 k;
    public final yy0 l;
    public final yy0 m;
    public final yy0 n;
    public final yy0 o;
    public final yy0 p;
    public final yy0 q;
    public final boolean r;
    public int s;
    public final qy t;

    public i21(View view) {
        x5 f = pg0.f("displayCutout", 128);
        this.b = f;
        x5 f2 = pg0.f("ime", 8);
        this.c = f2;
        x5 f3 = pg0.f("mandatorySystemGestures", 32);
        this.d = f3;
        this.e = pg0.f("navigationBars", 2);
        this.f = pg0.f("statusBars", 1);
        x5 f4 = pg0.f("systemBars", 519);
        this.g = f4;
        x5 f5 = pg0.f("systemGestures", 16);
        this.h = f5;
        x5 f6 = pg0.f("tappableElement", 64);
        this.i = f6;
        yy0 yy0Var = new yy0(new ty(0, 0, 0, 0), "waterfall");
        this.j = yy0Var;
        new jy0(new jy0(f4, f2), f);
        new jy0(new jy0(new jy0(f6, f3), f5), yy0Var);
        this.k = pg0.h("captionBarIgnoringVisibility", 4);
        this.l = pg0.h("navigationBarsIgnoringVisibility", 2);
        this.m = pg0.h("statusBarsIgnoringVisibility", 1);
        this.n = pg0.h("systemBarsIgnoringVisibility", 519);
        this.o = pg0.h("tappableElementIgnoringVisibility", 64);
        this.p = pg0.h("imeAnimationTarget", 8);
        this.q = pg0.h("imeAnimationSource", 8);
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.r = bool != null ? bool.booleanValue() : true;
        this.t = new qy(this);
    }

    public static void a(i21 i21Var, d21 d21Var) {
        boolean z = false;
        i21Var.a.f(d21Var, 0);
        i21Var.c.f(d21Var, 0);
        i21Var.b.f(d21Var, 0);
        i21Var.e.f(d21Var, 0);
        i21Var.f.f(d21Var, 0);
        i21Var.g.f(d21Var, 0);
        i21Var.h.f(d21Var, 0);
        i21Var.i.f(d21Var, 0);
        i21Var.d.f(d21Var, 0);
        i21Var.k.f(ud0.s(d21Var.a.g(4)));
        i21Var.l.f(ud0.s(d21Var.a.g(2)));
        i21Var.m.f(ud0.s(d21Var.a.g(1)));
        i21Var.n.f(ud0.s(d21Var.a.g(519)));
        i21Var.o.f(ud0.s(d21Var.a.g(64)));
        xm e = d21Var.a.e();
        if (e != null) {
            i21Var.j.f(ud0.s(e.a()));
        }
        synchronized (ur0.c) {
            b70 b70Var = ur0.j.h;
            if (b70Var != null) {
                if (b70Var.h()) {
                    z = true;
                }
            }
        }
        if (z) {
            ur0.a();
        }
    }
}
