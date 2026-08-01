package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class y5 extends v00 implements mu {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y5(Object obj, Object obj2, Object obj3, int i) {
        super(1);
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
    }

    @Override // defpackage.mu
    public final Object c(Object obj) {
        int i = this.e;
        boolean z = false;
        uw0 uw0Var = null;
        ky0 ky0Var = ky0.a;
        Object obj2 = this.g;
        Object obj3 = this.h;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                b7 b7Var = (b7) obj;
                b6 b6Var = (b6) obj4;
                ze0.v(b7Var, b6Var.c);
                ce0 ce0Var = b7Var.e;
                Object a = b6.a(b6Var, ce0Var.getValue());
                if (!nz.l(a, ce0Var.getValue())) {
                    b6Var.c.e.setValue(a);
                    ((d7) obj2).e.setValue(a);
                    b7Var.i.setValue(Boolean.FALSE);
                    b7Var.d.a();
                    ((cj0) obj3).d = true;
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                float floatValue = ((Number) obj).floatValue();
                dj djVar = (dj) obj4;
                float f = djVar.t ? 1.0f : -1.0f;
                zo0 zo0Var = djVar.s;
                long d = zo0Var.d(zo0Var.g(f * floatValue));
                zo0 zo0Var2 = ((xo0) obj3).a;
                float f2 = zo0Var.f(zo0Var.d(zo0.a(zo0Var2, zo0Var2.h, d, 1))) * f;
                if (Math.abs(f2) < Math.abs(floatValue)) {
                    CancellationException cancellationException = new CancellationException("Scroll animation cancelled because scroll was not consumed (" + f2 + " < " + floatValue + ')');
                    cancellationException.initCause(null);
                    ((zz) obj2).a(cancellationException);
                    break;
                }
                break;
            case 3:
                gs0 gs0Var = (gs0) obj4;
                y70 y70Var = (y70) obj2;
                gs0Var.add(y70Var);
                break;
            case 4:
                ix0 ix0Var = (ix0) obj;
                nn nnVar = (nn) ix0Var;
                if (!((n4) ((f3) nz.b0((nn) obj2)).getDragAndDropManager()).b.contains(nnVar) || !x40.k(nnVar, nk.y((p01) obj3))) {
                    break;
                } else {
                    ((gj0) obj4).d = ix0Var;
                    break;
                }
            case 5:
                wk0 wk0Var = (wk0) obj;
                bt0 bt0Var = (bt0) obj2;
                bt0 bt0Var2 = (bt0) obj4;
                wk0Var.b(bt0Var2 != null ? ((Number) bt0Var2.getValue()).floatValue() : 1.0f);
                wk0Var.d(bt0Var != null ? ((Number) bt0Var.getValue()).floatValue() : 1.0f);
                wk0Var.e(bt0Var != null ? ((Number) bt0Var.getValue()).floatValue() : 1.0f);
                bt0 bt0Var3 = (bt0) obj3;
                wk0Var.f(bt0Var3 != null ? ((uw0) bt0Var3.getValue()).a : uw0.b);
                break;
            case 6:
                wq wqVar = (wq) obj3;
                int ordinal = ((cq) obj).ordinal();
                if (ordinal == 0) {
                    dx0 dx0Var = wqVar.a;
                } else if (ordinal == 1) {
                    uw0Var = (uw0) obj4;
                } else if (ordinal != 2) {
                    g8.c();
                    break;
                } else {
                    dx0 dx0Var2 = wqVar.a;
                }
                break;
            case 7:
                ts tsVar = (ts) obj;
                if (!nz.l(tsVar, (ts) obj4)) {
                    if (nz.l(tsVar, ((ks) obj2).c)) {
                        g8.s("Focus search landed at the root.");
                        break;
                    } else {
                        z = ((Boolean) ((mu) obj3).c(tsVar)).booleanValue();
                    }
                }
                break;
            case 8:
                xf0 xf0Var = (xf0) obj;
                f40 f40Var = (f40) obj3;
                hd0 hd0Var = (hd0) obj4;
                boolean z2 = hd0Var.v;
                yf0 yf0Var = (yf0) obj2;
                float f3 = hd0Var.r;
                if (!z2) {
                    xf0.g(xf0Var, yf0Var, y6.c(f3, f40Var), y6.c(hd0Var.s, f40Var));
                    break;
                } else {
                    xf0.j(xf0Var, yf0Var, y6.c(f3, f40Var), y6.c(hd0Var.s, f40Var));
                    break;
                }
            default:
                xf0 xf0Var2 = (xf0) obj;
                yf0 yf0Var2 = (yf0) obj4;
                f40 f40Var2 = (f40) obj2;
                jd0 jd0Var = (jd0) obj3;
                id0 id0Var = jd0Var.r;
                xf0.g(xf0Var2, yf0Var2, y6.c(f40Var2.getLayoutDirection() == c10.d ? id0Var.a : id0Var.c, f40Var2), y6.c(jd0Var.r.b, f40Var2));
                break;
        }
        return ky0Var;
    }
}
