package o;

import java.util.Arrays;
import java.util.Map;

/* loaded from: classes.dex */
public final class I2 extends AbstractC1596ny implements InterfaceC2114vp {
    public static final I2 A;
    public static final I2 B;
    public static final I2 C;
    public static final I2 D;
    public static final I2 E;
    public static final I2 F;
    public static final I2 G;
    public static final I2 H;
    public static final I2 I;
    public static final I2 J;
    public static final I2 K;
    public static final I2 L;
    public static final I2 i;
    public static final I2 j;
    public static final I2 k;
    public static final I2 l;
    public static final I2 m;
    public static final I2 n;

    /* renamed from: o, reason: collision with root package name */
    public static final I2 f48o;
    public static final I2 p;
    public static final I2 q;
    public static final I2 r;
    public static final I2 s;
    public static final I2 t;
    public static final I2 u;
    public static final I2 v;
    public static final I2 w;
    public static final I2 x;
    public static final I2 y;
    public static final I2 z;
    public final /* synthetic */ int h;

    static {
        int i2 = 1;
        i = new I2(i2, 0);
        j = new I2(i2, 1);
        k = new I2(i2, 2);
        l = new I2(i2, 3);
        m = new I2(i2, 4);
        n = new I2(i2, 5);
        f48o = new I2(i2, 6);
        p = new I2(i2, 7);
        q = new I2(i2, 8);
        r = new I2(i2, 9);
        s = new I2(i2, 10);
        t = new I2(i2, 11);
        u = new I2(i2, 12);
        v = new I2(i2, 13);
        w = new I2(i2, 14);
        x = new I2(i2, 15);
        y = new I2(i2, 16);
        z = new I2(i2, 17);
        A = new I2(i2, 18);
        B = new I2(i2, 19);
        C = new I2(i2, 20);
        D = new I2(i2, 21);
        E = new I2(i2, 22);
        F = new I2(i2, 23);
        G = new I2(i2, 24);
        H = new I2(i2, 25);
        I = new I2(i2, 26);
        J = new I2(i2, 27);
        K = new I2(i2, 28);
        L = new I2(i2, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ I2(int i2, int i3) {
        super(i2);
        this.h = i3;
    }

    @Override // o.InterfaceC2114vp
    public final Object invoke(Object obj) {
        String obj2;
        int i2 = this.h;
        boolean z2 = false;
        C0782bY c0782bY = C0782bY.a;
        switch (i2) {
            case 0:
                return c0782bY;
            case 1:
                return Boolean.TRUE;
            case 2:
                return Boolean.FALSE;
            case 3:
                Map.Entry entry = (Map.Entry) obj;
                AbstractC0048Bt.n(entry, "entry");
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof boolean[]) {
                    obj2 = Arrays.toString((boolean[]) value);
                    AbstractC0048Bt.m(obj2, "toString(this)");
                } else if (value instanceof char[]) {
                    obj2 = Arrays.toString((char[]) value);
                    AbstractC0048Bt.m(obj2, "toString(this)");
                } else if (value instanceof byte[]) {
                    obj2 = Arrays.toString((byte[]) value);
                    AbstractC0048Bt.m(obj2, "toString(this)");
                } else if (value instanceof short[]) {
                    obj2 = Arrays.toString((short[]) value);
                    AbstractC0048Bt.m(obj2, "toString(this)");
                } else if (value instanceof int[]) {
                    obj2 = Arrays.toString((int[]) value);
                    AbstractC0048Bt.m(obj2, "toString(this)");
                } else if (value instanceof float[]) {
                    obj2 = Arrays.toString((float[]) value);
                    AbstractC0048Bt.m(obj2, "toString(this)");
                } else if (value instanceof long[]) {
                    obj2 = Arrays.toString((long[]) value);
                    AbstractC0048Bt.m(obj2, "toString(this)");
                } else if (value instanceof double[]) {
                    obj2 = Arrays.toString((double[]) value);
                    AbstractC0048Bt.m(obj2, "toString(this)");
                } else if (value instanceof Object[]) {
                    obj2 = Arrays.toString((Object[]) value);
                    AbstractC0048Bt.m(obj2, "toString(this)");
                } else {
                    obj2 = value.toString();
                }
                return str + '=' + obj2;
            case 4:
                return c0782bY;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                InterfaceC2204x9 interfaceC2204x9 = (InterfaceC2204x9) obj;
                AbstractC0048Bt.n(interfaceC2204x9, "it");
                int i3 = C0691a9.l;
                return Boolean.valueOf(AbstractC0720ac.j0(WS.f, PX.z(interfaceC2204x9)));
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                InterfaceC2204x9 interfaceC2204x92 = (InterfaceC2204x9) obj;
                AbstractC0048Bt.n(interfaceC2204x92, "it");
                if (interfaceC2204x92 instanceof InterfaceC0381Op) {
                    int i4 = C0691a9.l;
                    if (AbstractC0720ac.j0(WS.f, PX.z(interfaceC2204x92))) {
                        z2 = true;
                    }
                }
                return Boolean.valueOf(z2);
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                Class cls = (Class) obj;
                AbstractC0048Bt.n(cls, "it");
                return new C0740aw(cls);
            case 8:
                Class cls2 = (Class) obj;
                AbstractC0048Bt.n(cls2, "it");
                return new C0259Jw(cls2);
            case 9:
                AbstractC2097vY abstractC2097vY = (AbstractC2097vY) obj;
                AbstractC0048Bt.m(abstractC2097vY, "it");
                return Boolean.valueOf(abstractC2097vY.B0() instanceof InterfaceC1440la);
            case 10:
                AbstractC0048Bt.n((InterfaceC0381Op) obj, "$this$null");
                return null;
            case 11:
                AbstractC0048Bt.n((InterfaceC0381Op) obj, "$this$null");
                return null;
            case 12:
                AbstractC0048Bt.n((InterfaceC0381Op) obj, "$this$null");
                return null;
            case 13:
                InterfaceC2204x9 interfaceC2204x93 = (InterfaceC2204x9) obj;
                AbstractC0048Bt.n(interfaceC2204x93, "it");
                return Boolean.valueOf(EB.y(interfaceC2204x93));
            case 14:
                return Boolean.TRUE;
            case 15:
                InterfaceC1738q4 interfaceC1738q4 = (InterfaceC1738q4) obj;
                AbstractC0048Bt.n(interfaceC1738q4, "it");
                return AbstractC0720ac.i0(interfaceC1738q4);
            case 16:
                return "";
            case 17:
                AbstractC1004ey abstractC1004ey = (AbstractC1004ey) obj;
                AbstractC0048Bt.n(abstractC1004ey, "it");
                return abstractC1004ey;
            case 18:
                AbstractC0048Bt.n((RY) obj, "it");
                return "...";
            case 19:
                AbstractC1004ey abstractC1004ey2 = (AbstractC1004ey) obj;
                AbstractC0048Bt.n(abstractC1004ey2, "it");
                return abstractC1004ey2;
            case 20:
                InterfaceC1118gg interfaceC1118gg = (InterfaceC1118gg) obj;
                AbstractC0048Bt.n(interfaceC1118gg, "it");
                return interfaceC1118gg.n();
            case 21:
                return ((RY) obj).c();
            case 22:
                AbstractC0048Bt.n((C1639ob) obj, "it");
                return 0;
            case 23:
                ((InterfaceC0224In) obj).a();
                return c0782bY;
            case 24:
                int i5 = ((C0146Fn) obj).a;
                return C0353Nn.b;
            case 25:
                int i6 = ((C0146Fn) obj).a;
                return C0353Nn.b;
            case 26:
                return Boolean.TRUE;
            case 27:
                return c0782bY;
            case 28:
                InterfaceC1121gj.t((InterfaceC1121gj) obj, C1114gc.e);
                return c0782bY;
            default:
                AbstractC1004ey abstractC1004ey3 = (AbstractC1004ey) obj;
                AbstractC0048Bt.n(abstractC1004ey3, "it");
                return abstractC1004ey3.toString();
        }
    }
}
