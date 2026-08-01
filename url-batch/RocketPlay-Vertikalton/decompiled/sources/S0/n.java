package S0;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final int f1092a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1093b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1094c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1095e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f1096f;

    public n(int i, String str, int i2, int i3, int i4, int[] iArr) {
        this.f1092a = i;
        this.f1093b = str;
        this.f1094c = i2;
        this.d = i3;
        this.f1095e = i4;
        this.f1096f = iArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            return this.f1092a == ((n) obj).f1092a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1092a;
    }

    public final String toString() {
        return "TierSpec(index=" + this.f1092a + ", nameResKey=" + this.f1093b + ", streakRequired=" + this.f1094c + ", defaultGoalMl=" + this.d + ", maxDisplayMl=" + this.f1095e + ", plasmaColors=" + Arrays.toString(this.f1096f) + ")";
    }
}
