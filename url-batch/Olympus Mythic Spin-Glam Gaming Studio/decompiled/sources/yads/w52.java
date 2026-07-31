package yads;

import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public final class w52 implements pg3 {
    public final v3 a;

    public w52(v3 v3Var) {
        this.a = v3Var;
    }

    @Override // yads.pg3
    public final Map a() {
        String str = this.a.c.a;
        if (str == null || StringsKt.isBlank(str)) {
            str = "undefined";
        }
        return MapsKt.mapOf(TuplesKt.to("ad_unit_id", str), TuplesKt.to("ad_type", this.a.a.b));
    }
}
