package o;

import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class SP extends AbstractC1596ny implements InterfaceC2312yp {
    public static final SP i;
    public static final SP j;
    public static final SP k;
    public static final SP l;
    public static final SP m;
    public static final SP n;

    /* renamed from: o, reason: collision with root package name */
    public static final SP f106o;
    public static final SP p;
    public static final SP q;
    public static final SP r;
    public static final SP s;
    public static final SP t;
    public static final SP u;
    public static final SP v;
    public static final SP w;
    public static final SP x;
    public final /* synthetic */ int h;

    static {
        int i2 = 2;
        i = new SP(i2, 0);
        j = new SP(i2, 1);
        k = new SP(i2, 2);
        l = new SP(i2, 3);
        m = new SP(i2, 4);
        n = new SP(i2, 5);
        f106o = new SP(i2, 6);
        p = new SP(i2, 7);
        q = new SP(i2, 8);
        r = new SP(i2, 9);
        s = new SP(i2, 10);
        t = new SP(i2, 11);
        u = new SP(i2, 12);
        v = new SP(i2, 13);
        w = new SP(i2, 14);
        x = new SP(i2, 15);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SP(int i2, int i3) {
        super(i2);
        this.h = i3;
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        String str;
        InterfaceC0174Gp interfaceC0174Gp;
        switch (this.h) {
            case 0:
                if (obj != null) {
                    throw new ClassCastException();
                }
                C1435lV c1435lV = (C1435lV) obj2;
                LS ls = c1435lV.a;
                C1818rJ c1818rJ = TP.h;
                return AbstractC0868ct.f(TP.a(ls, c1818rJ), TP.a(c1435lV.b, c1818rJ), TP.a(c1435lV.c, c1818rJ), TP.a(c1435lV.d, c1818rJ));
            case 1:
                if (obj != null) {
                    throw new ClassCastException();
                }
                long j2 = ((C1501mV) obj2).a;
                int i2 = C1501mV.c;
                Integer valueOf = Integer.valueOf((int) (j2 >> 32));
                C1818rJ c1818rJ2 = TP.a;
                return AbstractC0868ct.f(valueOf, Integer.valueOf((int) (j2 & 4294967295L)));
            case 2:
                if (obj != null) {
                    throw new ClassCastException();
                }
                long j3 = ((C1830rV) obj2).a;
                if (C1830rV.a(j3, C1830rV.c)) {
                    return Boolean.FALSE;
                }
                Float valueOf2 = Float.valueOf(C1830rV.c(j3));
                C1818rJ c1818rJ3 = TP.a;
                return AbstractC0868ct.f(valueOf2, new C1896sV(C1830rV.b(j3)));
            case 3:
                if (obj != null) {
                    throw new ClassCastException();
                }
                String str2 = ((BY) obj2).a;
                C1818rJ c1818rJ4 = TP.a;
                return str2;
            case 4:
                if (obj != null) {
                    throw new ClassCastException();
                }
                String str3 = ((C1111gZ) obj2).a;
                C1818rJ c1818rJ5 = TP.a;
                return str3;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list == null) {
                    return list2;
                }
                ArrayList K0 = AbstractC0720ac.K0(list);
                K0.addAll(list2);
                return K0;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                return (C0782bY) obj;
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 8:
                throw null;
            case 9:
                return (String) obj;
            case 10:
                List list3 = (List) obj;
                List list4 = (List) obj2;
                if (list3 == null) {
                    return list4;
                }
                ArrayList K02 = AbstractC0720ac.K0(list3);
                K02.addAll(list4);
                return K02;
            case 11:
                Float f = (Float) obj;
                ((Number) obj2).floatValue();
                return f;
            case 12:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
            case 13:
                C1599o0 c1599o0 = (C1599o0) obj;
                C1599o0 c1599o02 = (C1599o0) obj2;
                if (c1599o0 == null || (str = c1599o0.a) == null) {
                    str = c1599o02.a;
                }
                if (c1599o0 == null || (interfaceC0174Gp = c1599o0.b) == null) {
                    interfaceC0174Gp = c1599o02.b;
                }
                return new C1599o0(str, interfaceC0174Gp);
            case 14:
                return obj == null ? obj2 : obj;
            case 15:
                ((Matrix) obj2).set(((View) obj).getMatrix());
                return C0782bY.a;
            default:
                return ((UC) obj).c((SC) obj2);
        }
    }
}
