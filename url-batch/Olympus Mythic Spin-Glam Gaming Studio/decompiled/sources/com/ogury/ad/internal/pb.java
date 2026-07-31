package com.ogury.ad.internal;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class pb {
    public static final JSONObject a(Pair... details) {
        Intrinsics.checkNotNullParameter(details, "details");
        JSONObject jSONObject = new JSONObject();
        for (Pair pair : details) {
            jSONObject.putOpt((String) pair.component1(), pair.component2());
        }
        return jSONObject;
    }

    public static final JSONObject b(Pair... details) {
        Intrinsics.checkNotNullParameter(details, "details");
        JSONObject jSONObject = new JSONObject();
        for (Pair pair : details) {
            jSONObject.putOpt((String) pair.component1(), pair.component2());
        }
        return jSONObject;
    }
}
