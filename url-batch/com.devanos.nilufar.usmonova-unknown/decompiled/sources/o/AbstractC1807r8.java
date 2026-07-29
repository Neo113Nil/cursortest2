package o;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.firebase.database.core.ValidationPath;
import com.google.firebase.messaging.Constants;
import io.flutter.plugins.GeneratedPluginRegistrant;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: o.r8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1807r8 {
    public static final Object b = null;
    public static final InterfaceC2235xe[] a = new InterfaceC2235xe[0];
    public static final int[] c = new int[2];
    public static final C0457Rn d = new C0457Rn("NO_OWNER", 5);
    public static final C0218Ih e = new C0218Ih(24);
    public static final C0140Fh f = new C0140Fh(25);
    public static final C0140Fh g = new C0140Fh(24);
    public static final C0140Fh h = new C0140Fh(29);

    public static C0261Jy A(InterfaceC2072v9 interfaceC2072v9, AbstractC1004ey abstractC1004ey, InterfaceC1738q4 interfaceC1738q4) {
        if (abstractC1004ey == null) {
            return null;
        }
        return new C0261Jy(interfaceC2072v9, new C1451ll(interfaceC2072v9, abstractC1004ey), interfaceC1738q4);
    }

    public static SJ B(PJ pj, InterfaceC1738q4 interfaceC1738q4, boolean z, IS is) {
        if (interfaceC1738q4 == null) {
            a(18);
            throw null;
        }
        if (is != null) {
            return new SJ(pj, interfaceC1738q4, pj.g(), pj.getVisibility(), z, false, false, 1, null, is);
        }
        a(19);
        throw null;
    }

    public static final DP C(C2142wD c2142wD) {
        LinkedHashMap linkedHashMap = c2142wD.a;
        MP mp = (MP) linkedHashMap.get(e);
        if (mp == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        InterfaceC0746b00 interfaceC0746b00 = (InterfaceC0746b00) linkedHashMap.get(f);
        if (interfaceC0746b00 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) linkedHashMap.get(g);
        String str = (String) linkedHashMap.get(C1623oL.r);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        JP b2 = mp.getSavedStateRegistry().b();
        GP gp = b2 instanceof GP ? (GP) b2 : null;
        if (gp == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap2 = H(interfaceC0746b00).b;
        DP dp = (DP) linkedHashMap2.get(str);
        if (dp != null) {
            return dp;
        }
        Class[] clsArr = DP.f;
        gp.b();
        Bundle bundle2 = gp.c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
        Bundle bundle4 = gp.c;
        if (bundle4 != null) {
            bundle4.remove(str);
        }
        Bundle bundle5 = gp.c;
        if (bundle5 != null && bundle5.isEmpty()) {
            gp.c = null;
        }
        DP f2 = DY.f(bundle3, bundle);
        linkedHashMap2.put(str, f2);
        return f2;
    }

    public static WJ D(PJ pj, InterfaceC1738q4 interfaceC1738q4, InterfaceC1738q4 interfaceC1738q42, boolean z, C0244Jh c0244Jh, IS is) {
        if (interfaceC1738q4 == null) {
            a(8);
            throw null;
        }
        if (interfaceC1738q42 == null) {
            a(9);
            throw null;
        }
        if (c0244Jh == null) {
            a(10);
            throw null;
        }
        if (is == null) {
            a(11);
            throw null;
        }
        WJ wj = new WJ(pj, interfaceC1738q4, pj.g(), c0244Jh, z, false, false, 1, null, is);
        wj.t = WJ.J0(wj, pj.c(), interfaceC1738q42);
        return wj;
    }

    public static final void E(MP mp) {
        EnumC0080Cz enumC0080Cz = ((C0417Pz) mp.getLifecycle()).d;
        if (enumC0080Cz != EnumC0080Cz.i && enumC0080Cz != EnumC0080Cz.j) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (mp.getSavedStateRegistry().b() == null) {
            GP gp = new GP(mp.getSavedStateRegistry(), (InterfaceC0746b00) mp);
            mp.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", gp);
            mp.getLifecycle().a(new C0966eM(4, gp));
        }
    }

    public static final InterfaceC1991ty F(InterfaceC1991ty interfaceC1991ty) {
        InterfaceC1991ty interfaceC1991ty2;
        InterfaceC1991ty h2 = interfaceC1991ty.h();
        while (true) {
            InterfaceC1991ty interfaceC1991ty3 = h2;
            interfaceC1991ty2 = interfaceC1991ty;
            interfaceC1991ty = interfaceC1991ty3;
            if (interfaceC1991ty == null) {
                break;
            }
            h2 = interfaceC1991ty.h();
        }
        ME me = interfaceC1991ty2 instanceof ME ? (ME) interfaceC1991ty2 : null;
        if (me == null) {
            return interfaceC1991ty2;
        }
        ME me2 = me.n;
        while (true) {
            ME me3 = me2;
            ME me4 = me;
            me = me3;
            if (me == null) {
                return me4;
            }
            me2 = me.n;
        }
    }

    public static final C0849ca G(InterfaceC2235xe interfaceC2235xe) {
        C0849ca c0849ca;
        C0849ca c0849ca2;
        if (!(interfaceC2235xe instanceof C0011Ai)) {
            return new C0849ca(1, interfaceC2235xe);
        }
        C0011Ai c0011Ai = (C0011Ai) interfaceC2235xe;
        C0457Rn c0457Rn = AbstractC0022At.c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0011Ai.f12o;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(c0011Ai);
            c0849ca = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(c0011Ai, c0457Rn);
                c0849ca2 = null;
                break;
            }
            if (obj instanceof C0849ca) {
                while (!atomicReferenceFieldUpdater.compareAndSet(c0011Ai, obj, c0457Rn)) {
                    if (atomicReferenceFieldUpdater.get(c0011Ai) != obj) {
                        break;
                    }
                }
                c0849ca2 = (C0849ca) obj;
                break loop0;
            }
            if (obj != c0457Rn && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c0849ca2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0849ca.n;
            Object obj2 = atomicReferenceFieldUpdater2.get(c0849ca2);
            if (!(obj2 instanceof C2365zc) || ((C2365zc) obj2).d == null) {
                C0849ca.m.set(c0849ca2, 536870911);
                atomicReferenceFieldUpdater2.set(c0849ca2, C1.a);
                c0849ca = c0849ca2;
            } else {
                c0849ca2.n();
            }
            if (c0849ca != null) {
                return c0849ca;
            }
        }
        return new C0849ca(2, interfaceC2235xe);
    }

    public static final HP H(InterfaceC0746b00 interfaceC0746b00) {
        FP fp = new FP();
        C0680a00 viewModelStore = interfaceC0746b00.getViewModelStore();
        AbstractC0656Ze defaultViewModelCreationExtras = interfaceC0746b00 instanceof InterfaceC1655or ? ((InterfaceC1655or) interfaceC0746b00).getDefaultViewModelCreationExtras() : C0630Ye.b;
        AbstractC0048Bt.n(viewModelStore, "store");
        AbstractC0048Bt.n(defaultViewModelCreationExtras, "defaultCreationExtras");
        return (HP) new ZZ(viewModelStore, fp, defaultViewModelCreationExtras).a(AbstractC1473m3.G(HP.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final void I(C0405Pn c0405Pn) {
        AbstractC1305jX.B(c0405Pn, new C0431Qn(c0405Pn, 0));
        int ordinal = c0405Pn.s().ordinal();
        if (ordinal == 1 || ordinal == 3) {
            c0405Pn.w(EnumC0379On.h);
        }
    }

    public static final void J(Throwable th, InterfaceC0189He interfaceC0189He) {
        try {
            InterfaceC0293Le interfaceC0293Le = (InterfaceC0293Le) interfaceC0189He.k(C0460Rq.x);
            if (interfaceC0293Le != null) {
                interfaceC0293Le.F(th);
            } else {
                AbstractC1473m3.I(th, interfaceC0189He);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                AbstractC0946e20.e(runtimeException, th);
                th = runtimeException;
            }
            AbstractC1473m3.I(th, interfaceC0189He);
        }
    }

    public static final boolean K(float[] fArr, float[] fArr2) {
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        float f11 = fArr[9];
        float f12 = fArr[10];
        float f13 = fArr[11];
        float f14 = fArr[12];
        float f15 = fArr[13];
        float f16 = fArr[14];
        float f17 = fArr[15];
        float f18 = (f2 * f7) - (f3 * f6);
        float f19 = (f2 * f8) - (f4 * f6);
        float f20 = (f2 * f9) - (f5 * f6);
        float f21 = (f3 * f8) - (f4 * f7);
        float f22 = (f3 * f9) - (f5 * f7);
        float f23 = (f4 * f9) - (f5 * f8);
        float f24 = (f10 * f15) - (f11 * f14);
        float f25 = (f10 * f16) - (f12 * f14);
        float f26 = (f10 * f17) - (f13 * f14);
        float f27 = (f11 * f16) - (f12 * f15);
        float f28 = (f11 * f17) - (f13 * f15);
        float f29 = (f12 * f17) - (f13 * f16);
        float f30 = (f23 * f24) + (((f21 * f26) + ((f20 * f27) + ((f18 * f29) - (f19 * f28)))) - (f22 * f25));
        if (f30 == 0.0f) {
            return false;
        }
        float f31 = 1.0f / f30;
        fArr2[0] = ((f9 * f27) + ((f7 * f29) - (f8 * f28))) * f31;
        fArr2[1] = (((f4 * f28) + ((-f3) * f29)) - (f5 * f27)) * f31;
        fArr2[2] = ((f17 * f21) + ((f15 * f23) - (f16 * f22))) * f31;
        fArr2[3] = (((f12 * f22) + ((-f11) * f23)) - (f13 * f21)) * f31;
        float f32 = -f6;
        fArr2[4] = (((f8 * f26) + (f32 * f29)) - (f9 * f25)) * f31;
        fArr2[5] = ((f5 * f25) + ((f29 * f2) - (f4 * f26))) * f31;
        float f33 = -f14;
        fArr2[6] = (((f16 * f20) + (f33 * f23)) - (f17 * f19)) * f31;
        fArr2[7] = ((f13 * f19) + ((f23 * f10) - (f12 * f20))) * f31;
        fArr2[8] = ((f9 * f24) + ((f6 * f28) - (f7 * f26))) * f31;
        fArr2[9] = (((f26 * f3) + ((-f2) * f28)) - (f5 * f24)) * f31;
        fArr2[10] = ((f17 * f18) + ((f14 * f22) - (f15 * f20))) * f31;
        fArr2[11] = (((f20 * f11) + ((-f10) * f22)) - (f13 * f18)) * f31;
        fArr2[12] = (((f7 * f25) + (f32 * f27)) - (f8 * f24)) * f31;
        fArr2[13] = ((f4 * f24) + ((f2 * f27) - (f3 * f25))) * f31;
        fArr2[14] = (((f15 * f19) + (f33 * f21)) - (f16 * f18)) * f31;
        fArr2[15] = ((f12 * f18) + ((f10 * f21) - (f11 * f19))) * f31;
        return true;
    }

    public static boolean L(InterfaceC0381Op interfaceC0381Op) {
        return interfaceC0381Op.M() == 4 && AbstractC0114Eh.n(interfaceC0381Op.n(), 3);
    }

    public static final int M(C0405Pn c0405Pn) {
        int ordinal = c0405Pn.s().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                C0405Pn t = AbstractC1052fg.t(c0405Pn);
                if (t == null) {
                    throw new IllegalArgumentException("ActiveParent with no focused child");
                }
                int M = M(t);
                if (M == 1) {
                    M = 0;
                }
                if (M != 0) {
                    return M;
                }
                if (!c0405Pn.n) {
                    c0405Pn.n = true;
                    try {
                        c0405Pn.q().k.getClass();
                        C0353Nn c0353Nn = C0353Nn.b;
                        return 1;
                    } finally {
                        c0405Pn.n = false;
                    }
                }
            } else {
                if (ordinal == 2) {
                    return 2;
                }
                if (ordinal != 3) {
                    throw new C0057Cc();
                }
            }
        }
        return 1;
    }

    public static final void N(C0405Pn c0405Pn) {
        if (c0405Pn.f85o) {
            return;
        }
        c0405Pn.f85o = true;
        try {
            c0405Pn.q().j.getClass();
            C0353Nn c0353Nn = C0353Nn.b;
        } finally {
            c0405Pn.f85o = false;
        }
    }

    public static final int O(C0405Pn c0405Pn) {
        TC tc;
        C1970td c1970td;
        int ordinal = c0405Pn.s().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                C0405Pn t = AbstractC1052fg.t(c0405Pn);
                if (t != null) {
                    return M(t);
                }
                throw new IllegalArgumentException("ActiveParent with no focused child");
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new C0057Cc();
                }
                TC tc2 = c0405Pn.b;
                if (!tc2.m) {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
                TC tc3 = tc2.e;
                C0027Ay J = AbstractC0946e20.J(c0405Pn);
                loop0: while (true) {
                    tc = null;
                    if (J == null) {
                        break;
                    }
                    if ((((TC) J.u.f).d & 1024) != 0) {
                        while (tc3 != null) {
                            if ((tc3.c & 1024) != 0) {
                                for (TC tc4 = tc3; tc4 != null; tc4 = null) {
                                    if (tc4 instanceof C0405Pn) {
                                        tc = tc4;
                                        break loop0;
                                    }
                                }
                            }
                            tc3 = tc3.e;
                        }
                    }
                    J = J.l();
                    tc3 = (J == null || (c1970td = J.u) == null) ? null : (IU) c1970td.e;
                }
                C0405Pn c0405Pn2 = (C0405Pn) tc;
                if (c0405Pn2 != null) {
                    int ordinal2 = c0405Pn2.s().ordinal();
                    if (ordinal2 == 0) {
                        N(c0405Pn2);
                        return 1;
                    }
                    if (ordinal2 == 1) {
                        return O(c0405Pn2);
                    }
                    if (ordinal2 == 2) {
                        return 2;
                    }
                    if (ordinal2 != 3) {
                        throw new C0057Cc();
                    }
                    int O = O(c0405Pn2);
                    if (O == 1) {
                        O = 0;
                    }
                    if (O != 0) {
                        return O;
                    }
                    N(c0405Pn2);
                    return 1;
                }
            }
        }
        return 1;
    }

    public static final boolean P(C0405Pn c0405Pn) {
        TC tc;
        C1970td c1970td;
        int ordinal = c0405Pn.s().ordinal();
        boolean z = true;
        if (ordinal != 0) {
            if (ordinal == 1) {
                C0405Pn t = AbstractC1052fg.t(c0405Pn);
                if (t != null ? o(t, false) : true) {
                    I(c0405Pn);
                }
                z = false;
            } else if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new C0057Cc();
                }
                TC tc2 = c0405Pn.b;
                if (!tc2.m) {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
                TC tc3 = tc2.e;
                C0027Ay J = AbstractC0946e20.J(c0405Pn);
                loop0: while (true) {
                    if (J == null) {
                        tc = null;
                        break;
                    }
                    if ((((TC) J.u.f).d & 1024) != 0) {
                        while (tc3 != null) {
                            if ((tc3.c & 1024) != 0) {
                                tc = tc3;
                                while (tc != null) {
                                    if (tc instanceof C0405Pn) {
                                        break loop0;
                                    }
                                    tc = null;
                                }
                            }
                            tc3 = tc3.e;
                        }
                    }
                    J = J.l();
                    tc3 = (J == null || (c1970td = J.u) == null) ? null : (IU) c1970td.e;
                }
                C0405Pn c0405Pn2 = (C0405Pn) tc;
                if (c0405Pn2 != null) {
                    EnumC0379On s = c0405Pn2.s();
                    z = U(c0405Pn2, c0405Pn);
                    if (z && s != c0405Pn2.s()) {
                        PX.I0(c0405Pn2);
                    }
                } else {
                    if (((Boolean) ((androidx.compose.ui.focus.a) ((S2) AbstractC0946e20.K(c0405Pn)).getFocusOwner()).a.invoke(null, null)).booleanValue()) {
                        I(c0405Pn);
                    }
                    z = false;
                }
            }
        }
        if (z) {
            PX.I0(c0405Pn);
        }
        return z;
    }

    public static final void Q(C0972eS c0972eS, C0950e6 c0950e6, int i) {
        while (true) {
            int i2 = c0972eS.v;
            if (i > i2 && i < c0972eS.u) {
                return;
            }
            if (i2 == 0 && i == 0) {
                return;
            }
            c0972eS.C();
            if (TM.f(c0972eS.b, c0972eS.p(c0972eS.v))) {
                c0950e6.T();
            }
            c0972eS.i();
        }
    }

    public static final Object R(JH jh, AbstractC1425lL abstractC1425lL) {
        AbstractC0048Bt.l(abstractC1425lL, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        IH ih = (IH) jh;
        Object obj = ih.get(abstractC1425lL);
        if (obj == null) {
            obj = abstractC1425lL.a;
        }
        return ((NY) obj).a(ih);
    }

    public static void S(C0862cn c0862cn) {
        try {
            GeneratedPluginRegistrant.class.getDeclaredMethod("registerWith", C0862cn.class).invoke(null, c0862cn);
        } catch (Exception e2) {
            Log.e("GeneratedPluginsRegister", "Tried to automatically register plugins with FlutterEngine (" + c0862cn + ") but could not find or invoke the GeneratedPluginRegistrant.");
            Log.e("GeneratedPluginsRegister", "Received exception while registering", e2);
        }
    }

    public static final Boolean T(C0405Pn c0405Pn) {
        Boolean valueOf;
        C1711ph W = AbstractC1473m3.W(c0405Pn);
        C0431Qn c0431Qn = new C0431Qn(c0405Pn, 1);
        try {
            if (W.h) {
                C1711ph.a(W);
            }
            W.h = true;
            ((YD) W.j).b(c0431Qn);
            int v = AbstractC1888sN.v(O(c0405Pn));
            if (v != 0) {
                if (v != 1) {
                    if (v == 2) {
                        valueOf = Boolean.TRUE;
                    } else if (v != 3) {
                        throw new C0057Cc();
                    }
                }
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(P(c0405Pn));
            }
            return valueOf;
        } finally {
            C1711ph.b(W);
        }
    }

    public static final boolean U(C0405Pn c0405Pn, C0405Pn c0405Pn2) {
        TC tc;
        TC tc2;
        C1970td c1970td;
        C1970td c1970td2;
        TC tc3 = c0405Pn2.b;
        if (!tc3.m) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        TC tc4 = tc3.e;
        C0027Ay J = AbstractC0946e20.J(c0405Pn2);
        loop0: while (true) {
            if (J == null) {
                tc = null;
                break;
            }
            if ((((TC) J.u.f).d & 1024) != 0) {
                while (tc4 != null) {
                    if ((tc4.c & 1024) != 0) {
                        tc = tc4;
                        while (tc != null) {
                            if (tc instanceof C0405Pn) {
                                break loop0;
                            }
                            tc = null;
                        }
                    }
                    tc4 = tc4.e;
                }
            }
            J = J.l();
            tc4 = (J == null || (c1970td2 = J.u) == null) ? null : (IU) c1970td2.e;
        }
        if (!AbstractC0048Bt.h(tc, c0405Pn)) {
            throw new IllegalStateException("Non child node cannot request focus.");
        }
        int ordinal = c0405Pn.s().ordinal();
        EnumC0379On enumC0379On = EnumC0379On.i;
        if (ordinal == 0) {
            I(c0405Pn2);
            c0405Pn.w(enumC0379On);
            return true;
        }
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new C0057Cc();
                }
                TC tc5 = c0405Pn.b;
                if (!tc5.m) {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
                TC tc6 = tc5.e;
                C0027Ay J2 = AbstractC0946e20.J(c0405Pn);
                loop3: while (true) {
                    if (J2 == null) {
                        tc2 = null;
                        break;
                    }
                    if ((((TC) J2.u.f).d & 1024) != 0) {
                        while (tc6 != null) {
                            if ((tc6.c & 1024) != 0) {
                                tc2 = tc6;
                                while (tc2 != null) {
                                    if (tc2 instanceof C0405Pn) {
                                        break loop3;
                                    }
                                    tc2 = null;
                                }
                            }
                            tc6 = tc6.e;
                        }
                    }
                    J2 = J2.l();
                    tc6 = (J2 == null || (c1970td = J2.u) == null) ? null : (IU) c1970td.e;
                }
                C0405Pn c0405Pn3 = (C0405Pn) tc2;
                if (c0405Pn3 == null && ((Boolean) ((androidx.compose.ui.focus.a) ((S2) AbstractC0946e20.K(c0405Pn)).getFocusOwner()).a.invoke(null, null)).booleanValue()) {
                    I(c0405Pn2);
                    c0405Pn.w(enumC0379On);
                    return true;
                }
                if (c0405Pn3 != null && U(c0405Pn3, c0405Pn)) {
                    boolean U = U(c0405Pn, c0405Pn2);
                    if (c0405Pn.s() != enumC0379On) {
                        throw new IllegalStateException("Deactivated node is focused");
                    }
                    if (U) {
                        PX.I0(c0405Pn3);
                    }
                    return U;
                }
            }
        } else {
            if (AbstractC1052fg.t(c0405Pn) == null) {
                throw new IllegalArgumentException("ActiveParent with no focused child");
            }
            C0405Pn t = AbstractC1052fg.t(c0405Pn);
            if (t != null ? o(t, false) : true) {
                I(c0405Pn2);
                return true;
            }
        }
        return false;
    }

    public static final void V(Object[] objArr, int i, int i2) {
        AbstractC0048Bt.n(objArr, "<this>");
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    public static final void W(C0405Pn c0405Pn) {
        TC tc;
        C1970td c1970td;
        TC tc2 = c0405Pn.b;
        if (!tc2.m) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        TC tc3 = tc2.e;
        C0027Ay J = AbstractC0946e20.J(c0405Pn);
        loop0: while (true) {
            tc = null;
            if (J == null) {
                break;
            }
            if ((((TC) J.u.f).d & 1024) != 0) {
                while (tc3 != null) {
                    if ((tc3.c & 1024) != 0) {
                        for (TC tc4 = tc3; tc4 != null; tc4 = null) {
                            if (tc4 instanceof C0405Pn) {
                                tc = tc4;
                                break loop0;
                            }
                        }
                    }
                    tc3 = tc3.e;
                }
            }
            J = J.l();
            tc3 = (J == null || (c1970td = J.u) == null) ? null : (IU) c1970td.e;
        }
        C0405Pn c0405Pn2 = (C0405Pn) tc;
        if (c0405Pn2 == null) {
            c0405Pn.r();
        } else {
            c0405Pn2.r();
            c0405Pn.r();
        }
    }

    public static final void X(Q0 q0, C2287yQ c2287yQ) {
        List g2;
        Object obj = c2287yQ.i().h.get(CQ.f);
        if (obj == null) {
            obj = null;
        }
        if (obj != null) {
            throw new ClassCastException();
        }
        ArrayList arrayList = new ArrayList();
        Object obj2 = c2287yQ.i().h.get(CQ.e);
        if ((obj2 != null ? obj2 : null) != null) {
            g2 = c2287yQ.g((r4 & 1) != 0 ? !c2287yQ.b : false, (r4 & 2) == 0);
            int size = g2.size();
            for (int i = 0; i < size; i++) {
                C2287yQ c2287yQ2 = (C2287yQ) g2.get(i);
                if (c2287yQ2.i().h.containsKey(CQ.w)) {
                    arrayList.add(c2287yQ2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean l = l(arrayList);
        q0.a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(l ? 1 : arrayList.size(), l ? arrayList.size() : 1, false, 0));
    }

    public static C1065ft Y(C1197ht c1197ht, int i) {
        AbstractC0048Bt.n(c1197ht, "<this>");
        boolean z = i > 0;
        Integer valueOf = Integer.valueOf(i);
        if (!z) {
            throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
        }
        int i2 = c1197ht.h;
        int i3 = c1197ht.i;
        if (c1197ht.j <= 0) {
            i = -i;
        }
        return new C1065ft(i2, i3, i);
    }

    public static boolean Z(InterfaceC2298yb interfaceC2298yb, MR mr, MR mr2) {
        int i;
        if (interfaceC2298yb.l0(mr) == interfaceC2298yb.l0(mr2) && interfaceC2298yb.q0(mr) == interfaceC2298yb.q0(mr2)) {
            if ((interfaceC2298yb.l(mr) == null) == (interfaceC2298yb.l(mr2) == null) && interfaceC2298yb.J(interfaceC2298yb.Q(mr), interfaceC2298yb.Q(mr2))) {
                if (!interfaceC2298yb.q(mr, mr2)) {
                    int l0 = interfaceC2298yb.l0(mr);
                    for (0; i < l0; i + 1) {
                        AbstractC1701pX B = interfaceC2298yb.B(mr, i);
                        AbstractC1701pX B2 = interfaceC2298yb.B(mr2, i);
                        i = (interfaceC2298yb.G(B) == interfaceC2298yb.G(B2) && (interfaceC2298yb.G(B) || (interfaceC2298yb.R(B) == interfaceC2298yb.R(B2) && b0(interfaceC2298yb, interfaceC2298yb.o0(B), interfaceC2298yb.o0(B2))))) ? i + 1 : 0;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 12 || i == 23 || i == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 12 || i == 23 || i == 25) ? 2 : 3];
        switch (i) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case 31:
            case 33:
            case 35:
                objArr[0] = "annotations";
                break;
            case 2:
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 13:
            case 15:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = Constants.ScionAnalytics.PARAM_SOURCE;
                break;
            case 22:
            case 24:
            case 26:
                objArr[0] = "enumClass";
                break;
            case 27:
            case 28:
            case 29:
                objArr[0] = "descriptor";
                break;
            case 30:
            case ValidationPath.MAX_PATH_DEPTH /* 32 */:
            case 34:
                objArr[0] = "owner";
                break;
        }
        if (i == 12) {
            objArr[1] = "createSetter";
        } else if (i == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i) {
            case 3:
            case 4:
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case 27:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 28:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 29:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 30:
            case 31:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case ValidationPath.MAX_PATH_DEPTH /* 32 */:
            case 33:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 34:
            case 35:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String format = String.format(str, objArr);
        if (i != 12 && i != 23 && i != 25) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static boolean a0(InterfaceC2298yb interfaceC2298yb, InterfaceC1266iy interfaceC1266iy, InterfaceC1266iy interfaceC1266iy2) {
        AbstractC0048Bt.n(interfaceC2298yb, "context");
        AbstractC0048Bt.n(interfaceC1266iy, "a");
        AbstractC0048Bt.n(interfaceC1266iy2, "b");
        return b0(interfaceC2298yb, interfaceC1266iy, interfaceC1266iy2);
    }

    public static J8 b(int i, int i2, H8 h8) {
        int i3 = i2 & 2;
        H8 h82 = H8.h;
        if (i3 != 0) {
            h8 = h82;
        }
        if (i == -2) {
            if (h8 != h82) {
                return new C0136Fd(1, h8);
            }
            InterfaceC2363za.a.getClass();
            return new J8(C2297ya.b);
        }
        if (i != -1) {
            return i != 0 ? i != Integer.MAX_VALUE ? h8 == h82 ? new J8(i) : new C0136Fd(i, h8) : new J8(Integer.MAX_VALUE) : h8 == h82 ? new J8(0) : new C0136Fd(1, h8);
        }
        if (h8 == h82) {
            return new C0136Fd(1, H8.i);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }

    public static boolean b0(InterfaceC2298yb interfaceC2298yb, InterfaceC1266iy interfaceC1266iy, InterfaceC1266iy interfaceC1266iy2) {
        if (interfaceC1266iy == interfaceC1266iy2) {
            return true;
        }
        JR h0 = interfaceC2298yb.h0(interfaceC1266iy);
        JR h02 = interfaceC2298yb.h0(interfaceC1266iy2);
        if (h0 != null && h02 != null) {
            return Z(interfaceC2298yb, h0, h02);
        }
        AbstractC1782qm t0 = interfaceC2298yb.t0(interfaceC1266iy);
        AbstractC1782qm t02 = interfaceC2298yb.t0(interfaceC1266iy2);
        return t0 != null && t02 != null && Z(interfaceC2298yb, interfaceC2298yb.X(t0), interfaceC2298yb.X(t02)) && Z(interfaceC2298yb, interfaceC2298yb.Y(t0), interfaceC2298yb.Y(t02));
    }

    public static final void c(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Index " + i + " is out of bounds. The list has " + size + " elements.");
        }
    }

    public static C1197ht c0(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new C1197ht(i, i2 - 1, 1);
        }
        C1197ht c1197ht = C1197ht.k;
        return C1197ht.k;
    }

    public static final void d(List list, int i, int i2) {
        int size = list.size();
        if (i > i2) {
            throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i + ") is greater than toIndex (" + i2 + ").");
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(AbstractC1888sN.h(i, "fromIndex (", ") is less than 0."));
        }
        if (i2 <= size) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is more than than the list size (" + size + ')');
    }

    public static final IH d0(C1491mL[] c1491mLArr, JH jh, JH jh2) {
        HH hh = new HH(IH.k);
        for (C1491mL c1491mL : c1491mLArr) {
            AbstractC1425lL abstractC1425lL = c1491mL.a;
            if (c1491mL.f || !((IH) jh).containsKey(abstractC1425lL)) {
                hh.put(abstractC1425lL, abstractC1425lL.b(c1491mL, (NY) ((IH) jh2).get(abstractC1425lL)));
            }
        }
        return hh.a();
    }

    public static final float e(float[] fArr, int i, float[] fArr2, int i2) {
        int i3 = i * 4;
        return (fArr[i3 + 3] * fArr2[12 + i2]) + (fArr[i3 + 2] * fArr2[8 + i2]) + (fArr[i3 + 1] * fArr2[4 + i2]) + (fArr[i3] * fArr2[i2]);
    }

    public static final String f(Object[] objArr, int i, int i2, G g2) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == g2) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        AbstractC0048Bt.m(sb2, "toString(...)");
        return sb2;
    }

    public static final C0099Ds g(C0177Gs c0177Gs, float f2, C0073Cs c0073Cs, InterfaceC1377kd interfaceC1377kd) {
        return h(c0177Gs, Float.valueOf(0.0f), Float.valueOf(f2), VY.a, c0073Cs, interfaceC1377kd, 33208, 0);
    }

    public static final C0099Ds h(C0177Gs c0177Gs, Number number, Number number2, C0208Hx c0208Hx, C0073Cs c0073Cs, InterfaceC1377kd interfaceC1377kd, int i, int i2) {
        C1575nd c1575nd = (C1575nd) interfaceC1377kd;
        Object C = c1575nd.C();
        C1623oL c1623oL = C1311jd.a;
        if (C == c1623oL) {
            C0099Ds c0099Ds = new C0099Ds(c0177Gs, number, number2, c0208Hx, c0073Cs);
            c1575nd.P(c0099Ds);
            C = c0099Ds;
        }
        C0099Ds c0099Ds2 = (C0099Ds) C;
        boolean z = (((57344 & i) ^ 24576) > 16384 && c1575nd.e(c0073Cs)) || (i & 24576) == 16384;
        Object C2 = c1575nd.C();
        if (z || C2 == c1623oL) {
            C0941e0 c0941e0 = new C0941e0(number, c0099Ds2, number2, c0073Cs, 1);
            c1575nd.P(c0941e0);
            C2 = c0941e0;
        }
        KG kg = c1575nd.I.b.s;
        EG eg = EG.c;
        int i3 = eg.b;
        kg.k0(eg);
        AbstractC1052fg.R(kg, 0, (InterfaceC1455lp) C2);
        int i4 = kg.y;
        int i5 = eg.a;
        if (i4 == KG.d0(kg, i5) && kg.z == KG.d0(kg, i3)) {
            boolean e2 = c1575nd.e(c0177Gs);
            Object C3 = c1575nd.C();
            if (e2 || C3 == c1623oL) {
                C3 = new C0810c0(c0177Gs, 9, c0099Ds2);
                c1575nd.P(C3);
            }
            PX.d(c0099Ds2, (InterfaceC2114vp) C3, c1575nd);
            return c0099Ds2;
        }
        StringBuilder sb = new StringBuilder();
        int i6 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            if (((1 << i7) & kg.y) != 0) {
                if (i6 > 0) {
                    sb.append(", ");
                }
                sb.append(eg.b(i7));
                i6++;
            }
        }
        String sb2 = sb.toString();
        StringBuilder n = AbstractC1888sN.n(sb2, "StringBuilder().apply(builderAction).toString()");
        int i8 = 0;
        for (int i9 = 0; i9 < i3; i9++) {
            if (((1 << i9) & kg.z) != 0) {
                if (i6 > 0) {
                    n.append(", ");
                }
                n.append(eg.c(i9));
                i8++;
            }
        }
        String sb3 = n.toString();
        AbstractC0048Bt.m(sb3, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb4 = new StringBuilder("Error while pushing ");
        sb4.append(eg);
        sb4.append(". Not all arguments were provided. Missing ");
        AbstractC1888sN.r(sb4, i6, " int arguments (", sb2, ") and ");
        AbstractC1888sN.u(sb4, i8, " object arguments (", sb3, ").");
        throw null;
    }

    public static final C1032fM j(InterfaceC1991ty interfaceC1991ty) {
        InterfaceC1991ty h2 = interfaceC1991ty.h();
        return h2 != null ? h2.d(interfaceC1991ty, true) : new C1032fM(0.0f, 0.0f, (int) (interfaceC1991ty.y() >> 32), (int) (interfaceC1991ty.y() & 4294967295L));
    }

    public static final C1032fM k(ME me) {
        InterfaceC1991ty F = F(me);
        float y = (int) (F.y() >> 32);
        float y2 = (int) (F.y() & 4294967295L);
        C1032fM d2 = F(me).d(me, true);
        float f2 = d2.a;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > y) {
            f2 = y;
        }
        float f3 = d2.b;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 > y2) {
            f3 = y2;
        }
        float f4 = d2.c;
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        if (f4 <= y) {
            y = f4;
        }
        float f5 = d2.d;
        float f6 = f5 >= 0.0f ? f5 : 0.0f;
        if (f6 <= y2) {
            y2 = f6;
        }
        if (f2 == y || f3 == y2) {
            return C1032fM.e;
        }
        long e2 = F.e(PX.h(f2, f3));
        long e3 = F.e(PX.h(y, f3));
        long e4 = F.e(PX.h(y, y2));
        long e5 = F.e(PX.h(f2, y2));
        float b2 = BF.b(e2);
        float b3 = BF.b(e3);
        float b4 = BF.b(e5);
        float b5 = BF.b(e4);
        float min = Math.min(b2, Math.min(b3, Math.min(b4, b5)));
        float max = Math.max(b2, Math.max(b3, Math.max(b4, b5)));
        float c2 = BF.c(e2);
        float c3 = BF.c(e3);
        float c4 = BF.c(e5);
        float c5 = BF.c(e4);
        return new C1032fM(min, Math.min(c2, Math.min(c3, Math.min(c4, c5))), max, Math.max(c2, Math.max(c3, Math.max(c4, c5))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [o.jk] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    public static final boolean l(ArrayList arrayList) {
        ?? r0;
        long j;
        if (arrayList.size() >= 2) {
            if (arrayList.size() == 0 || arrayList.size() == 1) {
                r0 = C1318jk.h;
            } else {
                r0 = new ArrayList();
                Object obj = arrayList.get(0);
                int w = AbstractC0868ct.w(arrayList);
                int i = 0;
                while (i < w) {
                    i++;
                    Object obj2 = arrayList.get(i);
                    C2287yQ c2287yQ = (C2287yQ) obj2;
                    C2287yQ c2287yQ2 = (C2287yQ) obj;
                    r0.add(new BF(PX.h(Math.abs(BF.b(c2287yQ2.e().a()) - BF.b(c2287yQ.e().a())), Math.abs(BF.c(c2287yQ2.e().a()) - BF.c(c2287yQ.e().a())))));
                    obj = obj2;
                }
            }
            if (r0.size() == 1) {
                j = ((BF) AbstractC0720ac.n0(r0)).a;
            } else {
                if (r0.isEmpty()) {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
                Object n0 = AbstractC0720ac.n0(r0);
                int w2 = AbstractC0868ct.w(r0);
                if (1 <= w2) {
                    int i2 = 1;
                    while (true) {
                        n0 = new BF(BF.f(((BF) n0).a, ((BF) r0.get(i2)).a));
                        if (i2 == w2) {
                            break;
                        }
                        i2++;
                    }
                }
                j = ((BF) n0).a;
            }
            if (BF.c(j) >= BF.b(j)) {
                return false;
            }
        }
        return true;
    }

    public static void m(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int n(Context context, String str) {
        if (str != null) {
            return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : AbstractC1683pF.a(new C1749qF(context).a) ? 0 : -1;
        }
        throw new NullPointerException("permission must be non-null");
    }

    public static final boolean o(C0405Pn c0405Pn, boolean z) {
        int ordinal = c0405Pn.s().ordinal();
        EnumC0379On enumC0379On = EnumC0379On.j;
        if (ordinal == 0) {
            c0405Pn.w(enumC0379On);
            PX.I0(c0405Pn);
            return true;
        }
        if (ordinal == 1) {
            C0405Pn t = AbstractC1052fg.t(c0405Pn);
            if (!(t != null ? o(t, z) : true)) {
                return false;
            }
            c0405Pn.w(enumC0379On);
            PX.I0(c0405Pn);
            return true;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return true;
            }
            throw new C0057Cc();
        }
        if (z) {
            c0405Pn.w(enumC0379On);
            PX.I0(c0405Pn);
        }
        return z;
    }

    public static double p(double d2, double d3, double d4) {
        if (d3 <= d4) {
            return d2 < d3 ? d3 : d2 > d4 ? d4 : d2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d4 + " is less than minimum " + d3 + '.');
    }

    public static int q(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static long r(long j, long j2, long j3) {
        if (j2 <= j3) {
            return j < j2 ? j2 : j > j3 ? j3 : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + '.');
    }

    public static final InterfaceC1266iy s(InterfaceC1266iy interfaceC1266iy, HashSet hashSet) {
        InterfaceC1266iy s;
        C1097gL c1097gL = C1097gL.k;
        SW a2 = c1097gL.a(interfaceC1266iy);
        if (!hashSet.add(a2)) {
            return null;
        }
        InterfaceC1437lX V = PX.V(a2);
        if (V != null) {
            InterfaceC1266iy m = AbstractC0772bO.m(V);
            InterfaceC1266iy s2 = s(m, hashSet);
            if (s2 != null) {
                return ((s2 instanceof MR) && PX.o0((MR) s2) && PX.n0(interfaceC1266iy) && (PX.i0(c1097gL.a(m)) || ((m instanceof MR) && PX.o0((MR) m)))) ? c1097gL.E0(m) : (!PX.n0(s2) && (interfaceC1266iy instanceof MR) && PX.l0((MR) interfaceC1266iy)) ? c1097gL.E0(s2) : s2;
            }
            return null;
        }
        if (PX.i0(a2)) {
            AbstractC0048Bt.n(interfaceC1266iy, "$receiver");
            if (!(interfaceC1266iy instanceof AbstractC1004ey)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(interfaceC1266iy);
                sb.append(", ");
                throw new IllegalArgumentException(AbstractC1888sN.m(UM.a, interfaceC1266iy.getClass(), sb).toString());
            }
            JR f2 = AbstractC0306Ls.f((AbstractC1004ey) interfaceC1266iy);
            if (f2 == null || (s = s(f2, hashSet)) == null) {
                return null;
            }
            if (!PX.n0(interfaceC1266iy)) {
                return s;
            }
            if (!PX.n0(s) && (!(s instanceof MR) || !PX.o0((MR) s))) {
                return c1097gL.E0(s);
            }
        }
        return interfaceC1266iy;
    }

    public static final Object t(Class cls, Map map, List list) {
        AbstractC0048Bt.n(cls, "annotationClass");
        AbstractC0048Bt.n(list, "methods");
        BU D = EB.D(new C1139h0(2, map));
        Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C0883d4(cls, map, EB.D(new K2(cls, 1, map)), D, list));
        AbstractC0048Bt.l(newProxyInstance, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance");
        return newProxyInstance;
    }

    public static C0261Jy u(InterfaceC2072v9 interfaceC2072v9, AbstractC1004ey abstractC1004ey, C0827cE c0827cE, InterfaceC1738q4 interfaceC1738q4, int i) {
        if (interfaceC2072v9 == null) {
            a(32);
            throw null;
        }
        if (interfaceC1738q4 == null) {
            a(33);
            throw null;
        }
        if (abstractC1004ey == null) {
            return null;
        }
        C1708pe c1708pe = new C1708pe(interfaceC2072v9, abstractC1004ey, c0827cE);
        C0705aN c0705aN = AbstractC0958eE.a;
        return new C0261Jy(interfaceC2072v9, c1708pe, interfaceC1738q4, C0827cE.e("_context_receiver_" + i));
    }

    public static SJ v(PJ pj, InterfaceC1738q4 interfaceC1738q4) {
        return B(pj, interfaceC1738q4, true, pj.d());
    }

    public static WJ w(PJ pj, InterfaceC1738q4 interfaceC1738q4) {
        C1672p4 c1672p4 = C0460Rq.t;
        IS d2 = pj.d();
        if (d2 != null) {
            return D(pj, interfaceC1738q4, c1672p4, true, pj.getVisibility(), d2);
        }
        a(6);
        throw null;
    }

    public static RJ x(AbstractC1598o abstractC1598o) {
        if (abstractC1598o == null) {
            a(26);
            throw null;
        }
        InterfaceC1245ib o2 = AbstractC1052fg.o(AbstractC0114Eh.d(abstractC1598o), C1039fT.t);
        if (o2 == null) {
            return null;
        }
        C1672p4 c1672p4 = C0460Rq.t;
        C0244Jh c0244Jh = AbstractC0270Kh.e;
        RJ I0 = RJ.I0(abstractC1598o, 1, c0244Jh, false, AbstractC1499mT.b, 4, abstractC1598o.d());
        SJ sj = new SJ(I0, c1672p4, 1, c0244Jh, false, false, false, 4, null, abstractC1598o.d());
        I0.L0(sj, null, null, null);
        OW.i.getClass();
        OW ow = OW.j;
        SW z = o2.z();
        List singletonList = Collections.singletonList(new C1767qX(1, abstractC1598o.i()));
        AbstractC0048Bt.n(ow, "attributes");
        AbstractC0048Bt.n(z, "constructor");
        AbstractC0048Bt.n(singletonList, "arguments");
        JR r = HO.r(singletonList, ow, z, false);
        List list = Collections.EMPTY_LIST;
        I0.O0(r, list, null, null, list);
        sj.K0(I0.getReturnType());
        return I0;
    }

    public static HR y(AbstractC1598o abstractC1598o) {
        if (abstractC1598o == null) {
            a(24);
            throw null;
        }
        C1672p4 c1672p4 = C0460Rq.t;
        HR S0 = HR.S0(abstractC1598o, AbstractC1499mT.c, 4, abstractC1598o.d());
        RY ry = new RY(S0, null, 0, c1672p4, C0827cE.e("value"), AbstractC0192Hh.e(abstractC1598o).u(), false, false, false, null, abstractC1598o.d());
        List list = Collections.EMPTY_LIST;
        return S0.M0(null, null, list, list, Collections.singletonList(ry), abstractC1598o.i(), 1, AbstractC0270Kh.e);
    }

    public static HR z(AbstractC1598o abstractC1598o) {
        if (abstractC1598o == null) {
            a(22);
            throw null;
        }
        HR S0 = HR.S0(abstractC1598o, AbstractC1499mT.a, 4, abstractC1598o.d());
        List list = Collections.EMPTY_LIST;
        return S0.M0(null, null, list, list, list, AbstractC0192Hh.e(abstractC1598o).h(abstractC1598o.i()), 1, AbstractC0270Kh.e);
    }

    public abstract String i();
}
