package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class bj {
    public final na a;
    public final hc b;

    public bj(na naVar, hc hcVar) {
        this.a = naVar;
        this.b = hcVar;
    }

    public final String toString() {
        hc hcVar = this.b;
        if (hcVar.h.k(xj.e) != null) {
            g8.q();
            return null;
        }
        StringBuilder sb = new StringBuilder("Request@");
        int hashCode = hashCode();
        nk.g(16);
        String num = Integer.toString(hashCode, 16);
        num.getClass();
        sb.append(num);
        sb.append("(currentBounds()=");
        sb.append(this.a.a());
        sb.append(", continuation=");
        sb.append(hcVar);
        sb.append(')');
        return sb.toString();
    }
}
