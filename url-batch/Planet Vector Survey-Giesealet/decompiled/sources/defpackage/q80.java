package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class q80 extends n80 {
    public final q90 f;
    public final String g;
    public final ArrayList h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q80(q90 q90Var, String str) {
        super(q90Var.b(d31.x(r80.class)), null);
        q90Var.getClass();
        str.getClass();
        this.h = new ArrayList();
        this.f = q90Var;
        this.g = str;
    }

    public final p80 c() {
        p80 p80Var = (p80) super.a();
        ArrayList arrayList = this.h;
        arrayList.getClass();
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            m80 m80Var = (m80) obj;
            if (m80Var != null) {
                ps0 ps0Var = p80Var.m;
                int i3 = m80Var.i;
                String str = m80Var.j;
                if (i3 == 0 && str == null) {
                    g8.r("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
                    return null;
                }
                String str2 = p80Var.j;
                if (str2 != null && nz.l(str, str2)) {
                    g8.i("Destination ", m80Var, " cannot have the same route as graph ", p80Var);
                    return null;
                }
                if (i3 == p80Var.i) {
                    g8.i("Destination ", m80Var, " cannot have the same id as graph ", p80Var);
                    return null;
                }
                m80 m80Var2 = (m80) ps0Var.b(i3);
                if (m80Var2 == m80Var) {
                    continue;
                } else {
                    if (m80Var.e != null) {
                        g8.s("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
                        return null;
                    }
                    if (m80Var2 != null) {
                        m80Var2.e = null;
                    }
                    m80Var.e = p80Var;
                    ps0Var.d(m80Var.i, m80Var);
                }
            }
        }
        String str3 = this.g;
        if (str3 == null) {
            if (this.b != null) {
                g8.s("You must set a start destination route");
                return null;
            }
            g8.s("You must set a start destination id");
            return null;
        }
        if (str3 != null) {
            if (str3.equals(p80Var.j)) {
                g8.i("Start destination ", str3, " cannot use the same route as the graph ", p80Var);
            } else if (tt0.w(str3)) {
                g8.r("Cannot have an empty start destination route");
            } else {
                i = "android-app://androidx.navigation/".concat(str3).hashCode();
            }
            return p80Var;
        }
        p80Var.n = i;
        p80Var.p = str3;
        return p80Var;
    }
}
