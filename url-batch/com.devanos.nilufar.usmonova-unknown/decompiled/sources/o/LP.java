package o;

import android.os.Bundle;
import java.util.Map;

/* loaded from: classes.dex */
public final class LP {
    public final MP a;
    public final KP b = new KP();
    public boolean c;

    public LP(MP mp) {
        this.a = mp;
    }

    public final void a() {
        MP mp = this.a;
        AbstractC0106Dz lifecycle = mp.getLifecycle();
        if (((C0417Pz) lifecycle).d != EnumC0080Cz.i) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.a(new C0966eM(0, mp));
        KP kp = this.b;
        kp.getClass();
        if (kp.b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        lifecycle.a(new C0135Fc(2, kp));
        kp.b = true;
        this.c = true;
    }

    public final void b(Bundle bundle) {
        if (!this.c) {
            a();
        }
        C0417Pz c0417Pz = (C0417Pz) this.a.getLifecycle();
        if (c0417Pz.d.compareTo(EnumC0080Cz.k) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + c0417Pz.d).toString());
        }
        KP kp = this.b;
        if (!kp.b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (kp.d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        kp.c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        kp.d = true;
    }

    public final void c(Bundle bundle) {
        KP kp = this.b;
        kp.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = kp.c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C2088vP c2088vP = kp.a;
        c2088vP.getClass();
        C1956tP c1956tP = new C1956tP(c2088vP);
        c2088vP.j.put(c1956tP, Boolean.FALSE);
        while (c1956tP.hasNext()) {
            Map.Entry entry = (Map.Entry) c1956tP.next();
            bundle2.putBundle((String) entry.getKey(), ((JP) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
