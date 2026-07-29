package o;

import android.view.View;

/* renamed from: o.e1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0943e1 {
    public final View a;
    public final int b;

    public C0943e1(View view, int i) {
        this.a = view;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0943e1)) {
            return false;
        }
        C0943e1 c0943e1 = (C0943e1) obj;
        return this.b == c0943e1.b && this.a.equals(c0943e1.a);
    }

    public final int hashCode() {
        return ((this.a.hashCode() + 31) * 31) + this.b;
    }
}
