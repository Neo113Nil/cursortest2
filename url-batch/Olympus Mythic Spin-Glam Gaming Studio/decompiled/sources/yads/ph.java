package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ph {
    public final String a;
    public final String b;
    public final Object c;
    public final kf1 d;
    public final boolean e;
    public final boolean f;
    public final wd1 g;

    public ph(String str, String str2, Object obj, kf1 kf1Var, boolean z, boolean z2, wd1 wd1Var) {
        this.a = str;
        this.b = str2;
        this.c = obj;
        this.d = kf1Var;
        this.e = z;
        this.f = z2;
        this.g = wd1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ph)) {
            return false;
        }
        ph phVar = (ph) obj;
        return Intrinsics.areEqual(this.a, phVar.a) && Intrinsics.areEqual(this.b, phVar.b) && Intrinsics.areEqual(this.c, phVar.c) && Intrinsics.areEqual(this.d, phVar.d) && this.e == phVar.e && this.f == phVar.f && Intrinsics.areEqual(this.g, phVar.g);
    }

    public final int hashCode() {
        int a = c4.a(this.a.hashCode() * 31, 31, this.b);
        Object obj = this.c;
        int hashCode = (a + (obj == null ? 0 : obj.hashCode())) * 31;
        kf1 kf1Var = this.d;
        int hashCode2 = (Boolean.hashCode(this.f) + ((Boolean.hashCode(this.e) + ((hashCode + (kf1Var == null ? 0 : kf1Var.hashCode())) * 31)) * 31)) * 31;
        wd1 wd1Var = this.g;
        return hashCode2 + (wd1Var != null ? wd1Var.hashCode() : 0);
    }

    public final String toString() {
        return "Asset(name=" + this.a + ", type=" + this.b + ", value=" + this.c + ", link=" + this.d + ", isClickable=" + this.e + ", isRequired=" + this.f + ", layoutRestriction=" + this.g + ")";
    }
}
