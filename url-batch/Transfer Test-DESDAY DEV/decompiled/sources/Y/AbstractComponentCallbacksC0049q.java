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
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.EnumC0072m;
import androidx.lifecycle.InterfaceC0067h;
import b0.C0083c;
import com.football.transfertrivia.R;
import i0.C0141d;
import i0.C0142e;
import i0.InterfaceC0143f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: Y.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC0049q implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.t, androidx.lifecycle.S, InterfaceC0067h, InterfaceC0143f {

    /* renamed from: S, reason: collision with root package name */
    public static final Object f1100S = new Object();

    /* renamed from: A, reason: collision with root package name */
    public boolean f1101A;

    /* renamed from: C, reason: collision with root package name */
    public boolean f1103C;

    /* renamed from: D, reason: collision with root package name */
    public ViewGroup f1104D;

    /* renamed from: E, reason: collision with root package name */
    public View f1105E;
    public boolean F;

    /* renamed from: H, reason: collision with root package name */
    public C0048p f1107H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f1108I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f1109J;

    /* renamed from: K, reason: collision with root package name */
    public String f1110K;

    /* renamed from: M, reason: collision with root package name */
    public androidx.lifecycle.v f1112M;

    /* renamed from: N, reason: collision with root package name */
    public Q f1113N;

    /* renamed from: P, reason: collision with root package name */
    public C0142e f1115P;

    /* renamed from: Q, reason: collision with root package name */
    public final ArrayList f1116Q;

    /* renamed from: R, reason: collision with root package name */
    public final C0046n f1117R;

    /* renamed from: b, reason: collision with root package name */
    public Bundle f1119b;

    /* renamed from: c, reason: collision with root package name */
    public SparseArray f1120c;
    public Bundle d;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f1122f;

    /* renamed from: g, reason: collision with root package name */
    public AbstractComponentCallbacksC0049q f1123g;
    public int i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1125k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1126l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1127m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1128n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1129o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1130p;

    /* renamed from: q, reason: collision with root package name */
    public int f1131q;

    /* renamed from: r, reason: collision with root package name */
    public I f1132r;

    /* renamed from: s, reason: collision with root package name */
    public C0052u f1133s;

    /* renamed from: u, reason: collision with root package name */
    public AbstractComponentCallbacksC0049q f1135u;

    /* renamed from: v, reason: collision with root package name */
    public int f1136v;

    /* renamed from: w, reason: collision with root package name */
    public int f1137w;

    /* renamed from: x, reason: collision with root package name */
    public String f1138x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f1139y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1140z;

    /* renamed from: a, reason: collision with root package name */
    public int f1118a = -1;

    /* renamed from: e, reason: collision with root package name */
    public String f1121e = UUID.randomUUID().toString();
    public String h = null;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f1124j = null;

    /* renamed from: t, reason: collision with root package name */
    public I f1134t = new I();

    /* renamed from: B, reason: collision with root package name */
    public final boolean f1102B = true;

    /* renamed from: G, reason: collision with root package name */
    public boolean f1106G = true;

    /* renamed from: L, reason: collision with root package name */
    public EnumC0072m f1111L = EnumC0072m.f1520e;

    /* renamed from: O, reason: collision with root package name */
    public final androidx.lifecycle.y f1114O = new androidx.lifecycle.y();

    public AbstractComponentCallbacksC0049q() {
        new AtomicInteger();
        this.f1116Q = new ArrayList();
        this.f1117R = new C0046n(this);
        k();
    }

    public void A(Bundle bundle) {
        this.f1103C = true;
    }

    public void B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f1134t.K();
        this.f1130p = true;
        this.f1113N = new Q(this, c());
        View t2 = t(layoutInflater, viewGroup);
        this.f1105E = t2;
        if (t2 == null) {
            if (this.f1113N.f1018c != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f1113N = null;
            return;
        }
        this.f1113N.f();
        androidx.lifecycle.J.g(this.f1105E, this.f1113N);
        View view = this.f1105E;
        Q q2 = this.f1113N;
        g1.f.e(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, q2);
        h0.f.m(this.f1105E, this.f1113N);
        this.f1114O.d(this.f1113N);
    }

    public final Context C() {
        Context h = h();
        if (h != null) {
            return h;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final View D() {
        View view = this.f1105E;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final void E(int i, int i2, int i3, int i4) {
        if (this.f1107H == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        f().f1093b = i;
        f().f1094c = i2;
        f().d = i3;
        f().f1095e = i4;
    }

    public final void F(Bundle bundle) {
        I i = this.f1132r;
        if (i != null && (i.f953E || i.F)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f1122f = bundle;
    }

    @Override // androidx.lifecycle.InterfaceC0067h
    public final C0083c a() {
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
        C0083c c0083c = new C0083c(0);
        LinkedHashMap linkedHashMap = c0083c.f1725a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.J.d, application);
        }
        linkedHashMap.put(androidx.lifecycle.J.f1494a, this);
        linkedHashMap.put(androidx.lifecycle.J.f1495b, this);
        Bundle bundle = this.f1122f;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.J.f1496c, bundle);
        }
        return c0083c;
    }

    @Override // i0.InterfaceC0143f
    public final C0141d b() {
        return this.f1115P.f2617b;
    }

    @Override // androidx.lifecycle.S
    public final androidx.lifecycle.Q c() {
        if (this.f1132r == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (i() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap hashMap = this.f1132r.f959L.d;
        androidx.lifecycle.Q q2 = (androidx.lifecycle.Q) hashMap.get(this.f1121e);
        if (q2 != null) {
            return q2;
        }
        androidx.lifecycle.Q q3 = new androidx.lifecycle.Q();
        hashMap.put(this.f1121e, q3);
        return q3;
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.v d() {
        return this.f1112M;
    }

    public T.e e() {
        return new C0047o(this);
    }

    public final C0048p f() {
        if (this.f1107H == null) {
            C0048p c0048p = new C0048p();
            Object obj = f1100S;
            c0048p.f1097g = obj;
            c0048p.h = obj;
            c0048p.i = obj;
            c0048p.f1098j = 1.0f;
            c0048p.f1099k = null;
            this.f1107H = c0048p;
        }
        return this.f1107H;
    }

    public final I g() {
        if (this.f1133s != null) {
            return this.f1134t;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final Context h() {
        C0052u c0052u = this.f1133s;
        if (c0052u == null) {
            return null;
        }
        return c0052u.f1148b;
    }

    public final int i() {
        EnumC0072m enumC0072m = this.f1111L;
        return (enumC0072m == EnumC0072m.f1518b || this.f1135u == null) ? enumC0072m.ordinal() : Math.min(enumC0072m.ordinal(), this.f1135u.i());
    }

    public final I j() {
        I i = this.f1132r;
        if (i != null) {
            return i;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final void k() {
        this.f1112M = new androidx.lifecycle.v(this);
        this.f1115P = new C0142e(this);
        ArrayList arrayList = this.f1116Q;
        C0046n c0046n = this.f1117R;
        if (arrayList.contains(c0046n)) {
            return;
        }
        if (this.f1118a < 0) {
            arrayList.add(c0046n);
            return;
        }
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = c0046n.f1090a;
        abstractComponentCallbacksC0049q.f1115P.a();
        androidx.lifecycle.J.d(abstractComponentCallbacksC0049q);
    }

    public final void l() {
        k();
        this.f1110K = this.f1121e;
        this.f1121e = UUID.randomUUID().toString();
        this.f1125k = false;
        this.f1126l = false;
        this.f1127m = false;
        this.f1128n = false;
        this.f1129o = false;
        this.f1131q = 0;
        this.f1132r = null;
        this.f1134t = new I();
        this.f1133s = null;
        this.f1136v = 0;
        this.f1137w = 0;
        this.f1138x = null;
        this.f1139y = false;
        this.f1140z = false;
    }

    public final boolean m() {
        return this.f1133s != null && this.f1125k;
    }

    public final boolean n() {
        if (!this.f1139y) {
            I i = this.f1132r;
            if (i == null) {
                return false;
            }
            AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = this.f1135u;
            i.getClass();
            if (!(abstractComponentCallbacksC0049q == null ? false : abstractComponentCallbacksC0049q.n())) {
                return false;
            }
        }
        return true;
    }

    public final boolean o() {
        return this.f1131q > 0;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f1103C = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C0052u c0052u = this.f1133s;
        FragmentActivity fragmentActivity = c0052u == null ? null : c0052u.f1147a;
        if (fragmentActivity != null) {
            fragmentActivity.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f1103C = true;
    }

    public void p() {
        this.f1103C = true;
    }

    public final void q(int i, int i2, Intent intent) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public void r(FragmentActivity fragmentActivity) {
        this.f1103C = true;
        C0052u c0052u = this.f1133s;
        if ((c0052u == null ? null : c0052u.f1147a) != null) {
            this.f1103C = true;
        }
    }

    public void s(Bundle bundle) {
        Parcelable parcelable;
        this.f1103C = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f1134t.Q(parcelable);
            I i = this.f1134t;
            i.f953E = false;
            i.F = false;
            i.f959L.f995g = false;
            i.t(1);
        }
        I i2 = this.f1134t;
        if (i2.f976s >= 1) {
            return;
        }
        i2.f953E = false;
        i2.F = false;
        i2.f959L.f995g = false;
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
        sb.append(this.f1121e);
        if (this.f1136v != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1136v));
        }
        if (this.f1138x != null) {
            sb.append(" tag=");
            sb.append(this.f1138x);
        }
        sb.append(")");
        return sb.toString();
    }

    public void u() {
        this.f1103C = true;
    }

    public void v() {
        this.f1103C = true;
    }

    public LayoutInflater w(Bundle bundle) {
        C0052u c0052u = this.f1133s;
        if (c0052u == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        FragmentActivity fragmentActivity = c0052u.f1150e;
        LayoutInflater cloneInContext = fragmentActivity.getLayoutInflater().cloneInContext(fragmentActivity);
        cloneInContext.setFactory2(this.f1134t.f965f);
        return cloneInContext;
    }

    public abstract void x(Bundle bundle);

    public void y() {
        this.f1103C = true;
    }

    public void z() {
        this.f1103C = true;
    }
}
