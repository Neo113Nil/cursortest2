package o;

/* renamed from: o.z3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2330z3 implements InterfaceC1752qI {
    public final int h;

    public C2330z3(int i) {
        this.h = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2330z3) && this.h == ((C2330z3) obj).h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h);
    }

    public final String toString() {
        return "AndroidFontResolveInterceptor(fontWeightAdjustment=" + this.h + ')';
    }
}
