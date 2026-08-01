package androidx.fragment.app;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.ionia.reidopitaco.libya.R;
import defpackage.bk;
import defpackage.bl;
import defpackage.dk;
import defpackage.f80;
import defpackage.f9;
import defpackage.fk;
import defpackage.fp;
import defpackage.gp;
import defpackage.jp;
import defpackage.l8;
import defpackage.lp;
import defpackage.n20;
import defpackage.nk;
import defpackage.nq;
import defpackage.o4;
import defpackage.oe;
import defpackage.oo;
import defpackage.re;
import defpackage.s20;
import defpackage.sk;
import defpackage.u20;
import defpackage.uk;
import defpackage.vk;
import defpackage.wk;
import defpackage.xk;
import defpackage.y5;
import defpackage.yk;
import defpackage.zj;
import defpackage.zk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class a {
    public final o4 a;
    public final oe b;
    public final dk c;
    public boolean d = false;
    public int e = -1;

    public a(o4 o4Var, oe oeVar, ClassLoader classLoader, nk nkVar, xk xkVar) {
        this.a = o4Var;
        this.b = oeVar;
        dk a = nkVar.a(xkVar.f);
        Bundle bundle = xkVar.o;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a.F(bundle);
        a.j = xkVar.g;
        a.r = xkVar.h;
        a.t = true;
        a.A = xkVar.i;
        a.B = xkVar.j;
        a.C = xkVar.k;
        a.F = xkVar.l;
        a.q = xkVar.m;
        a.E = xkVar.n;
        a.D = xkVar.p;
        a.Q = gp.values()[xkVar.q];
        Bundle bundle2 = xkVar.r;
        if (bundle2 != null) {
            a.g = bundle2;
        } else {
            a.g = new Bundle();
        }
        this.c = a;
        if (sk.G(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a);
        }
    }

    public final void a() {
        boolean G = sk.G(3);
        dk dkVar = this.c;
        if (G) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + dkVar);
        }
        Bundle bundle = dkVar.g;
        dkVar.y.M();
        dkVar.f = 3;
        dkVar.H = false;
        dkVar.p();
        if (!dkVar.H) {
            l8.f(dkVar, " did not call through to super.onActivityCreated()");
            return;
        }
        if (sk.G(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + dkVar);
        }
        View view = dkVar.J;
        if (view != null) {
            Bundle bundle2 = dkVar.g;
            SparseArray<Parcelable> sparseArray = dkVar.h;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                dkVar.h = null;
            }
            if (dkVar.J != null) {
                dkVar.S.i.b(dkVar.i);
                dkVar.i = null;
            }
            dkVar.H = false;
            dkVar.A(bundle2);
            if (!dkVar.H) {
                l8.f(dkVar, " did not call through to super.onViewStateRestored()");
                return;
            } else if (dkVar.J != null) {
                dkVar.S.b(fp.ON_CREATE);
            }
        }
        dkVar.g = null;
        sk skVar = dkVar.y;
        skVar.E = false;
        skVar.F = false;
        skVar.L.h = false;
        skVar.t(4);
        this.a.d(false);
    }

    public final void b() {
        View view;
        View view2;
        ArrayList arrayList = (ArrayList) this.b.f;
        dk dkVar = this.c;
        ViewGroup viewGroup = dkVar.I;
        int i = -1;
        if (viewGroup != null) {
            int indexOf = arrayList.indexOf(dkVar);
            int i2 = indexOf - 1;
            while (true) {
                if (i2 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        dk dkVar2 = (dk) arrayList.get(indexOf);
                        if (dkVar2.I == viewGroup && (view = dkVar2.J) != null) {
                            i = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    dk dkVar3 = (dk) arrayList.get(i2);
                    if (dkVar3.I == viewGroup && (view2 = dkVar3.J) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
        }
        dkVar.I.addView(dkVar.J, i);
    }

    public final void c() {
        boolean G = sk.G(3);
        dk dkVar = this.c;
        if (G) {
            Log.d("FragmentManager", "moveto ATTACHED: " + dkVar);
        }
        dk dkVar2 = dkVar.l;
        a aVar = null;
        oe oeVar = this.b;
        if (dkVar2 != null) {
            a aVar2 = (a) ((HashMap) oeVar.g).get(dkVar2.j);
            if (aVar2 == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(dkVar);
                dk dkVar3 = dkVar.l;
                sb.append(" declared target fragment ");
                sb.append(dkVar3);
                sb.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb.toString());
            }
            dkVar.m = dkVar.l.j;
            dkVar.l = null;
            aVar = aVar2;
        } else {
            String str = dkVar.m;
            if (str != null && (aVar = (a) ((HashMap) oeVar.g).get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(dkVar);
                String str2 = dkVar.m;
                sb2.append(" declared target fragment ");
                sb2.append(str2);
                sb2.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb2.toString());
            }
        }
        if (aVar != null) {
            aVar.k();
        }
        sk skVar = dkVar.w;
        dkVar.x = skVar.t;
        dkVar.z = skVar.v;
        o4 o4Var = this.a;
        o4Var.j(false);
        ArrayList arrayList = dkVar.V;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            dk dkVar4 = ((zj) obj).a;
            dkVar4.U.a();
            oo.l(dkVar4);
        }
        arrayList.clear();
        dkVar.y.b(dkVar.x, dkVar.b(), dkVar);
        dkVar.f = 0;
        dkVar.H = false;
        dkVar.r(dkVar.x.v);
        if (!dkVar.H) {
            l8.f(dkVar, " did not call through to super.onAttach()");
            return;
        }
        Iterator it = dkVar.w.m.iterator();
        while (it.hasNext()) {
            ((vk) it.next()).b();
        }
        sk skVar2 = dkVar.y;
        skVar2.E = false;
        skVar2.F = false;
        skVar2.L.h = false;
        skVar2.t(0);
        o4Var.e(false);
    }

    public final int d() {
        u20 u20Var;
        dk dkVar = this.c;
        if (dkVar.w == null) {
            return dkVar.f;
        }
        int i = this.e;
        int ordinal = dkVar.Q.ordinal();
        int i2 = 0;
        if (ordinal == 1) {
            i = Math.min(i, 0);
        } else if (ordinal == 2) {
            i = Math.min(i, 1);
        } else if (ordinal == 3) {
            i = Math.min(i, 5);
        } else if (ordinal != 4) {
            i = Math.min(i, -1);
        }
        if (dkVar.r) {
            boolean z = dkVar.s;
            int i3 = this.e;
            if (z) {
                i = Math.max(i3, 2);
                View view = dkVar.J;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = i3 < 4 ? Math.min(i, dkVar.f) : Math.min(i, 1);
            }
        }
        if (!dkVar.p) {
            i = Math.min(i, 1);
        }
        ViewGroup viewGroup = dkVar.I;
        if (viewGroup != null) {
            re f = re.f(viewGroup, dkVar.j().E());
            u20 d = f.d(dkVar);
            int i4 = d != null ? d.b : 0;
            ArrayList arrayList = f.c;
            int size = arrayList.size();
            while (true) {
                if (i2 >= size) {
                    u20Var = null;
                    break;
                }
                Object obj = arrayList.get(i2);
                i2++;
                u20Var = (u20) obj;
                dk dkVar2 = u20Var.c;
                dkVar2.getClass();
                if (dkVar2 == dkVar && !u20Var.f) {
                    break;
                }
            }
            i2 = (u20Var == null || !(i4 == 0 || i4 == 1)) ? i4 : u20Var.b;
        }
        if (i2 == 2) {
            i = Math.min(i, 6);
        } else if (i2 == 3) {
            i = Math.max(i, 3);
        } else if (dkVar.q) {
            i = dkVar.o() ? Math.min(i, 1) : Math.min(i, -1);
        }
        if (dkVar.K && dkVar.f < 5) {
            i = Math.min(i, 4);
        }
        if (sk.G(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i + " for " + dkVar);
        }
        return i;
    }

    public final void e() {
        Parcelable parcelable;
        boolean G = sk.G(3);
        final dk dkVar = this.c;
        if (G) {
            Log.d("FragmentManager", "moveto CREATED: " + dkVar);
        }
        boolean z = dkVar.O;
        Bundle bundle = dkVar.g;
        if (z) {
            if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
                dkVar.y.S(parcelable);
                sk skVar = dkVar.y;
                skVar.E = false;
                skVar.F = false;
                skVar.L.h = false;
                skVar.t(1);
            }
            dkVar.f = 1;
            return;
        }
        o4 o4Var = this.a;
        o4Var.l(false);
        Bundle bundle2 = dkVar.g;
        dkVar.y.M();
        dkVar.f = 1;
        dkVar.H = false;
        dkVar.R.a(new jp() { // from class: androidx.fragment.app.Fragment$6
            @Override // defpackage.jp
            public final void b(lp lpVar, fp fpVar) {
                View view;
                if (fpVar != fp.ON_STOP || (view = dk.this.J) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        dkVar.U.b(bundle2);
        dkVar.s(bundle2);
        dkVar.O = true;
        if (!dkVar.H) {
            l8.f(dkVar, " did not call through to super.onCreate()");
        } else {
            dkVar.R.d(fp.ON_CREATE);
            o4Var.f(false);
        }
    }

    public final void f() {
        String str;
        dk dkVar = this.c;
        if (dkVar.r) {
            return;
        }
        if (sk.G(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + dkVar);
        }
        LayoutInflater w = dkVar.w(dkVar.g);
        ViewGroup viewGroup = dkVar.I;
        if (viewGroup == null) {
            int i = dkVar.B;
            if (i == 0) {
                viewGroup = null;
            } else {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + dkVar + " for a container view with no id");
                }
                viewGroup = (ViewGroup) dkVar.w.u.L(i);
                if (viewGroup == null) {
                    if (!dkVar.t) {
                        try {
                            str = dkVar.C().getResources().getResourceName(dkVar.B);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(dkVar.B) + " (" + str + ") for fragment " + dkVar);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    yk ykVar = zk.a;
                    zk.b(new wk(dkVar, "Attempting to add fragment " + dkVar + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    zk.a(dkVar).getClass();
                }
            }
        }
        dkVar.I = viewGroup;
        dkVar.B(w, viewGroup, dkVar.g);
        View view = dkVar.J;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            dkVar.J.setTag(R.id.fragment_container_view_tag, dkVar);
            if (viewGroup != null) {
                b();
            }
            if (dkVar.D) {
                dkVar.J.setVisibility(8);
            }
            View view2 = dkVar.J;
            WeakHashMap weakHashMap = f80.a;
            boolean isAttachedToWindow = view2.isAttachedToWindow();
            View view3 = dkVar.J;
            if (isAttachedToWindow) {
                view3.requestApplyInsets();
            } else {
                view3.addOnAttachStateChangeListener(new f9(2, view3));
            }
            dkVar.y.t(2);
            this.a.r(false);
            int visibility = dkVar.J.getVisibility();
            dkVar.f().j = dkVar.J.getAlpha();
            if (dkVar.I != null && visibility == 0) {
                View findFocus = dkVar.J.findFocus();
                if (findFocus != null) {
                    dkVar.f().k = findFocus;
                    if (sk.G(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + dkVar);
                    }
                }
                dkVar.J.setAlpha(0.0f);
            }
        }
        dkVar.f = 2;
    }

    public final void g() {
        boolean z;
        dk h;
        boolean G = sk.G(3);
        dk dkVar = this.c;
        if (G) {
            Log.d("FragmentManager", "movefrom CREATED: " + dkVar);
        }
        int i = 0;
        boolean z2 = dkVar.q && !dkVar.o();
        oe oeVar = this.b;
        if (z2) {
        }
        if (!z2) {
            uk ukVar = (uk) oeVar.i;
            if (!((ukVar.c.containsKey(dkVar.j) && ukVar.f) ? ukVar.g : true)) {
                String str = dkVar.m;
                if (str != null && (h = oeVar.h(str)) != null && h.F) {
                    dkVar.l = h;
                }
                dkVar.f = 0;
                return;
            }
        }
        fk fkVar = dkVar.x;
        if (fkVar != null) {
            z = ((uk) oeVar.i).g;
        } else {
            z = fkVar.v != null ? !r5.isChangingConfigurations() : true;
        }
        if (z2 || z) {
            ((uk) oeVar.i).c(dkVar);
        }
        dkVar.y.k();
        dkVar.R.d(fp.ON_DESTROY);
        dkVar.f = 0;
        dkVar.O = false;
        dkVar.H = true;
        this.a.g(false);
        ArrayList l = oeVar.l();
        int size = l.size();
        while (i < size) {
            Object obj = l.get(i);
            i++;
            a aVar = (a) obj;
            if (aVar != null) {
                dk dkVar2 = aVar.c;
                if (dkVar.j.equals(dkVar2.m)) {
                    dkVar2.l = dkVar;
                    dkVar2.m = null;
                }
            }
        }
        String str2 = dkVar.m;
        if (str2 != null) {
            dkVar.l = oeVar.h(str2);
        }
        oeVar.s(this);
    }

    public final void h() {
        View view;
        boolean G = sk.G(3);
        dk dkVar = this.c;
        if (G) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + dkVar);
        }
        ViewGroup viewGroup = dkVar.I;
        if (viewGroup != null && (view = dkVar.J) != null) {
            viewGroup.removeView(view);
        }
        dkVar.y.t(1);
        if (dkVar.J != null) {
            bl blVar = dkVar.S;
            blVar.f();
            if (blVar.h.c.compareTo(gp.h) >= 0) {
                dkVar.S.b(fp.ON_DESTROY);
            }
        }
        dkVar.f = 1;
        dkVar.H = false;
        dkVar.u();
        if (!dkVar.H) {
            l8.f(dkVar, " did not call through to super.onDestroyView()");
            return;
        }
        y5 y5Var = new y5(dkVar.d(), nq.d);
        String canonicalName = nq.class.getCanonicalName();
        if (canonicalName == null) {
            l8.l("Local and anonymous classes can not be ViewModels");
            return;
        }
        s20 s20Var = ((nq) y5Var.d("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName), nq.class)).c;
        if (s20Var.h > 0) {
            s20Var.g[0].getClass();
            l8.c();
            return;
        }
        dkVar.u = false;
        this.a.s(false);
        dkVar.I = null;
        dkVar.J = null;
        dkVar.S = null;
        dkVar.T.e(null);
        dkVar.s = false;
    }

    public final void i() {
        boolean G = sk.G(3);
        dk dkVar = this.c;
        if (G) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + dkVar);
        }
        dkVar.f = -1;
        dkVar.H = false;
        dkVar.v();
        if (!dkVar.H) {
            l8.f(dkVar, " did not call through to super.onDetach()");
            return;
        }
        sk skVar = dkVar.y;
        if (!skVar.G) {
            skVar.k();
            dkVar.y = new sk();
        }
        this.a.h(false);
        dkVar.f = -1;
        dkVar.x = null;
        dkVar.z = null;
        dkVar.w = null;
        if (!dkVar.q || dkVar.o()) {
            uk ukVar = (uk) this.b.i;
            if (!((ukVar.c.containsKey(dkVar.j) && ukVar.f) ? ukVar.g : true)) {
                return;
            }
        }
        if (sk.G(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + dkVar);
        }
        dkVar.m();
    }

    public final void j() {
        dk dkVar = this.c;
        if (dkVar.r && dkVar.s && !dkVar.u) {
            if (sk.G(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + dkVar);
            }
            dkVar.B(dkVar.w(dkVar.g), null, dkVar.g);
            View view = dkVar.J;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                dkVar.J.setTag(R.id.fragment_container_view_tag, dkVar);
                if (dkVar.D) {
                    dkVar.J.setVisibility(8);
                }
                dkVar.y.t(2);
                this.a.r(false);
                dkVar.f = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        oe oeVar = this.b;
        boolean z = this.d;
        dk dkVar = this.c;
        if (z) {
            if (sk.G(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + dkVar);
                return;
            }
            return;
        }
        try {
            this.d = true;
            boolean z2 = false;
            while (true) {
                int d = d();
                int i = dkVar.f;
                if (d == i) {
                    if (!z2 && i == -1 && dkVar.q && !dkVar.o()) {
                        if (sk.G(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + dkVar);
                        }
                        ((uk) oeVar.i).c(dkVar);
                        oeVar.s(this);
                        if (sk.G(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + dkVar);
                        }
                        dkVar.m();
                    }
                    if (dkVar.N) {
                        if (dkVar.J != null && (viewGroup = dkVar.I) != null) {
                            re f = re.f(viewGroup, dkVar.j().E());
                            if (dkVar.D) {
                                if (sk.G(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + dkVar);
                                }
                                f.a(3, 1, this);
                            } else {
                                if (sk.G(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + dkVar);
                                }
                                f.a(2, 1, this);
                            }
                        }
                        sk skVar = dkVar.w;
                        if (skVar != null && dkVar.p && sk.H(dkVar)) {
                            skVar.D = true;
                        }
                        dkVar.N = false;
                        dkVar.y.n();
                    }
                    this.d = false;
                    return;
                }
                if (d <= i) {
                    switch (i - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            g();
                            break;
                        case 1:
                            h();
                            dkVar.f = 1;
                            break;
                        case 2:
                            dkVar.s = false;
                            dkVar.f = 2;
                            break;
                        case 3:
                            if (sk.G(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + dkVar);
                            }
                            if (dkVar.J != null && dkVar.h == null) {
                                o();
                            }
                            if (dkVar.J != null && (viewGroup2 = dkVar.I) != null) {
                                re f2 = re.f(viewGroup2, dkVar.j().E());
                                if (sk.G(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + dkVar);
                                }
                                f2.a(1, 3, this);
                            }
                            dkVar.f = 3;
                            break;
                        case 4:
                            q();
                            break;
                        case 5:
                            dkVar.f = 5;
                            break;
                        case 6:
                            l();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (dkVar.J != null && (viewGroup3 = dkVar.I) != null) {
                                re f3 = re.f(viewGroup3, dkVar.j().E());
                                int b = n20.b(dkVar.J.getVisibility());
                                if (sk.G(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + dkVar);
                                }
                                f3.a(b, 2, this);
                            }
                            dkVar.f = 4;
                            break;
                        case 5:
                            p();
                            break;
                        case 6:
                            dkVar.f = 6;
                            break;
                        case 7:
                            n();
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

    public final void l() {
        boolean G = sk.G(3);
        dk dkVar = this.c;
        if (G) {
            Log.d("FragmentManager", "movefrom RESUMED: " + dkVar);
        }
        dkVar.y.t(5);
        if (dkVar.J != null) {
            dkVar.S.b(fp.ON_PAUSE);
        }
        dkVar.R.d(fp.ON_PAUSE);
        dkVar.f = 6;
        dkVar.H = true;
        this.a.i(false);
    }

    public final void m(ClassLoader classLoader) {
        dk dkVar = this.c;
        Bundle bundle = dkVar.g;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        dkVar.h = dkVar.g.getSparseParcelableArray("android:view_state");
        dkVar.i = dkVar.g.getBundle("android:view_registry_state");
        String string = dkVar.g.getString("android:target_state");
        dkVar.m = string;
        if (string != null) {
            dkVar.n = dkVar.g.getInt("android:target_req_state", 0);
        }
        boolean z = dkVar.g.getBoolean("android:user_visible_hint", true);
        dkVar.L = z;
        if (z) {
            return;
        }
        dkVar.K = true;
    }

    public final void n() {
        boolean G = sk.G(3);
        dk dkVar = this.c;
        if (G) {
            Log.d("FragmentManager", "moveto RESUMED: " + dkVar);
        }
        bk bkVar = dkVar.M;
        View view = bkVar == null ? null : bkVar.k;
        if (view != null) {
            if (view != dkVar.J) {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != dkVar.J) {
                    }
                }
            }
            boolean requestFocus = view.requestFocus();
            if (sk.G(2)) {
                StringBuilder sb = new StringBuilder("requestFocus: Restoring focused view ");
                sb.append(view);
                sb.append(" ");
                sb.append(requestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(dkVar);
                sb.append(" resulting in focused view ");
                sb.append(dkVar.J.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        dkVar.f().k = null;
        dkVar.y.M();
        dkVar.y.y(true);
        dkVar.f = 7;
        dkVar.H = true;
        androidx.lifecycle.a aVar = dkVar.R;
        fp fpVar = fp.ON_RESUME;
        aVar.d(fpVar);
        if (dkVar.J != null) {
            dkVar.S.h.d(fpVar);
        }
        sk skVar = dkVar.y;
        skVar.E = false;
        skVar.F = false;
        skVar.L.h = false;
        skVar.t(7);
        this.a.m(false);
        dkVar.g = null;
        dkVar.h = null;
        dkVar.i = null;
    }

    public final void o() {
        dk dkVar = this.c;
        if (dkVar.J == null) {
            return;
        }
        if (sk.G(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + dkVar + " with view " + dkVar.J);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        dkVar.J.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            dkVar.h = sparseArray;
        }
        Bundle bundle = new Bundle();
        dkVar.S.i.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        dkVar.i = bundle;
    }

    public final void p() {
        boolean G = sk.G(3);
        dk dkVar = this.c;
        if (G) {
            Log.d("FragmentManager", "moveto STARTED: " + dkVar);
        }
        dkVar.y.M();
        dkVar.y.y(true);
        dkVar.f = 5;
        dkVar.H = false;
        dkVar.y();
        if (!dkVar.H) {
            l8.f(dkVar, " did not call through to super.onStart()");
            return;
        }
        androidx.lifecycle.a aVar = dkVar.R;
        fp fpVar = fp.ON_START;
        aVar.d(fpVar);
        if (dkVar.J != null) {
            dkVar.S.h.d(fpVar);
        }
        sk skVar = dkVar.y;
        skVar.E = false;
        skVar.F = false;
        skVar.L.h = false;
        skVar.t(5);
        this.a.p(false);
    }

    public final void q() {
        boolean G = sk.G(3);
        dk dkVar = this.c;
        if (G) {
            Log.d("FragmentManager", "movefrom STARTED: " + dkVar);
        }
        sk skVar = dkVar.y;
        skVar.F = true;
        skVar.L.h = true;
        skVar.t(4);
        if (dkVar.J != null) {
            dkVar.S.b(fp.ON_STOP);
        }
        dkVar.R.d(fp.ON_STOP);
        dkVar.f = 4;
        dkVar.H = false;
        dkVar.z();
        if (dkVar.H) {
            this.a.q(false);
        } else {
            l8.f(dkVar, " did not call through to super.onStop()");
        }
    }

    public a(o4 o4Var, oe oeVar, dk dkVar) {
        this.a = o4Var;
        this.b = oeVar;
        this.c = dkVar;
    }

    public a(o4 o4Var, oe oeVar, dk dkVar, xk xkVar) {
        this.a = o4Var;
        this.b = oeVar;
        this.c = dkVar;
        dkVar.h = null;
        dkVar.i = null;
        dkVar.v = 0;
        dkVar.s = false;
        dkVar.p = false;
        dk dkVar2 = dkVar.l;
        dkVar.m = dkVar2 != null ? dkVar2.j : null;
        dkVar.l = null;
        Bundle bundle = xkVar.r;
        if (bundle != null) {
            dkVar.g = bundle;
        } else {
            dkVar.g = new Bundle();
        }
    }
}
