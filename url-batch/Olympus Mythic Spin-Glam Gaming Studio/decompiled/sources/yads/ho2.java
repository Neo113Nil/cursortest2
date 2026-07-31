package yads;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ho2 {
    public final String a;
    public final Map b;
    public final c c;

    public ho2(String str, Map map, c cVar) {
        this.a = str;
        this.b = map;
        this.c = cVar;
        map.put("sdk_version", "8.1.0");
    }

    public final c a() {
        return this.c;
    }

    public final Map b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ho2)) {
            return false;
        }
        ho2 ho2Var = (ho2) obj;
        return Intrinsics.areEqual(this.a, ho2Var.a) && Intrinsics.areEqual(this.b, ho2Var.b) && Intrinsics.areEqual(this.c, ho2Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        c cVar = this.c;
        return hashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    public final String toString() {
        return "Report(eventName=" + this.a + ", data=" + this.b + ", abExperiments=" + this.c + ")";
    }

    public ho2(fo2 fo2Var, Map map, c cVar) {
        this(fo2Var.b, MapsKt.toMutableMap(map), cVar);
    }
}
