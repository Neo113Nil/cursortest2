package yads;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class iq0 {
    public final e00 a;
    public final long b;
    public final f1 c;
    public final hq0 d;
    public final Map e;
    public final c f;

    public iq0(e00 e00Var, long j, f1 f1Var, hq0 hq0Var, Map map, c cVar) {
        this.a = e00Var;
        this.b = j;
        this.c = f1Var;
        this.d = hq0Var;
        this.e = map;
        this.f = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iq0)) {
            return false;
        }
        iq0 iq0Var = (iq0) obj;
        return this.a == iq0Var.a && this.b == iq0Var.b && this.c == iq0Var.c && Intrinsics.areEqual(this.d, iq0Var.d) && Intrinsics.areEqual(this.e, iq0Var.e) && Intrinsics.areEqual(this.f, iq0Var.f);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((Long.hashCode(this.b) + (this.a.hashCode() * 31)) * 31)) * 31;
        hq0 hq0Var = this.d;
        int hashCode2 = (this.e.hashCode() + ((hashCode + (hq0Var == null ? 0 : hq0Var.hashCode())) * 31)) * 31;
        c cVar = this.f;
        return hashCode2 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        return "FalseClickData(adType=" + this.a + ", startTime=" + this.b + ", activityInteractionType=" + this.c + ", falseClick=" + this.d + ", reportData=" + this.e + ", abExperiments=" + this.f + ")";
    }
}
