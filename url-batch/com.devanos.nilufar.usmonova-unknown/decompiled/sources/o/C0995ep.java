package o;

import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: o.ep, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0995ep {
    public final C2002u5 a;
    public final C1334k b;
    public final AbstractComponentCallbacksC0069Co c;
    public boolean d = false;
    public int e = -1;

    public C0995ep(C2002u5 c2002u5, C1334k c1334k, AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co) {
        this.a = c2002u5;
        this.b = c1334k;
        this.c = abstractComponentCallbacksC0069Co;
    }

    public final void a() {
        boolean J = AbstractC0588Wo.J(3);
        AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co = this.c;
        if (J) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + abstractComponentCallbacksC0069Co);
        }
        Bundle bundle = abstractComponentCallbacksC0069Co.i;
        if (bundle != null) {
            bundle.getBundle("savedInstanceState");
        }
        abstractComponentCallbacksC0069Co.B.P();
        abstractComponentCallbacksC0069Co.h = 3;
        abstractComponentCallbacksC0069Co.K = false;
        abstractComponentCallbacksC0069Co.j();
        if (!abstractComponentCallbacksC0069Co.K) {
            throw new C1368kU("Fragment " + abstractComponentCallbacksC0069Co + " did not call through to super.onActivityCreated()");
        }
        if (AbstractC0588Wo.J(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + abstractComponentCallbacksC0069Co);
        }
        abstractComponentCallbacksC0069Co.i = null;
        C0614Xo c0614Xo = abstractComponentCallbacksC0069Co.B;
        c0614Xo.G = false;
        c0614Xo.H = false;
        c0614Xo.N.g = false;
        c0614Xo.u(4);
        this.a.C(abstractComponentCallbacksC0069Co, false);
    }

    public final void b() {
        C0995ep c0995ep;
        boolean J = AbstractC0588Wo.J(3);
        AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co = this.c;
        if (J) {
            Log.d("FragmentManager", "moveto ATTACHED: " + abstractComponentCallbacksC0069Co);
        }
        AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co2 = abstractComponentCallbacksC0069Co.n;
        C1334k c1334k = this.b;
        if (abstractComponentCallbacksC0069Co2 != null) {
            c0995ep = (C0995ep) ((HashMap) c1334k.i).get(abstractComponentCallbacksC0069Co2.l);
            if (c0995ep == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0069Co + " declared target fragment " + abstractComponentCallbacksC0069Co.n + " that does not belong to this FragmentManager!");
            }
            abstractComponentCallbacksC0069Co.f25o = abstractComponentCallbacksC0069Co.n.l;
            abstractComponentCallbacksC0069Co.n = null;
        } else {
            String str = abstractComponentCallbacksC0069Co.f25o;
            if (str != null) {
                c0995ep = (C0995ep) ((HashMap) c1334k.i).get(str);
                if (c0995ep == null) {
                    StringBuilder sb = new StringBuilder("Fragment ");
                    sb.append(abstractComponentCallbacksC0069Co);
                    sb.append(" declared target fragment ");
                    throw new IllegalStateException(AbstractC1888sN.l(sb, abstractComponentCallbacksC0069Co.f25o, " that does not belong to this FragmentManager!"));
                }
            } else {
                c0995ep = null;
            }
        }
        if (c0995ep != null) {
            c0995ep.j();
        }
        AbstractC0588Wo abstractC0588Wo = abstractComponentCallbacksC0069Co.z;
        abstractComponentCallbacksC0069Co.A = abstractC0588Wo.v;
        abstractComponentCallbacksC0069Co.C = abstractC0588Wo.x;
        C2002u5 c2002u5 = this.a;
        c2002u5.I(abstractComponentCallbacksC0069Co, false);
        ArrayList arrayList = abstractComponentCallbacksC0069Co.W;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co3 = ((C0017Ao) it.next()).a;
            abstractComponentCallbacksC0069Co3.V.a();
            AbstractC1807r8.E(abstractComponentCallbacksC0069Co3);
            Bundle bundle = abstractComponentCallbacksC0069Co3.i;
            abstractComponentCallbacksC0069Co3.V.b(bundle != null ? bundle.getBundle("registryState") : null);
        }
        arrayList.clear();
        abstractComponentCallbacksC0069Co.B.b(abstractComponentCallbacksC0069Co.A, abstractComponentCallbacksC0069Co.a(), abstractComponentCallbacksC0069Co);
        abstractComponentCallbacksC0069Co.h = 0;
        abstractComponentCallbacksC0069Co.K = false;
        abstractComponentCallbacksC0069Co.l(abstractComponentCallbacksC0069Co.A.s);
        if (!abstractComponentCallbacksC0069Co.K) {
            throw new C1368kU("Fragment " + abstractComponentCallbacksC0069Co + " did not call through to super.onAttach()");
        }
        Iterator it2 = abstractComponentCallbacksC0069Co.z.f126o.iterator();
        while (it2.hasNext()) {
            ((InterfaceC0799bp) it2.next()).a(abstractComponentCallbacksC0069Co);
        }
        C0614Xo c0614Xo = abstractComponentCallbacksC0069Co.B;
        c0614Xo.G = false;
        c0614Xo.H = false;
        c0614Xo.N.g = false;
        c0614Xo.u(0);
        c2002u5.D(abstractComponentCallbacksC0069Co, false);
    }

    public final int c() {
        Object obj;
        Object obj2;
        AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co = this.c;
        if (abstractComponentCallbacksC0069Co.z == null) {
            return abstractComponentCallbacksC0069Co.h;
        }
        int i = this.e;
        int ordinal = abstractComponentCallbacksC0069Co.S.ordinal();
        if (ordinal == 1) {
            i = Math.min(i, 0);
        } else if (ordinal == 2) {
            i = Math.min(i, 1);
        } else if (ordinal == 3) {
            i = Math.min(i, 5);
        } else if (ordinal != 4) {
            i = Math.min(i, -1);
        }
        if (abstractComponentCallbacksC0069Co.u) {
            i = abstractComponentCallbacksC0069Co.v ? Math.max(this.e, 2) : this.e < 4 ? Math.min(i, abstractComponentCallbacksC0069Co.h) : Math.min(i, 1);
        }
        if (!abstractComponentCallbacksC0069Co.r) {
            i = Math.min(i, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0069Co.L;
        if (viewGroup != null) {
            C0450Rg e = C0450Rg.e(viewGroup, abstractComponentCallbacksC0069Co.e());
            e.getClass();
            Iterator it = e.b.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                ((RS) obj2).getClass();
                if (AbstractC0048Bt.h(null, abstractComponentCallbacksC0069Co)) {
                    break;
                }
            }
            Iterator it2 = e.c.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                ((RS) next).getClass();
                if (AbstractC0048Bt.h(null, abstractComponentCallbacksC0069Co)) {
                    obj = next;
                    break;
                }
            }
        }
        if (abstractComponentCallbacksC0069Co.s) {
            i = abstractComponentCallbacksC0069Co.i() ? Math.min(i, 1) : Math.min(i, -1);
        }
        if (abstractComponentCallbacksC0069Co.M && abstractComponentCallbacksC0069Co.h < 5) {
            i = Math.min(i, 4);
        }
        if (abstractComponentCallbacksC0069Co.t && abstractComponentCallbacksC0069Co.L != null) {
            i = Math.max(i, 3);
        }
        if (AbstractC0588Wo.J(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i + " for " + abstractComponentCallbacksC0069Co);
        }
        return i;
    }

    public final void d() {
        Bundle bundle;
        boolean J = AbstractC0588Wo.J(3);
        AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co = this.c;
        if (J) {
            Log.d("FragmentManager", "moveto CREATED: " + abstractComponentCallbacksC0069Co);
        }
        Bundle bundle2 = abstractComponentCallbacksC0069Co.i;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
        if (abstractComponentCallbacksC0069Co.Q) {
            abstractComponentCallbacksC0069Co.h = 1;
            Bundle bundle4 = abstractComponentCallbacksC0069Co.i;
            if (bundle4 == null || (bundle = bundle4.getBundle("childFragmentManager")) == null) {
                return;
            }
            abstractComponentCallbacksC0069Co.B.U(bundle);
            C0614Xo c0614Xo = abstractComponentCallbacksC0069Co.B;
            c0614Xo.G = false;
            c0614Xo.H = false;
            c0614Xo.N.g = false;
            c0614Xo.u(1);
            return;
        }
        C2002u5 c2002u5 = this.a;
        c2002u5.J(abstractComponentCallbacksC0069Co, false);
        abstractComponentCallbacksC0069Co.B.P();
        abstractComponentCallbacksC0069Co.h = 1;
        abstractComponentCallbacksC0069Co.K = false;
        abstractComponentCallbacksC0069Co.T.a(new C0966eM(3, abstractComponentCallbacksC0069Co));
        abstractComponentCallbacksC0069Co.m(bundle3);
        abstractComponentCallbacksC0069Co.Q = true;
        if (abstractComponentCallbacksC0069Co.K) {
            abstractComponentCallbacksC0069Co.T.e(EnumC0054Bz.ON_CREATE);
            c2002u5.E(abstractComponentCallbacksC0069Co, false);
        } else {
            throw new C1368kU("Fragment " + abstractComponentCallbacksC0069Co + " did not call through to super.onCreate()");
        }
    }

    public final void e() {
        String str;
        AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co = this.c;
        if (abstractComponentCallbacksC0069Co.u) {
            return;
        }
        if (AbstractC0588Wo.J(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0069Co);
        }
        Bundle bundle = abstractComponentCallbacksC0069Co.i;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater p = abstractComponentCallbacksC0069Co.p(bundle2);
        ViewGroup viewGroup2 = abstractComponentCallbacksC0069Co.L;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = abstractComponentCallbacksC0069Co.E;
            if (i != 0) {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + abstractComponentCallbacksC0069Co + " for a container view with no id");
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC0069Co.z.w.C(i);
                if (viewGroup == null) {
                    if (!abstractComponentCallbacksC0069Co.w) {
                        try {
                            str = abstractComponentCallbacksC0069Co.u().getResources().getResourceName(abstractComponentCallbacksC0069Co.E);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC0069Co.E) + " (" + str + ") for fragment " + abstractComponentCallbacksC0069Co);
                    }
                } else if (!(viewGroup instanceof C0251Jo)) {
                    C1127gp c1127gp = AbstractC1193hp.a;
                    AbstractC1193hp.b(new C0864cp(abstractComponentCallbacksC0069Co, "Attempting to add fragment " + abstractComponentCallbacksC0069Co + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    AbstractC1193hp.a(abstractComponentCallbacksC0069Co).getClass();
                }
            }
        }
        abstractComponentCallbacksC0069Co.L = viewGroup;
        abstractComponentCallbacksC0069Co.t(p, viewGroup, bundle2);
        abstractComponentCallbacksC0069Co.h = 2;
    }

    public final void f() {
        AbstractComponentCallbacksC0069Co g;
        boolean J = AbstractC0588Wo.J(3);
        AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co = this.c;
        if (J) {
            Log.d("FragmentManager", "movefrom CREATED: " + abstractComponentCallbacksC0069Co);
        }
        boolean z = true;
        boolean z2 = abstractComponentCallbacksC0069Co.s && !abstractComponentCallbacksC0069Co.i();
        C1334k c1334k = this.b;
        if (z2) {
            c1334k.H(abstractComponentCallbacksC0069Co.l, null);
        }
        if (!z2) {
            C0733ap c0733ap = (C0733ap) c1334k.l;
            if (!((c0733ap.b.containsKey(abstractComponentCallbacksC0069Co.l) && c0733ap.e) ? c0733ap.f : true)) {
                String str = abstractComponentCallbacksC0069Co.f25o;
                if (str != null && (g = c1334k.g(str)) != null && g.I) {
                    abstractComponentCallbacksC0069Co.n = g;
                }
                abstractComponentCallbacksC0069Co.h = 0;
                return;
            }
        }
        C0173Go c0173Go = abstractComponentCallbacksC0069Co.A;
        if (c0173Go != null) {
            z = ((C0733ap) c1334k.l).f;
        } else {
            J4 j4 = c0173Go.s;
            if (j4 != null) {
                z = true ^ j4.isChangingConfigurations();
            }
        }
        if (z2 || z) {
            ((C0733ap) c1334k.l).f(abstractComponentCallbacksC0069Co, false);
        }
        abstractComponentCallbacksC0069Co.B.l();
        abstractComponentCallbacksC0069Co.T.e(EnumC0054Bz.ON_DESTROY);
        abstractComponentCallbacksC0069Co.h = 0;
        abstractComponentCallbacksC0069Co.K = false;
        abstractComponentCallbacksC0069Co.Q = false;
        abstractComponentCallbacksC0069Co.K = true;
        if (!abstractComponentCallbacksC0069Co.K) {
            throw new C1368kU("Fragment " + abstractComponentCallbacksC0069Co + " did not call through to super.onDestroy()");
        }
        this.a.F(abstractComponentCallbacksC0069Co, false);
        Iterator it = c1334k.t().iterator();
        while (it.hasNext()) {
            C0995ep c0995ep = (C0995ep) it.next();
            if (c0995ep != null) {
                AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co2 = c0995ep.c;
                if (abstractComponentCallbacksC0069Co.l.equals(abstractComponentCallbacksC0069Co2.f25o)) {
                    abstractComponentCallbacksC0069Co2.n = abstractComponentCallbacksC0069Co;
                    abstractComponentCallbacksC0069Co2.f25o = null;
                }
            }
        }
        String str2 = abstractComponentCallbacksC0069Co.f25o;
        if (str2 != null) {
            abstractComponentCallbacksC0069Co.n = c1334k.g(str2);
        }
        c1334k.D(this);
    }

    public final void g() {
        AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co = this.c;
        if (AbstractC0588Wo.J(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + abstractComponentCallbacksC0069Co);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0069Co.L;
        abstractComponentCallbacksC0069Co.B.u(1);
        abstractComponentCallbacksC0069Co.h = 1;
        abstractComponentCallbacksC0069Co.K = false;
        abstractComponentCallbacksC0069Co.n();
        if (!abstractComponentCallbacksC0069Co.K) {
            throw new C1368kU("Fragment " + abstractComponentCallbacksC0069Co + " did not call through to super.onDestroyView()");
        }
        PS ps = AA.a(abstractComponentCallbacksC0069Co).b.b;
        if (ps.j > 0) {
            ps.i[0].getClass();
            throw new ClassCastException();
        }
        abstractComponentCallbacksC0069Co.x = false;
        this.a.O(abstractComponentCallbacksC0069Co, false);
        abstractComponentCallbacksC0069Co.L = null;
        BD bd = abstractComponentCallbacksC0069Co.U;
        bd.getClass();
        BD.a("setValue");
        bd.g++;
        bd.e = null;
        bd.c(null);
        abstractComponentCallbacksC0069Co.v = false;
    }

    public final void h() {
        boolean J = AbstractC0588Wo.J(3);
        AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co = this.c;
        if (J) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + abstractComponentCallbacksC0069Co);
        }
        abstractComponentCallbacksC0069Co.h = -1;
        abstractComponentCallbacksC0069Co.K = false;
        abstractComponentCallbacksC0069Co.o();
        if (!abstractComponentCallbacksC0069Co.K) {
            throw new C1368kU("Fragment " + abstractComponentCallbacksC0069Co + " did not call through to super.onDetach()");
        }
        C0614Xo c0614Xo = abstractComponentCallbacksC0069Co.B;
        if (!c0614Xo.I) {
            c0614Xo.l();
            abstractComponentCallbacksC0069Co.B = new C0614Xo();
        }
        this.a.G(abstractComponentCallbacksC0069Co, false);
        abstractComponentCallbacksC0069Co.h = -1;
        abstractComponentCallbacksC0069Co.A = null;
        abstractComponentCallbacksC0069Co.C = null;
        abstractComponentCallbacksC0069Co.z = null;
        if (!abstractComponentCallbacksC0069Co.s || abstractComponentCallbacksC0069Co.i()) {
            C0733ap c0733ap = (C0733ap) this.b.l;
            if (!((c0733ap.b.containsKey(abstractComponentCallbacksC0069Co.l) && c0733ap.e) ? c0733ap.f : true)) {
                return;
            }
        }
        if (AbstractC0588Wo.J(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0069Co);
        }
        abstractComponentCallbacksC0069Co.g();
    }

    public final void i() {
        AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co = this.c;
        if (abstractComponentCallbacksC0069Co.u && abstractComponentCallbacksC0069Co.v && !abstractComponentCallbacksC0069Co.x) {
            if (AbstractC0588Wo.J(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0069Co);
            }
            Bundle bundle = abstractComponentCallbacksC0069Co.i;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            abstractComponentCallbacksC0069Co.t(abstractComponentCallbacksC0069Co.p(bundle2), null, bundle2);
        }
    }

    public final void j() {
        C1334k c1334k = this.b;
        boolean z = this.d;
        AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co = this.c;
        if (z) {
            if (AbstractC0588Wo.J(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + abstractComponentCallbacksC0069Co);
                return;
            }
            return;
        }
        try {
            this.d = true;
            boolean z2 = false;
            while (true) {
                int c = c();
                int i = abstractComponentCallbacksC0069Co.h;
                if (c == i) {
                    if (!z2 && i == -1 && abstractComponentCallbacksC0069Co.s && !abstractComponentCallbacksC0069Co.i()) {
                        if (AbstractC0588Wo.J(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + abstractComponentCallbacksC0069Co);
                        }
                        ((C0733ap) c1334k.l).f(abstractComponentCallbacksC0069Co, true);
                        c1334k.D(this);
                        if (AbstractC0588Wo.J(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0069Co);
                        }
                        abstractComponentCallbacksC0069Co.g();
                    }
                    if (abstractComponentCallbacksC0069Co.P) {
                        AbstractC0588Wo abstractC0588Wo = abstractComponentCallbacksC0069Co.z;
                        if (abstractC0588Wo != null && abstractComponentCallbacksC0069Co.r && AbstractC0588Wo.K(abstractComponentCallbacksC0069Co)) {
                            abstractC0588Wo.F = true;
                        }
                        abstractComponentCallbacksC0069Co.P = false;
                        abstractComponentCallbacksC0069Co.B.o();
                    }
                    this.d = false;
                    return;
                }
                if (c <= i) {
                    switch (i - 1) {
                        case -1:
                            h();
                            break;
                        case 0:
                            f();
                            break;
                        case 1:
                            g();
                            abstractComponentCallbacksC0069Co.h = 1;
                            break;
                        case 2:
                            abstractComponentCallbacksC0069Co.v = false;
                            abstractComponentCallbacksC0069Co.h = 2;
                            break;
                        case 3:
                            if (AbstractC0588Wo.J(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + abstractComponentCallbacksC0069Co);
                            }
                            abstractComponentCallbacksC0069Co.h = 3;
                            break;
                        case 4:
                            o();
                            break;
                        case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                            abstractComponentCallbacksC0069Co.h = 5;
                            break;
                        case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                            k();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            b();
                            break;
                        case 1:
                            d();
                            break;
                        case 2:
                            i();
                            e();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            abstractComponentCallbacksC0069Co.h = 4;
                            break;
                        case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                            n();
                            break;
                        case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                            abstractComponentCallbacksC0069Co.h = 6;
                            break;
                        case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                            m();
                            break;
                    }
                }
                z2 = true;
            }
        } catch (Throwable th) {
            this.d = false;
            throw th;
        }
    }

    public final void k() {
        boolean J = AbstractC0588Wo.J(3);
        AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co = this.c;
        if (J) {
            Log.d("FragmentManager", "movefrom RESUMED: " + abstractComponentCallbacksC0069Co);
        }
        abstractComponentCallbacksC0069Co.B.u(5);
        abstractComponentCallbacksC0069Co.T.e(EnumC0054Bz.ON_PAUSE);
        abstractComponentCallbacksC0069Co.h = 6;
        abstractComponentCallbacksC0069Co.K = true;
        this.a.H(abstractComponentCallbacksC0069Co, false);
    }

    public final void l(ClassLoader classLoader) {
        AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co = this.c;
        Bundle bundle = abstractComponentCallbacksC0069Co.i;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (abstractComponentCallbacksC0069Co.i.getBundle("savedInstanceState") == null) {
            abstractComponentCallbacksC0069Co.i.putBundle("savedInstanceState", new Bundle());
        }
        try {
            abstractComponentCallbacksC0069Co.j = abstractComponentCallbacksC0069Co.i.getSparseParcelableArray("viewState");
            abstractComponentCallbacksC0069Co.k = abstractComponentCallbacksC0069Co.i.getBundle("viewRegistryState");
            C0929dp c0929dp = (C0929dp) abstractComponentCallbacksC0069Co.i.getParcelable("state");
            if (c0929dp != null) {
                abstractComponentCallbacksC0069Co.f25o = c0929dp.s;
                abstractComponentCallbacksC0069Co.p = c0929dp.t;
                abstractComponentCallbacksC0069Co.N = c0929dp.u;
            }
            if (abstractComponentCallbacksC0069Co.N) {
                return;
            }
            abstractComponentCallbacksC0069Co.M = true;
        } catch (BadParcelableException e) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + abstractComponentCallbacksC0069Co, e);
        }
    }

    public final void m() {
        boolean J = AbstractC0588Wo.J(3);
        AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co = this.c;
        if (J) {
            Log.d("FragmentManager", "moveto RESUMED: " + abstractComponentCallbacksC0069Co);
        }
        C0043Bo c0043Bo = abstractComponentCallbacksC0069Co.O;
        View view = c0043Bo == null ? null : c0043Bo.j;
        if (view != null) {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            }
        }
        abstractComponentCallbacksC0069Co.b().j = null;
        abstractComponentCallbacksC0069Co.B.P();
        abstractComponentCallbacksC0069Co.B.A(true);
        abstractComponentCallbacksC0069Co.h = 7;
        abstractComponentCallbacksC0069Co.K = false;
        abstractComponentCallbacksC0069Co.K = true;
        if (!abstractComponentCallbacksC0069Co.K) {
            throw new C1368kU("Fragment " + abstractComponentCallbacksC0069Co + " did not call through to super.onResume()");
        }
        abstractComponentCallbacksC0069Co.T.e(EnumC0054Bz.ON_RESUME);
        C0614Xo c0614Xo = abstractComponentCallbacksC0069Co.B;
        c0614Xo.G = false;
        c0614Xo.H = false;
        c0614Xo.N.g = false;
        c0614Xo.u(7);
        this.a.K(abstractComponentCallbacksC0069Co, false);
        this.b.H(abstractComponentCallbacksC0069Co.l, null);
        abstractComponentCallbacksC0069Co.i = null;
        abstractComponentCallbacksC0069Co.j = null;
        abstractComponentCallbacksC0069Co.k = null;
    }

    public final void n() {
        boolean J = AbstractC0588Wo.J(3);
        AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co = this.c;
        if (J) {
            Log.d("FragmentManager", "moveto STARTED: " + abstractComponentCallbacksC0069Co);
        }
        abstractComponentCallbacksC0069Co.B.P();
        abstractComponentCallbacksC0069Co.B.A(true);
        abstractComponentCallbacksC0069Co.h = 5;
        abstractComponentCallbacksC0069Co.K = false;
        abstractComponentCallbacksC0069Co.r();
        if (!abstractComponentCallbacksC0069Co.K) {
            throw new C1368kU("Fragment " + abstractComponentCallbacksC0069Co + " did not call through to super.onStart()");
        }
        abstractComponentCallbacksC0069Co.T.e(EnumC0054Bz.ON_START);
        C0614Xo c0614Xo = abstractComponentCallbacksC0069Co.B;
        c0614Xo.G = false;
        c0614Xo.H = false;
        c0614Xo.N.g = false;
        c0614Xo.u(5);
        this.a.M(abstractComponentCallbacksC0069Co, false);
    }

    public final void o() {
        boolean J = AbstractC0588Wo.J(3);
        AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co = this.c;
        if (J) {
            Log.d("FragmentManager", "movefrom STARTED: " + abstractComponentCallbacksC0069Co);
        }
        C0614Xo c0614Xo = abstractComponentCallbacksC0069Co.B;
        c0614Xo.H = true;
        c0614Xo.N.g = true;
        c0614Xo.u(4);
        abstractComponentCallbacksC0069Co.T.e(EnumC0054Bz.ON_STOP);
        abstractComponentCallbacksC0069Co.h = 4;
        abstractComponentCallbacksC0069Co.K = false;
        abstractComponentCallbacksC0069Co.s();
        if (abstractComponentCallbacksC0069Co.K) {
            this.a.N(abstractComponentCallbacksC0069Co, false);
            return;
        }
        throw new C1368kU("Fragment " + abstractComponentCallbacksC0069Co + " did not call through to super.onStop()");
    }

    public C0995ep(C2002u5 c2002u5, C1334k c1334k, ClassLoader classLoader, C0432Qo c0432Qo, Bundle bundle) {
        this.a = c2002u5;
        this.b = c1334k;
        C0929dp c0929dp = (C0929dp) bundle.getParcelable("state");
        AbstractComponentCallbacksC0069Co a = c0432Qo.a(c0929dp.h);
        a.l = c0929dp.i;
        a.u = c0929dp.j;
        a.w = true;
        a.D = c0929dp.k;
        a.E = c0929dp.l;
        a.F = c0929dp.m;
        a.I = c0929dp.n;
        a.s = c0929dp.f158o;
        a.H = c0929dp.p;
        a.G = c0929dp.q;
        a.S = EnumC0080Cz.values()[c0929dp.r];
        a.f25o = c0929dp.s;
        a.p = c0929dp.t;
        a.N = c0929dp.u;
        this.c = a;
        a.i = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        AbstractC0588Wo abstractC0588Wo = a.z;
        if (abstractC0588Wo != null && (abstractC0588Wo.G || abstractC0588Wo.H)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        a.m = bundle2;
        if (AbstractC0588Wo.J(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a);
        }
    }

    public C0995ep(C2002u5 c2002u5, C1334k c1334k, AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co, Bundle bundle) {
        this.a = c2002u5;
        this.b = c1334k;
        this.c = abstractComponentCallbacksC0069Co;
        abstractComponentCallbacksC0069Co.j = null;
        abstractComponentCallbacksC0069Co.k = null;
        abstractComponentCallbacksC0069Co.y = 0;
        abstractComponentCallbacksC0069Co.v = false;
        abstractComponentCallbacksC0069Co.r = false;
        AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co2 = abstractComponentCallbacksC0069Co.n;
        abstractComponentCallbacksC0069Co.f25o = abstractComponentCallbacksC0069Co2 != null ? abstractComponentCallbacksC0069Co2.l : null;
        abstractComponentCallbacksC0069Co.n = null;
        abstractComponentCallbacksC0069Co.i = bundle;
        abstractComponentCallbacksC0069Co.m = bundle.getBundle("arguments");
    }
}
