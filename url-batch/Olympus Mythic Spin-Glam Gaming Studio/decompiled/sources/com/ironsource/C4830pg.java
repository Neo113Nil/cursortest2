package com.ironsource;

import android.content.Context;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* renamed from: com.ironsource.pg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4830pg {

    @NotNull
    private final String[] a = C4812og.a.a();

    @NotNull
    private final Q6 b = new Q6();

    @Deprecated
    @NotNull
    public final JSONObject a() {
        JSONObject a = this.b.a(this.a);
        Intrinsics.checkNotNullExpressionValue(a, "mGlobalDataReader.getDataByKeys(mTokenKeyList)");
        return a(a);
    }

    @NotNull
    public final JSONObject a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        JSONObject a = this.b.a(context, this.a);
        Intrinsics.checkNotNullExpressionValue(a, "mGlobalDataReader.getDat…s(context, mTokenKeyList)");
        return a(a);
    }

    private final JSONObject a(JSONObject jSONObject) {
        JSONObject b = R6.b(jSONObject.optJSONObject(O6.u));
        if (b != null) {
            jSONObject.put(O6.u, b);
        }
        return jSONObject;
    }
}
