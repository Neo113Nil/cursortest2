package o;

/* loaded from: classes.dex */
public final class E8 implements InterfaceC0844cV {
    public final float h;

    public E8(float f) {
        this.h = f;
    }

    @Override // o.InterfaceC0844cV
    public final float a() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E8)) {
            return false;
        }
        E8 e8 = (E8) obj;
        e8.getClass();
        return Float.compare(this.h, e8.h) == 0;
    }

    @Override // o.InterfaceC0844cV
    public final long f() {
        int i = C1114gc.g;
        return C1114gc.f;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "BrushStyle(value=null, alpha=" + this.h + ')';
    }
}
