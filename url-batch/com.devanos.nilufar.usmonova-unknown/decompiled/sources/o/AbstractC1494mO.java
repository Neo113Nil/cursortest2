package o;

import android.view.View;
import com.devanos.nilufar.usmonova.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.mO, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1494mO {
    public static final long a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException(("start cannot be negative. [start: " + i + ", end: " + i2 + ']').toString());
        }
        if (i2 >= 0) {
            long j = (i2 & 4294967295L) | (i << 32);
            int i3 = C1501mV.c;
            return j;
        }
        throw new IllegalArgumentException(("end cannot be negative. [start: " + i + ", end: " + i2 + ']').toString());
    }

    public static final int b(int[] iArr, int i) {
        int length = iArr.length - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (i2 + length) >>> 1;
            int i4 = iArr[i3];
            if (i > i4) {
                i2 = i3 + 1;
            } else {
                if (i >= i4) {
                    return i3;
                }
                length = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final ArrayList c(ArrayList arrayList, List list, InterfaceC0381Op interfaceC0381Op) {
        AbstractC0048Bt.n(list, "oldValueParameters");
        arrayList.size();
        list.size();
        ArrayList O0 = AbstractC0720ac.O0(arrayList, list);
        ArrayList arrayList2 = new ArrayList(AbstractC0786bc.d0(O0));
        Iterator it = O0.iterator();
        while (it.hasNext()) {
            C1619oH c1619oH = (C1619oH) it.next();
            AbstractC1004ey abstractC1004ey = (AbstractC1004ey) c1619oH.h;
            RY ry = (RY) c1619oH.i;
            int i = ry.m;
            InterfaceC1738q4 annotations = ry.getAnnotations();
            C0827cE name = ry.getName();
            AbstractC0048Bt.m(name, "oldParameter.name");
            boolean I0 = ry.I0();
            boolean z = ry.f98o;
            boolean z2 = ry.p;
            AbstractC1004ey f = ry.q != null ? AbstractC0192Hh.j(interfaceC0381Op).l().f(abstractC1004ey) : null;
            IS d = ry.d();
            AbstractC0048Bt.m(d, "oldParameter.source");
            arrayList2.add(new RY(interfaceC0381Op, null, i, annotations, name, abstractC1004ey, I0, z, z2, f, d));
        }
        return arrayList2;
    }

    public static final C1362kO d(Throwable th) {
        AbstractC0048Bt.n(th, "exception");
        return new C1362kO(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final AbstractC1004ey e(AbstractC1004ey abstractC1004ey) {
        AbstractC0048Bt.n(abstractC1004ey, "<this>");
        if (abstractC1004ey instanceof InterfaceC2360zX) {
            return ((InterfaceC2360zX) abstractC1004ey).h();
        }
        return null;
    }

    public static final Object f(C2023uQ c2023uQ, FQ fq) {
        Object obj = c2023uQ.h.get(fq);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public static final C1137gz g(InterfaceC1245ib interfaceC1245ib) {
        InterfaceC1245ib interfaceC1245ib2;
        InterfaceC2364zb c;
        AbstractC0048Bt.n(interfaceC1245ib, "<this>");
        int i = AbstractC0192Hh.a;
        Iterator it = interfaceC1245ib.i().B0().d().iterator();
        while (true) {
            if (!it.hasNext()) {
                interfaceC1245ib2 = null;
                break;
            }
            AbstractC1004ey abstractC1004ey = (AbstractC1004ey) it.next();
            if (!AbstractC0545Ux.x(abstractC1004ey)) {
                c = abstractC1004ey.B0().c();
                if (AbstractC0114Eh.n(c, 1) || AbstractC0114Eh.n(c, 3)) {
                    break;
                }
            }
        }
        AbstractC0048Bt.l(c, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        interfaceC1245ib2 = (InterfaceC1245ib) c;
        if (interfaceC1245ib2 == null) {
            return null;
        }
        WB j0 = interfaceC1245ib2.j0();
        C1137gz c1137gz = j0 instanceof C1137gz ? (C1137gz) j0 : null;
        return c1137gz == null ? g(interfaceC1245ib2) : c1137gz;
    }

    public static final AbstractC2097vY h(AbstractC2097vY abstractC2097vY, AbstractC1004ey abstractC1004ey) {
        AbstractC0048Bt.n(abstractC2097vY, "<this>");
        AbstractC0048Bt.n(abstractC1004ey, "origin");
        return n(abstractC2097vY, e(abstractC1004ey));
    }

    public static String i(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final OW j(OW ow, InterfaceC1738q4 interfaceC1738q4) {
        OW ow2;
        AbstractC0048Bt.n(ow, "<this>");
        if (AbstractC1935t4.a(ow) == interfaceC1738q4) {
            return ow;
        }
        C0234Ix c0234Ix = AbstractC1935t4.b;
        InterfaceC0937dx interfaceC0937dx = AbstractC1935t4.a[0];
        c0234Ix.getClass();
        AbstractC0048Bt.n(interfaceC0937dx, "property");
        C1869s4 c1869s4 = (C1869s4) ow.h.get(c0234Ix.a);
        if (c1869s4 != null) {
            if (!ow.isEmpty()) {
                J6 j6 = ow.h;
                ArrayList arrayList = new ArrayList();
                for (Object obj : j6) {
                    if (!AbstractC0048Bt.h((C1869s4) obj, c1869s4)) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.size() != ow.h.j()) {
                    OW.i.getClass();
                    ow2 = C0208Hx.I0(arrayList);
                    if (ow2 != null) {
                        ow = ow2;
                    }
                }
            }
            ow2 = ow;
            if (ow2 != null) {
            }
        }
        if (interfaceC1738q4.iterator().hasNext() || !interfaceC1738q4.isEmpty()) {
            C1869s4 c1869s42 = new C1869s4(interfaceC1738q4);
            if (ow.h.get(OW.i.P0(UM.a.b(C1869s4.class))) == null) {
                return ow.isEmpty() ? new OW(AbstractC0868ct.J(c1869s42)) : C0208Hx.I0(AbstractC0720ac.B0(AbstractC0720ac.J0(ow), c1869s42));
            }
        }
        return ow;
    }

    public static final void k(View view, MP mp) {
        AbstractC0048Bt.n(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, mp);
    }

    public static final void l(Object obj) {
        if (obj instanceof C1362kO) {
            throw ((C1362kO) obj).h;
        }
    }

    public static final OW m(InterfaceC1738q4 interfaceC1738q4) {
        AbstractC0048Bt.n(interfaceC1738q4, "<this>");
        if (interfaceC1738q4.isEmpty()) {
            OW.i.getClass();
            return OW.j;
        }
        C0208Hx c0208Hx = OW.i;
        List J = AbstractC0868ct.J(new C1869s4(interfaceC1738q4));
        c0208Hx.getClass();
        return C0208Hx.I0(J);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final AbstractC2097vY n(AbstractC2097vY abstractC2097vY, AbstractC1004ey abstractC1004ey) {
        AbstractC0048Bt.n(abstractC2097vY, "<this>");
        if (abstractC2097vY instanceof InterfaceC2360zX) {
            return n(((InterfaceC2360zX) abstractC2097vY).q0(), abstractC1004ey);
        }
        if (abstractC1004ey == null || abstractC1004ey.equals(abstractC2097vY)) {
            return abstractC2097vY;
        }
        if (abstractC2097vY instanceof JR) {
            return new OR((JR) abstractC2097vY, abstractC1004ey);
        }
        if (abstractC2097vY instanceof AbstractC1782qm) {
            return new C1979tm((AbstractC1782qm) abstractC2097vY, abstractC1004ey);
        }
        throw new C0057Cc();
    }
}
