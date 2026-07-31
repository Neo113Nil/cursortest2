package yads;

import android.content.Context;
import com.ironsource.O6;
import com.ironsource.X3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.TypeIntrinsics;

/* loaded from: classes4.dex */
public final class jv {
    public final v3 a;
    public final yu2 b;

    public jv(v3 v3Var, yu2 yu2Var) {
        this.a = v3Var;
        this.b = yu2Var;
    }

    public final void a(Context context, e00 e00Var, ch2 ch2Var, Long l) {
        Map emptyMap = MapsKt.emptyMap();
        if (!TypeIntrinsics.isMutableMap(emptyMap)) {
            emptyMap = null;
        }
        if (emptyMap == null) {
            emptyMap = new LinkedHashMap();
        }
        String str = "undefined";
        if (e00Var == null) {
            emptyMap.put("ad_type", "undefined");
        } else {
            emptyMap.put("ad_type", e00Var);
        }
        if (l == null) {
            emptyMap.put(IronSourceConstants.EVENTS_DURATION, "undefined");
        } else {
            emptyMap.put(IronSourceConstants.EVENTS_DURATION, l);
        }
        LinkedHashMap a = eh2.a(ch2Var);
        emptyMap.putAll(a);
        String str2 = (String) a.get(O6.G1);
        cq2 cq2Var = new cq2();
        k8 k8Var = new k8();
        v3 v3Var = this.a;
        io2 b = cq2Var.b(v3Var, null);
        io2 a2 = k8Var.a(v3Var.e);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!TypeIntrinsics.isMutableMap(linkedHashMap)) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        int i = v3Var.n;
        if (i == 1) {
            str = "portrait";
        } else if (i == 2) {
            str = "landscape";
        }
        linkedHashMap.put(X3.i.n, str);
        io2 a3 = jo2.a(b, a2);
        c cVar = a3.b;
        if (cVar == null) {
            cVar = null;
        }
        io2 io2Var = new io2(MapsKt.plus(a3.a, linkedHashMap), cVar);
        c cVar2 = io2Var.b;
        Map plus = MapsKt.plus(emptyMap, io2Var.a);
        if (!TypeIntrinsics.isMutableMap(plus)) {
            plus = null;
        }
        if (plus == null) {
            plus = new LinkedHashMap();
        }
        fo2 fo2Var = fo2.B;
        Map mutableMap = MapsKt.toMutableMap(plus);
        ho2 ho2Var = new ho2("client_bidding_loading_result", mutableMap, cVar2);
        this.b.getClass();
        ud.a(context, new dq3(((nt3) this.b).a)).a(ho2Var);
        new od(context).a(fo2Var, mutableMap, str2, null);
    }
}
