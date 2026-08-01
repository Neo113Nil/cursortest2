package Y;

import E1.AbstractC0001b;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.EnumC0079l;
import androidx.lifecycle.EnumC0080m;
import androidx.recyclerview.widget.RecyclerView;
import com.luckycounter.drinkwater.R;
import d0.C0105a;
import i0.C0174a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public final B.j f1387a;

    /* renamed from: b, reason: collision with root package name */
    public final U.v f1388b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0055q f1389c;
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f1390e = -1;

    public O(B.j jVar, U.v vVar, AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q) {
        this.f1387a = jVar;
        this.f1388b = vVar;
        this.f1389c = abstractComponentCallbacksC0055q;
    }

    public final void a() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q = this.f1389c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + abstractComponentCallbacksC0055q);
        }
        Bundle bundle = abstractComponentCallbacksC0055q.f1500b;
        abstractComponentCallbacksC0055q.f1515t.K();
        abstractComponentCallbacksC0055q.f1499a = 3;
        abstractComponentCallbacksC0055q.f1484C = false;
        abstractComponentCallbacksC0055q.p();
        if (!abstractComponentCallbacksC0055q.f1484C) {
            throw new V("Fragment " + abstractComponentCallbacksC0055q + " did not call through to super.onActivityCreated()");
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + abstractComponentCallbacksC0055q);
        }
        View view = abstractComponentCallbacksC0055q.f1486E;
        if (view != null) {
            Bundle bundle2 = abstractComponentCallbacksC0055q.f1500b;
            SparseArray<Parcelable> sparseArray = abstractComponentCallbacksC0055q.f1501c;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                abstractComponentCallbacksC0055q.f1501c = null;
            }
            if (abstractComponentCallbacksC0055q.f1486E != null) {
                abstractComponentCallbacksC0055q.f1494N.d.b(abstractComponentCallbacksC0055q.d);
                abstractComponentCallbacksC0055q.d = null;
            }
            abstractComponentCallbacksC0055q.f1484C = false;
            abstractComponentCallbacksC0055q.A(bundle2);
            if (!abstractComponentCallbacksC0055q.f1484C) {
                throw new V("Fragment " + abstractComponentCallbacksC0055q + " did not call through to super.onViewStateRestored()");
            }
            if (abstractComponentCallbacksC0055q.f1486E != null) {
                abstractComponentCallbacksC0055q.f1494N.d(EnumC0079l.ON_CREATE);
            }
        }
        abstractComponentCallbacksC0055q.f1500b = null;
        I i = abstractComponentCallbacksC0055q.f1515t;
        i.f1334E = false;
        i.F = false;
        i.f1340L.f1376g = false;
        i.t(4);
        this.f1387a.h(false);
    }

    public final void b() {
        View view;
        View view2;
        U.v vVar = this.f1388b;
        vVar.getClass();
        AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q = this.f1389c;
        ViewGroup viewGroup = abstractComponentCallbacksC0055q.f1485D;
        int i = -1;
        if (viewGroup != null) {
            ArrayList arrayList = (ArrayList) vVar.f1207a;
            int indexOf = arrayList.indexOf(abstractComponentCallbacksC0055q);
            int i2 = indexOf - 1;
            while (true) {
                if (i2 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q2 = (AbstractComponentCallbacksC0055q) arrayList.get(indexOf);
                        if (abstractComponentCallbacksC0055q2.f1485D == viewGroup && (view = abstractComponentCallbacksC0055q2.f1486E) != null) {
                            i = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q3 = (AbstractComponentCallbacksC0055q) arrayList.get(i2);
                    if (abstractComponentCallbacksC0055q3.f1485D == viewGroup && (view2 = abstractComponentCallbacksC0055q3.f1486E) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
        }
        abstractComponentCallbacksC0055q.f1485D.addView(abstractComponentCallbacksC0055q.f1486E, i);
    }

    public final void c() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q = this.f1389c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto ATTACHED: " + abstractComponentCallbacksC0055q);
        }
        AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q2 = abstractComponentCallbacksC0055q.f1504g;
        O o2 = null;
        U.v vVar = this.f1388b;
        if (abstractComponentCallbacksC0055q2 != null) {
            O o3 = (O) ((HashMap) vVar.f1208b).get(abstractComponentCallbacksC0055q2.f1502e);
            if (o3 == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0055q + " declared target fragment " + abstractComponentCallbacksC0055q.f1504g + " that does not belong to this FragmentManager!");
            }
            abstractComponentCallbacksC0055q.h = abstractComponentCallbacksC0055q.f1504g.f1502e;
            abstractComponentCallbacksC0055q.f1504g = null;
            o2 = o3;
        } else {
            String str = abstractComponentCallbacksC0055q.h;
            if (str != null && (o2 = (O) ((HashMap) vVar.f1208b).get(str)) == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0055q + " declared target fragment " + abstractComponentCallbacksC0055q.h + " that does not belong to this FragmentManager!");
            }
        }
        if (o2 != null) {
            o2.k();
        }
        I i = abstractComponentCallbacksC0055q.f1513r;
        abstractComponentCallbacksC0055q.f1514s = i.f1358t;
        abstractComponentCallbacksC0055q.f1516u = i.f1360v;
        B.j jVar = this.f1387a;
        jVar.o(false);
        ArrayList arrayList = abstractComponentCallbacksC0055q.f1497Q;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q3 = ((C0052n) it.next()).f1471a;
            abstractComponentCallbacksC0055q3.f1496P.a();
            androidx.lifecycle.J.d(abstractComponentCallbacksC0055q3);
        }
        arrayList.clear();
        abstractComponentCallbacksC0055q.f1515t.b(abstractComponentCallbacksC0055q.f1514s, abstractComponentCallbacksC0055q.d(), abstractComponentCallbacksC0055q);
        abstractComponentCallbacksC0055q.f1499a = 0;
        abstractComponentCallbacksC0055q.f1484C = false;
        abstractComponentCallbacksC0055q.r(abstractComponentCallbacksC0055q.f1514s.f1529b);
        if (!abstractComponentCallbacksC0055q.f1484C) {
            throw new V("Fragment " + abstractComponentCallbacksC0055q + " did not call through to super.onAttach()");
        }
        Iterator it2 = abstractComponentCallbacksC0055q.f1513r.f1351m.iterator();
        while (it2.hasNext()) {
            ((M) it2.next()).f();
        }
        I i2 = abstractComponentCallbacksC0055q.f1515t;
        i2.f1334E = false;
        i2.F = false;
        i2.f1340L.f1376g = false;
        i2.t(0);
        jVar.i(false);
    }

    public final int d() {
        U u2;
        AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q = this.f1389c;
        if (abstractComponentCallbacksC0055q.f1513r == null) {
            return abstractComponentCallbacksC0055q.f1499a;
        }
        int i = this.f1390e;
        int ordinal = abstractComponentCallbacksC0055q.f1492L.ordinal();
        if (ordinal == 1) {
            i = Math.min(i, 0);
        } else if (ordinal == 2) {
            i = Math.min(i, 1);
        } else if (ordinal == 3) {
            i = Math.min(i, 5);
        } else if (ordinal != 4) {
            i = Math.min(i, -1);
        }
        if (abstractComponentCallbacksC0055q.f1508m) {
            if (abstractComponentCallbacksC0055q.f1509n) {
                i = Math.max(this.f1390e, 2);
                View view = abstractComponentCallbacksC0055q.f1486E;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.f1390e < 4 ? Math.min(i, abstractComponentCallbacksC0055q.f1499a) : Math.min(i, 1);
            }
        }
        if (!abstractComponentCallbacksC0055q.f1506k) {
            i = Math.min(i, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0055q.f1485D;
        if (viewGroup != null) {
            C0047i f2 = C0047i.f(viewGroup, abstractComponentCallbacksC0055q.j().D());
            f2.getClass();
            U d = f2.d(abstractComponentCallbacksC0055q);
            r6 = d != null ? d.f1406b : 0;
            Iterator it = f2.f1452c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    u2 = null;
                    break;
                }
                u2 = (U) it.next();
                if (u2.f1407c.equals(abstractComponentCallbacksC0055q) && !u2.f1409f) {
                    break;
                }
            }
            if (u2 != null && (r6 == 0 || r6 == 1)) {
                r6 = u2.f1406b;
            }
        }
        if (r6 == 2) {
            i = Math.min(i, 6);
        } else if (r6 == 3) {
            i = Math.max(i, 3);
        } else if (abstractComponentCallbacksC0055q.f1507l) {
            i = abstractComponentCallbacksC0055q.o() ? Math.min(i, 1) : Math.min(i, -1);
        }
        if (abstractComponentCallbacksC0055q.F && abstractComponentCallbacksC0055q.f1499a < 5) {
            i = Math.min(i, 4);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i + " for " + abstractComponentCallbacksC0055q);
        }
        return i;
    }

    public final void e() {
        Parcelable parcelable;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q = this.f1389c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto CREATED: " + abstractComponentCallbacksC0055q);
        }
        if (abstractComponentCallbacksC0055q.f1490J) {
            Bundle bundle = abstractComponentCallbacksC0055q.f1500b;
            if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
                abstractComponentCallbacksC0055q.f1515t.Q(parcelable);
                I i = abstractComponentCallbacksC0055q.f1515t;
                i.f1334E = false;
                i.F = false;
                i.f1340L.f1376g = false;
                i.t(1);
            }
            abstractComponentCallbacksC0055q.f1499a = 1;
            return;
        }
        B.j jVar = this.f1387a;
        jVar.p(false);
        Bundle bundle2 = abstractComponentCallbacksC0055q.f1500b;
        abstractComponentCallbacksC0055q.f1515t.K();
        abstractComponentCallbacksC0055q.f1499a = 1;
        abstractComponentCallbacksC0055q.f1484C = false;
        abstractComponentCallbacksC0055q.f1493M.a(new C0174a(1, abstractComponentCallbacksC0055q));
        abstractComponentCallbacksC0055q.f1496P.b(bundle2);
        abstractComponentCallbacksC0055q.s(bundle2);
        abstractComponentCallbacksC0055q.f1490J = true;
        if (abstractComponentCallbacksC0055q.f1484C) {
            abstractComponentCallbacksC0055q.f1493M.d(EnumC0079l.ON_CREATE);
            jVar.j(false);
        } else {
            throw new V("Fragment " + abstractComponentCallbacksC0055q + " did not call through to super.onCreate()");
        }
    }

    public final void f() {
        String str;
        AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q = this.f1389c;
        if (abstractComponentCallbacksC0055q.f1508m) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0055q);
        }
        LayoutInflater w2 = abstractComponentCallbacksC0055q.w(abstractComponentCallbacksC0055q.f1500b);
        ViewGroup viewGroup = abstractComponentCallbacksC0055q.f1485D;
        if (viewGroup == null) {
            int i = abstractComponentCallbacksC0055q.f1518w;
            if (i == 0) {
                viewGroup = null;
            } else {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + abstractComponentCallbacksC0055q + " for a container view with no id");
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC0055q.f1513r.f1359u.T(i);
                if (viewGroup == null) {
                    if (!abstractComponentCallbacksC0055q.f1510o) {
                        try {
                            str = abstractComponentCallbacksC0055q.C().getResources().getResourceName(abstractComponentCallbacksC0055q.f1518w);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC0055q.f1518w) + " (" + str + ") for fragment " + abstractComponentCallbacksC0055q);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    Z.c cVar = Z.d.f1551a;
                    Z.d.b(new Z.a(abstractComponentCallbacksC0055q, "Attempting to add fragment " + abstractComponentCallbacksC0055q + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    Z.d.a(abstractComponentCallbacksC0055q).getClass();
                }
            }
        }
        abstractComponentCallbacksC0055q.f1485D = viewGroup;
        abstractComponentCallbacksC0055q.B(w2, viewGroup, abstractComponentCallbacksC0055q.f1500b);
        View view = abstractComponentCallbacksC0055q.f1486E;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            abstractComponentCallbacksC0055q.f1486E.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0055q);
            if (viewGroup != null) {
                b();
            }
            if (abstractComponentCallbacksC0055q.f1520y) {
                abstractComponentCallbacksC0055q.f1486E.setVisibility(8);
            }
            View view2 = abstractComponentCallbacksC0055q.f1486E;
            WeakHashMap weakHashMap = K.T.f633a;
            if (view2.isAttachedToWindow()) {
                K.F.c(abstractComponentCallbacksC0055q.f1486E);
            } else {
                View view3 = abstractComponentCallbacksC0055q.f1486E;
                view3.addOnAttachStateChangeListener(new P0.n(1, view3));
            }
            abstractComponentCallbacksC0055q.f1515t.t(2);
            this.f1387a.u(false);
            int visibility = abstractComponentCallbacksC0055q.f1486E.getVisibility();
            abstractComponentCallbacksC0055q.f().f1479j = abstractComponentCallbacksC0055q.f1486E.getAlpha();
            if (abstractComponentCallbacksC0055q.f1485D != null && visibility == 0) {
                View findFocus = abstractComponentCallbacksC0055q.f1486E.findFocus();
                if (findFocus != null) {
                    abstractComponentCallbacksC0055q.f().f1480k = findFocus;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + abstractComponentCallbacksC0055q);
                    }
                }
                abstractComponentCallbacksC0055q.f1486E.setAlpha(RecyclerView.f1949A0);
            }
        }
        abstractComponentCallbacksC0055q.f1499a = 2;
    }

    public final void g() {
        boolean z2;
        AbstractComponentCallbacksC0055q d;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q = this.f1389c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom CREATED: " + abstractComponentCallbacksC0055q);
        }
        boolean z3 = abstractComponentCallbacksC0055q.f1507l && !abstractComponentCallbacksC0055q.o();
        U.v vVar = this.f1388b;
        if (z3) {
        }
        if (!z3) {
            L l2 = (L) vVar.d;
            if (!((l2.f1372b.containsKey(abstractComponentCallbacksC0055q.f1502e) && l2.f1374e) ? l2.f1375f : true)) {
                String str = abstractComponentCallbacksC0055q.h;
                if (str != null && (d = vVar.d(str)) != null && d.f1482A) {
                    abstractComponentCallbacksC0055q.f1504g = d;
                }
                abstractComponentCallbacksC0055q.f1499a = 0;
                return;
            }
        }
        C0058u c0058u = abstractComponentCallbacksC0055q.f1514s;
        if (c0058u != null) {
            z2 = ((L) vVar.d).f1375f;
        } else {
            z2 = c0058u.f1529b != null ? !r5.isChangingConfigurations() : true;
        }
        if (z3 || z2) {
            ((L) vVar.d).c(abstractComponentCallbacksC0055q);
        }
        abstractComponentCallbacksC0055q.f1515t.k();
        abstractComponentCallbacksC0055q.f1493M.d(EnumC0079l.ON_DESTROY);
        abstractComponentCallbacksC0055q.f1499a = 0;
        abstractComponentCallbacksC0055q.f1490J = false;
        abstractComponentCallbacksC0055q.f1484C = true;
        this.f1387a.l(false);
        Iterator it = vVar.h().iterator();
        while (it.hasNext()) {
            O o2 = (O) it.next();
            if (o2 != null) {
                String str2 = abstractComponentCallbacksC0055q.f1502e;
                AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q2 = o2.f1389c;
                if (str2.equals(abstractComponentCallbacksC0055q2.h)) {
                    abstractComponentCallbacksC0055q2.f1504g = abstractComponentCallbacksC0055q;
                    abstractComponentCallbacksC0055q2.h = null;
                }
            }
        }
        String str3 = abstractComponentCallbacksC0055q.h;
        if (str3 != null) {
            abstractComponentCallbacksC0055q.f1504g = vVar.d(str3);
        }
        vVar.n(this);
    }

    public final void h() {
        View view;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q = this.f1389c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + abstractComponentCallbacksC0055q);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0055q.f1485D;
        if (viewGroup != null && (view = abstractComponentCallbacksC0055q.f1486E) != null) {
            viewGroup.removeView(view);
        }
        abstractComponentCallbacksC0055q.f1515t.t(1);
        if (abstractComponentCallbacksC0055q.f1486E != null && abstractComponentCallbacksC0055q.f1494N.e().d.compareTo(EnumC0080m.f1898c) >= 0) {
            abstractComponentCallbacksC0055q.f1494N.d(EnumC0079l.ON_DESTROY);
        }
        abstractComponentCallbacksC0055q.f1499a = 1;
        abstractComponentCallbacksC0055q.f1484C = false;
        abstractComponentCallbacksC0055q.u();
        if (!abstractComponentCallbacksC0055q.f1484C) {
            throw new V("Fragment " + abstractComponentCallbacksC0055q + " did not call through to super.onDestroyView()");
        }
        o.l lVar = ((C0105a) new A1.d(abstractComponentCallbacksC0055q.c(), C0105a.f2520c).s(C0105a.class)).f2521b;
        if (lVar.f3615c > 0) {
            lVar.f3614b[0].getClass();
            throw new ClassCastException();
        }
        abstractComponentCallbacksC0055q.f1511p = false;
        this.f1387a.v(false);
        abstractComponentCallbacksC0055q.f1485D = null;
        abstractComponentCallbacksC0055q.f1486E = null;
        abstractComponentCallbacksC0055q.f1494N = null;
        abstractComponentCallbacksC0055q.f1495O.d(null);
        abstractComponentCallbacksC0055q.f1509n = false;
    }

    public final void i() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q = this.f1389c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + abstractComponentCallbacksC0055q);
        }
        abstractComponentCallbacksC0055q.f1499a = -1;
        abstractComponentCallbacksC0055q.f1484C = false;
        abstractComponentCallbacksC0055q.v();
        if (!abstractComponentCallbacksC0055q.f1484C) {
            throw new V("Fragment " + abstractComponentCallbacksC0055q + " did not call through to super.onDetach()");
        }
        I i = abstractComponentCallbacksC0055q.f1515t;
        if (!i.f1335G) {
            i.k();
            abstractComponentCallbacksC0055q.f1515t = new I();
        }
        this.f1387a.m(false);
        abstractComponentCallbacksC0055q.f1499a = -1;
        abstractComponentCallbacksC0055q.f1514s = null;
        abstractComponentCallbacksC0055q.f1516u = null;
        abstractComponentCallbacksC0055q.f1513r = null;
        if (!abstractComponentCallbacksC0055q.f1507l || abstractComponentCallbacksC0055q.o()) {
            L l2 = (L) this.f1388b.d;
            boolean z2 = true;
            if (l2.f1372b.containsKey(abstractComponentCallbacksC0055q.f1502e) && l2.f1374e) {
                z2 = l2.f1375f;
            }
            if (!z2) {
                return;
            }
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0055q);
        }
        abstractComponentCallbacksC0055q.l();
    }

    public final void j() {
        AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q = this.f1389c;
        if (abstractComponentCallbacksC0055q.f1508m && abstractComponentCallbacksC0055q.f1509n && !abstractComponentCallbacksC0055q.f1511p) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0055q);
            }
            abstractComponentCallbacksC0055q.B(abstractComponentCallbacksC0055q.w(abstractComponentCallbacksC0055q.f1500b), null, abstractComponentCallbacksC0055q.f1500b);
            View view = abstractComponentCallbacksC0055q.f1486E;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                abstractComponentCallbacksC0055q.f1486E.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0055q);
                if (abstractComponentCallbacksC0055q.f1520y) {
                    abstractComponentCallbacksC0055q.f1486E.setVisibility(8);
                }
                abstractComponentCallbacksC0055q.f1515t.t(2);
                this.f1387a.u(false);
                abstractComponentCallbacksC0055q.f1499a = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        U.v vVar = this.f1388b;
        boolean z2 = this.d;
        AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q = this.f1389c;
        if (z2) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + abstractComponentCallbacksC0055q);
                return;
            }
            return;
        }
        try {
            this.d = true;
            boolean z3 = false;
            while (true) {
                int d = d();
                int i = abstractComponentCallbacksC0055q.f1499a;
                if (d == i) {
                    if (!z3 && i == -1 && abstractComponentCallbacksC0055q.f1507l && !abstractComponentCallbacksC0055q.o()) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + abstractComponentCallbacksC0055q);
                        }
                        ((L) vVar.d).c(abstractComponentCallbacksC0055q);
                        vVar.n(this);
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0055q);
                        }
                        abstractComponentCallbacksC0055q.l();
                    }
                    if (abstractComponentCallbacksC0055q.f1489I) {
                        if (abstractComponentCallbacksC0055q.f1486E != null && (viewGroup = abstractComponentCallbacksC0055q.f1485D) != null) {
                            C0047i f2 = C0047i.f(viewGroup, abstractComponentCallbacksC0055q.j().D());
                            if (abstractComponentCallbacksC0055q.f1520y) {
                                f2.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + abstractComponentCallbacksC0055q);
                                }
                                f2.a(3, 1, this);
                            } else {
                                f2.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + abstractComponentCallbacksC0055q);
                                }
                                f2.a(2, 1, this);
                            }
                        }
                        I i2 = abstractComponentCallbacksC0055q.f1513r;
                        if (i2 != null && abstractComponentCallbacksC0055q.f1506k && I.F(abstractComponentCallbacksC0055q)) {
                            i2.f1333D = true;
                        }
                        abstractComponentCallbacksC0055q.f1489I = false;
                        abstractComponentCallbacksC0055q.f1515t.n();
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
                            abstractComponentCallbacksC0055q.f1499a = 1;
                            break;
                        case 2:
                            abstractComponentCallbacksC0055q.f1509n = false;
                            abstractComponentCallbacksC0055q.f1499a = 2;
                            break;
                        case 3:
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + abstractComponentCallbacksC0055q);
                            }
                            if (abstractComponentCallbacksC0055q.f1486E != null && abstractComponentCallbacksC0055q.f1501c == null) {
                                o();
                            }
                            if (abstractComponentCallbacksC0055q.f1486E != null && (viewGroup2 = abstractComponentCallbacksC0055q.f1485D) != null) {
                                C0047i f3 = C0047i.f(viewGroup2, abstractComponentCallbacksC0055q.j().D());
                                f3.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + abstractComponentCallbacksC0055q);
                                }
                                f3.a(1, 3, this);
                            }
                            abstractComponentCallbacksC0055q.f1499a = 3;
                            break;
                        case 4:
                            q();
                            break;
                        case 5:
                            abstractComponentCallbacksC0055q.f1499a = 5;
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
                            if (abstractComponentCallbacksC0055q.f1486E != null && (viewGroup3 = abstractComponentCallbacksC0055q.f1485D) != null) {
                                C0047i f4 = C0047i.f(viewGroup3, abstractComponentCallbacksC0055q.j().D());
                                int b2 = AbstractC0001b.b(abstractComponentCallbacksC0055q.f1486E.getVisibility());
                                f4.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + abstractComponentCallbacksC0055q);
                                }
                                f4.a(b2, 2, this);
                            }
                            abstractComponentCallbacksC0055q.f1499a = 4;
                            break;
                        case 5:
                            p();
                            break;
                        case 6:
                            abstractComponentCallbacksC0055q.f1499a = 6;
                            break;
                        case 7:
                            n();
                            break;
                    }
                }
                z3 = true;
            }
        } catch (Throwable th) {
            this.d = false;
            throw th;
        }
    }

    public final void l() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q = this.f1389c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom RESUMED: " + abstractComponentCallbacksC0055q);
        }
        abstractComponentCallbacksC0055q.f1515t.t(5);
        if (abstractComponentCallbacksC0055q.f1486E != null) {
            abstractComponentCallbacksC0055q.f1494N.d(EnumC0079l.ON_PAUSE);
        }
        abstractComponentCallbacksC0055q.f1493M.d(EnumC0079l.ON_PAUSE);
        abstractComponentCallbacksC0055q.f1499a = 6;
        abstractComponentCallbacksC0055q.f1484C = true;
        this.f1387a.n(false);
    }

    public final void m(ClassLoader classLoader) {
        AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q = this.f1389c;
        Bundle bundle = abstractComponentCallbacksC0055q.f1500b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        abstractComponentCallbacksC0055q.f1501c = abstractComponentCallbacksC0055q.f1500b.getSparseParcelableArray("android:view_state");
        abstractComponentCallbacksC0055q.d = abstractComponentCallbacksC0055q.f1500b.getBundle("android:view_registry_state");
        String string = abstractComponentCallbacksC0055q.f1500b.getString("android:target_state");
        abstractComponentCallbacksC0055q.h = string;
        if (string != null) {
            abstractComponentCallbacksC0055q.i = abstractComponentCallbacksC0055q.f1500b.getInt("android:target_req_state", 0);
        }
        boolean z2 = abstractComponentCallbacksC0055q.f1500b.getBoolean("android:user_visible_hint", true);
        abstractComponentCallbacksC0055q.f1487G = z2;
        if (z2) {
            return;
        }
        abstractComponentCallbacksC0055q.F = true;
    }

    public final void n() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q = this.f1389c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto RESUMED: " + abstractComponentCallbacksC0055q);
        }
        C0054p c0054p = abstractComponentCallbacksC0055q.f1488H;
        View view = c0054p == null ? null : c0054p.f1480k;
        if (view != null) {
            if (view != abstractComponentCallbacksC0055q.f1486E) {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != abstractComponentCallbacksC0055q.f1486E) {
                    }
                }
            }
            boolean requestFocus = view.requestFocus();
            if (Log.isLoggable("FragmentManager", 2)) {
                StringBuilder sb = new StringBuilder("requestFocus: Restoring focused view ");
                sb.append(view);
                sb.append(" ");
                sb.append(requestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(abstractComponentCallbacksC0055q);
                sb.append(" resulting in focused view ");
                sb.append(abstractComponentCallbacksC0055q.f1486E.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        abstractComponentCallbacksC0055q.f().f1480k = null;
        abstractComponentCallbacksC0055q.f1515t.K();
        abstractComponentCallbacksC0055q.f1515t.y(true);
        abstractComponentCallbacksC0055q.f1499a = 7;
        abstractComponentCallbacksC0055q.f1484C = true;
        androidx.lifecycle.v vVar = abstractComponentCallbacksC0055q.f1493M;
        EnumC0079l enumC0079l = EnumC0079l.ON_RESUME;
        vVar.d(enumC0079l);
        if (abstractComponentCallbacksC0055q.f1486E != null) {
            abstractComponentCallbacksC0055q.f1494N.f1399c.d(enumC0079l);
        }
        I i = abstractComponentCallbacksC0055q.f1515t;
        i.f1334E = false;
        i.F = false;
        i.f1340L.f1376g = false;
        i.t(7);
        this.f1387a.q(false);
        abstractComponentCallbacksC0055q.f1500b = null;
        abstractComponentCallbacksC0055q.f1501c = null;
        abstractComponentCallbacksC0055q.d = null;
    }

    public final void o() {
        AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q = this.f1389c;
        if (abstractComponentCallbacksC0055q.f1486E == null) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + abstractComponentCallbacksC0055q + " with view " + abstractComponentCallbacksC0055q.f1486E);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        abstractComponentCallbacksC0055q.f1486E.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            abstractComponentCallbacksC0055q.f1501c = sparseArray;
        }
        Bundle bundle = new Bundle();
        abstractComponentCallbacksC0055q.f1494N.d.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        abstractComponentCallbacksC0055q.d = bundle;
    }

    public final void p() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q = this.f1389c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto STARTED: " + abstractComponentCallbacksC0055q);
        }
        abstractComponentCallbacksC0055q.f1515t.K();
        abstractComponentCallbacksC0055q.f1515t.y(true);
        abstractComponentCallbacksC0055q.f1499a = 5;
        abstractComponentCallbacksC0055q.f1484C = false;
        abstractComponentCallbacksC0055q.y();
        if (!abstractComponentCallbacksC0055q.f1484C) {
            throw new V("Fragment " + abstractComponentCallbacksC0055q + " did not call through to super.onStart()");
        }
        androidx.lifecycle.v vVar = abstractComponentCallbacksC0055q.f1493M;
        EnumC0079l enumC0079l = EnumC0079l.ON_START;
        vVar.d(enumC0079l);
        if (abstractComponentCallbacksC0055q.f1486E != null) {
            abstractComponentCallbacksC0055q.f1494N.f1399c.d(enumC0079l);
        }
        I i = abstractComponentCallbacksC0055q.f1515t;
        i.f1334E = false;
        i.F = false;
        i.f1340L.f1376g = false;
        i.t(5);
        this.f1387a.s(false);
    }

    public final void q() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q = this.f1389c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom STARTED: " + abstractComponentCallbacksC0055q);
        }
        I i = abstractComponentCallbacksC0055q.f1515t;
        i.F = true;
        i.f1340L.f1376g = true;
        i.t(4);
        if (abstractComponentCallbacksC0055q.f1486E != null) {
            abstractComponentCallbacksC0055q.f1494N.d(EnumC0079l.ON_STOP);
        }
        abstractComponentCallbacksC0055q.f1493M.d(EnumC0079l.ON_STOP);
        abstractComponentCallbacksC0055q.f1499a = 4;
        abstractComponentCallbacksC0055q.f1484C = false;
        abstractComponentCallbacksC0055q.z();
        if (abstractComponentCallbacksC0055q.f1484C) {
            this.f1387a.t(false);
            return;
        }
        throw new V("Fragment " + abstractComponentCallbacksC0055q + " did not call through to super.onStop()");
    }

    public O(B.j jVar, U.v vVar, ClassLoader classLoader, C c2, N n2) {
        this.f1387a = jVar;
        this.f1388b = vVar;
        AbstractComponentCallbacksC0055q a2 = c2.a(n2.f1377a);
        Bundle bundle = n2.f1383j;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a2.F(bundle);
        a2.f1502e = n2.f1378b;
        a2.f1508m = n2.f1379c;
        a2.f1510o = true;
        a2.f1517v = n2.d;
        a2.f1518w = n2.f1380e;
        a2.f1519x = n2.f1381f;
        a2.f1482A = n2.f1382g;
        a2.f1507l = n2.h;
        a2.f1521z = n2.i;
        a2.f1520y = n2.f1384k;
        a2.f1492L = EnumC0080m.values()[n2.f1385l];
        Bundle bundle2 = n2.f1386m;
        if (bundle2 != null) {
            a2.f1500b = bundle2;
        } else {
            a2.f1500b = new Bundle();
        }
        this.f1389c = a2;
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a2);
        }
    }

    public O(B.j jVar, U.v vVar, AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q, N n2) {
        this.f1387a = jVar;
        this.f1388b = vVar;
        this.f1389c = abstractComponentCallbacksC0055q;
        abstractComponentCallbacksC0055q.f1501c = null;
        abstractComponentCallbacksC0055q.d = null;
        abstractComponentCallbacksC0055q.f1512q = 0;
        abstractComponentCallbacksC0055q.f1509n = false;
        abstractComponentCallbacksC0055q.f1506k = false;
        AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q2 = abstractComponentCallbacksC0055q.f1504g;
        abstractComponentCallbacksC0055q.h = abstractComponentCallbacksC0055q2 != null ? abstractComponentCallbacksC0055q2.f1502e : null;
        abstractComponentCallbacksC0055q.f1504g = null;
        Bundle bundle = n2.f1386m;
        if (bundle != null) {
            abstractComponentCallbacksC0055q.f1500b = bundle;
        } else {
            abstractComponentCallbacksC0055q.f1500b = new Bundle();
        }
    }
}
