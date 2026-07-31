package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.Vendor;
import com.fyber.inneractive.sdk.util.b1;
import com.fyber.inneractive.sdk.util.c1;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class u0 implements b1 {
    public Integer a = 50;
    public Integer b = 50;
    public Set c = null;

    @Override // com.fyber.inneractive.sdk.util.b1
    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        c1.a(jSONObject, "pausePct", this.a);
        c1.a(jSONObject, "playPct", this.b);
        JSONArray jSONArray = new JSONArray();
        Set<Vendor> set = this.c;
        if (set != null) {
            for (Vendor vendor : set) {
                if (vendor != null) {
                    jSONArray.put(vendor);
                }
            }
        }
        c1.a(jSONObject, VastAttributes.VENDOR, jSONArray);
        return jSONObject;
    }
}
