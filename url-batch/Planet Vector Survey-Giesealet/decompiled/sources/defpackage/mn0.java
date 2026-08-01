package defpackage;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class mn0 extends o01 implements n01 {
    public final Application a;
    public final m01 b;
    public final Bundle c;
    public final g20 d;
    public final in0 e;

    public mn0(Application application, ln0 ln0Var, Bundle bundle) {
        m01 m01Var;
        this.e = ln0Var.getSavedStateRegistry();
        this.d = ln0Var.getLifecycle();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            if (m01.e == null) {
                m01.e = new m01(application);
            }
            m01Var = m01.e;
            m01Var.getClass();
        } else {
            m01Var = new m01(null);
        }
        this.b = m01Var;
    }

    @Override // defpackage.n01
    public final k01 a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return e(canonicalName, cls);
        }
        g8.r("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // defpackage.n01
    public final k01 b(Class cls, m60 m60Var) {
        LinkedHashMap linkedHashMap = m60Var.a;
        String str = (String) linkedHashMap.get(p01.f);
        if (str == null) {
            g8.s("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (linkedHashMap.get(x40.j) == null || linkedHashMap.get(x40.k) == null) {
            if (this.d != null) {
                return e(str, cls);
            }
            g8.s("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        Application application = (Application) linkedHashMap.get(m01.f);
        boolean isAssignableFrom = v5.class.isAssignableFrom(cls);
        Constructor a = (!isAssignableFrom || application == null) ? nn0.a(cls, nn0.b) : nn0.a(cls, nn0.a);
        return a == null ? this.b.b(cls, m60Var) : (!isAssignableFrom || application == null) ? nn0.b(cls, a, x40.w(m60Var)) : nn0.b(cls, a, application, x40.w(m60Var));
    }

    @Override // defpackage.n01
    public final k01 c(ld ldVar, m60 m60Var) {
        Class cls = ldVar.a;
        cls.getClass();
        return b(cls, m60Var);
    }

    @Override // defpackage.o01
    public final void d(k01 k01Var) {
        g20 g20Var = this.d;
        if (g20Var != null) {
            in0 in0Var = this.e;
            in0Var.getClass();
            nk.e(k01Var, in0Var, g20Var);
        }
    }

    public final k01 e(String str, Class cls) {
        g20 g20Var = this.d;
        if (g20Var == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = v5.class.isAssignableFrom(cls);
        Application application = this.a;
        Constructor a = (!isAssignableFrom || application == null) ? nn0.a(cls, nn0.b) : nn0.a(cls, nn0.a);
        if (a == null) {
            if (application != null) {
                return this.b.a(cls);
            }
            if (ll.c == null) {
                ll.c = new ll(3);
            }
            ll.c.getClass();
            return a50.o(cls);
        }
        in0 in0Var = this.e;
        in0Var.getClass();
        cn0 k = nk.k(in0Var, g20Var, str, this.c);
        bn0 bn0Var = k.e;
        k01 b = (!isAssignableFrom || application == null) ? nn0.b(cls, a, bn0Var) : nn0.b(cls, a, application, bn0Var);
        b.addCloseable("androidx.lifecycle.savedstate.vm.tag", k);
        return b;
    }
}
