package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public class p80 extends m80 implements Iterable, j00 {
    public static final /* synthetic */ int q = 0;
    public final ps0 m;
    public int n;
    public String o;
    public String p;

    public p80(r80 r80Var) {
        super(r80Var);
        this.m = new ps0();
    }

    @Override // defpackage.m80
    public final k80 b(t7 t7Var) {
        return f(t7Var, false, this);
    }

    public final m80 d(String str, boolean z) {
        Object obj;
        p80 p80Var;
        str.getClass();
        ps0 ps0Var = this.m;
        ps0Var.getClass();
        Iterator it = ((ti) kq0.y(new o(2, ps0Var))).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            m80 m80Var = (m80) obj;
            String str2 = m80Var.j;
            boolean z2 = false;
            if ((str2 == null ? false : str2.equals(str)) || m80Var.c(str) != null) {
                z2 = true;
            }
            if (z2) {
                break;
            }
        }
        m80 m80Var2 = (m80) obj;
        if (m80Var2 != null) {
            return m80Var2;
        }
        if (!z || (p80Var = this.e) == null || tt0.w(str)) {
            return null;
        }
        return p80Var.d(str, true);
    }

    public final m80 e(int i, p80 p80Var, boolean z, m80 m80Var) {
        ps0 ps0Var = this.m;
        m80 m80Var2 = (m80) ps0Var.b(i);
        if (m80Var != null) {
            if (nz.l(m80Var2, m80Var) && nz.l(m80Var2.e, m80Var.e)) {
                return m80Var2;
            }
            m80Var2 = null;
        } else if (m80Var2 != null) {
            return m80Var2;
        }
        if (z) {
            Iterator it = ((ti) kq0.y(new o(2, ps0Var))).iterator();
            while (true) {
                if (!it.hasNext()) {
                    m80Var2 = null;
                    break;
                }
                m80 m80Var3 = (m80) it.next();
                m80Var2 = (!(m80Var3 instanceof p80) || m80Var3.equals(p80Var)) ? null : ((p80) m80Var3).e(i, this, true, m80Var);
                if (m80Var2 != null) {
                    break;
                }
            }
        }
        if (m80Var2 != null) {
            return m80Var2;
        }
        p80 p80Var2 = this.e;
        if (p80Var2 == null || p80Var2.equals(p80Var)) {
            return null;
        }
        p80 p80Var3 = this.e;
        p80Var3.getClass();
        return p80Var3.e(i, this, z, m80Var);
    }

    @Override // defpackage.m80
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof p80) || !super.equals(obj)) {
            return false;
        }
        ps0 ps0Var = this.m;
        int e = ps0Var.e();
        p80 p80Var = (p80) obj;
        ps0 ps0Var2 = p80Var.m;
        if (e != ps0Var2.e() || this.n != p80Var.n) {
            return false;
        }
        Iterator it = ((ti) kq0.y(new o(2, ps0Var))).iterator();
        while (it.hasNext()) {
            m80 m80Var = (m80) it.next();
            if (!m80Var.equals(ps0Var2.b(m80Var.i))) {
                return false;
            }
        }
        return true;
    }

    public final k80 f(t7 t7Var, boolean z, p80 p80Var) {
        k80 k80Var;
        k80 b = super.b(t7Var);
        ArrayList arrayList = new ArrayList();
        o80 o80Var = new o80(this);
        while (true) {
            if (!o80Var.hasNext()) {
                break;
            }
            m80 m80Var = (m80) o80Var.next();
            k80Var = nz.l(m80Var, p80Var) ? null : m80Var.b(t7Var);
            if (k80Var != null) {
                arrayList.add(k80Var);
            }
        }
        k80 k80Var2 = (k80) zd.j0(arrayList);
        p80 p80Var2 = this.e;
        if (p80Var2 != null && z && !p80Var2.equals(p80Var)) {
            k80Var = p80Var2.f(t7Var, true, this);
        }
        return (k80) zd.j0(p8.Z(new k80[]{b, k80Var2, k80Var}));
    }

    public final k80 g(String str, boolean z, p80 p80Var) {
        k80 k80Var;
        str.getClass();
        k80 c = c(str);
        ArrayList arrayList = new ArrayList();
        o80 o80Var = new o80(this);
        while (true) {
            if (!o80Var.hasNext()) {
                break;
            }
            m80 m80Var = (m80) o80Var.next();
            k80Var = nz.l(m80Var, p80Var) ? null : m80Var instanceof p80 ? ((p80) m80Var).g(str, false, this) : m80Var.c(str);
            if (k80Var != null) {
                arrayList.add(k80Var);
            }
        }
        k80 k80Var2 = (k80) zd.j0(arrayList);
        p80 p80Var2 = this.e;
        if (p80Var2 != null && z && !p80Var2.equals(p80Var)) {
            k80Var = p80Var2.g(str, true, this);
        }
        return (k80) zd.j0(p8.Z(new k80[]{c, k80Var2, k80Var}));
    }

    @Override // defpackage.m80
    public final int hashCode() {
        int i = this.n;
        ps0 ps0Var = this.m;
        int e = ps0Var.e();
        for (int i2 = 0; i2 < e; i2++) {
            i = (((i * 31) + ps0Var.c(i2)) * 31) + ((m80) ps0Var.f(i2)).hashCode();
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new o80(this);
    }

    @Override // defpackage.m80
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        String str = this.p;
        m80 d = (str == null || tt0.w(str)) ? null : d(str, true);
        if (d == null) {
            d = e(this.n, this, false, null);
        }
        sb.append(" startDestination=");
        if (d == null) {
            String str2 = this.p;
            if (str2 != null) {
                sb.append(str2);
            } else {
                String str3 = this.o;
                if (str3 != null) {
                    sb.append(str3);
                } else {
                    sb.append("0x" + Integer.toHexString(this.n));
                }
            }
        } else {
            sb.append("{");
            sb.append(d.toString());
            sb.append("}");
        }
        return sb.toString();
    }
}
