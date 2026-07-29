package o;

/* renamed from: o.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1599o0 {
    public final String a;
    public final InterfaceC0174Gp b;

    public C1599o0(String str, InterfaceC0174Gp interfaceC0174Gp) {
        this.a = str;
        this.b = interfaceC0174Gp;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1599o0)) {
            return false;
        }
        C1599o0 c1599o0 = (C1599o0) obj;
        return AbstractC0048Bt.h(this.a, c1599o0.a) && AbstractC0048Bt.h(this.b, c1599o0.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        InterfaceC0174Gp interfaceC0174Gp = this.b;
        return hashCode + (interfaceC0174Gp != null ? interfaceC0174Gp.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.a + ", action=" + this.b + ')';
    }
}
