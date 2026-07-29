package o;

/* renamed from: o.wF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2144wF {
    public final EnumC2078vF a;
    public final boolean b;

    public C2144wF(EnumC2078vF enumC2078vF) {
        this.a = enumC2078vF;
        this.b = false;
    }

    public static C2144wF a(C2144wF c2144wF, EnumC2078vF enumC2078vF, boolean z, int i) {
        if ((i & 1) != 0) {
            enumC2078vF = c2144wF.a;
        }
        if ((i & 2) != 0) {
            z = c2144wF.b;
        }
        c2144wF.getClass();
        AbstractC0048Bt.n(enumC2078vF, "qualifier");
        return new C2144wF(enumC2078vF, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2144wF)) {
            return false;
        }
        C2144wF c2144wF = (C2144wF) obj;
        return this.a == c2144wF.a && this.b == c2144wF.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        boolean z = this.b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        return "NullabilityQualifierWithMigrationStatus(qualifier=" + this.a + ", isForWarningOnly=" + this.b + ')';
    }

    public C2144wF(EnumC2078vF enumC2078vF, boolean z) {
        this.a = enumC2078vF;
        this.b = z;
    }
}
