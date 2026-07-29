package o;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: o.gL, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1097gL implements InterfaceC2289yS, InterfaceC2298yb, InterfaceC2301ye, InterfaceC1302jU, InterfaceC1765qV, MT, InterfaceC1271j1, OC, EU, InterfaceC1280j8, GS {
    public static final C1097gL i = new C1097gL(1);
    public static final C1097gL j = new C1097gL(2);
    public static final C1097gL k = new C1097gL(4);
    public static final C1097gL l = new C1097gL(5);
    public static final C1097gL m = new C1097gL(6);
    public static final C1097gL n = new C1097gL(7);

    /* renamed from: o, reason: collision with root package name */
    public static final C1097gL f168o = new C1097gL(8);
    public static final C1097gL p = new C1097gL(9);
    public static final /* synthetic */ C1097gL q = new C1097gL(10);
    public static final /* synthetic */ C1097gL r = new C1097gL(11);
    public static final /* synthetic */ C1097gL s = new C1097gL(12);
    public final /* synthetic */ int h;

    public /* synthetic */ C1097gL(int i2) {
        this.h = i2;
    }

    public static boolean D0(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static String F0(String str) {
        if (str == null || UT.J(str)) {
            return "null";
        }
        if (str.length() <= 8) {
            return "***";
        }
        return str.length() + "ch";
    }

    public static int G0(EnumC2149wK enumC2149wK) {
        int i2 = enumC2149wK == null ? -1 : AbstractC1031fL.a[enumC2149wK.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return 3;
            }
            if (i2 == 3) {
                return 4;
            }
            if (i2 == 4) {
                return 2;
            }
        }
        return 1;
    }

    public static X6 L() {
        X6 x6 = X6.l;
        AbstractC0048Bt.k(x6);
        X6 x62 = x6.f;
        if (x62 == null) {
            long nanoTime = System.nanoTime();
            X6.i.await(X6.j, TimeUnit.MILLISECONDS);
            X6 x63 = X6.l;
            AbstractC0048Bt.k(x63);
            if (x63.f != null || System.nanoTime() - nanoTime < X6.k) {
                return null;
            }
            return X6.l;
        }
        long nanoTime2 = x62.g - System.nanoTime();
        if (nanoTime2 > 0) {
            X6.i.await(nanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        X6 x64 = X6.l;
        AbstractC0048Bt.k(x64);
        x64.f = x62.f;
        x62.f = null;
        x62.e = 2;
        return x62;
    }

    public static String[] W(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static C1347k9 c0(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            bArr[i2] = (byte) (AbstractC1473m3.c(str.charAt(i3 + 1)) + (AbstractC1473m3.c(str.charAt(i3)) << 4));
        }
        return new C1347k9(bArr);
    }

    public static C1347k9 d0(String str) {
        AbstractC0048Bt.n(str, "<this>");
        byte[] bytes = str.getBytes(AbstractC0470Sa.a);
        AbstractC0048Bt.m(bytes, "getBytes(...)");
        C1347k9 c1347k9 = new C1347k9(bytes);
        c1347k9.j = str;
        return c1347k9;
    }

    public static final boolean r() {
        Class cls = S2.E0;
        try {
            if (S2.E0 == null) {
                Class<?> cls2 = Class.forName("android.os.SystemProperties");
                S2.E0 = cls2;
                S2.F0 = cls2.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
            }
            Method method = S2.F0;
            Object invoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            Boolean bool = invoke instanceof Boolean ? (Boolean) invoke : null;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static LinkedHashSet r0(String str, String... strArr) {
        AbstractC0048Bt.n(str, "internalName");
        AbstractC0048Bt.n(strArr, "signatures");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : strArr) {
            linkedHashSet.add(str + '.' + str2);
        }
        return linkedHashSet;
    }

    public static final C0850cb t(C1097gL c1097gL, String str) {
        C0850cb c0850cb = new C0850cb(str);
        C0850cb.d.put(str, c0850cb);
        return c0850cb;
    }

    public static final void u(X6 x6, long j2, boolean z) {
        X6 x62;
        ReentrantLock reentrantLock = X6.h;
        if (X6.l == null) {
            X6.l = new X6();
            U6 u6 = new U6("Okio Watchdog");
            u6.setDaemon(true);
            u6.start();
        }
        long nanoTime = System.nanoTime();
        if (j2 != 0 && z) {
            x6.g = Math.min(j2, x6.c() - nanoTime) + nanoTime;
        } else if (j2 != 0) {
            x6.g = j2 + nanoTime;
        } else {
            if (!z) {
                throw new AssertionError();
            }
            x6.g = x6.c();
        }
        long j3 = x6.g - nanoTime;
        X6 x63 = X6.l;
        AbstractC0048Bt.k(x63);
        while (true) {
            x62 = x63.f;
            if (x62 == null || j3 < x62.g - nanoTime) {
                break;
            }
            AbstractC0048Bt.k(x62);
            x63 = x62;
        }
        x6.f = x62;
        x63.f = x6;
        if (x63 == X6.l) {
            X6.i.signal();
        }
    }

    public static LinkedHashSet u0(String str, String... strArr) {
        AbstractC0048Bt.n(strArr, "signatures");
        return r0("java/lang/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final C0968eO x(C0968eO c0968eO) {
        if ((c0968eO != null ? c0968eO.n : null) == null) {
            return c0968eO;
        }
        C0903dO c = c0968eO.c();
        c.g = null;
        return c.a();
    }

    public static LinkedHashSet z0(String str, String... strArr) {
        return r0("java/util/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // o.InterfaceC2298yb
    public void A(MR mr) {
        PX.s0(mr);
    }

    @Override // o.InterfaceC2298yb
    public int A0(NW nw) {
        AbstractC0048Bt.n(nw, "<this>");
        if (nw instanceof MR) {
            return PX.l((InterfaceC1266iy) nw);
        }
        if (nw instanceof B6) {
            return ((B6) nw).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + nw + ", " + UM.a.b(nw.getClass())).toString());
    }

    @Override // o.InterfaceC2298yb
    public AbstractC1701pX B(InterfaceC1266iy interfaceC1266iy, int i2) {
        return PX.K(interfaceC1266iy, i2);
    }

    @Override // o.InterfaceC2298yb
    public C1767qX B0(InterfaceC1266iy interfaceC1266iy) {
        return PX.r(interfaceC1266iy);
    }

    @Override // o.InterfaceC2298yb
    public AbstractC2097vY C(ArrayList arrayList) {
        JR jr;
        int size = arrayList.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types");
        }
        if (size == 1) {
            return (AbstractC2097vY) AbstractC0720ac.D0(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(AbstractC0786bc.d0(arrayList));
        Iterator it = arrayList.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            AbstractC2097vY abstractC2097vY = (AbstractC2097vY) it.next();
            z = z || AbstractC1473m3.P(abstractC2097vY);
            if (abstractC2097vY instanceof JR) {
                jr = (JR) abstractC2097vY;
            } else {
                if (!(abstractC2097vY instanceof AbstractC1782qm)) {
                    throw new C0057Cc();
                }
                AbstractC0048Bt.n(abstractC2097vY, "<this>");
                jr = ((AbstractC1782qm) abstractC2097vY).i;
                z2 = true;
            }
            arrayList2.add(jr);
        }
        if (z) {
            return C0273Kk.c(EnumC0247Jk.E, arrayList.toString());
        }
        C1241iX c1241iX = C1241iX.a;
        if (!z2) {
            return c1241iX.b(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(AbstractC0786bc.d0(arrayList));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(AbstractC0868ct.a0((AbstractC2097vY) it2.next()));
        }
        return HO.m(c1241iX.b(arrayList2), c1241iX.b(arrayList3));
    }

    @Override // o.InterfaceC2298yb
    public void C0(MR mr) {
        PX.r0(mr);
    }

    @Override // o.InterfaceC2298yb
    public InterfaceC1266iy D(InterfaceC1266iy interfaceC1266iy) {
        return PX.T0(this, interfaceC1266iy);
    }

    @Override // o.InterfaceC2298yb
    public boolean E(MR mr) {
        AbstractC0048Bt.n(mr, "<this>");
        return PX.j0(PX.Q0(mr));
    }

    public InterfaceC1266iy E0(InterfaceC1266iy interfaceC1266iy) {
        JR U0;
        AbstractC0048Bt.n(interfaceC1266iy, "<this>");
        JR q2 = PX.q(interfaceC1266iy);
        return (q2 == null || (U0 = PX.U0(q2, true)) == null) ? interfaceC1266iy : U0;
    }

    @Override // o.InterfaceC2298yb
    public boolean F(MR mr) {
        AbstractC0048Bt.n(mr, "<this>");
        return PX.m0(a(mr)) && !PX.n0(mr);
    }

    @Override // o.InterfaceC2298yb
    public boolean G(AbstractC1701pX abstractC1701pX) {
        return PX.q0(abstractC1701pX);
    }

    @Override // o.InterfaceC2298yb
    public boolean H(TW tw) {
        return PX.k0(tw);
    }

    public C0904dP H0(InterfaceC0738au interfaceC0738au) {
        AbstractC0048Bt.n(interfaceC0738au, "javaElement");
        return new C0904dP((BM) interfaceC0738au);
    }

    @Override // o.InterfaceC2298yb
    public boolean I(TW tw) {
        return PX.f0(tw);
    }

    @Override // o.InterfaceC2298yb
    public boolean J(TW tw, TW tw2) {
        return PX.k(tw, tw2);
    }

    @Override // o.InterfaceC2298yb
    public JR K(MR mr, boolean z) {
        return PX.U0(mr, z);
    }

    @Override // o.InterfaceC2298yb
    public AbstractC1701pX M(InterfaceC1440la interfaceC1440la) {
        return PX.G0(interfaceC1440la);
    }

    @Override // o.InterfaceC2298yb
    public boolean N(InterfaceC1266iy interfaceC1266iy) {
        AbstractC0048Bt.n(interfaceC1266iy, "<this>");
        JR q2 = PX.q(interfaceC1266iy);
        return (q2 != null ? PX.o(q2) : null) != null;
    }

    @Override // o.InterfaceC2298yb
    public boolean O(InterfaceC1638oa interfaceC1638oa) {
        AbstractC0048Bt.n(interfaceC1638oa, "$receiver");
        return interfaceC1638oa instanceof C1308ja;
    }

    @Override // o.InterfaceC2298yb
    public SW Q(MR mr) {
        return PX.Q0(mr);
    }

    @Override // o.InterfaceC2298yb
    public int R(AbstractC1701pX abstractC1701pX) {
        return PX.W(abstractC1701pX);
    }

    @Override // o.InterfaceC2298yb
    public boolean S(TW tw) {
        return PX.j0(tw);
    }

    @Override // o.InterfaceC2298yb
    public C2077vE T(InterfaceC1638oa interfaceC1638oa) {
        return PX.P0(interfaceC1638oa);
    }

    @Override // o.InterfaceC2298yb
    public AbstractC2097vY U(InterfaceC1266iy interfaceC1266iy) {
        return PX.x0(interfaceC1266iy);
    }

    @Override // o.InterfaceC2298yb
    public InterfaceC1437lX V(TW tw, int i2) {
        return PX.T(tw, i2);
    }

    @Override // o.InterfaceC2298yb
    public JR X(AbstractC1782qm abstractC1782qm) {
        return PX.v0(abstractC1782qm);
    }

    @Override // o.InterfaceC2298yb
    public JR Y(AbstractC1782qm abstractC1782qm) {
        return PX.S0(abstractC1782qm);
    }

    @Override // o.InterfaceC2298yb
    public JR Z(MR mr) {
        return PX.t(mr);
    }

    @Override // o.InterfaceC2298yb
    public SW a(InterfaceC1266iy interfaceC1266iy) {
        AbstractC0048Bt.n(interfaceC1266iy, "<this>");
        JR q2 = PX.q(interfaceC1266iy);
        if (q2 == null) {
            q2 = b(interfaceC1266iy);
        }
        return PX.Q0(q2);
    }

    @Override // o.InterfaceC2298yb
    public AbstractC1701pX a0(MR mr, int i2) {
        AbstractC0048Bt.n(mr, "<this>");
        if (i2 < 0 || i2 >= PX.l(mr)) {
            return null;
        }
        return PX.K(mr, i2);
    }

    @Override // o.InterfaceC2298yb
    public JR b(InterfaceC1266iy interfaceC1266iy) {
        JR v0;
        AbstractC0048Bt.n(interfaceC1266iy, "<this>");
        AbstractC1782qm p2 = PX.p(interfaceC1266iy);
        if (p2 != null && (v0 = PX.v0(p2)) != null) {
            return v0;
        }
        JR q2 = PX.q(interfaceC1266iy);
        AbstractC0048Bt.k(q2);
        return q2;
    }

    @Override // o.InterfaceC2298yb
    public JR b0(C0632Yg c0632Yg) {
        return PX.A0(c0632Yg);
    }

    @Override // o.InterfaceC2298yb
    public boolean c(MR mr) {
        return PX.h0(mr);
    }

    @Override // o.InterfaceC2289yS
    public boolean d(Object obj, Object obj2) {
        return obj == obj2;
    }

    @Override // o.InterfaceC2298yb
    public AbstractC2097vY e(MR mr, MR mr2) {
        return PX.B(this, mr, mr2);
    }

    @Override // o.InterfaceC2298yb
    public void e0(InterfaceC1266iy interfaceC1266iy) {
        AbstractC0048Bt.n(interfaceC1266iy, "<this>");
        PX.p(interfaceC1266iy);
    }

    @Override // o.InterfaceC2298yb
    public Collection f(MR mr) {
        return PX.F0(this, mr);
    }

    @Override // o.InterfaceC2298yb
    public boolean f0(TW tw) {
        return PX.m0(tw);
    }

    @Override // o.InterfaceC2298yb
    public boolean g(AbstractC2097vY abstractC2097vY) {
        AbstractC0048Bt.n(abstractC2097vY, "<this>");
        return PX.l0(b(abstractC2097vY)) != PX.l0(j0(abstractC2097vY));
    }

    @Override // o.InterfaceC2298yb
    public NW g0(MR mr) {
        return PX.m(mr);
    }

    @Override // o.MT
    public Exception getException(Status status) {
        return status.j != null ? new QN(status) : new F4(status);
    }

    @Override // o.InterfaceC2298yb
    public boolean h(InterfaceC1638oa interfaceC1638oa) {
        return PX.p0(interfaceC1638oa);
    }

    @Override // o.InterfaceC2298yb
    public JR h0(InterfaceC1266iy interfaceC1266iy) {
        return PX.q(interfaceC1266iy);
    }

    @Override // o.InterfaceC2298yb
    public boolean i(InterfaceC1266iy interfaceC1266iy) {
        AbstractC0048Bt.n(interfaceC1266iy, "$receiver");
        return interfaceC1266iy instanceof ZE;
    }

    public synchronized C0850cb i0(String str) {
        C0850cb c0850cb;
        String str2;
        try {
            AbstractC0048Bt.n(str, "javaName");
            LinkedHashMap linkedHashMap = C0850cb.d;
            c0850cb = (C0850cb) linkedHashMap.get(str);
            if (c0850cb == null) {
                if (AbstractC0778bU.B(str, "TLS_", false)) {
                    String substring = str.substring(4);
                    AbstractC0048Bt.m(substring, "this as java.lang.String).substring(startIndex)");
                    str2 = "SSL_".concat(substring);
                } else if (AbstractC0778bU.B(str, "SSL_", false)) {
                    String substring2 = str.substring(4);
                    AbstractC0048Bt.m(substring2, "this as java.lang.String).substring(startIndex)");
                    str2 = "TLS_".concat(substring2);
                } else {
                    str2 = str;
                }
                c0850cb = (C0850cb) linkedHashMap.get(str2);
                if (c0850cb == null) {
                    c0850cb = new C0850cb(str);
                }
                linkedHashMap.put(str, c0850cb);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c0850cb;
    }

    @Override // o.InterfaceC2298yb
    public boolean j(TW tw) {
        return PX.e0(tw);
    }

    @Override // o.InterfaceC2298yb
    public JR j0(InterfaceC1266iy interfaceC1266iy) {
        JR S0;
        AbstractC0048Bt.n(interfaceC1266iy, "<this>");
        AbstractC1782qm p2 = PX.p(interfaceC1266iy);
        if (p2 != null && (S0 = PX.S0(p2)) != null) {
            return S0;
        }
        JR q2 = PX.q(interfaceC1266iy);
        AbstractC0048Bt.k(q2);
        return q2;
    }

    @Override // o.InterfaceC2298yb
    public int k(InterfaceC1437lX interfaceC1437lX) {
        AbstractC0048Bt.n(interfaceC1437lX, "$receiver");
        int Y = interfaceC1437lX.Y();
        AbstractC1888sN.t(Y, "this.variance");
        return ON.f(Y);
    }

    @Override // o.InterfaceC2298yb
    public boolean k0(TW tw) {
        return PX.g0(tw);
    }

    @Override // o.InterfaceC2298yb
    public C0632Yg l(MR mr) {
        return PX.o(mr);
    }

    @Override // o.InterfaceC2298yb
    public int l0(InterfaceC1266iy interfaceC1266iy) {
        return PX.l(interfaceC1266iy);
    }

    @Override // o.InterfaceC1302jU
    public MU m(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i2 = TO.h;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? DY.i(bundle) : DY.i(null);
    }

    @Override // o.InterfaceC2298yb
    public boolean m0(MR mr) {
        AbstractC0048Bt.n(mr, "<this>");
        JR q2 = PX.q(mr);
        return (q2 != null ? PX.n(this, q2) : null) != null;
    }

    @Override // o.InterfaceC2301ye
    public Object n(MU mu) {
        if (mu.i()) {
            return (Bundle) mu.g();
        }
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Error making request: ".concat(String.valueOf(mu.f())));
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", mu.f());
    }

    public Signature[] n0(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC2298yb
    public AbstractC1701pX o(NW nw, int i2) {
        AbstractC0048Bt.n(nw, "<this>");
        if (nw instanceof MR) {
            return PX.K((InterfaceC1266iy) nw, i2);
        }
        if (nw instanceof B6) {
            E e = ((B6) nw).get(i2);
            AbstractC0048Bt.m(e, "get(index)");
            return (AbstractC1701pX) e;
        }
        throw new IllegalStateException(("unknown type argument list type: " + nw + ", " + UM.a.b(nw.getClass())).toString());
    }

    @Override // o.InterfaceC2298yb
    public AbstractC2097vY o0(AbstractC1701pX abstractC1701pX) {
        return PX.U(abstractC1701pX);
    }

    @Override // o.InterfaceC2298yb
    public int p(TW tw) {
        return PX.B0(tw);
    }

    @Override // o.InterfaceC2298yb
    public MR p0(MR mr) {
        JR A0;
        AbstractC0048Bt.n(mr, "<this>");
        C0632Yg o2 = PX.o(mr);
        return (o2 == null || (A0 = PX.A0(o2)) == null) ? mr : A0;
    }

    @Override // o.InterfaceC2298yb
    public boolean q(MR mr, MR mr2) {
        return PX.Z(mr, mr2);
    }

    @Override // o.InterfaceC2298yb
    public boolean q0(MR mr) {
        return PX.l0(mr);
    }

    @Override // o.InterfaceC1280j8
    public void s(ByteBuffer byteBuffer, C1511mf c1511mf) {
        RT.i.getClass();
        RT.a(byteBuffer);
    }

    @Override // o.InterfaceC2298yb
    public boolean s0(TW tw) {
        return PX.c0(tw);
    }

    @Override // o.InterfaceC2298yb
    public AbstractC1782qm t0(InterfaceC1266iy interfaceC1266iy) {
        return PX.p(interfaceC1266iy);
    }

    public String toString() {
        switch (this.h) {
            case 1:
                return "ReferentialEqualityPolicy";
            default:
                return super.toString();
        }
    }

    @Override // o.OC
    public void v(C0208Hx c0208Hx, NC nc) {
        nc.d(null);
    }

    @Override // o.InterfaceC2298yb
    public InterfaceC1638oa v0(MR mr) {
        return PX.n(this, mr);
    }

    @Override // o.InterfaceC2298yb
    public C2232xb w(MR mr) {
        return PX.M0(this, mr);
    }

    @Override // o.InterfaceC2298yb
    public boolean w0(InterfaceC1437lX interfaceC1437lX, TW tw) {
        return PX.Y(interfaceC1437lX, tw);
    }

    @Override // o.InterfaceC2298yb
    public Collection x0(TW tw) {
        return PX.N0(tw);
    }

    @Override // o.InterfaceC2298yb
    public boolean y(MR mr) {
        AbstractC0048Bt.n(mr, "<this>");
        return PX.e0(PX.Q0(mr));
    }

    @Override // o.InterfaceC2298yb
    public int y0(InterfaceC1638oa interfaceC1638oa) {
        return PX.u(interfaceC1638oa);
    }

    @Override // o.InterfaceC2298yb
    public AbstractC2097vY z(InterfaceC1638oa interfaceC1638oa) {
        return PX.w0(interfaceC1638oa);
    }

    public C1097gL(C1183hf c1183hf, int i2) {
        this.h = i2;
        switch (i2) {
            case 28:
                new C0950e6(c1183hf, "flutter/deferredcomponent", C1367kT.h, 16).Q(new C1623oL(27, this));
                C0950e6.D().getClass();
                new HashMap();
                break;
        }
    }

    @Override // o.InterfaceC2298yb
    public void P(MR mr, TW tw) {
    }
}
