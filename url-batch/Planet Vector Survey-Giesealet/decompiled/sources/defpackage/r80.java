package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
@o90("navigation")
/* loaded from: classes.dex */
public class r80 extends p90 {
    public final q90 c;

    public r80(q90 q90Var) {
        q90Var.getClass();
        this.c = q90Var;
    }

    @Override // defpackage.p90
    public final void d(List list, c90 c90Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            y70 y70Var = (y70) it.next();
            m80 m80Var = y70Var.e;
            m80Var.getClass();
            p80 p80Var = (p80) m80Var;
            gj0 gj0Var = new gj0();
            gj0Var.d = y70Var.a();
            int i = p80Var.n;
            String str = p80Var.p;
            if (i == 0 && str == null) {
                StringBuilder sb = new StringBuilder("no start destination defined via app:startDestination for ");
                int i2 = p80Var.i;
                sb.append(i2 != 0 ? String.valueOf(i2) : "the root navigation");
                throw new IllegalStateException(sb.toString().toString());
            }
            m80 d = str != null ? p80Var.d(str, false) : (m80) p80Var.m.b(i);
            if (d == null) {
                if (p80Var.o == null) {
                    String str2 = p80Var.p;
                    if (str2 == null) {
                        str2 = String.valueOf(p80Var.n);
                    }
                    p80Var.o = str2;
                }
                String str3 = p80Var.o;
                str3.getClass();
                throw new IllegalArgumentException("navigation destination " + str3 + " is not a direct child of this NavGraph");
            }
            LinkedHashMap linkedHashMap = d.h;
            if (str != null) {
                if (!str.equals(d.j)) {
                    k80 c = d.c(str);
                    Bundle bundle = c != null ? c.e : null;
                    if (bundle != null && !bundle.isEmpty()) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putAll(bundle);
                        Bundle bundle3 = (Bundle) gj0Var.d;
                        if (bundle3 != null) {
                            bundle2.putAll(bundle3);
                        }
                        gj0Var.d = bundle2;
                    }
                }
                if (x40.S(linkedHashMap).isEmpty()) {
                    continue;
                } else {
                    ArrayList K = mz.K(x40.S(linkedHashMap), new b3(gj0Var, 1));
                    if (!K.isEmpty()) {
                        throw new IllegalArgumentException(("Cannot navigate to startDestination " + d + ". Missing required arguments [" + K + ']').toString());
                    }
                }
            }
            p90 b = this.c.b(d.d);
            a80 b2 = b();
            Bundle a = d.a((Bundle) gj0Var.d);
            s80 s80Var = b2.h;
            b.d(px0.H(y7.g(s80Var.a, d, a, s80Var.g(), s80Var.p)), c90Var);
        }
    }

    @Override // defpackage.p90
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public p80 a() {
        return new p80(this);
    }
}
