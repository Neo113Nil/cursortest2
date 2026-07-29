package o;

/* loaded from: classes.dex */
public final class QO {
    public final C0582Wi a;
    public final C0582Wi b;
    public final C0582Wi c;
    public final C0582Wi d;

    public QO(C0582Wi c0582Wi, C0582Wi c0582Wi2, C0582Wi c0582Wi3, C0582Wi c0582Wi4) {
        this.a = c0582Wi;
        this.b = c0582Wi2;
        this.c = c0582Wi3;
        this.d = c0582Wi4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QO)) {
            return false;
        }
        QO qo = (QO) obj;
        return AbstractC0048Bt.h(this.a, qo.a) && AbstractC0048Bt.h(this.b, qo.b) && AbstractC0048Bt.h(this.c, qo.c) && AbstractC0048Bt.h(this.d, qo.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.a + ", topEnd = " + this.b + ", bottomEnd = " + this.c + ", bottomStart = " + this.d + ')';
    }
}
