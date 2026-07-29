package o;

/* renamed from: o.dR, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0906dR {
    public final QO a;
    public final QO b;
    public final QO c;
    public final QO d;
    public final QO e;

    public C0906dR() {
        QO qo = AbstractC0775bR.a;
        QO qo2 = AbstractC0775bR.b;
        QO qo3 = AbstractC0775bR.c;
        QO qo4 = AbstractC0775bR.d;
        QO qo5 = AbstractC0775bR.e;
        this.a = qo;
        this.b = qo2;
        this.c = qo3;
        this.d = qo4;
        this.e = qo5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0906dR)) {
            return false;
        }
        C0906dR c0906dR = (C0906dR) obj;
        return AbstractC0048Bt.h(this.a, c0906dR.a) && AbstractC0048Bt.h(this.b, c0906dR.b) && AbstractC0048Bt.h(this.c, c0906dR.c) && AbstractC0048Bt.h(this.d, c0906dR.d) && AbstractC0048Bt.h(this.e, c0906dR.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.a + ", small=" + this.b + ", medium=" + this.c + ", large=" + this.d + ", extraLarge=" + this.e + ')';
    }
}
