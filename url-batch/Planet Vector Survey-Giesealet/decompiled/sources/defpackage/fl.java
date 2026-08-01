package defpackage;

import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class fl implements m20 {
    public final /* synthetic */ int d = 0;
    public final Object e;
    public final Object f;

    public fl(n20 n20Var) {
        this.e = n20Var;
        od odVar = od.c;
        Class<?> cls = n20Var.getClass();
        md mdVar = (md) odVar.a.get(cls);
        this.f = mdVar == null ? odVar.a(cls, null) : mdVar;
    }

    @Override // defpackage.m20
    public final void g(o20 o20Var, e20 e20Var) {
        int i = this.d;
        Object obj = this.e;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                dl dlVar = (dl) obj;
                switch (el.a[e20Var.ordinal()]) {
                    case 1:
                        dlVar.f(o20Var);
                        break;
                    case 2:
                        dlVar.c(o20Var);
                        break;
                    case 3:
                        dlVar.e(o20Var);
                        break;
                    case 4:
                        dlVar.a(o20Var);
                        break;
                    case 5:
                        dlVar.b(o20Var);
                        break;
                    case 6:
                        dlVar.d(o20Var);
                        break;
                    case 7:
                        g8.r("ON_ANY must not been send by anybody");
                        break;
                    default:
                        g8.c();
                        break;
                }
                m20 m20Var = (m20) obj2;
                if (m20Var != null) {
                    m20Var.g(o20Var, e20Var);
                    break;
                }
                break;
            case 1:
                if (e20Var == e20.ON_START) {
                    ((g20) obj).b(this);
                    ((in0) obj2).d();
                    break;
                }
                break;
            default:
                HashMap hashMap = ((md) obj2).a;
                md.a((List) hashMap.get(e20Var), o20Var, e20Var, obj);
                md.a((List) hashMap.get(e20.ON_ANY), o20Var, e20Var, obj);
                break;
        }
    }

    public fl(dl dlVar, m20 m20Var) {
        dlVar.getClass();
        this.e = dlVar;
        this.f = m20Var;
    }

    public fl(g20 g20Var, in0 in0Var) {
        this.e = g20Var;
        this.f = in0Var;
    }
}
