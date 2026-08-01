package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class k80 implements Comparable {
    public final m80 d;
    public final Bundle e;
    public final boolean f;
    public final int g;
    public final boolean h;

    public k80(m80 m80Var, Bundle bundle, boolean z, int i, boolean z2) {
        this.d = m80Var;
        this.e = bundle;
        this.f = z;
        this.g = i;
        this.h = z2;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(k80 k80Var) {
        k80Var.getClass();
        boolean z = k80Var.h;
        boolean z2 = k80Var.f;
        Bundle bundle = k80Var.e;
        boolean z3 = this.f;
        if (z3 && !z2) {
            return 1;
        }
        if (!z3 && z2) {
            return -1;
        }
        int i = this.g - k80Var.g;
        if (i > 0) {
            return 1;
        }
        if (i < 0) {
            return -1;
        }
        Bundle bundle2 = this.e;
        if (bundle2 != null && bundle == null) {
            return 1;
        }
        if (bundle2 == null && bundle != null) {
            return -1;
        }
        if (bundle2 != null) {
            int size = bundle2.size();
            bundle.getClass();
            int size2 = size - bundle.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z4 = this.h;
        if (!z4 || z) {
            return (z4 || !z) ? 0 : -1;
        }
        return 1;
    }
}
