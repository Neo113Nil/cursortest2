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
import com.linetic.luckycross.R;
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
    public static final Object f953S = new Object();

    /* renamed from: A, reason: collision with root package name */
    public boolean f954A;

    /* renamed from: C, reason: collision with root package name */
    public boolean f956C;

    /* renamed from: D, reason: collision with root package name */
    public ViewGroup f957D;

    /* renamed from: E, reason: collision with root package name */
    public View f958E;
    public boolean F;

    /* renamed from: H, reason: collision with root package name */
    public C0048p f960H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f961I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f962J;

    /* renamed from: K, reason: collision with root package name */
    public String f963K;

    /* renamed from: M, reason: collision with root package name */
    public androidx.lifecycle.t f965M;

    /* renamed from: N, reason: collision with root package name */
    public Q f966N;

    /* renamed from: P, reason: collision with root package name */
    public C0134e f968P;

    /* renamed from: Q, reason: collision with root package name */
    public final ArrayList f969Q;

    /* renamed from: R, reason: collision with root package name */
    public final C0046n f970R;

    /* renamed from: b, reason: collision with root package name */
    public Bundle f972b;

    /* renamed from: c, reason: collision with root package name */
    public SparseArray f973c;
    public Bundle d;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f975f;

    /* renamed from: g, reason: collision with root package name */
    public AbstractComponentCallbacksC0049q f976g;
    public int i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f978k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f979l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f980m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f981n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f982o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f983p;

    /* renamed from: q, reason: collision with root package name */
    public int f984q;

    /* renamed from: r, reason: collision with root package name */
    public I f985r;

    /* renamed from: s, reason: collision with root package name */
    public C0052u f986s;

    /* renamed from: u, reason: collision with root package name */
    public AbstractComponentCallbacksC0049q f988u;

    /* renamed from: v, reason: collision with root package name */
    public int f989v;

    /* renamed from: w, reason: collision with root package name */
    public int f990w;

    /* renamed from: x, reason: collision with root package name */
    public String f991x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f992y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f993z;

    /* renamed from: a, reason: collision with root package name */
    public int f971a = -1;

    /* renamed from: e, reason: collision with root package name */
    public String f974e = UUID.randomUUID().toString();
    public String h = null;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f977j = null;

    /* renamed from: t, reason: collision with root package name */
    public I f987t = new I();

    /* renamed from: B, reason: collision with root package name */
    public final boolean f955B = true;

    /* renamed from: G, reason: collision with root package name */
    public boolean f959G = true;

    /* renamed from: L, reason: collision with root package name */
    public EnumC0070m f964L = EnumC0070m.f1366e;

    /* renamed from: O, reason: collision with root package name */
    public final androidx.lifecycle.w f967O = new androidx.lifecycle.w();

    public AbstractComponentCallbacksC0049q() {
        new AtomicInteger();
        this.f969Q = new ArrayList();
        this.f970R = new C0046n(this);
        k();
    }

    public void A(Bundle bundle) {
        this.f956C = true;
    }

    public void B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f987t.K();
        this.f983p = true;
        this.f966N = new Q(this, c());
        View t2 = t(layoutInflater, viewGroup);
        this.f958E = t2;
        if (t2 == null) {
            if (this.f966N.f871c != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f966N = null;
            return;
        }
        this.f966N.f();
        androidx.lifecycle.H.f(this.f958E, this.f966N);
        View view = this.f958E;
        Q q2 = this.f966N;
        X0.d.e(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, q2);
        q1.d.k0(this.f958E, this.f966N);
        this.f967O.d(this.f966N);
    }

    public final Context C() {
        Context h = h();
        if (h != null) {
            return h;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final View D() {
        View view = this.f958E;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final void E(int i, int i2, int i3, int i4) {
        if (this.f960H == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        f().f946b = i;
        f().f947c = i2;
        f().d = i3;
        f().f948e = i4;
    }

    public final void F(Bundle bundle) {
        I i = this.f985r;
        if (i != null && (i.f806E || i.F)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f975f = bundle;
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
        LinkedHashMap linkedHashMap = cVar.f1107a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.H.d, application);
        }
        linkedHashMap.put(androidx.lifecycle.H.f1340a, this);
        linkedHashMap.put(androidx.lifecycle.H.f1341b, this);
        Bundle bundle = this.f975f;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.H.f1342c, bundle);
        }
        return cVar;
    }

    @Override // h0.InterfaceC0135f
    public final C0133d b() {
        return this.f968P.f2379b;
    }

    @Override // androidx.lifecycle.P
    public final androidx.lifecycle.O c() {
        if (this.f985r == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (i() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap hashMap = this.f985r.f812L.d;
        androidx.lifecycle.O o2 = (androidx.lifecycle.O) hashMap.get(this.f974e);
        if (o2 != null) {
            return o2;
        }
        androidx.lifecycle.O o3 = new androidx.lifecycle.O();
        hashMap.put(this.f974e, o3);
        return o3;
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t d() {
        return this.f965M;
    }

    public q1.d e() {
        return new C0047o(this);
    }

    public final C0048p f() {
        if (this.f960H == null) {
            C0048p c0048p = new C0048p();
            Object obj = f953S;
            c0048p.f950g = obj;
            c0048p.h = obj;
            c0048p.i = obj;
            c0048p.f951j = 1.0f;
            c0048p.f952k = null;
            this.f960H = c0048p;
        }
        return this.f960H;
    }

    public final I g() {
        if (this.f986s != null) {
            return this.f987t;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final Context h() {
        C0052u c0052u = this.f986s;
        if (c0052u == null) {
            return null;
        }
        return c0052u.f1001f;
    }

    public final int i() {
        EnumC0070m enumC0070m = this.f964L;
        return (enumC0070m == EnumC0070m.f1364b || this.f988u == null) ? enumC0070m.ordinal() : Math.min(enumC0070m.ordinal(), this.f988u.i());
    }

    public final I j() {
        I i = this.f985r;
        if (i != null) {
            return i;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final void k() {
        this.f965M = new androidx.lifecycle.t(this);
        this.f968P = new C0134e(this);
        ArrayList arrayList = this.f969Q;
        C0046n c0046n = this.f970R;
        if (arrayList.contains(c0046n)) {
            return;
        }
        if (this.f971a < 0) {
            arrayList.add(c0046n);
            return;
        }
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = c0046n.f943a;
        abstractComponentCallbacksC0049q.f968P.a();
        androidx.lifecycle.H.d(abstractComponentCallbacksC0049q);
    }

    public final void l() {
        k();
        this.f963K = this.f974e;
        this.f974e = UUID.randomUUID().toString();
        this.f978k = false;
        this.f979l = false;
        this.f980m = false;
        this.f981n = false;
        this.f982o = false;
        this.f984q = 0;
        this.f985r = null;
        this.f987t = new I();
        this.f986s = null;
        this.f989v = 0;
        this.f990w = 0;
        this.f991x = null;
        this.f992y = false;
        this.f993z = false;
    }

    public final boolean m() {
        return this.f986s != null && this.f978k;
    }

    public final boolean n() {
        if (!this.f992y) {
            I i = this.f985r;
            if (i == null) {
                return false;
            }
            AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = this.f988u;
            i.getClass();
            if (!(abstractComponentCallbacksC0049q == null ? false : abstractComponentCallbacksC0049q.n())) {
                return false;
            }
        }
        return true;
    }

    public final boolean o() {
        return this.f984q > 0;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f956C = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C0052u c0052u = this.f986s;
        AbstractActivityC0126i abstractActivityC0126i = c0052u == null ? null : c0052u.f1000e;
        if (abstractActivityC0126i != null) {
            abstractActivityC0126i.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f956C = true;
    }

    public void p() {
        this.f956C = true;
    }

    public final void q(int i, int i2, Intent intent) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public void r(AbstractActivityC0126i abstractActivityC0126i) {
        this.f956C = true;
        C0052u c0052u = this.f986s;
        if ((c0052u == null ? null : c0052u.f1000e) != null) {
            this.f956C = true;
        }
    }

    public void s(Bundle bundle) {
        Parcelable parcelable;
        this.f956C = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f987t.Q(parcelable);
            I i = this.f987t;
            i.f806E = false;
            i.F = false;
            i.f812L.f848g = false;
            i.t(1);
        }
        I i2 = this.f987t;
        if (i2.f829s >= 1) {
            return;
        }
        i2.f806E = false;
        i2.F = false;
        i2.f812L.f848g = false;
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
        sb.append(this.f974e);
        if (this.f989v != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f989v));
        }
        if (this.f991x != null) {
            sb.append(" tag=");
            sb.append(this.f991x);
        }
        sb.append(")");
        return sb.toString();
    }

    public void u() {
        this.f956C = true;
    }

    public void v() {
        this.f956C = true;
    }

    public LayoutInflater w(Bundle bundle) {
        C0052u c0052u = this.f986s;
        if (c0052u == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        AbstractActivityC0126i abstractActivityC0126i = c0052u.i;
        LayoutInflater cloneInContext = abstractActivityC0126i.getLayoutInflater().cloneInContext(abstractActivityC0126i);
        cloneInContext.setFactory2(this.f987t.f818f);
        return cloneInContext;
    }

    public abstract void x(Bundle bundle);

    public void y() {
        this.f956C = true;
    }

    public void z() {
        this.f956C = true;
    }
}
