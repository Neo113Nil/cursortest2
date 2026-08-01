package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class d6 implements zm {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public d6(lm lmVar, y70 y70Var, gs0 gs0Var) {
        this.a = 1;
        this.c = lmVar;
        this.d = y70Var;
        this.b = gs0Var;
    }

    @Override // defpackage.zm
    public final void a() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((gs0) obj3).remove(obj2);
                ((p6) obj).d.k(obj2);
                break;
            case 1:
                y70 y70Var = (y70) obj;
                ((lm) obj2).b().b(y70Var);
                ((gs0) obj3).remove(y70Var);
                break;
            case 2:
                ((o20) obj3).getLifecycle().b((k20) obj2);
                lh0 lh0Var = (lh0) ((gj0) obj).d;
                if (lh0Var != null) {
                    lh0Var.a();
                    break;
                }
                break;
            default:
                wm0 wm0Var = (wm0) obj3;
                an0 an0Var = (an0) obj;
                if (wm0Var.b.k(obj2) == an0Var) {
                    Map map = wm0Var.a;
                    Map c = an0Var.c();
                    if (!c.isEmpty()) {
                        map.put(obj2, c);
                        break;
                    } else {
                        map.remove(obj2);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ d6(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
