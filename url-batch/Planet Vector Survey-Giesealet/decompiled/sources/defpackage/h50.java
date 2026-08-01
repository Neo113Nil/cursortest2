package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final /* synthetic */ class h50 implements m20 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ h50(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.m20
    public final void g(o20 o20Var, e20 e20Var) {
        int i = this.d;
        int i2 = 0;
        Object obj = this.e;
        switch (i) {
            case 0:
                j50 j50Var = (j50) obj;
                j50Var.getClass();
                if (e20Var == e20.ON_DESTROY) {
                    j50Var.a();
                    break;
                }
                break;
            case 1:
                s80 s80Var = (s80) obj;
                s80Var.r = e20Var.a();
                if (s80Var.c != null) {
                    ArrayList p0 = zd.p0(s80Var.g);
                    int size = p0.size();
                    while (i2 < size) {
                        Object obj2 = p0.get(i2);
                        i2++;
                        y70 y70Var = (y70) obj2;
                        y70Var.getClass();
                        y70Var.g = e20Var.a();
                        y70Var.b();
                    }
                    break;
                }
                break;
            default:
                kn0 kn0Var = (kn0) obj;
                if (e20Var != e20.ON_START) {
                    if (e20Var == e20.ON_STOP) {
                        kn0Var.h = false;
                        break;
                    }
                } else {
                    kn0Var.h = true;
                    break;
                }
                break;
        }
    }
}
