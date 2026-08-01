package X;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.EnumC0070m;
import androidx.lifecycle.InterfaceC0065h;
import com.ratebook.luckyconvert.R;
import g.AbstractActivityC0126i;
import h0.C0133d;
import h0.C0134e;
import h0.InterfaceC0135f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC0049q implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.r, androidx.lifecycle.P, InterfaceC0065h, InterfaceC0135f {

    /* renamed from: S, reason: collision with root package name */
    public static final Object f947S = new Object();

    /* renamed from: A, reason: collision with root package name */
    public boolean f948A;

    /* renamed from: C, reason: collision with root package name */
    public boolean f950C;

    /* renamed from: D, reason: collision with root package name */
    public ViewGroup f951D;

    /* renamed from: E, reason: collision with root package name */
    public View f952E;
    public boolean F;

    /* renamed from: H, reason: collision with root package name */
    public C0048p f954H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f955I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f956J;

    /* renamed from: K, reason: collision with root package name */
    public String f957K;

    /* renamed from: M, reason: collision with root package name */
    public androidx.lifecycle.t f959M;

    /* renamed from: N, reason: collision with root package name */
    public Q f960N;

    /* renamed from: P, reason: collision with root package name */
    public C0134e f962P;

    /* renamed from: Q, reason: collision with root package name */
    public final ArrayList f963Q;

    /* renamed from: R, reason: collision with root package name */
    public final C0046n f964R;

    /* renamed from: b, reason: collision with root package name */
    public Bundle f966b;

    /* renamed from: c, reason: collision with root package name */
    public SparseArray f967c;
    public Bundle d;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f969f;

    /* renamed from: g, reason: collision with root package name */
    public AbstractComponentCallbacksC0049q f970g;
    public int i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f972k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f973l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f974m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f975n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f976o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f977p;

    /* renamed from: q, reason: collision with root package name */
    public int f978q;

    /* renamed from: r, reason: collision with root package name */
    public I f979r;

    /* renamed from: s, reason: collision with root package name */
    public C0052u f980s;

    /* renamed from: u, reason: collision with root package name */
    public AbstractComponentCallbacksC0049q f982u;

    /* renamed from: v, reason: collision with root package name */
    public int f983v;

    /* renamed from: w, reason: collision with root package name */
    public int f984w;

    /* renamed from: x, reason: collision with root package name */
    public String f985x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f986y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f987z;

    /* renamed from: a, reason: collision with root package name */
    public int f965a = -1;

    /* renamed from: e, reason: collision with root package name */
    public String f968e = UUID.randomUUID().toString();
    public String h = null;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f971j = null;

    /* renamed from: t, reason: collision with root package name */
    public I f981t = new I();

    /* renamed from: B, reason: collision with root package name */
    public final boolean f949B = true;

    /* renamed from: G, reason: collision with root package name */
    public boolean f953G = true;

    /* renamed from: L, reason: collision with root package name */
    public EnumC0070m f958L = EnumC0070m.f1363e;

    /* renamed from: O, reason: collision with root package name */
    public final androidx.lifecycle.w f961O = new androidx.lifecycle.w();

    public AbstractComponentCallbacksC0049q() {
        new AtomicInteger();
        this.f963Q = new ArrayList();
        this.f964R = new C0046n(this);
        k();
    }

    public void A(Bundle bundle) {
        this.f950C = true;
    }

    public void B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f981t.K();
        this.f977p = true;
        this.f960N = new Q(this, c());
        View t2 = t(layoutInflater, viewGroup);
        this.f952E = t2;
        if (t2 == null) {
            if (this.f960N.f865c != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f960N = null;
            return;
        }
        this.f960N.f();
        androidx.lifecycle.H.f(this.f952E, this.f960N);
        View view = this.f952E;
        Q q2 = this.f960N;
        X0.e.e(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, q2);
        q1.d.j0(this.f952E, this.f960N);
        this.f961O.d(this.f960N);
    }

    public final Context C() {
        Context h = h();
        if (h != null) {
            return h;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final View D() {
        View view = this.f952E;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final void E(int i, int i2, int i3, int i4) {
        if (this.f954H == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        f().f940b = i;
        f().f941c = i2;
        f().d = i3;
        f().f942e = i4;
    }

    public final void F(Bundle bundle) {
        I i = this.f979r;
        if (i != null && (i.f800E || i.F)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f969f = bundle;
    }

    @Override // androidx.lifecycle.InterfaceC0065h
    public final a0.c a() {
        Application application;
        Context applicationContext = C().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + C().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        a0.c cVar = new a0.c(0);
        LinkedHashMap linkedHashMap = cVar.f1104a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.H.d, application);
        }
        linkedHashMap.put(androidx.lifecycle.H.f1337a, this);
        linkedHashMap.put(androidx.lifecycle.H.f1338b, this);
        Bundle bundle = this.f969f;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.H.f1339c, bundle);
        }
        return cVar;
    }

    @Override // h0.InterfaceC0135f
    public final C0133d b() {
        return this.f962P.f2376b;
    }

    @Override // androidx.lifecycle.P
    public final androidx.lifecycle.O c() {
        if (this.f979r == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (i() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap hashMap = this.f979r.f806L.d;
        androidx.lifecycle.O o2 = (androidx.lifecycle.O) hashMap.get(this.f968e);
        if (o2 != null) {
            return o2;
        }
        androidx.lifecycle.O o3 = new androidx.lifecycle.O();
        hashMap.put(this.f968e, o3);
        return o3;
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t d() {
        return this.f959M;
    }

    public q1.d e() {
        return new C0047o(this);
    }

    public final C0048p f() {
        if (this.f954H == null) {
            C0048p c0048p = new C0048p();
            Object obj = f947S;
            c0048p.f944g = obj;
            c0048p.h = obj;
            c0048p.i = obj;
            c0048p.f945j = 1.0f;
            c0048p.f946k = null;
            this.f954H = c0048p;
        }
        return this.f954H;
    }

    public final I g() {
        if (this.f980s != null) {
            return this.f981t;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final Context h() {
        C0052u c0052u = this.f980s;
        if (c0052u == null) {
            return null;
        }
        return c0052u.f995f;
    }

    public final int i() {
        EnumC0070m enumC0070m = this.f958L;
        return (enumC0070m == EnumC0070m.f1361b || this.f982u == null) ? enumC0070m.ordinal() : Math.min(enumC0070m.ordinal(), this.f982u.i());
    }

    public final I j() {
        I i = this.f979r;
        if (i != null) {
            return i;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final void k() {
        this.f959M = new androidx.lifecycle.t(this);
        this.f962P = new C0134e(this);
        ArrayList arrayList = this.f963Q;
        C0046n c0046n = this.f964R;
        if (arrayList.contains(c0046n)) {
            return;
        }
        if (this.f965a < 0) {
            arrayList.add(c0046n);
            return;
        }
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = c0046n.f937a;
        abstractComponentCallbacksC0049q.f962P.a();
        androidx.lifecycle.H.d(abstractComponentCallbacksC0049q);
    }

    public final void l() {
        k();
        this.f957K = this.f968e;
        this.f968e = UUID.randomUUID().toString();
        this.f972k = false;
        this.f973l = false;
        this.f974m = false;
        this.f975n = false;
        this.f976o = false;
        this.f978q = 0;
        this.f979r = null;
        this.f981t = new I();
        this.f980s = null;
        this.f983v = 0;
        this.f984w = 0;
        this.f985x = null;
        this.f986y = false;
        this.f987z = false;
    }

    public final boolean m() {
        return this.f980s != null && this.f972k;
    }

    public final boolean n() {
        if (!this.f986y) {
            I i = this.f979r;
            if (i == null) {
                return false;
            }
            AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = this.f982u;
            i.getClass();
            if (!(abstractComponentCallbacksC0049q == null ? false : abstractComponentCallbacksC0049q.n())) {
                return false;
            }
        }
        return true;
    }

    public final boolean o() {
        return this.f978q > 0;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f950C = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C0052u c0052u = this.f980s;
        AbstractActivityC0126i abstractActivityC0126i = c0052u == null ? null : c0052u.f994e;
        if (abstractActivityC0126i != null) {
            abstractActivityC0126i.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f950C = true;
    }

    public void p() {
        this.f950C = true;
    }

    public final void q(int i, int i2, Intent intent) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public void r(AbstractActivityC0126i abstractActivityC0126i) {
        this.f950C = true;
        C0052u c0052u = this.f980s;
        if ((c0052u == null ? null : c0052u.f994e) != null) {
            this.f950C = true;
        }
    }

    public void s(Bundle bundle) {
        Parcelable parcelable;
        this.f950C = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f981t.Q(parcelable);
            I i = this.f981t;
            i.f800E = false;
            i.F = false;
            i.f806L.f842g = false;
            i.t(1);
        }
        I i2 = this.f981t;
        if (i2.f823s >= 1) {
            return;
        }
        i2.f800E = false;
        i2.F = false;
        i2.f806L.f842g = false;
        i2.t(1);
    }

    public View t(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f968e);
        if (this.f983v != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f983v));
        }
        if (this.f985x != null) {
            sb.append(" tag=");
            sb.append(this.f985x);
        }
        sb.append(")");
        return sb.toString();
    }

    public void u() {
        this.f950C = true;
    }

    public void v() {
        this.f950C = true;
    }

    public LayoutInflater w(Bundle bundle) {
        C0052u c0052u = this.f980s;
        if (c0052u == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        AbstractActivityC0126i abstractActivityC0126i = c0052u.i;
        LayoutInflater cloneInContext = abstractActivityC0126i.getLayoutInflater().cloneInContext(abstractActivityC0126i);
        cloneInContext.setFactory2(this.f981t.f812f);
        return cloneInContext;
    }

    public abstract void x(Bundle bundle);

    public void y() {
        this.f950C = true;
    }

    public void z() {
        this.f950C = true;
    }
}
