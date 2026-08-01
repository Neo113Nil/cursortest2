package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class en0 implements hn0 {
    public final in0 a;
    public boolean b;
    public Bundle c;
    public final lu0 d;

    public en0(in0 in0Var, r01 r01Var) {
        in0Var.getClass();
        this.a = in0Var;
        this.d = new lu0(new ab0(4, r01Var));
    }

    @Override // defpackage.hn0
    public final Bundle a() {
        Bundle r = x40.r((pd0[]) Arrays.copyOf(new pd0[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            r.putAll(bundle);
        }
        for (Map.Entry entry : ((fn0) this.d.getValue()).a.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a = ((qf) ((bn0) entry.getValue()).b.e).a();
            if (!a.isEmpty()) {
                str.getClass();
                r.putBundle(str, a);
            }
        }
        this.b = false;
        return r;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        Bundle a = this.a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle r = x40.r((pd0[]) Arrays.copyOf(new pd0[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            r.putAll(bundle);
        }
        if (a != null) {
            r.putAll(a);
        }
        this.c = r;
        this.b = true;
    }
}
