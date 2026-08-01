package defpackage;

import android.os.Bundle;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class kn0 {
    public final ln0 a;
    public final ab0 b;
    public boolean e;
    public Bundle f;
    public boolean g;
    public final pg0 c = new pg0(14);
    public final LinkedHashMap d = new LinkedHashMap();
    public boolean h = true;

    public kn0(ln0 ln0Var, ab0 ab0Var) {
        this.a = ln0Var;
        this.b = ab0Var;
    }

    public final void a() {
        ln0 ln0Var = this.a;
        if (((q20) ln0Var.getLifecycle()).c != f20.e) {
            g8.s("Restarter must be created only during owner's initialization stage");
        } else {
            if (this.e) {
                g8.s("SavedStateRegistry was already attached.");
                return;
            }
            this.b.a();
            ln0Var.getLifecycle().a(new h50(2, this));
            this.e = true;
        }
    }
}
