package k0;

import X.V;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: k0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0199u {

    /* renamed from: b, reason: collision with root package name */
    public final View f2839b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2838a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2840c = new ArrayList();

    public C0199u(View view) {
        this.f2839b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0199u)) {
            return false;
        }
        C0199u c0199u = (C0199u) obj;
        return this.f2839b == c0199u.f2839b && this.f2838a.equals(c0199u.f2838a);
    }

    public final int hashCode() {
        return this.f2838a.hashCode() + (this.f2839b.hashCode() * 31);
    }

    public final String toString() {
        String e2 = V.e(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f2839b + "\n", "    values:");
        HashMap hashMap = this.f2838a;
        for (String str : hashMap.keySet()) {
            e2 = e2 + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return e2;
    }
}
