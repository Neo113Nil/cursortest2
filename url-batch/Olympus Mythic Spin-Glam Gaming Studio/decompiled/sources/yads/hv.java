package yads;

import android.content.Context;
import com.facebook.share.internal.ShareConstants;
import com.ironsource.O6;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.TypeIntrinsics;

/* loaded from: classes5.dex */
public final class hv {
    public final t8 a;
    public final v3 b;
    public final nz1 c;
    public final mt1 d;
    public final lx e;
    public final od f;

    public hv(Context context, t8 t8Var, v3 v3Var, yu2 yu2Var, nz1 nz1Var) {
        Context context2 = ((nt3) yu2Var).a;
        mt1 a = pr.a(context2, context2);
        lx lxVar = new lx();
        od odVar = new od(context);
        this.a = t8Var;
        this.b = v3Var;
        this.c = nz1Var;
        this.d = a;
        this.e = lxVar;
        this.f = odVar;
    }

    public final ho2 a(fo2 fo2Var, Map map) {
        if (!TypeIntrinsics.isMutableMap(map)) {
            map = null;
        }
        if (map == null) {
            map = new LinkedHashMap();
        }
        String str = do2.a;
        if (str == null) {
            map.put(O6.G1, "undefined");
        } else {
            map.put(O6.G1, str);
        }
        io2 a = this.e.a(this.b, this.a);
        c cVar = a.b;
        Map plus = MapsKt.plus(map, a.a);
        Map map2 = TypeIntrinsics.isMutableMap(plus) ? plus : null;
        if (map2 == null) {
            map2 = new LinkedHashMap();
        }
        l03 l03Var = this.b.d.a;
        if (l03Var != null) {
            map2.put("size_type", l03Var.b().b);
            map2.put("width", Integer.valueOf(l03Var.getWidth()));
            map2.put("height", Integer.valueOf(l03Var.getHeight()));
        }
        nz1 nz1Var = this.c;
        if (nz1Var != null) {
            Map createMapBuilder = MapsKt.createMapBuilder();
            createMapBuilder.put("asset_name", nz1Var.a);
            createMapBuilder.put(ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE, "url");
            w22 w22Var = nz1Var.b;
            if (w22Var != null) {
                createMapBuilder.putAll(w22Var.a().a);
            }
            LinkedHashMap linkedHashMap = nz1Var.c.a;
            if (linkedHashMap != null) {
                createMapBuilder.putAll(linkedHashMap);
            }
            map2.putAll(MapsKt.build(createMapBuilder));
        }
        return new ho2(fo2Var.b, MapsKt.toMutableMap(map2), cVar);
    }
}
