package yads;

import android.content.Context;
import java.util.Map;
import kotlin.collections.MapsKt;

/* loaded from: classes5.dex */
public final class mg3 {
    public final t8 a;
    public final mt1 b;
    public final kg3 c;
    public lg3 e;
    public Map f;

    public mg3(Context context, yu2 yu2Var, t8 t8Var, i5 i5Var) {
        yu2Var.getClass();
        mt1 a = ud.a(context, new dq3(((nt3) yu2Var).a));
        kg3 kg3Var = new kg3(i5Var);
        this.a = t8Var;
        this.b = a;
        this.c = kg3Var;
    }

    public final void a(Map map) {
        Map map2 = this.f;
        if (map2 == null) {
            map2 = MapsKt.emptyMap();
        }
        map.putAll(map2);
        map.putAll(MapsKt.emptyMap());
        lg3 lg3Var = this.e;
        Map map3 = lg3Var != null ? lg3Var.a().a : null;
        if (map3 == null) {
            map3 = MapsKt.emptyMap();
        }
        map.putAll(map3);
        fo2 fo2Var = fo2.c;
        t8 t8Var = this.a;
        this.b.a(new ho2("video_ad_rendering_result", MapsKt.toMutableMap(map), t8Var != null ? t8Var.i : null));
    }
}
