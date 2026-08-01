package X;

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
import androidx.lifecycle.EnumC0069l;
import androidx.lifecycle.EnumC0070m;
import com.ratebook.luckyconvert.R;
import h0.C0130a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public final B.j f853a;

    /* renamed from: b, reason: collision with root package name */
    public final T.u f854b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0049q f855c;
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f856e = -1;

    public O(B.j jVar, T.u uVar, AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q) {
        this.f853a = jVar;
        this.f854b = uVar;
        this.f855c = abstractComponentCallbacksC0049q;
    }

    public final void a() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = this.f855c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + abstractComponentCallbacksC0049q);
        }
        Bundle bundle = abstractComponentCallbacksC0049q.f966b;
        abstractComponentCallbacksC0049q.f981t.K();
        abstractComponentCallbacksC0049q.f965a = 3;
        abstractComponentCallbacksC0049q.f950C = false;
        abstractComponentCallbacksC0049q.p();
        if (!abstractComponentCallbacksC0049q.f950C) {
            throw new W("Fragment " + abstractComponentCallbacksC0049q + " did not call through to super.onActivityCreated()");
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + abstractComponentCallbacksC0049q);
        }
        View view = abstractComponentCallbacksC0049q.f952E;
        if (view != null) {
            Bundle bundle2 = abstractComponentCallbacksC0049q.f966b;
            SparseArray<Parcelable> sparseArray = abstractComponentCallbacksC0049q.f967c;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                abstractComponentCallbacksC0049q.f967c = null;
            }
            if (abstractComponentCallbacksC0049q.f952E != null) {
                abstractComponentCallbacksC0049q.f960N.d.b(abstractComponentCallbacksC0049q.d);
                abstractComponentCallbacksC0049q.d = null;
            }
            abstractComponentCallbacksC0049q.f950C = false;
            abstractComponentCallbacksC0049q.A(bundle2);
            if (!abstractComponentCallbacksC0049q.f950C) {
                throw new W("Fragment " + abstractComponentCallbacksC0049q + " did not call through to super.onViewStateRestored()");
            }
            if (abstractComponentCallbacksC0049q.f952E != null) {
                abstractComponentCallbacksC0049q.f960N.e(EnumC0069l.ON_CREATE);
            }
        }
        abstractComponentCallbacksC0049q.f966b = null;
        I i = abstractComponentCallbacksC0049q.f981t;
        i.f800E = false;
        i.F = false;
        i.f806L.f842g = false;
        i.t(4);
        this.f853a.b(false);
    }

    public final void b() {
        View view;
        View view2;
        T.u uVar = this.f854b;
        uVar.getClass();
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = this.f855c;
        ViewGroup viewGroup = abstractComponentCallbacksC0049q.f951D;
        int i = -1;
        if (viewGroup != null) {
            ArrayList arrayList = (ArrayList) uVar.f746a;
            int indexOf = arrayList.indexOf(abstractComponentCallbacksC0049q);
            int i2 = indexOf - 1;
            while (true) {
                if (i2 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q2 = (AbstractComponentCallbacksC0049q) arrayList.get(indexOf);
                        if (abstractComponentCallbacksC0049q2.f951D == viewGroup && (view = abstractComponentCallbacksC0049q2.f952E) != null) {
                            i = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q3 = (AbstractComponentCallbacksC0049q) arrayList.get(i2);
                    if (abstractComponentCallbacksC0049q3.f951D == viewGroup && (view2 = abstractComponentCallbacksC0049q3.f952E) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
        }
        abstractComponentCallbacksC0049q.f951D.addView(abstractComponentCallbacksC0049q.f952E, i);
    }

    public final void c() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = this.f855c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto ATTACHED: " + abstractComponentCallbacksC0049q);
        }
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q2 = abstractComponentCallbacksC0049q.f970g;
        O o2 = null;
        T.u uVar = this.f854b;
        if (abstractComponentCallbacksC0049q2 != null) {
            O o3 = (O) ((HashMap) uVar.f747b).get(abstractComponentCallbacksC0049q2.f968e);
            if (o3 == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0049q + " declared target fragment " + abstractComponentCallbacksC0049q.f970g + " that does not belong to this FragmentManager!");
            }
            abstractComponentCallbacksC0049q.h = abstractComponentCallbacksC0049q.f970g.f968e;
            abstractComponentCallbacksC0049q.f970g = null;
            o2 = o3;
        } else {
            String str = abstractComponentCallbacksC0049q.h;
            if (str != null && (o2 = (O) ((HashMap) uVar.f747b).get(str)) == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0049q + " declared target fragment " + abstractComponentCallbacksC0049q.h + " that does not belong to this FragmentManager!");
            }
        }
        if (o2 != null) {
            o2.k();
        }
        I i = abstractComponentCallbacksC0049q.f979r;
        abstractComponentCallbacksC0049q.f980s = i.f824t;
        abstractComponentCallbacksC0049q.f982u = i.f826v;
        B.j jVar = this.f853a;
        jVar.j(false);
        ArrayList arrayList = abstractComponentCallbacksC0049q.f963Q;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q3 = ((C0046n) it.next()).f937a;
            abstractComponentCallbacksC0049q3.f962P.a();
            androidx.lifecycle.H.d(abstractComponentCallbacksC0049q3);
        }
        arrayList.clear();
        abstractComponentCallbacksC0049q.f981t.b(abstractComponentCallbacksC0049q.f980s, abstractComponentCallbacksC0049q.e(), abstractComponentCallbacksC0049q);
        abstractComponentCallbacksC0049q.f965a = 0;
        abstractComponentCallbacksC0049q.f950C = false;
        abstractComponentCallbacksC0049q.r(abstractComponentCallbacksC0049q.f980s.f995f);
        if (!abstractComponentCallbacksC0049q.f950C) {
            throw new W("Fragment " + abstractComponentCallbacksC0049q + " did not call through to super.onAttach()");
        }
        Iterator it2 = abstractComponentCallbacksC0049q.f979r.f817m.iterator();
        while (it2.hasNext()) {
            ((M) it2.next()).a();
        }
        I i2 = abstractComponentCallbacksC0049q.f981t;
        i2.f800E = false;
        i2.F = false;
        i2.f806L.f842g = false;
        i2.t(0);
        jVar.d(false);
    }

    public final int d() {
        U u2;
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = this.f855c;
        if (abstractComponentCallbacksC0049q.f979r == null) {
            return abstractComponentCallbacksC0049q.f965a;
        }
        int i = this.f856e;
        int ordinal = abstractComponentCallbacksC0049q.f958L.ordinal();
        if (ordinal == 1) {
            i = Math.min(i, 0);
        } else if (ordinal == 2) {
            i = Math.min(i, 1);
        } else if (ordinal == 3) {
            i = Math.min(i, 5);
        } else if (ordinal != 4) {
            i = Math.min(i, -1);
        }
        if (abstractComponentCallbacksC0049q.f974m) {
            if (abstractComponentCallbacksC0049q.f975n) {
                i = Math.max(this.f856e, 2);
                View view = abstractComponentCallbacksC0049q.f952E;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.f856e < 4 ? Math.min(i, abstractComponentCallbacksC0049q.f965a) : Math.min(i, 1);
            }
        }
        if (!abstractComponentCallbacksC0049q.f972k) {
            i = Math.min(i, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0049q.f951D;
        if (viewGroup != null) {
            C0041i f2 = C0041i.f(viewGroup, abstractComponentCallbacksC0049q.j().D());
            f2.getClass();
            U d = f2.d(abstractComponentCallbacksC0049q);
            r6 = d != null ? d.f872b : 0;
            Iterator it = f2.f918c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    u2 = null;
                    break;
                }
                u2 = (U) it.next();
                if (u2.f873c.equals(abstractComponentCallbacksC0049q) && !u2.f875f) {
                    break;
                }
            }
            if (u2 != null && (r6 == 0 || r6 == 1)) {
                r6 = u2.f872b;
            }
        }
        if (r6 == 2) {
            i = Math.min(i, 6);
        } else if (r6 == 3) {
            i = Math.max(i, 3);
        } else if (abstractComponentCallbacksC0049q.f973l) {
            i = abstractComponentCallbacksC0049q.o() ? Math.min(i, 1) : Math.min(i, -1);
        }
        if (abstractComponentCallbacksC0049q.F && abstractComponentCallbacksC0049q.f965a < 5) {
            i = Math.min(i, 4);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i + " for " + abstractComponentCallbacksC0049q);
        }
        return i;
    }

    public final void e() {
        Parcelable parcelable;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = this.f855c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto CREATED: " + abstractComponentCallbacksC0049q);
        }
        if (abstractComponentCallbacksC0049q.f956J) {
            Bundle bundle = abstractComponentCallbacksC0049q.f966b;
            if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
                abstractComponentCallbacksC0049q.f981t.Q(parcelable);
                I i = abstractComponentCallbacksC0049q.f981t;
                i.f800E = false;
                i.F = false;
                i.f806L.f842g = false;
                i.t(1);
            }
            abstractComponentCallbacksC0049q.f965a = 1;
            return;
        }
        B.j jVar = this.f853a;
        jVar.l(false);
        Bundle bundle2 = abstractComponentCallbacksC0049q.f966b;
        abstractComponentCallbacksC0049q.f981t.K();
        abstractComponentCallbacksC0049q.f965a = 1;
        abstractComponentCallbacksC0049q.f950C = false;
        abstractComponentCallbacksC0049q.f959M.a(new C0130a(1, abstractComponentCallbacksC0049q));
        abstractComponentCallbacksC0049q.f962P.b(bundle2);
        abstractComponentCallbacksC0049q.s(bundle2);
        abstractComponentCallbacksC0049q.f956J = true;
        if (abstractComponentCallbacksC0049q.f950C) {
            abstractComponentCallbacksC0049q.f959M.d(EnumC0069l.ON_CREATE);
            jVar.e(false);
        } else {
            throw new W("Fragment " + abstractComponentCallbacksC0049q + " did not call through to super.onCreate()");
        }
    }

    public final void f() {
        String str;
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = this.f855c;
        if (abstractComponentCallbacksC0049q.f974m) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0049q);
        }
        LayoutInflater w2 = abstractComponentCallbacksC0049q.w(abstractComponentCallbacksC0049q.f966b);
        ViewGroup viewGroup = abstractComponentCallbacksC0049q.f951D;
        if (viewGroup == null) {
            int i = abstractComponentCallbacksC0049q.f984w;
            if (i == 0) {
                viewGroup = null;
            } else {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + abstractComponentCallbacksC0049q + " for a container view with no id");
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC0049q.f979r.f825u.c0(i);
                if (viewGroup == null) {
                    if (!abstractComponentCallbacksC0049q.f976o) {
                        try {
                            str = abstractComponentCallbacksC0049q.C().getResources().getResourceName(abstractComponentCallbacksC0049q.f984w);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC0049q.f984w) + " (" + str + ") for fragment " + abstractComponentCallbacksC0049q);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    Y.c cVar = Y.d.f1024a;
                    Y.d.b(new Y.a(abstractComponentCallbacksC0049q, "Attempting to add fragment " + abstractComponentCallbacksC0049q + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    Y.d.a(abstractComponentCallbacksC0049q).getClass();
                }
            }
        }
        abstractComponentCallbacksC0049q.f951D = viewGroup;
        abstractComponentCallbacksC0049q.B(w2, viewGroup, abstractComponentCallbacksC0049q.f966b);
        View view = abstractComponentCallbacksC0049q.f952E;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            abstractComponentCallbacksC0049q.f952E.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0049q);
            if (viewGroup != null) {
                b();
            }
            if (abstractComponentCallbacksC0049q.f986y) {
                abstractComponentCallbacksC0049q.f952E.setVisibility(8);
            }
            View view2 = abstractComponentCallbacksC0049q.f952E;
            WeakHashMap weakHashMap = K.T.f381a;
            if (view2.isAttachedToWindow()) {
                K.F.c(abstractComponentCallbacksC0049q.f952E);
            } else {
                View view3 = abstractComponentCallbacksC0049q.f952E;
                view3.addOnAttachStateChangeListener(new K0.o(1, view3));
            }
            abstractComponentCallbacksC0049q.f981t.t(2);
            this.f853a.r(false);
            int visibility = abstractComponentCallbacksC0049q.f952E.getVisibility();
            abstractComponentCallbacksC0049q.f().f945j = abstractComponentCallbacksC0049q.f952E.getAlpha();
            if (abstractComponentCallbacksC0049q.f951D != null && visibility == 0) {
                View findFocus = abstractComponentCallbacksC0049q.f952E.findFocus();
                if (findFocus != null) {
                    abstractComponentCallbacksC0049q.f().f946k = findFocus;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + abstractComponentCallbacksC0049q);
                    }
                }
                abstractComponentCallbacksC0049q.f952E.setAlpha(0.0f);
            }
        }
        abstractComponentCallbacksC0049q.f965a = 2;
    }

    public final void g() {
        boolean z2;
        AbstractComponentCallbacksC0049q d;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = this.f855c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom CREATED: " + abstractComponentCallbacksC0049q);
        }
        boolean z3 = abstractComponentCallbacksC0049q.f973l && !abstractComponentCallbacksC0049q.o();
        T.u uVar = this.f854b;
        if (z3) {
        }
        if (!z3) {
            L l2 = (L) uVar.d;
            if (!((l2.f838b.containsKey(abstractComponentCallbacksC0049q.f968e) && l2.f840e) ? l2.f841f : true)) {
                String str = abstractComponentCallbacksC0049q.h;
                if (str != null && (d = uVar.d(str)) != null && d.f948A) {
                    abstractComponentCallbacksC0049q.f970g = d;
                }
                abstractComponentCallbacksC0049q.f965a = 0;
                return;
            }
        }
        C0052u c0052u = abstractComponentCallbacksC0049q.f980s;
        if (c0052u != null) {
            z2 = ((L) uVar.d).f841f;
        } else {
            z2 = c0052u.f995f != null ? !r5.isChangingConfigurations() : true;
        }
        if (z3 || z2) {
            ((L) uVar.d).c(abstractComponentCallbacksC0049q);
        }
        abstractComponentCallbacksC0049q.f981t.k();
        abstractComponentCallbacksC0049q.f959M.d(EnumC0069l.ON_DESTROY);
        abstractComponentCallbacksC0049q.f965a = 0;
        abstractComponentCallbacksC0049q.f956J = false;
        abstractComponentCallbacksC0049q.f950C = true;
        this.f853a.f(false);
        Iterator it = uVar.h().iterator();
        while (it.hasNext()) {
            O o2 = (O) it.next();
            if (o2 != null) {
                String str2 = abstractComponentCallbacksC0049q.f968e;
                AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q2 = o2.f855c;
                if (str2.equals(abstractComponentCallbacksC0049q2.h)) {
                    abstractComponentCallbacksC0049q2.f970g = abstractComponentCallbacksC0049q;
                    abstractComponentCallbacksC0049q2.h = null;
                }
            }
        }
        String str3 = abstractComponentCallbacksC0049q.h;
        if (str3 != null) {
            abstractComponentCallbacksC0049q.f970g = uVar.d(str3);
        }
        uVar.n(this);
    }

    public final void h() {
        View view;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = this.f855c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + abstractComponentCallbacksC0049q);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0049q.f951D;
        if (viewGroup != null && (view = abstractComponentCallbacksC0049q.f952E) != null) {
            viewGroup.removeView(view);
        }
        abstractComponentCallbacksC0049q.f981t.t(1);
        if (abstractComponentCallbacksC0049q.f952E != null && abstractComponentCallbacksC0049q.f960N.d().f1370c.compareTo(EnumC0070m.f1362c) >= 0) {
            abstractComponentCallbacksC0049q.f960N.e(EnumC0069l.ON_DESTROY);
        }
        abstractComponentCallbacksC0049q.f965a = 1;
        abstractComponentCallbacksC0049q.f950C = false;
        abstractComponentCallbacksC0049q.u();
        if (!abstractComponentCallbacksC0049q.f950C) {
            throw new W("Fragment " + abstractComponentCallbacksC0049q + " did not call through to super.onDestroyView()");
        }
        o.l lVar = ((c0.a) new B0.d(abstractComponentCallbacksC0049q.c(), c0.a.f1515c).w(c0.a.class)).f1516b;
        if (lVar.f3334c > 0) {
            lVar.f3333b[0].getClass();
            throw new ClassCastException();
        }
        abstractComponentCallbacksC0049q.f977p = false;
        this.f853a.s(false);
        abstractComponentCallbacksC0049q.f951D = null;
        abstractComponentCallbacksC0049q.f952E = null;
        abstractComponentCallbacksC0049q.f960N = null;
        abstractComponentCallbacksC0049q.f961O.d(null);
        abstractComponentCallbacksC0049q.f975n = false;
    }

    public final void i() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = this.f855c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + abstractComponentCallbacksC0049q);
        }
        abstractComponentCallbacksC0049q.f965a = -1;
        abstractComponentCallbacksC0049q.f950C = false;
        abstractComponentCallbacksC0049q.v();
        if (!abstractComponentCallbacksC0049q.f950C) {
            throw new W("Fragment " + abstractComponentCallbacksC0049q + " did not call through to super.onDetach()");
        }
        I i = abstractComponentCallbacksC0049q.f981t;
        if (!i.f801G) {
            i.k();
            abstractComponentCallbacksC0049q.f981t = new I();
        }
        this.f853a.h(false);
        abstractComponentCallbacksC0049q.f965a = -1;
        abstractComponentCallbacksC0049q.f980s = null;
        abstractComponentCallbacksC0049q.f982u = null;
        abstractComponentCallbacksC0049q.f979r = null;
        if (!abstractComponentCallbacksC0049q.f973l || abstractComponentCallbacksC0049q.o()) {
            L l2 = (L) this.f854b.d;
            boolean z2 = true;
            if (l2.f838b.containsKey(abstractComponentCallbacksC0049q.f968e) && l2.f840e) {
                z2 = l2.f841f;
            }
            if (!z2) {
                return;
            }
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0049q);
        }
        abstractComponentCallbacksC0049q.l();
    }

    public final void j() {
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = this.f855c;
        if (abstractComponentCallbacksC0049q.f974m && abstractComponentCallbacksC0049q.f975n && !abstractComponentCallbacksC0049q.f977p) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0049q);
            }
            abstractComponentCallbacksC0049q.B(abstractComponentCallbacksC0049q.w(abstractComponentCallbacksC0049q.f966b), null, abstractComponentCallbacksC0049q.f966b);
            View view = abstractComponentCallbacksC0049q.f952E;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                abstractComponentCallbacksC0049q.f952E.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0049q);
                if (abstractComponentCallbacksC0049q.f986y) {
                    abstractComponentCallbacksC0049q.f952E.setVisibility(8);
                }
                abstractComponentCallbacksC0049q.f981t.t(2);
                this.f853a.r(false);
                abstractComponentCallbacksC0049q.f965a = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        T.u uVar = this.f854b;
        boolean z2 = this.d;
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = this.f855c;
        if (z2) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + abstractComponentCallbacksC0049q);
                return;
            }
            return;
        }
        try {
            this.d = true;
            boolean z3 = false;
            while (true) {
                int d = d();
                int i = abstractComponentCallbacksC0049q.f965a;
                if (d == i) {
                    if (!z3 && i == -1 && abstractComponentCallbacksC0049q.f973l && !abstractComponentCallbacksC0049q.o()) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + abstractComponentCallbacksC0049q);
                        }
                        ((L) uVar.d).c(abstractComponentCallbacksC0049q);
                        uVar.n(this);
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0049q);
                        }
                        abstractComponentCallbacksC0049q.l();
                    }
                    if (abstractComponentCallbacksC0049q.f955I) {
                        if (abstractComponentCallbacksC0049q.f952E != null && (viewGroup = abstractComponentCallbacksC0049q.f951D) != null) {
                            C0041i f2 = C0041i.f(viewGroup, abstractComponentCallbacksC0049q.j().D());
                            if (abstractComponentCallbacksC0049q.f986y) {
                                f2.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + abstractComponentCallbacksC0049q);
                                }
                                f2.a(3, 1, this);
                            } else {
                                f2.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + abstractComponentCallbacksC0049q);
                                }
                                f2.a(2, 1, this);
                            }
                        }
                        I i2 = abstractComponentCallbacksC0049q.f979r;
                        if (i2 != null && abstractComponentCallbacksC0049q.f972k && I.F(abstractComponentCallbacksC0049q)) {
                            i2.f799D = true;
                        }
                        abstractComponentCallbacksC0049q.f955I = false;
                        abstractComponentCallbacksC0049q.f981t.n();
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
                            abstractComponentCallbacksC0049q.f965a = 1;
                            break;
                        case 2:
                            abstractComponentCallbacksC0049q.f975n = false;
                            abstractComponentCallbacksC0049q.f965a = 2;
                            break;
                        case 3:
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + abstractComponentCallbacksC0049q);
                            }
                            if (abstractComponentCallbacksC0049q.f952E != null && abstractComponentCallbacksC0049q.f967c == null) {
                                o();
                            }
                            if (abstractComponentCallbacksC0049q.f952E != null && (viewGroup2 = abstractComponentCallbacksC0049q.f951D) != null) {
                                C0041i f3 = C0041i.f(viewGroup2, abstractComponentCallbacksC0049q.j().D());
                                f3.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + abstractComponentCallbacksC0049q);
                                }
                                f3.a(1, 3, this);
                            }
                            abstractComponentCallbacksC0049q.f965a = 3;
                            break;
                        case 4:
                            q();
                            break;
                        case 5:
                            abstractComponentCallbacksC0049q.f965a = 5;
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
                            if (abstractComponentCallbacksC0049q.f952E != null && (viewGroup3 = abstractComponentCallbacksC0049q.f951D) != null) {
                                C0041i f4 = C0041i.f(viewGroup3, abstractComponentCallbacksC0049q.j().D());
                                int b2 = V.b(abstractComponentCallbacksC0049q.f952E.getVisibility());
                                f4.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + abstractComponentCallbacksC0049q);
                                }
                                f4.a(b2, 2, this);
                            }
                            abstractComponentCallbacksC0049q.f965a = 4;
                            break;
                        case 5:
                            p();
                            break;
                        case 6:
                            abstractComponentCallbacksC0049q.f965a = 6;
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
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = this.f855c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom RESUMED: " + abstractComponentCallbacksC0049q);
        }
        abstractComponentCallbacksC0049q.f981t.t(5);
        if (abstractComponentCallbacksC0049q.f952E != null) {
            abstractComponentCallbacksC0049q.f960N.e(EnumC0069l.ON_PAUSE);
        }
        abstractComponentCallbacksC0049q.f959M.d(EnumC0069l.ON_PAUSE);
        abstractComponentCallbacksC0049q.f965a = 6;
        abstractComponentCallbacksC0049q.f950C = true;
        this.f853a.i(false);
    }

    public final void m(ClassLoader classLoader) {
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = this.f855c;
        Bundle bundle = abstractComponentCallbacksC0049q.f966b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        abstractComponentCallbacksC0049q.f967c = abstractComponentCallbacksC0049q.f966b.getSparseParcelableArray("android:view_state");
        abstractComponentCallbacksC0049q.d = abstractComponentCallbacksC0049q.f966b.getBundle("android:view_registry_state");
        String string = abstractComponentCallbacksC0049q.f966b.getString("android:target_state");
        abstractComponentCallbacksC0049q.h = string;
        if (string != null) {
            abstractComponentCallbacksC0049q.i = abstractComponentCallbacksC0049q.f966b.getInt("android:target_req_state", 0);
        }
        boolean z2 = abstractComponentCallbacksC0049q.f966b.getBoolean("android:user_visible_hint", true);
        abstractComponentCallbacksC0049q.f953G = z2;
        if (z2) {
            return;
        }
        abstractComponentCallbacksC0049q.F = true;
    }

    public final void n() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = this.f855c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto RESUMED: " + abstractComponentCallbacksC0049q);
        }
        C0048p c0048p = abstractComponentCallbacksC0049q.f954H;
        View view = c0048p == null ? null : c0048p.f946k;
        if (view != null) {
            if (view != abstractComponentCallbacksC0049q.f952E) {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != abstractComponentCallbacksC0049q.f952E) {
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
                sb.append(abstractComponentCallbacksC0049q);
                sb.append(" resulting in focused view ");
                sb.append(abstractComponentCallbacksC0049q.f952E.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        abstractComponentCallbacksC0049q.f().f946k = null;
        abstractComponentCallbacksC0049q.f981t.K();
        abstractComponentCallbacksC0049q.f981t.y(true);
        abstractComponentCallbacksC0049q.f965a = 7;
        abstractComponentCallbacksC0049q.f950C = true;
        androidx.lifecycle.t tVar = abstractComponentCallbacksC0049q.f959M;
        EnumC0069l enumC0069l = EnumC0069l.ON_RESUME;
        tVar.d(enumC0069l);
        if (abstractComponentCallbacksC0049q.f952E != null) {
            abstractComponentCallbacksC0049q.f960N.f865c.d(enumC0069l);
        }
        I i = abstractComponentCallbacksC0049q.f981t;
        i.f800E = false;
        i.F = false;
        i.f806L.f842g = false;
        i.t(7);
        this.f853a.m(false);
        abstractComponentCallbacksC0049q.f966b = null;
        abstractComponentCallbacksC0049q.f967c = null;
        abstractComponentCallbacksC0049q.d = null;
    }

    public final void o() {
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = this.f855c;
        if (abstractComponentCallbacksC0049q.f952E == null) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + abstractComponentCallbacksC0049q + " with view " + abstractComponentCallbacksC0049q.f952E);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        abstractComponentCallbacksC0049q.f952E.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            abstractComponentCallbacksC0049q.f967c = sparseArray;
        }
        Bundle bundle = new Bundle();
        abstractComponentCallbacksC0049q.f960N.d.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        abstractComponentCallbacksC0049q.d = bundle;
    }

    public final void p() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = this.f855c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto STARTED: " + abstractComponentCallbacksC0049q);
        }
        abstractComponentCallbacksC0049q.f981t.K();
        abstractComponentCallbacksC0049q.f981t.y(true);
        abstractComponentCallbacksC0049q.f965a = 5;
        abstractComponentCallbacksC0049q.f950C = false;
        abstractComponentCallbacksC0049q.y();
        if (!abstractComponentCallbacksC0049q.f950C) {
            throw new W("Fragment " + abstractComponentCallbacksC0049q + " did not call through to super.onStart()");
        }
        androidx.lifecycle.t tVar = abstractComponentCallbacksC0049q.f959M;
        EnumC0069l enumC0069l = EnumC0069l.ON_START;
        tVar.d(enumC0069l);
        if (abstractComponentCallbacksC0049q.f952E != null) {
            abstractComponentCallbacksC0049q.f960N.f865c.d(enumC0069l);
        }
        I i = abstractComponentCallbacksC0049q.f981t;
        i.f800E = false;
        i.F = false;
        i.f806L.f842g = false;
        i.t(5);
        this.f853a.p(false);
    }

    public final void q() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = this.f855c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom STARTED: " + abstractComponentCallbacksC0049q);
        }
        I i = abstractComponentCallbacksC0049q.f981t;
        i.F = true;
        i.f806L.f842g = true;
        i.t(4);
        if (abstractComponentCallbacksC0049q.f952E != null) {
            abstractComponentCallbacksC0049q.f960N.e(EnumC0069l.ON_STOP);
        }
        abstractComponentCallbacksC0049q.f959M.d(EnumC0069l.ON_STOP);
        abstractComponentCallbacksC0049q.f965a = 4;
        abstractComponentCallbacksC0049q.f950C = false;
        abstractComponentCallbacksC0049q.z();
        if (abstractComponentCallbacksC0049q.f950C) {
            this.f853a.q(false);
            return;
        }
        throw new W("Fragment " + abstractComponentCallbacksC0049q + " did not call through to super.onStop()");
    }

    public O(B.j jVar, T.u uVar, ClassLoader classLoader, C c2, N n2) {
        this.f853a = jVar;
        this.f854b = uVar;
        AbstractComponentCallbacksC0049q a2 = c2.a(n2.f843a);
        Bundle bundle = n2.f849j;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a2.F(bundle);
        a2.f968e = n2.f844b;
        a2.f974m = n2.f845c;
        a2.f976o = true;
        a2.f983v = n2.d;
        a2.f984w = n2.f846e;
        a2.f985x = n2.f847f;
        a2.f948A = n2.f848g;
        a2.f973l = n2.h;
        a2.f987z = n2.i;
        a2.f986y = n2.f850k;
        a2.f958L = EnumC0070m.values()[n2.f851l];
        Bundle bundle2 = n2.f852m;
        if (bundle2 != null) {
            a2.f966b = bundle2;
        } else {
            a2.f966b = new Bundle();
        }
        this.f855c = a2;
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a2);
        }
    }

    public O(B.j jVar, T.u uVar, AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q, N n2) {
        this.f853a = jVar;
        this.f854b = uVar;
        this.f855c = abstractComponentCallbacksC0049q;
        abstractComponentCallbacksC0049q.f967c = null;
        abstractComponentCallbacksC0049q.d = null;
        abstractComponentCallbacksC0049q.f978q = 0;
        abstractComponentCallbacksC0049q.f975n = false;
        abstractComponentCallbacksC0049q.f972k = false;
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q2 = abstractComponentCallbacksC0049q.f970g;
        abstractComponentCallbacksC0049q.h = abstractComponentCallbacksC0049q2 != null ? abstractComponentCallbacksC0049q2.f968e : null;
        abstractComponentCallbacksC0049q.f970g = null;
        Bundle bundle = n2.f852m;
        if (bundle != null) {
            abstractComponentCallbacksC0049q.f966b = bundle;
        } else {
            abstractComponentCallbacksC0049q.f966b = new Bundle();
        }
    }
}
