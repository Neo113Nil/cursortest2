package o;

/* renamed from: o.iH, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1225iH implements InterfaceC0916db {
    public final Class h;

    public C1225iH(Class cls, String str) {
        AbstractC0048Bt.n(cls, "jClass");
        this.h = cls;
    }

    @Override // o.InterfaceC0916db
    public final Class e() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1225iH) {
            return AbstractC0048Bt.h(this.h, ((C1225iH) obj).h);
        }
        return false;
    }

    public final int hashCode() {
        return this.h.hashCode();
    }

    public final String toString() {
        return this.h.toString() + " (Kotlin reflection is not available)";
    }
}
