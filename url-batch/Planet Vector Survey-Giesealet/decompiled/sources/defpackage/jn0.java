package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class jn0 {
    public final kn0 a;
    public final in0 b;

    public jn0(kn0 kn0Var) {
        this.a = kn0Var;
        this.b = new in0(kn0Var);
    }

    public final void a(Bundle bundle) {
        kn0 kn0Var = this.a;
        ln0 ln0Var = kn0Var.a;
        if (!kn0Var.e) {
            kn0Var.a();
        }
        if (((q20) ln0Var.getLifecycle()).c.compareTo(f20.g) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + ((q20) ln0Var.getLifecycle()).c).toString());
        }
        if (kn0Var.g) {
            g8.s("SavedStateRegistry was already restored.");
            return;
        }
        Bundle bundle2 = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundle2 = rg0.n(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        kn0Var.f = bundle2;
        kn0Var.g = true;
    }

    public final void b(Bundle bundle) {
        kn0 kn0Var = this.a;
        Bundle r = x40.r((pd0[]) Arrays.copyOf(new pd0[0], 0));
        Bundle bundle2 = kn0Var.f;
        if (bundle2 != null) {
            r.putAll(bundle2);
        }
        synchronized (kn0Var.c) {
            for (Map.Entry entry : kn0Var.d.entrySet()) {
                String str = (String) entry.getKey();
                Bundle a = ((hn0) entry.getValue()).a();
                str.getClass();
                r.putBundle(str, a);
            }
        }
        if (r.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", r);
    }
}
