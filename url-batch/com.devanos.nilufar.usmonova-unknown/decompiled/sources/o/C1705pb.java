package o;

/* renamed from: o.pb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1705pb {
    public final C1639ob a;
    public final int b;

    public C1705pb(C1639ob c1639ob, int i) {
        this.a = c1639ob;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1705pb)) {
            return false;
        }
        C1705pb c1705pb = (C1705pb) obj;
        return AbstractC0048Bt.h(this.a, c1705pb.a) && this.b == c1705pb.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            i = this.b;
            if (i2 >= i) {
                break;
            }
            sb.append("kotlin/Array<");
            i2++;
        }
        sb.append(this.a);
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(">");
        }
        String sb2 = sb.toString();
        AbstractC0048Bt.m(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
