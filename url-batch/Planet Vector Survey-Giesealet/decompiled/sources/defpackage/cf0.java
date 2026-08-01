package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class cf0 implements bu {
    public final /* synthetic */ df0 d;

    public cf0(df0 df0Var) {
        this.d = df0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bu
    public final Object a() {
        ArrayList arrayList = this.d.a;
        a70 a70Var = new a70(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            r00 r00Var = (r00) arrayList.get(i);
            Object obj = r00Var.b;
            int i2 = r00Var.a;
            Object h00Var = obj != null ? new h00(Integer.valueOf(i2), r00Var.b) : Integer.valueOf(i2);
            int f = a70Var.f(h00Var);
            boolean z = f < 0;
            Object obj2 = z ? null : a70Var.c[f];
            if (obj2 != null) {
                if (obj2 instanceof x60) {
                    x60 x60Var = (x60) obj2;
                    x60Var.a(r00Var);
                    r00Var = x60Var;
                } else {
                    Object[] objArr = na0.a;
                    x60 x60Var2 = new x60(2);
                    x60Var2.a(obj2);
                    x60Var2.a(r00Var);
                    r00Var = x60Var2;
                }
            }
            if (z) {
                int i3 = ~f;
                a70Var.b[i3] = h00Var;
                a70Var.c[i3] = r00Var;
            } else {
                a70Var.c[f] = r00Var;
            }
        }
        return new l60(a70Var);
    }
}
