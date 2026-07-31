package yads;

import com.ironsource.X3;

/* loaded from: classes4.dex */
public final class kx2 {
    public final ox2 a;
    public final ox2 b;

    public kx2(ox2 ox2Var, ox2 ox2Var2) {
        this.a = ox2Var;
        this.b = ox2Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kx2.class != obj.getClass()) {
            return false;
        }
        kx2 kx2Var = (kx2) obj;
        return this.a.equals(kx2Var.a) && this.b.equals(kx2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder(X3.j.d);
        sb.append(this.a);
        if (this.a.equals(this.b)) {
            str = "";
        } else {
            str = ", " + this.b;
        }
        sb.append(str);
        sb.append(X3.j.e);
        return sb.toString();
    }
}
