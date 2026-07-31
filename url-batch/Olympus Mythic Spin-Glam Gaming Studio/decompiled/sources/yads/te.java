package yads;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class te {
    public final String a;
    public final String b;

    public te(ue ueVar, JSONObject jSONObject) {
        this.a = ueVar.b;
        this.b = jSONObject.toString();
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof te)) {
            return false;
        }
        te teVar = (te) obj;
        return Intrinsics.areEqual(teVar.a, this.a) && Intrinsics.areEqual(teVar.b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
