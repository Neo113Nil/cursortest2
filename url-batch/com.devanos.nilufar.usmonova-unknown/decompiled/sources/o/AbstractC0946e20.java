package o;

import android.graphics.Paint;
import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import com.devanos.nilufar.usmonova.R;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Logger;

/* renamed from: o.e20, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0946e20 {
    public static final int[] a = new int[0];
    public static final Object[] b = new Object[0];
    public static final C0457Rn c = new C0457Rn("REMOVED_TASK", 5);
    public static final C0457Rn d = new C0457Rn("CLOSED_EMPTY", 5);
    public static final Object e = new Object();
    public static final C0457Rn f = new C0457Rn("ResolutionAnchorProvider", 4);
    public static final FV g = new FV(0, new long[0], new Object[0]);

    public static final boolean A(AbstractC1004ey abstractC1004ey) {
        AbstractC0048Bt.n(abstractC1004ey, "<this>");
        InterfaceC2364zb c2 = abstractC1004ey.B0().c();
        if (c2 == null) {
            return false;
        }
        EnumC0304Lp v = v(c2);
        return v == EnumC0304Lp.k || v == EnumC0304Lp.l;
    }

    public static final boolean B(AbstractC1004ey abstractC1004ey) {
        AbstractC0048Bt.n(abstractC1004ey, "<this>");
        InterfaceC2364zb c2 = abstractC1004ey.B0().c();
        return (c2 != null ? v(c2) : null) == EnumC0304Lp.l;
    }

    public static final MK C(MK mk, C0695aD c0695aD) {
        AbstractC0048Bt.n(mk, "<this>");
        int i = mk.j;
        if ((i & 256) == 256) {
            return mk.t;
        }
        if ((i & 512) == 512) {
            return c0695aD.a(mk.u);
        }
        return null;
    }

    public static final boolean D(String str) {
        AbstractC0048Bt.n(str, "method");
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static final MK E(C2017uK c2017uK, C0695aD c0695aD) {
        AbstractC0048Bt.n(c2017uK, "<this>");
        AbstractC0048Bt.n(c0695aD, "typeTable");
        int i = c2017uK.j;
        if ((i & 32) == 32) {
            return c2017uK.q;
        }
        if ((i & 64) == 64) {
            return c0695aD.a(c2017uK.r);
        }
        return null;
    }

    public static final C0721ad F(int i, InterfaceC2312yp interfaceC2312yp, InterfaceC1377kd interfaceC1377kd) {
        C1575nd c1575nd = (C1575nd) interfaceC1377kd;
        Object C = c1575nd.C();
        if (C == C1311jd.a) {
            C = new C0721ad(i, true, interfaceC2312yp);
            c1575nd.P(C);
        }
        C0721ad c0721ad = (C0721ad) C;
        if (!c0721ad.j.equals(interfaceC2312yp)) {
            c0721ad.j = interfaceC2312yp;
            if (c0721ad.i) {
                WL wl = c0721ad.k;
                if (wl != null) {
                    C2036ud c2036ud = wl.b;
                    if (c2036ud != null) {
                        c2036ud.m(wl, null);
                    }
                    c0721ad.k = null;
                }
                ArrayList arrayList = c0721ad.l;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        WL wl2 = (WL) arrayList.get(i2);
                        C2036ud c2036ud2 = wl2.b;
                        if (c2036ud2 != null) {
                            c2036ud2.m(wl2, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        return c0721ad;
    }

    public static final boolean G(WL wl, WL wl2) {
        if (wl == null) {
            return true;
        }
        if (wl instanceof WL) {
            return !wl.b() || wl.equals(wl2) || AbstractC0048Bt.h(wl.c, wl2.c);
        }
        return false;
    }

    public static final boolean H(View view, Integer num, Rect rect) {
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !view.hasFocus()) {
            return view.requestFocus(num.intValue(), rect);
        }
        if (view instanceof S2) {
            return view.requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return findNextFocusFromRect != null ? findNextFocusFromRect.requestFocus(num.intValue(), rect) : view.requestFocus(num.intValue(), rect);
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, view.hasFocus() ? view.findFocus() : null, num.intValue());
        return findNextFocus != null ? findNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }

    public static final ME I(InterfaceC0725ah interfaceC0725ah, int i) {
        ME me = ((TC) interfaceC0725ah).b.h;
        AbstractC0048Bt.k(me);
        if (me.h0() != interfaceC0725ah || !NE.d(i)) {
            return me;
        }
        ME me2 = me.m;
        AbstractC0048Bt.k(me2);
        return me2;
    }

    public static final C0027Ay J(InterfaceC0725ah interfaceC0725ah) {
        ME me = ((TC) interfaceC0725ah).b.h;
        if (me != null) {
            return me.l;
        }
        AbstractC0868ct.X("Cannot obtain node coordinator. Is the Modifier.Node attached?");
        throw null;
    }

    public static final ZG K(InterfaceC0725ah interfaceC0725ah) {
        ZG zg = J(interfaceC0725ah).j;
        if (zg != null) {
            return zg;
        }
        AbstractC0868ct.X("This node does not have an owner.");
        throw null;
    }

    public static final MK L(C2017uK c2017uK, C0695aD c0695aD) {
        AbstractC0048Bt.n(c2017uK, "<this>");
        AbstractC0048Bt.n(c0695aD, "typeTable");
        int i = c2017uK.j;
        if ((i & 8) == 8) {
            MK mk = c2017uK.n;
            AbstractC0048Bt.m(mk, "returnType");
            return mk;
        }
        if ((i & 16) == 16) {
            return c0695aD.a(c2017uK.f229o);
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Function");
    }

    public static final MK M(CK ck, C0695aD c0695aD) {
        AbstractC0048Bt.n(ck, "<this>");
        AbstractC0048Bt.n(c0695aD, "typeTable");
        int i = ck.j;
        if ((i & 8) == 8) {
            MK mk = ck.n;
            AbstractC0048Bt.m(mk, "returnType");
            return mk;
        }
        if ((i & 16) == 16) {
            return c0695aD.a(ck.f21o);
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Property");
    }

    public static int N(float f2) {
        if (Float.isNaN(f2)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f2);
    }

    public static final String O(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    public static final V6 P(Socket socket) {
        Logger logger = OF.a;
        FS fs = new FS(socket);
        OutputStream outputStream = socket.getOutputStream();
        AbstractC0048Bt.m(outputStream, "getOutputStream(...)");
        return new V6(fs, new V6(outputStream, fs));
    }

    public static final W6 Q(Socket socket) {
        Logger logger = OF.a;
        FS fs = new FS(socket);
        InputStream inputStream = socket.getInputStream();
        AbstractC0048Bt.m(inputStream, "getInputStream(...)");
        return new W6(fs, 0, new W6(inputStream, 1, fs));
    }

    public static final Integer R(int i) {
        if (i == 5) {
            return 33;
        }
        if (i == 6) {
            return 130;
        }
        if (i == 3) {
            return 17;
        }
        if (i == 4) {
            return 66;
        }
        if (i == 1) {
            return 2;
        }
        return i == 2 ? 1 : null;
    }

    public static final C0146Fn S(int i) {
        if (i == 1) {
            return new C0146Fn(2);
        }
        if (i == 2) {
            return new C0146Fn(1);
        }
        if (i == 17) {
            return new C0146Fn(3);
        }
        if (i == 33) {
            return new C0146Fn(5);
        }
        if (i == 66) {
            return new C0146Fn(4);
        }
        if (i != 130) {
            return null;
        }
        return new C0146Fn(6);
    }

    public static final long T(long j) {
        return AbstractC1035fP.a((int) (j >> 32), (int) (j & 4294967295L));
    }

    public static final MK U(UK uk, C0695aD c0695aD) {
        AbstractC0048Bt.n(c0695aD, "typeTable");
        int i = uk.j;
        if ((i & 4) == 4) {
            MK mk = uk.m;
            AbstractC0048Bt.m(mk, "type");
            return mk;
        }
        if ((i & 8) == 8) {
            return c0695aD.a(uk.n);
        }
        throw new IllegalStateException("No type in ProtoBuf.ValueParameter");
    }

    public static final YX V(InterfaceC2235xe interfaceC2235xe, InterfaceC0189He interfaceC0189He, Object obj) {
        YX yx = null;
        if ((interfaceC2235xe instanceof InterfaceC0474Se) && interfaceC0189He.k(ZX.h) != null) {
            InterfaceC0474Se interfaceC0474Se = (InterfaceC0474Se) interfaceC2235xe;
            while (true) {
                if ((interfaceC0474Se instanceof C0037Bi) || (interfaceC0474Se = interfaceC0474Se.getCallerFrame()) == null) {
                    break;
                }
                if (interfaceC0474Se instanceof YX) {
                    yx = (YX) interfaceC0474Se;
                    break;
                }
            }
            if (yx != null) {
                yx.e0(interfaceC0189He, obj);
            }
        }
        return yx;
    }

    public static final long a(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public static final C1143h2 b() {
        Paint paint = new Paint(7);
        C1143h2 c1143h2 = new C1143h2();
        c1143h2.i = paint;
        c1143h2.h = 3;
        return c1143h2;
    }

    public static final void c(YD yd, TC tc) {
        YD o2 = J(tc).o();
        int i = o2.j;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = o2.h;
            do {
                yd.b((TC) ((C0027Ay) objArr[i2]).u.f);
                i2--;
            } while (i2 >= 0);
        }
    }

    public static final boolean d(C0727aj c0727aj, long j) {
        if (!c0727aj.b.m) {
            return false;
        }
        C0384Os c0384Os = (C0384Os) J(c0727aj).u.c;
        if (!c0384Os.H.m) {
            return false;
        }
        long j2 = c0384Os.d;
        long q0 = c0384Os.q0(0L);
        float b2 = BF.b(q0);
        float c2 = BF.c(q0);
        float f2 = ((int) (j2 >> 32)) + b2;
        float f3 = ((int) (j2 & 4294967295L)) + c2;
        float b3 = BF.b(j);
        if (b2 > b3 || b3 > f2) {
            return false;
        }
        float c3 = BF.c(j);
        return c2 <= c3 && c3 <= f3;
    }

    public static void e(Throwable th, Throwable th2) {
        AbstractC0048Bt.n(th, "<this>");
        AbstractC0048Bt.n(th2, "exception");
        if (th != th2) {
            Integer num = AbstractC0333Mt.a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = AbstractC1290jI.a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static final int f(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }

    public static final IL g(YR yr) {
        AbstractC0048Bt.n(yr, "<this>");
        return new IL(yr);
    }

    public static final JL h(HS hs) {
        AbstractC0048Bt.n(hs, "<this>");
        return new JL(hs);
    }

    public static final C1032fM i(View view) {
        int[] iArr = AbstractC1807r8.c;
        view.getLocationInWindow(iArr);
        float f2 = iArr[0];
        return new C1032fM(f2, iArr[1], view.getWidth() + f2, iArr[1] + view.getHeight());
    }

    public static void j(G9 g9, Object[] objArr) {
        AbstractC0048Bt.n(objArr, "args");
        if (AbstractC1473m3.C(g9) == objArr.length) {
            return;
        }
        throw new IllegalArgumentException("Callable expects " + AbstractC1473m3.C(g9) + " arguments, but " + objArr.length + " were provided.");
    }

    public static final void k(int i) {
        if (i < 1) {
            throw new IllegalArgumentException(AbstractC2188wx.g(i, "Expected positive parallelism level, but got ").toString());
        }
    }

    public static final void l(InterfaceC1245ib interfaceC1245ib, LinkedHashSet linkedHashSet, WB wb, boolean z) {
        for (InterfaceC1118gg interfaceC1118gg : ON.h(wb, C2106vh.f234o, 2)) {
            if (interfaceC1118gg instanceof InterfaceC1245ib) {
                InterfaceC1245ib interfaceC1245ib2 = (InterfaceC1245ib) interfaceC1118gg;
                if (interfaceC1245ib2.X()) {
                    C0827cE name = interfaceC1245ib2.getName();
                    AbstractC0048Bt.m(name, "descriptor.name");
                    InterfaceC2364zb g2 = wb.g(name, DE.k);
                    interfaceC1245ib2 = g2 instanceof InterfaceC1245ib ? (InterfaceC1245ib) g2 : g2 instanceof C1316ji ? ((C1316ji) g2).H0() : null;
                }
                if (interfaceC1245ib2 != null) {
                    int i = AbstractC0114Eh.a;
                    Iterator it = interfaceC1245ib2.z().d().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (AbstractC0114Eh.p((AbstractC1004ey) it.next(), interfaceC1245ib.a())) {
                                linkedHashSet.add(interfaceC1245ib2);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z) {
                        WB g0 = interfaceC1245ib2.g0();
                        AbstractC0048Bt.m(g0, "refinedDescriptor.unsubstitutedInnerClassesScope");
                        l(interfaceC1245ib, linkedHashSet, g0, z);
                    }
                }
            }
        }
    }

    public static final int m(AbstractC1004ey abstractC1004ey) {
        AbstractC0048Bt.n(abstractC1004ey, "<this>");
        InterfaceC0948e4 c2 = abstractC1004ey.getAnnotations().c(AbstractC1433lT.q);
        if (c2 == null) {
            return 0;
        }
        AbstractC0551Vd abstractC0551Vd = (AbstractC0551Vd) EB.x(AbstractC1499mT.d, c2.f());
        AbstractC0048Bt.l(abstractC0551Vd, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue");
        return ((Number) ((C1525mt) abstractC0551Vd).a).intValue();
    }

    public static final void n(int i, int i2) {
        if (i <= i2) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i2 + ").");
    }

    public static WB o(String str, List list) {
        VB vb;
        AbstractC0048Bt.n(str, "debugName");
        C1564nS c1564nS = new C1564nS();
        Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            vb = VB.b;
            if (!hasNext) {
                break;
            }
            WB wb = (WB) it.next();
            if (wb != vb) {
                if (wb instanceof C2165wa) {
                    WB[] wbArr = ((C2165wa) wb).c;
                    AbstractC0048Bt.n(wbArr, "elements");
                    c1564nS.addAll(P6.W(wbArr));
                } else {
                    c1564nS.add(wb);
                }
            }
        }
        int i = c1564nS.h;
        return i != 0 ? i != 1 ? new C2165wa(str, (WB[]) c1564nS.toArray(new WB[0])) : (WB) c1564nS.get(0) : vb;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b8, code lost:
    
        if (r2 != o.EnumC0571Vx.MULTIFILE_CLASS_PART) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bc, code lost:
    
        if (r0.k != null) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00db A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static OM p(Class cls) {
        C0202Hr c0202Hr;
        BL bl;
        EnumC0571Vx enumC0571Vx;
        AbstractC0048Bt.n(cls, "klass");
        DL dl = new DL();
        dl.h = null;
        dl.i = null;
        dl.j = 0;
        dl.k = null;
        dl.l = null;
        dl.m = null;
        dl.n = null;
        dl.f30o = null;
        Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
        AbstractC0048Bt.m(declaredAnnotations, "klass.declaredAnnotations");
        for (Annotation annotation : declaredAnnotations) {
            AbstractC0048Bt.m(annotation, "annotation");
            Class D = AbstractC1473m3.D(AbstractC1473m3.B(annotation));
            C1639ob a2 = AbstractC1492mM.a(D);
            C2245xo b2 = a2.b();
            if (b2.equals(AbstractC0438Qu.a)) {
                bl = new BL(dl, 0);
            } else if (b2.equals(AbstractC0438Qu.f93o)) {
                bl = new BL(dl, 1);
            } else if (DL.p || dl.n != null || (enumC0571Vx = (EnumC0571Vx) DL.q.get(a2)) == null) {
                bl = null;
            } else {
                dl.n = enumC0571Vx;
                bl = new BL(dl, 2);
            }
            if (bl != null) {
                AbstractC0048Bt.R(bl, annotation, D);
            }
        }
        C1527mv c1527mv = C1527mv.g;
        if (dl.n != null && dl.h != null) {
            C1527mv c1527mv2 = new C1527mv(dl.h, (dl.j & 8) != 0);
            if (c1527mv2.b(c1527mv)) {
                EnumC0571Vx enumC0571Vx2 = dl.n;
                if (enumC0571Vx2 != EnumC0571Vx.CLASS) {
                    if (enumC0571Vx2 != EnumC0571Vx.FILE_FACADE) {
                    }
                }
            } else {
                dl.m = dl.k;
                dl.k = null;
            }
            String[] strArr = dl.f30o;
            if (strArr != null) {
                AbstractC1544n8.a(strArr);
            }
            c0202Hr = new C0202Hr(dl.n, c1527mv2, dl.k, dl.m, dl.l, dl.i, dl.j);
            if (c0202Hr != null) {
                return null;
            }
            return new OM(cls, c0202Hr);
        }
        c0202Hr = null;
        if (c0202Hr != null) {
        }
    }

    public static final JR q(AbstractC0545Ux abstractC0545Ux, InterfaceC1738q4 interfaceC1738q4, AbstractC1004ey abstractC1004ey, List list, ArrayList arrayList, AbstractC1004ey abstractC1004ey2, boolean z) {
        InterfaceC1245ib j;
        InterfaceC1738q4 interfaceC1738q42 = C0460Rq.t;
        int i = 0;
        ArrayList arrayList2 = new ArrayList(list.size() + arrayList.size() + (abstractC1004ey != null ? 1 : 0) + 1);
        ArrayList arrayList3 = new ArrayList(AbstractC0786bc.d0(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList3.add(AbstractC0772bO.a((AbstractC1004ey) it.next()));
        }
        arrayList2.addAll(arrayList3);
        AbstractC1052fg.e(arrayList2, abstractC1004ey != null ? AbstractC0772bO.a(abstractC1004ey) : null);
        Iterator it2 = arrayList.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC0868ct.Y();
                throw null;
            }
            arrayList2.add(AbstractC0772bO.a((AbstractC1004ey) next));
            i2 = i3;
        }
        arrayList2.add(AbstractC0772bO.a(abstractC1004ey2));
        int size = list.size() + arrayList.size() + (abstractC1004ey == null ? 0 : 1);
        if (z) {
            j = abstractC0545Ux.v(size);
        } else {
            C0827cE c0827cE = AbstractC1499mT.a;
            j = abstractC0545Ux.j("Function" + size);
        }
        if (abstractC1004ey != null) {
            C2245xo c2245xo = AbstractC1433lT.p;
            if (!interfaceC1738q4.i(c2245xo)) {
                ArrayList z0 = AbstractC0720ac.z0(interfaceC1738q4, new O8(abstractC0545Ux, c2245xo, C1384kk.h));
                interfaceC1738q4 = z0.isEmpty() ? interfaceC1738q42 : new C1803r4(i, z0);
            }
        }
        if (!list.isEmpty()) {
            int size2 = list.size();
            C2245xo c2245xo2 = AbstractC1433lT.q;
            if (!interfaceC1738q4.i(c2245xo2)) {
                ArrayList z02 = AbstractC0720ac.z0(interfaceC1738q4, new O8(abstractC0545Ux, c2245xo2, EB.F(new C1619oH(AbstractC1499mT.d, new C1525mt(size2)))));
                if (!z02.isEmpty()) {
                    interfaceC1738q42 = new C1803r4(i, z02);
                }
                interfaceC1738q4 = interfaceC1738q42;
            }
        }
        return HO.q(AbstractC1494mO.m(interfaceC1738q4), j, arrayList2);
    }

    public static final C0827cE r(AbstractC1004ey abstractC1004ey) {
        String str;
        InterfaceC0948e4 c2 = abstractC1004ey.getAnnotations().c(AbstractC1433lT.r);
        if (c2 != null) {
            Object E0 = AbstractC0720ac.E0(c2.f().values());
            ST st = E0 instanceof ST ? (ST) E0 : null;
            if (st != null && (str = (String) st.a) != null) {
                if (!C0827cE.f(str)) {
                    str = null;
                }
                if (str != null) {
                    return C0827cE.e(str);
                }
            }
        }
        return null;
    }

    public static final OM s(C0853ce c0853ce, C1639ob c1639ob, C1527mv c1527mv) {
        AbstractC0048Bt.n(c0853ce, "<this>");
        AbstractC0048Bt.n(c1639ob, "classId");
        AbstractC0048Bt.n(c1527mv, "jvmMetadataVersion");
        C1590ns b2 = c0853ce.b(c1639ob, c1527mv);
        if (b2 != null) {
            return (OM) b2.i;
        }
        return null;
    }

    public static final InterfaceC0189He t(InterfaceC0189He interfaceC0189He, InterfaceC0189He interfaceC0189He2, boolean z) {
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = ((Boolean) interfaceC0189He.I(bool, new C1903sc(2))).booleanValue();
        boolean booleanValue2 = ((Boolean) interfaceC0189He2.I(bool, new C1903sc(2))).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return interfaceC0189He.D(interfaceC0189He2);
        }
        C1903sc c1903sc = new C1903sc(3);
        C1188hk c1188hk = C1188hk.h;
        InterfaceC0189He interfaceC0189He3 = (InterfaceC0189He) interfaceC0189He.I(c1188hk, c1903sc);
        Object obj = interfaceC0189He2;
        if (booleanValue2) {
            obj = interfaceC0189He2.I(c1188hk, new C1903sc(4));
        }
        return interfaceC0189He3.D((InterfaceC0189He) obj);
    }

    public static final List u(AbstractC1004ey abstractC1004ey) {
        AbstractC0048Bt.n(abstractC1004ey, "<this>");
        A(abstractC1004ey);
        int m = m(abstractC1004ey);
        if (m == 0) {
            return C1318jk.h;
        }
        List subList = abstractC1004ey.w0().subList(0, m);
        ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(subList));
        Iterator it = subList.iterator();
        while (it.hasNext()) {
            AbstractC1004ey b2 = ((AbstractC1701pX) it.next()).b();
            AbstractC0048Bt.m(b2, "it.type");
            arrayList.add(b2);
        }
        return arrayList;
    }

    public static final EnumC0304Lp v(InterfaceC2364zb interfaceC2364zb) {
        if (!(interfaceC2364zb instanceof InterfaceC1245ib) || !AbstractC0545Ux.I(interfaceC2364zb)) {
            return null;
        }
        C2377zo h = AbstractC0192Hh.h(interfaceC2364zb);
        if (!h.d() || h.a.isEmpty()) {
            return null;
        }
        C0218Ih c0218Ih = EnumC0304Lp.j;
        String b2 = h.f().b();
        AbstractC0048Bt.m(b2, "shortName().asString()");
        C2245xo e2 = h.g().e();
        c0218Ih.getClass();
        C0278Kp t = C0218Ih.t(b2, e2);
        if (t != null) {
            return t.a;
        }
        return null;
    }

    public static final LI w(View view) {
        LI li = (LI) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (li != null) {
            return li;
        }
        LI li2 = new LI();
        view.setTag(R.id.pooling_container_listener_holder_tag, li2);
        return li2;
    }

    public static final AbstractC1004ey x(AbstractC1004ey abstractC1004ey) {
        AbstractC0048Bt.n(abstractC1004ey, "<this>");
        A(abstractC1004ey);
        if (abstractC1004ey.getAnnotations().c(AbstractC1433lT.p) == null) {
            return null;
        }
        return ((AbstractC1701pX) abstractC1004ey.w0().get(m(abstractC1004ey))).b();
    }

    public static final List y(AbstractC1004ey abstractC1004ey) {
        AbstractC0048Bt.n(abstractC1004ey, "<this>");
        A(abstractC1004ey);
        List w0 = abstractC1004ey.w0();
        return w0.subList(((!A(abstractC1004ey) || abstractC1004ey.getAnnotations().c(AbstractC1433lT.p) == null) ? 0 : 1) + m(abstractC1004ey), w0.size() - 1);
    }

    public static final boolean z(AssertionError assertionError) {
        Logger logger = OF.a;
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? UT.E(message, "getsockname failed") : false) {
                return true;
            }
        }
        return false;
    }
}
