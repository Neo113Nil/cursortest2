package Y;

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
import androidx.lifecycle.EnumC0080m;
import androidx.lifecycle.InterfaceC0075h;
import b0.C0091c;
import c1.AbstractC0104b;
import com.luckycounter.drinkwater.R;
import g.AbstractActivityC0129i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: Y.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC0055q implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.t, androidx.lifecycle.S, InterfaceC0075h, i0.f {

    /* renamed from: S, reason: collision with root package name */
    public static final Object f1481S = new Object();

    /* renamed from: A, reason: collision with root package name */
    public boolean f1482A;

    /* renamed from: C, reason: collision with root package name */
    public boolean f1484C;

    /* renamed from: D, reason: collision with root package name */
    public ViewGroup f1485D;

    /* renamed from: E, reason: collision with root package name */
    public View f1486E;
    public boolean F;

    /* renamed from: H, reason: collision with root package name */
    public C0054p f1488H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f1489I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f1490J;

    /* renamed from: K, reason: collision with root package name */
    public String f1491K;

    /* renamed from: M, reason: collision with root package name */
    public androidx.lifecycle.v f1493M;

    /* renamed from: N, reason: collision with root package name */
    public Q f1494N;

    /* renamed from: P, reason: collision with root package name */
    public i0.e f1496P;

    /* renamed from: Q, reason: collision with root package name */
    public final ArrayList f1497Q;

    /* renamed from: R, reason: collision with root package name */
    public final C0052n f1498R;

    /* renamed from: b, reason: collision with root package name */
    public Bundle f1500b;

    /* renamed from: c, reason: collision with root package name */
    public SparseArray f1501c;
    public Bundle d;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f1503f;

    /* renamed from: g, reason: collision with root package name */
    public AbstractComponentCallbacksC0055q f1504g;
    public int i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1506k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1507l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1508m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1509n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1510o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1511p;

    /* renamed from: q, reason: collision with root package name */
    public int f1512q;

    /* renamed from: r, reason: collision with root package name */
    public I f1513r;

    /* renamed from: s, reason: collision with root package name */
    public C0058u f1514s;

    /* renamed from: u, reason: collision with root package name */
    public AbstractComponentCallbacksC0055q f1516u;

    /* renamed from: v, reason: collision with root package name */
    public int f1517v;

    /* renamed from: w, reason: collision with root package name */
    public int f1518w;

    /* renamed from: x, reason: collision with root package name */
    public String f1519x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f1520y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1521z;

    /* renamed from: a, reason: collision with root package name */
    public int f1499a = -1;

    /* renamed from: e, reason: collision with root package name */
    public String f1502e = UUID.randomUUID().toString();
    public String h = null;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f1505j = null;

    /* renamed from: t, reason: collision with root package name */
    public I f1515t = new I();

    /* renamed from: B, reason: collision with root package name */
    public final boolean f1483B = true;

    /* renamed from: G, reason: collision with root package name */
    public boolean f1487G = true;

    /* renamed from: L, reason: collision with root package name */
    public EnumC0080m f1492L = EnumC0080m.f1899e;

    /* renamed from: O, reason: collision with root package name */
    public final androidx.lifecycle.y f1495O = new androidx.lifecycle.y();

    public AbstractComponentCallbacksC0055q() {
        new AtomicInteger();
        this.f1497Q = new ArrayList();
        this.f1498R = new C0052n(this);
        k();
    }

    public void A(Bundle bundle) {
        this.f1484C = true;
    }

    public void B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f1515t.K();
        this.f1511p = true;
        this.f1494N = new Q(this, c());
        View t2 = t(layoutInflater, viewGroup);
        this.f1486E = t2;
        if (t2 == null) {
            if (this.f1494N.f1399c != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f1494N = null;
            return;
        }
        this.f1494N.f();
        androidx.lifecycle.J.g(this.f1486E, this.f1494N);
        View view = this.f1486E;
        Q q2 = this.f1494N;
        i1.f.e(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, q2);
        AbstractC0104b.w(this.f1486E, this.f1494N);
        this.f1495O.d(this.f1494N);
    }

    public final Context C() {
        Context h = h();
        if (h != null) {
            return h;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final View D() {
        View view = this.f1486E;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final void E(int i, int i2, int i3, int i4) {
        if (this.f1488H == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        f().f1474b = i;
        f().f1475c = i2;
        f().d = i3;
        f().f1476e = i4;
    }

    public final void F(Bundle bundle) {
        I i = this.f1513r;
        if (i != null && (i.f1334E || i.F)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f1503f = bundle;
    }

    @Override // androidx.lifecycle.InterfaceC0075h
    public final C0091c a() {
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
        C0091c c0091c = new C0091c(0);
        LinkedHashMap linkedHashMap = c0091c.f2102a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.J.d, application);
        }
        linkedHashMap.put(androidx.lifecycle.J.f1873a, this);
        linkedHashMap.put(androidx.lifecycle.J.f1874b, this);
        Bundle bundle = this.f1503f;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.J.f1875c, bundle);
        }
        return c0091c;
    }

    @Override // i0.f
    public final i0.d b() {
        return this.f1496P.f3037b;
    }

    @Override // androidx.lifecycle.S
    public final androidx.lifecycle.Q c() {
        if (this.f1513r == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (i() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap hashMap = this.f1513r.f1340L.d;
        androidx.lifecycle.Q q2 = (androidx.lifecycle.Q) hashMap.get(this.f1502e);
        if (q2 != null) {
            return q2;
        }
        androidx.lifecycle.Q q3 = new androidx.lifecycle.Q();
        hashMap.put(this.f1502e, q3);
        return q3;
    }

    public F1.d d() {
        return new C0053o(this);
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.v e() {
        return this.f1493M;
    }

    public final C0054p f() {
        if (this.f1488H == null) {
            C0054p c0054p = new C0054p();
            Object obj = f1481S;
            c0054p.f1478g = obj;
            c0054p.h = obj;
            c0054p.i = obj;
            c0054p.f1479j = 1.0f;
            c0054p.f1480k = null;
            this.f1488H = c0054p;
        }
        return this.f1488H;
    }

    public final I g() {
        if (this.f1514s != null) {
            return this.f1515t;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final Context h() {
        C0058u c0058u = this.f1514s;
        if (c0058u == null) {
            return null;
        }
        return c0058u.f1529b;
    }

    public final int i() {
        EnumC0080m enumC0080m = this.f1492L;
        return (enumC0080m == EnumC0080m.f1897b || this.f1516u == null) ? enumC0080m.ordinal() : Math.min(enumC0080m.ordinal(), this.f1516u.i());
    }

    public final I j() {
        I i = this.f1513r;
        if (i != null) {
            return i;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final void k() {
        this.f1493M = new androidx.lifecycle.v(this);
        this.f1496P = new i0.e(this);
        ArrayList arrayList = this.f1497Q;
        C0052n c0052n = this.f1498R;
        if (arrayList.contains(c0052n)) {
            return;
        }
        if (this.f1499a < 0) {
            arrayList.add(c0052n);
            return;
        }
        AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q = c0052n.f1471a;
        abstractComponentCallbacksC0055q.f1496P.a();
        androidx.lifecycle.J.d(abstractComponentCallbacksC0055q);
    }

    public final void l() {
        k();
        this.f1491K = this.f1502e;
        this.f1502e = UUID.randomUUID().toString();
        this.f1506k = false;
        this.f1507l = false;
        this.f1508m = false;
        this.f1509n = false;
        this.f1510o = false;
        this.f1512q = 0;
        this.f1513r = null;
        this.f1515t = new I();
        this.f1514s = null;
        this.f1517v = 0;
        this.f1518w = 0;
        this.f1519x = null;
        this.f1520y = false;
        this.f1521z = false;
    }

    public final boolean m() {
        return this.f1514s != null && this.f1506k;
    }

    public final boolean n() {
        if (!this.f1520y) {
            I i = this.f1513r;
            if (i == null) {
                return false;
            }
            AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q = this.f1516u;
            i.getClass();
            if (!(abstractComponentCallbacksC0055q == null ? false : abstractComponentCallbacksC0055q.n())) {
                return false;
            }
        }
        return true;
    }

    public final boolean o() {
        return this.f1512q > 0;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f1484C = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C0058u c0058u = this.f1514s;
        AbstractActivityC0129i abstractActivityC0129i = c0058u == null ? null : c0058u.f1528a;
        if (abstractActivityC0129i != null) {
            abstractActivityC0129i.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f1484C = true;
    }

    public void p() {
        this.f1484C = true;
    }

    public final void q(int i, int i2, Intent intent) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public void r(AbstractActivityC0129i abstractActivityC0129i) {
        this.f1484C = true;
        C0058u c0058u = this.f1514s;
        if ((c0058u == null ? null : c0058u.f1528a) != null) {
            this.f1484C = true;
        }
    }

    public void s(Bundle bundle) {
        Parcelable parcelable;
        this.f1484C = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f1515t.Q(parcelable);
            I i = this.f1515t;
            i.f1334E = false;
            i.F = false;
            i.f1340L.f1376g = false;
            i.t(1);
        }
        I i2 = this.f1515t;
        if (i2.f1357s >= 1) {
            return;
        }
        i2.f1334E = false;
        i2.F = false;
        i2.f1340L.f1376g = false;
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
        sb.append(this.f1502e);
        if (this.f1517v != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1517v));
        }
        if (this.f1519x != null) {
            sb.append(" tag=");
            sb.append(this.f1519x);
        }
        sb.append(")");
        return sb.toString();
    }

    public void u() {
        this.f1484C = true;
    }

    public void v() {
        this.f1484C = true;
    }

    public LayoutInflater w(Bundle bundle) {
        C0058u c0058u = this.f1514s;
        if (c0058u == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        AbstractActivityC0129i abstractActivityC0129i = c0058u.f1531e;
        LayoutInflater cloneInContext = abstractActivityC0129i.getLayoutInflater().cloneInContext(abstractActivityC0129i);
        cloneInContext.setFactory2(this.f1515t.f1346f);
        return cloneInContext;
    }

    public abstract void x(Bundle bundle);

    public void y() {
        this.f1484C = true;
    }

    public void z() {
        this.f1484C = true;
    }
}
