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
import androidx.lifecycle.EnumC0069m;
import androidx.lifecycle.InterfaceC0064h;
import com.fortuneodd.shadegrid.R;
import g.AbstractActivityC0138i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC0048q implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.r, androidx.lifecycle.P, InterfaceC0064h, h0.f {

    /* renamed from: S, reason: collision with root package name */
    public static final Object f951S = new Object();

    /* renamed from: A, reason: collision with root package name */
    public boolean f952A;

    /* renamed from: C, reason: collision with root package name */
    public boolean f954C;

    /* renamed from: D, reason: collision with root package name */
    public ViewGroup f955D;

    /* renamed from: E, reason: collision with root package name */
    public View f956E;
    public boolean F;

    /* renamed from: H, reason: collision with root package name */
    public C0047p f958H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f959I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f960J;

    /* renamed from: K, reason: collision with root package name */
    public String f961K;

    /* renamed from: M, reason: collision with root package name */
    public androidx.lifecycle.t f963M;

    /* renamed from: N, reason: collision with root package name */
    public Q f964N;

    /* renamed from: P, reason: collision with root package name */
    public h0.e f966P;

    /* renamed from: Q, reason: collision with root package name */
    public final ArrayList f967Q;

    /* renamed from: R, reason: collision with root package name */
    public final C0045n f968R;

    /* renamed from: b, reason: collision with root package name */
    public Bundle f970b;

    /* renamed from: c, reason: collision with root package name */
    public SparseArray f971c;
    public Bundle d;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f973f;

    /* renamed from: g, reason: collision with root package name */
    public AbstractComponentCallbacksC0048q f974g;
    public int i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f976k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f977l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f978m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f979n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f980o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f981p;

    /* renamed from: q, reason: collision with root package name */
    public int f982q;

    /* renamed from: r, reason: collision with root package name */
    public I f983r;

    /* renamed from: s, reason: collision with root package name */
    public C0051u f984s;

    /* renamed from: u, reason: collision with root package name */
    public AbstractComponentCallbacksC0048q f986u;

    /* renamed from: v, reason: collision with root package name */
    public int f987v;

    /* renamed from: w, reason: collision with root package name */
    public int f988w;

    /* renamed from: x, reason: collision with root package name */
    public String f989x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f990y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f991z;

    /* renamed from: a, reason: collision with root package name */
    public int f969a = -1;

    /* renamed from: e, reason: collision with root package name */
    public String f972e = UUID.randomUUID().toString();
    public String h = null;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f975j = null;

    /* renamed from: t, reason: collision with root package name */
    public I f985t = new I();

    /* renamed from: B, reason: collision with root package name */
    public final boolean f953B = true;

    /* renamed from: G, reason: collision with root package name */
    public boolean f957G = true;

    /* renamed from: L, reason: collision with root package name */
    public EnumC0069m f962L = EnumC0069m.f1365e;

    /* renamed from: O, reason: collision with root package name */
    public final androidx.lifecycle.w f965O = new androidx.lifecycle.w();

    public AbstractComponentCallbacksC0048q() {
        new AtomicInteger();
        this.f967Q = new ArrayList();
        this.f968R = new C0045n(this);
        k();
    }

    public void A(Bundle bundle) {
        this.f954C = true;
    }

    public void B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f985t.K();
        this.f981p = true;
        this.f964N = new Q(this, c());
        View t2 = t(layoutInflater, viewGroup);
        this.f956E = t2;
        if (t2 == null) {
            if (this.f964N.f869c != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f964N = null;
            return;
        }
        this.f964N.f();
        androidx.lifecycle.H.f(this.f956E, this.f964N);
        View view = this.f956E;
        Q q2 = this.f964N;
        X0.d.e(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, q2);
        q1.l.p0(this.f956E, this.f964N);
        this.f965O.d(this.f964N);
    }

    public final Context C() {
        Context h = h();
        if (h != null) {
            return h;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final View D() {
        View view = this.f956E;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final void E(int i, int i2, int i3, int i4) {
        if (this.f958H == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        f().f944b = i;
        f().f945c = i2;
        f().d = i3;
        f().f946e = i4;
    }

    public final void F(Bundle bundle) {
        I i = this.f983r;
        if (i != null && (i.f804E || i.F)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f973f = bundle;
    }

    @Override // androidx.lifecycle.InterfaceC0064h
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
        LinkedHashMap linkedHashMap = cVar.f1106a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.H.d, application);
        }
        linkedHashMap.put(androidx.lifecycle.H.f1339a, this);
        linkedHashMap.put(androidx.lifecycle.H.f1340b, this);
        Bundle bundle = this.f973f;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.H.f1341c, bundle);
        }
        return cVar;
    }

    @Override // h0.f
    public final h0.d b() {
        return this.f966P.f2382b;
    }

    @Override // androidx.lifecycle.P
    public final androidx.lifecycle.O c() {
        if (this.f983r == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (i() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap hashMap = this.f983r.f810L.d;
        androidx.lifecycle.O o2 = (androidx.lifecycle.O) hashMap.get(this.f972e);
        if (o2 != null) {
            return o2;
        }
        androidx.lifecycle.O o3 = new androidx.lifecycle.O();
        hashMap.put(this.f972e, o3);
        return o3;
    }

    public q1.l d() {
        return new C0046o(this);
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t e() {
        return this.f963M;
    }

    public final C0047p f() {
        if (this.f958H == null) {
            C0047p c0047p = new C0047p();
            Object obj = f951S;
            c0047p.f948g = obj;
            c0047p.h = obj;
            c0047p.i = obj;
            c0047p.f949j = 1.0f;
            c0047p.f950k = null;
            this.f958H = c0047p;
        }
        return this.f958H;
    }

    public final I g() {
        if (this.f984s != null) {
            return this.f985t;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final Context h() {
        C0051u c0051u = this.f984s;
        if (c0051u == null) {
            return null;
        }
        return c0051u.f999b;
    }

    public final int i() {
        EnumC0069m enumC0069m = this.f962L;
        return (enumC0069m == EnumC0069m.f1363b || this.f986u == null) ? enumC0069m.ordinal() : Math.min(enumC0069m.ordinal(), this.f986u.i());
    }

    public final I j() {
        I i = this.f983r;
        if (i != null) {
            return i;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final void k() {
        this.f963M = new androidx.lifecycle.t(this);
        this.f966P = new h0.e(this);
        ArrayList arrayList = this.f967Q;
        C0045n c0045n = this.f968R;
        if (arrayList.contains(c0045n)) {
            return;
        }
        if (this.f969a < 0) {
            arrayList.add(c0045n);
            return;
        }
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = c0045n.f941a;
        abstractComponentCallbacksC0048q.f966P.a();
        androidx.lifecycle.H.d(abstractComponentCallbacksC0048q);
    }

    public final void l() {
        k();
        this.f961K = this.f972e;
        this.f972e = UUID.randomUUID().toString();
        this.f976k = false;
        this.f977l = false;
        this.f978m = false;
        this.f979n = false;
        this.f980o = false;
        this.f982q = 0;
        this.f983r = null;
        this.f985t = new I();
        this.f984s = null;
        this.f987v = 0;
        this.f988w = 0;
        this.f989x = null;
        this.f990y = false;
        this.f991z = false;
    }

    public final boolean m() {
        return this.f984s != null && this.f976k;
    }

    public final boolean n() {
        if (!this.f990y) {
            I i = this.f983r;
            if (i == null) {
                return false;
            }
            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f986u;
            i.getClass();
            if (!(abstractComponentCallbacksC0048q == null ? false : abstractComponentCallbacksC0048q.n())) {
                return false;
            }
        }
        return true;
    }

    public final boolean o() {
        return this.f982q > 0;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f954C = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C0051u c0051u = this.f984s;
        AbstractActivityC0138i abstractActivityC0138i = c0051u == null ? null : c0051u.f998a;
        if (abstractActivityC0138i != null) {
            abstractActivityC0138i.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f954C = true;
    }

    public void p() {
        this.f954C = true;
    }

    public final void q(int i, int i2, Intent intent) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public void r(AbstractActivityC0138i abstractActivityC0138i) {
        this.f954C = true;
        C0051u c0051u = this.f984s;
        if ((c0051u == null ? null : c0051u.f998a) != null) {
            this.f954C = true;
        }
    }

    public void s(Bundle bundle) {
        Parcelable parcelable;
        this.f954C = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f985t.Q(parcelable);
            I i = this.f985t;
            i.f804E = false;
            i.F = false;
            i.f810L.f846g = false;
            i.t(1);
        }
        I i2 = this.f985t;
        if (i2.f827s >= 1) {
            return;
        }
        i2.f804E = false;
        i2.F = false;
        i2.f810L.f846g = false;
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
        sb.append(this.f972e);
        if (this.f987v != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f987v));
        }
        if (this.f989x != null) {
            sb.append(" tag=");
            sb.append(this.f989x);
        }
        sb.append(")");
        return sb.toString();
    }

    public void u() {
        this.f954C = true;
    }

    public void v() {
        this.f954C = true;
    }

    public LayoutInflater w(Bundle bundle) {
        C0051u c0051u = this.f984s;
        if (c0051u == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        AbstractActivityC0138i abstractActivityC0138i = c0051u.f1001e;
        LayoutInflater cloneInContext = abstractActivityC0138i.getLayoutInflater().cloneInContext(abstractActivityC0138i);
        cloneInContext.setFactory2(this.f985t.f816f);
        return cloneInContext;
    }

    public abstract void x(Bundle bundle);

    public void y() {
        this.f954C = true;
    }

    public void z() {
        this.f954C = true;
    }
}
