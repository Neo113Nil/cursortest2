package o;

import com.google.firebase.messaging.ServiceStarter;

/* renamed from: o.no, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1586no implements Comparable {
    public static final C1586no i;
    public static final C1586no j;
    public static final C1586no k;
    public final int h;

    static {
        C1586no c1586no = new C1586no(100);
        C1586no c1586no2 = new C1586no(200);
        C1586no c1586no3 = new C1586no(300);
        C1586no c1586no4 = new C1586no(400);
        C1586no c1586no5 = new C1586no(ServiceStarter.ERROR_UNKNOWN);
        C1586no c1586no6 = new C1586no(600);
        i = c1586no6;
        C1586no c1586no7 = new C1586no(700);
        C1586no c1586no8 = new C1586no(800);
        C1586no c1586no9 = new C1586no(900);
        j = c1586no4;
        k = c1586no5;
        AbstractC0868ct.K(c1586no, c1586no2, c1586no3, c1586no4, c1586no5, c1586no6, c1586no7, c1586no8, c1586no9);
    }

    public C1586no(int i2) {
        this.h = i2;
        if (1 > i2 || i2 >= 1001) {
            throw new IllegalArgumentException(AbstractC2188wx.g(i2, "Font weight can be in range [1, 1000]. Current value: ").toString());
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return AbstractC0048Bt.t(this.h, ((C1586no) obj).h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1586no) {
            return this.h == ((C1586no) obj).h;
        }
        return false;
    }

    public final int hashCode() {
        return this.h;
    }

    public final String toString() {
        return "FontWeight(weight=" + this.h + ')';
    }
}
