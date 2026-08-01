package defpackage;

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
import androidx.lifecycle.a;
import androidx.lifecycle.b;
import com.ionia.reidopitaco.libya.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class dk implements ComponentCallbacks, View.OnCreateContextMenuListener, lp, t80, lm, x00 {
    public static final Object X = new Object();
    public int A;
    public int B;
    public String C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean H;
    public ViewGroup I;
    public View J;
    public boolean K;
    public bk M;
    public boolean N;
    public boolean O;
    public String P;
    public a R;
    public bl S;
    public w00 U;
    public final ArrayList V;
    public final zj W;
    public Bundle g;
    public SparseArray h;
    public Bundle i;
    public Bundle k;
    public dk l;
    public int n;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public sk w;
    public fk x;
    public dk z;
    public int f = -1;
    public String j = UUID.randomUUID().toString();
    public String m = null;
    public Boolean o = null;
    public sk y = new sk();
    public final boolean G = true;
    public boolean L = true;
    public gp Q = gp.j;
    public final b T = new b();

    public dk() {
        new AtomicInteger();
        this.V = new ArrayList();
        this.W = new zj(this);
        l();
    }

    public void A(Bundle bundle) {
        this.H = true;
    }

    public void B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.y.M();
        this.u = true;
        this.S = new bl(this, d());
        View t = t(layoutInflater, viewGroup);
        this.J = t;
        bl blVar = this.S;
        if (t == null) {
            if (blVar.h == null) {
                this.S = null;
                return;
            } else {
                l8.u("Called getViewLifecycleOwner() but onCreateView() returned null");
                return;
            }
        }
        blVar.f();
        View view = this.J;
        bl blVar2 = this.S;
        view.getClass();
        view.setTag(R.id.view_tree_lifecycle_owner, blVar2);
        View view2 = this.J;
        bl blVar3 = this.S;
        view2.getClass();
        view2.setTag(R.id.view_tree_view_model_store_owner, blVar3);
        View view3 = this.J;
        bl blVar4 = this.S;
        view3.getClass();
        view3.setTag(R.id.view_tree_saved_state_registry_owner, blVar4);
        this.T.e(this.S);
    }

    public final Context C() {
        Context h = h();
        if (h != null) {
            return h;
        }
        l8.h(this, " not attached to a context.", "Fragment ");
        return null;
    }

    public final View D() {
        View view = this.J;
        if (view != null) {
            return view;
        }
        l8.h(this, " did not return a View from onCreateView() or this was called before onCreateView().", "Fragment ");
        return null;
    }

    public final void E(int i, int i2, int i3, int i4) {
        if (this.M == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        f().b = i;
        f().c = i2;
        f().d = i3;
        f().e = i4;
    }

    public final void F(Bundle bundle) {
        sk skVar = this.w;
        if (skVar == null || !(skVar.E || skVar.F)) {
            this.k = bundle;
        } else {
            l8.u("Fragment already added and state has been saved");
        }
    }

    @Override // defpackage.x00
    public final h3 a() {
        return this.U.b;
    }

    public m60 b() {
        return new ak(this);
    }

    @Override // defpackage.lm
    public final wt c() {
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
        if (application == null && sk.G(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + C().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        wt wtVar = new wt(0);
        LinkedHashMap linkedHashMap = (LinkedHashMap) wtVar.a;
        if (application != null) {
            linkedHashMap.put(tg.n, application);
        }
        linkedHashMap.put(oo.l, this);
        linkedHashMap.put(oo.m, this);
        Bundle bundle = this.k;
        if (bundle != null) {
            linkedHashMap.put(oo.n, bundle);
        }
        return wtVar;
    }

    @Override // defpackage.t80
    public final s80 d() {
        if (this.w == null) {
            l8.u("Can't access ViewModels from detached fragment");
            return null;
        }
        if (i() == 1) {
            l8.u("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
            return null;
        }
        HashMap hashMap = this.w.L.e;
        s80 s80Var = (s80) hashMap.get(this.j);
        if (s80Var != null) {
            return s80Var;
        }
        s80 s80Var2 = new s80();
        hashMap.put(this.j, s80Var2);
        return s80Var2;
    }

    @Override // defpackage.lp
    public final a e() {
        return this.R;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final bk f() {
        if (this.M == null) {
            bk bkVar = new bk();
            Object obj = X;
            bkVar.g = obj;
            bkVar.h = obj;
            bkVar.i = obj;
            bkVar.j = 1.0f;
            bkVar.k = null;
            this.M = bkVar;
        }
        return this.M;
    }

    public final sk g() {
        if (this.x != null) {
            return this.y;
        }
        l8.h(this, " has not been attached yet.", "Fragment ");
        return null;
    }

    public final Context h() {
        fk fkVar = this.x;
        if (fkVar == null) {
            return null;
        }
        return fkVar.v;
    }

    public final int i() {
        gp gpVar = this.Q;
        return (gpVar == gp.g || this.z == null) ? gpVar.ordinal() : Math.min(gpVar.ordinal(), this.z.i());
    }

    public final sk j() {
        sk skVar = this.w;
        if (skVar != null) {
            return skVar;
        }
        l8.h(this, " not associated with a fragment manager.", "Fragment ");
        return null;
    }

    public final String k(int i) {
        return C().getResources().getString(i);
    }

    public final void l() {
        this.R = new a(this);
        this.U = new w00(this);
        ArrayList arrayList = this.V;
        zj zjVar = this.W;
        if (arrayList.contains(zjVar)) {
            return;
        }
        if (this.f < 0) {
            arrayList.add(zjVar);
            return;
        }
        dk dkVar = zjVar.a;
        dkVar.U.a();
        oo.l(dkVar);
    }

    public final void m() {
        l();
        this.P = this.j;
        this.j = UUID.randomUUID().toString();
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = false;
        this.t = false;
        this.v = 0;
        this.w = null;
        this.y = new sk();
        this.x = null;
        this.A = 0;
        this.B = 0;
        this.C = null;
        this.D = false;
        this.E = false;
    }

    public final boolean n() {
        if (this.D) {
            return true;
        }
        sk skVar = this.w;
        if (skVar != null) {
            dk dkVar = this.z;
            skVar.getClass();
            if (dkVar == null ? false : dkVar.n()) {
                return true;
            }
        }
        return false;
    }

    public final boolean o() {
        return this.v > 0;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.H = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        fk fkVar = this.x;
        b3 b3Var = fkVar == null ? null : fkVar.u;
        if (b3Var != null) {
            b3Var.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        } else {
            l8.h(this, " not attached to an activity.", "Fragment ");
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.H = true;
    }

    public void p() {
        this.H = true;
    }

    public final void q(int i, int i2, Intent intent) {
        if (sk.G(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public void r(Context context) {
        this.H = true;
        fk fkVar = this.x;
        if ((fkVar == null ? null : fkVar.u) != null) {
            this.H = true;
        }
    }

    public void s(Bundle bundle) {
        Parcelable parcelable;
        this.H = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.y.S(parcelable);
            sk skVar = this.y;
            skVar.E = false;
            skVar.F = false;
            skVar.L.h = false;
            skVar.t(1);
        }
        sk skVar2 = this.y;
        if (skVar2.s >= 1) {
            return;
        }
        skVar2.E = false;
        skVar2.F = false;
        skVar2.L.h = false;
        skVar2.t(1);
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
        sb.append(this.j);
        if (this.A != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.A));
        }
        if (this.C != null) {
            sb.append(" tag=");
            sb.append(this.C);
        }
        sb.append(")");
        return sb.toString();
    }

    public void u() {
        this.H = true;
    }

    public void v() {
        this.H = true;
    }

    public LayoutInflater w(Bundle bundle) {
        fk fkVar = this.x;
        if (fkVar == null) {
            l8.u("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
            return null;
        }
        b3 b3Var = fkVar.y;
        LayoutInflater cloneInContext = b3Var.getLayoutInflater().cloneInContext(b3Var);
        cloneInContext.setFactory2(this.y.f);
        return cloneInContext;
    }

    public abstract void x(Bundle bundle);

    public void y() {
        this.H = true;
    }

    public void z() {
        this.H = true;
    }
}
