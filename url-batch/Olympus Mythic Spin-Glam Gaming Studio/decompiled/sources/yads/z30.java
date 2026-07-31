package yads;

import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.util.Map;
import kotlin.collections.MapsKt;

/* loaded from: classes5.dex */
public final class z30 {
    public final mt1 a;
    public final io2 b;

    public z30(mt1 mt1Var, io2 io2Var) {
        this.a = mt1Var;
        this.b = io2Var;
    }

    public final void a(y30 y30Var) {
        this.b.b(y30Var.b, "log_type");
        fo2 fo2Var = fo2.c;
        io2 io2Var = this.b;
        Map map = io2Var.a;
        this.a.a(new ho2(CreativeInfo.f, MapsKt.toMutableMap(map), io2Var.b));
    }
}
