package yads;

import com.ironsource.O6;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.TypeIntrinsics;

/* loaded from: classes5.dex */
public final class qo1 implements p2 {
    public final tn1 a;

    public qo1(tn1 tn1Var) {
        this.a = tn1Var;
    }

    @Override // yads.p2
    public final Map a() {
        Map emptyMap = MapsKt.emptyMap();
        if (!TypeIntrinsics.isMutableMap(emptyMap)) {
            emptyMap = null;
        }
        if (emptyMap == null) {
            emptyMap = new LinkedHashMap();
        }
        tn1 tn1Var = this.a;
        if (tn1Var != null) {
            er1 er1Var = tn1Var.b;
            yn1 yn1Var = tn1Var.c;
            String str = er1Var.b;
            if (str == null) {
                emptyMap.put(O6.G1, "undefined");
            } else {
                emptyMap.put(O6.G1, str);
            }
            Map map = er1Var.c;
            if (map == null) {
                emptyMap.put("adapter_parameters", "undefined");
            } else {
                emptyMap.put("adapter_parameters", map);
            }
            emptyMap.putAll(new HashMap(no1.a(yn1Var)));
        }
        return emptyMap;
    }
}
