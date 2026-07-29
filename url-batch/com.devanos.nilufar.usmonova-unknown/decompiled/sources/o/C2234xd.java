package o;

import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;

/* renamed from: o.xd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2234xd extends AbstractC1596ny implements InterfaceC1455lp {
    public static final C2234xd A;
    public static final C2234xd B;
    public static final C2234xd C;
    public static final C2234xd D;
    public static final C2234xd i;
    public static final C2234xd j;
    public static final C2234xd k;
    public static final C2234xd l;
    public static final C2234xd m;
    public static final C2234xd n;

    /* renamed from: o, reason: collision with root package name */
    public static final C2234xd f242o;
    public static final C2234xd p;
    public static final C2234xd q;
    public static final C2234xd r;
    public static final C2234xd s;
    public static final C2234xd t;
    public static final C2234xd u;
    public static final C2234xd v;
    public static final C2234xd w;
    public static final C2234xd x;
    public static final C2234xd y;
    public static final C2234xd z;
    public final /* synthetic */ int h;

    static {
        int i2 = 0;
        i = new C2234xd(i2, 0);
        j = new C2234xd(i2, 1);
        k = new C2234xd(i2, 2);
        l = new C2234xd(i2, 3);
        m = new C2234xd(i2, 4);
        n = new C2234xd(i2, 5);
        f242o = new C2234xd(i2, 6);
        p = new C2234xd(i2, 7);
        q = new C2234xd(i2, 8);
        r = new C2234xd(i2, 9);
        s = new C2234xd(i2, 10);
        t = new C2234xd(i2, 11);
        u = new C2234xd(i2, 12);
        v = new C2234xd(i2, 13);
        w = new C2234xd(i2, 14);
        x = new C2234xd(i2, 15);
        y = new C2234xd(i2, 16);
        z = new C2234xd(i2, 17);
        A = new C2234xd(i2, 18);
        B = new C2234xd(i2, 19);
        C = new C2234xd(i2, 20);
        D = new C2234xd(i2, 21);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2234xd(int i2, int i3) {
        super(i2);
        this.h = i3;
    }

    @Override // o.InterfaceC1455lp
    public final Object invoke() {
        WindowLayoutComponent a;
        switch (this.h) {
            case 0:
                AbstractC2300yd.b("LocalViewConfiguration");
                throw null;
            case 1:
                AbstractC2300yd.b("LocalWindowInfo");
                throw null;
            case 2:
                return new LinkedHashMap();
            case 3:
                return C1318jk.h;
            case 4:
                return Boolean.FALSE;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                return C0782bY.a;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                return HO.p;
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                return null;
            case 8:
                return EB.F(new C1619oH(AbstractC0463Rt.a, new ST("Deprecated in Java")));
            case 9:
                return Object.class;
            case 10:
                return new C0027Ay(3);
            case 11:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 12:
                return Boolean.FALSE;
            case 13:
                return new C2351zO();
            case 14:
                return Boolean.FALSE;
            case 15:
                return HO.f44o;
            case 16:
                return null;
            case 17:
                return new C0906dR();
            case 18:
                return TX.a;
            case 19:
                return AbstractC1633oV.b;
            case 20:
                return new QX();
            case 21:
                try {
                    ClassLoader classLoader = T00.class.getClassLoader();
                    AP ap = classLoader != null ? new AP(classLoader, new C0853ce(classLoader)) : null;
                    if (ap == null || (a = ap.a()) == null) {
                        return null;
                    }
                    AbstractC0048Bt.m(classLoader, "loader");
                    C0853ce c0853ce = new C0853ce(classLoader);
                    int a2 = AbstractC2176wl.a();
                    return a2 >= 2 ? new C2110vl(a) : a2 == 1 ? new C2044ul(a, c0853ce) : new C1912sl();
                } catch (Throwable unused) {
                    S00 s00 = S00.a;
                    return null;
                }
            default:
                throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2234xd(C1591nt c1591nt) {
        super(0);
        this.h = 22;
    }
}
