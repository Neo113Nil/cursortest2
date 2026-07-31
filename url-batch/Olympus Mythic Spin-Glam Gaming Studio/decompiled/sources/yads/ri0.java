package yads;

import com.yandex.div.DivDataTag;
import com.yandex.div2.DivData;
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class ri0 {
    public final String a;
    public final JSONObject b;
    public final JSONObject c;
    public final ArrayList d;
    public final DivData e;
    public final DivDataTag f;
    public final Set g;
    public final gg0 h;

    public ri0(String str, JSONObject jSONObject, JSONObject jSONObject2, ArrayList arrayList, DivData divData, DivDataTag divDataTag, Set set, gg0 gg0Var) {
        this.a = str;
        this.b = jSONObject;
        this.c = jSONObject2;
        this.d = arrayList;
        this.e = divData;
        this.f = divDataTag;
        this.g = set;
        this.h = gg0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ri0)) {
            return false;
        }
        ri0 ri0Var = (ri0) obj;
        return Intrinsics.areEqual(this.a, ri0Var.a) && Intrinsics.areEqual(this.b, ri0Var.b) && Intrinsics.areEqual(this.c, ri0Var.c) && Intrinsics.areEqual(this.d, ri0Var.d) && Intrinsics.areEqual(this.e, ri0Var.e) && Intrinsics.areEqual(this.f, ri0Var.f) && Intrinsics.areEqual(this.g, ri0Var.g) && Intrinsics.areEqual(this.h, ri0Var.h);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        JSONObject jSONObject = this.c;
        int hashCode2 = (hashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        ArrayList arrayList = this.d;
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((hashCode2 + (arrayList != null ? arrayList.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DivKitDesign(target=" + this.a + ", card=" + this.b + ", templates=" + this.c + ", images=" + this.d + ", divData=" + this.e + ", divDataTag=" + this.f + ", divAssets=" + this.g + ", designAnalytics=" + this.h + ")";
    }
}
