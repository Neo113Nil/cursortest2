package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class np {
    public final dz1 a;
    public final z12 b;
    public final x72 c;
    public final v72 d;
    public final l02 e;
    public final v32 f;
    public final i22 g;
    public final yu2 h;
    public final ry1 i;
    public final r9 j;

    public np(dz1 dz1Var, z12 z12Var, x72 x72Var, v72 v72Var, l02 l02Var, v32 v32Var, i22 i22Var, yu2 yu2Var, ry1 ry1Var, r9 r9Var) {
        this.a = dz1Var;
        this.b = z12Var;
        this.c = x72Var;
        this.d = v72Var;
        this.e = l02Var;
        this.f = v32Var;
        this.g = i22Var;
        this.h = yu2Var;
        this.i = ry1Var;
        this.j = r9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof np)) {
            return false;
        }
        np npVar = (np) obj;
        return Intrinsics.areEqual(this.a, npVar.a) && Intrinsics.areEqual(this.b, npVar.b) && Intrinsics.areEqual(this.c, npVar.c) && Intrinsics.areEqual(this.d, npVar.d) && Intrinsics.areEqual(this.e, npVar.e) && Intrinsics.areEqual(this.f, npVar.f) && Intrinsics.areEqual(this.g, npVar.g) && Intrinsics.areEqual(this.h, npVar.h) && Intrinsics.areEqual(this.i, npVar.i) && this.j == npVar.j;
    }

    public final int hashCode() {
        int hashCode = (this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        ry1 ry1Var = this.i;
        return this.j.hashCode() + ((hashCode + (ry1Var == null ? 0 : ry1Var.hashCode())) * 31);
    }

    public final String toString() {
        return "BinderConfiguration(nativeAdBlock=" + this.a + ", nativeValidator=" + this.b + ", nativeVisualBlock=" + this.c + ", nativeViewRenderer=" + this.d + ", nativeAdFactoriesProvider=" + this.e + ", forceImpressionConfigurator=" + this.f + ", adViewRenderingValidator=" + this.g + ", sdkEnvironmentModule=" + this.h + ", nativeData=" + this.i + ", adStructureType=" + this.j + ")";
    }
}
