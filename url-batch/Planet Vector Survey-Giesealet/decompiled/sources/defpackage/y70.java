package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class y70 implements o20, r01, fw, ln0 {
    public final Context d;
    public m80 e;
    public final Bundle f;
    public f20 g;
    public final e80 h;
    public final String i;
    public final Bundle j;
    public final q20 k = new q20(this, true);
    public final jn0 l = new jn0(new kn0(this, new ab0(5, this)));
    public boolean m;
    public f20 n;
    public final mn0 o;

    public y70(Context context, m80 m80Var, Bundle bundle, f20 f20Var, e80 e80Var, String str, Bundle bundle2) {
        this.d = context;
        this.e = m80Var;
        this.f = bundle;
        this.g = f20Var;
        this.h = e80Var;
        this.i = str;
        this.j = bundle2;
        lu0 lu0Var = new lu0(new x70(this, 0));
        new lu0(new x70(this, 1));
        this.n = f20.e;
        this.o = (mn0) lu0Var.getValue();
    }

    public final Bundle a() {
        Bundle bundle = this.f;
        if (bundle == null) {
            return null;
        }
        return new Bundle(bundle);
    }

    public final void b() {
        if (!this.m) {
            jn0 jn0Var = this.l;
            jn0Var.a.a();
            this.m = true;
            if (this.h != null) {
                x40.z(this);
            }
            jn0Var.a(this.j);
        }
        int ordinal = this.g.ordinal();
        int ordinal2 = this.n.ordinal();
        q20 q20Var = this.k;
        if (ordinal < ordinal2) {
            f20 f20Var = this.g;
            q20Var.getClass();
            f20Var.getClass();
            q20Var.d("setCurrentState");
            q20Var.f(f20Var);
            return;
        }
        f20 f20Var2 = this.n;
        q20Var.getClass();
        f20Var2.getClass();
        q20Var.d("setCurrentState");
        q20Var.f(f20Var2);
    }

    public final boolean equals(Object obj) {
        Set<String> keySet;
        if (obj != null && (obj instanceof y70)) {
            y70 y70Var = (y70) obj;
            Bundle bundle = y70Var.f;
            if (nz.l(this.i, y70Var.i) && nz.l(this.e, y70Var.e) && nz.l(this.k, y70Var.k) && nz.l(this.l.b, y70Var.l.b)) {
                Bundle bundle2 = this.f;
                if (nz.l(bundle2, bundle)) {
                    return true;
                }
                if (bundle2 != null && (keySet = bundle2.keySet()) != null) {
                    Set<String> set = keySet;
                    if ((set instanceof Collection) && set.isEmpty()) {
                        return true;
                    }
                    for (String str : set) {
                        if (!nz.l(bundle2.get(str), bundle != null ? bundle.get(str) : null)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.fw
    public final hk getDefaultViewModelCreationExtras() {
        m60 m60Var = new m60();
        Context context = this.d;
        Object applicationContext = context != null ? context.getApplicationContext() : null;
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        LinkedHashMap linkedHashMap = m60Var.a;
        if (application != null) {
            linkedHashMap.put(m01.f, application);
        }
        linkedHashMap.put(x40.j, this);
        linkedHashMap.put(x40.k, this);
        Bundle a = a();
        if (a != null) {
            linkedHashMap.put(x40.l, a);
        }
        return m60Var;
    }

    @Override // defpackage.fw
    public final n01 getDefaultViewModelProviderFactory() {
        return this.o;
    }

    @Override // defpackage.o20
    public final g20 getLifecycle() {
        return this.k;
    }

    @Override // defpackage.ln0
    public final in0 getSavedStateRegistry() {
        return this.l.b;
    }

    @Override // defpackage.r01
    public final q01 getViewModelStore() {
        if (!this.m) {
            g8.s("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
            return null;
        }
        if (this.k.c == f20.d) {
            g8.s("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
            return null;
        }
        e80 e80Var = this.h;
        if (e80Var == null) {
            g8.s("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
            return null;
        }
        String str = this.i;
        str.getClass();
        LinkedHashMap linkedHashMap = e80Var.a;
        q01 q01Var = (q01) linkedHashMap.get(str);
        if (q01Var != null) {
            return q01Var;
        }
        q01 q01Var2 = new q01();
        linkedHashMap.put(str, q01Var2);
        return q01Var2;
    }

    public final int hashCode() {
        Set<String> keySet;
        int hashCode = this.e.hashCode() + (this.i.hashCode() * 31);
        Bundle bundle = this.f;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                int i = hashCode * 31;
                Object obj = bundle.get((String) it.next());
                hashCode = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return this.l.b.hashCode() + ((this.k.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(y70.class.getSimpleName());
        sb.append("(" + this.i + ')');
        sb.append(" destination=");
        sb.append(this.e);
        return sb.toString();
    }
}
