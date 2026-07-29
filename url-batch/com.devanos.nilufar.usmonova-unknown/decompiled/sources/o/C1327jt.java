package o;

/* renamed from: o.jt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1327jt {
    public int a = 0;

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRef(element = ");
        sb.append(this.a);
        sb.append(")@");
        int hashCode = hashCode();
        AbstractC0868ct.k(16);
        String num = Integer.toString(hashCode, 16);
        AbstractC0048Bt.m(num, "toString(this, checkRadix(radix))");
        sb.append(num);
        return sb.toString();
    }
}
