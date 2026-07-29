package o;

import android.content.Context;
import java.math.BigInteger;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class S00 {
    public static final /* synthetic */ S00 a = new S00();
    public static final BU b;
    public static final HO c;

    static {
        UM.a.b(T00.class).g();
        b = EB.D(C2234xd.D);
        c = HO.s;
    }

    public static C1818rJ a(Context context) {
        AbstractC0048Bt.n(context, "context");
        J00 j00 = (J00) b.getValue();
        if (j00 == null) {
            AR ar = AR.c;
            if (AR.c == null) {
                ReentrantLock reentrantLock = AR.d;
                reentrantLock.lock();
                try {
                    if (AR.c == null) {
                        C2288yR c2288yR = null;
                        try {
                            C1177hZ b2 = AbstractC2156wR.b();
                            if (b2 != null) {
                                C1177hZ c1177hZ = C1177hZ.m;
                                AbstractC0048Bt.n(c1177hZ, "other");
                                Object value = b2.l.getValue();
                                AbstractC0048Bt.m(value, "<get-bigInteger>(...)");
                                Object value2 = c1177hZ.l.getValue();
                                AbstractC0048Bt.m(value2, "<get-bigInteger>(...)");
                                if (((BigInteger) value).compareTo((BigInteger) value2) >= 0) {
                                    C2288yR c2288yR2 = new C2288yR(context);
                                    if (c2288yR2.e()) {
                                        c2288yR = c2288yR2;
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        AR.c = new AR(c2288yR);
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            j00 = AR.c;
            AbstractC0048Bt.k(j00);
        }
        int i = C1734q10.b;
        C1818rJ c1818rJ = new C1818rJ(j00);
        c.getClass();
        return c1818rJ;
    }
}
