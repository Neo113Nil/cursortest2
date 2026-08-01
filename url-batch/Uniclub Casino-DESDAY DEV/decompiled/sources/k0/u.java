package k0;

import X.V;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: b, reason: collision with root package name */
    public final View f2842b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2841a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2843c = new ArrayList();

    public u(View view) {
        this.f2842b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f2842b == uVar.f2842b && this.f2841a.equals(uVar.f2841a);
    }

    public final int hashCode() {
        return this.f2841a.hashCode() + (this.f2842b.hashCode() * 31);
    }

    public final String toString() {
        String e2 = V.e(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f2842b + "\n", "    values:");
        HashMap hashMap = this.f2841a;
        for (String str : hashMap.keySet()) {
            e2 = e2 + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return e2;
    }
}
