package o0;

import E1.AbstractC0001b;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: b, reason: collision with root package name */
    public final View f3699b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3698a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3700c = new ArrayList();

    public u(View view) {
        this.f3699b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f3699b == uVar.f3699b && this.f3698a.equals(uVar.f3698a);
    }

    public final int hashCode() {
        return this.f3698a.hashCode() + (this.f3699b.hashCode() * 31);
    }

    public final String toString() {
        String g2 = AbstractC0001b.g(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f3699b + "\n", "    values:");
        HashMap hashMap = this.f3698a;
        for (String str : hashMap.keySet()) {
            g2 = g2 + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return g2;
    }
}
