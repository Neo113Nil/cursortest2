package o;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: o.Co, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC0069Co implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0365Nz, InterfaceC0746b00, InterfaceC1655or, MP {
    public static final Object Y = new Object();
    public C0173Go A;
    public AbstractComponentCallbacksC0069Co C;
    public int D;
    public int E;
    public String F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean K;
    public ViewGroup L;
    public boolean M;
    public C0043Bo O;
    public boolean P;
    public boolean Q;
    public String R;
    public EnumC0080Cz S;
    public C0417Pz T;
    public final BD U;
    public LP V;
    public final ArrayList W;
    public final C0017Ao X;
    public Bundle i;
    public SparseArray j;
    public Bundle k;
    public Bundle m;
    public AbstractComponentCallbacksC0069Co n;
    public int p;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;
    public AbstractC0588Wo z;
    public int h = -1;
    public String l = UUID.randomUUID().toString();

    /* renamed from: o, reason: collision with root package name */
    public String f25o = null;
    public Boolean q = null;
    public C0614Xo B = new C0614Xo();
    public final boolean J = true;
    public boolean N = true;

    public AbstractComponentCallbacksC0069Co() {
        new R2(4, this);
        this.S = EnumC0080Cz.l;
        this.U = new BD();
        new AtomicInteger();
        this.W = new ArrayList();
        this.X = new C0017Ao(this);
        f();
    }

    public abstract AbstractC1305jX a();

    public final C0043Bo b() {
        if (this.O == null) {
            C0043Bo c0043Bo = new C0043Bo();
            Object obj = Y;
            c0043Bo.g = obj;
            c0043Bo.h = obj;
            c0043Bo.i = obj;
            c0043Bo.j = null;
            this.O = c0043Bo;
        }
        return this.O;
    }

    public final AbstractC0588Wo c() {
        if (this.A != null) {
            return this.B;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final int d() {
        EnumC0080Cz enumC0080Cz = this.S;
        return (enumC0080Cz == EnumC0080Cz.i || this.C == null) ? enumC0080Cz.ordinal() : Math.min(enumC0080Cz.ordinal(), this.C.d());
    }

    public final AbstractC0588Wo e() {
        AbstractC0588Wo abstractC0588Wo = this.z;
        if (abstractC0588Wo != null) {
            return abstractC0588Wo;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final void f() {
        this.T = new C0417Pz(this);
        this.V = new LP(this);
        ArrayList arrayList = this.W;
        C0017Ao c0017Ao = this.X;
        if (arrayList.contains(c0017Ao)) {
            return;
        }
        if (this.h < 0) {
            arrayList.add(c0017Ao);
            return;
        }
        AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co = c0017Ao.a;
        abstractComponentCallbacksC0069Co.V.a();
        AbstractC1807r8.E(abstractComponentCallbacksC0069Co);
        Bundle bundle = abstractComponentCallbacksC0069Co.i;
        abstractComponentCallbacksC0069Co.V.b(bundle != null ? bundle.getBundle("registryState") : null);
    }

    public final void g() {
        f();
        this.R = this.l;
        this.l = UUID.randomUUID().toString();
        this.r = false;
        this.s = false;
        this.u = false;
        this.v = false;
        this.w = false;
        this.y = 0;
        this.z = null;
        this.B = new C0614Xo();
        this.A = null;
        this.D = 0;
        this.E = 0;
        this.F = null;
        this.G = false;
        this.H = false;
    }

    @Override // o.InterfaceC1655or
    public final AbstractC0656Ze getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = u().getApplicationContext();
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
        if (application == null && AbstractC0588Wo.J(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + u().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        C2142wD c2142wD = new C2142wD(0);
        LinkedHashMap linkedHashMap = c2142wD.a;
        if (application != null) {
            linkedHashMap.put(WZ.d, application);
        }
        linkedHashMap.put(AbstractC1807r8.e, this);
        linkedHashMap.put(AbstractC1807r8.f, this);
        Bundle bundle = this.m;
        if (bundle != null) {
            linkedHashMap.put(AbstractC1807r8.g, bundle);
        }
        return c2142wD;
    }

    @Override // o.InterfaceC0365Nz
    public final AbstractC0106Dz getLifecycle() {
        return this.T;
    }

    @Override // o.MP
    public final KP getSavedStateRegistry() {
        return this.V.b;
    }

    @Override // o.InterfaceC0746b00
    public final C0680a00 getViewModelStore() {
        if (this.z == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (d() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap hashMap = this.z.N.d;
        C0680a00 c0680a00 = (C0680a00) hashMap.get(this.l);
        if (c0680a00 != null) {
            return c0680a00;
        }
        C0680a00 c0680a002 = new C0680a00();
        hashMap.put(this.l, c0680a002);
        return c0680a002;
    }

    public final boolean h() {
        if (this.G) {
            return true;
        }
        AbstractC0588Wo abstractC0588Wo = this.z;
        if (abstractC0588Wo != null) {
            AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co = this.C;
            abstractC0588Wo.getClass();
            if (abstractComponentCallbacksC0069Co == null ? false : abstractComponentCallbacksC0069Co.h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean i() {
        return this.y > 0;
    }

    public abstract void j();

    public void k(int i, int i2, Intent intent) {
        if (AbstractC0588Wo.J(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public void l(Context context) {
        this.K = true;
        C0173Go c0173Go = this.A;
        if ((c0173Go == null ? null : c0173Go.r) != null) {
            this.K = true;
        }
    }

    public abstract void m(Bundle bundle);

    public abstract void n();

    public abstract void o();

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.K = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C0173Go c0173Go = this.A;
        J4 j4 = c0173Go == null ? null : c0173Go.r;
        if (j4 != null) {
            j4.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.K = true;
    }

    public LayoutInflater p(Bundle bundle) {
        C0173Go c0173Go = this.A;
        if (c0173Go == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        J4 j4 = c0173Go.v;
        LayoutInflater cloneInContext = j4.getLayoutInflater().cloneInContext(j4);
        cloneInContext.setFactory2(this.B.f);
        return cloneInContext;
    }

    public abstract void q(Bundle bundle);

    public abstract void r();

    public abstract void s();

    public void t(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.B.P();
        this.x = true;
        getViewModelStore();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.l);
        if (this.D != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.D));
        }
        if (this.F != null) {
            sb.append(" tag=");
            sb.append(this.F);
        }
        sb.append(")");
        return sb.toString();
    }

    public final Context u() {
        C0173Go c0173Go = this.A;
        J4 j4 = c0173Go == null ? null : c0173Go.s;
        if (j4 != null) {
            return j4;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final void v(int i, int i2, int i3, int i4) {
        if (this.O == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        b().b = i;
        b().c = i2;
        b().d = i3;
        b().e = i4;
    }
}
