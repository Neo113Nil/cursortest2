package o;

import java.util.Map;

/* renamed from: o.Ou, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0386Ou {
    public final DN a;
    public final DN b;
    public final Map c = C1384kk.h;
    public final boolean d;

    public C0386Ou(DN dn, DN dn2) {
        this.a = dn;
        this.b = dn2;
        EB.D(new C1139h0(16, this));
        DN dn3 = DN.i;
        this.d = dn == dn3 && dn2 == dn3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0386Ou)) {
            return false;
        }
        C0386Ou c0386Ou = (C0386Ou) obj;
        return this.a == c0386Ou.a && this.b == c0386Ou.b && AbstractC0048Bt.h(this.c, c0386Ou.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        DN dn = this.b;
        return this.c.hashCode() + ((hashCode + (dn == null ? 0 : dn.hashCode())) * 31);
    }

    public final String toString() {
        return "Jsr305Settings(globalLevel=" + this.a + ", migrationLevel=" + this.b + ", userDefinedLevelForSpecificAnnotation=" + this.c + ')';
    }
}
