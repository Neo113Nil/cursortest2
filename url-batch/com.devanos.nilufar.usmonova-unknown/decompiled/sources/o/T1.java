package o;

import android.os.Looper;
import android.view.Choreographer;
import java.util.ServiceLoader;

/* loaded from: classes.dex */
public final class T1 extends AbstractC1596ny implements InterfaceC1455lp {
    public static final T1 A;
    public static final T1 B;
    public static final T1 C;
    public static final T1 D;
    public static final T1 E;
    public static final T1 F;
    public static final T1 G;
    public static final T1 H;
    public static final T1 I;
    public static final T1 J;
    public static final T1 K;
    public static final T1 L;
    public static final T1 i;
    public static final T1 j;
    public static final T1 k;
    public static final T1 l;
    public static final T1 m;
    public static final T1 n;

    /* renamed from: o, reason: collision with root package name */
    public static final T1 f109o;
    public static final T1 p;
    public static final T1 q;
    public static final T1 r;
    public static final T1 s;
    public static final T1 t;
    public static final T1 u;
    public static final T1 v;
    public static final T1 w;
    public static final T1 x;
    public static final T1 y;
    public static final T1 z;
    public final /* synthetic */ int h;

    static {
        int i2 = 0;
        i = new T1(i2, 0);
        j = new T1(i2, 1);
        k = new T1(i2, 2);
        l = new T1(i2, 3);
        m = new T1(i2, 4);
        n = new T1(i2, 5);
        f109o = new T1(i2, 6);
        p = new T1(i2, 7);
        q = new T1(i2, 8);
        r = new T1(i2, 9);
        s = new T1(i2, 10);
        t = new T1(i2, 11);
        u = new T1(i2, 12);
        v = new T1(i2, 13);
        w = new T1(i2, 14);
        x = new T1(i2, 15);
        y = new T1(i2, 16);
        z = new T1(i2, 17);
        A = new T1(i2, 18);
        B = new T1(i2, 19);
        C = new T1(i2, 20);
        D = new T1(i2, 21);
        E = new T1(i2, 22);
        F = new T1(i2, 23);
        G = new T1(i2, 24);
        H = new T1(i2, 25);
        I = new T1(i2, 26);
        J = new T1(i2, 27);
        K = new T1(i2, 28);
        L = new T1(i2, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ T1(int i2, int i3) {
        super(i2);
        this.h = i3;
    }

    @Override // o.InterfaceC1455lp
    public final Object invoke() {
        Choreographer choreographer;
        switch (this.h) {
            case 0:
                return Integer.valueOf(AbstractC1952tL.a.a(2147418112) + 65536);
            case 1:
                return Looper.getMainLooper() != null ? C1907sg.h : C1562nQ.h;
            case 2:
                AbstractC1934t3.b("LocalConfiguration");
                throw null;
            case 3:
                AbstractC1934t3.b("LocalContext");
                throw null;
            case 4:
                AbstractC1934t3.b("LocalImageVectorCache");
                throw null;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                AbstractC1934t3.b("LocalResourceIdCache");
                throw null;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                AbstractC1934t3.b("LocalSavedStateRegistryOwner");
                throw null;
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                AbstractC1934t3.b("LocalView");
                throw null;
            case 8:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    C0191Hg c0191Hg = AbstractC0115Ei.a;
                    choreographer = (Choreographer) AbstractC0868ct.S(AbstractC1810rB.a, new K3(2, null));
                }
                N3 n3 = new N3(choreographer, AbstractC0868ct.m(Looper.getMainLooper()));
                return PX.E0(n3, n3.s);
            case 9:
                ServiceLoader load = ServiceLoader.load(T8.class, T8.class.getClassLoader());
                AbstractC0048Bt.m(load, "implementations");
                T8 t8 = (T8) AbstractC0720ac.o0(load);
                if (t8 != null) {
                    return t8;
                }
                throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
            case 10:
                IT it = AbstractC1442lc.a;
                long j2 = AbstractC1246ic.t;
                return new C1376kc(j2, AbstractC1246ic.j, AbstractC1246ic.u, AbstractC1246ic.k, AbstractC1246ic.e, AbstractC1246ic.w, AbstractC1246ic.l, AbstractC1246ic.x, AbstractC1246ic.m, AbstractC1246ic.H, AbstractC1246ic.p, AbstractC1246ic.I, AbstractC1246ic.q, AbstractC1246ic.a, AbstractC1246ic.g, AbstractC1246ic.y, AbstractC1246ic.n, AbstractC1246ic.G, AbstractC1246ic.f178o, j2, AbstractC1246ic.f, AbstractC1246ic.d, AbstractC1246ic.b, AbstractC1246ic.h, AbstractC1246ic.c, AbstractC1246ic.i, AbstractC1246ic.r, AbstractC1246ic.s, AbstractC1246ic.v, AbstractC1246ic.z, AbstractC1246ic.F, AbstractC1246ic.A, AbstractC1246ic.B, AbstractC1246ic.C, AbstractC1246ic.D, AbstractC1246ic.E);
            case 11:
                return Boolean.TRUE;
            case 12:
            case 13:
                return null;
            case 14:
                AbstractC2300yd.b("LocalAutofillTree");
                throw null;
            case 15:
                AbstractC2300yd.b("LocalClipboardManager");
                throw null;
            case 16:
                AbstractC2300yd.b("LocalDensity");
                throw null;
            case 17:
                AbstractC2300yd.b("LocalFocusManager");
                throw null;
            case 18:
                AbstractC2300yd.b("LocalFontFamilyResolver");
                throw null;
            case 19:
                AbstractC2300yd.b("LocalFontLoader");
                throw null;
            case 20:
                AbstractC2300yd.b("LocalGraphicsContext");
                throw null;
            case 21:
                AbstractC2300yd.b("LocalHapticFeedback");
                throw null;
            case 22:
                AbstractC2300yd.b("LocalInputManager");
                throw null;
            case 23:
                AbstractC2300yd.b("LocalLayoutDirection");
                throw null;
            case 24:
                return null;
            case 25:
                return Boolean.FALSE;
            case 26:
            case 27:
                return null;
            case 28:
                AbstractC2300yd.b("LocalTextToolbar");
                throw null;
            default:
                AbstractC2300yd.b("LocalUriHandler");
                throw null;
        }
    }
}
