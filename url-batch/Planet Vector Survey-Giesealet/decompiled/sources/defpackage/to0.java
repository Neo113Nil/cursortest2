package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class to0 extends t50 implements i10 {
    public ho0 r;
    public boolean s;

    @Override // defpackage.i10
    public final e40 d(f40 f40Var, b50 b50Var, long j) {
        boolean z = this.s;
        sc0 sc0Var = sc0.d;
        if ((z ? sc0Var : sc0.e) == sc0Var) {
            if (ui.g(j) == Integer.MAX_VALUE) {
                g8.s("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
                return null;
            }
        } else if (ui.h(j) == Integer.MAX_VALUE) {
            g8.s("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
            return null;
        }
        yf0 d = b50Var.d(ui.a(j, 0, this.s ? ui.h(j) : Integer.MAX_VALUE, 0, this.s ? Integer.MAX_VALUE : ui.g(j), 5));
        int i = d.d;
        int h = ui.h(j);
        if (i > h) {
            i = h;
        }
        int i2 = d.e;
        int g = ui.g(j);
        if (i2 > g) {
            i2 = g;
        }
        int i3 = d.e - i2;
        int i4 = d.d - i;
        if (!this.s) {
            i3 = i4;
        }
        ho0 ho0Var = this.r;
        zd0 zd0Var = ho0Var.d;
        zd0 zd0Var2 = ho0Var.a;
        zd0Var.h(i3);
        or0 or0Var = (or0) ur0.b.o();
        mu e = or0Var != null ? or0Var.e() : null;
        or0 g2 = yc0.g(or0Var);
        try {
            if (zd0Var2.g() > i3) {
                zd0Var2.h(i3);
            }
            yc0.l(or0Var, g2, e);
            this.r.b.h(this.s ? i2 : i);
            return f40Var.h0(i, i2, xp.d, new so0(this, i3, d));
        } catch (Throwable th) {
            yc0.l(or0Var, g2, e);
            throw th;
        }
    }
}
