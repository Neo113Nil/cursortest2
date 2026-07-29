package o;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes.dex */
public abstract class TM {
    public static final int A(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((C1471m2) arrayList.get(i4)).a;
            if (i5 < 0) {
                i5 += i2;
            }
            int t = AbstractC0048Bt.t(i5, i);
            if (t < 0) {
                i3 = i4 + 1;
            } else {
                if (t <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final void B(Object obj, InterfaceC1377kd interfaceC1377kd, InterfaceC2312yp interfaceC2312yp) {
        C1575nd c1575nd = (C1575nd) interfaceC1377kd;
        if (c1575nd.L || !AbstractC0048Bt.h(c1575nd.C(), obj)) {
            c1575nd.P(obj);
            c1575nd.b(obj, interfaceC2312yp);
        }
    }

    public static void C(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            AbstractC1174hW.a(view, charSequence);
            return;
        }
        ViewOnLongClickListenerC1304jW viewOnLongClickListenerC1304jW = ViewOnLongClickListenerC1304jW.r;
        if (viewOnLongClickListenerC1304jW != null && viewOnLongClickListenerC1304jW.h == view) {
            ViewOnLongClickListenerC1304jW.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new ViewOnLongClickListenerC1304jW(view, charSequence);
            return;
        }
        ViewOnLongClickListenerC1304jW viewOnLongClickListenerC1304jW2 = ViewOnLongClickListenerC1304jW.s;
        if (viewOnLongClickListenerC1304jW2 != null && viewOnLongClickListenerC1304jW2.h == view) {
            viewOnLongClickListenerC1304jW2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public static void D(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + z(parcel, i));
    }

    public static int E(Parcel parcel) {
        int readInt = parcel.readInt();
        int z = z(parcel, readInt);
        char c = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c != 20293) {
            throw new C0057Cc("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
        }
        int i = z + dataPosition;
        if (i < dataPosition || i > parcel.dataSize()) {
            throw new C0057Cc(AbstractC1888sN.g(dataPosition, i, "Size read is invalid start=", " end="), parcel);
        }
        return i;
    }

    public static final JR F(JR jr, JR jr2) {
        AbstractC0048Bt.n(jr, "<this>");
        AbstractC0048Bt.n(jr2, "abbreviatedType");
        return AbstractC1473m3.P(jr) ? jr : new C0875d(jr, jr2);
    }

    public static void G(Parcel parcel, int i, int i2) {
        int z = z(parcel, i);
        if (z == i2) {
            return;
        }
        String hexString = Integer.toHexString(z);
        StringBuilder sb = new StringBuilder("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(z);
        sb.append(" (0x");
        throw new C0057Cc(AbstractC1888sN.l(sb, hexString, ")"), parcel);
    }

    public static final boolean a(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 67108864) != 0;
    }

    public static final int b(int[] iArr, int i) {
        return iArr[(i * 5) + 4];
    }

    public static final int c(int[] iArr, int i) {
        return iArr[(i * 5) + 3];
    }

    public static final boolean d(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 268435456) != 0;
    }

    public static final boolean e(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 536870912) != 0;
    }

    public static final boolean f(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 1073741824) != 0;
    }

    public static final int g(ArrayList arrayList, int i, int i2) {
        int A = A(arrayList, i, i2);
        return A >= 0 ? A : -(A + 1);
    }

    public static final int h(int[] iArr, int i) {
        return iArr[(i * 5) + 1] & 67108863;
    }

    public static final int i(int[] iArr, int i) {
        return iArr[(i * 5) + 2];
    }

    public static final int j(int[] iArr, int i) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 4];
        int i4 = 1;
        switch (iArr[i2 + 1] >> 28) {
            case 0:
                i4 = 0;
                break;
            case 1:
            case 2:
            case 4:
                break;
            case 3:
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                i4 = 2;
                break;
            default:
                i4 = 3;
                break;
        }
        return i4 + i3;
    }

    public static final void k(int i, int i2, int[] iArr) {
        EB.T(i2 >= 0);
        iArr[(i * 5) + 3] = i2;
    }

    public static final void l(int i, int i2, int[] iArr) {
        EB.T(i2 >= 0 && i2 < 67108863);
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }

    public static final C0950e6 m(JR jr, InterfaceC0004Ab interfaceC0004Ab, int i) {
        if (interfaceC0004Ab == null || C0273Kk.f(interfaceC0004Ab)) {
            return null;
        }
        int size = interfaceC0004Ab.p().size() + i;
        if (interfaceC0004Ab.k()) {
            List subList = jr.w0().subList(i, size);
            InterfaceC1118gg n = interfaceC0004Ab.n();
            return new C0950e6(interfaceC0004Ab, subList, m(jr, n instanceof InterfaceC0004Ab ? (InterfaceC0004Ab) n : null, size));
        }
        if (size != jr.w0().size()) {
            AbstractC0114Eh.o(interfaceC0004Ab);
        }
        return new C0950e6(interfaceC0004Ab, jr.w0().subList(i, jr.w0().size()), (C0950e6) null);
    }

    public static final List n(InterfaceC0004Ab interfaceC0004Ab) {
        List list;
        Object obj;
        SW z;
        List p = interfaceC0004Ab.p();
        AbstractC0048Bt.m(p, "declaredTypeParameters");
        if (!interfaceC0004Ab.k() && !(interfaceC0004Ab.n() instanceof InterfaceC2072v9)) {
            return p;
        }
        int i = AbstractC0192Hh.a;
        I2 i2 = I2.C;
        List B = PQ.B(new C1716pm(new C0730am(new T6(4, PQ.u(PQ.x(interfaceC0004Ab, i2), 1)), true, RP.H), RP.I, SQ.j));
        Iterator it = PQ.u(PQ.x(interfaceC0004Ab, i2), 1).iterator();
        while (true) {
            list = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (obj instanceof InterfaceC1245ib) {
                break;
            }
        }
        InterfaceC1245ib interfaceC1245ib = (InterfaceC1245ib) obj;
        if (interfaceC1245ib != null && (z = interfaceC1245ib.z()) != null) {
            list = z.getParameters();
        }
        if (list == null) {
            list = C1318jk.h;
        }
        if (B.isEmpty() && list.isEmpty()) {
            List p2 = interfaceC0004Ab.p();
            AbstractC0048Bt.m(p2, "declaredTypeParameters");
            return p2;
        }
        ArrayList A0 = AbstractC0720ac.A0(B, list);
        ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(A0));
        Iterator it2 = A0.iterator();
        while (it2.hasNext()) {
            InterfaceC1437lX interfaceC1437lX = (InterfaceC1437lX) it2.next();
            AbstractC0048Bt.m(interfaceC1437lX, "it");
            arrayList.add(new C1704pa(interfaceC1437lX, interfaceC0004Ab, p.size()));
        }
        return AbstractC0720ac.A0(p, arrayList);
    }

    public static Bundle o(Parcel parcel, int i) {
        int z = z(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (z == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + z);
        return readBundle;
    }

    public static Parcelable p(Parcel parcel, int i, Parcelable.Creator creator) {
        int z = z(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (z == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + z);
        return parcelable;
    }

    public static String q(Parcel parcel, int i) {
        int z = z(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (z == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + z);
        return readString;
    }

    public static Object[] r(Parcel parcel, int i, Parcelable.Creator creator) {
        int z = z(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (z == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + z);
        return createTypedArray;
    }

    public static void s(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new C0057Cc(AbstractC2188wx.g(i, "Overread allowed size end="), parcel);
        }
    }

    public static M1 t(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new M1(BZ.a(view));
        }
        return null;
    }

    public static RM u(InterfaceC2204x9 interfaceC2204x9, InterfaceC1455lp interfaceC1455lp) {
        if (interfaceC1455lp != null) {
            return new RM(interfaceC2204x9, interfaceC1455lp);
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties", "lazySoft"));
    }

    public static final AbstractC2097vY v(AbstractC2097vY abstractC2097vY, boolean z) {
        AbstractC0048Bt.n(abstractC2097vY, "<this>");
        C0632Yg p = C1623oL.p(abstractC2097vY, z);
        if (p != null) {
            return p;
        }
        JR w = w(abstractC2097vY);
        return w != null ? w : abstractC2097vY.F0(false);
    }

    public static final JR w(AbstractC2097vY abstractC2097vY) {
        C2382zt c2382zt;
        SW B0 = abstractC2097vY.B0();
        C2382zt c2382zt2 = B0 instanceof C2382zt ? (C2382zt) B0 : null;
        if (c2382zt2 != null) {
            LinkedHashSet<AbstractC1004ey> linkedHashSet = c2382zt2.b;
            ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(linkedHashSet));
            boolean z = false;
            for (AbstractC1004ey abstractC1004ey : linkedHashSet) {
                if (AbstractC2228xX.e(abstractC1004ey)) {
                    abstractC1004ey = v(abstractC1004ey.E0(), false);
                    z = true;
                }
                arrayList.add(abstractC1004ey);
            }
            if (z) {
                AbstractC1004ey abstractC1004ey2 = c2382zt2.a;
                if (abstractC1004ey2 == null) {
                    abstractC1004ey2 = null;
                } else if (AbstractC2228xX.e(abstractC1004ey2)) {
                    abstractC1004ey2 = v(abstractC1004ey2.E0(), false);
                }
                arrayList.isEmpty();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList);
                linkedHashSet2.hashCode();
                c2382zt = new C2382zt(linkedHashSet2);
                c2382zt.a = abstractC1004ey2;
            } else {
                c2382zt = null;
            }
            if (c2382zt != null) {
                return c2382zt.e();
            }
        }
        return null;
    }

    public static boolean x(Parcel parcel, int i) {
        G(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static int y(Parcel parcel, int i) {
        G(parcel, i, 4);
        return parcel.readInt();
    }

    public static int z(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }
}
