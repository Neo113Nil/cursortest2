package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class km {
    public final i5 a;
    public final v3 b;
    public final yu2 c;
    public final r7 d;

    public km(i5 i5Var, v3 v3Var, yu2 yu2Var, r7 r7Var) {
        this.a = i5Var;
        this.b = v3Var;
        this.c = yu2Var;
        this.d = r7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof km)) {
            return false;
        }
        km kmVar = (km) obj;
        return Intrinsics.areEqual(this.a, kmVar.a) && Intrinsics.areEqual(this.b, kmVar.b) && Intrinsics.areEqual(this.c, kmVar.c) && Intrinsics.areEqual(this.d, kmVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AdLoadingModule(adLoadingPhasesManager=" + this.a + ", adConfiguration=" + this.b + ", sdkEnvironmentModule=" + this.c + ", adQualityVerifierController=" + this.d + ")";
    }
}
