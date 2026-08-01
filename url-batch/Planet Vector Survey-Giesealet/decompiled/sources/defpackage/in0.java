package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class in0 {
    public final kn0 a;
    public xi0 b;

    public in0(kn0 kn0Var) {
        this.a = kn0Var;
    }

    public final Bundle a(String str) {
        kn0 kn0Var = this.a;
        if (!kn0Var.g) {
            g8.s("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
            return null;
        }
        Bundle bundle = kn0Var.f;
        if (bundle == null) {
            return null;
        }
        Bundle n = bundle.containsKey(str) ? rg0.n(bundle, str) : null;
        bundle.remove(str);
        if (bundle.isEmpty()) {
            kn0Var.f = null;
        }
        return n;
    }

    public final hn0 b() {
        hn0 hn0Var;
        kn0 kn0Var = this.a;
        synchronized (kn0Var.c) {
            Iterator it = kn0Var.d.entrySet().iterator();
            do {
                hn0Var = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                hn0 hn0Var2 = (hn0) entry.getValue();
                if (nz.l(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    hn0Var = hn0Var2;
                }
            } while (hn0Var == null);
        }
        return hn0Var;
    }

    public final void c(String str, hn0 hn0Var) {
        hn0Var.getClass();
        kn0 kn0Var = this.a;
        synchronized (kn0Var.c) {
            if (kn0Var.d.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            kn0Var.d.put(str, hn0Var);
        }
    }

    public final void d() {
        if (!this.a.h) {
            g8.s("Can not perform this action after onSaveInstanceState");
            return;
        }
        xi0 xi0Var = this.b;
        if (xi0Var == null) {
            xi0Var = new xi0(this);
        }
        this.b = xi0Var;
        try {
            z10.class.getDeclaredConstructor(null);
            xi0 xi0Var2 = this.b;
            if (xi0Var2 != null) {
                xi0Var2.a.add(z10.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + z10.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }
}
