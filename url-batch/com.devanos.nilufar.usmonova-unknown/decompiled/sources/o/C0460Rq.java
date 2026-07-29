package o;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.messaging.Constants;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: o.Rq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0460Rq implements Configurator, InterfaceC0163Ge, PC, InterfaceC0920df, InterfaceC2289yS, InterfaceC1160hI {
    public static final C0460Rq A;
    public static final C0460Rq B;
    public static final C0460Rq C;
    public static final C0460Rq D;
    public static final /* synthetic */ C0460Rq E;
    public static final /* synthetic */ C0460Rq F;
    public static final C0460Rq G;
    public static final C0460Rq H;
    public static final C0460Rq I;
    public static final C0460Rq J;
    public static final /* synthetic */ C0460Rq K;
    public static final C0460Rq L;
    public static final C0460Rq M;
    public static final /* synthetic */ C0460Rq N;
    public static final /* synthetic */ C0460Rq O;
    public static final C0460Rq P;
    public static final /* synthetic */ C0460Rq Q;
    public static final C0457Rn R;
    public static final C0460Rq S;
    public static final /* synthetic */ C0460Rq T;
    public static C0460Rq i;
    public static final C0460Rq j = new C0460Rq(1);
    public static final C1150h8 k = new C1150h8(-1.0f, -1.0f);
    public static final C1150h8 l = new C1150h8(0.0f, -1.0f);
    public static final C1150h8 m = new C1150h8(1.0f, -1.0f);
    public static final C1150h8 n = new C1150h8(-1.0f, 0.0f);

    /* renamed from: o, reason: collision with root package name */
    public static final C1150h8 f100o = new C1150h8(0.0f, 0.0f);
    public static final C1150h8 p = new C1150h8(1.0f, 0.0f);
    public static final C1150h8 q = new C1150h8(-1.0f, 1.0f);
    public static final C1150h8 r = new C1150h8(0.0f, 1.0f);
    public static final C1150h8 s = new C1150h8(1.0f, 1.0f);
    public static final C1672p4 t;
    public static final C0460Rq u;
    public static final C0460Rq v;
    public static final /* synthetic */ C0460Rq w;
    public static final /* synthetic */ C0460Rq x;
    public static final C0460Rq y;
    public static final C0460Rq z;
    public final /* synthetic */ int h;

    static {
        new C1084g8(-1.0f);
        new C1084g8(0.0f);
        new C1018f8(-1.0f);
        new C1018f8(0.0f);
        t = new C1672p4();
        u = new C0460Rq(4);
        v = new C0460Rq(5);
        w = new C0460Rq(6);
        x = new C0460Rq(7);
        y = new C0460Rq(8);
        z = new C0460Rq(9);
        A = new C0460Rq(10);
        B = new C0460Rq(11);
        C = new C0460Rq(12);
        D = new C0460Rq(13);
        E = new C0460Rq(14);
        F = new C0460Rq(15);
        G = new C0460Rq(16);
        H = new C0460Rq(17);
        I = new C0460Rq(18);
        J = new C0460Rq(19);
        K = new C0460Rq(20);
        L = new C0460Rq(22);
        M = new C0460Rq(23);
        N = new C0460Rq(24);
        O = new C0460Rq(25);
        P = new C0460Rq(26);
        Q = new C0460Rq(27);
        R = new C0457Rn("PackageViewDescriptorFactory", 4);
        S = new C0460Rq(28);
        T = new C0460Rq(29);
    }

    public /* synthetic */ C0460Rq(int i2) {
        this.h = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean A(PackageInfo packageInfo) {
        PackageInfo packageInfo2;
        boolean z2;
        if (packageInfo == null) {
            packageInfo2 = null;
        } else {
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z2 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
                packageInfo2 = packageInfo;
                if (packageInfo != null && packageInfo2.signatures != null) {
                    if ((!z2 ? z(packageInfo2, e30.a) : z(packageInfo2, e30.a[0])) == null) {
                        return true;
                    }
                }
                return false;
            }
            packageInfo2 = packageInfo;
        }
        z2 = true;
        if (packageInfo != null) {
            if ((!z2 ? z(packageInfo2, e30.a) : z(packageInfo2, e30.a[0])) == null) {
            }
        }
        return false;
    }

    public static final boolean l(InterfaceC2298yb interfaceC2298yb, MR mr) {
        if (interfaceC2298yb.E(mr)) {
            return true;
        }
        if (!(mr instanceof InterfaceC1638oa)) {
            return false;
        }
        AbstractC1701pX M2 = interfaceC2298yb.M(interfaceC2298yb.T((InterfaceC1638oa) mr));
        return !interfaceC2298yb.G(M2) && interfaceC2298yb.E(interfaceC2298yb.j0(interfaceC2298yb.o0(M2)));
    }

    public static final boolean m(InterfaceC2298yb interfaceC2298yb, RW rw, MR mr, MR mr2, boolean z2) {
        Collection<InterfaceC1266iy> f = interfaceC2298yb.f(mr);
        if ((f instanceof Collection) && f.isEmpty()) {
            return false;
        }
        for (InterfaceC1266iy interfaceC1266iy : f) {
            if (AbstractC0048Bt.h(interfaceC2298yb.a(interfaceC1266iy), interfaceC2298yb.Q(mr2))) {
                return true;
            }
            if (z2 && v(j, rw, mr2, interfaceC1266iy)) {
                return true;
            }
        }
        return false;
    }

    public static List n(RW rw, MR mr, TW tw) {
        PO w2;
        QW qw = QW.c;
        InterfaceC2298yb interfaceC2298yb = rw.c;
        interfaceC2298yb.P(mr, tw);
        if (interfaceC2298yb.j(tw) || !interfaceC2298yb.y(mr)) {
            if (!interfaceC2298yb.I(tw)) {
                C1564nS c1564nS = new C1564nS();
                rw.b();
                ArrayDeque arrayDeque = rw.g;
                AbstractC0048Bt.k(arrayDeque);
                C1630oS c1630oS = rw.h;
                AbstractC0048Bt.k(c1630oS);
                arrayDeque.push(mr);
                while (!arrayDeque.isEmpty()) {
                    if (c1630oS.i > 1000) {
                        throw new IllegalStateException(("Too many supertypes for type: " + mr + ". Supertypes = " + AbstractC0720ac.t0(c1630oS, null, null, null, null, 63)).toString());
                    }
                    MR mr2 = (MR) arrayDeque.pop();
                    AbstractC0048Bt.m(mr2, "current");
                    if (c1630oS.add(mr2)) {
                        JR Z = interfaceC2298yb.Z(mr2);
                        if (Z == null) {
                            Z = mr2;
                        }
                        if (interfaceC2298yb.J(interfaceC2298yb.Q(Z), tw)) {
                            c1564nS.add(Z);
                            w2 = qw;
                        } else {
                            w2 = interfaceC2298yb.l0(Z) == 0 ? QW.b : interfaceC2298yb.w(Z);
                        }
                        if (w2.equals(qw)) {
                            w2 = null;
                        }
                        if (w2 != null) {
                            Iterator it = interfaceC2298yb.x0(interfaceC2298yb.Q(mr2)).iterator();
                            while (it.hasNext()) {
                                arrayDeque.add(w2.p(rw, (InterfaceC1266iy) it.next()));
                            }
                        }
                    }
                }
                rw.a();
                return c1564nS;
            }
            if (interfaceC2298yb.J(interfaceC2298yb.Q(mr), tw)) {
                JR Z2 = interfaceC2298yb.Z(mr);
                if (Z2 != null) {
                    mr = Z2;
                }
                return AbstractC0868ct.J(mr);
            }
        }
        return C1318jk.h;
    }

    public static List o(RW rw, MR mr, TW tw) {
        int i2;
        List n2 = n(rw, mr, tw);
        InterfaceC2298yb interfaceC2298yb = rw.c;
        if (n2.size() >= 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : n2) {
                NW g0 = interfaceC2298yb.g0((MR) obj);
                int A0 = interfaceC2298yb.A0(g0);
                while (true) {
                    if (i2 >= A0) {
                        arrayList.add(obj);
                        break;
                    }
                    i2 = interfaceC2298yb.t0(interfaceC2298yb.o0(interfaceC2298yb.o(g0, i2))) == null ? i2 + 1 : 0;
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return n2;
    }

    public static AbstractC0335Mv p(String str) {
        EnumC1791qv enumC1791qv;
        AbstractC0048Bt.n(str, "representation");
        char charAt = str.charAt(0);
        EnumC1791qv[] values = EnumC1791qv.values();
        int length = values.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                enumC1791qv = null;
                break;
            }
            enumC1791qv = values[i2];
            if (enumC1791qv.c().charAt(0) == charAt) {
                break;
            }
            i2++;
        }
        if (enumC1791qv != null) {
            return new C0309Lv(enumC1791qv);
        }
        if (charAt == 'V') {
            return new C0309Lv(null);
        }
        if (charAt == '[') {
            String substring = str.substring(1);
            AbstractC0048Bt.m(substring, "this as java.lang.String).substring(startIndex)");
            return new C0258Jv(p(substring));
        }
        if (charAt == 'L' && str.length() > 0) {
            AbstractC0868ct.t(str.charAt(UT.F(str)), ';', false);
        }
        String substring2 = str.substring(1, str.length() - 1);
        AbstractC0048Bt.m(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
        return new C0284Kv(substring2);
    }

    public static C0284Kv q(String str) {
        AbstractC0048Bt.n(str, "internalName");
        return new C0284Kv(str);
    }

    public static boolean r(RW rw, InterfaceC1266iy interfaceC1266iy, InterfaceC1266iy interfaceC1266iy2) {
        AbstractC0048Bt.n(interfaceC1266iy, "a");
        AbstractC0048Bt.n(interfaceC1266iy2, "b");
        InterfaceC2298yb interfaceC2298yb = rw.c;
        if (interfaceC1266iy == interfaceC1266iy2) {
            return true;
        }
        if (t(interfaceC2298yb, interfaceC1266iy) && t(interfaceC2298yb, interfaceC1266iy2)) {
            AbstractC2097vY c = rw.c(rw.d(interfaceC1266iy));
            AbstractC2097vY c2 = rw.c(rw.d(interfaceC1266iy2));
            JR b = interfaceC2298yb.b(c);
            if (!interfaceC2298yb.J(interfaceC2298yb.a(c), interfaceC2298yb.a(c2))) {
                return false;
            }
            if (interfaceC2298yb.l0(b) == 0) {
                return interfaceC2298yb.g(c) || interfaceC2298yb.g(c2) || interfaceC2298yb.q0(b) == interfaceC2298yb.q0(interfaceC2298yb.b(c2));
            }
        }
        C0460Rq c0460Rq = j;
        return v(c0460Rq, rw, interfaceC1266iy, interfaceC1266iy2) && v(c0460Rq, rw, interfaceC1266iy2, interfaceC1266iy);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        return r6.V(r6.a(r7), r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static InterfaceC1437lX s(InterfaceC2298yb interfaceC2298yb, InterfaceC1266iy interfaceC1266iy, InterfaceC1266iy interfaceC1266iy2) {
        AbstractC2097vY o0;
        int l0 = interfaceC2298yb.l0(interfaceC1266iy);
        int i2 = 0;
        while (true) {
            if (i2 >= l0) {
                return null;
            }
            AbstractC1701pX B2 = interfaceC2298yb.B(interfaceC1266iy, i2);
            AbstractC1701pX abstractC1701pX = interfaceC2298yb.G(B2) ? null : B2;
            if (abstractC1701pX != null && (o0 = interfaceC2298yb.o0(abstractC1701pX)) != null) {
                boolean z2 = interfaceC2298yb.m0(interfaceC2298yb.p0(interfaceC2298yb.b(o0))) && interfaceC2298yb.m0(interfaceC2298yb.p0(interfaceC2298yb.b(interfaceC1266iy2)));
                if (o0.equals(interfaceC1266iy2) || (z2 && AbstractC0048Bt.h(interfaceC2298yb.a(o0), interfaceC2298yb.a(interfaceC1266iy2)))) {
                    break;
                }
                InterfaceC1437lX s2 = s(interfaceC2298yb, o0, interfaceC1266iy2);
                if (s2 != null) {
                    return s2;
                }
            }
            i2++;
        }
    }

    public static boolean t(InterfaceC2298yb interfaceC2298yb, InterfaceC1266iy interfaceC1266iy) {
        if (!interfaceC2298yb.k0(interfaceC2298yb.a(interfaceC1266iy))) {
            return false;
        }
        interfaceC2298yb.e0(interfaceC1266iy);
        return (interfaceC2298yb.N(interfaceC1266iy) || interfaceC2298yb.i(interfaceC1266iy) || !AbstractC0048Bt.h(interfaceC2298yb.Q(interfaceC2298yb.b(interfaceC1266iy)), interfaceC2298yb.Q(interfaceC2298yb.j0(interfaceC1266iy)))) ? false : true;
    }

    public static boolean u(RW rw, NW nw, MR mr) {
        boolean v2;
        AbstractC0048Bt.n(nw, "capturedSubArguments");
        InterfaceC2298yb interfaceC2298yb = rw.c;
        SW Q2 = interfaceC2298yb.Q(mr);
        int A0 = interfaceC2298yb.A0(nw);
        int p2 = interfaceC2298yb.p(Q2);
        if (A0 == p2 && A0 == interfaceC2298yb.l0(mr)) {
            for (int i2 = 0; i2 < p2; i2++) {
                AbstractC1701pX B2 = interfaceC2298yb.B(mr, i2);
                if (!interfaceC2298yb.G(B2)) {
                    AbstractC2097vY o0 = interfaceC2298yb.o0(B2);
                    AbstractC1701pX o2 = interfaceC2298yb.o(nw, i2);
                    interfaceC2298yb.R(o2);
                    AbstractC2097vY o02 = interfaceC2298yb.o0(o2);
                    int k2 = interfaceC2298yb.k(interfaceC2298yb.V(Q2, i2));
                    int R2 = interfaceC2298yb.R(B2);
                    AbstractC1888sN.p(k2, "declared");
                    AbstractC1888sN.p(R2, "useSite");
                    if (k2 == 3) {
                        k2 = R2;
                    } else if (R2 != 3 && k2 != R2) {
                        k2 = 0;
                    }
                    if (k2 == 0) {
                        return rw.a;
                    }
                    if (k2 == 3) {
                        w(interfaceC2298yb, o02, o0);
                        w(interfaceC2298yb, o0, o02);
                    }
                    int i3 = rw.f;
                    if (i3 > 100) {
                        throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + o02).toString());
                    }
                    rw.f = i3 + 1;
                    int v3 = AbstractC1888sN.v(k2);
                    C0460Rq c0460Rq = j;
                    if (v3 == 0) {
                        v2 = v(c0460Rq, rw, o0, o02);
                    } else if (v3 == 1) {
                        v2 = v(c0460Rq, rw, o02, o0);
                    } else {
                        if (v3 != 2) {
                            throw new C0057Cc();
                        }
                        v2 = r(rw, o02, o0);
                    }
                    rw.f--;
                    if (!v2) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:272:0x02c1, code lost:
    
        r4 = java.lang.Boolean.TRUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x02bf, code lost:
    
        if (m(r3, r26, r8, r4, true) != false) goto L169;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02ca  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, o.yb] */
    /* JADX WARN: Type inference failed for: r8v29, types: [int] */
    /* JADX WARN: Type inference failed for: r8v68 */
    /* JADX WARN: Type inference failed for: r8v69 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean v(C0460Rq c0460Rq, RW rw, InterfaceC1266iy interfaceC1266iy, InterfaceC1266iy interfaceC1266iy2) {
        Boolean valueOf;
        Boolean bool;
        boolean z2;
        List<MR> list;
        QW qw;
        int size;
        AbstractC2097vY o0;
        JR jr;
        boolean z3;
        ?? r3 = rw.c;
        AbstractC0048Bt.n(interfaceC1266iy, "subType");
        AbstractC0048Bt.n(interfaceC1266iy2, "superType");
        if (interfaceC1266iy == interfaceC1266iy2) {
            return true;
        }
        rw.getClass();
        boolean z4 = false;
        AbstractC2097vY c = rw.c(rw.d(interfaceC1266iy));
        AbstractC2097vY c2 = rw.c(rw.d(interfaceC1266iy2));
        JR b = r3.b(c);
        JR j0 = r3.j0(c2);
        if (r3.c(b) || r3.c(j0)) {
            valueOf = rw.a ? Boolean.TRUE : (!r3.q0(b) || r3.q0(j0)) ? Boolean.valueOf(AbstractC1807r8.a0(r3, r3.K(b, false), r3.K(j0, false))) : Boolean.FALSE;
        } else {
            r3.A(b);
            r3.C0(b);
            r3.C0(j0);
            C0632Yg l2 = r3.l(j0);
            if (l2 == null || (jr = r3.b0(l2)) == null) {
                jr = j0;
            }
            InterfaceC1638oa v0 = r3.v0(jr);
            InterfaceC1266iy z5 = v0 != null ? r3.z(v0) : null;
            C0460Rq c0460Rq2 = j;
            if (v0 != null && z5 != null) {
                if (r3.q0(j0)) {
                    z5 = r3.D(z5);
                } else if (r3.N(j0)) {
                    z5 = r3.U(z5);
                }
                if (v(c0460Rq2, rw, b, z5)) {
                    valueOf = Boolean.TRUE;
                }
            }
            SW Q2 = r3.Q(j0);
            if (r3.H(Q2)) {
                r3.q0(j0);
                Collection x0 = r3.x0(Q2);
                if (!(x0 instanceof Collection) || !x0.isEmpty()) {
                    Iterator it = x0.iterator();
                    while (it.hasNext()) {
                        if (!v(c0460Rq2, rw, b, (InterfaceC1266iy) it.next())) {
                            z3 = false;
                            break;
                        }
                    }
                }
                z3 = true;
                valueOf = Boolean.valueOf(z3);
            } else {
                SW Q3 = r3.Q(b);
                if (!(b instanceof InterfaceC1638oa)) {
                    if (r3.H(Q3)) {
                        Collection x02 = r3.x0(Q3);
                        if (!(x02 instanceof Collection) || !x02.isEmpty()) {
                            Iterator it2 = x02.iterator();
                            while (it2.hasNext()) {
                                if (!(((InterfaceC1266iy) it2.next()) instanceof InterfaceC1638oa)) {
                                    break;
                                }
                            }
                        }
                    }
                    valueOf = null;
                }
                InterfaceC1437lX s2 = s(r3, j0, b);
                if (s2 != null && r3.w0(s2, r3.Q(j0))) {
                    valueOf = Boolean.TRUE;
                }
                valueOf = null;
            }
        }
        if (valueOf != null) {
            return valueOf.booleanValue();
        }
        MR b2 = r3.b(c);
        JR j02 = r3.j0(c2);
        QW qw2 = QW.c;
        QW qw3 = QW.b;
        int i2 = 1000;
        if (!r3.q0(j02) && !r3.N(b2) && !r3.i(b2) && ((!(b2 instanceof InterfaceC1638oa) || !r3.h((InterfaceC1638oa) b2)) && !AbstractC1473m3.J(rw, b2, qw3))) {
            if (r3.N(j02) || AbstractC1473m3.J(rw, j02, QW.d) || r3.y(b2)) {
                return false;
            }
            SW Q4 = r3.Q(j02);
            AbstractC0048Bt.n(Q4, "end");
            if (!AbstractC1473m3.O(rw, b2, Q4)) {
                rw.b();
                ArrayDeque arrayDeque = rw.g;
                AbstractC0048Bt.k(arrayDeque);
                C1630oS c1630oS = rw.h;
                AbstractC0048Bt.k(c1630oS);
                arrayDeque.push(b2);
                while (!arrayDeque.isEmpty()) {
                    if (c1630oS.i > i2) {
                        throw new IllegalStateException(("Too many supertypes for type: " + b2 + ". Supertypes = " + AbstractC0720ac.t0(c1630oS, null, null, null, null, 63)).toString());
                    }
                    MR mr = (MR) arrayDeque.pop();
                    AbstractC0048Bt.m(mr, "current");
                    if (c1630oS.add(mr)) {
                        QW qw4 = r3.q0(mr) ? qw2 : qw3;
                        if (qw4.equals(qw2)) {
                            qw4 = null;
                        }
                        if (qw4 != null) {
                            Iterator it3 = r3.x0(r3.Q(mr)).iterator();
                            while (it3.hasNext()) {
                                MR p2 = qw4.p(rw, (InterfaceC1266iy) it3.next());
                                if (AbstractC1473m3.O(rw, p2, Q4)) {
                                    rw.a();
                                } else {
                                    arrayDeque.add(p2);
                                }
                            }
                        }
                        i2 = 1000;
                    }
                }
                rw.a();
                return false;
            }
        }
        JR b3 = r3.b(b2);
        JR j03 = r3.j0(j02);
        if (r3.E(b3) || r3.E(j03)) {
            if (l(r3, b3) && l(r3, j03)) {
                bool = Boolean.TRUE;
            } else if (!r3.E(b3)) {
                if (r3.E(j03)) {
                    SW Q5 = r3.Q(b3);
                    if (Q5 instanceof C2382zt) {
                        Collection x03 = r3.x0(Q5);
                        if (!(x03 instanceof Collection) || !x03.isEmpty()) {
                            Iterator it4 = x03.iterator();
                            while (it4.hasNext()) {
                                JR h0 = r3.h0((InterfaceC1266iy) it4.next());
                                if (h0 != null && r3.E(h0)) {
                                    break;
                                }
                            }
                        }
                    }
                }
            } else if (m(r3, rw, b3, j03, false)) {
                bool = Boolean.TRUE;
            }
            if (bool == null) {
                return bool.booleanValue();
            }
            SW Q6 = r3.Q(j02);
            if ((r3.J(r3.Q(b2), Q6) && r3.p(Q6) == 0) || r3.s0(r3.Q(j02))) {
                return true;
            }
            AbstractC0048Bt.n(Q6, "superConstructor");
            if (r3.y(b2)) {
                list = o(rw, b2, Q6);
            } else {
                if (r3.j(Q6) || r3.S(Q6)) {
                    C1564nS c1564nS = new C1564nS();
                    rw.b();
                    ArrayDeque arrayDeque2 = rw.g;
                    AbstractC0048Bt.k(arrayDeque2);
                    C1630oS c1630oS2 = rw.h;
                    AbstractC0048Bt.k(c1630oS2);
                    arrayDeque2.push(b2);
                    while (!arrayDeque2.isEmpty()) {
                        if (c1630oS2.i > 1000) {
                            throw new IllegalStateException(("Too many supertypes for type: " + b2 + ". Supertypes = " + AbstractC0720ac.t0(c1630oS2, null, null, null, null, 63)).toString());
                        }
                        MR mr2 = (MR) arrayDeque2.pop();
                        AbstractC0048Bt.m(mr2, "current");
                        if (c1630oS2.add(mr2)) {
                            if (r3.y(mr2)) {
                                c1564nS.add(mr2);
                                qw = qw2;
                            } else {
                                qw = qw3;
                            }
                            if (qw.equals(qw2)) {
                                qw = null;
                            }
                            if (qw != null) {
                                Iterator it5 = r3.x0(r3.Q(mr2)).iterator();
                                while (it5.hasNext()) {
                                    arrayDeque2.add(qw.p(rw, (InterfaceC1266iy) it5.next()));
                                    z4 = z4;
                                }
                            }
                        }
                    }
                    z2 = z4;
                    rw.a();
                    ArrayList arrayList = new ArrayList();
                    Iterator it6 = c1564nS.iterator();
                    while (it6.hasNext()) {
                        MR mr3 = (MR) it6.next();
                        AbstractC0048Bt.m(mr3, "it");
                        AbstractC1048fc.f0(arrayList, o(rw, mr3, Q6));
                    }
                    list = arrayList;
                    ArrayList arrayList2 = new ArrayList(AbstractC0786bc.d0(list));
                    for (MR mr4 : list) {
                        JR h02 = r3.h0(rw.c(mr4));
                        if (h02 != null) {
                            mr4 = h02;
                        }
                        arrayList2.add(mr4);
                    }
                    size = arrayList2.size();
                    if (size != 0) {
                        SW Q7 = r3.Q(b2);
                        if (r3.j(Q7)) {
                            return r3.f0(Q7);
                        }
                        if (r3.f0(r3.Q(b2))) {
                            return true;
                        }
                        rw.b();
                        ArrayDeque arrayDeque3 = rw.g;
                        AbstractC0048Bt.k(arrayDeque3);
                        C1630oS c1630oS3 = rw.h;
                        AbstractC0048Bt.k(c1630oS3);
                        arrayDeque3.push(b2);
                        while (!arrayDeque3.isEmpty()) {
                            if (c1630oS3.i > 1000) {
                                throw new IllegalStateException(("Too many supertypes for type: " + b2 + ". Supertypes = " + AbstractC0720ac.t0(c1630oS3, null, null, null, null, 63)).toString());
                            }
                            MR mr5 = (MR) arrayDeque3.pop();
                            AbstractC0048Bt.m(mr5, "current");
                            if (c1630oS3.add(mr5)) {
                                QW qw5 = r3.y(mr5) ? qw2 : qw3;
                                if (qw5.equals(qw2)) {
                                    qw5 = null;
                                }
                                if (qw5 == null) {
                                    continue;
                                } else {
                                    Iterator it7 = r3.x0(r3.Q(mr5)).iterator();
                                    while (it7.hasNext()) {
                                        MR p3 = qw5.p(rw, (InterfaceC1266iy) it7.next());
                                        if (r3.f0(r3.Q(p3))) {
                                            rw.a();
                                            return true;
                                        }
                                        arrayDeque3.add(p3);
                                    }
                                }
                            }
                        }
                        rw.a();
                        return z2;
                    }
                    if (size == 1) {
                        return u(rw, r3.g0((MR) AbstractC0720ac.n0(arrayList2)), j02);
                    }
                    B6 b6 = new B6(r3.p(Q6));
                    int p4 = r3.p(Q6);
                    boolean z6 = z2;
                    boolean z7 = z6;
                    for (?? r8 = z6; r8 < p4; r8++) {
                        z7 = (z7 || r3.k(r3.V(Q6, r8)) != 2) ? true : z2;
                        if (!z7) {
                            ArrayList arrayList3 = new ArrayList(AbstractC0786bc.d0(arrayList2));
                            Iterator it8 = arrayList2.iterator();
                            while (it8.hasNext()) {
                                MR mr6 = (MR) it8.next();
                                AbstractC1701pX a0 = r3.a0(mr6, r8);
                                if (a0 != null) {
                                    if (r3.R(a0) != 3) {
                                        a0 = null;
                                    }
                                    if (a0 != null && (o0 = r3.o0(a0)) != null) {
                                        arrayList3.add(o0);
                                    }
                                }
                                throw new IllegalStateException(("Incorrect type: " + mr6 + ", subType: " + b2 + ", superType: " + j02).toString());
                            }
                            b6.add(r3.B0(r3.C(arrayList3)));
                        }
                    }
                    if (!z7 && u(rw, b6, j02)) {
                        return true;
                    }
                    C1007f0 c1007f0 = new C1007f0(arrayList2, rw, r3, j02, 0);
                    PW pw = new PW();
                    c1007f0.invoke(pw);
                    return pw.a;
                }
                list = n(rw, b2, Q6);
            }
            z2 = false;
            ArrayList arrayList22 = new ArrayList(AbstractC0786bc.d0(list));
            while (r8.hasNext()) {
            }
            size = arrayList22.size();
            if (size != 0) {
            }
        }
        bool = null;
        if (bool == null) {
        }
    }

    public static void w(InterfaceC2298yb interfaceC2298yb, InterfaceC1266iy interfaceC1266iy, InterfaceC1266iy interfaceC1266iy2) {
        MR h0 = interfaceC2298yb.h0(interfaceC1266iy);
        if (h0 instanceof InterfaceC1638oa) {
            InterfaceC1638oa interfaceC1638oa = (InterfaceC1638oa) h0;
            if (!interfaceC2298yb.O(interfaceC1638oa) && interfaceC2298yb.G(interfaceC2298yb.M(interfaceC2298yb.T(interfaceC1638oa))) && interfaceC2298yb.y0(interfaceC1638oa) == 1) {
                interfaceC2298yb.a(interfaceC1266iy2);
            }
        }
    }

    public static IS x(InterfaceC2072v9 interfaceC2072v9) {
        while (interfaceC2072v9 instanceof InterfaceC2204x9) {
            InterfaceC2204x9 interfaceC2204x9 = (InterfaceC2204x9) interfaceC2072v9;
            if (interfaceC2204x9.M() != 2) {
                break;
            }
            Collection o2 = interfaceC2204x9.o();
            AbstractC0048Bt.m(o2, "overriddenDescriptors");
            interfaceC2072v9 = (InterfaceC2204x9) AbstractC0720ac.E0(o2);
            if (interfaceC2072v9 == null) {
                return null;
            }
        }
        return interfaceC2072v9.d();
    }

    public static String y(AbstractC0335Mv abstractC0335Mv) {
        String c;
        AbstractC0048Bt.n(abstractC0335Mv, "type");
        if (abstractC0335Mv instanceof C0258Jv) {
            return "[" + y(((C0258Jv) abstractC0335Mv).i);
        }
        if (abstractC0335Mv instanceof C0309Lv) {
            EnumC1791qv enumC1791qv = ((C0309Lv) abstractC0335Mv).i;
            return (enumC1791qv == null || (c = enumC1791qv.c()) == null) ? "V" : c;
        }
        if (abstractC0335Mv instanceof C0284Kv) {
            return AbstractC2188wx.h(new StringBuilder("L"), ((C0284Kv) abstractC0335Mv).i, ';');
        }
        throw new C0057Cc();
    }

    public static final a30 z(PackageInfo packageInfo, a30... a30VarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            c30 c30Var = new c30(packageInfo.signatures[0].toByteArray());
            for (int i2 = 0; i2 < a30VarArr.length; i2++) {
                if (a30VarArr[i2].equals(c30Var)) {
                    return a30VarArr[i2];
                }
            }
        }
        return null;
    }

    @Override // o.InterfaceC1160hI
    public boolean a(InterfaceC1245ib interfaceC1245ib, C1251ii c1251ii) {
        AbstractC0048Bt.n(interfaceC1245ib, "classDescriptor");
        return !c1251ii.getAnnotations().i(AbstractC1226iI.a);
    }

    @Override // o.PC
    public ByteBuffer b(Object obj) {
        JSONArray put = new JSONArray().put(AbstractC1052fg.b0(obj));
        if (put == null) {
            return null;
        }
        Object b0 = AbstractC1052fg.b0(put);
        if (b0 instanceof String) {
            RT rt = RT.i;
            String quote = JSONObject.quote((String) b0);
            rt.getClass();
            return RT.b(quote);
        }
        RT rt2 = RT.i;
        String obj2 = b0.toString();
        rt2.getClass();
        return RT.b(obj2);
    }

    @Override // o.PC
    public ByteBuffer c(String str, String str2) {
        JSONArray put = new JSONArray().put(Constants.IPC_BUNDLE_KEY_SEND_ERROR).put(AbstractC1052fg.b0(str)).put(JSONObject.NULL).put(AbstractC1052fg.b0(str2));
        if (put == null) {
            return null;
        }
        Object b0 = AbstractC1052fg.b0(put);
        if (b0 instanceof String) {
            RT rt = RT.i;
            String quote = JSONObject.quote((String) b0);
            rt.getClass();
            return RT.b(quote);
        }
        RT rt2 = RT.i;
        String obj = b0.toString();
        rt2.getClass();
        return RT.b(obj);
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig encoderConfig) {
        C0820c7 c0820c7 = C0820c7.a;
        encoderConfig.registerEncoder(AbstractC0952e8.class, c0820c7);
        encoderConfig.registerEncoder(C1806r7.class, c0820c7);
        C1017f7 c1017f7 = C1017f7.a;
        encoderConfig.registerEncoder(AbstractC0955eB.class, c1017f7);
        encoderConfig.registerEncoder(C2268y7.class, c1017f7);
        C0886d7 c0886d7 = C0886d7.a;
        encoderConfig.registerEncoder(AbstractC0134Fb.class, c0886d7);
        encoderConfig.registerEncoder(C1872s7.class, c0886d7);
        C0755b7 c0755b7 = C0755b7.a;
        encoderConfig.registerEncoder(B2.class, c0755b7);
        encoderConfig.registerEncoder(C1675p7.class, c0755b7);
        C0951e7 c0951e7 = C0951e7.a;
        encoderConfig.registerEncoder(AbstractC0759bB.class, c0951e7);
        encoderConfig.registerEncoder(C2202x7.class, c0951e7);
        C1083g7 c1083g7 = C1083g7.a;
        encoderConfig.registerEncoder(AbstractC1879sE.class, c1083g7);
        encoderConfig.registerEncoder(A7.class, c1083g7);
    }

    @Override // o.InterfaceC2289yS
    public boolean d(Object obj, Object obj2) {
        return false;
    }

    @Override // o.InterfaceC0920df
    public Iterable e(Object obj) {
        int i2 = C1137gz.p;
        Collection d = ((InterfaceC1245ib) obj).z().d();
        AbstractC0048Bt.m(d, "it.typeConstructor.supertypes");
        return new S6(2, PQ.A(AbstractC0720ac.i0(d), C2316yt.t));
    }

    @Override // o.PC
    public ByteBuffer f(String str, String str2, Object obj) {
        JSONArray put = new JSONArray().put(str).put(AbstractC1052fg.b0(str2)).put(AbstractC1052fg.b0(obj));
        if (put == null) {
            return null;
        }
        Object b0 = AbstractC1052fg.b0(put);
        if (b0 instanceof String) {
            RT rt = RT.i;
            String quote = JSONObject.quote((String) b0);
            rt.getClass();
            return RT.b(quote);
        }
        RT rt2 = RT.i;
        String obj2 = b0.toString();
        rt2.getClass();
        return RT.b(obj2);
    }

    @Override // o.PC
    public ByteBuffer g(C0208Hx c0208Hx) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", (String) c0208Hx.i);
            jSONObject.put("args", AbstractC1052fg.b0(c0208Hx.j));
            Object b0 = AbstractC1052fg.b0(jSONObject);
            if (b0 instanceof String) {
                RT rt = RT.i;
                String quote = JSONObject.quote((String) b0);
                rt.getClass();
                return RT.b(quote);
            }
            RT rt2 = RT.i;
            String obj = b0.toString();
            rt2.getClass();
            return RT.b(obj);
        } catch (JSONException e) {
            throw new IllegalArgumentException("Invalid JSON", e);
        }
    }

    @Override // o.PC
    public C0208Hx h(ByteBuffer byteBuffer) {
        Object nextValue;
        Object obj = null;
        if (byteBuffer == null) {
            nextValue = null;
        } else {
            try {
                try {
                    RT.i.getClass();
                    JSONTokener jSONTokener = new JSONTokener(RT.a(byteBuffer));
                    nextValue = jSONTokener.nextValue();
                    if (jSONTokener.more()) {
                        throw new IllegalArgumentException("Invalid JSON");
                    }
                } catch (JSONException e) {
                    throw new IllegalArgumentException("Invalid JSON", e);
                }
            } catch (JSONException e2) {
                throw new IllegalArgumentException("Invalid JSON", e2);
            }
        }
        if (nextValue instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) nextValue;
            Object obj2 = jSONObject.get("method");
            Object opt = jSONObject.opt("args");
            if (opt != JSONObject.NULL) {
                obj = opt;
            }
            if (obj2 instanceof String) {
                return new C0208Hx((String) obj2, 5, obj);
            }
        }
        throw new IllegalArgumentException("Invalid method call: " + nextValue);
    }

    @Override // o.PC
    public Object i(ByteBuffer byteBuffer) {
        try {
            try {
                RT.i.getClass();
                JSONTokener jSONTokener = new JSONTokener(RT.a(byteBuffer));
                Object nextValue = jSONTokener.nextValue();
                if (jSONTokener.more()) {
                    throw new IllegalArgumentException("Invalid JSON");
                }
                if (nextValue instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) nextValue;
                    Object obj = null;
                    if (jSONArray.length() == 1) {
                        Object opt = jSONArray.opt(0);
                        if (opt == JSONObject.NULL) {
                            return null;
                        }
                        return opt;
                    }
                    if (jSONArray.length() == 3) {
                        Object obj2 = jSONArray.get(0);
                        Object opt2 = jSONArray.opt(1);
                        Object obj3 = JSONObject.NULL;
                        if (opt2 == obj3) {
                            opt2 = null;
                        }
                        Object opt3 = jSONArray.opt(2);
                        if (opt3 != obj3) {
                            obj = opt3;
                        }
                        if ((obj2 instanceof String) && (opt2 == null || (opt2 instanceof String))) {
                            throw new C1191hn((String) obj2, (String) opt2, obj);
                        }
                    }
                }
                throw new IllegalArgumentException("Invalid envelope: " + nextValue);
            } catch (JSONException e) {
                throw new IllegalArgumentException("Invalid JSON", e);
            }
        } catch (JSONException e2) {
            throw new IllegalArgumentException("Invalid JSON", e2);
        }
    }

    public boolean j(InterfaceC1118gg interfaceC1118gg, InterfaceC1118gg interfaceC1118gg2, boolean z2) {
        if ((interfaceC1118gg instanceof InterfaceC1245ib) && (interfaceC1118gg2 instanceof InterfaceC1245ib)) {
            return AbstractC0048Bt.h(((InterfaceC1245ib) interfaceC1118gg).z(), ((InterfaceC1245ib) interfaceC1118gg2).z());
        }
        if ((interfaceC1118gg instanceof InterfaceC1437lX) && (interfaceC1118gg2 instanceof InterfaceC1437lX)) {
            return k((InterfaceC1437lX) interfaceC1118gg, (InterfaceC1437lX) interfaceC1118gg2, z2, C1268j.s);
        }
        if (!(interfaceC1118gg instanceof InterfaceC2072v9) || !(interfaceC1118gg2 instanceof InterfaceC2072v9)) {
            return ((interfaceC1118gg instanceof InterfaceC0961eH) && (interfaceC1118gg2 instanceof InterfaceC0961eH)) ? AbstractC0048Bt.h(((AbstractC1027fH) ((InterfaceC0961eH) interfaceC1118gg)).l, ((AbstractC1027fH) ((InterfaceC0961eH) interfaceC1118gg2)).l) : AbstractC0048Bt.h(interfaceC1118gg, interfaceC1118gg2);
        }
        InterfaceC2072v9 interfaceC2072v9 = (InterfaceC2072v9) interfaceC1118gg;
        InterfaceC2072v9 interfaceC2072v92 = (InterfaceC2072v9) interfaceC1118gg2;
        AbstractC0048Bt.n(interfaceC2072v9, "a");
        AbstractC0048Bt.n(interfaceC2072v92, "b");
        if (!interfaceC2072v9.equals(interfaceC2072v92)) {
            if (AbstractC0048Bt.h(interfaceC2072v9.getName(), interfaceC2072v92.getName()) && ((!(interfaceC2072v9 instanceof OB) || !(interfaceC2072v92 instanceof OB) || ((OB) interfaceC2072v9).X() == ((OB) interfaceC2072v92).X()) && ((!AbstractC0048Bt.h(interfaceC2072v9.n(), interfaceC2072v92.n()) || (z2 && AbstractC0048Bt.h(x(interfaceC2072v9), x(interfaceC2072v92)))) && !AbstractC0114Eh.o(interfaceC2072v9) && !AbstractC0114Eh.o(interfaceC2072v92)))) {
                InterfaceC1118gg n2 = interfaceC2072v9.n();
                InterfaceC1118gg n3 = interfaceC2072v92.n();
                if (((n2 instanceof InterfaceC2204x9) || (n3 instanceof InterfaceC2204x9)) ? false : j(n2, n3, z2)) {
                    XG xg = new XG(new C1711ph(z2, interfaceC2072v9, interfaceC2072v92));
                    if (xg.m(interfaceC2072v9, interfaceC2072v92, null, true).c() != 1 || xg.m(interfaceC2072v92, interfaceC2072v9, null, true).c() != 1) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public boolean k(InterfaceC1437lX interfaceC1437lX, InterfaceC1437lX interfaceC1437lX2, boolean z2, InterfaceC2312yp interfaceC2312yp) {
        AbstractC0048Bt.n(interfaceC1437lX, "a");
        AbstractC0048Bt.n(interfaceC1437lX2, "b");
        if (interfaceC1437lX.equals(interfaceC1437lX2)) {
            return true;
        }
        if (AbstractC0048Bt.h(interfaceC1437lX.n(), interfaceC1437lX2.n())) {
            return false;
        }
        InterfaceC1118gg n2 = interfaceC1437lX.n();
        InterfaceC1118gg n3 = interfaceC1437lX2.n();
        return (((n2 instanceof InterfaceC2204x9) || (n3 instanceof InterfaceC2204x9)) ? ((Boolean) interfaceC2312yp.invoke(n2, n3)).booleanValue() : j(n2, n3, z2)) && interfaceC1437lX.getIndex() == interfaceC1437lX2.getIndex();
    }

    public String toString() {
        switch (this.h) {
            case 26:
                return "NeverEqualPolicy";
            default:
                return super.toString();
        }
    }
}
