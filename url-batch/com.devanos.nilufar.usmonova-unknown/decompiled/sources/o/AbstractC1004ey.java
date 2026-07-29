package o;

import java.util.List;

/* renamed from: o.ey, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1004ey implements W3, InterfaceC1266iy {
    public int h;

    public abstract OW A0();

    public abstract SW B0();

    public abstract boolean C0();

    public abstract AbstractC1004ey D0(C1398ky c1398ky);

    public abstract AbstractC2097vY E0();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC1004ey)) {
            return false;
        }
        AbstractC1004ey abstractC1004ey = (AbstractC1004ey) obj;
        if (C0() == abstractC1004ey.C0()) {
            return AbstractC1807r8.b0(C1097gL.k, E0(), abstractC1004ey.E0());
        }
        return false;
    }

    @Override // o.W3
    public final InterfaceC1738q4 getAnnotations() {
        return AbstractC1935t4.a(A0());
    }

    public final int hashCode() {
        int hashCode;
        int i = this.h;
        if (i != 0) {
            return i;
        }
        if (AbstractC1473m3.P(this)) {
            hashCode = super.hashCode();
        } else {
            hashCode = (C0() ? 1 : 0) + ((w0().hashCode() + (B0().hashCode() * 31)) * 31);
        }
        this.h = hashCode;
        return hashCode;
    }

    public abstract WB r0();

    public abstract List w0();
}
