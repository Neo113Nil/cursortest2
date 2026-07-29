package o;

/* loaded from: classes.dex */
public final class A7 extends AbstractC1879sE {
    public final EnumC1813rE a;
    public final EnumC1748qE b;

    public A7(EnumC1813rE enumC1813rE, EnumC1748qE enumC1748qE) {
        this.a = enumC1813rE;
        this.b = enumC1748qE;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1879sE) {
            AbstractC1879sE abstractC1879sE = (AbstractC1879sE) obj;
            EnumC1813rE enumC1813rE = this.a;
            if (enumC1813rE != null ? enumC1813rE.equals(((A7) abstractC1879sE).a) : ((A7) abstractC1879sE).a == null) {
                EnumC1748qE enumC1748qE = this.b;
                if (enumC1748qE != null ? enumC1748qE.equals(((A7) abstractC1879sE).b) : ((A7) abstractC1879sE).b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        EnumC1813rE enumC1813rE = this.a;
        int hashCode = ((enumC1813rE == null ? 0 : enumC1813rE.hashCode()) ^ 1000003) * 1000003;
        EnumC1748qE enumC1748qE = this.b;
        return (enumC1748qE != null ? enumC1748qE.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }
}
