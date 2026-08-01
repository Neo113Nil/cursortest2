package o0;

import Y.V;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: o0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0282u {

    /* renamed from: b, reason: collision with root package name */
    public final View f3272b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3271a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3273c = new ArrayList();

    public C0282u(View view) {
        this.f3272b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0282u)) {
            return false;
        }
        C0282u c0282u = (C0282u) obj;
        return this.f3272b == c0282u.f3272b && this.f3271a.equals(c0282u.f3271a);
    }

    public final int hashCode() {
        return this.f3271a.hashCode() + (this.f3272b.hashCode() * 31);
    }

    public final String toString() {
        String f2 = V.f(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f3272b + "\n", "    values:");
        HashMap hashMap = this.f3271a;
        for (String str : hashMap.keySet()) {
            f2 = f2 + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return f2;
    }
}
