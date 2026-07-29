package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.devanos.nilufar.usmonova.R;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.firebase.messaging.Constants;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: o.Hx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0208Hx implements OC, InterfaceC2374zl, InterfaceC1280j8, InterfaceC0893dE, InterfaceC2012uF, InterfaceC2298yb, InterfaceC2279yI, AI, BP, InterfaceC0821c8 {
    public static C0208Hx k;
    public static C0363Nx l;
    public final /* synthetic */ int h;
    public Object i;
    public Object j;

    public /* synthetic */ C0208Hx(int i, Object obj, Object obj2, boolean z) {
        this.h = i;
        this.j = obj;
        this.i = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0080 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int D0(C0208Hx c0208Hx, JSONArray jSONArray) {
        String str;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            String string = jSONArray.getString(i3);
            for (int i4 : AbstractC1888sN.x(4)) {
                if (i4 == 1) {
                    str = "DeviceOrientation.portraitUp";
                } else if (i4 == 2) {
                    str = "DeviceOrientation.portraitDown";
                } else if (i4 == 3) {
                    str = "DeviceOrientation.landscapeLeft";
                } else {
                    if (i4 != 4) {
                        throw null;
                    }
                    str = "DeviceOrientation.landscapeRight";
                }
                if (str.equals(string)) {
                    int v = AbstractC1888sN.v(i4);
                    if (v == 0) {
                        i |= 1;
                    } else if (v == 1) {
                        i |= 4;
                    } else if (v == 2) {
                        i |= 2;
                    } else if (v == 3) {
                        i |= 8;
                    }
                    if (i2 == 0) {
                        i2 = i;
                    }
                }
            }
            throw new NoSuchFieldException(AbstractC1888sN.s("No such DeviceOrientation: ", string));
        }
        if (i == 0) {
            return -1;
        }
        switch (i) {
            case 2:
                return 0;
            case 3:
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 9:
            case 12:
            case 13:
            case 14:
                if (i2 == 2) {
                    return 0;
                }
                if (i2 != 4) {
                    return i2 != 8 ? 1 : 8;
                }
                return 9;
            case 4:
                return 9;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                return 12;
            case 10:
                return 11;
            case 11:
                return 2;
            case 15:
                return 13;
        }
    }

    public static ArrayList E0(C0208Hx c0208Hx, JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            for (EnumC1094gI enumC1094gI : EnumC1094gI.values()) {
                if (enumC1094gI.h.equals(string)) {
                    int ordinal = enumC1094gI.ordinal();
                    if (ordinal == 0) {
                        arrayList.add(EnumC1094gI.i);
                    } else if (ordinal == 1) {
                        arrayList.add(EnumC1094gI.j);
                    }
                }
            }
            throw new NoSuchFieldException(AbstractC1888sN.s("No such SystemUiOverlay: ", string));
        }
        return arrayList;
    }

    public static int F0(C0208Hx c0208Hx, String str) {
        String str2;
        for (int i : AbstractC1888sN.x(4)) {
            if (i == 1) {
                str2 = "SystemUiMode.leanBack";
            } else if (i == 2) {
                str2 = "SystemUiMode.immersive";
            } else if (i == 3) {
                str2 = "SystemUiMode.immersiveSticky";
            } else {
                if (i != 4) {
                    throw null;
                }
                str2 = "SystemUiMode.edgeToEdge";
            }
            if (str2.equals(str)) {
                int v = AbstractC1888sN.v(i);
                if (v == 0) {
                    return 1;
                }
                if (v != 1) {
                    return v != 2 ? 4 : 3;
                }
                return 2;
            }
        }
        throw new NoSuchFieldException(AbstractC1888sN.s("No such SystemUiMode: ", str));
    }

    public static C1028fI G0(C0208Hx c0208Hx, JSONObject jSONObject) {
        return new C1028fI(!jSONObject.isNull("statusBarColor") ? Integer.valueOf(jSONObject.getInt("statusBarColor")) : null, !jSONObject.isNull("statusBarIconBrightness") ? AbstractC2188wx.b(jSONObject.getString("statusBarIconBrightness")) : 0, !jSONObject.isNull("systemStatusBarContrastEnforced") ? Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced")) : null, !jSONObject.isNull("systemNavigationBarColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null, jSONObject.isNull("systemNavigationBarIconBrightness") ? 0 : AbstractC2188wx.b(jSONObject.getString("systemNavigationBarIconBrightness")), !jSONObject.isNull("systemNavigationBarDividerColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")) : null, jSONObject.isNull("systemNavigationBarContrastEnforced") ? null : Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced")));
    }

    public static OW I0(List list) {
        return list.isEmpty() ? OW.j : new OW(list);
    }

    public static HashMap J0(String str, int i, int i2, int i3, int i4) {
        HashMap hashMap = new HashMap();
        hashMap.put("text", str);
        hashMap.put("selectionBase", Integer.valueOf(i));
        hashMap.put("selectionExtent", Integer.valueOf(i2));
        hashMap.put("composingBase", Integer.valueOf(i3));
        hashMap.put("composingExtent", Integer.valueOf(i4));
        return hashMap;
    }

    public static void K0(C0027Ay c0027Ay) {
        C0209Hy c0209Hy = c0027Ay.v;
        if (c0209Hy.b == 5 && !c0209Hy.d && !c0209Hy.c && !c0027Ay.B && c0027Ay.w()) {
            TC tc = (TC) c0027Ay.u.f;
            if ((tc.d & 256) != 0) {
                while (tc != null) {
                    if ((tc.c & 256) != 0) {
                        for (TC tc2 = tc; tc2 != null; tc2 = null) {
                            if (tc2 instanceof X7) {
                                X7 x7 = (X7) tc2;
                                AbstractC0946e20.I(x7, 256);
                                AbstractC0048Bt.l(x7.n, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
                                throw new ClassCastException();
                            }
                        }
                    }
                    if ((tc.d & 256) == 0) {
                        break;
                    } else {
                        tc = tc.f;
                    }
                }
            }
        }
        int i = 0;
        c0027Ay.A = false;
        YD o2 = c0027Ay.o();
        int i2 = o2.j;
        if (i2 > 0) {
            Object[] objArr = o2.h;
            do {
                K0((C0027Ay) objArr[i]);
                i++;
            } while (i < i2);
        }
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
    public AbstractC1701pX B(InterfaceC1266iy interfaceC1266iy, int i) {
        return PX.K(interfaceC1266iy, i);
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

    public void H0(Object obj, String str) {
        ((ArrayList) this.i).add(str + "=" + String.valueOf(obj));
    }

    @Override // o.InterfaceC2298yb
    public boolean I(TW tw) {
        return PX.f0(tw);
    }

    @Override // o.InterfaceC2298yb
    public boolean J(TW tw, TW tw2) {
        AbstractC0048Bt.n(tw, "c1");
        AbstractC0048Bt.n(tw2, "c2");
        if (!(tw instanceof SW)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (!(tw2 instanceof SW)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (PX.k(tw, tw2)) {
            return true;
        }
        SW sw = (SW) tw;
        SW sw2 = (SW) tw2;
        Map map = (Map) this.i;
        if (((InterfaceC1070fy) this.j).g(sw, sw2)) {
            return true;
        }
        if (map == null) {
            return false;
        }
        SW sw3 = (SW) map.get(sw);
        SW sw4 = (SW) map.get(sw2);
        if (sw3 == null || !sw3.equals(sw2)) {
            return sw4 != null && sw4.equals(sw);
        }
        return true;
    }

    @Override // o.InterfaceC2298yb
    public JR K(MR mr, boolean z) {
        return PX.U0(mr, z);
    }

    @Override // o.InterfaceC2279yI
    public void L(int i) {
        ((CI) this.j).L(i);
        ((DI) this.i).L(i);
    }

    public void L0(String str, InterfaceC2114vp interfaceC2114vp) {
        LinkedHashMap linkedHashMap = ((C1745qB) this.j).a;
        CR cr = new CR(this, str);
        interfaceC2114vp.invoke(cr);
        String str2 = (String) this.i;
        ArrayList arrayList = cr.a;
        ArrayList arrayList2 = new ArrayList(AbstractC0786bc.d0(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) ((C1619oH) it.next()).h);
        }
        String str3 = (String) cr.b.h;
        AbstractC0048Bt.n(str3, "ret");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('(');
        sb.append(AbstractC0720ac.t0(arrayList2, "", null, null, RP.q, 30));
        sb.append(')');
        if (str3.length() > 1) {
            str3 = "L" + str3 + ';';
        }
        sb.append(str3);
        String sb2 = sb.toString();
        AbstractC0048Bt.n(str2, "internalName");
        AbstractC0048Bt.n(sb2, "jvmDescriptor");
        String str4 = str2 + '.' + sb2;
        ZW zw = (ZW) cr.b.i;
        ArrayList arrayList3 = new ArrayList(AbstractC0786bc.d0(arrayList));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add((ZW) ((C1619oH) it2.next()).i);
        }
        linkedHashMap.put(str4, new UI(zw, arrayList3));
    }

    @Override // o.InterfaceC2298yb
    public AbstractC1701pX M(InterfaceC1440la interfaceC1440la) {
        return PX.G0(interfaceC1440la);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CctBackendFactory M0(String str) {
        Bundle bundle;
        Map map;
        PackageManager packageManager;
        if (((Map) this.i) == null) {
            Context context = (Context) this.j;
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
            }
            if (packageManager == null) {
                Log.w("BackendRegistry", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo == null) {
                    Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                    if (bundle != null) {
                        Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                        map = Collections.EMPTY_MAP;
                    } else {
                        HashMap hashMap = new HashMap();
                        for (String str2 : bundle.keySet()) {
                            Object obj = bundle.get(str2);
                            if ((obj instanceof String) && str2.startsWith("backend:")) {
                                for (String str3 : ((String) obj).split(",", -1)) {
                                    String trim = str3.trim();
                                    if (!trim.isEmpty()) {
                                        hashMap.put(trim, str2.substring(8));
                                    }
                                }
                            }
                        }
                        map = hashMap;
                    }
                    this.i = map;
                }
            }
            bundle = null;
            if (bundle != null) {
            }
            this.i = map;
        }
        String str4 = (String) ((Map) this.i).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e);
            return null;
        } catch (IllegalAccessException e2) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e2);
            return null;
        } catch (InstantiationException e3) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e3);
            return null;
        } catch (NoSuchMethodException e4) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e4);
            return null;
        } catch (InvocationTargetException e5) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e5);
            return null;
        }
    }

    @Override // o.InterfaceC2298yb
    public boolean N(InterfaceC1266iy interfaceC1266iy) {
        AbstractC0048Bt.n(interfaceC1266iy, "<this>");
        JR q = PX.q(interfaceC1266iy);
        return (q != null ? PX.o(q) : null) != null;
    }

    public AbstractC2097vY N0(C1658ou c1658ou) {
        AbstractC2097vY w;
        JR jr = c1658ou.f;
        return (jr == null || (w = AbstractC0772bO.w(jr)) == null) ? (C0195Hk) ((BU) this.i).getValue() : w;
    }

    @Override // o.InterfaceC2298yb
    public boolean O(InterfaceC1638oa interfaceC1638oa) {
        AbstractC0048Bt.n(interfaceC1638oa, "$receiver");
        return interfaceC1638oa instanceof C1308ja;
    }

    public AbstractC1004ey O0(InterfaceC1437lX interfaceC1437lX, C1658ou c1658ou) {
        AbstractC0048Bt.n(interfaceC1437lX, "typeParameter");
        AbstractC0048Bt.n(c1658ou, "typeAttr");
        return (AbstractC1004ey) ((PA) this.j).invoke(new C1635oX(interfaceC1437lX, c1658ou));
    }

    public int P0(InterfaceC0517Tv interfaceC0517Tv) {
        int intValue;
        AbstractC0048Bt.n(interfaceC0517Tv, "kClass");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.i;
        String a = interfaceC0517Tv.a();
        AbstractC0048Bt.k(a);
        C2084vL c2084vL = new C2084vL(10, this);
        AbstractC0048Bt.n(concurrentHashMap, "<this>");
        Integer num = (Integer) concurrentHashMap.get(a);
        if (num != null) {
            return num.intValue();
        }
        synchronized (concurrentHashMap) {
            try {
                Integer num2 = (Integer) concurrentHashMap.get(a);
                if (num2 == null) {
                    Object invoke = c2084vL.invoke(a);
                    concurrentHashMap.putIfAbsent(a, Integer.valueOf(((Number) invoke).intValue()));
                    num2 = (Integer) invoke;
                }
                intValue = num2.intValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return intValue;
    }

    @Override // o.InterfaceC2298yb
    public SW Q(MR mr) {
        return PX.Q0(mr);
    }

    public String Q0(String str) {
        String str2 = (String) this.j;
        Resources resources = (Resources) this.i;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    @Override // o.InterfaceC2298yb
    public int R(AbstractC1701pX abstractC1701pX) {
        return PX.W(abstractC1701pX);
    }

    public VQ R0(C2096vX c2096vX, List list, C1658ou c1658ou) {
        AbstractC2097vY abstractC2097vY;
        VQ vq = new VQ(new C2140wB());
        Iterator it = list.iterator();
        if (it.hasNext()) {
            AbstractC1004ey abstractC1004ey = (AbstractC1004ey) it.next();
            InterfaceC2364zb c = abstractC1004ey.B0().c();
            if (c instanceof InterfaceC1245ib) {
                Set set = c1658ou.e;
                AbstractC2097vY E0 = abstractC1004ey.E0();
                if (E0 instanceof AbstractC1782qm) {
                    AbstractC1782qm abstractC1782qm = (AbstractC1782qm) E0;
                    JR jr = abstractC1782qm.i;
                    if (!jr.B0().getParameters().isEmpty() && jr.B0().c() != null) {
                        List<InterfaceC1437lX> parameters = jr.B0().getParameters();
                        AbstractC0048Bt.m(parameters, "constructor.parameters");
                        ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(parameters));
                        for (InterfaceC1437lX interfaceC1437lX : parameters) {
                            AbstractC1701pX abstractC1701pX = (AbstractC1701pX) AbstractC0720ac.q0(interfaceC1437lX.getIndex(), abstractC1004ey.w0());
                            boolean z = set != null && set.contains(interfaceC1437lX);
                            if (abstractC1701pX != null && !z) {
                                AbstractC1964tX f = c2096vX.f();
                                AbstractC1004ey b = abstractC1701pX.b();
                                AbstractC0048Bt.m(b, "argument.type");
                                if (f.d(b) != null) {
                                    arrayList.add(abstractC1701pX);
                                }
                            }
                            abstractC1701pX = new C1631oT(interfaceC1437lX);
                            arrayList.add(abstractC1701pX);
                        }
                        jr = DY.p(jr, arrayList, null, 2);
                    }
                    JR jr2 = abstractC1782qm.j;
                    if (!jr2.B0().getParameters().isEmpty() && jr2.B0().c() != null) {
                        List<InterfaceC1437lX> parameters2 = jr2.B0().getParameters();
                        AbstractC0048Bt.m(parameters2, "constructor.parameters");
                        ArrayList arrayList2 = new ArrayList(AbstractC0786bc.d0(parameters2));
                        for (InterfaceC1437lX interfaceC1437lX2 : parameters2) {
                            AbstractC1701pX abstractC1701pX2 = (AbstractC1701pX) AbstractC0720ac.q0(interfaceC1437lX2.getIndex(), abstractC1004ey.w0());
                            boolean z2 = set != null && set.contains(interfaceC1437lX2);
                            if (abstractC1701pX2 != null && !z2) {
                                AbstractC1964tX f2 = c2096vX.f();
                                AbstractC1004ey b2 = abstractC1701pX2.b();
                                AbstractC0048Bt.m(b2, "argument.type");
                                if (f2.d(b2) != null) {
                                    arrayList2.add(abstractC1701pX2);
                                }
                            }
                            abstractC1701pX2 = new C1631oT(interfaceC1437lX2);
                            arrayList2.add(abstractC1701pX2);
                        }
                        jr2 = DY.p(jr2, arrayList2, null, 2);
                    }
                    abstractC2097vY = HO.m(jr, jr2);
                } else {
                    if (!(E0 instanceof JR)) {
                        throw new C0057Cc();
                    }
                    JR jr3 = (JR) E0;
                    if (jr3.B0().getParameters().isEmpty() || jr3.B0().c() == null) {
                        abstractC2097vY = jr3;
                    } else {
                        List<InterfaceC1437lX> parameters3 = jr3.B0().getParameters();
                        AbstractC0048Bt.m(parameters3, "constructor.parameters");
                        ArrayList arrayList3 = new ArrayList(AbstractC0786bc.d0(parameters3));
                        for (InterfaceC1437lX interfaceC1437lX3 : parameters3) {
                            AbstractC1701pX abstractC1701pX3 = (AbstractC1701pX) AbstractC0720ac.q0(interfaceC1437lX3.getIndex(), abstractC1004ey.w0());
                            boolean z3 = set != null && set.contains(interfaceC1437lX3);
                            if (abstractC1701pX3 != null && !z3) {
                                AbstractC1964tX f3 = c2096vX.f();
                                AbstractC1004ey b3 = abstractC1701pX3.b();
                                AbstractC0048Bt.m(b3, "argument.type");
                                if (f3.d(b3) != null) {
                                    arrayList3.add(abstractC1701pX3);
                                }
                            }
                            abstractC1701pX3 = new C1631oT(interfaceC1437lX3);
                            arrayList3.add(abstractC1701pX3);
                        }
                        abstractC2097vY = DY.p(jr3, arrayList3, null, 2);
                    }
                }
                vq.add(c2096vX.g(3, AbstractC1494mO.h(abstractC2097vY, E0)));
            } else if (c instanceof InterfaceC1437lX) {
                Set set2 = c1658ou.e;
                if (set2 == null || !set2.contains(c)) {
                    List upperBounds = ((InterfaceC1437lX) c).getUpperBounds();
                    AbstractC0048Bt.m(upperBounds, "declaration.upperBounds");
                    vq.addAll(R0(c2096vX, upperBounds, c1658ou));
                } else {
                    vq.add(N0(c1658ou));
                }
            }
        }
        C2140wB c2140wB = vq.h;
        c2140wB.b();
        c2140wB.t = true;
        if (c2140wB.p <= 0) {
            AbstractC0048Bt.l(C2140wB.u, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        }
        return c2140wB.p > 0 ? vq : VQ.i;
    }

    @Override // o.InterfaceC2298yb
    public boolean S(TW tw) {
        return PX.j0(tw);
    }

    public FW S0(int i) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z = false;
        while (i != -1) {
            FK fk = (FK) ((GK) this.j).i.get(i);
            String str = (String) ((HK) this.i).i.get(fk.k);
            EK ek = fk.l;
            AbstractC0048Bt.k(ek);
            int ordinal = ek.ordinal();
            if (ordinal == 0) {
                linkedList2.addFirst(str);
            } else if (ordinal == 1) {
                linkedList.addFirst(str);
            } else if (ordinal == 2) {
                linkedList2.addFirst(str);
                z = true;
            }
            i = fk.j;
        }
        return new FW(linkedList, linkedList2, Boolean.valueOf(z));
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
    public InterfaceC1437lX V(TW tw, int i) {
        return PX.T(tw, i);
    }

    @Override // o.AI
    public void W(int i) {
        ((CI) this.j).L(i);
        ((DI) this.i).B.W(i);
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
        JR q = PX.q(interfaceC1266iy);
        if (q == null) {
            q = b(interfaceC1266iy);
        }
        return PX.Q0(q);
    }

    @Override // o.InterfaceC2298yb
    public AbstractC1701pX a0(MR mr, int i) {
        AbstractC0048Bt.n(mr, "<this>");
        if (i < 0 || i >= PX.l(mr)) {
            return null;
        }
        return PX.K(mr, i);
    }

    @Override // o.InterfaceC2298yb
    public JR b(InterfaceC1266iy interfaceC1266iy) {
        JR v0;
        AbstractC0048Bt.n(interfaceC1266iy, "<this>");
        AbstractC1782qm p = PX.p(interfaceC1266iy);
        if (p != null && (v0 = PX.v0(p)) != null) {
            return v0;
        }
        JR q = PX.q(interfaceC1266iy);
        AbstractC0048Bt.k(q);
        return q;
    }

    @Override // o.InterfaceC2298yb
    public JR b0(C0632Yg c0632Yg) {
        return PX.A0(c0632Yg);
    }

    @Override // o.InterfaceC2298yb
    public boolean c(MR mr) {
        return PX.h0(mr);
    }

    @Override // o.AI
    public long c0(C0998es c0998es) {
        ((DI) this.i).B.c0(c0998es);
        throw null;
    }

    @Override // o.AI
    public void d(boolean z) {
        ((DI) ((DI) this.i).B.i).x = z;
    }

    @Override // o.InterfaceC2279yI
    public void d0() {
        ((DI) this.i).d0();
        ((CI) this.j).d0();
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

    @Override // o.InterfaceC1557nL
    public Object get() {
        switch (this.h) {
            case 4:
                return new JC((Context) ((M1) this.i).h, (C0604Xe) ((Y1) this.j).get());
            default:
                CU cu = new CU();
                GU gu = new GU(4);
                Object obj = ((InterfaceC1557nL) this.i).get();
                InterfaceC1557nL interfaceC1557nL = (InterfaceC1557nL) this.j;
                return new C1495mP(cu, gu, C2136w7.f, (C0970eQ) obj, interfaceC1557nL);
        }
    }

    @Override // o.InterfaceC0893dE
    public String getString(int i) {
        String str = (String) ((HK) this.i).i.get(i);
        AbstractC0048Bt.m(str, "strings.getString(index)");
        return str;
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

    @Override // o.AI
    public void i0(C2147wI c2147wI) {
        ((CI) this.j).L(c2147wI.a);
        ((DI) this.i).B.i0(c2147wI);
    }

    @Override // o.InterfaceC2298yb
    public boolean j(TW tw) {
        return PX.e0(tw);
    }

    @Override // o.InterfaceC2298yb
    public JR j0(InterfaceC1266iy interfaceC1266iy) {
        JR S0;
        AbstractC0048Bt.n(interfaceC1266iy, "<this>");
        AbstractC1782qm p = PX.p(interfaceC1266iy);
        if (p != null && (S0 = PX.S0(p)) != null) {
            return S0;
        }
        JR q = PX.q(interfaceC1266iy);
        AbstractC0048Bt.k(q);
        return q;
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

    @Override // o.AI
    public void m(C0998es c0998es) {
        ((DI) this.i).B.m(c0998es);
        throw null;
    }

    @Override // o.InterfaceC2298yb
    public boolean m0(MR mr) {
        AbstractC0048Bt.n(mr, "<this>");
        JR q = PX.q(mr);
        return (q != null ? PX.n(this, q) : null) != null;
    }

    @Override // o.InterfaceC2279yI
    public void n(io.flutter.view.b bVar) {
        ((DI) this.i).f29o.a = bVar;
        ((CI) this.j).m.a = bVar;
    }

    @Override // o.InterfaceC0893dE
    public boolean n0(int i) {
        return ((Boolean) S0(i).j).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC2298yb
    public AbstractC1701pX o(NW nw, int i) {
        AbstractC0048Bt.n(nw, "<this>");
        if (nw instanceof MR) {
            return PX.K((InterfaceC1266iy) nw, i);
        }
        if (nw instanceof B6) {
            E e = ((B6) nw).get(i);
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

    @Override // o.AI
    public void r(C2345zI c2345zI, C1574nc c1574nc) {
        ((CI) this.j).L(c2345zI.a);
        ((DI) this.i).B.r(c2345zI, c1574nc);
    }

    @Override // o.AI
    public void r0(int i) {
        ((CI) this.j).L(i);
        ((DI) this.i).B.r0(i);
    }

    @Override // o.InterfaceC1280j8
    public void s(ByteBuffer byteBuffer, C1511mf c1511mf) {
        C0950e6 c0950e6 = (C0950e6) this.j;
        PC pc = (PC) c0950e6.k;
        try {
            ((OC) this.i).v(pc.h(byteBuffer), new NC(this, 0, c1511mf));
        } catch (RuntimeException e) {
            Log.e("MethodChannel#".concat((String) c0950e6.j), "Failed to handle method call", e);
            c1511mf.a(pc.c(e.getMessage(), Log.getStackTraceString(e)));
        }
    }

    @Override // o.InterfaceC2298yb
    public boolean s0(TW tw) {
        return PX.c0(tw);
    }

    @Override // o.AI
    public void t(int i, double d, double d2) {
        ((CI) this.j).L(i);
        ((DI) this.i).B.t(i, d, d2);
    }

    @Override // o.InterfaceC2298yb
    public AbstractC1782qm t0(InterfaceC1266iy interfaceC1266iy) {
        return PX.p(interfaceC1266iy);
    }

    public String toString() {
        switch (this.h) {
            case 12:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.j.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.i;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    sb.append((String) arrayList.get(i));
                    if (i < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // o.AI
    public void u(int i, int i2) {
        ((CI) this.j).L(i);
        ((DI) this.i).B.u(i, i2);
    }

    @Override // o.InterfaceC0821c8
    public void u0(Object obj) {
        C0950e6 c0950e6 = (C0950e6) this.j;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) c0950e6.i;
        YQ yq = (YQ) this.i;
        concurrentLinkedQueue.remove(yq);
        if (((ConcurrentLinkedQueue) c0950e6.i).isEmpty()) {
            return;
        }
        Log.e("SettingsChannel", "The queue becomes empty after removing config generation " + yq.a);
    }

    @Override // o.OC
    public void v(C0208Hx c0208Hx, NC nc) {
        C1590ns c1590ns = (C1590ns) this.j;
        if (((C0950e6) c1590ns.i) == null) {
            nc.d((Map) this.i);
            return;
        }
        String str = (String) c0208Hx.i;
        str.getClass();
        if (!str.equals("getKeyboardState")) {
            nc.b();
            return;
        }
        try {
            this.i = Collections.unmodifiableMap(((C0052Bx) ((InterfaceC0311Lx[]) ((C0950e6) c1590ns.i).i)[0]).i);
        } catch (IllegalStateException e) {
            nc.a(Constants.IPC_BUNDLE_KEY_SEND_ERROR, e.getMessage(), null);
        }
        nc.d((Map) this.i);
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

    @Override // o.InterfaceC2279yI
    public boolean x(int i) {
        ((CI) this.j).L(i);
        return ((DI) this.i).x(i);
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

    @Override // o.InterfaceC0893dE
    public String z0(int i) {
        FW S0 = S0(i);
        List list = (List) S0.h;
        String t0 = AbstractC0720ac.t0((List) S0.i, ".", null, null, null, 62);
        if (list.isEmpty()) {
            return t0;
        }
        return AbstractC0720ac.t0(list, "/", null, null, null, 62) + '/' + t0;
    }

    public /* synthetic */ C0208Hx(Object obj, int i, Object obj2) {
        this.h = i;
        this.i = obj;
        this.j = obj2;
    }

    public C0208Hx(int i, Object obj) {
        this.h = i;
        switch (i) {
            case 24:
                this.i = obj;
                this.j = Thread.currentThread();
                break;
            default:
                this.j = obj;
                this.i = new ArrayList();
                break;
        }
    }

    public C0208Hx(HK hk, GK gk) {
        this.h = 10;
        AbstractC0048Bt.n(hk, "strings");
        AbstractC0048Bt.n(gk, "qualifiedNames");
        this.i = hk;
        this.j = gk;
    }

    public C0208Hx(HashMap hashMap, InterfaceC1070fy interfaceC1070fy) {
        this.h = 14;
        AbstractC0048Bt.n(interfaceC1070fy, "equalityAxioms");
        this.i = hashMap;
        this.j = interfaceC1070fy;
    }

    public C0208Hx(C0218Ih c0218Ih) {
        this.h = 29;
        VA va = new VA("Type parameter upper bound erasure results");
        this.i = EB.D(new LE(15, this));
        this.j = va.b(new C2084vL(9, this));
    }

    public C0208Hx(InterfaceC1417lD interfaceC1417lD, C1590ns c1590ns) {
        this.h = 8;
        this.i = interfaceC1417lD;
        this.j = c1590ns;
        c1590ns.i = new C1590ns(15, this);
    }

    public C0208Hx(C1590ns c1590ns) {
        this.h = 0;
        this.j = c1590ns;
        this.i = new HashMap();
    }

    public C0208Hx(View view, InputMethodManager inputMethodManager, C1818rJ c1818rJ) {
        this.h = 21;
        if (Build.VERSION.SDK_INT >= 33) {
            view.setAutoHandwritingEnabled(false);
        }
        this.j = view;
        this.i = inputMethodManager;
        c1818rJ.i = this;
    }

    public C0208Hx(int i) {
        this.h = i;
        switch (i) {
            case 13:
                this.i = new YD(new C0027Ay[16]);
                break;
            case 16:
                break;
            case 28:
                this.i = new ConcurrentHashMap();
                this.j = new AtomicInteger(0);
                break;
            default:
                this.i = new LongSparseArray();
                this.j = new PriorityQueue();
                break;
        }
    }

    public C0208Hx(C1183hf c1183hf, int i) {
        this.h = i;
        switch (i) {
            case 15:
                C1590ns c1590ns = new C1590ns(18, this);
                C0950e6 c0950e6 = new C0950e6(c1183hf, "flutter/platform", C0460Rq.G, 16);
                this.i = c0950e6;
                c0950e6.Q(c1590ns);
                break;
            case 26:
                C1818rJ c1818rJ = new C1818rJ(21, this);
                C0950e6 c0950e62 = new C0950e6(c1183hf, "flutter/textinput", C0460Rq.G, 16);
                this.i = c0950e62;
                c0950e62.Q(c1818rJ);
                break;
            default:
                C1590ns c1590ns2 = new C1590ns(10, this);
                C0950e6 c0950e63 = new C0950e6(c1183hf, "flutter/localization", C0460Rq.G, 16);
                this.i = c0950e63;
                c0950e63.Q(c1590ns2);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0208Hx(InterfaceC2114vp interfaceC2114vp, InterfaceC2114vp interfaceC2114vp2) {
        this.h = 27;
        this.i = (AbstractC1596ny) interfaceC2114vp;
        this.j = (AbstractC1596ny) interfaceC2114vp2;
    }

    public C0208Hx(C1183hf c1183hf, PackageManager packageManager) {
        this.h = 18;
        C1818rJ c1818rJ = new C1818rJ(1, this);
        this.i = packageManager;
        new C0950e6(c1183hf, "flutter/processtext", C1367kT.h, 16).Q(c1818rJ);
    }

    public C0208Hx(Context context, int i) {
        this.h = i;
        switch (i) {
            case 25:
                AbstractC1473m3.n(context);
                Resources resources = context.getResources();
                this.i = resources;
                this.j = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
                break;
            default:
                this.i = null;
                this.j = context;
                break;
        }
    }

    public C0208Hx(LinkedHashMap linkedHashMap) {
        this.h = 20;
        this.i = linkedHashMap != null ? EB.X(linkedHashMap) : new LinkedHashMap();
        this.j = new LinkedHashMap();
    }

    public C0208Hx(Map map) {
        this.h = 11;
        this.i = map;
        this.j = new VA("Java nullability annotation states").c(new C1400l(27, this));
    }

    public C0208Hx(C1745qB c1745qB, String str) {
        this.h = 23;
        AbstractC0048Bt.n(str, "className");
        this.j = c1745qB;
        this.i = str;
    }

    public C0208Hx(Matcher matcher, CharSequence charSequence) {
        this.h = 2;
        AbstractC0048Bt.n(charSequence, "input");
        this.i = matcher;
    }

    @Override // o.InterfaceC2298yb
    public void P(MR mr, TW tw) {
    }
}
