package com.inmobi.media;

import io.bidmachine.iab.vast.tags.VastAttributes;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public abstract class O6 {
    public static final JSONObject a(N6 n6) {
        Intrinsics.checkNotNullParameter(n6, "<this>");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(VastAttributes.HORIZONTAL_POSITION, Float.valueOf(N3.a(n6.a)));
        jSONObject.put(VastAttributes.VERTICAL_POSITION, Float.valueOf(N3.a(n6.b)));
        jSONObject.put("width", n6.c);
        jSONObject.put("height", n6.d);
        return jSONObject;
    }
}
