package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class w1 {
    public final t8 a;
    public final v3 b;
    public final x8 c;
    public final yu2 d;
    public final m12 e;
    public final int f;
    public final yf0 g;

    public w1(t8 t8Var, v3 v3Var, x8 x8Var, yu2 yu2Var, m12 m12Var, int i, yf0 yf0Var, int i2) {
        m12Var = (i2 & 16) != 0 ? null : m12Var;
        i = (i2 & 32) != 0 ? 0 : i;
        yf0Var = (i2 & 64) != 0 ? null : yf0Var;
        this.a = t8Var;
        this.b = v3Var;
        this.c = x8Var;
        this.d = yu2Var;
        this.e = m12Var;
        this.f = i;
        this.g = yf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj;
        return Intrinsics.areEqual(this.a, w1Var.a) && Intrinsics.areEqual(this.b, w1Var.b) && Intrinsics.areEqual(this.c, w1Var.c) && Intrinsics.areEqual(this.d, w1Var.d) && Intrinsics.areEqual(this.e, w1Var.e) && this.f == w1Var.f && Intrinsics.areEqual(this.g, w1Var.g);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        m12 m12Var = this.e;
        int a = yd3.a(this.f, (hashCode + (m12Var == null ? 0 : m12Var.hashCode())) * 31, 31);
        yf0 yf0Var = this.g;
        return a + (yf0Var != null ? yf0Var.hashCode() : 0);
    }

    public final String toString() {
        return "AdActivityData(adResponse=" + this.a + ", adConfiguration=" + this.b + ", adResultReceiver=" + this.c + ", sdkEnvironmentModule=" + this.d + ", nativeAd=" + this.e + ", requestedOrientation=" + this.f + ", delegatedActivityLaunchInfo=" + this.g + ")";
    }
}
