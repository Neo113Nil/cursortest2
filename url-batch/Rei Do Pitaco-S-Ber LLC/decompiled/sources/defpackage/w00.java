package defpackage;

import android.os.Bundle;
import androidx.lifecycle.a;
import androidx.savedstate.Recreator;
import java.util.Map;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class w00 {
    public final x00 a;
    public final h3 b = new h3();
    public boolean c;

    public w00(x00 x00Var) {
        this.a = x00Var;
    }

    public final void a() {
        x00 x00Var = this.a;
        a e = x00Var.e();
        if (e.c != gp.g) {
            l8.u("Restarter must be created only during owner's initialization stage");
            return;
        }
        e.a(new Recreator(x00Var));
        h3 h3Var = this.b;
        h3Var.getClass();
        if (h3Var.c) {
            l8.u("SavedStateRegistry was already attached.");
            return;
        }
        e.a(new ib(2, h3Var));
        h3Var.c = true;
        this.c = true;
    }

    public final void b(Bundle bundle) {
        if (!this.c) {
            a();
        }
        a e = this.a.e();
        if (e.c.compareTo(gp.i) >= 0) {
            l8.t(e.c, "performRestore cannot be called when owner is ");
            return;
        }
        h3 h3Var = this.b;
        if (!h3Var.c) {
            l8.u("You must call performAttach() before calling performRestore(Bundle).");
        } else if (h3Var.d) {
            l8.u("SavedStateRegistry was already restored.");
        } else {
            h3Var.a = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
            h3Var.d = true;
        }
    }

    public final void c(Bundle bundle) {
        h3 h3Var = this.b;
        h3Var.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) h3Var.a;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        q00 q00Var = (q00) h3Var.f;
        q00Var.getClass();
        o00 o00Var = new o00(q00Var);
        q00Var.h.put(o00Var, Boolean.FALSE);
        while (o00Var.hasNext()) {
            Map.Entry entry = (Map.Entry) o00Var.next();
            bundle2.putBundle((String) entry.getKey(), ((v00) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
