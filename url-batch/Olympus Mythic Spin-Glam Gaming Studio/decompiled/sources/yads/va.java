package yads;

import com.ironsource.O6;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.TypeIntrinsics;

/* loaded from: classes4.dex */
public final class va implements ad2 {
    public final go2 a;
    public final String b;

    public va(go2 go2Var, String str) {
        this.a = go2Var;
        this.b = str;
    }

    @Override // yads.ad2
    public final Map a(long j) {
        Map emptyMap = MapsKt.emptyMap();
        if (!TypeIntrinsics.isMutableMap(emptyMap)) {
            emptyMap = null;
        }
        if (emptyMap == null) {
            emptyMap = new LinkedHashMap();
        }
        String str = this.b;
        if (str == null) {
            emptyMap.put(O6.G1, "undefined");
        } else {
            emptyMap.put(O6.G1, str);
        }
        String str2 = this.a.b;
        if (str2 == null) {
            emptyMap.put("status", "undefined");
        } else {
            emptyMap.put("status", str2);
        }
        emptyMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        return emptyMap;
    }
}
