package Y;

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
import androidx.lifecycle.EnumC0071l;
import androidx.lifecycle.EnumC0072m;
import androidx.recyclerview.widget.RecyclerView;
import com.football.transfertrivia.R;
import d0.C0089a;
import i0.C0138a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public final B.j f1006a;

    /* renamed from: b, reason: collision with root package name */
    public final U.v f1007b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0049q f1008c;
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f1009e = -1;

    public O(B.j jVar, U.v vVar, AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q) {
        this.f1006a = jVar;
        this.f1007b = vVar;
        this.f1008c = abstractComponentCallbacksC0049q;
    }

    public final void a() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = this.f1008c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + abstractComponentCallbacksC0049q);
        }
        Bundle bundle = abstractComponentCallbacksC0049q.f1119b;
        abstractComponentCallbacksC0049q.f1134t.K();
        abstractComponentCallbacksC0049q.f1118a = 3;
        abstractComponentCallbacksC0049q.f1103C = false;
        abstractComponentCallbacksC0049q.p();
        if (!abstractComponentCallbacksC0049q.f1103C) {
            throw new W("Fragment " + abstractComponentCallbacksC0049q + " did not call through to super.onActivityCreated()");
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + abstractComponentCallbacksC0049q);
        }
        View view = abstractComponentCallbacksC0049q.f1105E;
        if (view != null) {
            Bundle bundle2 = abstractComponentCallbacksC0049q.f1119b;
            SparseArray<Parcelable> sparseArray = abstractComponentCallbacksC0049q.f1120c;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                abstractComponentCallbacksC0049q.f1120c = null;
            }
            if (abstractComponentCallbacksC0049q.f1105E != null) {
                abstractComponentCallbacksC0049q.f1113N.d.b(abstractComponentCallbacksC0049q.d);
                abstractComponentCallbacksC0049q.d = null;
            }
            abstractComponentCallbacksC0049q.f1103C = false;
            abstractComponentCallbacksC0049q.A(bundle2);
            if (!abstractComponentCallbacksC0049q.f1103C) {
                throw new W("Fragment " + abstractComponentCallbacksC0049q + " did not call through to super.onViewStateRestored()");
            }
            if (abstractComponentCallbacksC0049q.f1105E != null) {
                abstractComponentCallbacksC0049q.f1113N.e(EnumC0071l.ON_CREATE);
            }
        }
        abstractComponentCallbacksC0049q.f1119b = null;
        I i = abstractComponentCallbacksC0049q.f1134t;
        i.f953E = false;
        i.F = false;
        i.f959L.f995g = false;
        i.t(4);
        this.f1006a.g(false);
    }

    public final void b() {
        View view;
        View view2;
        U.v vVar = this.f1007b;
        vVar.getClass();
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = this.f1008c;
        ViewGroup viewGroup = abstractComponentCallbacksC0049q.f1104D;
        int i = -1;
        if (viewGroup != null) {
            ArrayList arrayList = (ArrayList) vVar.f849a;
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
                        if (abstractComponentCallbacksC0049q2.f1104D == viewGroup && (view = abstractComponentCallbacksC0049q2.f1105E) != null) {
                            i = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q3 = (AbstractComponentCallbacksC0049q) arrayList.get(i2);
                    if (abstractComponentCallbacksC0049q3.f1104D == viewGroup && (view2 = abstractComponentCallbacksC0049q3.f1105E) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
        }
        abstractComponentCallbacksC0049q.f1104D.addView(abstractComponentCallbacksC0049q.f1105E, i);
    }

    public final void c() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = this.f1008c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto ATTACHED: " + abstractComponentCallbacksC0049q);
        }
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q2 = abstractComponentCallbacksC0049q.f1123g;
        O o2 = null;
        U.v vVar = this.f1007b;
        if (abstractComponentCallbacksC0049q2 != null) {
            O o3 = (O) ((HashMap) vVar.f850b).get(abstractComponentCallbacksC0049q2.f1121e);
            if (o3 == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0049q + " declared target fragment " + abstractComponentCallbacksC0049q.f1123g + " that does not belong to this FragmentManager!");
            }
            abstractComponentCallbacksC0049q.h = abstractComponentCallbacksC0049q.f1123g.f1121e;
            abstractComponentCallbacksC0049q.f1123g = null;
            o2 = o3;
        } else {
            String str = abstractComponentCallbacksC0049q.h;
            if (str != null && (o2 = (O) ((HashMap) vVar.f850b).get(str)) == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0049q + " declared target fragment " + abstractComponentCallbacksC0049q.h + " that does not belong to this FragmentManager!");
            }
        }
        if (o2 != null) {
            o2.k();
        }
        I i = abstractComponentCallbacksC0049q.f1132r;
        abstractComponentCallbacksC0049q.f1133s = i.f977t;
        abstractComponentCallbacksC0049q.f1135u = i.f979v;
        B.j jVar = this.f1006a;
        jVar.o(false);
        ArrayList arrayList = abstractComponentCallbacksC0049q.f1116Q;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q3 = ((C0046n) it.next()).f1090a;
            abstractComponentCallbacksC0049q3.f1115P.a();
            androidx.lifecycle.J.d(abstractComponentCallbacksC0049q3);
        }
        arrayList.clear();
        abstractComponentCallbacksC0049q.f1134t.b(abstractComponentCallbacksC0049q.f1133s, abstractComponentCallbacksC0049q.e(), abstractComponentCallbacksC0049q);
        abstractComponentCallbacksC0049q.f1118a = 0;
        abstractComponentCallbacksC0049q.f1103C = false;
        abstractComponentCallbacksC0049q.r(abstractComponentCallbacksC0049q.f1133s.f1148b);
        if (!abstractComponentCallbacksC0049q.f1103C) {
            throw new W("Fragment " + abstractComponentCallbacksC0049q + " did not call through to super.onAttach()");
        }
        Iterator it2 = abstractComponentCallbacksC0049q.f1132r.f970m.iterator();
        while (it2.hasNext()) {
            ((M) it2.next()).a();
        }
        I i2 = abstractComponentCallbacksC0049q.f1134t;
        i2.f953E = false;
        i2.F = false;
        i2.f959L.f995g = false;
        i2.t(0);
        jVar.h(false);
    }

    public final int d() {
        U u2;
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = this.f1008c;
        if (abstractComponentCallbacksC0049q.f1132r == null) {
            return abstractComponentCallbacksC0049q.f1118a;
        }
        int i = this.f1009e;
        int ordinal = abstractComponentCallbacksC0049q.f1111L.ordinal();
        if (ordinal == 1) {
            i = Math.min(i, 0);
        } else if (ordinal == 2) {
            i = Math.min(i, 1);
        } else if (ordinal == 3) {
            i = Math.min(i, 5);
        } else if (ordinal != 4) {
            i = Math.min(i, -1);
        }
        if (abstractComponentCallbacksC0049q.f1127m) {
            if (abstractComponentCallbacksC0049q.f1128n) {
                i = Math.max(this.f1009e, 2);
                View view = abstractComponentCallbacksC0049q.f1105E;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.f1009e < 4 ? Math.min(i, abstractComponentCallbacksC0049q.f1118a) : Math.min(i, 1);
            }
        }
        if (!abstractComponentCallbacksC0049q.f1125k) {
            i = Math.min(i, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0049q.f1104D;
        if (viewGroup != null) {
            C0041i f2 = C0041i.f(viewGroup, abstractComponentCallbacksC0049q.j().D());
            f2.getClass();
            U d = f2.d(abstractComponentCallbacksC0049q);
            r6 = d != null ? d.f1025b : 0;
            Iterator it = f2.f1071c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    u2 = null;
                    break;
                }
                u2 = (U) it.next();
                if (u2.f1026c.equals(abstractComponentCallbacksC0049q) && !u2.f1028f) {
                    break;
                }
            }
            if (u2 != null && (r6 == 0 || r6 == 1)) {
                r6 = u2.f1025b;
            }
        }
        if (r6 == 2) {
            i = Math.min(i, 6);
        } else if (r6 == 3) {
            i = Math.max(i, 3);
        } else if (abstractComponentCallbacksC0049q.f1126l) {
            i = abstractComponentCallbacksC0049q.o() ? Math.min(i, 1) : Math.min(i, -1);
        }
        if (abstractComponentCallbacksC0049q.F && abstractComponentCallbacksC0049q.f1118a < 5) {
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
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = this.f1008c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto CREATED: " + abstractComponentCallbacksC0049q);
        }
        if (abstractComponentCallbacksC0049q.f1109J) {
            Bundle bundle = abstractComponentCallbacksC0049q.f1119b;
            if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
                abstractComponentCallbacksC0049q.f1134t.Q(parcelable);
                I i = abstractComponentCallbacksC0049q.f1134t;
                i.f953E = false;
                i.F = false;
                i.f959L.f995g = false;
                i.t(1);
            }
            abstractComponentCallbacksC0049q.f1118a = 1;
            return;
        }
        B.j jVar = this.f1006a;
        jVar.p(false);
        Bundle bundle2 = abstractComponentCallbacksC0049q.f1119b;
        abstractComponentCallbacksC0049q.f1134t.K();
        abstractComponentCallbacksC0049q.f1118a = 1;
        abstractComponentCallbacksC0049q.f1103C = false;
        abstractComponentCallbacksC0049q.f1112M.a(new C0138a(1, abstractComponentCallbacksC0049q));
        abstractComponentCallbacksC0049q.f1115P.b(bundle2);
        abstractComponentCallbacksC0049q.s(bundle2);
        abstractComponentCallbacksC0049q.f1109J = true;
        if (abstractComponentCallbacksC0049q.f1103C) {
            abstractComponentCallbacksC0049q.f1112M.d(EnumC0071l.ON_CREATE);
            jVar.i(false);
        } else {
            throw new W("Fragment " + abstractComponentCallbacksC0049q + " did not call through to super.onCreate()");
        }
    }

    public final void f() {
        String str;
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = this.f1008c;
        if (abstractComponentCallbacksC0049q.f1127m) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0049q);
        }
        LayoutInflater w2 = abstractComponentCallbacksC0049q.w(abstractComponentCallbacksC0049q.f1119b);
        ViewGroup viewGroup = abstractComponentCallbacksC0049q.f1104D;
        if (viewGroup == null) {
            int i = abstractComponentCallbacksC0049q.f1137w;
            if (i == 0) {
                viewGroup = null;
            } else {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + abstractComponentCallbacksC0049q + " for a container view with no id");
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC0049q.f1132r.f978u.H(i);
                if (viewGroup == null) {
                    if (!abstractComponentCallbacksC0049q.f1129o) {
                        try {
                            str = abstractComponentCallbacksC0049q.C().getResources().getResourceName(abstractComponentCallbacksC0049q.f1137w);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC0049q.f1137w) + " (" + str + ") for fragment " + abstractComponentCallbacksC0049q);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    Z.c cVar = Z.d.f1173a;
                    Z.d.b(new Z.a(abstractComponentCallbacksC0049q, "Attempting to add fragment " + abstractComponentCallbacksC0049q + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    Z.d.a(abstractComponentCallbacksC0049q).getClass();
                }
            }
        }
        abstractComponentCallbacksC0049q.f1104D = viewGroup;
        abstractComponentCallbacksC0049q.B(w2, viewGroup, abstractComponentCallbacksC0049q.f1119b);
        View view = abstractComponentCallbacksC0049q.f1105E;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            abstractComponentCallbacksC0049q.f1105E.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0049q);
            if (viewGroup != null) {
                b();
            }
            if (abstractComponentCallbacksC0049q.f1139y) {
                abstractComponentCallbacksC0049q.f1105E.setVisibility(8);
            }
            View view2 = abstractComponentCallbacksC0049q.f1105E;
            WeakHashMap weakHashMap = K.T.f372a;
            if (view2.isAttachedToWindow()) {
                K.F.c(abstractComponentCallbacksC0049q.f1105E);
            } else {
                View view3 = abstractComponentCallbacksC0049q.f1105E;
                view3.addOnAttachStateChangeListener(new R0.n(1, view3));
            }
            abstractComponentCallbacksC0049q.f1134t.t(2);
            this.f1006a.u(false);
            int visibility = abstractComponentCallbacksC0049q.f1105E.getVisibility();
            abstractComponentCallbacksC0049q.f().f1098j = abstractComponentCallbacksC0049q.f1105E.getAlpha();
            if (abstractComponentCallbacksC0049q.f1104D != null && visibility == 0) {
                View findFocus = abstractComponentCallbacksC0049q.f1105E.findFocus();
                if (findFocus != null) {
                    abstractComponentCallbacksC0049q.f().f1099k = findFocus;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + abstractComponentCallbacksC0049q);
                    }
                }
                abstractComponentCallbacksC0049q.f1105E.setAlpha(RecyclerView.f1570A0);
            }
        }
        abstractComponentCallbacksC0049q.f1118a = 2;
    }

    public final void g() {
        boolean z2;
        AbstractComponentCallbacksC0049q c2;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = this.f1008c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom CREATED: " + abstractComponentCallbacksC0049q);
        }
        boolean z3 = abstractComponentCallbacksC0049q.f1126l && !abstractComponentCallbacksC0049q.o();
        U.v vVar = this.f1007b;
        if (z3) {
        }
        if (!z3) {
            L l2 = (L) vVar.d;
            if (!((l2.f991b.containsKey(abstractComponentCallbacksC0049q.f1121e) && l2.f993e) ? l2.f994f : true)) {
                String str = abstractComponentCallbacksC0049q.h;
                if (str != null && (c2 = vVar.c(str)) != null && c2.f1101A) {
                    abstractComponentCallbacksC0049q.f1123g = c2;
                }
                abstractComponentCallbacksC0049q.f1118a = 0;
                return;
            }
        }
        C0052u c0052u = abstractComponentCallbacksC0049q.f1133s;
        if (c0052u != null) {
            z2 = ((L) vVar.d).f994f;
        } else {
            z2 = c0052u.f1148b != null ? !r5.isChangingConfigurations() : true;
        }
        if (z3 || z2) {
            ((L) vVar.d).c(abstractComponentCallbacksC0049q);
        }
        abstractComponentCallbacksC0049q.f1134t.k();
        abstractComponentCallbacksC0049q.f1112M.d(EnumC0071l.ON_DESTROY);
        abstractComponentCallbacksC0049q.f1118a = 0;
        abstractComponentCallbacksC0049q.f1109J = false;
        abstractComponentCallbacksC0049q.f1103C = true;
        this.f1006a.k(false);
        Iterator it = vVar.f().iterator();
        while (it.hasNext()) {
            O o2 = (O) it.next();
            if (o2 != null) {
                String str2 = abstractComponentCallbacksC0049q.f1121e;
                AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q2 = o2.f1008c;
                if (str2.equals(abstractComponentCallbacksC0049q2.h)) {
                    abstractComponentCallbacksC0049q2.f1123g = abstractComponentCallbacksC0049q;
                    abstractComponentCallbacksC0049q2.h = null;
                }
            }
        }
        String str3 = abstractComponentCallbacksC0049q.h;
        if (str3 != null) {
            abstractComponentCallbacksC0049q.f1123g = vVar.c(str3);
        }
        vVar.j(this);
    }

    public final void h() {
        View view;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = this.f1008c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + abstractComponentCallbacksC0049q);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0049q.f1104D;
        if (viewGroup != null && (view = abstractComponentCallbacksC0049q.f1105E) != null) {
            viewGroup.removeView(view);
        }
        abstractComponentCallbacksC0049q.f1134t.t(1);
        if (abstractComponentCallbacksC0049q.f1105E != null && abstractComponentCallbacksC0049q.f1113N.d().d.compareTo(EnumC0072m.f1519c) >= 0) {
            abstractComponentCallbacksC0049q.f1113N.e(EnumC0071l.ON_DESTROY);
        }
        abstractComponentCallbacksC0049q.f1118a = 1;
        abstractComponentCallbacksC0049q.f1103C = false;
        abstractComponentCallbacksC0049q.u();
        if (!abstractComponentCallbacksC0049q.f1103C) {
            throw new W("Fragment " + abstractComponentCallbacksC0049q + " did not call through to super.onDestroyView()");
        }
        o.l lVar = ((C0089a) new A0.h(abstractComponentCallbacksC0049q.c(), C0089a.f2100c).x(C0089a.class)).f2101b;
        if (lVar.f3189c > 0) {
            lVar.f3188b[0].getClass();
            throw new ClassCastException();
        }
        abstractComponentCallbacksC0049q.f1130p = false;
        this.f1006a.v(false);
        abstractComponentCallbacksC0049q.f1104D = null;
        abstractComponentCallbacksC0049q.f1105E = null;
        abstractComponentCallbacksC0049q.f1113N = null;
        abstractComponentCallbacksC0049q.f1114O.d(null);
        abstractComponentCallbacksC0049q.f1128n = false;
    }

    public final void i() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = this.f1008c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + abstractComponentCallbacksC0049q);
        }
        abstractComponentCallbacksC0049q.f1118a = -1;
        abstractComponentCallbacksC0049q.f1103C = false;
        abstractComponentCallbacksC0049q.v();
        if (!abstractComponentCallbacksC0049q.f1103C) {
            throw new W("Fragment " + abstractComponentCallbacksC0049q + " did not call through to super.onDetach()");
        }
        I i = abstractComponentCallbacksC0049q.f1134t;
        if (!i.f954G) {
            i.k();
            abstractComponentCallbacksC0049q.f1134t = new I();
        }
        this.f1006a.m(false);
        abstractComponentCallbacksC0049q.f1118a = -1;
        abstractComponentCallbacksC0049q.f1133s = null;
        abstractComponentCallbacksC0049q.f1135u = null;
        abstractComponentCallbacksC0049q.f1132r = null;
        if (!abstractComponentCallbacksC0049q.f1126l || abstractComponentCallbacksC0049q.o()) {
            L l2 = (L) this.f1007b.d;
            boolean z2 = true;
            if (l2.f991b.containsKey(abstractComponentCallbacksC0049q.f1121e) && l2.f993e) {
                z2 = l2.f994f;
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
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = this.f1008c;
        if (abstractComponentCallbacksC0049q.f1127m && abstractComponentCallbacksC0049q.f1128n && !abstractComponentCallbacksC0049q.f1130p) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0049q);
            }
            abstractComponentCallbacksC0049q.B(abstractComponentCallbacksC0049q.w(abstractComponentCallbacksC0049q.f1119b), null, abstractComponentCallbacksC0049q.f1119b);
            View view = abstractComponentCallbacksC0049q.f1105E;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                abstractComponentCallbacksC0049q.f1105E.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0049q);
                if (abstractComponentCallbacksC0049q.f1139y) {
                    abstractComponentCallbacksC0049q.f1105E.setVisibility(8);
                }
                abstractComponentCallbacksC0049q.f1134t.t(2);
                this.f1006a.u(false);
                abstractComponentCallbacksC0049q.f1118a = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        U.v vVar = this.f1007b;
        boolean z2 = this.d;
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = this.f1008c;
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
                int i = abstractComponentCallbacksC0049q.f1118a;
                if (d == i) {
                    if (!z3 && i == -1 && abstractComponentCallbacksC0049q.f1126l && !abstractComponentCallbacksC0049q.o()) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + abstractComponentCallbacksC0049q);
                        }
                        ((L) vVar.d).c(abstractComponentCallbacksC0049q);
                        vVar.j(this);
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0049q);
                        }
                        abstractComponentCallbacksC0049q.l();
                    }
                    if (abstractComponentCallbacksC0049q.f1108I) {
                        if (abstractComponentCallbacksC0049q.f1105E != null && (viewGroup = abstractComponentCallbacksC0049q.f1104D) != null) {
                            C0041i f2 = C0041i.f(viewGroup, abstractComponentCallbacksC0049q.j().D());
                            if (abstractComponentCallbacksC0049q.f1139y) {
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
                        I i2 = abstractComponentCallbacksC0049q.f1132r;
                        if (i2 != null && abstractComponentCallbacksC0049q.f1125k && I.F(abstractComponentCallbacksC0049q)) {
                            i2.f952D = true;
                        }
                        abstractComponentCallbacksC0049q.f1108I = false;
                        abstractComponentCallbacksC0049q.f1134t.n();
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
                            abstractComponentCallbacksC0049q.f1118a = 1;
                            break;
                        case 2:
                            abstractComponentCallbacksC0049q.f1128n = false;
                            abstractComponentCallbacksC0049q.f1118a = 2;
                            break;
                        case 3:
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + abstractComponentCallbacksC0049q);
                            }
                            if (abstractComponentCallbacksC0049q.f1105E != null && abstractComponentCallbacksC0049q.f1120c == null) {
                                o();
                            }
                            if (abstractComponentCallbacksC0049q.f1105E != null && (viewGroup2 = abstractComponentCallbacksC0049q.f1104D) != null) {
                                C0041i f3 = C0041i.f(viewGroup2, abstractComponentCallbacksC0049q.j().D());
                                f3.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + abstractComponentCallbacksC0049q);
                                }
                                f3.a(1, 3, this);
                            }
                            abstractComponentCallbacksC0049q.f1118a = 3;
                            break;
                        case 4:
                            q();
                            break;
                        case 5:
                            abstractComponentCallbacksC0049q.f1118a = 5;
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
                            if (abstractComponentCallbacksC0049q.f1105E != null && (viewGroup3 = abstractComponentCallbacksC0049q.f1104D) != null) {
                                C0041i f4 = C0041i.f(viewGroup3, abstractComponentCallbacksC0049q.j().D());
                                int b2 = V.b(abstractComponentCallbacksC0049q.f1105E.getVisibility());
                                f4.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + abstractComponentCallbacksC0049q);
                                }
                                f4.a(b2, 2, this);
                            }
                            abstractComponentCallbacksC0049q.f1118a = 4;
                            break;
                        case 5:
                            p();
                            break;
                        case 6:
                            abstractComponentCallbacksC0049q.f1118a = 6;
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
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = this.f1008c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom RESUMED: " + abstractComponentCallbacksC0049q);
        }
        abstractComponentCallbacksC0049q.f1134t.t(5);
        if (abstractComponentCallbacksC0049q.f1105E != null) {
            abstractComponentCallbacksC0049q.f1113N.e(EnumC0071l.ON_PAUSE);
        }
        abstractComponentCallbacksC0049q.f1112M.d(EnumC0071l.ON_PAUSE);
        abstractComponentCallbacksC0049q.f1118a = 6;
        abstractComponentCallbacksC0049q.f1103C = true;
        this.f1006a.n(false);
    }

    public final void m(ClassLoader classLoader) {
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = this.f1008c;
        Bundle bundle = abstractComponentCallbacksC0049q.f1119b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        abstractComponentCallbacksC0049q.f1120c = abstractComponentCallbacksC0049q.f1119b.getSparseParcelableArray("android:view_state");
        abstractComponentCallbacksC0049q.d = abstractComponentCallbacksC0049q.f1119b.getBundle("android:view_registry_state");
        String string = abstractComponentCallbacksC0049q.f1119b.getString("android:target_state");
        abstractComponentCallbacksC0049q.h = string;
        if (string != null) {
            abstractComponentCallbacksC0049q.i = abstractComponentCallbacksC0049q.f1119b.getInt("android:target_req_state", 0);
        }
        boolean z2 = abstractComponentCallbacksC0049q.f1119b.getBoolean("android:user_visible_hint", true);
        abstractComponentCallbacksC0049q.f1106G = z2;
        if (z2) {
            return;
        }
        abstractComponentCallbacksC0049q.F = true;
    }

    public final void n() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = this.f1008c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto RESUMED: " + abstractComponentCallbacksC0049q);
        }
        C0048p c0048p = abstractComponentCallbacksC0049q.f1107H;
        View view = c0048p == null ? null : c0048p.f1099k;
        if (view != null) {
            if (view != abstractComponentCallbacksC0049q.f1105E) {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != abstractComponentCallbacksC0049q.f1105E) {
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
                sb.append(abstractComponentCallbacksC0049q.f1105E.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        abstractComponentCallbacksC0049q.f().f1099k = null;
        abstractComponentCallbacksC0049q.f1134t.K();
        abstractComponentCallbacksC0049q.f1134t.y(true);
        abstractComponentCallbacksC0049q.f1118a = 7;
        abstractComponentCallbacksC0049q.f1103C = true;
        androidx.lifecycle.v vVar = abstractComponentCallbacksC0049q.f1112M;
        EnumC0071l enumC0071l = EnumC0071l.ON_RESUME;
        vVar.d(enumC0071l);
        if (abstractComponentCallbacksC0049q.f1105E != null) {
            abstractComponentCallbacksC0049q.f1113N.f1018c.d(enumC0071l);
        }
        I i = abstractComponentCallbacksC0049q.f1134t;
        i.f953E = false;
        i.F = false;
        i.f959L.f995g = false;
        i.t(7);
        this.f1006a.q(false);
        abstractComponentCallbacksC0049q.f1119b = null;
        abstractComponentCallbacksC0049q.f1120c = null;
        abstractComponentCallbacksC0049q.d = null;
    }

    public final void o() {
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = this.f1008c;
        if (abstractComponentCallbacksC0049q.f1105E == null) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + abstractComponentCallbacksC0049q + " with view " + abstractComponentCallbacksC0049q.f1105E);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        abstractComponentCallbacksC0049q.f1105E.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            abstractComponentCallbacksC0049q.f1120c = sparseArray;
        }
        Bundle bundle = new Bundle();
        abstractComponentCallbacksC0049q.f1113N.d.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        abstractComponentCallbacksC0049q.d = bundle;
    }

    public final void p() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = this.f1008c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto STARTED: " + abstractComponentCallbacksC0049q);
        }
        abstractComponentCallbacksC0049q.f1134t.K();
        abstractComponentCallbacksC0049q.f1134t.y(true);
        abstractComponentCallbacksC0049q.f1118a = 5;
        abstractComponentCallbacksC0049q.f1103C = false;
        abstractComponentCallbacksC0049q.y();
        if (!abstractComponentCallbacksC0049q.f1103C) {
            throw new W("Fragment " + abstractComponentCallbacksC0049q + " did not call through to super.onStart()");
        }
        androidx.lifecycle.v vVar = abstractComponentCallbacksC0049q.f1112M;
        EnumC0071l enumC0071l = EnumC0071l.ON_START;
        vVar.d(enumC0071l);
        if (abstractComponentCallbacksC0049q.f1105E != null) {
            abstractComponentCallbacksC0049q.f1113N.f1018c.d(enumC0071l);
        }
        I i = abstractComponentCallbacksC0049q.f1134t;
        i.f953E = false;
        i.F = false;
        i.f959L.f995g = false;
        i.t(5);
        this.f1006a.s(false);
    }

    public final void q() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = this.f1008c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom STARTED: " + abstractComponentCallbacksC0049q);
        }
        I i = abstractComponentCallbacksC0049q.f1134t;
        i.F = true;
        i.f959L.f995g = true;
        i.t(4);
        if (abstractComponentCallbacksC0049q.f1105E != null) {
            abstractComponentCallbacksC0049q.f1113N.e(EnumC0071l.ON_STOP);
        }
        abstractComponentCallbacksC0049q.f1112M.d(EnumC0071l.ON_STOP);
        abstractComponentCallbacksC0049q.f1118a = 4;
        abstractComponentCallbacksC0049q.f1103C = false;
        abstractComponentCallbacksC0049q.z();
        if (abstractComponentCallbacksC0049q.f1103C) {
            this.f1006a.t(false);
            return;
        }
        throw new W("Fragment " + abstractComponentCallbacksC0049q + " did not call through to super.onStop()");
    }

    public O(B.j jVar, U.v vVar, ClassLoader classLoader, C c2, N n2) {
        this.f1006a = jVar;
        this.f1007b = vVar;
        AbstractComponentCallbacksC0049q a2 = c2.a(n2.f996a);
        Bundle bundle = n2.f1002j;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a2.F(bundle);
        a2.f1121e = n2.f997b;
        a2.f1127m = n2.f998c;
        a2.f1129o = true;
        a2.f1136v = n2.d;
        a2.f1137w = n2.f999e;
        a2.f1138x = n2.f1000f;
        a2.f1101A = n2.f1001g;
        a2.f1126l = n2.h;
        a2.f1140z = n2.i;
        a2.f1139y = n2.f1003k;
        a2.f1111L = EnumC0072m.values()[n2.f1004l];
        Bundle bundle2 = n2.f1005m;
        if (bundle2 != null) {
            a2.f1119b = bundle2;
        } else {
            a2.f1119b = new Bundle();
        }
        this.f1008c = a2;
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a2);
        }
    }

    public O(B.j jVar, U.v vVar, AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q, N n2) {
        this.f1006a = jVar;
        this.f1007b = vVar;
        this.f1008c = abstractComponentCallbacksC0049q;
        abstractComponentCallbacksC0049q.f1120c = null;
        abstractComponentCallbacksC0049q.d = null;
        abstractComponentCallbacksC0049q.f1131q = 0;
        abstractComponentCallbacksC0049q.f1128n = false;
        abstractComponentCallbacksC0049q.f1125k = false;
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q2 = abstractComponentCallbacksC0049q.f1123g;
        abstractComponentCallbacksC0049q.h = abstractComponentCallbacksC0049q2 != null ? abstractComponentCallbacksC0049q2.f1121e : null;
        abstractComponentCallbacksC0049q.f1123g = null;
        Bundle bundle = n2.f1005m;
        if (bundle != null) {
            abstractComponentCallbacksC0049q.f1119b = bundle;
        } else {
            abstractComponentCallbacksC0049q.f1119b = new Bundle();
        }
    }
}
