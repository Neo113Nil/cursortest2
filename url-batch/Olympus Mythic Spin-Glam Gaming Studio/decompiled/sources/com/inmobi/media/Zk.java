package com.inmobi.media;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class Zk {
    public final C3965ea a;

    public Zk(C3965ea mConfigIncludeIdMaskMap) {
        Intrinsics.checkNotNullParameter(mConfigIncludeIdMaskMap, "mConfigIncludeIdMaskMap");
        this.a = mConfigIncludeIdMaskMap;
    }

    public final HashMap a() {
        C4458x1 c4458x1;
        String str;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        try {
            if (this.a.a() && (c4458x1 = Yk.a) != null && (str = c4458x1.b) != null) {
                Intrinsics.checkNotNull(str);
                hashMap2.put("GPID", str);
            }
        } catch (Exception unused) {
            Intrinsics.checkNotNullExpressionValue(Zk.class.getSimpleName(), "getSimpleName(...)");
        }
        String jSONObject = new JSONObject(hashMap2).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        hashMap.put("u-id-map", jSONObject);
        return hashMap;
    }
}
