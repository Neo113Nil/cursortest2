package yads;

import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;

/* loaded from: classes5.dex */
public final class g8 implements gp2 {
    public final v3 a;
    public final k8 b;

    public g8(v3 v3Var) {
        k8 k8Var = new k8();
        this.a = v3Var;
        this.b = k8Var;
    }

    @Override // yads.gp2
    public final Map a() {
        Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("ad_type", this.a.a.b));
        String str = this.a.c.a;
        if (str != null) {
            mutableMapOf.put("ad_unit_id", str);
        }
        mutableMapOf.putAll(this.b.a(this.a.e).a);
        return mutableMapOf;
    }
}
