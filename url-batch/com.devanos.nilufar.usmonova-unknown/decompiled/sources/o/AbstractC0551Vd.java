package o;

/* renamed from: o.Vd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0551Vd {
    public final Object a;

    public AbstractC0551Vd(Object obj) {
        this.a = obj;
    }

    public abstract AbstractC1004ey a(InterfaceC0761bD interfaceC0761bD);

    public Object b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Object b = b();
        AbstractC0551Vd abstractC0551Vd = obj instanceof AbstractC0551Vd ? (AbstractC0551Vd) obj : null;
        return AbstractC0048Bt.h(b, abstractC0551Vd != null ? abstractC0551Vd.b() : null);
    }

    public final int hashCode() {
        Object b = b();
        if (b != null) {
            return b.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(b());
    }
}
