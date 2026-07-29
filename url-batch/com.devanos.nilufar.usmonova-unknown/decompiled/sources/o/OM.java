package o;

/* loaded from: classes.dex */
public final class OM {
    public final Class a;
    public final C0202Hr b;

    public OM(Class cls, C0202Hr c0202Hr) {
        this.a = cls;
        this.b = c0202Hr;
    }

    public final String a() {
        return AbstractC0778bU.y(this.a.getName(), '.', '/').concat(".class");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof OM) {
            return AbstractC0048Bt.h(this.a, ((OM) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return OM.class.getName() + ": " + this.a;
    }
}
